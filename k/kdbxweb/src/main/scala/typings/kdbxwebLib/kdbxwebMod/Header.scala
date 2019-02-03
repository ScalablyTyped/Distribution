package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Header")
@js.native
class Header () extends js.Object {
  var compression: scala.Double = js.native
  var crsAlgorithm: scala.Double = js.native
  var dataCipherUuid: KdbxUuid = js.native
  var encryptionIV: js.Any = js.native
  var endPos: scala.Double = js.native
  var kdfParameters: VarDictionary = js.native
  var keyEncryptionRounds: scala.Double = js.native
  var masterSeed: stdLib.Uint8Array = js.native
  var protectedStreamKey: js.Any = js.native
  var publicCustomData: js.Any = js.native
  var streamStartBytes: js.Any = js.native
  var transformSeed: js.Any = js.native
  var versionMajor: scala.Double = js.native
  var versionMinor: scala.Double = js.native
  def generateSalts(): scala.Unit = js.native
  def readInnerHeader(stm: BinaryStream, ctx: Context): scala.Unit = js.native
  def upgrade(): scala.Unit = js.native
  def write(stm: BinaryStream): scala.Unit = js.native
  def writeInnerHeader(stm: BinaryStream, ctx: Context): scala.Unit = js.native
}

/* static members */
@JSImport("kdbxweb", "Header")
@js.native
object Header extends js.Object {
  def create(): kdbxwebLib.kdbxwebMod.Header = js.native
  def read(stm: kdbxwebLib.kdbxwebMod.BinaryStream, ctx: kdbxwebLib.kdbxwebMod.Context): kdbxwebLib.kdbxwebMod.Header = js.native
}

