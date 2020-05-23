package typings.lokijs.global

import org.scalablytyped.runtime.StringDictionary
import typings.lokijs.LokiPersistenceAdapter
import typings.lokijs.PageIterator
import typings.lokijs.anon.AsyncResponses
import typings.lokijs.anon.Found
import typings.lokijs.anon.Lastsave
import typings.lokijs.anon.PageSize
import typings.lokijs.anon.PartialLokiConstructorOpt
import typings.lokijs.lokijsNumbers.`-1`
import typings.lokijs.lokijsNumbers.`0`
import typings.lokijs.lokijsNumbers.`1`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LokiJS
  * A lightweight document oriented javascript database
  * @author Joe Minichino <joe.minichino@gmail.com>
  */
@JSGlobal("LokiConstructor")
@js.native
class LokiConstructor protected ()
  extends typings.lokijs.Loki {
  def this(filename: String) = this()
  def this(filename: String, options: PartialLokiConstructorOpt) = this()
}

@JSGlobal("LokiConstructor")
@js.native
object LokiConstructor extends js.Object {
  @js.native
  class Collection[E /* <: js.Object */] ()
    extends typings.lokijs.Collection[E]
  
  @js.native
  class KeyValueStore ()
    extends typings.lokijs.KeyValueStore {
    /* CompleteClass */
    override var keys: js.Array[_] = js.native
    /* CompleteClass */
    override var values: js.Array[_] = js.native
    /* CompleteClass */
    override def bs(): js.Function2[/* array */ js.Array[_], /* item */ js.Any, Found] = js.native
    /* CompleteClass */
    override def get(key: js.Any): js.Array[_] = js.native
    /* CompleteClass */
    override def set(key: js.Any, value: js.Any): Unit = js.native
    /* CompleteClass */
    override def setSort(fun: js.Function2[/* target */ js.Any, /* test */ js.Any, _]): Unit = js.native
    /* CompleteClass */
    override def sort(a: js.Any, b: js.Any): `-1` | `0` | `1` = js.native
  }
  
  @js.native
  class LokiFsAdapter ()
    extends typings.lokijs.LokiFsAdapter {
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  }
  
  @js.native
  class LokiLocalStorageAdapter ()
    extends typings.lokijs.LokiLocalStorageAdapter {
    /**
      * deleteDatabase() - delete the database from localstorage, will throw an error if it
      * can't be deleted
      * @param dbname - the filename of the database to delete
      * @param callback - the callback to handle the result
      */
    /* CompleteClass */
    override def deleteDatabase(dbname: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    /**
      * loadDatabase() - Load data from localstorage
      * @param dbname - the name of the database to load
      * @param callback - the callback to handle the result
      */
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* dataOrError */ js.Any | Error, Unit]): Unit = js.native
    /**
      * saveDatabase() - save data to localstorage, will throw an error if the file can't be saved
      * might want to expand this to avoid dataloss on partial save
      * @param dbname - the filename of the database to load
      * @param callback - the callback to handle the result
      */
    /* CompleteClass */
    override def saveDatabase(dbname: String, dbstring: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  }
  
  @js.native
  class LokiMemoryAdapter ()
    extends typings.lokijs.LokiMemoryAdapter {
    /* CompleteClass */
    override var hashStore: StringDictionary[Lastsave] = js.native
    /* CompleteClass */
    override var options: AsyncResponses = js.native
    /**
      * Deletes a database from its in-memory store.
      *
      * @param dbname - name of the database (filename/keyname)
      * @param callback - function to call when done
      */
    /* CompleteClass */
    @JSName("deleteDatabase")
    override def deleteDatabase_MLokiMemoryAdapter(dbname: String, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
    /**
      * Saves a serialized database to its in-memory store.
      * (Loki persistence adapter interface function)
      *
      * @param dbname - name of the database (filename/keyname)
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    @JSName("saveDatabase")
    override def saveDatabase_MLokiMemoryAdapter(dbname: String, dbstring: js.Any, callback: js.Function1[/* err */ js.UndefOr[Error | Null], Unit]): Unit = js.native
  }
  
  @js.native
  class LokiPartitioningAdapter ()
    extends typings.lokijs.LokiPartitioningAdapter {
    /* CompleteClass */
    override var adapter: LokiPersistenceAdapter | Null = js.native
    /* CompleteClass */
    override var dbname: String = js.native
    /* CompleteClass */
    override var dbref: typings.lokijs.Loki | Null = js.native
    /* CompleteClass */
    @JSName("mode")
    override var mode_LokiPartitioningAdapter: String = js.native
    /* CompleteClass */
    override var options: PageSize = js.native
    /* CompleteClass */
    override var pageIterator: PageIterator | js.Object = js.native
    /**
      * Saves a database by partioning into separate key/value saves.
      * (Loki 'reference mode' persistence adapter interface function)
      *
      * @param dbname - name of the database (filename/keyname)
      * @param dbref - reference to database which we will partition and save.
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    @JSName("exportDatabase")
    override def exportDatabase_MLokiPartitioningAdapter(dbname: String, dbref: typings.lokijs.Loki, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
    /**
      * Used to sequentially load the next page of collection partition, one at a time.
      *
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def loadNextPage(callback: js.Function0[Unit]): Unit = js.native
    /**
      * Used to sequentially load each collection partition, one at a time.
      *
      * @param partition - ordinal collection position to load next
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def loadNextPartition(partition: Double, callback: js.Function0[Unit]): Unit = js.native
    /**
      * Helper method used internally to generate and save the next page of the current (dirty) partition.
      *
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def saveNextPage(callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    /**
      * Helper method used internally to save each dirty collection, one at a time.
      *
      * @param callback - adapter callback to return load result to caller
      */
    /* CompleteClass */
    override def saveNextPartition(callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  }
  
  var LokiOps: typings.lokijs.LokiOps = js.native
  def aeq(prop1: js.Any, prop2: js.Any): Boolean = js.native
  def gt(prop1: js.Any, prop2: js.Any): Boolean = js.native
  def gt(prop1: js.Any, prop2: js.Any, equal: Boolean): Boolean = js.native
  def lt(prop1: js.Any, prop2: js.Any): Boolean = js.native
  def lt(prop1: js.Any, prop2: js.Any, equal: Boolean): Boolean = js.native
  @js.native
  object persistenceAdapters extends js.Object {
    var fs: typings.lokijs._LokiFsAdapter = js.native
    var localStorage: typings.lokijs._LokiLocalStorageAdapter = js.native
  }
  
}

