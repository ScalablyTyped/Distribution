package typings.gtmetrix.anon

import typings.node.Buffer
import typings.node.anon.Data
import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.IterableIterator
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<node.Buffer> */
trait ReadonlyBuffer extends js.Object {
  val BYTES_PER_ELEMENT: Double
  val buffer: ArrayBufferLike
  val byteLength: Double
  val byteOffset: Double
  val length: Double
  def compare(otherBuffer: Uint8Array): Double
  def copy(targetBuffer: Uint8Array): Double
  def copyWithin(target: Double, start: Double): this.type
  def entries(): IterableIterator[js.Tuple2[Double, Double]]
  def equals(otherBuffer: Uint8Array): Boolean
  def every(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, _]): Boolean
  def fill(value: String): this.type
  def filter(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, _]): Uint8Array
  def find(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): js.UndefOr[Double]
  def findIndex(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): Double
  def forEach(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Unit]): Unit
  def includes(value: String): Boolean
  def indexOf(value: String): Double
  def join(): String
  def keys(): IterableIterator[Double]
  def lastIndexOf(value: String): Double
  def map(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Double]): Uint8Array
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
  def some(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, _]): Boolean
  def sort(): this.type
  def subarray(): Buffer
  def swap16(): Buffer
  def swap32(): Buffer
  def swap64(): Buffer
  def toJSON(): Data
  def values(): IterableIterator[Double]
  def write(string: String): Double
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
    equals: Uint8Array => Boolean,
    every: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, _] => Boolean,
    fill: String => ReadonlyBuffer,
    filter: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, _] => Uint8Array,
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
    some: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, _] => Boolean,
    sort: () => ReadonlyBuffer,
    subarray: () => Buffer,
    swap16: () => Buffer,
    swap32: () => Buffer,
    swap64: () => Buffer,
    toJSON: () => Data,
    values: () => IterableIterator[Double],
    write: String => Double,
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
    val __obj = js.Dynamic.literal(BYTES_PER_ELEMENT = BYTES_PER_ELEMENT.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any], compare = js.Any.fromFunction1(compare), copy = js.Any.fromFunction1(copy), copyWithin = js.Any.fromFunction2(copyWithin), entries = js.Any.fromFunction0(entries), equals = js.Any.fromFunction1(equals), every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), readDoubleBE = js.Any.fromFunction0(readDoubleBE), readDoubleLE = js.Any.fromFunction0(readDoubleLE), readFloatBE = js.Any.fromFunction0(readFloatBE), readFloatLE = js.Any.fromFunction0(readFloatLE), readInt16BE = js.Any.fromFunction0(readInt16BE), readInt16LE = js.Any.fromFunction0(readInt16LE), readInt32BE = js.Any.fromFunction0(readInt32BE), readInt32LE = js.Any.fromFunction0(readInt32LE), readInt8 = js.Any.fromFunction0(readInt8), readIntBE = js.Any.fromFunction2(readIntBE), readIntLE = js.Any.fromFunction2(readIntLE), readUInt16BE = js.Any.fromFunction0(readUInt16BE), readUInt16LE = js.Any.fromFunction0(readUInt16LE), readUInt32BE = js.Any.fromFunction0(readUInt32BE), readUInt32LE = js.Any.fromFunction0(readUInt32LE), readUInt8 = js.Any.fromFunction0(readUInt8), readUIntBE = js.Any.fromFunction2(readUIntBE), readUIntLE = js.Any.fromFunction2(readUIntLE), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = js.Any.fromFunction0(reverse), set = js.Any.fromFunction1(set), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction0(sort), subarray = js.Any.fromFunction0(subarray), swap16 = js.Any.fromFunction0(swap16), swap32 = js.Any.fromFunction0(swap32), swap64 = js.Any.fromFunction0(swap64), toJSON = js.Any.fromFunction0(toJSON), values = js.Any.fromFunction0(values), write = js.Any.fromFunction1(write), writeDoubleBE = js.Any.fromFunction1(writeDoubleBE), writeDoubleLE = js.Any.fromFunction1(writeDoubleLE), writeFloatBE = js.Any.fromFunction1(writeFloatBE), writeFloatLE = js.Any.fromFunction1(writeFloatLE), writeInt16BE = js.Any.fromFunction1(writeInt16BE), writeInt16LE = js.Any.fromFunction1(writeInt16LE), writeInt32BE = js.Any.fromFunction1(writeInt32BE), writeInt32LE = js.Any.fromFunction1(writeInt32LE), writeInt8 = js.Any.fromFunction1(writeInt8), writeIntBE = js.Any.fromFunction3(writeIntBE), writeIntLE = js.Any.fromFunction3(writeIntLE), writeUInt16BE = js.Any.fromFunction1(writeUInt16BE), writeUInt16LE = js.Any.fromFunction1(writeUInt16LE), writeUInt32BE = js.Any.fromFunction1(writeUInt32BE), writeUInt32LE = js.Any.fromFunction1(writeUInt32LE), writeUInt8 = js.Any.fromFunction1(writeUInt8), writeUIntBE = js.Any.fromFunction3(writeUIntBE), writeUIntLE = js.Any.fromFunction3(writeUIntLE))
    __obj.asInstanceOf[ReadonlyBuffer]
  }
}

