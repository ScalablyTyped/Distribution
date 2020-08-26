package typings.koaDocs.mod.koaDocs

import typings.koaDocs.anon.Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var groups: js.Array[Description] = js.native
  var routeHandlers: js.UndefOr[String] = js.native
  var theme: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var version: String = js.native
}

object Options {
  @scala.inline
  def apply(groups: js.Array[Description], version: String): Options = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: Description*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[Description]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setRouteHandlers(value: String): Self = this.set("routeHandlers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouteHandlers: Self = this.set("routeHandlers", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

