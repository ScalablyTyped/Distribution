package typings.lokijs

import org.scalablytyped.runtime.StringDictionary
import typings.lokijs.anon.AsyncResponses
import typings.lokijs.anon.Found
import typings.lokijs.anon.Lastsave
import typings.lokijs.anon.PageSize
import typings.lokijs.anon.PartialLokiConstructorOpt
import typings.lokijs.lokijsNumbers.`-1`
import typings.lokijs.lokijsNumbers.`0`
import typings.lokijs.lokijsNumbers.`1`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * LokiJS
    * A lightweight document oriented javascript database
    * @author Joe Minichino <joe.minichino@gmail.com>
    */
  @JSImport("lokijs", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Loki {
    def this(filename: String) = this()
    def this(filename: String, options: PartialLokiConstructorOpt) = this()
  }
  @JSImport("lokijs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lokijs", "Collection")
  @js.native
  class Collection[E /* <: js.Object */] ()
    extends StObject
       with typings.lokijs.Collection[E]
  
  @JSImport("lokijs", "KeyValueStore")
  @js.native
  class KeyValueStore ()
    extends StObject
       with typings.lokijs.KeyValueStore {
    
    /* CompleteClass */
    override def bs(): js.Function2[/* array */ js.Array[js.Any], /* item */ js.Any, Found] = js.native
    
    /* CompleteClass */
    override def get(key: js.Any): js.Array[js.Any] = js.native
    
    /* CompleteClass */
    var keys: js.Array[js.Any] = js.native
    
    /* CompleteClass */
    override def set(key: js.Any, value: js.Any): Unit = js.native
    
    /* CompleteClass */
    override def setSort(fun: js.Function2[/* target */ js.Any, /* test */ js.Any, js.Any]): Unit = js.native
    
    /* CompleteClass */
    override def sort(a: js.Any, b: js.Any): `-1` | `0` | `1` = js.native
    
    /* CompleteClass */
    var values: js.Array[js.Any] = js.native
  }
  
  @JSImport("lokijs", "LokiFsAdapter")
  @js.native
  class LokiFsAdapter ()
    extends StObject
       with typings.lokijs.LokiFsAdapter {
    
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  }
  
  @JSImport("lokijs", "LokiLocalStorageAdapter")
  @js.native
  class LokiLocalStorageAdapter ()
    extends StObject
       with typings.lokijs.LokiLocalStorageAdapter {
    
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
  
  @JSImport("lokijs", "LokiMemoryAdapter")
  @js.native
  class LokiMemoryAdapter ()
    extends StObject
       with typings.lokijs.LokiMemoryAdapter {
    
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
    var hashStore: StringDictionary[Lastsave] = js.native
    
    /* CompleteClass */
    override def loadDatabase(dbname: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
    
    /* CompleteClass */
    var options: AsyncResponses = js.native
    
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
  
  @JSImport("lokijs", "LokiOps")
  @js.native
  def LokiOps: typings.lokijs.LokiOps = js.native
  inline def LokiOps_=(x: LokiOps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LokiOps")(x.asInstanceOf[js.Any])
  
  @JSImport("lokijs", "LokiPartitioningAdapter")
  @js.native
  class LokiPartitioningAdapter ()
    extends StObject
       with typings.lokijs.LokiPartitioningAdapter {
    
    /* CompleteClass */
    var adapter: LokiPersistenceAdapter | Null = js.native
    
    /* CompleteClass */
    var dbname: String = js.native
    
    /* CompleteClass */
    var dbref: Loki | Null = js.native
    
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
    override def exportDatabase_MLokiPartitioningAdapter(dbname: String, dbref: Loki, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
    
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
    
    /* CompleteClass */
    @JSName("mode")
    var mode_LokiPartitioningAdapter: String = js.native
    
    /* CompleteClass */
    var options: PageSize = js.native
    
    /* CompleteClass */
    var pageIterator: PageIterator | js.Object = js.native
    
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
  
  inline def aeq(prop1: js.Any, prop2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aeq")(prop1.asInstanceOf[js.Any], prop2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def gt(prop1: js.Any, prop2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(prop1.asInstanceOf[js.Any], prop2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def gt(prop1: js.Any, prop2: js.Any, equal: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(prop1.asInstanceOf[js.Any], prop2.asInstanceOf[js.Any], equal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lt(prop1: js.Any, prop2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(prop1.asInstanceOf[js.Any], prop2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def lt(prop1: js.Any, prop2: js.Any, equal: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(prop1.asInstanceOf[js.Any], prop2.asInstanceOf[js.Any], equal.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  object persistenceAdapters {
    
    @JSImport("lokijs", "persistenceAdapters")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("lokijs", "persistenceAdapters.fs")
    @js.native
    def fs: _LokiFsAdapter = js.native
    inline def fs_=(x: _LokiFsAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fs")(x.asInstanceOf[js.Any])
    
    @JSImport("lokijs", "persistenceAdapters.localStorage")
    @js.native
    def localStorage: _LokiLocalStorageAdapter = js.native
    inline def localStorage_=(x: _LokiLocalStorageAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("localStorage")(x.asInstanceOf[js.Any])
  }
}
