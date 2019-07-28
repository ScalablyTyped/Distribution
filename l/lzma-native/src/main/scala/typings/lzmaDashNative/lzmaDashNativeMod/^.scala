package typings.lzmaDashNative.lzmaDashNativeMod

import typings.lzmaDashNative.Anon_Buf
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lzma-native", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Compressor(): JSLzmaStream = js.native
  def Compressor(preset: Preset): JSLzmaStream = js.native
  def Compressor(preset: Preset, options: LzmaOptions): JSLzmaStream = js.native
  def Decompressor(): JSLzmaStream = js.native
  def Decompressor(options: LzmaOptions): JSLzmaStream = js.native
  def LZMA(): Anon_Buf = js.native
  def checkSize(check: Check): Double = js.native
  def compress(buf: String): Unit = js.native
  def compress(buf: String, options: LzmaOptions): Unit = js.native
  def compress(buf: String, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def compress(buf: String, options: Preset): Unit = js.native
  def compress(buf: String, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def compress(buf: Buffer): Unit = js.native
  def compress(buf: Buffer, options: LzmaOptions): Unit = js.native
  def compress(buf: Buffer, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def compress(buf: Buffer, options: Preset): Unit = js.native
  def compress(buf: Buffer, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def crc32(input: String): String = js.native
  def crc32(input: String, encoding: String): String = js.native
  def crc32(input: String, encoding: String, previous: Double): String = js.native
  def createCompressor(): JSLzmaStream = js.native
  def createCompressor(options: LzmaOptions): JSLzmaStream = js.native
  def createDecompressor(): JSLzmaStream = js.native
  def createDecompressor(options: LzmaOptions): JSLzmaStream = js.native
  def createStream(coder: Coders): JSLzmaStream = js.native
  def createStream(coder: Coders, options: LzmaOptions): JSLzmaStream = js.native
  def decompress(buf: String): Unit = js.native
  def decompress(buf: String, options: LzmaOptions): Unit = js.native
  def decompress(buf: String, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def decompress(buf: String, options: Preset): Unit = js.native
  def decompress(buf: String, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def decompress(buf: Buffer): Unit = js.native
  def decompress(buf: Buffer, options: LzmaOptions): Unit = js.native
  def decompress(buf: Buffer, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def decompress(buf: Buffer, options: Preset): Unit = js.native
  def decompress(buf: Buffer, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = js.native
  def easyDecoderMemusage(preset: Preset): Double = js.native
  def easyEncoderMemusage(preset: Preset): Double = js.native
  def isXZ(buf: String): Boolean = js.native
  def isXZ(buf: Buffer): Boolean = js.native
  def parseFileIndex(options: FileOptions): Unit = js.native
  def parseFileIndex(
    options: FileOptions,
    callback: js.Function2[/* err */ js.Any, /* info */ js.UndefOr[StreamInfo], Unit]
  ): Unit = js.native
  def parseFileIndexFD(fileDescriptor: Double): Unit = js.native
  def parseFileIndexFD(
    fileDescriptor: Double,
    callback: js.Function2[/* err */ js.Any, /* info */ js.UndefOr[StreamInfo], Unit]
  ): Unit = js.native
  def rawDecoderMemusage(preset: Preset): Double = js.native
  def rawEncoderMemusage(preset: Preset): Double = js.native
  def versionNumber(): Double = js.native
  def versionString(): String = js.native
}

