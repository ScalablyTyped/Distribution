package typings.lasso.dependenciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bundle extends js.Object {
  var dependencies: js.Array[DependencyConfig | String] = js.native
  var name: String = js.native
}

object Bundle {
  @scala.inline
  def apply(dependencies: js.Array[DependencyConfig | String], name: String): Bundle = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle]
  }
  @scala.inline
  implicit class BundleOps[Self <: Bundle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDependenciesVarargs(value: (DependencyConfig | String)*): Self = this.set("dependencies", js.Array(value :_*))
    @scala.inline
    def setDependencies(value: js.Array[DependencyConfig | String]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

