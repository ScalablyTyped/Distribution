package typings.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultSequence extends js.Object {
  var defaultSequence: String
  var enabled: Boolean
  var items: Anon_KeystrokeSequence
  var obfuscation: Double
}

object Anon_DefaultSequence {
  @scala.inline
  def apply(defaultSequence: String, enabled: Boolean, items: Anon_KeystrokeSequence, obfuscation: Double): Anon_DefaultSequence = {
    val __obj = js.Dynamic.literal(defaultSequence = defaultSequence.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], obfuscation = obfuscation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DefaultSequence]
  }
}

