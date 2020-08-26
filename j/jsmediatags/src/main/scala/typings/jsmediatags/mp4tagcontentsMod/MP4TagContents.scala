package typings.jsmediatags.mp4tagcontentsMod

import typings.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MP4TagContents extends js.Object {
  var _atoms: js.Array[Atom] = js.native
  def toArray(): ByteArray = js.native
}

object MP4TagContents {
  @scala.inline
  def apply(_atoms: js.Array[Atom], toArray: () => ByteArray): MP4TagContents = {
    val __obj = js.Dynamic.literal(_atoms = _atoms.asInstanceOf[js.Any], toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[MP4TagContents]
  }
  @scala.inline
  implicit class MP4TagContentsOps[Self <: MP4TagContents] (val x: Self) extends AnyVal {
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
    def set_atomsVarargs(value: Atom*): Self = this.set("_atoms", js.Array(value :_*))
    @scala.inline
    def set_atoms(value: js.Array[Atom]): Self = this.set("_atoms", value.asInstanceOf[js.Any])
    @scala.inline
    def setToArray(value: () => ByteArray): Self = this.set("toArray", js.Any.fromFunction0(value))
  }
  
}

