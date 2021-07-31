package typings.gtmetrix

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.anon.Data
import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.IterableIterator
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<gtmetrix.gtmetrix.AccountStatus> */
  trait ReadonlyAccountStatus extends StObject {
    
    val api_credits: Double
    
    val api_refill: Double
  }
  object ReadonlyAccountStatus {
    
    @scala.inline
    def apply(api_credits: Double, api_refill: Double): ReadonlyAccountStatus = {
      val __obj = js.Dynamic.literal(api_credits = api_credits.asInstanceOf[js.Any], api_refill = api_refill.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyAccountStatus]
    }
    
    @scala.inline
    implicit class ReadonlyAccountStatusMutableBuilder[Self <: ReadonlyAccountStatus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi_credits(value: Double): Self = StObject.set(x, "api_credits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_refill(value: Double): Self = StObject.set(x, "api_refill", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<gtmetrix.gtmetrix.BrowserFeatures> */
  trait ReadonlyBrowserFeatures extends StObject {
    
    val browser: String
    
    val device: js.UndefOr[String] = js.undefined
    
    val features: StringDictionary[Boolean]
    
    val id: Double
    
    val name: String
    
    val platform: String
  }
  object ReadonlyBrowserFeatures {
    
    @scala.inline
    def apply(browser: String, features: StringDictionary[Boolean], id: Double, name: String, platform: String): ReadonlyBrowserFeatures = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyBrowserFeatures]
    }
    
    @scala.inline
    implicit class ReadonlyBrowserFeaturesMutableBuilder[Self <: ReadonlyBrowserFeatures] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      @scala.inline
      def setFeatures(value: StringDictionary[Boolean]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<node.Buffer> */
  trait ReadonlyBuffer extends StObject {
    
    val BYTES_PER_ELEMENT: Double
    
    val buffer: ArrayBufferLike
    
    val byteLength: Double
    
    val byteOffset: Double
    
    def compare(otherBuffer: Uint8Array): Double
    
    def copy(targetBuffer: Uint8Array): Double
    
    def copyWithin(target: Double, start: Double): this.type
    
    def entries(): IterableIterator[js.Tuple2[Double, Double]]
    
    def equals(otherBuffer: Uint8Array): Boolean
    
    def every(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, js.Any]): Boolean
    
    def fill(value: String): this.type
    
    def filter(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, js.Any]): Uint8Array
    
    def find(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): js.UndefOr[Double]
    
    def findIndex(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): Double
    
    def forEach(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Unit]): Unit
    
    def includes(value: String): Boolean
    
    def indexOf(value: String): Double
    
    def join(): String
    
    def keys(): IterableIterator[Double]
    
    def lastIndexOf(value: String): Double
    
    val length: Double
    
    def map(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Double]): Uint8Array
    
    def readBigInt64BE(): js.BigInt
    
    def readBigInt64LE(): js.BigInt
    
    def readBigUInt64BE(): js.BigInt
    
    def readBigUInt64LE(): js.BigInt
    
    def readDoubleBE(): Double
    
    def readDoubleLE(): Double
    
    def readFloatBE(): Double
    
    def readFloatLE(): Double
    
    def readInt16BE(): Double
    
    def readInt16LE(): Double
    
    def readInt32BE(): Double
    
    def readInt32LE(): Double
    
    def readInt8(): Double
    
    def readIntBE(offset: Double, byteLength: Double): Double
    
    def readIntLE(offset: Double, byteLength: Double): Double
    
    def readUInt16BE(): Double
    
    def readUInt16LE(): Double
    
    def readUInt32BE(): Double
    
    def readUInt32LE(): Double
    
    def readUInt8(): Double
    
    def readUIntBE(offset: Double, byteLength: Double): Double
    
    def readUIntLE(offset: Double, byteLength: Double): Double
    
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ this.type, 
          Double
        ]
    ): Double
    
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ this.type, 
          Double
        ]
    ): Double
    
    def reverse(): this.type
    
    def set(array: ArrayLike[Double]): Unit
    
    def slice(): Buffer
    
    def some(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, js.Any]): Boolean
    
    def sort(): this.type
    
    def subarray(): Buffer
    
    def swap16(): Buffer
    
    def swap32(): Buffer
    
    def swap64(): Buffer
    
    def toJSON(): Data
    
    def values(): IterableIterator[Double]
    
    def write(string: String): Double
    
    def writeBigInt64BE(value: js.BigInt): Double
    
    def writeBigInt64LE(value: js.BigInt): Double
    
    def writeBigUInt64BE(value: js.BigInt): Double
    
    def writeBigUInt64LE(value: js.BigInt): Double
    
    def writeDoubleBE(value: Double): Double
    
    def writeDoubleLE(value: Double): Double
    
    def writeFloatBE(value: Double): Double
    
    def writeFloatLE(value: Double): Double
    
    def writeInt16BE(value: Double): Double
    
    def writeInt16LE(value: Double): Double
    
    def writeInt32BE(value: Double): Double
    
    def writeInt32LE(value: Double): Double
    
    def writeInt8(value: Double): Double
    
    def writeIntBE(value: Double, offset: Double, byteLength: Double): Double
    
    def writeIntLE(value: Double, offset: Double, byteLength: Double): Double
    
    def writeUInt16BE(value: Double): Double
    
    def writeUInt16LE(value: Double): Double
    
    def writeUInt32BE(value: Double): Double
    
    def writeUInt32LE(value: Double): Double
    
    def writeUInt8(value: Double): Double
    
    def writeUIntBE(value: Double, offset: Double, byteLength: Double): Double
    
    def writeUIntLE(value: Double, offset: Double, byteLength: Double): Double
  }
  object ReadonlyBuffer {
    
    @scala.inline
    def apply(
      BYTES_PER_ELEMENT: Double,
      buffer: ArrayBufferLike,
      byteLength: Double,
      byteOffset: Double,
      compare: Uint8Array => Double,
      copy: Uint8Array => Double,
      copyWithin: (Double, Double) => ReadonlyBuffer,
      entries: () => IterableIterator[js.Tuple2[Double, Double]],
      equals_ : Uint8Array => Boolean,
      every: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, js.Any] => Boolean,
      fill: String => ReadonlyBuffer,
      filter: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, js.Any] => Uint8Array,
      find: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Boolean] => js.UndefOr[Double],
      findIndex: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Boolean] => Double,
      forEach: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Unit] => Unit,
      includes: String => Boolean,
      indexOf: String => Double,
      join: () => String,
      keys: () => IterableIterator[Double],
      lastIndexOf: String => Double,
      length: Double,
      map: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Double] => Uint8Array,
      readBigInt64BE: () => js.BigInt,
      readBigInt64LE: () => js.BigInt,
      readBigUInt64BE: () => js.BigInt,
      readBigUInt64LE: () => js.BigInt,
      readDoubleBE: () => Double,
      readDoubleLE: () => Double,
      readFloatBE: () => Double,
      readFloatLE: () => Double,
      readInt16BE: () => Double,
      readInt16LE: () => Double,
      readInt32BE: () => Double,
      readInt32LE: () => Double,
      readInt8: () => Double,
      readIntBE: (Double, Double) => Double,
      readIntLE: (Double, Double) => Double,
      readUInt16BE: () => Double,
      readUInt16LE: () => Double,
      readUInt32BE: () => Double,
      readUInt32LE: () => Double,
      readUInt8: () => Double,
      readUIntBE: (Double, Double) => Double,
      readUIntLE: (Double, Double) => Double,
      reduce: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          ReadonlyBuffer, 
          Double
        ] => Double,
      reduceRight: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          ReadonlyBuffer, 
          Double
        ] => Double,
      reverse: () => ReadonlyBuffer,
      set: ArrayLike[Double] => Unit,
      slice: () => Buffer,
      some: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, js.Any] => Boolean,
      sort: () => ReadonlyBuffer,
      subarray: () => Buffer,
      swap16: () => Buffer,
      swap32: () => Buffer,
      swap64: () => Buffer,
      toJSON: () => Data,
      values: () => IterableIterator[Double],
      write: String => Double,
      writeBigInt64BE: js.BigInt => Double,
      writeBigInt64LE: js.BigInt => Double,
      writeBigUInt64BE: js.BigInt => Double,
      writeBigUInt64LE: js.BigInt => Double,
      writeDoubleBE: Double => Double,
      writeDoubleLE: Double => Double,
      writeFloatBE: Double => Double,
      writeFloatLE: Double => Double,
      writeInt16BE: Double => Double,
      writeInt16LE: Double => Double,
      writeInt32BE: Double => Double,
      writeInt32LE: Double => Double,
      writeInt8: Double => Double,
      writeIntBE: (Double, Double, Double) => Double,
      writeIntLE: (Double, Double, Double) => Double,
      writeUInt16BE: Double => Double,
      writeUInt16LE: Double => Double,
      writeUInt32BE: Double => Double,
      writeUInt32LE: Double => Double,
      writeUInt8: Double => Double,
      writeUIntBE: (Double, Double, Double) => Double,
      writeUIntLE: (Double, Double, Double) => Double
    ): ReadonlyBuffer = {
      val __obj = js.Dynamic.literal(BYTES_PER_ELEMENT = BYTES_PER_ELEMENT.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any], compare = js.Any.fromFunction1(compare), copy = js.Any.fromFunction1(copy), copyWithin = js.Any.fromFunction2(copyWithin), entries = js.Any.fromFunction0(entries), every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), readBigInt64BE = js.Any.fromFunction0(readBigInt64BE), readBigInt64LE = js.Any.fromFunction0(readBigInt64LE), readBigUInt64BE = js.Any.fromFunction0(readBigUInt64BE), readBigUInt64LE = js.Any.fromFunction0(readBigUInt64LE), readDoubleBE = js.Any.fromFunction0(readDoubleBE), readDoubleLE = js.Any.fromFunction0(readDoubleLE), readFloatBE = js.Any.fromFunction0(readFloatBE), readFloatLE = js.Any.fromFunction0(readFloatLE), readInt16BE = js.Any.fromFunction0(readInt16BE), readInt16LE = js.Any.fromFunction0(readInt16LE), readInt32BE = js.Any.fromFunction0(readInt32BE), readInt32LE = js.Any.fromFunction0(readInt32LE), readInt8 = js.Any.fromFunction0(readInt8), readIntBE = js.Any.fromFunction2(readIntBE), readIntLE = js.Any.fromFunction2(readIntLE), readUInt16BE = js.Any.fromFunction0(readUInt16BE), readUInt16LE = js.Any.fromFunction0(readUInt16LE), readUInt32BE = js.Any.fromFunction0(readUInt32BE), readUInt32LE = js.Any.fromFunction0(readUInt32LE), readUInt8 = js.Any.fromFunction0(readUInt8), readUIntBE = js.Any.fromFunction2(readUIntBE), readUIntLE = js.Any.fromFunction2(readUIntLE), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = js.Any.fromFunction0(reverse), set = js.Any.fromFunction1(set), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction0(sort), subarray = js.Any.fromFunction0(subarray), swap16 = js.Any.fromFunction0(swap16), swap32 = js.Any.fromFunction0(swap32), swap64 = js.Any.fromFunction0(swap64), toJSON = js.Any.fromFunction0(toJSON), values = js.Any.fromFunction0(values), write = js.Any.fromFunction1(write), writeBigInt64BE = js.Any.fromFunction1(writeBigInt64BE), writeBigInt64LE = js.Any.fromFunction1(writeBigInt64LE), writeBigUInt64BE = js.Any.fromFunction1(writeBigUInt64BE), writeBigUInt64LE = js.Any.fromFunction1(writeBigUInt64LE), writeDoubleBE = js.Any.fromFunction1(writeDoubleBE), writeDoubleLE = js.Any.fromFunction1(writeDoubleLE), writeFloatBE = js.Any.fromFunction1(writeFloatBE), writeFloatLE = js.Any.fromFunction1(writeFloatLE), writeInt16BE = js.Any.fromFunction1(writeInt16BE), writeInt16LE = js.Any.fromFunction1(writeInt16LE), writeInt32BE = js.Any.fromFunction1(writeInt32BE), writeInt32LE = js.Any.fromFunction1(writeInt32LE), writeInt8 = js.Any.fromFunction1(writeInt8), writeIntBE = js.Any.fromFunction3(writeIntBE), writeIntLE = js.Any.fromFunction3(writeIntLE), writeUInt16BE = js.Any.fromFunction1(writeUInt16BE), writeUInt16LE = js.Any.fromFunction1(writeUInt16LE), writeUInt32BE = js.Any.fromFunction1(writeUInt32BE), writeUInt32LE = js.Any.fromFunction1(writeUInt32LE), writeUInt8 = js.Any.fromFunction1(writeUInt8), writeUIntBE = js.Any.fromFunction3(writeUIntBE), writeUIntLE = js.Any.fromFunction3(writeUIntLE))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[ReadonlyBuffer]
    }
    
    @scala.inline
    implicit class ReadonlyBufferMutableBuilder[Self <: ReadonlyBuffer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBYTES_PER_ELEMENT(value: Double): Self = StObject.set(x, "BYTES_PER_ELEMENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuffer(value: ArrayBufferLike): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompare(value: Uint8Array => Double): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCopy(value: Uint8Array => Double): Self = StObject.set(x, "copy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCopyWithin(value: (Double, Double) => ReadonlyBuffer): Self = StObject.set(x, "copyWithin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEntries(value: () => IterableIterator[js.Tuple2[Double, Double]]): Self = StObject.set(x, "entries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEquals_(value: Uint8Array => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEvery(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, js.Any] => Boolean): Self = StObject.set(x, "every", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFill(value: String => ReadonlyBuffer): Self = StObject.set(x, "fill", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilter(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, js.Any] => Uint8Array): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFind(
        value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Boolean] => js.UndefOr[Double]
      ): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFindIndex(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Boolean] => Double): Self = StObject.set(x, "findIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForEach(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIncludes(value: String => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIndexOf(value: String => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setJoin(value: () => String): Self = StObject.set(x, "join", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKeys(value: () => IterableIterator[Double]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLastIndexOf(value: String => Double): Self = StObject.set(x, "lastIndexOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Double] => Uint8Array): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadBigInt64BE(value: () => js.BigInt): Self = StObject.set(x, "readBigInt64BE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadBigInt64LE(value: () => js.BigInt): Self = StObject.set(x, "readBigInt64LE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadBigUInt64BE(value: () => js.BigInt): Self = StObject.set(x, "readBigUInt64BE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadBigUInt64LE(value: () => js.BigInt): Self = StObject.set(x, "readBigUInt64LE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadDoubleBE(value: () => Double): Self = StObject.set(x, "readDoubleBE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadDoubleLE(value: () => Double): Self = StObject.set(x, "readDoubleLE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadFloatBE(value: () => Double): Self = StObject.set(x, "readFloatBE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadFloatLE(value: () => Double): Self = StObject.set(x, "readFloatLE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadInt16BE(value: () => Double): Self = StObject.set(x, "readInt16BE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadInt16LE(value: () => Double): Self = StObject.set(x, "readInt16LE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadInt32BE(value: () => Double): Self = StObject.set(x, "readInt32BE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadInt32LE(value: () => Double): Self = StObject.set(x, "readInt32LE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadInt8(value: () => Double): Self = StObject.set(x, "readInt8", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadIntBE(value: (Double, Double) => Double): Self = StObject.set(x, "readIntBE", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReadIntLE(value: (Double, Double) => Double): Self = StObject.set(x, "readIntLE", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReadUInt16BE(value: () => Double): Self = StObject.set(x, "readUInt16BE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadUInt16LE(value: () => Double): Self = StObject.set(x, "readUInt16LE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadUInt32BE(value: () => Double): Self = StObject.set(x, "readUInt32BE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadUInt32LE(value: () => Double): Self = StObject.set(x, "readUInt32LE", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadUInt8(value: () => Double): Self = StObject.set(x, "readUInt8", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReadUIntBE(value: (Double, Double) => Double): Self = StObject.set(x, "readUIntBE", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReadUIntLE(value: (Double, Double) => Double): Self = StObject.set(x, "readUIntLE", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReduce(
        value: js.Function4[
              /* previousValue */ Double, 
              /* currentValue */ Double, 
              /* currentIndex */ Double, 
              ReadonlyBuffer, 
              Double
            ] => Double
      ): Self = StObject.set(x, "reduce", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReduceRight(
        value: js.Function4[
              /* previousValue */ Double, 
              /* currentValue */ Double, 
              /* currentIndex */ Double, 
              ReadonlyBuffer, 
              Double
            ] => Double
      ): Self = StObject.set(x, "reduceRight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReverse(value: () => ReadonlyBuffer): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSet(value: ArrayLike[Double] => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSlice(value: () => Buffer): Self = StObject.set(x, "slice", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSome(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, js.Any] => Boolean): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSort(value: () => ReadonlyBuffer): Self = StObject.set(x, "sort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSubarray(value: () => Buffer): Self = StObject.set(x, "subarray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSwap16(value: () => Buffer): Self = StObject.set(x, "swap16", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSwap32(value: () => Buffer): Self = StObject.set(x, "swap32", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSwap64(value: () => Buffer): Self = StObject.set(x, "swap64", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToJSON(value: () => Data): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValues(value: () => IterableIterator[Double]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWrite(value: String => Double): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteBigInt64BE(value: js.BigInt => Double): Self = StObject.set(x, "writeBigInt64BE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteBigInt64LE(value: js.BigInt => Double): Self = StObject.set(x, "writeBigInt64LE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteBigUInt64BE(value: js.BigInt => Double): Self = StObject.set(x, "writeBigUInt64BE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteBigUInt64LE(value: js.BigInt => Double): Self = StObject.set(x, "writeBigUInt64LE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteDoubleBE(value: Double => Double): Self = StObject.set(x, "writeDoubleBE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteDoubleLE(value: Double => Double): Self = StObject.set(x, "writeDoubleLE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteFloatBE(value: Double => Double): Self = StObject.set(x, "writeFloatBE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteFloatLE(value: Double => Double): Self = StObject.set(x, "writeFloatLE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteInt16BE(value: Double => Double): Self = StObject.set(x, "writeInt16BE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteInt16LE(value: Double => Double): Self = StObject.set(x, "writeInt16LE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteInt32BE(value: Double => Double): Self = StObject.set(x, "writeInt32BE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteInt32LE(value: Double => Double): Self = StObject.set(x, "writeInt32LE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteInt8(value: Double => Double): Self = StObject.set(x, "writeInt8", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteIntBE(value: (Double, Double, Double) => Double): Self = StObject.set(x, "writeIntBE", js.Any.fromFunction3(value))
      
      @scala.inline
      def setWriteIntLE(value: (Double, Double, Double) => Double): Self = StObject.set(x, "writeIntLE", js.Any.fromFunction3(value))
      
      @scala.inline
      def setWriteUInt16BE(value: Double => Double): Self = StObject.set(x, "writeUInt16BE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteUInt16LE(value: Double => Double): Self = StObject.set(x, "writeUInt16LE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteUInt32BE(value: Double => Double): Self = StObject.set(x, "writeUInt32BE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteUInt32LE(value: Double => Double): Self = StObject.set(x, "writeUInt32LE", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteUInt8(value: Double => Double): Self = StObject.set(x, "writeUInt8", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWriteUIntBE(value: (Double, Double, Double) => Double): Self = StObject.set(x, "writeUIntBE", js.Any.fromFunction3(value))
      
      @scala.inline
      def setWriteUIntLE(value: (Double, Double, Double) => Double): Self = StObject.set(x, "writeUIntLE", js.Any.fromFunction3(value))
    }
  }
  
  /* Inlined std.Readonly<gtmetrix.gtmetrix.TestBasicInfo> */
  trait ReadonlyTestBasicInfo extends StObject {
    
    val credits_left: Double
    
    val poll_state_url: String
    
    val test_id: String
  }
  object ReadonlyTestBasicInfo {
    
    @scala.inline
    def apply(credits_left: Double, poll_state_url: String, test_id: String): ReadonlyTestBasicInfo = {
      val __obj = js.Dynamic.literal(credits_left = credits_left.asInstanceOf[js.Any], poll_state_url = poll_state_url.asInstanceOf[js.Any], test_id = test_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyTestBasicInfo]
    }
    
    @scala.inline
    implicit class ReadonlyTestBasicInfoMutableBuilder[Self <: ReadonlyTestBasicInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredits_left(value: Double): Self = StObject.set(x, "credits_left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoll_state_url(value: String): Self = StObject.set(x, "poll_state_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTest_id(value: String): Self = StObject.set(x, "test_id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<gtmetrix.gtmetrix.TestDetails> */
  trait ReadonlyTestDetails extends StObject {
    
    val error: js.UndefOr[String] = js.undefined
    
    val resources: StringDictionary[String]
    
    val results: StringDictionary[js.Any]
    
    val state: String
  }
  object ReadonlyTestDetails {
    
    @scala.inline
    def apply(resources: StringDictionary[String], results: StringDictionary[js.Any], state: String): ReadonlyTestDetails = {
      val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadonlyTestDetails]
    }
    
    @scala.inline
    implicit class ReadonlyTestDetailsMutableBuilder[Self <: ReadonlyTestDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setResources(value: StringDictionary[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResults(value: StringDictionary[js.Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
