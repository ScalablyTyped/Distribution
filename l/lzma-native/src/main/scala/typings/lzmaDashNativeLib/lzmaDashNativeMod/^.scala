package typings
package lzmaDashNativeLib.lzmaDashNativeMod

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
  def LZMA(): lzmaDashNativeLib.Anon_Buf = js.native
  def checkSize(check: Check): scala.Double = js.native
  def compress(buf: java.lang.String): scala.Unit = js.native
  def compress(buf: java.lang.String, options: LzmaOptions): scala.Unit = js.native
  def compress(
    buf: java.lang.String,
    options: LzmaOptions,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def compress(buf: java.lang.String, options: Preset): scala.Unit = js.native
  def compress(
    buf: java.lang.String,
    options: Preset,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def compress(buf: nodeLib.Buffer): scala.Unit = js.native
  def compress(buf: nodeLib.Buffer, options: LzmaOptions): scala.Unit = js.native
  def compress(
    buf: nodeLib.Buffer,
    options: LzmaOptions,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def compress(buf: nodeLib.Buffer, options: Preset): scala.Unit = js.native
  def compress(
    buf: nodeLib.Buffer,
    options: Preset,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def crc32(input: java.lang.String): java.lang.String = js.native
  def crc32(input: java.lang.String, encoding: java.lang.String): java.lang.String = js.native
  def crc32(input: java.lang.String, encoding: java.lang.String, previous: scala.Double): java.lang.String = js.native
  def createCompressor(): JSLzmaStream = js.native
  def createCompressor(options: LzmaOptions): JSLzmaStream = js.native
  def createDecompressor(): JSLzmaStream = js.native
  def createDecompressor(options: LzmaOptions): JSLzmaStream = js.native
  def createStream(coder: Coders): JSLzmaStream = js.native
  def createStream(coder: Coders, options: LzmaOptions): JSLzmaStream = js.native
  def decompress(buf: java.lang.String): scala.Unit = js.native
  def decompress(buf: java.lang.String, options: LzmaOptions): scala.Unit = js.native
  def decompress(
    buf: java.lang.String,
    options: LzmaOptions,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def decompress(buf: java.lang.String, options: Preset): scala.Unit = js.native
  def decompress(
    buf: java.lang.String,
    options: Preset,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def decompress(buf: nodeLib.Buffer): scala.Unit = js.native
  def decompress(buf: nodeLib.Buffer, options: LzmaOptions): scala.Unit = js.native
  def decompress(
    buf: nodeLib.Buffer,
    options: LzmaOptions,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def decompress(buf: nodeLib.Buffer, options: Preset): scala.Unit = js.native
  def decompress(
    buf: nodeLib.Buffer,
    options: Preset,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def easyDecoderMemusage(preset: Preset): scala.Double = js.native
  def easyEncoderMemusage(preset: Preset): scala.Double = js.native
  def isXZ(buf: java.lang.String): scala.Boolean = js.native
  def isXZ(buf: nodeLib.Buffer): scala.Boolean = js.native
  def parseFileIndex(options: FileOptions): scala.Unit = js.native
  def parseFileIndex(
    options: FileOptions,
    callback: js.Function2[/* err */ js.Any, /* info */ js.UndefOr[StreamInfo], scala.Unit]
  ): scala.Unit = js.native
  def parseFileIndexFD(fileDescriptor: scala.Double): scala.Unit = js.native
  def parseFileIndexFD(
    fileDescriptor: scala.Double,
    callback: js.Function2[/* err */ js.Any, /* info */ js.UndefOr[StreamInfo], scala.Unit]
  ): scala.Unit = js.native
  def rawDecoderMemusage(preset: Preset): scala.Double = js.native
  def rawEncoderMemusage(preset: Preset): scala.Double = js.native
  def versionNumber(): scala.Double = js.native
  def versionString(): java.lang.String = js.native
}

