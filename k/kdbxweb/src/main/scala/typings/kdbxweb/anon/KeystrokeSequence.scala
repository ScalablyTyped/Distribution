package typings.kdbxweb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeystrokeSequence extends js.Object {
  var keystrokeSequence: String
  var windows: String
}

object KeystrokeSequence {
  @scala.inline
  def apply(keystrokeSequence: String, windows: String): KeystrokeSequence = {
    val __obj = js.Dynamic.literal(keystrokeSequence = keystrokeSequence.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeystrokeSequence]
  }
}

