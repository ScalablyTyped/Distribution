package typings.i2cBus.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I2CBus extends js.Object {
  /**
    * Asynchronous close.
    *
    * @param {CompletionCallback} callback
    *     Completion callback
    */
  def close(callback: CompletionCallback): Unit = js.native
  /**
    * Synchronous close.
    */
  def closeSync(): Unit = js.native
  /**
    * Asynchronous I2C device Id.
    *
    * @param {number} address
    *     I2C device address
    * @param {ResultCallback<I2CDeviceId>} callback
    *     The callback gets two arguments (err, id). id is an object with the properties <code>manufacturer</code>, <code>product</code> and if known a human readable <code>name</code> for the associated manufacturer.
    */
  def deviceId(address: Double, callback: ResultCallback[I2CDeviceId]): Unit = js.native
  /**
    * Synchronous I2C device Id.
    *
    * @param  {number} address
    *     I2C device address
    * @return {I2CDeviceId}
    *     An object with the properties <code>manufacturer</code>, <code>product</code> and if known a human readable <code>name</code> for the associated manufacturer.
    */
  def deviceIdSync(address: Double): I2CDeviceId = js.native
  /**
    * Determine functionality of the bus/adapter asynchronously.
    *
    * @param {ResultCallback<I2CFuncs>} callback
    *     Callback that will recieve a frozen I2cFuncs object describing the I2C functionality available.
    */
  def i2cFuncs(callback: ResultCallback[I2CFuncs]): Unit = js.native
  /**
    * Determine functionality of the bus/adapter synchronously.
    *
    * @return {I2CFuncs}
    *     A frozen I2cFuncs object describing the I2C functionality available.
    */
  def i2cFuncsSync(): I2CFuncs = js.native
  /**
    * Asynchronous plain I2C read.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} length
    *     The number of bytes to read.
    * @param {Buffer} buffer
    *     The buffer that the data will be written to (must be at least {length} bytes long).
    * @param {BufferCallback} callback
    *     Callback that will recieve the number of bytes read and the given buffer.
    */
  def i2cRead(address: Double, length: Double, buffer: Buffer, callback: BufferCallback): Unit = js.native
  /**
    * Synchronous plain I2C read.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} length
    *     The number of bytes to read.
    * @param {Buffer} buffer
    *     The buffer that the data will be written to (must be at least {length} bytes long).
    * @return {number}
    *     The number of bytes read.
    */
  def i2cReadSync(address: Double, length: Double, buffer: Buffer): Double = js.native
  /**
    * Asynchronous plain I2C write.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} length
    *     The number of bytes to write.
    * @param {Buffer} buffer
    *     The buffer that the data to write (must contain at least {length} bytes).
    * @param {BufferCallback} callback
    *     Callback that will recieve the number of bytes written and the given buffer.
    */
  def i2cWrite(address: Double, length: Double, buffer: Buffer, callback: BufferCallback): Unit = js.native
  /**
    * Synchronous plain I2C write.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} length
    *     The number of bytes to write.
    * @param {Buffer} buffer
    *     The buffer that the data will to write (must contain at least {length} bytes).
    * @return {number}
    *     The number of bytes written.
    */
  def i2cWriteSync(address: Double, length: Double, buffer: Buffer): Double = js.native
  /**
    * Return the PromisifiedBus instance for this Bus instance.
    *
    * @return {PromisifiedBus}
    *     The PromisifiedBus instance for this Bus instance.
    */
  def promisifiedBus(): PromisifiedBus = js.native
  /**
    * Asynchronous SMBus read byte.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {ResultCallback<number>} callback
    *     Callback that will recieve the byte read.
    */
  def readByte(address: Double, command: Double, callback: ResultCallback[Double]): Unit = js.native
  /**
    * Synchronous SMBus read byte.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @return {number}
    *     The byte read.
    */
  def readByteSync(address: Double, command: Double): Double = js.native
  /**
    * Asynchronous I2C block read (not defined by the SMBus
    * specification). Reads a block of bytes from a device, from a
    * designated register that is specified by cmd.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {number} length
    *     The number of bytes to read (max 32).
    * @param {Buffer} buffer
    *     The buffer that the data will be written to (must be at least {length} bytes long).
    * @param {BufferCallback} callback
    *     Callback that will recieve the number of bytes read and the given buffer.
    */
  def readI2cBlock(address: Double, command: Double, length: Double, buffer: Buffer, callback: BufferCallback): Unit = js.native
  /**
    * Synchronous I2C block read (not defined by the SMBus
    * specification). Reads a block of bytes from a device, from a
    * designated register that is specified by cmd.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {number} length
    *     The number of bytes to read (max 32).
    * @param {Buffer} buffer
    *     The buffer that the data will be written to (must be at least {length} bytes long).
    * @return {number}
    *     The number of bytes read.
    */
  def readI2cBlockSync(address: Double, command: Double, length: Double, buffer: Buffer): Double = js.native
  /**
    * Asynchronous SMBus read word.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {ResultCallback<number>} callback
    *     Callback that will recieve the word read.
    */
  def readWord(address: Double, command: Double, callback: ResultCallback[Double]): Unit = js.native
  /**
    * Synchronous SMBus read word.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @return {number}
    *     The word read.
    */
  def readWordSync(address: Double, command: Double): Double = js.native
  /**
    * Asynchronous SMBus receive byte.
    *
    * @param {number} address
    *     I2C device address.
    * @param {ResultCallback<number>} callback
    *     Callback that will recieve the byte received.
    */
  def receiveByte(address: Double, callback: ResultCallback[Double]): Unit = js.native
  /**
    * Synchronous SMBus receive byte.
    *
    * @param {number} address
    *     I2C device address.
    * @return {number}
    *     The byte received.
    */
  def receiveByteSync(address: Double): Double = js.native
  /**
    * Scans the I2C bus asynchronously for devices. The default address range 0x03 through 0x77 is the same as the default address range used by the <code>i2cdetect</code> command line tool.
    *
    * @param {number} address
    *     An integer specifying the address of the scan.
    * @param {ResultCallback<number[]>} callback
    *     Callback that will recieve an array of numbers where each number represents the I2C address of a device which was detected.
    */
  def scan(address: Double, callback: ResultCallback[js.Array[Double]]): Unit = js.native
  /**
    * Scans the I2C bus asynchronously for devices. The default address range 0x03 through 0x77 is the same as the default address range used by the <code>i2cdetect</code> command line tool.
    *
    * @param {ResultCallback<number[]>} callback
    *     Callback that will recieve an array of numbers where each number represents the I2C address of a device which was detected.
    */
  def scan(callback: ResultCallback[js.Array[Double]]): Unit = js.native
  /**
    * Scans the I2C bus asynchronously for devices. The default address range 0x03 through 0x77 is the same as the default address range used by the <code>i2cdetect</code> command line tool.
    *
    * @param {number} startAddr
    *     An integer specifying the start address of the scan range.
    * @param {number} endAddr
    *     An integer specifying the end address of the scan range.
    * @param {ResultCallback<number[]>} callback
    *     Callback that will recieve an array of numbers where each number represents the I2C address of a device which was detected.
    */
  def scan(startAddr: Double, endAddr: Double, callback: ResultCallback[js.Array[Double]]): Unit = js.native
  /**
    * Scans the I2C bus synchronously for devices. The default address range 0x03 through 0x77 is the same as the default address range used by the <code>i2cdetect</code> command line tool.
    *
    * @param  {number} [address]
    *     An integer specifying the address of the scan.
    * @return {number[]}
    *     An array of numbers where each number represents the I2C address of a device which was detected.
    */
  def scanSync(): js.Array[Double] = js.native
  def scanSync(address: Double): js.Array[Double] = js.native
  /**
    * Scans the I2C bus synchronously for devices. The default address range 0x03 through 0x77 is the same as the default address range used by the <code>i2cdetect</code> command line tool.
    *
    * @param  {number} [startAddr]
    *     An integer specifying the start address of the scan range.
    * @param  {number} [endAddr]
    *     An integer specifying the end address of the scan range.
    * @return {number[]}
    *     An array of numbers where each number represents the I2C address of a device which was detected.
    */
  def scanSync(startAddr: Double, endAddr: Double): js.Array[Double] = js.native
  /**
    * Asynchronous SMBus send byte.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} byte
    *     The data byte to send.
    * @param {CompletionCallback} callback
    *     Completion callback
    */
  def sendByte(address: Double, byte: Double, callback: CompletionCallback): Unit = js.native
  /**
    * Synchronous SMBus send byte.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} byte
    *     The data byte to send.
    */
  def sendByteSync(address: Double, byte: Double): Unit = js.native
  /**
    * Asynchronous SMBus write byte.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {number} byte
    *     The data byte to write.
    * @param {CompletionCallback} callback
    *     Completion callback
    */
  def writeByte(address: Double, command: Double, byte: Double, callback: CompletionCallback): Unit = js.native
  /**
    * Synchronous SMBus write byte.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {number} byte
    *     The data byte to write.
    */
  def writeByteSync(address: Double, command: Double, byte: Double): Unit = js.native
  /**
    * Asynchronous I2C block write (not defined by the SMBus
    * specification). Writes a block of bytes to a device, to a designated
    * register that is specified by {command}.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {number} length
    *     The number of bytes to write (max 32).
    * @param {Buffer} buffer
    *     The buffer that the data to write (must contain at least {length} bytes).
    * @param {BufferCallback} callback
    *     Callback that will recieve the number of bytes written and the given buffer.
    */
  def writeI2cBlock(address: Double, command: Double, length: Double, buffer: Buffer, callback: BufferCallback): Unit = js.native
  /**
    * Synchronous I2C block write (not defined by the SMBus
    * specification). Writes a block of bytes to a device, to a designated
    * register that is specified by {command}.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {number} length
    *     The number of bytes to write (max 32).
    * @param {Buffer} buffer
    *     The buffer that the data will to write (must contain at least {length} bytes).
    * @return {number}
    *     The number of bytes written.
    */
  def writeI2cBlockSync(address: Double, command: Double, length: Double, buffer: Buffer): Double = js.native
  /**
    * Asynchronous SMBus quick command.  Writes a single bit to the device.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {number} bit
    *     The data bit to write (0 or 1).
    * @param {CompletionCallback} callback
    *     Completion callback
    */
  def writeQuick(address: Double, command: Double, bit: Double, callback: CompletionCallback): Unit = js.native
  /**
    * Synchronous SMBus quick command.  Writes a single bit to the device.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {number} bit
    *     The data bit to write (0 or 1).
    */
  def writeQuickSync(address: Double, command: Double, bit: Double): Unit = js.native
  /**
    * Asynchronous SMBus write word.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {number} word
    *     The data word to write.
    * @param {CompletionCallback} callback
    *     Completion callback
    */
  def writeWord(address: Double, command: Double, word: Double, callback: CompletionCallback): Unit = js.native
  /**
    * Synchronous SMBus write word.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} command
    *     The command code.
    * @param {number} word
    *     The data word to write.
    */
  def writeWordSync(address: Double, command: Double, word: Double): Unit = js.native
}

