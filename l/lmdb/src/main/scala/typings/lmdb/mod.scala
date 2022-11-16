package typings.lmdb

import org.scalablytyped.runtime.Instantiable2
import typings.lmdb.anon.DatabaseOptionsnamestring
import typings.lmdb.anon.Value
import typings.lmdb.lmdbStrings.`ordered-binary`
import typings.lmdb.lmdbStrings.aftercommit
import typings.lmdb.lmdbStrings.beforecommit
import typings.lmdb.lmdbStrings.binary
import typings.lmdb.lmdbStrings.json
import typings.lmdb.lmdbStrings.msgpack
import typings.lmdb.lmdbStrings.string
import typings.lmdb.lmdbStrings.uint32
import typings.node.bufferMod.global.Buffer
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lmdb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lmdb", "Binary")
  @js.native
  open class Binary () extends StObject
  
  @JSImport("lmdb", "Database")
  @js.native
  open class Database[V, K /* <: Key */] () extends StObject {
    
    /**
    		* Make a snapshot copy of the current database at the indicated path
    	  * @param path Path to store the backup
    		* @param compact Apply compaction while making the backup (slower and smaller)
    		**/
    def backup(path: String, compact: Boolean): js.Promise[Unit] = js.native
    
    /**
    		* Execute a set of write operations that will all be batched together in next queued asynchronous transaction.
    		* @param action The function to execute with a set of write operations.
    		**/
    def batch[T](action: js.Function0[Any]): js.Promise[Boolean] = js.native
    
    /**
    		* Execute a transaction asynchronously, running all the actions within the action callback in the transaction,
    		* and committing the transaction after the action callback completes.
    		* existing version
    		* @param action The function to execute within the transaction
    		**/
    def childTransaction[T](action: js.Function0[T]): js.Promise[T] = js.native
    
    /**
    		* @deprecated since version 2.0, use clearAsync() or clearSync() instead
    		*/
    def clear(): js.Promise[Unit] = js.native
    
    /**
    		* Asynchronously clear all the entries from this database/store.
    		**/
    def clearAsync(): js.Promise[Unit] = js.native
    
    /**
    		* Synchronously clear all the entries from this database/store.
    		**/
    def clearSync(): Unit = js.native
    
    /**
    		* Close the current database.
    		**/
    def close(): js.Promise[Unit] = js.native
    
    /** A promise-like object that resolves when previous writes have been committed.  */
    var committed: js.Promise[Boolean] = js.native
    
    /**
    		* @deprecated since version 2.0, use drop() or dropSync() instead
    		*/
    def deleteDB(): js.Promise[Unit] = js.native
    
    /**
    		* Check if an entry for the provided key exists
    		* @param id Key of the entry to check
    		*/
    def doesExist(key: K): Boolean = js.native
    /**
    		* Check if an entry for the provided key/value exists
    		* @param id Key of the entry to check
    		* @param value Value of the entry to check
    		*/
    def doesExist(key: K, value: V): Boolean = js.native
    /**
    		* Check if an entry for the provided key exists with the expected version
    		* @param id Key of the entry to check
    		* @param version Expected version
    		*/
    def doesExist(key: K, version: Double): Boolean = js.native
    
    /**
    		* Delete this database/store (asynchronously).
    		**/
    def drop(): js.Promise[Unit] = js.native
    
    /**
    		* Synchronously delete this database/store.
    		**/
    def dropSync(): Unit = js.native
    
    /** A promise-like object that resolves when previous writes have been committed and fully flushed/synced to disk/storage.  */
    var flushed: js.Promise[Boolean] = js.native
    
    /**
    		* Get the value stored by given id/key
    		* @param id The key for the entry
    		**/
    def get(id: K): js.UndefOr[V] = js.native
    def get(id: K, options: GetOptions): js.UndefOr[V] = js.native
    
    /**
    		* Get the value stored by given id/key in binary format, as a Buffer
    		* @param id The key for the entry
    		**/
    def getBinary(id: K): js.UndefOr[Buffer] = js.native
    
    /**
    		* Get the value stored by given id/key in binary format, as a temporary Buffer.
    		* This is faster, but the data is only valid until the next get operation (then it will be overwritten).
    		* @param id The key for the entry
    		**/
    def getBinaryFast(id: K): js.UndefOr[Buffer] = js.native
    
    /**
    		* Get the count of all the entries for the given range
    		* existing version
    		* @param options The options for the range/iterator
    		**/
    def getCount(): Double = js.native
    def getCount(options: RangeOptions): Double = js.native
    
    /**
    		* Get the entry stored by given id/key, which includes both the value and the version number (if available)
    		* @param id The key for the entry
    		**/
    def getEntry(id: K): js.UndefOr[Value[V]] = js.native
    
    /**
    		* Get all the unique keys for the given range
    		* existing version
    		* @param options The options for the range/iterator
    		**/
    def getKeys(): RangeIterable[K] = js.native
    def getKeys(options: RangeOptions): RangeIterable[K] = js.native
    
    /**
    		* Get the count of all the unique keys for the given range
    		* existing version
    		* @param options The options for the range/iterator
    		**/
    def getKeysCount(): Double = js.native
    def getKeysCount(options: RangeOptions): Double = js.native
    
    /**
    		* Asynchronously get the values stored by the given ids and return the
    		* values in array corresponding to the array of ids.
    		* @param ids The keys for the entries to get
    		**/
    def getMany(ids: js.Array[K]): js.Promise[js.Array[js.UndefOr[V]]] = js.native
    def getMany(ids: js.Array[K], callback: js.Function2[/* error */ Any, /* values */ js.Array[V], Any]): js.Promise[js.Array[js.UndefOr[V]]] = js.native
    
    /**
    		* Get all the entries for the given range
    		* existing version
    		* @param options The options for the range/iterator
    		**/
    def getRange(): RangeIterable[typings.lmdb.anon.Key[K, V]] = js.native
    def getRange(options: RangeOptions): RangeIterable[typings.lmdb.anon.Key[K, V]] = js.native
    
    /**
    		* Returns statistics about the current database
    		**/
    def getStats(): js.Object = js.native
    
    /**
    		* Get all the values for the given key (for dupsort databases)
    		* existing version
    		* @param key The key for the entry to remove
    		* @param options The options for the iterator
    		**/
    def getValues(key: K): RangeIterable[V] = js.native
    def getValues(key: K, options: RangeOptions): RangeIterable[V] = js.native
    
    /**
    		* Get the count of all the values for the given key (for dupsort databases)
    		* existing version
    		* @param options The options for the range/iterator
    		**/
    def getValuesCount(key: K): Double = js.native
    def getValuesCount(key: K, options: RangeOptions): Double = js.native
    
    /**
    		* Execute writes actions that are all conditionally dependent on the entry with the provided key
    		* not existing (checked atomically).
    		* @param id Key of the entry to check
    		* @param action The function to execute with actions that will be dependent on this condition
    		**/
    def ifNoExists(id: K, action: js.Function0[Any]): js.Promise[Boolean] = js.native
    
    /**
    		* Execute writes actions that are all conditionally dependent on the entry with the provided key having the provided
    		* version number (checked atomically).
    		* @param id Key of the entry to check
    		* @param ifVersion The require version number of the entry for all actions to succeed
    		* @param action The function to execute with actions that will be dependent on this condition
    		**/
    def ifVersion(id: K, ifVersion: Double, action: js.Function0[Any]): js.Promise[Boolean] = js.native
    
    /**
    		 * Add event listener
    		 */
    def on(event: beforecommit | aftercommit, callback: js.Function1[/* event */ Any, Unit]): Unit = js.native
    
    /**
    		* Asynchronously fetch the values stored by the given ids and accesses all 
    		* pages to ensure that any hard page faults and disk I/O are performed
    		* asynchronously in a separate thread. Once completed, synchronous
    		* gets to the same entries will most likely be in memory and fast.
    		* @param ids The keys for the entries to prefetch
    		**/
    def prefetch(ids: js.Array[K]): js.Promise[Unit] = js.native
    def prefetch(ids: js.Array[K], callback: js.Function): js.Promise[Unit] = js.native
    
    /**
    		* Store the provided value, using the provided id/key
    		* @param id The key for the entry
    		* @param value The value to store
    		**/
    def put(id: K, value: V): js.Promise[Boolean] = js.native
    /**
    		* Store the provided value, using the provided id/key and version number, and optionally the required
    		* existing version
    		* @param id The key for the entry
    		* @param value The value to store
    		* @param version The version number to assign to this entry
    		* @param ifVersion If provided the put will only succeed if the previous version number matches this (atomically checked)
    		**/
    def put(id: K, value: V, version: Double): js.Promise[Boolean] = js.native
    def put(id: K, value: V, version: Double, ifVersion: Double): js.Promise[Boolean] = js.native
    
    /**
    		* Synchronously store the provided value, using the provided id/key, will return after the data has been written.
    		* @param id The key for the entry
    		* @param value The value to store
    		**/
    def putSync(id: K, value: V): Unit = js.native
    /**
    		* Synchronously store the provided value, using the provided id/key and options
    		* @param id The key for the entry
    		* @param value The value to store
    		* @param options The version number to assign to this entry
    		**/
    def putSync(id: K, value: V, options: PutOptions): Unit = js.native
    /**
    		* Synchronously store the provided value, using the provided id/key and version number
    		* @param id The key for the entry
    		* @param value The value to store
    		* @param version The version number to assign to this entry
    		**/
    def putSync(id: K, value: V, version: Double): Unit = js.native
    
    /**
    		* Check the reader locks and remove any stale reader locks. Returns the number of stale locks that were removed.
    		**/
    def readerCheck(): Double = js.native
    
    /**
    		* Returns a string that describes all the current reader locks, useful for debugging if reader locks aren't being removed.
    		**/
    def readerList(): String = js.native
    
    /**
    		* Remove the entry with the provided id/key
    		* @param id The key for the entry to remove
    		**/
    def remove(id: K): js.Promise[Boolean] = js.native
    /**
    		* Remove the entry with the provided id/key, conditionally based on the provided existing version number
    		* @param id The key for the entry to remove
    		* @param ifVersion If provided the remove will only succeed if the previous version number matches this (atomically checked)
    		**/
    def remove(id: K, ifVersion: Double): js.Promise[Boolean] = js.native
    /**
    		* Remove the entry with the provided id/key and value (mainly used for dupsort databases) and optionally the required
    		* existing version
    		* @param id The key for the entry to remove
    		* @param valueToRemove The value for the entry to remove
    		**/
    def remove(id: K, valueToRemove: V): js.Promise[Boolean] = js.native
    
    /**
    		* Synchronously remove the entry with the provided id/key
    		* existing version
    		* @param id The key for the entry to remove
    		**/
    def removeSync(id: K): Boolean = js.native
    /**
    		* Synchronously remove the entry with the provided id/key and value (mainly used for dupsort databases)
    		* existing version
    		* @param id The key for the entry to remove
    		* @param valueToRemove The value for the entry to remove
    		**/
    def removeSync(id: K, valueToRemove: V): Boolean = js.native
    
    /**
    		* Explicitly force the read transaction to reset to the latest snapshot/version of the database
    		**/
    def resetReadTxn(): Unit = js.native
    
    /**
    		 * For random access structures and "fast" binary data, the underlying data is volatile,
    		 * and not safe to access after the next get. This function allows the data to
    		 * be copied as needed for safe access in the future. This can be used with buffers and random
    		 * access data structures.
    		 * @param data The data to be copied
    		 **/
    def retain(data: Any): Any = js.native
    
    /**
    		* Execute a transaction asynchronously, running all the actions within the action callback in the transaction,
    		* and committing the transaction after the action callback completes.
    		* existing version
    		* @param action The function to execute within the transaction
    		**/
    def transaction[T](action: js.Function0[T]): js.Promise[T] = js.native
    
    /**
    		 * @deprecated since version 2.0, use transaction() instead
    		 */
    def transactionAsync[T](action: js.Function0[T]): T = js.native
    
    /**
    		* Execute a transaction synchronously, running all the actions within the action callback in the transaction,
    		* and committing the transaction after the action callback completes.
    		* existing version
    		* @param action The function to execute within the transaction
    		* @params flags Additional flags specifying transaction behavior, this is optional and defaults to abortable, synchronous commits that are flushed to disk before returning
    		**/
    def transactionSync[T](action: js.Function0[T]): T = js.native
    def transactionSync[T](action: js.Function0[T], flags: TransactionFlags): T = js.native
    
    /**
    		* Returns the current transaction and marks it as in use. This can then be explicitly used for read operations
    		* @returns The transaction object
    		**/
    def useReadTransaction(): Transaction = js.native
  }
  
  @JSImport("lmdb", "DatabaseClass")
  @js.native
  open class DatabaseClass[V, K /* <: Key */] ()
    extends StObject
       with Instantiable2[
          (/* name */ Null) | (/* name */ String), 
          /* options */ DatabaseOptions, 
          Database[V, K]
        ]
  
  @JSImport("lmdb", "IF_EXISTS")
  @js.native
  val IF_EXISTS: Double = js.native
  
  @JSImport("lmdb", "RangeIterable")
  @js.native
  open class RangeIterable[T] ()
    extends StObject
       with Iterable[T] {
    
    var asArray: js.Array[T] = js.native
    
    def filter(callback: js.Function1[/* entry */ T, Any]): RangeIterable[T] = js.native
    
    def flatMap[U](callback: js.Function1[/* entry */ T, js.Array[U]]): RangeIterable[U] = js.native
    
    def forEach(callback: js.Function1[/* entry */ T, Any]): Unit = js.native
    
    def map[U](callback: js.Function1[/* entry */ T, U]): RangeIterable[U] = js.native
    
    def slice(start: Double, end: Double): RangeIterable[T] = js.native
  }
  
  @JSImport("lmdb", "RootDatabase")
  @js.native
  open class RootDatabase[V, K /* <: Key */] () extends Database[V, K] {
    
    /**
    		* Open a database store using the provided options.
    		**/
    def openDB[OV, OK /* <: Key */](dbName: String, dbOptions: DatabaseOptions): Database[OV, OK] = js.native
    /**
    		* Open a database store using the provided options.
    		**/
    def openDB[OV, OK /* <: Key */](options: DatabaseOptionsnamestring): Database[OV, OK] = js.native
  }
  
  @JSImport("lmdb", "Transaction")
  @js.native
  open class Transaction () extends StObject {
    
    /**
    		 * When there is no more need for the transaction and it can be closed.
    		 */
    def done(): Unit = js.native
  }
  
  @js.native
  sealed trait TransactionFlags extends StObject
  @JSImport("lmdb", "TransactionFlags")
  @js.native
  object TransactionFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TransactionFlags & Double] = js.native
    
    /* Indicates that the transaction needs to be abortable */
    @js.native
    sealed trait ABORTABLE
      extends StObject
         with TransactionFlags
    /* 1 */ val ABORTABLE: typings.lmdb.mod.TransactionFlags.ABORTABLE & Double = js.native
    
    /* Indicates that the function can return before the transaction has been flushed to disk */
    @js.native
    sealed trait NO_SYNC_FLUSH
      extends StObject
         with TransactionFlags
    /* 0x10000 */ val NO_SYNC_FLUSH: typings.lmdb.mod.TransactionFlags.NO_SYNC_FLUSH & Double = js.native
    
    /* Indicates that the transaction needs to be committed before returning */
    @js.native
    sealed trait SYNCHRONOUS_COMMIT
      extends StObject
         with TransactionFlags
    /* 2 */ val SYNCHRONOUS_COMMIT: typings.lmdb.mod.TransactionFlags.SYNCHRONOUS_COMMIT & Double = js.native
  }
  
  inline def asBinary(buffer: js.typedarray.Uint8Array): Binary = ^.asInstanceOf[js.Dynamic].applyDynamic("asBinary")(buffer.asInstanceOf[js.Any]).asInstanceOf[Binary]
  
  inline def compareKeys(a: Key, b: Key): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareKeys")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getLastVersion(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastVersion")().asInstanceOf[Double]
  
  inline def levelup(database: Database[Any, Key]): Database[Any, Key] = ^.asInstanceOf[js.Dynamic].applyDynamic("levelup")(database.asInstanceOf[js.Any]).asInstanceOf[Database[Any, Key]]
  
  inline def open[V, K /* <: Key */](options: RootDatabaseOptionsWithPath): RootDatabase[V, K] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(options.asInstanceOf[js.Any]).asInstanceOf[RootDatabase[V, K]]
  inline def open[V, K /* <: Key */](path: String, options: RootDatabaseOptions): RootDatabase[V, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[RootDatabase[V, K]]
  
  inline def openAsClass[V, K /* <: Key */](options: RootDatabaseOptionsWithPath): DatabaseClass[V, K] = ^.asInstanceOf[js.Dynamic].applyDynamic("openAsClass")(options.asInstanceOf[js.Any]).asInstanceOf[DatabaseClass[V, K]]
  
  @JSImport("lmdb", "v8AccelerationEnabled")
  @js.native
  def v8AccelerationEnabled: Boolean = js.native
  inline def v8AccelerationEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v8AccelerationEnabled")(x.asInstanceOf[js.Any])
  
  trait CompressionOptions extends StObject {
    
    var dictionary: js.UndefOr[Buffer] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object CompressionOptions {
    
    inline def apply(): CompressionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompressionOptions]
    }
    
    extension [Self <: CompressionOptions](x: Self) {
      
      inline def setDictionary(value: Buffer): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
      
      inline def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  trait DatabaseOptions extends StObject {
    
    var cache: js.UndefOr[Boolean | js.Object] = js.undefined
    
    var compression: js.UndefOr[Boolean | CompressionOptions] = js.undefined
    
    var dupSort: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[msgpack | json | string | binary | `ordered-binary`] = js.undefined
    
    var keyEncoding: js.UndefOr[uint32 | binary | `ordered-binary`] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var sharedStructuresKey: js.UndefOr[Key] = js.undefined
    
    var strictAsyncOrder: js.UndefOr[Boolean] = js.undefined
    
    var useVersions: js.UndefOr[Boolean] = js.undefined
  }
  object DatabaseOptions {
    
    inline def apply(): DatabaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatabaseOptions]
    }
    
    extension [Self <: DatabaseOptions](x: Self) {
      
      inline def setCache(value: Boolean | js.Object): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCompression(value: Boolean | CompressionOptions): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setDupSort(value: Boolean): Self = StObject.set(x, "dupSort", value.asInstanceOf[js.Any])
      
      inline def setDupSortUndefined: Self = StObject.set(x, "dupSort", js.undefined)
      
      inline def setEncoding(value: msgpack | json | string | binary | `ordered-binary`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setKeyEncoding(value: uint32 | binary | `ordered-binary`): Self = StObject.set(x, "keyEncoding", value.asInstanceOf[js.Any])
      
      inline def setKeyEncodingUndefined: Self = StObject.set(x, "keyEncoding", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSharedStructuresKey(value: Key): Self = StObject.set(x, "sharedStructuresKey", value.asInstanceOf[js.Any])
      
      inline def setSharedStructuresKeyUndefined: Self = StObject.set(x, "sharedStructuresKey", js.undefined)
      
      inline def setSharedStructuresKeyVarargs(value: Any*): Self = StObject.set(x, "sharedStructuresKey", js.Array(value*))
      
      inline def setStrictAsyncOrder(value: Boolean): Self = StObject.set(x, "strictAsyncOrder", value.asInstanceOf[js.Any])
      
      inline def setStrictAsyncOrderUndefined: Self = StObject.set(x, "strictAsyncOrder", js.undefined)
      
      inline def setUseVersions(value: Boolean): Self = StObject.set(x, "useVersions", value.asInstanceOf[js.Any])
      
      inline def setUseVersionsUndefined: Self = StObject.set(x, "useVersions", js.undefined)
    }
  }
  
  trait GetOptions extends StObject
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Key = std.Array<lmdb.lmdb.Key> | string | symbol | number | boolean | std.Uint8Array
  }}}
  to avoid circular code involving: 
  - lmdb.lmdb.Key
  */
  type Key = js.Array[Any] | String | js.Symbol | Double | Boolean | js.typedarray.Uint8Array
  
  trait PutOptions extends StObject {
    
    /* Append to the database using MDB_APPEND, which can be faster */
    var append: js.UndefOr[Boolean] = js.undefined
    
    /* Append to a dupsort database using MDB_APPENDDUP, which can be faster */
    var appendDup: js.UndefOr[Boolean] = js.undefined
    
    /* Perform put with MDB_NODUPDATA which will fail if the entry for the key/value already exists */
    var noDupData: js.UndefOr[Boolean] = js.undefined
    
    /* Perform put with MDB_NOOVERWRITE which will fail if the entry for the key already exists */
    var noOverwrite: js.UndefOr[Boolean] = js.undefined
    
    /* The version of the entry to set */
    var version: js.UndefOr[Double] = js.undefined
  }
  object PutOptions {
    
    inline def apply(): PutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutOptions]
    }
    
    extension [Self <: PutOptions](x: Self) {
      
      inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendDup(value: Boolean): Self = StObject.set(x, "appendDup", value.asInstanceOf[js.Any])
      
      inline def setAppendDupUndefined: Self = StObject.set(x, "appendDup", js.undefined)
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setNoDupData(value: Boolean): Self = StObject.set(x, "noDupData", value.asInstanceOf[js.Any])
      
      inline def setNoDupDataUndefined: Self = StObject.set(x, "noDupData", js.undefined)
      
      inline def setNoOverwrite(value: Boolean): Self = StObject.set(x, "noOverwrite", value.asInstanceOf[js.Any])
      
      inline def setNoOverwriteUndefined: Self = StObject.set(x, "noOverwrite", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait RangeOptions extends StObject {
    
    /** Ending key for a range **/
    var end: js.UndefOr[Key] = js.undefined
    
    /** The maximum number of entries to return **/
    var limit: js.UndefOr[Double] = js.undefined
    
    /** The number of entries to skip **/
    var offset: js.UndefOr[Double] = js.undefined
    
    /** Iterate through the entries in reverse order **/
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    /** Use a snapshot of the database from when the iterator started **/
    var snapshot: js.UndefOr[Boolean] = js.undefined
    
    /** Starting key for a range **/
    var start: js.UndefOr[Key] = js.undefined
    
    /** Use the provided transaction for this range query */
    var transaction: js.UndefOr[Transaction] = js.undefined
    
    /** Include version numbers in each entry returned **/
    var versions: js.UndefOr[Boolean] = js.undefined
  }
  object RangeOptions {
    
    inline def apply(): RangeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeOptions]
    }
    
    extension [Self <: RangeOptions](x: Self) {
      
      inline def setEnd(value: Key): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setEndVarargs(value: Any*): Self = StObject.set(x, "end", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSnapshot(value: Boolean): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
      
      inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
      
      inline def setStart(value: Key): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStartVarargs(value: Any*): Self = StObject.set(x, "start", js.Array(value*))
      
      inline def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
      
      inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
      
      inline def setVersions(value: Boolean): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    }
  }
  
  trait RootDatabaseOptions
    extends StObject
       with DatabaseOptions {
    
    /** Set a longer delay (in milliseconds) to wait longer before committing writes to increase the number of writes per transaction (higher latency, but more efficient) **/
    var commitDelay: js.UndefOr[Double] = js.undefined
    
    var mapSize: js.UndefOr[Double] = js.undefined
    
    /** The maximum number of databases to be able to open (there is some extra overhead if this is set very high).*/
    var maxDbs: js.UndefOr[Double] = js.undefined
    
    var maxReaders: js.UndefOr[Double] = js.undefined
    
    /** This provides a small performance boost (when not using useWritemap) for writes, by skipping zero'ing out malloc'ed data, but can leave application data in unused portions of the database. This is recommended unless there are concerns of database files being accessible. */
    var noMemInit: js.UndefOr[Boolean] = js.undefined
    
    var noMetaSync: js.UndefOr[Boolean] = js.undefined
    
    var noSubdir: js.UndefOr[Boolean] = js.undefined
    
    var noSync: js.UndefOr[Boolean] = js.undefined
    
    var overlappingSync: js.UndefOr[Boolean] = js.undefined
    
    var pageSize: js.UndefOr[Double] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var remapChunks: js.UndefOr[Boolean] = js.undefined
    
    var separateFlushed: js.UndefOr[Boolean] = js.undefined
    
    /** Use writemaps, discouraged at this. This improves performance by reducing malloc calls, but it is possible for a stray pointer to corrupt data. */
    var useWritemap: js.UndefOr[Boolean] = js.undefined
  }
  object RootDatabaseOptions {
    
    inline def apply(): RootDatabaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootDatabaseOptions]
    }
    
    extension [Self <: RootDatabaseOptions](x: Self) {
      
      inline def setCommitDelay(value: Double): Self = StObject.set(x, "commitDelay", value.asInstanceOf[js.Any])
      
      inline def setCommitDelayUndefined: Self = StObject.set(x, "commitDelay", js.undefined)
      
      inline def setMapSize(value: Double): Self = StObject.set(x, "mapSize", value.asInstanceOf[js.Any])
      
      inline def setMapSizeUndefined: Self = StObject.set(x, "mapSize", js.undefined)
      
      inline def setMaxDbs(value: Double): Self = StObject.set(x, "maxDbs", value.asInstanceOf[js.Any])
      
      inline def setMaxDbsUndefined: Self = StObject.set(x, "maxDbs", js.undefined)
      
      inline def setMaxReaders(value: Double): Self = StObject.set(x, "maxReaders", value.asInstanceOf[js.Any])
      
      inline def setMaxReadersUndefined: Self = StObject.set(x, "maxReaders", js.undefined)
      
      inline def setNoMemInit(value: Boolean): Self = StObject.set(x, "noMemInit", value.asInstanceOf[js.Any])
      
      inline def setNoMemInitUndefined: Self = StObject.set(x, "noMemInit", js.undefined)
      
      inline def setNoMetaSync(value: Boolean): Self = StObject.set(x, "noMetaSync", value.asInstanceOf[js.Any])
      
      inline def setNoMetaSyncUndefined: Self = StObject.set(x, "noMetaSync", js.undefined)
      
      inline def setNoSubdir(value: Boolean): Self = StObject.set(x, "noSubdir", value.asInstanceOf[js.Any])
      
      inline def setNoSubdirUndefined: Self = StObject.set(x, "noSubdir", js.undefined)
      
      inline def setNoSync(value: Boolean): Self = StObject.set(x, "noSync", value.asInstanceOf[js.Any])
      
      inline def setNoSyncUndefined: Self = StObject.set(x, "noSync", js.undefined)
      
      inline def setOverlappingSync(value: Boolean): Self = StObject.set(x, "overlappingSync", value.asInstanceOf[js.Any])
      
      inline def setOverlappingSyncUndefined: Self = StObject.set(x, "overlappingSync", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRemapChunks(value: Boolean): Self = StObject.set(x, "remapChunks", value.asInstanceOf[js.Any])
      
      inline def setRemapChunksUndefined: Self = StObject.set(x, "remapChunks", js.undefined)
      
      inline def setSeparateFlushed(value: Boolean): Self = StObject.set(x, "separateFlushed", value.asInstanceOf[js.Any])
      
      inline def setSeparateFlushedUndefined: Self = StObject.set(x, "separateFlushed", js.undefined)
      
      inline def setUseWritemap(value: Boolean): Self = StObject.set(x, "useWritemap", value.asInstanceOf[js.Any])
      
      inline def setUseWritemapUndefined: Self = StObject.set(x, "useWritemap", js.undefined)
    }
  }
  
  trait RootDatabaseOptionsWithPath
    extends StObject
       with RootDatabaseOptions {
    
    var path: String
  }
  object RootDatabaseOptionsWithPath {
    
    inline def apply(path: String): RootDatabaseOptionsWithPath = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RootDatabaseOptionsWithPath]
    }
    
    extension [Self <: RootDatabaseOptionsWithPath](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
