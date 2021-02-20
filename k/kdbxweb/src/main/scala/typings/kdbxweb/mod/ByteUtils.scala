package typings.kdbxweb.mod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ByteUtils {
  
  @JSImport("kdbxweb", "ByteUtils.arrayBufferEquals")
  @js.native
  def arrayBufferEquals(ab1: ArrayBuffer, ab2: ArrayBuffer): Boolean = js.native
  
  @JSImport("kdbxweb", "ByteUtils.arrayToBuffer")
  @js.native
  def arrayToBuffer(arr: ArrayBuffer): ArrayBuffer = js.native
  @JSImport("kdbxweb", "ByteUtils.arrayToBuffer")
  @js.native
  def arrayToBuffer(arr: Uint8Array): ArrayBuffer = js.native
  
  @JSImport("kdbxweb", "ByteUtils.base64ToBytes")
  @js.native
  def base64ToBytes(str: String): Uint8Array = js.native
  
  @JSImport("kdbxweb", "ByteUtils.bytesToBase64")
  @js.native
  def bytesToBase64(arr: ArrayBuffer): String = js.native
  @JSImport("kdbxweb", "ByteUtils.bytesToBase64")
  @js.native
  def bytesToBase64(arr: Uint8Array): String = js.native
  
  @JSImport("kdbxweb", "ByteUtils.bytesToHex")
  @js.native
  def bytesToHex(arr: ArrayBuffer): String = js.native
  @JSImport("kdbxweb", "ByteUtils.bytesToHex")
  @js.native
  def bytesToHex(arr: Uint8Array): String = js.native
  
  @JSImport("kdbxweb", "ByteUtils.bytesToString")
  @js.native
  def bytesToString(arr: ArrayBuffer): String = js.native
  @JSImport("kdbxweb", "ByteUtils.bytesToString")
  @js.native
  def bytesToString(arr: Uint8Array): String = js.native
  
  @JSImport("kdbxweb", "ByteUtils.hexToBytes")
  @js.native
  def hexToBytes(hex: String): Uint8Array = js.native
  
  @JSImport("kdbxweb", "ByteUtils.stringToBytes")
  @js.native
  def stringToBytes(str: String): Uint8Array = js.native
  
  @JSImport("kdbxweb", "ByteUtils.zeroBuffer")
  @js.native
  def zeroBuffer(buffer: ArrayBuffer): Unit = js.native
  @JSImport("kdbxweb", "ByteUtils.zeroBuffer")
  @js.native
  def zeroBuffer(buffer: Uint8Array): Unit = js.native
}
