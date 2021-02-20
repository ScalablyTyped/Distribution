package typings.j5IoTypes

import org.scalablytyped.runtime.NumberDictionary
import typings.j5IoTypes.j5IoTypesNumbers.`110`
import typings.j5IoTypes.j5IoTypesNumbers.`115200`
import typings.j5IoTypes.j5IoTypesNumbers.`1200`
import typings.j5IoTypes.j5IoTypesNumbers.`134`
import typings.j5IoTypes.j5IoTypesNumbers.`150`
import typings.j5IoTypes.j5IoTypesNumbers.`1800`
import typings.j5IoTypes.j5IoTypesNumbers.`19200`
import typings.j5IoTypes.j5IoTypesNumbers.`1`
import typings.j5IoTypes.j5IoTypesNumbers.`200`
import typings.j5IoTypes.j5IoTypesNumbers.`2400`
import typings.j5IoTypes.j5IoTypesNumbers.`2`
import typings.j5IoTypes.j5IoTypesNumbers.`300`
import typings.j5IoTypes.j5IoTypesNumbers.`38400`
import typings.j5IoTypes.j5IoTypesNumbers.`4800`
import typings.j5IoTypes.j5IoTypesNumbers.`50`
import typings.j5IoTypes.j5IoTypesNumbers.`57600`
import typings.j5IoTypes.j5IoTypesNumbers.`5`
import typings.j5IoTypes.j5IoTypesNumbers.`600`
import typings.j5IoTypes.j5IoTypesNumbers.`6`
import typings.j5IoTypes.j5IoTypesNumbers.`75`
import typings.j5IoTypes.j5IoTypesNumbers.`7`
import typings.j5IoTypes.j5IoTypesNumbers.`8`
import typings.j5IoTypes.j5IoTypesNumbers.`9600`
import typings.j5IoTypes.j5IoTypesStrings.even
import typings.j5IoTypes.j5IoTypesStrings.mark
import typings.j5IoTypes.j5IoTypesStrings.none
import typings.j5IoTypes.j5IoTypesStrings.odd
import typings.j5IoTypes.j5IoTypesStrings.space
import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  sealed trait PeripheralType extends StObject
  @JSImport("j5-io-types", "PeripheralType")
  @js.native
  object PeripheralType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PeripheralType with String] = js.native
    
    @js.native
    sealed trait GPIO extends PeripheralType
    /* "gpio" */ val GPIO: typings.j5IoTypes.mod.PeripheralType.GPIO with String = js.native
    
    @js.native
    sealed trait I2C extends PeripheralType
    /* "i2c" */ val I2C: typings.j5IoTypes.mod.PeripheralType.I2C with String = js.native
    
    @js.native
    sealed trait PWM extends PeripheralType
    /* "pwm" */ val PWM: typings.j5IoTypes.mod.PeripheralType.PWM with String = js.native
    
    @js.native
    sealed trait SPI extends PeripheralType
    /* "spi" */ val SPI: typings.j5IoTypes.mod.PeripheralType.SPI with String = js.native
    
    @js.native
    sealed trait UART extends PeripheralType
    /* "uart" */ val UART: typings.j5IoTypes.mod.PeripheralType.UART with String = js.native
  }
  
  @js.native
  sealed trait Value extends StObject
  @JSImport("j5-io-types", "Value")
  @js.native
  object Value extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Value with Double] = js.native
    
    @js.native
    sealed trait HIGH extends Value
    /* 1 */ val HIGH: typings.j5IoTypes.mod.Value.HIGH with Double = js.native
    
    @js.native
    sealed trait LOW extends Value
    /* 0 */ val LOW: typings.j5IoTypes.mod.Value.LOW with Double = js.native
  }
  
  type I2CReadBufferCallback = js.Function2[/* err */ Null | Error | String, /* data */ Null | Buffer, Unit]
  
  type I2CReadNumberCallback = js.Function2[/* err */ Null | Error | String, /* data */ Null | Double, Unit]
  
  type I2CWriteCallback = js.Function1[/* err */ Null | Error | String, Unit]
  
  @js.native
  trait IBaseModule extends StObject {
    
    def getActivePeripheral(pin: Double): js.UndefOr[IPeripheral] = js.native
    
    def getActivePeripherals(): NumberDictionary[IPeripheral] = js.native
    
    def getPinNumber(alias: String): Double | Null = js.native
    def getPinNumber(alias: Double): Double | Null = js.native
    
    def init(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    
    def setActivePeripheral(pin: Double, peripheral: IPeripheral): Unit = js.native
  }
  
  @js.native
  trait IDigitalInput extends IPeripheral {
    
    val pullResistor: Double = js.native
    
    def read(): Double = js.native
    
    val value: Value = js.native
  }
  
  @js.native
  trait IDigitalOutput extends IPeripheral {
    
    val value: Double = js.native
    
    def write(value: Value): Unit = js.native
  }
  
  @js.native
  trait IGPIOConfig extends StObject {
    
    var pin: Double | String = js.native
    
    var pullResistor: js.UndefOr[Double] = js.native
  }
  object IGPIOConfig {
    
    @scala.inline
    def apply(pin: Double | String): IGPIOConfig = {
      val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGPIOConfig]
    }
    
    @scala.inline
    implicit class IGPIOConfigMutableBuilder[Self <: IGPIOConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullResistor(value: Double): Self = StObject.set(x, "pullResistor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullResistorUndefined: Self = StObject.set(x, "pullResistor", js.undefined)
    }
  }
  
  @js.native
  trait IGPIOModule extends StObject {
    
    var PULL_DOWN: Double = js.native
    
    var PULL_NONE: Double = js.native
    
    var PULL_UP: Double = js.native
    
    def createDigitalInput(config: String): IDigitalInput = js.native
    def createDigitalInput(config: Double): IDigitalInput = js.native
    def createDigitalInput(config: IGPIOConfig): IDigitalInput = js.native
    
    def createDigitalOutput(config: String): IDigitalOutput = js.native
    def createDigitalOutput(config: Double): IDigitalOutput = js.native
    def createDigitalOutput(config: IGPIOConfig): IDigitalOutput = js.native
  }
  
  @js.native
  trait II2C extends IPeripheral {
    
    def read(address: Double, length: Double, cb: I2CReadBufferCallback): Unit = js.native
    def read(address: Double, register: Double, length: Double, cb: I2CReadBufferCallback): Unit = js.native
    
    def readByte(address: Double, cb: I2CReadNumberCallback): Unit = js.native
    def readByte(address: Double, register: Double, cb: I2CReadNumberCallback): Unit = js.native
    
    def readByteSync(address: Double): Double = js.native
    def readByteSync(address: Double, register: Double): Double = js.native
    
    def readSync(address: Double): Buffer = js.native
    def readSync(address: Double, registerOrLength: js.UndefOr[scala.Nothing], length: Double): Buffer = js.native
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
  
  @js.native
  trait II2CModule extends StObject {
    
    def createI2C(portId: String): II2C = js.native
    def createI2C(portId: Double): II2C = js.native
  }
  
  @js.native
  trait ILED extends IPeripheral {
    
    def hasLed(): Boolean = js.native
    
    def read(): Value = js.native
    
    def write(value: Value): Unit = js.native
  }
  
  @js.native
  trait ILEDModule extends StObject {
    
    def createLED(): ILED = js.native
  }
  object ILEDModule {
    
    @scala.inline
    def apply(createLED: () => ILED): ILEDModule = {
      val __obj = js.Dynamic.literal(createLED = js.Any.fromFunction0(createLED))
      __obj.asInstanceOf[ILEDModule]
    }
    
    @scala.inline
    implicit class ILEDModuleMutableBuilder[Self <: ILEDModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateLED(value: () => ILED): Self = StObject.set(x, "createLED", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IPWM extends IPeripheral {
    
    val dutyCycle: Double = js.native
    
    val frequency: Double = js.native
    
    val range: Double = js.native
    
    def write(dutyCycle: Double): Unit = js.native
  }
  
  @js.native
  trait IPWMConfig extends StObject {
    
    var frequency: js.UndefOr[Double] = js.native
    
    var pin: Double | String = js.native
    
    var range: js.UndefOr[Double] = js.native
  }
  object IPWMConfig {
    
    @scala.inline
    def apply(pin: Double | String): IPWMConfig = {
      val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPWMConfig]
    }
    
    @scala.inline
    implicit class IPWMConfigMutableBuilder[Self <: IPWMConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
      
      @scala.inline
      def setPin(value: Double | String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
  
  @js.native
  trait IPWMModule extends StObject {
    
    def createPWM(config: String): IPWM = js.native
    def createPWM(config: Double): IPWM = js.native
    def createPWM(config: IPWMConfig): IPWM = js.native
  }
  
  @js.native
  trait IPeripheral extends EventEmitter {
    
    val alive: Boolean = js.native
    
    def destroy(): Unit = js.native
    
    val pins: js.Array[Double] = js.native
    
    def validateAlive(): Unit = js.native
  }
  
  @js.native
  trait IPinInfo extends StObject {
    
    var peripherals: js.Array[PeripheralType] = js.native
    
    var pins: js.Array[String] = js.native
  }
  object IPinInfo {
    
    @scala.inline
    def apply(peripherals: js.Array[PeripheralType], pins: js.Array[String]): IPinInfo = {
      val __obj = js.Dynamic.literal(peripherals = peripherals.asInstanceOf[js.Any], pins = pins.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPinInfo]
    }
    
    @scala.inline
    implicit class IPinInfoMutableBuilder[Self <: IPinInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPeripherals(value: js.Array[PeripheralType]): Self = StObject.set(x, "peripherals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeripheralsVarargs(value: PeripheralType*): Self = StObject.set(x, "peripherals", js.Array(value :_*))
      
      @scala.inline
      def setPins(value: js.Array[String]): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPinsVarargs(value: String*): Self = StObject.set(x, "pins", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ISerial extends IPeripheral {
    
    val baudRate: Double = js.native
    
    def close(): Unit = js.native
    def close(cb: SerialErrorCallback): Unit = js.native
    
    val dataBits: Double = js.native
    
    def flush(): Unit = js.native
    def flush(cb: SerialErrorCallback): Unit = js.native
    
    def open(): Unit = js.native
    def open(cb: SerialCallback): Unit = js.native
    
    val parity: String = js.native
    
    val port: String = js.native
    
    val stopBits: Double = js.native
    
    def write(data: String): Unit = js.native
    def write(data: String, cb: SerialCallback): Unit = js.native
    def write(data: Buffer): Unit = js.native
    def write(data: Buffer, cb: SerialCallback): Unit = js.native
  }
  
  @js.native
  trait ISerialModule extends StObject {
    
    def createSerial(): ISerial = js.native
    def createSerial(options: ISerialOptions): ISerial = js.native
  }
  
  @js.native
  trait ISerialOptions extends StObject {
    
    var baudRate: js.UndefOr[
        `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
      ] = js.native
    
    var dataBits: js.UndefOr[`8` | `7` | `6` | `5`] = js.native
    
    var parity: js.UndefOr[none | even | mark | odd | space] = js.native
    
    var portId: js.UndefOr[String] = js.native
    
    var stopBits: js.UndefOr[`1` | `2`] = js.native
  }
  object ISerialOptions {
    
    @scala.inline
    def apply(): ISerialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISerialOptions]
    }
    
    @scala.inline
    implicit class ISerialOptionsMutableBuilder[Self <: ISerialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaudRate(
        value: `115200` | `57600` | `38400` | `19200` | `9600` | `4800` | `2400` | `1800` | `1200` | `600` | `300` | `200` | `150` | `134` | `110` | `75` | `50` | Double
      ): Self = StObject.set(x, "baudRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaudRateUndefined: Self = StObject.set(x, "baudRate", js.undefined)
      
      @scala.inline
      def setDataBits(value: `8` | `7` | `6` | `5`): Self = StObject.set(x, "dataBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataBitsUndefined: Self = StObject.set(x, "dataBits", js.undefined)
      
      @scala.inline
      def setParity(value: none | even | mark | odd | space): Self = StObject.set(x, "parity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParityUndefined: Self = StObject.set(x, "parity", js.undefined)
      
      @scala.inline
      def setPortId(value: String): Self = StObject.set(x, "portId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortIdUndefined: Self = StObject.set(x, "portId", js.undefined)
      
      @scala.inline
      def setStopBits(value: `1` | `2`): Self = StObject.set(x, "stopBits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopBitsUndefined: Self = StObject.set(x, "stopBits", js.undefined)
    }
  }
  
  type SerialCallback = js.Function0[Unit]
  
  type SerialErrorCallback = js.Function1[/* err */ js.UndefOr[Error | String], Unit]
}
