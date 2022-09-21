package typings.levelSupports

import typings.levelSupports.anon.PartialIManifest
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("level-supports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def supports(manifests: PartialIManifest*): IManifest = ^.asInstanceOf[js.Dynamic].applyDynamic("supports")(manifests.asInstanceOf[Seq[js.Any]]*).asInstanceOf[IManifest]
  
  trait IManifest extends StObject {
    
    /**
      * Declares support of additional methods, that are not part of the `abstract-level`
      * interface. In the form of:
      *
      * ```js
      * {
      *   foo: true,
      *   bar: true
      * }
      * ```
      *
      * Which says the db has two methods, `foo` and `bar`. It might be used like so:
      *
      * ```js
      * if (db.supports.additionalMethods.foo) {
      *   db.foo()
      * }
      * ```
      */
    var additionalMethods: Record[String, Boolean]
    
    /**
      * Does the database support `db.clear()`? Always true since `abstract-level@1`.
      */
    var clear: Boolean
    
    /**
      * Does `db.open()` and the database constructor support this option?
      */
    var createIfMissing: Boolean
    
    /**
      * Can operations like `db.put()` be called without explicitly opening the db? Like so:
      *
      * ```js
      * const db = new Level()
      * await db.put('key', 'value')
      * ```
      *
      * Always true since `abstract-level@1`.
      */
    var deferredOpen: Boolean
    
    /**
      * Which encodings (by name) does the database support, as indicated by nested
      * properties? For example:
      *
      * ```js
      * { utf8: true, json: true }
      * ```
      */
    var encodings: Record[String, Boolean]
    
    /**
      * Does `db.open()` and the database constructor support this option?
      */
    var errorIfExists: Boolean
    
    /**
      * Which events does the database emit, as indicated by nested properties? For example:
      *
      * ```js
      * if (db.supports.events.put) {
      *   db.on('put', listener)
      * }
      * ```
      */
    var events: Record[String, Boolean]
    
    /**
      * Does the database support `db.getMany()`? Always true since `abstract-level@1`.
      */
    var getMany: Boolean
    
    /**
      * Do iterators have a `all([options][, callback])` method? Always true since
      * `abstract-level@1`.
      */
    var iteratorAll: Boolean
    
    /**
      * Do iterators have a `nextv(size[, options][, callback])` method? Always true since
      * `abstract-level@1`.
      */
    var iteratorNextv: Boolean
    
    /**
      * Does the database have a `keys([options])` method that returns a key iterator?
      * Always true since `abstract-level@1`.
      */
    var keyIterator: Boolean
    
    /**
      * Does data survive after process (or environment) exit?
      */
    var permanence: Boolean
    
    /**
      * Do all database methods (that don't otherwise have a return value) support promises,
      * in addition to callbacks? Such that, when a callback argument is omitted, a promise
      * is returned:
      *
      * ```js
      * db.put('key', 'value', callback)
      * await db.put('key', 'value')
      * ```
      *
      * Always true since `abstract-level@1`.
      */
    var promises: Boolean
    
    /**
      * Do iterators support
      * [`seek(..)`](https://github.com/Level/abstract-level/#iteratorseektarget-options)?
      */
    var seek: Boolean
    
    /**
      * Does the database have snapshot guarantees? Meaning that reads are unaffected by
      * simultaneous writes. For example, an iterator should read from a snapshot of the
      * database, created at the time `db.iterator()` was called. This means the iterator
      * will not see the data of simultaneous write operations.
      */
    var snapshots: Boolean
    
    /**
      * Does the database have a
      * [`status`](https://github.com/Level/abstract-level/#dbstatus) property? Always true
      * since `abstract-level@1`.
      */
    var status: Boolean
    
    /**
      * Does database have the methods `createReadStream`, `createKeyStream` and
      * `createValueStream`, following the API documented in `levelup`? For `abstract-level`
      * databases, a standalone module called
      * [`level-read-stream`](https://github.com/Level/read-stream) is available.
      */
    var streams: Boolean
    
    /**
      * Does the database have a `values([options])` method that returns a key iterator?
      * Always true since `abstract-level@1`.
      */
    var valueIterator: Boolean
  }
  object IManifest {
    
    inline def apply(
      additionalMethods: Record[String, Boolean],
      clear: Boolean,
      createIfMissing: Boolean,
      deferredOpen: Boolean,
      encodings: Record[String, Boolean],
      errorIfExists: Boolean,
      events: Record[String, Boolean],
      getMany: Boolean,
      iteratorAll: Boolean,
      iteratorNextv: Boolean,
      keyIterator: Boolean,
      permanence: Boolean,
      promises: Boolean,
      seek: Boolean,
      snapshots: Boolean,
      status: Boolean,
      streams: Boolean,
      valueIterator: Boolean
    ): IManifest = {
      val __obj = js.Dynamic.literal(additionalMethods = additionalMethods.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], createIfMissing = createIfMissing.asInstanceOf[js.Any], deferredOpen = deferredOpen.asInstanceOf[js.Any], encodings = encodings.asInstanceOf[js.Any], errorIfExists = errorIfExists.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], getMany = getMany.asInstanceOf[js.Any], iteratorAll = iteratorAll.asInstanceOf[js.Any], iteratorNextv = iteratorNextv.asInstanceOf[js.Any], keyIterator = keyIterator.asInstanceOf[js.Any], permanence = permanence.asInstanceOf[js.Any], promises = promises.asInstanceOf[js.Any], seek = seek.asInstanceOf[js.Any], snapshots = snapshots.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], streams = streams.asInstanceOf[js.Any], valueIterator = valueIterator.asInstanceOf[js.Any])
      __obj.asInstanceOf[IManifest]
    }
    
    extension [Self <: IManifest](x: Self) {
      
      inline def setAdditionalMethods(value: Record[String, Boolean]): Self = StObject.set(x, "additionalMethods", value.asInstanceOf[js.Any])
      
      inline def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setCreateIfMissing(value: Boolean): Self = StObject.set(x, "createIfMissing", value.asInstanceOf[js.Any])
      
      inline def setDeferredOpen(value: Boolean): Self = StObject.set(x, "deferredOpen", value.asInstanceOf[js.Any])
      
      inline def setEncodings(value: Record[String, Boolean]): Self = StObject.set(x, "encodings", value.asInstanceOf[js.Any])
      
      inline def setErrorIfExists(value: Boolean): Self = StObject.set(x, "errorIfExists", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: Record[String, Boolean]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setGetMany(value: Boolean): Self = StObject.set(x, "getMany", value.asInstanceOf[js.Any])
      
      inline def setIteratorAll(value: Boolean): Self = StObject.set(x, "iteratorAll", value.asInstanceOf[js.Any])
      
      inline def setIteratorNextv(value: Boolean): Self = StObject.set(x, "iteratorNextv", value.asInstanceOf[js.Any])
      
      inline def setKeyIterator(value: Boolean): Self = StObject.set(x, "keyIterator", value.asInstanceOf[js.Any])
      
      inline def setPermanence(value: Boolean): Self = StObject.set(x, "permanence", value.asInstanceOf[js.Any])
      
      inline def setPromises(value: Boolean): Self = StObject.set(x, "promises", value.asInstanceOf[js.Any])
      
      inline def setSeek(value: Boolean): Self = StObject.set(x, "seek", value.asInstanceOf[js.Any])
      
      inline def setSnapshots(value: Boolean): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStreams(value: Boolean): Self = StObject.set(x, "streams", value.asInstanceOf[js.Any])
      
      inline def setValueIterator(value: Boolean): Self = StObject.set(x, "valueIterator", value.asInstanceOf[js.Any])
    }
  }
}
