package typings.kdbxweb.mod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "ByteUtils")
@js.native
object ByteUtils extends js.Object {
  
  def arrayBufferEquals(ab1: ArrayBuffer, ab2: ArrayBuffer): Boolean = js.native
  
  def arrayToBuffer(arr: ArrayBuffer): ArrayBuffer = js.native
  def arrayToBuffer(arr: Uint8Array): ArrayBuffer = js.native
  
  def base64ToBytes(str: String): Uint8Array = js.native
  
  def bytesToBase64(arr: ArrayBuffer): String = js.native
  def bytesToBase64(arr: Uint8Array): String = js.native
  
  def bytesToHex(arr: ArrayBuffer): String = js.native
  def bytesToHex(arr: Uint8Array): String = js.native
  
  def bytesToString(arr: ArrayBuffer): String = js.native
  def bytesToString(arr: Uint8Array): String = js.native
  
  def hexToBytes(hex: String): Uint8Array = js.native
  
  def stringToBytes(str: String): Uint8Array = js.native
  
  def zeroBuffer(buffer: ArrayBuffer): Unit = js.native
  def zeroBuffer(buffer: Uint8Array): Unit = js.native
}
