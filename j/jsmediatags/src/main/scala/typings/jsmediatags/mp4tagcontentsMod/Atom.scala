package typings.jsmediatags.mp4tagcontentsMod

import typings.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsmediatags/build2/MP4TagContents", "Atom")
@js.native
class Atom protected () extends js.Object {
  def this(name: String) = this()
  def this(name: String, data: ByteArray) = this()
  def this(name: String, data: js.UndefOr[scala.Nothing], atoms: js.Array[Atom]) = this()
  def this(name: String, data: ByteArray, atoms: js.Array[Atom]) = this()
  var _atoms: js.Array[Atom] = js.native
  var _data: js.Array[Double] = js.native
  var _name: String = js.native
  def toArray(): ByteArray = js.native
}

