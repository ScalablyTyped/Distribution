package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StarterManifest extends js.Object {
  var baseref: String = js.native
  var name: String = js.native
  var welcome: js.UndefOr[String] = js.native
}

object StarterManifest {
  @scala.inline
  def apply(baseref: String, name: String): StarterManifest = {
    val __obj = js.Dynamic.literal(baseref = baseref.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarterManifest]
  }
  @scala.inline
  implicit class StarterManifestOps[Self <: StarterManifest] (val x: Self) extends AnyVal {
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
    def setBaseref(value: String): Self = this.set("baseref", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setWelcome(value: String): Self = this.set("welcome", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWelcome: Self = this.set("welcome", js.undefined)
  }
  
}

