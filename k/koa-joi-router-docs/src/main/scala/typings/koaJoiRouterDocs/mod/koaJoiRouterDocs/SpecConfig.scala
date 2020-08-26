package typings.koaJoiRouterDocs.mod.koaJoiRouterDocs

import typings.koaJoiRouterDocs.anon.Description
import typings.koaJoiRouterDocs.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecConfig extends js.Object {
  var basePath: String = js.native
  var info: Description = js.native
  var tags: js.Array[Name] = js.native
}

object SpecConfig {
  @scala.inline
  def apply(basePath: String, info: Description, tags: js.Array[Name]): SpecConfig = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecConfig]
  }
  @scala.inline
  implicit class SpecConfigOps[Self <: SpecConfig] (val x: Self) extends AnyVal {
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
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: Description): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Name*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[Name]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

