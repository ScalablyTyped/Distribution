package typings.lab.labMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoneNote extends js.Object {
  /** Attach a note to the test case */
  def note(text: String): Unit
}

object DoneNote {
  @scala.inline
  def apply(note: String => Unit): DoneNote = {
    val __obj = js.Dynamic.literal(note = js.Any.fromFunction1(note))
  
    __obj.asInstanceOf[DoneNote]
  }
}

