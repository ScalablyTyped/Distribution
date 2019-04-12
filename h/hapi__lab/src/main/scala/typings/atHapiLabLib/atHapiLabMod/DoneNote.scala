package typings
package atHapiLabLib.atHapiLabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoneNote extends js.Object {
  /** Attach a note to the test case */
  def note(text: java.lang.String): scala.Unit
}

object DoneNote {
  @scala.inline
  def apply(note: java.lang.String => scala.Unit): DoneNote = {
    val __obj = js.Dynamic.literal(note = js.Any.fromFunction1(note))
  
    __obj.asInstanceOf[DoneNote]
  }
}

