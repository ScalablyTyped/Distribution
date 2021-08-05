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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("leveldown", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with LevelDown {
    def this(location: String) = this()
  }
  @JSImport("leveldown", JSImport.Default)
  @js.native
  val default: LevelDownConstructor = js.native
  
  type Bytes = String | Buffer
  
  type ErrorSizeCallback = js.Function2[/* err */ js.UndefOr[Error], /* size */ Double, Unit]
  
  @js.native
  trait LevelDown
    extends StObject
       with AbstractLevelDOWN[Bytes, Bytes] {
    
    def approximateSize(start: Bytes, end: Bytes, cb: ErrorSizeCallback): Unit = js.native
    
    def batch(array: js.Array[AbstractBatch[js.Any, js.Any]], options: LevelDownBatchOptions, cb: ErrorCallback): AbstractChainedBatch[Bytes, Bytes] = js.native
    
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
  
  trait LevelDownBatchOptions
    extends StObject
       with AbstractOptions {
    
    var sync: js.UndefOr[Boolean] = js.undefined
  }
  object LevelDownBatchOptions {
    
    inline def apply(): LevelDownBatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelDownBatchOptions]
    }
    
    extension [Self <: LevelDownBatchOptions](x: Self) {
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  trait LevelDownClearOptions extends StObject {
    
    var gt: js.UndefOr[Bytes] = js.undefined
    
    var gte: js.UndefOr[Bytes] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var lt: js.UndefOr[Bytes] = js.undefined
    
    var lte: js.UndefOr[Bytes] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object LevelDownClearOptions {
    
    inline def apply(): LevelDownClearOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelDownClearOptions]
    }
    
    extension [Self <: LevelDownClearOptions](x: Self) {
      
      inline def setGt(value: Bytes): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
      
      inline def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
      
      inline def setGte(value: Bytes): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
      
      inline def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLt(value: Bytes): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
      
      inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
      
      inline def setLte(value: Bytes): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
      
      inline def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  @js.native
  trait LevelDownConstructor
    extends StObject
       with Instantiable1[/* location */ String, LevelDown] {
    
    def apply(location: String): LevelDown = js.native
    
    def destroy(location: String, cb: ErrorCallback): Unit = js.native
    
    def repair(location: String, cb: ErrorCallback): Unit = js.native
  }
  
  trait LevelDownDelOptions
    extends StObject
       with AbstractOptions {
    
    var sync: js.UndefOr[Boolean] = js.undefined
  }
  object LevelDownDelOptions {
    
    inline def apply(): LevelDownDelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelDownDelOptions]
    }
    
    extension [Self <: LevelDownDelOptions](x: Self) {
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  trait LevelDownGetOptions
    extends StObject
       with AbstractGetOptions {
    
    var fillCache: js.UndefOr[Boolean] = js.undefined
  }
  object LevelDownGetOptions {
    
    inline def apply(): LevelDownGetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelDownGetOptions]
    }
    
    extension [Self <: LevelDownGetOptions](x: Self) {
      
      inline def setFillCache(value: Boolean): Self = StObject.set(x, "fillCache", value.asInstanceOf[js.Any])
      
      inline def setFillCacheUndefined: Self = StObject.set(x, "fillCache", js.undefined)
    }
  }
  
  trait LevelDownIterator
    extends StObject
       with AbstractIterator[Bytes, Bytes] {
    
    var binding: js.Any
    
    var cache: js.Any
    
    var fastFuture: js.Any
    
    var finished: js.Any
    
    def seek(key: Bytes): Unit
  }
  object LevelDownIterator {
    
    inline def apply(
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
    
    extension [Self <: LevelDownIterator](x: Self) {
      
      inline def setBinding(value: js.Any): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
      
      inline def setCache(value: js.Any): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setFastFuture(value: js.Any): Self = StObject.set(x, "fastFuture", value.asInstanceOf[js.Any])
      
      inline def setFinished(value: js.Any): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setSeek(value: Bytes => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    }
  }
  
  trait LevelDownIteratorOptions
    extends StObject
       with AbstractIteratorOptions[Bytes] {
    
    var fillCache: js.UndefOr[Boolean] = js.undefined
  }
  object LevelDownIteratorOptions {
    
    inline def apply(): LevelDownIteratorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelDownIteratorOptions]
    }
    
    extension [Self <: LevelDownIteratorOptions](x: Self) {
      
      inline def setFillCache(value: Boolean): Self = StObject.set(x, "fillCache", value.asInstanceOf[js.Any])
      
      inline def setFillCacheUndefined: Self = StObject.set(x, "fillCache", js.undefined)
    }
  }
  
  trait LevelDownOpenOptions
    extends StObject
       with AbstractOpenOptions {
    
    var blockRestartInterval: js.UndefOr[Double] = js.undefined
    
    var blockSize: js.UndefOr[Double] = js.undefined
    
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var maxFileSize: js.UndefOr[Double] = js.undefined
    
    var maxOpenFiles: js.UndefOr[Double] = js.undefined
    
    var writeBufferSize: js.UndefOr[Double] = js.undefined
  }
  object LevelDownOpenOptions {
    
    inline def apply(): LevelDownOpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelDownOpenOptions]
    }
    
    extension [Self <: LevelDownOpenOptions](x: Self) {
      
      inline def setBlockRestartInterval(value: Double): Self = StObject.set(x, "blockRestartInterval", value.asInstanceOf[js.Any])
      
      inline def setBlockRestartIntervalUndefined: Self = StObject.set(x, "blockRestartInterval", js.undefined)
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
      
      inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
      
      inline def setMaxOpenFiles(value: Double): Self = StObject.set(x, "maxOpenFiles", value.asInstanceOf[js.Any])
      
      inline def setMaxOpenFilesUndefined: Self = StObject.set(x, "maxOpenFiles", js.undefined)
      
      inline def setWriteBufferSize(value: Double): Self = StObject.set(x, "writeBufferSize", value.asInstanceOf[js.Any])
      
      inline def setWriteBufferSizeUndefined: Self = StObject.set(x, "writeBufferSize", js.undefined)
    }
  }
  
  trait LevelDownPutOptions
    extends StObject
       with AbstractOptions {
    
    var sync: js.UndefOr[Boolean] = js.undefined
  }
  object LevelDownPutOptions {
    
    inline def apply(): LevelDownPutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelDownPutOptions]
    }
    
    extension [Self <: LevelDownPutOptions](x: Self) {
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
  
  type _To = LevelDownConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: LevelDownConstructor = default
}
