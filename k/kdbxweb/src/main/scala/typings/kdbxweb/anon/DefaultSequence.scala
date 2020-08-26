package typings.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultSequence extends js.Object {
  var defaultSequence: String = js.native
  var enabled: Boolean = js.native
  var items: KeystrokeSequence = js.native
  var obfuscation: Double = js.native
}

object DefaultSequence {
  @scala.inline
  def apply(defaultSequence: String, enabled: Boolean, items: KeystrokeSequence, obfuscation: Double): DefaultSequence = {
    val __obj = js.Dynamic.literal(defaultSequence = defaultSequence.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], obfuscation = obfuscation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSequence]
  }
  @scala.inline
  implicit class DefaultSequenceOps[Self <: DefaultSequence] (val x: Self) extends AnyVal {
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
    def setDefaultSequence(value: String): Self = this.set("defaultSequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setItems(value: KeystrokeSequence): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setObfuscation(value: Double): Self = this.set("obfuscation", value.asInstanceOf[js.Any])
  }
  
}

