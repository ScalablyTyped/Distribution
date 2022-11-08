package typings.int53

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("int53", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readInt64BE(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readInt64BE")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def readInt64BE(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readInt64LE(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readInt64LE")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def readInt64LE(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readInt64LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readUInt64BE(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64BE")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def readUInt64BE(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64BE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def readUInt64LE(buffer: Buffer): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64LE")(buffer.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def readUInt64LE(buffer: Buffer, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readUInt64LE")(buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def writeInt64BE(number: Double, buffer: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt64BE")(number.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeInt64BE(number: Double, buffer: Buffer, offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt64BE")(number.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeInt64LE(number: Double, buffer: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt64LE")(number.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeInt64LE(number: Double, buffer: Buffer, offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeInt64LE")(number.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUInt64BE(number: Double, buffer: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt64BE")(number.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeUInt64BE(number: Double, buffer: Buffer, offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt64BE")(number.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUInt64LE(number: Double, buffer: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt64LE")(number.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeUInt64LE(number: Double, buffer: Buffer, offset: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUInt64LE")(number.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
