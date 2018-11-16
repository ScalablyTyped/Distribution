package typings
package jdataviewLib.jdataviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait jDataView
  extends stdLib.DataView {
  def createBuffer(bytes: scala.Double*): jdataviewLib.jdataviewMod.jDataViewNs.Buffer = js.native
  def getBytes(length: scala.Double): js.Array[scala.Double] = js.native
  def getBytes(length: scala.Double, byteOffset: scala.Double): js.Array[scala.Double] = js.native
  def getBytes(length: scala.Double, byteOffset: scala.Double, littleEndian: scala.Boolean): js.Array[scala.Double] = js.native
  def getBytes(
    length: scala.Double,
    byteOffset: scala.Double,
    littleEndian: scala.Boolean,
    toArray: scala.Boolean
  ): js.Array[scala.Double] = js.native
  // Strings and Blobs
  def getChar(): java.lang.String = js.native
  // Strings and Blobs
  def getChar(byteOffset: scala.Double): java.lang.String = js.native
  def getFloat32(): scala.Double = js.native
  def getFloat64(): scala.Double = js.native
  def getInt16(): scala.Double = js.native
  def getInt32(): scala.Double = js.native
  // 64 bit integers
  def getInt64(): jdataviewLib.jdataviewMod.jDataViewNs.Int64 = js.native
  // 64 bit integers
  def getInt64(byteOffset: scala.Double): jdataviewLib.jdataviewMod.jDataViewNs.Int64 = js.native
  // 64 bit integers
  def getInt64(byteOffset: scala.Double, littleEndian: scala.Boolean): jdataviewLib.jdataviewMod.jDataViewNs.Int64 = js.native
  // Specification getters
  def getInt8(): scala.Double = js.native
  // Bitfields
  def getSigned(bitLength: scala.Double): scala.Double = js.native
  // Bitfields
  def getSigned(bitLength: scala.Double, byteOffset: scala.Double): scala.Double = js.native
  def getString(byteLength: scala.Double): java.lang.String = js.native
  def getString(byteLength: scala.Double, byteOffset: scala.Double): java.lang.String = js.native
  def getString(byteLength: scala.Double, byteOffset: scala.Double, encoding: java.lang.String): java.lang.String = js.native
  def getUint16(): scala.Double = js.native
  def getUint32(): scala.Double = js.native
  def getUint64(): jdataviewLib.jdataviewMod.jDataViewNs.Uint64 = js.native
  def getUint64(byteOffset: scala.Double): jdataviewLib.jdataviewMod.jDataViewNs.Uint64 = js.native
  def getUint64(byteOffset: scala.Double, littleEndian: scala.Boolean): jdataviewLib.jdataviewMod.jDataViewNs.Uint64 = js.native
  def getUint8(): scala.Double = js.native
  def getUnsigned(bitLength: scala.Double): scala.Double = js.native
  def getUnsigned(bitLength: scala.Double, byteOffset: scala.Double): scala.Double = js.native
  // Operation control
  def seek(byteOffset: scala.Double): scala.Double = js.native
  def setBytes(byteOffset: scala.Double, bytes: js.Array[scala.Double]): scala.Unit = js.native
  def setBytes(byteOffset: scala.Double, bytes: js.Array[scala.Double], littleEndian: scala.Boolean): scala.Unit = js.native
  def setChar(byteOffset: scala.Double, char: java.lang.String): scala.Unit = js.native
  def setInt64(byteOffset: scala.Double, value: jdataviewLib.jdataviewMod.jDataViewNs.Int64): scala.Unit = js.native
  def setInt64(
    byteOffset: scala.Double,
    value: jdataviewLib.jdataviewMod.jDataViewNs.Int64,
    littleEndian: scala.Boolean
  ): scala.Unit = js.native
  def setSigned(byteOffset: scala.Double, value: scala.Double, bitLength: scala.Double): scala.Unit = js.native
  def setString(byteOffset: scala.Double, chars: java.lang.String): scala.Unit = js.native
  def setString(byteOffset: scala.Double, chars: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def setUint64(byteOffset: scala.Double, value: jdataviewLib.jdataviewMod.jDataViewNs.Uint64): scala.Unit = js.native
  def setUint64(
    byteOffset: scala.Double,
    value: jdataviewLib.jdataviewMod.jDataViewNs.Uint64,
    littleEndian: scala.Boolean
  ): scala.Unit = js.native
  def setUnsigned(byteOffset: scala.Double, value: scala.Double, bitLength: scala.Double): scala.Unit = js.native
  def skip(byteLength: scala.Double): scala.Double = js.native
  def slice(start: scala.Double): jDataView = js.native
  def slice(start: scala.Double, end: scala.Double): jDataView = js.native
  def slice(start: scala.Double, end: scala.Double, forceCopy: scala.Boolean): jDataView = js.native
  def tell(): scala.Double = js.native
  def wrapBuffer(byteCount: scala.Double): jdataviewLib.jdataviewMod.jDataViewNs.Buffer = js.native
  def wrapBuffer(bytes: jdataviewLib.jdataviewMod.jDataViewNs.Bytes): jdataviewLib.jdataviewMod.jDataViewNs.Buffer = js.native
  // Internal utilities
  def wrapBuffer(string: java.lang.String): jdataviewLib.jdataviewMod.jDataViewNs.Buffer = js.native
  def writeBytes(bytes: js.Array[scala.Double]): scala.Unit = js.native
  def writeBytes(bytes: js.Array[scala.Double], littleEndian: scala.Boolean): scala.Unit = js.native
  def writeChar(char: java.lang.String): scala.Unit = js.native
  def writeFloat32(value: scala.Double): scala.Unit = js.native
  def writeFloat32(value: scala.Double, littleEndian: scala.Boolean): scala.Unit = js.native
  def writeFloat64(value: scala.Double): scala.Unit = js.native
  def writeFloat64(value: scala.Double, littleEndian: scala.Boolean): scala.Unit = js.native
  def writeInt16(value: scala.Double): scala.Unit = js.native
  def writeInt16(value: scala.Double, littleEndian: scala.Boolean): scala.Unit = js.native
  def writeInt32(value: scala.Double): scala.Unit = js.native
  def writeInt32(value: scala.Double, littleEndian: scala.Boolean): scala.Unit = js.native
  def writeInt64(value: jdataviewLib.jdataviewMod.jDataViewNs.Int64): scala.Unit = js.native
  def writeInt64(value: jdataviewLib.jdataviewMod.jDataViewNs.Int64, littleEndian: scala.Boolean): scala.Unit = js.native
  // writeXXX methods
  def writeInt8(value: scala.Double): scala.Unit = js.native
  def writeSigned(value: scala.Double, bitLength: scala.Double): scala.Unit = js.native
  def writeString(chars: java.lang.String): scala.Unit = js.native
  def writeString(chars: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def writeUint16(value: scala.Double): scala.Unit = js.native
  def writeUint16(value: scala.Double, littleEndian: scala.Boolean): scala.Unit = js.native
  def writeUint32(value: scala.Double): scala.Unit = js.native
  def writeUint32(value: scala.Double, littleEndian: scala.Boolean): scala.Unit = js.native
  def writeUint64(value: jdataviewLib.jdataviewMod.jDataViewNs.Uint64): scala.Unit = js.native
  def writeUint64(value: jdataviewLib.jdataviewMod.jDataViewNs.Uint64, littleEndian: scala.Boolean): scala.Unit = js.native
  def writeUint8(value: scala.Double): scala.Unit = js.native
  def writeUnsigned(value: scala.Double, bitLength: scala.Double): scala.Unit = js.native
}

