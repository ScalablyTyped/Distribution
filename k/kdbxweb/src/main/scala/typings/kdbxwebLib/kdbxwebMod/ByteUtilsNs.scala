package typings
package kdbxwebLib.kdbxwebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "ByteUtils")
@js.native
object ByteUtilsNs extends js.Object {
  def arrayBufferEquals(ab1: stdLib.ArrayBuffer, ab2: stdLib.ArrayBuffer): scala.Boolean = js.native
  def arrayToBuffer(arr: stdLib.ArrayBuffer): stdLib.ArrayBuffer = js.native
  def arrayToBuffer(arr: stdLib.Uint8Array): stdLib.ArrayBuffer = js.native
  def base64ToBytes(str: java.lang.String): stdLib.Uint8Array = js.native
  def bytesToBase64(arr: stdLib.ArrayBuffer): java.lang.String = js.native
  def bytesToBase64(arr: stdLib.Uint8Array): java.lang.String = js.native
  def bytesToHex(arr: stdLib.ArrayBuffer): java.lang.String = js.native
  def bytesToHex(arr: stdLib.Uint8Array): java.lang.String = js.native
  def bytesToString(arr: stdLib.ArrayBuffer): java.lang.String = js.native
  def bytesToString(arr: stdLib.Uint8Array): java.lang.String = js.native
  def hexToBytes(hex: java.lang.String): stdLib.Uint8Array = js.native
  def stringToBytes(str: java.lang.String): stdLib.Uint8Array = js.native
  def zeroBuffer(buffer: stdLib.ArrayBuffer): scala.Unit = js.native
  def zeroBuffer(buffer: stdLib.Uint8Array): scala.Unit = js.native
}

