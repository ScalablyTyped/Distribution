package typings.lab.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoneNote extends js.Object {
  /** Attach a note to the test case */
  def note(text: String): Unit = js.native
}

object DoneNote {
  @scala.inline
  def apply(note: String => Unit): DoneNote = {
    val __obj = js.Dynamic.literal(note = js.Any.fromFunction1(note))
    __obj.asInstanceOf[DoneNote]
  }
  @scala.inline
  implicit class DoneNoteOps[Self <: DoneNote] (val x: Self) extends AnyVal {
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
    def setNote(value: String => Unit): Self = this.set("note", js.Any.fromFunction1(value))
  }
  
}

