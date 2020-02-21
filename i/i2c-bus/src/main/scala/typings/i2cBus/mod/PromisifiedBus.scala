package typings.i2cBus.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromisifiedBus extends js.Object {
  /**
    * Return the Bus instance for this PromisifiedBus instance.
    *
    * @return {I2CBus}
    *     The Bus instance for this PromisifiedBus instance.
    */
  def bus(): I2CBus = js.native
  /**
    * Asynchronous close.
    *
    * @return {Promise<void>}
    *     A Promise that will be resolved with no arguments once the underlying resources have been released, or will be rejected if an error occurs while closing.
    */
  def close(): js.Promise[Unit] = js.native
  /**
    * Asynchronous I2C device Id.
    *
    * @param  {number} address
    *     I2C device address
    * @return {Promise<I2CDeviceId>}
    *     A Promise that will be resolved with an id object on success, or will be rejected if an error occurs. id is an object with the properties <code>manufacturer</code>, <code>product</code> and if known a human readable <code>name</code> for the associated manufacturer.
    */
  def deviceId(address: Double): js.Promise[I2CDeviceId] = js.native
  /**
    * Determine functionality of the bus/adapter asynchronously.
    *
    * @return {Promise<I2CFuncs>}
    *     A Promise that on success will be resolved with a frozen I2cFuncs object describing the functionality available. The returned Promise will be rejected if an error occurs. See also [I2C functionality](https://www.kernel.org/doc/Documentation/i2c/functionality).
    */
  def i2cFuncs(): js.Promise[I2CFuncs] = js.native
  /**
    * Asynchronous plain I2C read.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} length
    *     The number of bytes to read.
    * @param {Buffer} buffer
    *     The buffer that the data will be written to (must be at least {length} bytes long).
    * @return {Promise<BytesRead>}
    *     A Promise that on success will be resolved with an object with a bytesRead property identifying the number of bytes read, and a buffer property that is a reference to the passed in buffer argument. The returned Promise will be rejected if an error occurs.
    */
  def i2cRead(address: Double, length: Double, buffer: Buffer): js.Promise[BytesRead] = js.native
  /**
    * Asynchronous plain I2C write.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} length
    *     The number of bytes to write.
    * @param {Buffer} buffer
    *     The buffer that the data to write (must contain at least {length} bytes).
    * @return {Promise<BytesWritten>}
    *     A Promise that on success will be resolved with an object with a bytesWritten property identifying the number of bytes written, and a buffer property that is a reference to the passed in buffer argument. The returned promise will be rejected if an error occurs.
    */
  def i2cWrite(address: Double, length: Double, buffer: Buffer): js.Promise[BytesWritten] = js.native
  /**
    * Asynchronous SMBus read byte.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @return {Promise<number>}
    *     A Promise that will be resolved with a number representing the byte read on success, or will be rejected if an error occurs. byte is an unsigned integer in the range 0 to 255.
    */
  def readByte(address: Double, command: Double): js.Promise[Double] = js.native
  /**
    * Asynchronous I2C block read (not defined by the SMBus specification).
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {number} length
    *     The number of bytes to read (max 32).
    * @param {Buffer} buffer
    *     The buffer that the data will be written to (must be at least {length} bytes long).
    * @return {Promise<BytesRead>}
    *     A Promise that on success will be resolved with an object with a bytesRead property identifying the number of bytes read, and a buffer property that is a reference to the passed in buffer argument. The returned Promise will be rejected if an error occurs.
    */
  def readI2cBlock(address: Double, command: Double, length: Double, buffer: Buffer): js.Promise[BytesRead] = js.native
  /**
    * Asynchronous SMBus read word.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @return {Promise<number>}
    *     A Promise that will be resolved with a number representing the word read on success, or will be rejected if an error occurs. word is an unsigned integer in the range 0 to 65535.
    */
  def readWord(address: Double, command: Double): js.Promise[Double] = js.native
  /**
    * Asynchronous SMBus receive byte.
    *
    * @param {number} address
    *     I2C device address.
    * @return {Promise<number>}
    *     A Promise that will be resolved with a number representing the byte received on success, or will be rejected if an error occurs. byte is an unsigned integer in the range 0 to 255.
    */
  def receiveByte(address: Double): js.Promise[Double] = js.native
  /**
    * Scans the I2C bus asynchronously for devices. The default address range 0x03 through 0x77 is the same as the default address range used by the <code>i2cdetect</code> command line tool.
    *
    * @param  {number} [address]
    *     An integer specifying the address of the scan.
    * @return {Promise<number[]>}
    *     A Promise that on success will be resolved with an array of numbers where each number represents the I2C address of a device which was detected. The returned Promise will be rejected if an error occurs.
    */
  def scan(): js.Promise[js.Array[Double]] = js.native
  def scan(address: Double): js.Promise[js.Array[Double]] = js.native
  /**
    * Scans the I2C bus asynchronously for devices. The default address range 0x03 through 0x77 is the same as the default address range used by the <code>i2cdetect</code> command line tool.
    *
    * @param  {number} [startAddr]
    *     An integer specifying the start address of the scan range.
    * @param  {number} [endAddr]
    *     An integer specifying the end address of the scan range.
    * @return {Promise<number[]>}
    *     A Promise that on success will be resolved with an array of numbers where each number represents the I2C address of a device which was detected. The returned Promise will be rejected if an error occurs.
    */
  def scan(startAddr: Double, endAddr: Double): js.Promise[js.Array[Double]] = js.native
  /**
    * Asynchronous SMBus send byte.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} byte
    *     The data byte to send.
    * @return {Promise<void>}
    *     A Promise that will be resolved with no arguments on success, or will be rejected if an error occurs.
    */
  def sendByte(address: Double, byte: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronous SMBus write byte.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {number} byte
    *     The data byte to write.
    * @return {Promise<void>}
    *     A Promise that will be resolved with no arguments on success, or will be rejected if an error occurs.
    */
  def writeByte(address: Double, command: Double, byte: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronous I2C block write (not defined by the SMBus specification).
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {number} length
    *     The number of bytes to write (max 32).
    * @param {Buffer} buffer
    *     The buffer that the data to write (must contain at least {length} bytes).
    * @return {Promise<BytesWritten>}
    *     A Promise that on success will be resolved with an object with a bytesWritten property identifying the number of bytes written, and a buffer property that is a reference to the passed in buffer argument. The returned promise will be rejected if an error occurs.
    */
  def writeI2cBlock(address: Double, command: Double, length: Double, buffer: Buffer): js.Promise[BytesWritten] = js.native
  /**
    * Asynchronous SMBus quick command.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {number} bit
    *     The data bit to write (0 or 1).
    * @return {Promise<void>}
    *     A Promise that will be resolved with no arguments on success, or will be rejected if an error occurs.
    */
  def writeQuick(address: Double, command: Double, bit: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronous SMBus write word.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {number} word
    *     The data word to write.
    * @return {Promise<void>}
    *     A Promise that will be resolved with no arguments on success, or will be rejected if an error occurs.
    */
  def writeWord(address: Double, command: Double, word: Double): js.Promise[Unit] = js.native
}

