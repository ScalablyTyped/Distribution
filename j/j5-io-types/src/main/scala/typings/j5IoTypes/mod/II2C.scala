package typings.j5IoTypes.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait II2C extends IPeripheral {
  def read(address: Double, length: Double, cb: I2CReadBufferCallback): Unit = js.native
  def read(address: Double, register: Double, length: Double, cb: I2CReadBufferCallback): Unit = js.native
  def readByte(address: Double, cb: I2CReadNumberCallback): Unit = js.native
  def readByte(address: Double, register: Double, cb: I2CReadNumberCallback): Unit = js.native
  def readByteSync(address: Double): Double = js.native
  def readByteSync(address: Double, register: Double): Double = js.native
  def readSync(address: Double): Buffer = js.native
  def readSync(address: Double, registerOrLength: Double): Buffer = js.native
  def readSync(address: Double, registerOrLength: Double, length: Double): Buffer = js.native
  def readWord(address: Double, cb: I2CReadNumberCallback): Unit = js.native
  def readWord(address: Double, register: Double, cb: I2CReadNumberCallback): Unit = js.native
  def readWordSync(address: Double): Double = js.native
  def readWordSync(address: Double, register: Double): Double = js.native
  def write(address: Double, buffer: Buffer): Unit = js.native
  def write(address: Double, buffer: Buffer, cb: I2CWriteCallback): Unit = js.native
  def write(address: Double, register: Double, buffer: Buffer): Unit = js.native
  def write(address: Double, register: Double, buffer: Buffer, cb: I2CWriteCallback): Unit = js.native
  def writeByte(address: Double, byte: Double): Unit = js.native
  def writeByte(address: Double, byte: Double, cb: I2CWriteCallback): Unit = js.native
  def writeByte(address: Double, register: Double, byte: Double): Unit = js.native
  def writeByte(address: Double, register: Double, byte: Double, cb: I2CWriteCallback): Unit = js.native
  def writeByteSync(address: Double, registerOrByte: Double): Unit = js.native
  def writeByteSync(address: Double, registerOrByte: Double, byte: Double): Unit = js.native
  def writeSync(address: Double, buffer: Buffer): Unit = js.native
  def writeSync(address: Double, register: Double, buffer: Buffer): Unit = js.native
  def writeWord(address: Double, register: Double, word: Double): Unit = js.native
  def writeWord(address: Double, register: Double, word: Double, cb: I2CWriteCallback): Unit = js.native
  def writeWord(address: Double, word: Double): Unit = js.native
  def writeWord(address: Double, word: Double, cb: I2CWriteCallback): Unit = js.native
  def writeWordSync(address: Double, registerOrWord: Double): Unit = js.native
  def writeWordSync(address: Double, registerOrWord: Double, word: Double): Unit = js.native
}

