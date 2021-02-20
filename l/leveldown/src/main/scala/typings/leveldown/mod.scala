package typings.leveldown

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.abstractLeveldown.mod.AbstractBatch
import typings.abstractLeveldown.mod.AbstractChainedBatch
import typings.abstractLeveldown.mod.AbstractGetOptions
import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractIteratorOptions
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.abstractLeveldown.mod.AbstractOpenOptions
import typings.abstractLeveldown.mod.AbstractOptions
import typings.abstractLeveldown.mod.ErrorCallback
import typings.abstractLeveldown.mod.ErrorKeyValueCallback
import typings.abstractLeveldown.mod.ErrorValueCallback
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("leveldown", JSImport.Default)
  @js.native
  class default protected () extends LevelDown {
    def this(location: String) = this()
  }
  @JSImport("leveldown", JSImport.Default)
  @js.native
  val default: LevelDownConstructor = js.native
  
  type Bytes = String | Buffer
  
  type ErrorSizeCallback = js.Function2[/* err */ js.UndefOr[Error], /* size */ Double, Unit]
  
  @js.native
  trait LevelDown extends AbstractLevelDOWN[Bytes, Bytes] {
    
    def approximateSize(start: Bytes, end: Bytes, cb: ErrorSizeCallback): Unit = js.native
    
    def batch(array: js.Array[AbstractBatch[_, _]], options: LevelDownBatchOptions, cb: ErrorCallback): AbstractChainedBatch[Bytes, Bytes] = js.native
    
    def clear(cb: ErrorCallback): Unit = js.native
    def clear(options: LevelDownClearOptions, cb: ErrorCallback): Unit = js.native
    
    def compactRange(start: Bytes, end: Bytes, cb: ErrorCallback): Unit = js.native
    
    def del(key: Bytes, options: LevelDownDelOptions, cb: ErrorCallback): Unit = js.native
    
    def get(key: Bytes, options: LevelDownGetOptions, cb: ErrorValueCallback[Bytes]): Unit = js.native
    
    def getProperty(property: String): String = js.native
    
    def iterator(options: LevelDownIteratorOptions): LevelDownIterator = js.native
    
    def open(options: LevelDownOpenOptions, cb: ErrorCallback): Unit = js.native
    
    def put(key: Bytes, value: Bytes, options: LevelDownPutOptions, cb: ErrorCallback): Unit = js.native
  }
  
  @js.native
  trait LevelDownBatchOptions extends AbstractOptions {
    
    var sync: js.UndefOr[Boolean] = js.native
  }
  object LevelDownBatchOptions {
    
    @scala.inline
    def apply(): LevelDownBatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelDownBatchOptions]
    }
    
    @scala.inline
    implicit class LevelDownBatchOptionsMutableBuilder[Self <: LevelDownBatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  @js.native
  trait LevelDownClearOptions extends StObject {
    
    var gt: js.UndefOr[Bytes] = js.native
    
    var gte: js.UndefOr[Bytes] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var lt: js.UndefOr[Bytes] = js.native
    
    var lte: js.UndefOr[Bytes] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
  }
  object LevelDownClearOptions {
    
    @scala.inline
    def apply(): LevelDownClearOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelDownClearOptions]
    }
    
    @scala.inline
    implicit class LevelDownClearOptionsMutableBuilder[Self <: LevelDownClearOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGt(value: Bytes): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
      
      @scala.inline
      def setGte(value: Bytes): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setLt(value: Bytes): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
      
      @scala.inline
      def setLte(value: Bytes): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  @js.native
  trait LevelDownConstructor extends Instantiable1[/* location */ String, LevelDown] {
    
    def apply(location: String): LevelDown = js.native
    
    def destroy(location: String, cb: ErrorCallback): Unit = js.native
    
    def repair(location: String, cb: ErrorCallback): Unit = js.native
  }
  
  @js.native
  trait LevelDownDelOptions extends AbstractOptions {
    
    var sync: js.UndefOr[Boolean] = js.native
  }
  object LevelDownDelOptions {
    
    @scala.inline
    def apply(): LevelDownDelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelDownDelOptions]
    }
    
    @scala.inline
    implicit class LevelDownDelOptionsMutableBuilder[Self <: LevelDownDelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  @js.native
  trait LevelDownGetOptions extends AbstractGetOptions {
    
    var fillCache: js.UndefOr[Boolean] = js.native
  }
  object LevelDownGetOptions {
    
    @scala.inline
    def apply(): LevelDownGetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelDownGetOptions]
    }
    
    @scala.inline
    implicit class LevelDownGetOptionsMutableBuilder[Self <: LevelDownGetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFillCache(value: Boolean): Self = StObject.set(x, "fillCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillCacheUndefined: Self = StObject.set(x, "fillCache", js.undefined)
    }
  }
  
  @js.native
  trait LevelDownIterator extends AbstractIterator[Bytes, Bytes] {
    
    var binding: js.Any = js.native
    
    var cache: js.Any = js.native
    
    var fastFuture: js.Any = js.native
    
    var finished: js.Any = js.native
    
    def seek(key: Bytes): Unit = js.native
  }
  object LevelDownIterator {
    
    @scala.inline
    def apply(
      binding: js.Any,
      cache: js.Any,
      db: AbstractLevelDOWN[Bytes, Bytes],
      end: ErrorCallback => Unit,
      fastFuture: js.Any,
      finished: js.Any,
      next: ErrorKeyValueCallback[Bytes, Bytes] => LevelDownIterator,
      seek: Bytes => Unit
    ): LevelDownIterator = {
      val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), fastFuture = fastFuture.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], next = js.Any.fromFunction1(next), seek = js.Any.fromFunction1(seek))
      __obj.asInstanceOf[LevelDownIterator]
    }
    
    @scala.inline
    implicit class LevelDownIteratorMutableBuilder[Self <: LevelDownIterator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinding(value: js.Any): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFastFuture(value: js.Any): Self = StObject.set(x, "fastFuture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinished(value: js.Any): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeek(value: Bytes => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait LevelDownIteratorOptions extends AbstractIteratorOptions[Bytes] {
    
    var fillCache: js.UndefOr[Boolean] = js.native
  }
  object LevelDownIteratorOptions {
    
    @scala.inline
    def apply(): LevelDownIteratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelDownIteratorOptions]
    }
    
    @scala.inline
    implicit class LevelDownIteratorOptionsMutableBuilder[Self <: LevelDownIteratorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFillCache(value: Boolean): Self = StObject.set(x, "fillCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillCacheUndefined: Self = StObject.set(x, "fillCache", js.undefined)
    }
  }
  
  @js.native
  trait LevelDownOpenOptions extends AbstractOpenOptions {
    
    var blockRestartInterval: js.UndefOr[Double] = js.native
    
    var blockSize: js.UndefOr[Double] = js.native
    
    var cacheSize: js.UndefOr[Double] = js.native
    
    var compression: js.UndefOr[Boolean] = js.native
    
    var maxFileSize: js.UndefOr[Double] = js.native
    
    var maxOpenFiles: js.UndefOr[Double] = js.native
    
    var writeBufferSize: js.UndefOr[Double] = js.native
  }
  object LevelDownOpenOptions {
    
    @scala.inline
    def apply(): LevelDownOpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelDownOpenOptions]
    }
    
    @scala.inline
    implicit class LevelDownOpenOptionsMutableBuilder[Self <: LevelDownOpenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockRestartInterval(value: Double): Self = StObject.set(x, "blockRestartInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockRestartIntervalUndefined: Self = StObject.set(x, "blockRestartInterval", js.undefined)
      
      @scala.inline
      def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      @scala.inline
      def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      @scala.inline
      def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      @scala.inline
      def setMaxOpenFiles(value: Double): Self = StObject.set(x, "maxOpenFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxOpenFilesUndefined: Self = StObject.set(x, "maxOpenFiles", js.undefined)
      
      @scala.inline
      def setWriteBufferSize(value: Double): Self = StObject.set(x, "writeBufferSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteBufferSizeUndefined: Self = StObject.set(x, "writeBufferSize", js.undefined)
    }
  }
  
  @js.native
  trait LevelDownPutOptions extends AbstractOptions {
    
    var sync: js.UndefOr[Boolean] = js.native
  }
  object LevelDownPutOptions {
    
    @scala.inline
    def apply(): LevelDownPutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelDownPutOptions]
    }
    
    @scala.inline
    implicit class LevelDownPutOptionsMutableBuilder[Self <: LevelDownPutOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  type _To = LevelDownConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: LevelDownConstructor = default
}
