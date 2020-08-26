package typings.grpc.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtobufMessage
  extends /* field */ StringDictionary[js.Any] {
  @JSName("$add")
  def $add(key: String, value: js.Any): ProtobufMessage = js.native
  @JSName("$add")
  def $add(key: String, value: js.Any, noAssert: Boolean): ProtobufMessage = js.native
  @JSName("$get")
  def $get[T](key: String): T = js.native
  @JSName("$set")
  def $set(key: String): Unit = js.native
  @JSName("$set")
  def $set(key: String, value: js.UndefOr[scala.Nothing], noAssert: Boolean): Unit = js.native
  @JSName("$set")
  def $set(key: String, value: js.Any): Unit = js.native
  @JSName("$set")
  def $set(key: String, value: js.Any, noAssert: Boolean): Unit = js.native
  @JSName("$set")
  def $set(key: String, value: Boolean): Unit = js.native
  @JSName("$set")
  def $set(key: String, value: Boolean, noAssert: Boolean): Unit = js.native
  @JSName("$set")
  def $set(key: StringDictionary[js.Any]): Unit = js.native
  @JSName("$set")
  def $set(key: StringDictionary[js.Any], value: js.UndefOr[scala.Nothing], noAssert: Boolean): Unit = js.native
  @JSName("$set")
  def $set(key: StringDictionary[js.Any], value: js.Any): Unit = js.native
  @JSName("$set")
  def $set(key: StringDictionary[js.Any], value: js.Any, noAssert: Boolean): Unit = js.native
  @JSName("$set")
  def $set(key: StringDictionary[js.Any], value: Boolean): Unit = js.native
  @JSName("$set")
  def $set(key: StringDictionary[js.Any], value: Boolean, noAssert: Boolean): Unit = js.native
  def add(key: String, value: js.Any): ProtobufMessage = js.native
  def add(key: String, value: js.Any, noAssert: Boolean): ProtobufMessage = js.native
  def calculate(): Double = js.native
  def encode(): js.Any = js.native
  def encode(buffer: js.UndefOr[scala.Nothing], noVerify: Boolean): js.Any = js.native
  def encode(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any
  ): js.Any = js.native
  def encode(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any,
    noVerify: Boolean
  ): js.Any = js.native
  def encode(buffer: Boolean): js.Any = js.native
  def encode(buffer: Boolean, noVerify: Boolean): js.Any = js.native
  def encode64(): String = js.native
  def encodeAB(): ArrayBuffer = js.native
  def encodeDelimited(): js.Any = js.native
  def encodeDelimited(buffer: js.UndefOr[scala.Nothing], noVerify: Boolean): js.Any = js.native
  def encodeDelimited(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any
  ): js.Any = js.native
  def encodeDelimited(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any,
    noVerify: Boolean
  ): js.Any = js.native
  def encodeDelimited(buffer: Boolean): js.Any = js.native
  def encodeDelimited(buffer: Boolean, noVerify: Boolean): js.Any = js.native
  def encodeHex(): String = js.native
  def encodeJSON(): String = js.native
  def encodeNB(): Buffer = js.native
  def get[T](key: String): T = js.native
  def get[T](key: String, noAssert: Boolean): T = js.native
  def set(key: String): Unit = js.native
  def set(key: String, value: js.UndefOr[scala.Nothing], noAssert: Boolean): Unit = js.native
  def set(key: String, value: js.Any): Unit = js.native
  def set(key: String, value: js.Any, noAssert: Boolean): Unit = js.native
  def set(key: String, value: Boolean): Unit = js.native
  def set(key: String, value: Boolean, noAssert: Boolean): Unit = js.native
  def set(key: StringDictionary[js.Any]): Unit = js.native
  def set(key: StringDictionary[js.Any], value: js.UndefOr[scala.Nothing], noAssert: Boolean): Unit = js.native
  def set(key: StringDictionary[js.Any], value: js.Any): Unit = js.native
  def set(key: StringDictionary[js.Any], value: js.Any, noAssert: Boolean): Unit = js.native
  def set(key: StringDictionary[js.Any], value: Boolean): Unit = js.native
  def set(key: StringDictionary[js.Any], value: Boolean, noAssert: Boolean): Unit = js.native
  def toArrayBuffer(): ArrayBuffer = js.native
  def toBase64(): String = js.native
  def toBuffer(): Buffer = js.native
  def toHex(): String = js.native
  def toRaw(): StringDictionary[js.Any] = js.native
  def toRaw(binaryAsBase64: js.UndefOr[scala.Nothing], longsAsStrings: Boolean): StringDictionary[js.Any] = js.native
  def toRaw(binaryAsBase64: Boolean): StringDictionary[js.Any] = js.native
  def toRaw(binaryAsBase64: Boolean, longsAsStrings: Boolean): StringDictionary[js.Any] = js.native
}

