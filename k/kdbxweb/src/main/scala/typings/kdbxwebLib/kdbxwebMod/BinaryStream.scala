package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "BinaryStream")
@js.native
class BinaryStream protected () extends js.Object {
  def this(arrayBuffer: stdLib.ArrayBuffer) = this()
  def getByteLength(): scala.Double = js.native
  def getFloat32(): scala.Double = js.native
  def getFloat32(littleEdian: scala.Boolean): scala.Double = js.native
  def getFloat64(): scala.Double = js.native
  def getFloat64(littleEdian: scala.Boolean): scala.Double = js.native
  def getInt16(): scala.Double = js.native
  def getInt16(littleEdian: scala.Boolean): scala.Double = js.native
  def getInt32(): scala.Double = js.native
  def getInt32(littleEdian: scala.Boolean): scala.Double = js.native
  def getInt8(): scala.Double = js.native
  def getInt8(littleEdian: scala.Boolean): scala.Double = js.native
  def getPos(): scala.Double = js.native
  def getUint16(): scala.Double = js.native
  def getUint16(littleEdian: scala.Boolean): scala.Double = js.native
  def getUint32(): scala.Double = js.native
  def getUint32(littleEdian: scala.Boolean): scala.Double = js.native
  def getUint64(): scala.Double = js.native
  def getUint64(littleEdian: scala.Boolean): scala.Double = js.native
  def getUint8(): scala.Double = js.native
  def getUint8(littleEdian: scala.Boolean): scala.Double = js.native
  def getWrittenBytes(): stdLib.ArrayBuffer = js.native
  def readBytes(size: scala.Double): stdLib.ArrayBuffer = js.native
  def readBytesNoAdvance(startPos: scala.Double, endPos: scala.Double): stdLib.ArrayBuffer = js.native
  def readBytesToEnd(): stdLib.ArrayBuffer = js.native
  def setFloat32(value: scala.Double): scala.Unit = js.native
  def setFloat32(value: scala.Double, littleEdian: scala.Boolean): scala.Unit = js.native
  def setFloat64(value: scala.Double): scala.Unit = js.native
  def setFloat64(value: scala.Double, littleEdian: scala.Boolean): scala.Unit = js.native
  def setInt16(value: scala.Double): scala.Unit = js.native
  def setInt16(value: scala.Double, littleEdian: scala.Boolean): scala.Unit = js.native
  def setInt32(value: scala.Double): scala.Unit = js.native
  def setInt32(value: scala.Double, littleEdian: scala.Boolean): scala.Unit = js.native
  def setInt8(value: scala.Double): scala.Unit = js.native
  def setInt8(value: scala.Double, littleEdian: scala.Boolean): scala.Unit = js.native
  def setUint16(value: scala.Double): scala.Unit = js.native
  def setUint16(value: scala.Double, littleEdian: scala.Boolean): scala.Unit = js.native
  def setUint32(value: scala.Double): scala.Unit = js.native
  def setUint32(value: scala.Double, littleEdian: scala.Boolean): scala.Unit = js.native
  def setUint64(value: scala.Double): scala.Unit = js.native
  def setUint64(value: scala.Double, littleEdian: scala.Boolean): scala.Unit = js.native
  def setUint8(value: scala.Double): scala.Unit = js.native
  def setUint8(value: scala.Double, littleEdian: scala.Boolean): scala.Unit = js.native
  def writeBytes(bytes: stdLib.ArrayBuffer): scala.Unit = js.native
  def writeBytes(bytes: stdLib.Uint8Array): scala.Unit = js.native
}

