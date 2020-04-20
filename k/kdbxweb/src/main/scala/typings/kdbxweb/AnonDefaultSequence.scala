package typings.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultSequence extends js.Object {
  var defaultSequence: String
  var enabled: Boolean
  var items: AnonKeystrokeSequence
  var obfuscation: Double
}

object AnonDefaultSequence {
  @scala.inline
  def apply(defaultSequence: String, enabled: Boolean, items: AnonKeystrokeSequence, obfuscation: Double): AnonDefaultSequence = {
    val __obj = js.Dynamic.literal(defaultSequence = defaultSequence.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], obfuscation = obfuscation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultSequence]
  }
}

