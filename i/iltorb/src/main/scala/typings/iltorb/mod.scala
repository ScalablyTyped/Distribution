package typings.iltorb

import typings.node.Buffer
import typings.node.streamMod.Transform
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("iltorb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compress(buffer: Buffer): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def compress(buffer: Buffer, callback: IltorbCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def compress(buffer: Buffer, options: BrotliEncodeParams): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def compress(buffer: Buffer, options: BrotliEncodeParams, callback: IltorbCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def compressStream(): Transform & BrotliFlushable = ^.asInstanceOf[js.Dynamic].applyDynamic("compressStream")().asInstanceOf[Transform & BrotliFlushable]
  @scala.inline
  def compressStream(options: BrotliEncodeParams): Transform & BrotliFlushable = ^.asInstanceOf[js.Dynamic].applyDynamic("compressStream")(options.asInstanceOf[js.Any]).asInstanceOf[Transform & BrotliFlushable]
  
  @scala.inline
  def compressSync(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  @scala.inline
  def compressSync(buffer: Buffer, options: BrotliEncodeParams): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("compressSync")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  @scala.inline
  def decompress(buffer: Buffer): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def decompress(buffer: Buffer, callback: IltorbCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def decompressStream(): Transform = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressStream")().asInstanceOf[Transform]
  
  @scala.inline
  def decompressSync(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decompressSync")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  /* Rewritten from type alias, can be one of: 
    - typings.iltorb.iltorbNumbers.`0`
    - typings.iltorb.iltorbNumbers.`1`
    - typings.iltorb.iltorbNumbers.`2`
    - typings.iltorb.iltorbNumbers.`3`
    - typings.iltorb.iltorbNumbers.`4`
    - typings.iltorb.iltorbNumbers.`5`
    - typings.iltorb.iltorbNumbers.`6`
    - typings.iltorb.iltorbNumbers.`7`
    - typings.iltorb.iltorbNumbers.`8`
    - typings.iltorb.iltorbNumbers.`9`
    - typings.iltorb.iltorbNumbers.`10`
    - typings.iltorb.iltorbNumbers.`11`
  */
  trait BrotliCompressionQuality extends StObject
  object BrotliCompressionQuality {
    
    @scala.inline
    def `0`: typings.iltorb.iltorbNumbers.`0` = 0.asInstanceOf[typings.iltorb.iltorbNumbers.`0`]
    
    @scala.inline
    def `1`: typings.iltorb.iltorbNumbers.`1` = 1.asInstanceOf[typings.iltorb.iltorbNumbers.`1`]
    
    @scala.inline
    def `10`: typings.iltorb.iltorbNumbers.`10` = 10.asInstanceOf[typings.iltorb.iltorbNumbers.`10`]
    
    @scala.inline
    def `11`: typings.iltorb.iltorbNumbers.`11` = 11.asInstanceOf[typings.iltorb.iltorbNumbers.`11`]
    
    @scala.inline
    def `2`: typings.iltorb.iltorbNumbers.`2` = 2.asInstanceOf[typings.iltorb.iltorbNumbers.`2`]
    
    @scala.inline
    def `3`: typings.iltorb.iltorbNumbers.`3` = 3.asInstanceOf[typings.iltorb.iltorbNumbers.`3`]
    
    @scala.inline
    def `4`: typings.iltorb.iltorbNumbers.`4` = 4.asInstanceOf[typings.iltorb.iltorbNumbers.`4`]
    
    @scala.inline
    def `5`: typings.iltorb.iltorbNumbers.`5` = 5.asInstanceOf[typings.iltorb.iltorbNumbers.`5`]
    
    @scala.inline
    def `6`: typings.iltorb.iltorbNumbers.`6` = 6.asInstanceOf[typings.iltorb.iltorbNumbers.`6`]
    
    @scala.inline
    def `7`: typings.iltorb.iltorbNumbers.`7` = 7.asInstanceOf[typings.iltorb.iltorbNumbers.`7`]
    
    @scala.inline
    def `8`: typings.iltorb.iltorbNumbers.`8` = 8.asInstanceOf[typings.iltorb.iltorbNumbers.`8`]
    
    @scala.inline
    def `9`: typings.iltorb.iltorbNumbers.`9` = 9.asInstanceOf[typings.iltorb.iltorbNumbers.`9`]
  }
  
  trait BrotliEncodeParams extends StObject {
    
    var disable_literal_context_modeling: js.UndefOr[Boolean] = js.undefined
    
    var lgblock: js.UndefOr[Double] = js.undefined
    
    var lgwin: js.UndefOr[Double] = js.undefined
    
    /** @default 0 */
    var mode: js.UndefOr[BrotliMode] = js.undefined
    
    /** @default 11 */
    var quality: js.UndefOr[BrotliCompressionQuality] = js.undefined
    
    var size_hint: js.UndefOr[Double] = js.undefined
  }
  object BrotliEncodeParams {
    
    @scala.inline
    def apply(): BrotliEncodeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrotliEncodeParams]
    }
    
    @scala.inline
    implicit class BrotliEncodeParamsMutableBuilder[Self <: BrotliEncodeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable_literal_context_modeling(value: Boolean): Self = StObject.set(x, "disable_literal_context_modeling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_literal_context_modelingUndefined: Self = StObject.set(x, "disable_literal_context_modeling", js.undefined)
      
      @scala.inline
      def setLgblock(value: Double): Self = StObject.set(x, "lgblock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgblockUndefined: Self = StObject.set(x, "lgblock", js.undefined)
      
      @scala.inline
      def setLgwin(value: Double): Self = StObject.set(x, "lgwin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLgwinUndefined: Self = StObject.set(x, "lgwin", js.undefined)
      
      @scala.inline
      def setMode(value: BrotliMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setQuality(value: BrotliCompressionQuality): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setSize_hint(value: Double): Self = StObject.set(x, "size_hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize_hintUndefined: Self = StObject.set(x, "size_hint", js.undefined)
    }
  }
  
  trait BrotliFlushable extends StObject {
    
    def flush(): Unit
  }
  object BrotliFlushable {
    
    @scala.inline
    def apply(flush: () => Unit): BrotliFlushable = {
      val __obj = js.Dynamic.literal(flush = js.Any.fromFunction0(flush))
      __obj.asInstanceOf[BrotliFlushable]
    }
    
    @scala.inline
    implicit class BrotliFlushableMutableBuilder[Self <: BrotliFlushable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.iltorb.iltorbNumbers.`0`
    - typings.iltorb.iltorbNumbers.`1`
    - typings.iltorb.iltorbNumbers.`2`
  */
  trait BrotliMode extends StObject
  object BrotliMode {
    
    @scala.inline
    def `0`: typings.iltorb.iltorbNumbers.`0` = 0.asInstanceOf[typings.iltorb.iltorbNumbers.`0`]
    
    @scala.inline
    def `1`: typings.iltorb.iltorbNumbers.`1` = 1.asInstanceOf[typings.iltorb.iltorbNumbers.`1`]
    
    @scala.inline
    def `2`: typings.iltorb.iltorbNumbers.`2` = 2.asInstanceOf[typings.iltorb.iltorbNumbers.`2`]
  }
  
  type IltorbCallback = js.Function2[/* err */ js.UndefOr[Error | Null], /* output */ Buffer, Unit]
}
