package typings.kdbxweb.mod

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ByteUtils {
  
  @JSImport("kdbxweb", "ByteUtils")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def arrayBufferEquals(ab1: ArrayBuffer, ab2: ArrayBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayBufferEquals")(ab1.asInstanceOf[js.Any], ab2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def arrayToBuffer(arr: ArrayBuffer): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayToBuffer")(arr.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  @scala.inline
  def arrayToBuffer(arr: Uint8Array): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayToBuffer")(arr.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
  
  @scala.inline
  def base64ToBytes(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("base64ToBytes")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  @scala.inline
  def bytesToBase64(arr: ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToBase64")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def bytesToBase64(arr: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToBase64")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def bytesToHex(arr: ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def bytesToHex(arr: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToHex")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def bytesToString(arr: ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToString")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def bytesToString(arr: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToString")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def hexToBytes(hex: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToBytes")(hex.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  @scala.inline
  def stringToBytes(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToBytes")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  @scala.inline
  def zeroBuffer(buffer: ArrayBuffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def zeroBuffer(buffer: Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("zeroBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
