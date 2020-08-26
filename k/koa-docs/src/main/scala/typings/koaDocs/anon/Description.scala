package typings.koaDocs.anon

import typings.koaJoiRouter.mod.Spec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Description extends js.Object {
  var description: js.UndefOr[String] = js.native
  var extendedDescription: js.UndefOr[String] = js.native
  var groupName: String = js.native
  var prefix: js.UndefOr[String] = js.native
  var routes: js.Array[Spec] = js.native
}

object Description {
  @scala.inline
  def apply(groupName: String, routes: js.Array[Spec]): Description = {
    val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  @scala.inline
  implicit class DescriptionOps[Self <: Description] (val x: Self) extends AnyVal {
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
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoutesVarargs(value: Spec*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[Spec]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExtendedDescription(value: String): Self = this.set("extendedDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtendedDescription: Self = this.set("extendedDescription", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

