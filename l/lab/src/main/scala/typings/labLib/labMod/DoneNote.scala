package typings
package labLib.labMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoneNote extends js.Object {
  /** Attach a note to the test case */
  def note(text: java.lang.String): scala.Unit
}

object DoneNote {
  @scala.inline
  def apply(note: js.Function1[java.lang.String, scala.Unit]): DoneNote = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("note")(note)
    __obj.asInstanceOf[DoneNote]
  }
}

