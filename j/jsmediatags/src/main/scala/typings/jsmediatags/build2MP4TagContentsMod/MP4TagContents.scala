package typings.jsmediatags.build2MP4TagContentsMod

import typings.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MP4TagContents extends js.Object {
  var _atoms: js.Array[Atom]
  def toArray(): ByteArray
}

object MP4TagContents {
  @scala.inline
  def apply(_atoms: js.Array[Atom], toArray: () => ByteArray): MP4TagContents = {
    val __obj = js.Dynamic.literal(_atoms = _atoms, toArray = js.Any.fromFunction0(toArray))
  
    __obj.asInstanceOf[MP4TagContents]
  }
}

