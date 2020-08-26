package typings.hapiJoi.mod

import typings.hapiJoi.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionTermManifest extends js.Object {
  var mapped: From = js.native
}

object ExtensionTermManifest {
  @scala.inline
  def apply(mapped: From): ExtensionTermManifest = {
    val __obj = js.Dynamic.literal(mapped = mapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionTermManifest]
  }
  @scala.inline
  implicit class ExtensionTermManifestOps[Self <: ExtensionTermManifest] (val x: Self) extends AnyVal {
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
    def setMapped(value: From): Self = this.set("mapped", value.asInstanceOf[js.Any])
  }
  
}

