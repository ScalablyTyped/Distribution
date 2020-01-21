package typings.kdbxweb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeystrokeSequence extends js.Object {
  var keystrokeSequence: String
  var windows: String
}

object AnonKeystrokeSequence {
  @scala.inline
  def apply(keystrokeSequence: String, windows: String): AnonKeystrokeSequence = {
    val __obj = js.Dynamic.literal(keystrokeSequence = keystrokeSequence.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKeystrokeSequence]
  }
}

