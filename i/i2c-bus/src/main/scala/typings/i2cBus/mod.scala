package typings.i2cBus

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i2c-bus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def open(busNumber: Double, callback: CompletionCallback): I2CBus = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(busNumber.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[I2CBus]
  inline def open(busNumber: Double, options: OpenOptions, callback: CompletionCallback): I2CBus = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(busNumber.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[I2CBus]
  
  inline def openPromisified(busNumber: Double): js.Promise[PromisifiedBus] = ^.asInstanceOf[js.Dynamic].applyDynamic("openPromisified")(busNumber.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PromisifiedBus]]
  inline def openPromisified(busNumber: Double, options: OpenOptions): js.Promise[PromisifiedBus] = (^.asInstanceOf[js.Dynamic].applyDynamic("openPromisified")(busNumber.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[PromisifiedBus]]
  
  inline def openSync(busNumber: Double): I2CBus = ^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(busNumber.asInstanceOf[js.Any]).asInstanceOf[I2CBus]
  inline def openSync(busNumber: Double, options: OpenOptions): I2CBus = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(busNumber.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[I2CBus]
  
  type BufferCallback = js.Function3[/* error */ Any, /* bytesReadOrWritten */ Double, /* buffer */ Buffer, Any]
  
  trait BytesRead extends StObject {
    
    var buffer: Buffer
    
    var bytesRead: Double
  }
  object BytesRead {
    
    inline def apply(buffer: Buffer, bytesRead: Double): BytesRead = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
      __obj.asInstanceOf[BytesRead]
    }
    
    extension [Self <: BytesRead](x: Self) {
      
      inline def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
    }
  }
  
  trait BytesWritten extends StObject {
    
    var buffer: Buffer
    
    var bytesWritten: Double
  }
  object BytesWritten {
    
    inline def apply(buffer: Buffer, bytesWritten: Double): BytesWritten = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesWritten = bytesWritten.asInstanceOf[js.Any])
      __obj.asInstanceOf[BytesWritten]
    }
    
    extension [Self <: BytesWritten](x: Self) {
      
      inline def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBytesWritten(value: Double): Self = StObject.set(x, "bytesWritten", value.asInstanceOf[js.Any])
    }
  }
  
  type CompletionCallback = js.Function1[/* error */ Any, Any]
  
  @js.native
  trait I2CBus extends StObject {
    
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
  
  trait I2CDeviceId extends StObject {
    
    var manufacturer: Double
    
    var name: String
    
    var product: Double
  }
  object I2CDeviceId {
    
    inline def apply(manufacturer: Double, name: String, product: Double): I2CDeviceId = {
      val __obj = js.Dynamic.literal(manufacturer = manufacturer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any])
      __obj.asInstanceOf[I2CDeviceId]
    }
    
    extension [Self <: I2CDeviceId](x: Self) {
      
      inline def setManufacturer(value: Double): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProduct(value: Double): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    }
  }
  
  trait I2CFuncs extends StObject {
    
    var i2c: Boolean
    
    var protocolMangling: Boolean
    
    var smbusBlockProcCall: Boolean
    
    var smbusPec: Boolean
    
    var smbusProcCall: Boolean
    
    var smbusQuick: Boolean
    
    var smbusReadBlock: Boolean
    
    var smbusReadByte: Boolean
    
    var smbusReadI2cBlock: Boolean
    
    var smbusReadWord: Boolean
    
    var smbusReceiveByte: Boolean
    
    var smbusSendByte: Boolean
    
    var smbusWriteBlock: Boolean
    
    var smbusWriteByte: Boolean
    
    var smbusWriteI2cBlock: Boolean
    
    var smbusWriteWord: Boolean
    
    var tenBitAddr: Boolean
  }
  object I2CFuncs {
    
    inline def apply(
      i2c: Boolean,
      protocolMangling: Boolean,
      smbusBlockProcCall: Boolean,
      smbusPec: Boolean,
      smbusProcCall: Boolean,
      smbusQuick: Boolean,
      smbusReadBlock: Boolean,
      smbusReadByte: Boolean,
      smbusReadI2cBlock: Boolean,
      smbusReadWord: Boolean,
      smbusReceiveByte: Boolean,
      smbusSendByte: Boolean,
      smbusWriteBlock: Boolean,
      smbusWriteByte: Boolean,
      smbusWriteI2cBlock: Boolean,
      smbusWriteWord: Boolean,
      tenBitAddr: Boolean
    ): I2CFuncs = {
      val __obj = js.Dynamic.literal(i2c = i2c.asInstanceOf[js.Any], protocolMangling = protocolMangling.asInstanceOf[js.Any], smbusBlockProcCall = smbusBlockProcCall.asInstanceOf[js.Any], smbusPec = smbusPec.asInstanceOf[js.Any], smbusProcCall = smbusProcCall.asInstanceOf[js.Any], smbusQuick = smbusQuick.asInstanceOf[js.Any], smbusReadBlock = smbusReadBlock.asInstanceOf[js.Any], smbusReadByte = smbusReadByte.asInstanceOf[js.Any], smbusReadI2cBlock = smbusReadI2cBlock.asInstanceOf[js.Any], smbusReadWord = smbusReadWord.asInstanceOf[js.Any], smbusReceiveByte = smbusReceiveByte.asInstanceOf[js.Any], smbusSendByte = smbusSendByte.asInstanceOf[js.Any], smbusWriteBlock = smbusWriteBlock.asInstanceOf[js.Any], smbusWriteByte = smbusWriteByte.asInstanceOf[js.Any], smbusWriteI2cBlock = smbusWriteI2cBlock.asInstanceOf[js.Any], smbusWriteWord = smbusWriteWord.asInstanceOf[js.Any], tenBitAddr = tenBitAddr.asInstanceOf[js.Any])
      __obj.asInstanceOf[I2CFuncs]
    }
    
    extension [Self <: I2CFuncs](x: Self) {
      
      inline def setI2c(value: Boolean): Self = StObject.set(x, "i2c", value.asInstanceOf[js.Any])
      
      inline def setProtocolMangling(value: Boolean): Self = StObject.set(x, "protocolMangling", value.asInstanceOf[js.Any])
      
      inline def setSmbusBlockProcCall(value: Boolean): Self = StObject.set(x, "smbusBlockProcCall", value.asInstanceOf[js.Any])
      
      inline def setSmbusPec(value: Boolean): Self = StObject.set(x, "smbusPec", value.asInstanceOf[js.Any])
      
      inline def setSmbusProcCall(value: Boolean): Self = StObject.set(x, "smbusProcCall", value.asInstanceOf[js.Any])
      
      inline def setSmbusQuick(value: Boolean): Self = StObject.set(x, "smbusQuick", value.asInstanceOf[js.Any])
      
      inline def setSmbusReadBlock(value: Boolean): Self = StObject.set(x, "smbusReadBlock", value.asInstanceOf[js.Any])
      
      inline def setSmbusReadByte(value: Boolean): Self = StObject.set(x, "smbusReadByte", value.asInstanceOf[js.Any])
      
      inline def setSmbusReadI2cBlock(value: Boolean): Self = StObject.set(x, "smbusReadI2cBlock", value.asInstanceOf[js.Any])
      
      inline def setSmbusReadWord(value: Boolean): Self = StObject.set(x, "smbusReadWord", value.asInstanceOf[js.Any])
      
      inline def setSmbusReceiveByte(value: Boolean): Self = StObject.set(x, "smbusReceiveByte", value.asInstanceOf[js.Any])
      
      inline def setSmbusSendByte(value: Boolean): Self = StObject.set(x, "smbusSendByte", value.asInstanceOf[js.Any])
      
      inline def setSmbusWriteBlock(value: Boolean): Self = StObject.set(x, "smbusWriteBlock", value.asInstanceOf[js.Any])
      
      inline def setSmbusWriteByte(value: Boolean): Self = StObject.set(x, "smbusWriteByte", value.asInstanceOf[js.Any])
      
      inline def setSmbusWriteI2cBlock(value: Boolean): Self = StObject.set(x, "smbusWriteI2cBlock", value.asInstanceOf[js.Any])
      
      inline def setSmbusWriteWord(value: Boolean): Self = StObject.set(x, "smbusWriteWord", value.asInstanceOf[js.Any])
      
      inline def setTenBitAddr(value: Boolean): Self = StObject.set(x, "tenBitAddr", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenOptions extends StObject {
    
    /** A boolean value specifying whether access to devices on the I2C bus should be allowed even if they are already in use by a kernel driver/module. Corresponds to I2C_SLAVE_FORCE on Linux. The valid values for forceAccess are true and false. Optional, the default value is false. */
    var forceAccess: Boolean
  }
  object OpenOptions {
    
    inline def apply(forceAccess: Boolean): OpenOptions = {
      val __obj = js.Dynamic.literal(forceAccess = forceAccess.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenOptions]
    }
    
    extension [Self <: OpenOptions](x: Self) {
      
      inline def setForceAccess(value: Boolean): Self = StObject.set(x, "forceAccess", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PromisifiedBus extends StObject {
    
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
  
  type ResultCallback[T] = js.Function2[/* error */ Any, /* result */ T, Any]
}
