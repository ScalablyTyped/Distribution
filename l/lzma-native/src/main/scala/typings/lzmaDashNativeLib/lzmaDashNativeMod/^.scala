package typings
package lzmaDashNativeLib.lzmaDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lzma-native", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def Compressor(): lzmaDashNativeLib.lzmaDashNativeMod.JSLzmaStream = js.native
  def Compressor(preset: lzmaDashNativeLib.lzmaDashNativeMod.Preset): lzmaDashNativeLib.lzmaDashNativeMod.JSLzmaStream = js.native
  def Compressor(
    preset: lzmaDashNativeLib.lzmaDashNativeMod.Preset,
    options: lzmaDashNativeLib.lzmaDashNativeMod.LzmaOptions
  ): lzmaDashNativeLib.lzmaDashNativeMod.JSLzmaStream = js.native
  def Decompressor(): lzmaDashNativeLib.lzmaDashNativeMod.JSLzmaStream = js.native
  def Decompressor(options: lzmaDashNativeLib.lzmaDashNativeMod.LzmaOptions): lzmaDashNativeLib.lzmaDashNativeMod.JSLzmaStream = js.native
  def LZMA(): lzmaDashNativeLib.Anon_Buf = js.native
  def checkSize(check: lzmaDashNativeLib.lzmaDashNativeMod.Check): scala.Double = js.native
  def compress(buf: java.lang.String): scala.Unit = js.native
  def compress(buf: java.lang.String, options: lzmaDashNativeLib.lzmaDashNativeMod.LzmaOptions): scala.Unit = js.native
  def compress(
    buf: java.lang.String,
    options: lzmaDashNativeLib.lzmaDashNativeMod.LzmaOptions,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def compress(buf: java.lang.String, options: lzmaDashNativeLib.lzmaDashNativeMod.Preset): scala.Unit = js.native
  def compress(
    buf: java.lang.String,
    options: lzmaDashNativeLib.lzmaDashNativeMod.Preset,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def compress(buf: nodeLib.Buffer): scala.Unit = js.native
  def compress(buf: nodeLib.Buffer, options: lzmaDashNativeLib.lzmaDashNativeMod.LzmaOptions): scala.Unit = js.native
  def compress(
    buf: nodeLib.Buffer,
    options: lzmaDashNativeLib.lzmaDashNativeMod.LzmaOptions,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def compress(buf: nodeLib.Buffer, options: lzmaDashNativeLib.lzmaDashNativeMod.Preset): scala.Unit = js.native
  def compress(
    buf: nodeLib.Buffer,
    options: lzmaDashNativeLib.lzmaDashNativeMod.Preset,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def crc32(input: java.lang.String): java.lang.String = js.native
  def crc32(input: java.lang.String, encoding: java.lang.String): java.lang.String = js.native
  def crc32(input: java.lang.String, encoding: java.lang.String, previous: scala.Double): java.lang.String = js.native
  def createCompressor(): lzmaDashNativeLib.lzmaDashNativeMod.JSLzmaStream = js.native
  def createCompressor(options: lzmaDashNativeLib.lzmaDashNativeMod.LzmaOptions): lzmaDashNativeLib.lzmaDashNativeMod.JSLzmaStream = js.native
  def createDecompressor(): lzmaDashNativeLib.lzmaDashNativeMod.JSLzmaStream = js.native
  def createDecompressor(options: lzmaDashNativeLib.lzmaDashNativeMod.LzmaOptions): lzmaDashNativeLib.lzmaDashNativeMod.JSLzmaStream = js.native
  def createStream(coder: lzmaDashNativeLib.lzmaDashNativeMod.Coders): lzmaDashNativeLib.lzmaDashNativeMod.JSLzmaStream = js.native
  def createStream(
    coder: lzmaDashNativeLib.lzmaDashNativeMod.Coders,
    options: lzmaDashNativeLib.lzmaDashNativeMod.LzmaOptions
  ): lzmaDashNativeLib.lzmaDashNativeMod.JSLzmaStream = js.native
  def decompress(buf: java.lang.String): scala.Unit = js.native
  def decompress(buf: java.lang.String, options: lzmaDashNativeLib.lzmaDashNativeMod.LzmaOptions): scala.Unit = js.native
  def decompress(
    buf: java.lang.String,
    options: lzmaDashNativeLib.lzmaDashNativeMod.LzmaOptions,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def decompress(buf: java.lang.String, options: lzmaDashNativeLib.lzmaDashNativeMod.Preset): scala.Unit = js.native
  def decompress(
    buf: java.lang.String,
    options: lzmaDashNativeLib.lzmaDashNativeMod.Preset,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def decompress(buf: nodeLib.Buffer): scala.Unit = js.native
  def decompress(buf: nodeLib.Buffer, options: lzmaDashNativeLib.lzmaDashNativeMod.LzmaOptions): scala.Unit = js.native
  def decompress(
    buf: nodeLib.Buffer,
    options: lzmaDashNativeLib.lzmaDashNativeMod.LzmaOptions,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def decompress(buf: nodeLib.Buffer, options: lzmaDashNativeLib.lzmaDashNativeMod.Preset): scala.Unit = js.native
  def decompress(
    buf: nodeLib.Buffer,
    options: lzmaDashNativeLib.lzmaDashNativeMod.Preset,
    on_finish: js.Function1[/* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def easyDecoderMemusage(preset: lzmaDashNativeLib.lzmaDashNativeMod.Preset): scala.Double = js.native
  def easyEncoderMemusage(preset: lzmaDashNativeLib.lzmaDashNativeMod.Preset): scala.Double = js.native
  def isXZ(buf: java.lang.String): scala.Boolean = js.native
  def isXZ(buf: nodeLib.Buffer): scala.Boolean = js.native
  def parseFileIndex(options: lzmaDashNativeLib.lzmaDashNativeMod.FileOptions): scala.Unit = js.native
  def parseFileIndex(
    options: lzmaDashNativeLib.lzmaDashNativeMod.FileOptions,
    callback: js.Function2[
      /* err */ js.Any, 
      /* info */ js.UndefOr[lzmaDashNativeLib.lzmaDashNativeMod.StreamInfo], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def parseFileIndexFD(fileDescriptor: scala.Double): scala.Unit = js.native
  def parseFileIndexFD(
    fileDescriptor: scala.Double,
    callback: js.Function2[
      /* err */ js.Any, 
      /* info */ js.UndefOr[lzmaDashNativeLib.lzmaDashNativeMod.StreamInfo], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def rawDecoderMemusage(preset: lzmaDashNativeLib.lzmaDashNativeMod.Preset): scala.Double = js.native
  def rawEncoderMemusage(preset: lzmaDashNativeLib.lzmaDashNativeMod.Preset): scala.Double = js.native
  def versionNumber(): scala.Double = js.native
  def versionString(): java.lang.String = js.native
}

