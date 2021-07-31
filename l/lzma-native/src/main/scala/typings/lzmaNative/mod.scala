package typings.lzmaNative

import typings.lzmaNative.anon.Compress
import typings.lzmaNative.lzmaNativeStrings.CONCATENATED
import typings.lzmaNative.lzmaNativeStrings.TELL_ANY_CHECK
import typings.lzmaNative.lzmaNativeStrings.TELL_NO_CHECK
import typings.lzmaNative.lzmaNativeStrings.TELL_UNSUPPORTED_CHECK
import typings.node.Buffer
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lzma-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Compressor(): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Compressor")().asInstanceOf[JSLzmaStream]
  @scala.inline
  def Compressor(preset: Unit, options: LzmaOptions): JSLzmaStream = (^.asInstanceOf[js.Dynamic].applyDynamic("Compressor")(preset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSLzmaStream]
  @scala.inline
  def Compressor(preset: Preset): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Compressor")(preset.asInstanceOf[js.Any]).asInstanceOf[JSLzmaStream]
  @scala.inline
  def Compressor(preset: Preset, options: LzmaOptions): JSLzmaStream = (^.asInstanceOf[js.Dynamic].applyDynamic("Compressor")(preset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSLzmaStream]
  
  @scala.inline
  def Decompressor(): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Decompressor")().asInstanceOf[JSLzmaStream]
  @scala.inline
  def Decompressor(options: LzmaOptions): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("Decompressor")(options.asInstanceOf[js.Any]).asInstanceOf[JSLzmaStream]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stream.Transform * / any */ @JSImport("lzma-native", "JSLzmaStream")
  @js.native
  class JSLzmaStream protected () extends StObject {
    def this(nativeStream: Stream, options: LzmaOptions) = this()
    
    def bufsize(): Double = js.native
    def bufsize(size: Double): Unit = js.native
    
    def cleanUp(): Unit = js.native
    
    def totalInt(): Double = js.native
    
    def totalOut(): Double = js.native
  }
  
  @scala.inline
  def LZMA(): Compress = ^.asInstanceOf[js.Dynamic].applyDynamic("LZMA")().asInstanceOf[Compress]
  
  @scala.inline
  def checkSize(check: Check): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("checkSize")(check.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def compress(buf: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def compress(buf: String, options: Unit, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def compress(buf: String, options: LzmaOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def compress(buf: String, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def compress(buf: String, options: Preset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def compress(buf: String, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def compress(buf: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def compress(buf: Buffer, options: Unit, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def compress(buf: Buffer, options: LzmaOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def compress(buf: Buffer, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def compress(buf: Buffer, options: Preset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def compress(buf: Buffer, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def crc32(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def crc32(input: String, encoding: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def crc32(input: String, encoding: String, previous: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], previous.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def crc32(input: String, encoding: Unit, previous: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crc32")(input.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], previous.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def createCompressor(): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompressor")().asInstanceOf[JSLzmaStream]
  @scala.inline
  def createCompressor(options: LzmaOptions): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createCompressor")(options.asInstanceOf[js.Any]).asInstanceOf[JSLzmaStream]
  
  @scala.inline
  def createDecompressor(): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecompressor")().asInstanceOf[JSLzmaStream]
  @scala.inline
  def createDecompressor(options: LzmaOptions): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createDecompressor")(options.asInstanceOf[js.Any]).asInstanceOf[JSLzmaStream]
  
  @scala.inline
  def createStream(coder: Coders): JSLzmaStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(coder.asInstanceOf[js.Any]).asInstanceOf[JSLzmaStream]
  @scala.inline
  def createStream(coder: Coders, options: LzmaOptions): JSLzmaStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(coder.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JSLzmaStream]
  
  @scala.inline
  def decompress(buf: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def decompress(buf: String, options: Unit, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def decompress(buf: String, options: LzmaOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def decompress(buf: String, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def decompress(buf: String, options: Preset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def decompress(buf: String, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def decompress(buf: Buffer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def decompress(buf: Buffer, options: Unit, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def decompress(buf: Buffer, options: LzmaOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def decompress(buf: Buffer, options: LzmaOptions, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def decompress(buf: Buffer, options: Preset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def decompress(buf: Buffer, options: Preset, on_finish: js.Function1[/* result */ Buffer, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buf.asInstanceOf[js.Any], options.asInstanceOf[js.Any], on_finish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def easyDecoderMemusage(preset: Preset): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easyDecoderMemusage")(preset.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def easyEncoderMemusage(preset: Preset): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("easyEncoderMemusage")(preset.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isXZ(buf: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXZ")(buf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isXZ(buf: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isXZ")(buf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def parseFileIndex(options: FileOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFileIndex")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def parseFileIndex(
    options: FileOptions,
    callback: js.Function2[/* err */ js.Any, /* info */ js.UndefOr[StreamInfo], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFileIndex")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def parseFileIndexFD(fileDescriptor: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFileIndexFD")(fileDescriptor.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def parseFileIndexFD(
    fileDescriptor: Double,
    callback: js.Function2[/* err */ js.Any, /* info */ js.UndefOr[StreamInfo], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFileIndexFD")(fileDescriptor.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def rawDecoderMemusage(preset: Preset): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rawDecoderMemusage")(preset.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def rawEncoderMemusage(preset: Preset): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rawEncoderMemusage")(preset.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def versionNumber(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("versionNumber")().asInstanceOf[Double]
  
  @scala.inline
  def versionString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("versionString")().asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.lzmaNative.lzmaNativeStrings.CHECK_CRC32
    - typings.lzmaNative.lzmaNativeStrings.CHECK_CRC64
    - typings.lzmaNative.lzmaNativeStrings.CHECK_NONE
    - typings.lzmaNative.lzmaNativeStrings.CHECK_SHA256
  */
  trait Check extends StObject
  object Check {
    
    @scala.inline
    def CHECK_CRC32: typings.lzmaNative.lzmaNativeStrings.CHECK_CRC32 = "CHECK_CRC32".asInstanceOf[typings.lzmaNative.lzmaNativeStrings.CHECK_CRC32]
    
    @scala.inline
    def CHECK_CRC64: typings.lzmaNative.lzmaNativeStrings.CHECK_CRC64 = "CHECK_CRC64".asInstanceOf[typings.lzmaNative.lzmaNativeStrings.CHECK_CRC64]
    
    @scala.inline
    def CHECK_NONE: typings.lzmaNative.lzmaNativeStrings.CHECK_NONE = "CHECK_NONE".asInstanceOf[typings.lzmaNative.lzmaNativeStrings.CHECK_NONE]
    
    @scala.inline
    def CHECK_SHA256: typings.lzmaNative.lzmaNativeStrings.CHECK_SHA256 = "CHECK_SHA256".asInstanceOf[typings.lzmaNative.lzmaNativeStrings.CHECK_SHA256]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lzmaNative.lzmaNativeStrings.easyEncoder
    - typings.lzmaNative.lzmaNativeStrings.aloneDecoder
    - typings.lzmaNative.lzmaNativeStrings.rawEncoder
    - typings.lzmaNative.lzmaNativeStrings.autoDecoder
    - typings.lzmaNative.lzmaNativeStrings.aloneEncoder
    - typings.lzmaNative.lzmaNativeStrings.streamEncoder
    - typings.lzmaNative.lzmaNativeStrings.streamDecoder
  */
  trait Coders extends StObject
  object Coders {
    
    @scala.inline
    def aloneDecoder: typings.lzmaNative.lzmaNativeStrings.aloneDecoder = "aloneDecoder".asInstanceOf[typings.lzmaNative.lzmaNativeStrings.aloneDecoder]
    
    @scala.inline
    def aloneEncoder: typings.lzmaNative.lzmaNativeStrings.aloneEncoder = "aloneEncoder".asInstanceOf[typings.lzmaNative.lzmaNativeStrings.aloneEncoder]
    
    @scala.inline
    def autoDecoder: typings.lzmaNative.lzmaNativeStrings.autoDecoder = "autoDecoder".asInstanceOf[typings.lzmaNative.lzmaNativeStrings.autoDecoder]
    
    @scala.inline
    def easyEncoder: typings.lzmaNative.lzmaNativeStrings.easyEncoder = "easyEncoder".asInstanceOf[typings.lzmaNative.lzmaNativeStrings.easyEncoder]
    
    @scala.inline
    def rawEncoder: typings.lzmaNative.lzmaNativeStrings.rawEncoder = "rawEncoder".asInstanceOf[typings.lzmaNative.lzmaNativeStrings.rawEncoder]
    
    @scala.inline
    def streamDecoder: typings.lzmaNative.lzmaNativeStrings.streamDecoder = "streamDecoder".asInstanceOf[typings.lzmaNative.lzmaNativeStrings.streamDecoder]
    
    @scala.inline
    def streamEncoder: typings.lzmaNative.lzmaNativeStrings.streamEncoder = "streamEncoder".asInstanceOf[typings.lzmaNative.lzmaNativeStrings.streamEncoder]
  }
  
  trait FileOptions extends StObject {
    
    var fileSize: Double
    
    var memlimit: js.UndefOr[Double] = js.undefined
    
    def read(count: Double, offset: Double, cb: js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]): Unit
  }
  object FileOptions {
    
    @scala.inline
    def apply(
      fileSize: Double,
      read: (Double, Double, js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]) => Unit
    ): FileOptions = {
      val __obj = js.Dynamic.literal(fileSize = fileSize.asInstanceOf[js.Any], read = js.Any.fromFunction3(read))
      __obj.asInstanceOf[FileOptions]
    }
    
    @scala.inline
    implicit class FileOptionsMutableBuilder[Self <: FileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemlimit(value: Double): Self = StObject.set(x, "memlimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemlimitUndefined: Self = StObject.set(x, "memlimit", js.undefined)
      
      @scala.inline
      def setRead(value: (Double, Double, js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]) => Unit): Self = StObject.set(x, "read", js.Any.fromFunction3(value))
    }
  }
  
  trait LzmaOptions extends StObject {
    
    var blockSize: js.UndefOr[Double] = js.undefined
    
    var bufsize: js.UndefOr[Double] = js.undefined
    
    var check: js.UndefOr[Check] = js.undefined
    
    var flags: js.UndefOr[TELL_NO_CHECK | TELL_UNSUPPORTED_CHECK | TELL_ANY_CHECK | CONCATENATED] = js.undefined
    
    var memlimit: js.UndefOr[Double] = js.undefined
    
    var preset: js.UndefOr[Preset] = js.undefined
    
    var synchronous: js.UndefOr[Boolean] = js.undefined
    
    var threads: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object LzmaOptions {
    
    @scala.inline
    def apply(): LzmaOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LzmaOptions]
    }
    
    @scala.inline
    implicit class LzmaOptionsMutableBuilder[Self <: LzmaOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      @scala.inline
      def setBufsize(value: Double): Self = StObject.set(x, "bufsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufsizeUndefined: Self = StObject.set(x, "bufsize", js.undefined)
      
      @scala.inline
      def setCheck(value: Check): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
      
      @scala.inline
      def setFlags(value: TELL_NO_CHECK | TELL_UNSUPPORTED_CHECK | TELL_ANY_CHECK | CONCATENATED): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setMemlimit(value: Double): Self = StObject.set(x, "memlimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemlimitUndefined: Self = StObject.set(x, "memlimit", js.undefined)
      
      @scala.inline
      def setPreset(value: Preset): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      @scala.inline
      def setSynchronous(value: Boolean): Self = StObject.set(x, "synchronous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSynchronousUndefined: Self = StObject.set(x, "synchronous", js.undefined)
      
      @scala.inline
      def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.lzmaNative.lzmaNativeNumbers.`0`
    - typings.lzmaNative.lzmaNativeNumbers.`1`
    - typings.lzmaNative.lzmaNativeNumbers.`2`
    - typings.lzmaNative.lzmaNativeNumbers.`3`
    - typings.lzmaNative.lzmaNativeNumbers.`4`
    - typings.lzmaNative.lzmaNativeNumbers.`5`
    - typings.lzmaNative.lzmaNativeNumbers.`6`
    - typings.lzmaNative.lzmaNativeNumbers.`7`
    - typings.lzmaNative.lzmaNativeNumbers.`8`
    - typings.lzmaNative.lzmaNativeNumbers.`9`
  */
  trait Preset extends StObject
  object Preset {
    
    @scala.inline
    def `0`: typings.lzmaNative.lzmaNativeNumbers.`0` = 0.asInstanceOf[typings.lzmaNative.lzmaNativeNumbers.`0`]
    
    @scala.inline
    def `1`: typings.lzmaNative.lzmaNativeNumbers.`1` = 1.asInstanceOf[typings.lzmaNative.lzmaNativeNumbers.`1`]
    
    @scala.inline
    def `2`: typings.lzmaNative.lzmaNativeNumbers.`2` = 2.asInstanceOf[typings.lzmaNative.lzmaNativeNumbers.`2`]
    
    @scala.inline
    def `3`: typings.lzmaNative.lzmaNativeNumbers.`3` = 3.asInstanceOf[typings.lzmaNative.lzmaNativeNumbers.`3`]
    
    @scala.inline
    def `4`: typings.lzmaNative.lzmaNativeNumbers.`4` = 4.asInstanceOf[typings.lzmaNative.lzmaNativeNumbers.`4`]
    
    @scala.inline
    def `5`: typings.lzmaNative.lzmaNativeNumbers.`5` = 5.asInstanceOf[typings.lzmaNative.lzmaNativeNumbers.`5`]
    
    @scala.inline
    def `6`: typings.lzmaNative.lzmaNativeNumbers.`6` = 6.asInstanceOf[typings.lzmaNative.lzmaNativeNumbers.`6`]
    
    @scala.inline
    def `7`: typings.lzmaNative.lzmaNativeNumbers.`7` = 7.asInstanceOf[typings.lzmaNative.lzmaNativeNumbers.`7`]
    
    @scala.inline
    def `8`: typings.lzmaNative.lzmaNativeNumbers.`8` = 8.asInstanceOf[typings.lzmaNative.lzmaNativeNumbers.`8`]
    
    @scala.inline
    def `9`: typings.lzmaNative.lzmaNativeNumbers.`9` = 9.asInstanceOf[typings.lzmaNative.lzmaNativeNumbers.`9`]
  }
  
  trait StreamInfo extends StObject {
    
    var blocks: Double
    
    var checks: Double
    
    var fileSize: Double
    
    var memlimit: Double
    
    var streamPadding: Double
    
    var streams: Double
    
    var uncompressedSize: Double
  }
  object StreamInfo {
    
    @scala.inline
    def apply(
      blocks: Double,
      checks: Double,
      fileSize: Double,
      memlimit: Double,
      streamPadding: Double,
      streams: Double,
      uncompressedSize: Double
    ): StreamInfo = {
      val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], checks = checks.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], memlimit = memlimit.asInstanceOf[js.Any], streamPadding = streamPadding.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any], uncompressedSize = uncompressedSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamInfo]
    }
    
    @scala.inline
    implicit class StreamInfoMutableBuilder[Self <: StreamInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChecks(value: Double): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemlimit(value: Double): Self = StObject.set(x, "memlimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamPadding(value: Double): Self = StObject.set(x, "streamPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreams(value: Double): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncompressedSize(value: Double): Self = StObject.set(x, "uncompressedSize", value.asInstanceOf[js.Any])
    }
  }
}
