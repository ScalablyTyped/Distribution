package typings.gun.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alias extends js.Object {
  var alias: String = js.native
  var auth: js.Any = js.native
  var epub: String = js.native
  var pub: String = js.native
}

object Alias {
  @scala.inline
  def apply(alias: String, auth: js.Any, epub: String, pub: String): Alias = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], epub = epub.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
  @scala.inline
  implicit class AliasOps[Self <: Alias] (val x: Self) extends AnyVal {
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuth(value: js.Any): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def setEpub(value: String): Self = this.set("epub", value.asInstanceOf[js.Any])
    @scala.inline
    def setPub(value: String): Self = this.set("pub", value.asInstanceOf[js.Any])
  }
  
}

