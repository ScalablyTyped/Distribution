package typings.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultSequence extends js.Object {
  var defaultSequence: String
  var enabled: Boolean
  var items: KeystrokeSequence
  var obfuscation: Double
}

object DefaultSequence {
  @scala.inline
  def apply(defaultSequence: String, enabled: Boolean, items: KeystrokeSequence, obfuscation: Double): DefaultSequence = {
    val __obj = js.Dynamic.literal(defaultSequence = defaultSequence.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], obfuscation = obfuscation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSequence]
  }
}

