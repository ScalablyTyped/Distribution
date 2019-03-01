package typings
package i2cDashBusLib.i2cDashBusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I2cBus extends js.Object {
  /**
    * Asynchronous close.
    *
    * @param {CompletionCallback} callback
    *     Completion callback
    */
  def close(callback: i2cDashBusLib.CompletionCallback): scala.Unit
  /**
    * Synchronous close.
    */
  def closeSync(): scala.Unit
  /**
    * Determine functionality of the bus/adapter asynchronously.
    *
    * @param {ResultCallback<I2cBusFuncs>} callback
    *     Callback that will recieve a frozen I2cFuncs object describing the I2C functionality available.
    */
  def i2cFuncs(callback: i2cDashBusLib.ResultCallback[I2cBusFuncs]): scala.Unit
  /**
    * Determine functionality of the bus/adapter synchronously.
    *
    * @return {I2cBusFuncs}
    *     A frozen I2cFuncs object describing the I2C functionality available.
    */
  def i2cFuncsSync(): I2cBusFuncs
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
  def i2cRead(
    address: scala.Double,
    length: scala.Double,
    buffer: nodeLib.Buffer,
    callback: i2cDashBusLib.BufferCallback
  ): scala.Unit
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
  def i2cReadSync(address: scala.Double, length: scala.Double, buffer: nodeLib.Buffer): scala.Double
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
  def i2cWrite(
    address: scala.Double,
    length: scala.Double,
    buffer: nodeLib.Buffer,
    callback: i2cDashBusLib.BufferCallback
  ): scala.Unit
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
  def i2cWriteSync(address: scala.Double, length: scala.Double, buffer: nodeLib.Buffer): scala.Double
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
  def readByte(address: scala.Double, command: scala.Double, callback: i2cDashBusLib.ResultCallback[scala.Double]): scala.Unit
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
  def readByteSync(address: scala.Double, command: scala.Double): scala.Double
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
  def readI2cBlock(
    address: scala.Double,
    command: scala.Double,
    length: scala.Double,
    buffer: nodeLib.Buffer,
    callback: i2cDashBusLib.BufferCallback
  ): scala.Unit
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
  def readI2cBlockSync(address: scala.Double, command: scala.Double, length: scala.Double, buffer: nodeLib.Buffer): scala.Double
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
  def readWord(address: scala.Double, command: scala.Double, callback: i2cDashBusLib.ResultCallback[scala.Double]): scala.Unit
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
  def readWordSync(address: scala.Double, command: scala.Double): scala.Double
  /**
    * Asynchronous SMBus receive byte.
    *
    * @param {number} address
    *     I2C device address.
    * @param {ResultCallback<number>} callback
    *     Callback that will recieve the byte received.
    */
  def receiveByte(address: scala.Double, callback: i2cDashBusLib.ResultCallback[scala.Double]): scala.Unit
  /**
    * Synchronous SMBus receive byte.
    *
    * @param {number} address
    *     I2C device address.
    * @return {number}
    *     The byte received.
    */
  def receiveByteSync(address: scala.Double): scala.Double
  /**
    * Scans the I2C bus asynchronously for devices the same way <code>i2cdetect -y -r</code> would.
    *
    * @param {ResultCallback<number[]>} callback
    *     Callback that will recieve an array of numbers where each number represents the I2C address of a device which was detected.
    */
  def scan(callback: i2cDashBusLib.ResultCallback[js.Array[scala.Double]]): scala.Unit
  /**
    * Scans the I2C bus synchronously for devices the same way <code>i2cdetect -y -r</code> would.
    *
    * @return {number[]}
    *     An array of numbers where each number represents the I2C address of a device which was detected.
    */
  def scanSync(): js.Array[scala.Double]
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
  def sendByte(address: scala.Double, byte: scala.Double, callback: i2cDashBusLib.CompletionCallback): scala.Unit
  /**
    * Synchronous SMBus send byte.
    *
    * @param {number} address
    *     I2C device address.
    * @param {number} byte
    *     The data byte to send.
    */
  def sendByteSync(address: scala.Double, byte: scala.Double): scala.Unit
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
  def writeByte(
    address: scala.Double,
    command: scala.Double,
    byte: scala.Double,
    callback: i2cDashBusLib.CompletionCallback
  ): scala.Unit
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
  def writeByteSync(address: scala.Double, command: scala.Double, byte: scala.Double): scala.Unit
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
  def writeI2cBlock(
    address: scala.Double,
    command: scala.Double,
    length: scala.Double,
    buffer: nodeLib.Buffer,
    callback: i2cDashBusLib.BufferCallback
  ): scala.Unit
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
  def writeI2cBlockSync(address: scala.Double, command: scala.Double, length: scala.Double, buffer: nodeLib.Buffer): scala.Double
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
  def writeQuick(
    address: scala.Double,
    command: scala.Double,
    bit: scala.Double,
    callback: i2cDashBusLib.CompletionCallback
  ): scala.Unit
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
  def writeQuickSync(address: scala.Double, command: scala.Double, bit: scala.Double): scala.Unit
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
  def writeWord(
    address: scala.Double,
    command: scala.Double,
    word: scala.Double,
    callback: i2cDashBusLib.CompletionCallback
  ): scala.Unit
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
  def writeWordSync(address: scala.Double, command: scala.Double, word: scala.Double): scala.Unit
}

object I2cBus {
  @scala.inline
  def apply(
    close: js.Function1[i2cDashBusLib.CompletionCallback, scala.Unit],
    closeSync: js.Function0[scala.Unit],
    i2cFuncs: js.Function1[i2cDashBusLib.ResultCallback[I2cBusFuncs], scala.Unit],
    i2cFuncsSync: js.Function0[I2cBusFuncs],
    i2cRead: js.Function4[scala.Double, scala.Double, nodeLib.Buffer, i2cDashBusLib.BufferCallback, scala.Unit],
    i2cReadSync: js.Function3[scala.Double, scala.Double, nodeLib.Buffer, scala.Double],
    i2cWrite: js.Function4[scala.Double, scala.Double, nodeLib.Buffer, i2cDashBusLib.BufferCallback, scala.Unit],
    i2cWriteSync: js.Function3[scala.Double, scala.Double, nodeLib.Buffer, scala.Double],
    readByte: js.Function3[scala.Double, scala.Double, i2cDashBusLib.ResultCallback[scala.Double], scala.Unit],
    readByteSync: js.Function2[scala.Double, scala.Double, scala.Double],
    readI2cBlock: js.Function5[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      nodeLib.Buffer, 
      i2cDashBusLib.BufferCallback, 
      scala.Unit
    ],
    readI2cBlockSync: js.Function4[scala.Double, scala.Double, scala.Double, nodeLib.Buffer, scala.Double],
    readWord: js.Function3[scala.Double, scala.Double, i2cDashBusLib.ResultCallback[scala.Double], scala.Unit],
    readWordSync: js.Function2[scala.Double, scala.Double, scala.Double],
    receiveByte: js.Function2[scala.Double, i2cDashBusLib.ResultCallback[scala.Double], scala.Unit],
    receiveByteSync: js.Function1[scala.Double, scala.Double],
    scan: js.Function1[i2cDashBusLib.ResultCallback[js.Array[scala.Double]], scala.Unit],
    scanSync: js.Function0[js.Array[scala.Double]],
    sendByte: js.Function3[scala.Double, scala.Double, i2cDashBusLib.CompletionCallback, scala.Unit],
    sendByteSync: js.Function2[scala.Double, scala.Double, scala.Unit],
    writeByte: js.Function4[scala.Double, scala.Double, scala.Double, i2cDashBusLib.CompletionCallback, scala.Unit],
    writeByteSync: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit],
    writeI2cBlock: js.Function5[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      nodeLib.Buffer, 
      i2cDashBusLib.BufferCallback, 
      scala.Unit
    ],
    writeI2cBlockSync: js.Function4[scala.Double, scala.Double, scala.Double, nodeLib.Buffer, scala.Double],
    writeQuick: js.Function4[scala.Double, scala.Double, scala.Double, i2cDashBusLib.CompletionCallback, scala.Unit],
    writeQuickSync: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit],
    writeWord: js.Function4[scala.Double, scala.Double, scala.Double, i2cDashBusLib.CompletionCallback, scala.Unit],
    writeWordSync: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit]
  ): I2cBus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("closeSync")(closeSync)
    __obj.updateDynamic("i2cFuncs")(i2cFuncs)
    __obj.updateDynamic("i2cFuncsSync")(i2cFuncsSync)
    __obj.updateDynamic("i2cRead")(i2cRead)
    __obj.updateDynamic("i2cReadSync")(i2cReadSync)
    __obj.updateDynamic("i2cWrite")(i2cWrite)
    __obj.updateDynamic("i2cWriteSync")(i2cWriteSync)
    __obj.updateDynamic("readByte")(readByte)
    __obj.updateDynamic("readByteSync")(readByteSync)
    __obj.updateDynamic("readI2cBlock")(readI2cBlock)
    __obj.updateDynamic("readI2cBlockSync")(readI2cBlockSync)
    __obj.updateDynamic("readWord")(readWord)
    __obj.updateDynamic("readWordSync")(readWordSync)
    __obj.updateDynamic("receiveByte")(receiveByte)
    __obj.updateDynamic("receiveByteSync")(receiveByteSync)
    __obj.updateDynamic("scan")(scan)
    __obj.updateDynamic("scanSync")(scanSync)
    __obj.updateDynamic("sendByte")(sendByte)
    __obj.updateDynamic("sendByteSync")(sendByteSync)
    __obj.updateDynamic("writeByte")(writeByte)
    __obj.updateDynamic("writeByteSync")(writeByteSync)
    __obj.updateDynamic("writeI2cBlock")(writeI2cBlock)
    __obj.updateDynamic("writeI2cBlockSync")(writeI2cBlockSync)
    __obj.updateDynamic("writeQuick")(writeQuick)
    __obj.updateDynamic("writeQuickSync")(writeQuickSync)
    __obj.updateDynamic("writeWord")(writeWord)
    __obj.updateDynamic("writeWordSync")(writeWordSync)
    __obj.asInstanceOf[I2cBus]
  }
}

