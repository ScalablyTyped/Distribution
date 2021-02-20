package typings.lokijs

import typings.lokijs.anon.PageSize
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An adapter for adapters.  Converts a non reference mode adapter into a reference mode adapter
  * which can perform destructuring and partioning.  Each collection will be stored in its own key/save and
  * only dirty collections will be saved.  If you  turn on paging with default page size of 25megs and save
  * a 75 meg collection it should use up roughly 3 save slots (key/value pairs sent to inner adapter).
  * A dirty collection that spans three pages will save all three pages again
  * Paging mode was added mainly because Chrome has issues saving 'too large' of a string within a
  * single indexeddb row.  If a single document update causes the collection to be flagged as dirty, all
  * of that collection's pages will be written on next save.
  *
  * @param adapter - reference to a 'non-reference' mode loki adapter instance.
  * @param options - configuration options for partitioning and paging
  * @param [options.paging] - (default: false) set to true to enable paging collection data.
  * @param [options.pageSize] - (default : 25MB) you can use this to limit size of strings passed to inner adapter.
  * @param [options.delimiter] - allows you to override the default delimeter
  * @constructor LokiPartitioningAdapter
  */
@js.native
trait LokiPartitioningAdapter extends LokiPersistenceAdapter {
  
  var adapter: LokiPersistenceAdapter | Null = js.native
  
  var dbname: String = js.native
  
  var dbref: Loki | Null = js.native
  
  var dirtyPartitions: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * Saves a database by partioning into separate key/value saves.
    * (Loki 'reference mode' persistence adapter interface function)
    *
    * @param dbname - name of the database (filename/keyname)
    * @param dbref - reference to database which we will partition and save.
    * @param callback - adapter callback to return load result to caller
    */
  @JSName("exportDatabase")
  def exportDatabase_MLokiPartitioningAdapter(dbname: String, dbref: Loki, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  /**
    * Used to sequentially load the next page of collection partition, one at a time.
    *
    * @param callback - adapter callback to return load result to caller
    */
  def loadNextPage(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Used to sequentially load each collection partition, one at a time.
    *
    * @param partition - ordinal collection position to load next
    * @param callback - adapter callback to return load result to caller
    */
  def loadNextPartition(partition: Double, callback: js.Function0[Unit]): Unit = js.native
  
  @JSName("mode")
  var mode_LokiPartitioningAdapter: String = js.native
  
  var options: PageSize = js.native
  
  var pageIterator: PageIterator | js.Object = js.native
  
  /**
    * Helper method used internally to generate and save the next page of the current (dirty) partition.
    *
    * @param callback - adapter callback to return load result to caller
    */
  def saveNextPage(callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  
  /**
    * Helper method used internally to save each dirty collection, one at a time.
    *
    * @param callback - adapter callback to return load result to caller
    */
  def saveNextPartition(callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
}
object LokiPartitioningAdapter {
  
  @scala.inline
  def apply(
    dbname: String,
    exportDatabase: (String, Loki, js.Function1[/* err */ Error | Null, Unit]) => Unit,
    loadDatabase: (String, js.Function1[/* value */ js.Any, Unit]) => Unit,
    loadNextPage: js.Function0[Unit] => Unit,
    loadNextPartition: (Double, js.Function0[Unit]) => Unit,
    mode: String,
    options: PageSize,
    pageIterator: PageIterator | js.Object,
    saveNextPage: js.Function1[/* err */ Error | Null, Unit] => Unit,
    saveNextPartition: js.Function1[/* err */ Error | Null, Unit] => Unit
  ): LokiPartitioningAdapter = {
    val __obj = js.Dynamic.literal(dbname = dbname.asInstanceOf[js.Any], exportDatabase = js.Any.fromFunction3(exportDatabase), loadDatabase = js.Any.fromFunction2(loadDatabase), loadNextPage = js.Any.fromFunction1(loadNextPage), loadNextPartition = js.Any.fromFunction2(loadNextPartition), mode = mode.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], pageIterator = pageIterator.asInstanceOf[js.Any], saveNextPage = js.Any.fromFunction1(saveNextPage), saveNextPartition = js.Any.fromFunction1(saveNextPartition))
    __obj.asInstanceOf[LokiPartitioningAdapter]
  }
  
  @scala.inline
  implicit class LokiPartitioningAdapterMutableBuilder[Self <: LokiPartitioningAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdapter(value: LokiPersistenceAdapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdapterNull: Self = StObject.set(x, "adapter", null)
    
    @scala.inline
    def setDbname(value: String): Self = StObject.set(x, "dbname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbref(value: Loki): Self = StObject.set(x, "dbref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbrefNull: Self = StObject.set(x, "dbref", null)
    
    @scala.inline
    def setDirtyPartitions(value: js.Array[Double]): Self = StObject.set(x, "dirtyPartitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirtyPartitionsUndefined: Self = StObject.set(x, "dirtyPartitions", js.undefined)
    
    @scala.inline
    def setDirtyPartitionsVarargs(value: Double*): Self = StObject.set(x, "dirtyPartitions", js.Array(value :_*))
    
    @scala.inline
    def setExportDatabase(value: (String, Loki, js.Function1[/* err */ Error | Null, Unit]) => Unit): Self = StObject.set(x, "exportDatabase", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLoadNextPage(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "loadNextPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLoadNextPartition(value: (Double, js.Function0[Unit]) => Unit): Self = StObject.set(x, "loadNextPartition", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: PageSize): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIterator(value: PageIterator | js.Object): Self = StObject.set(x, "pageIterator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveNextPage(value: js.Function1[/* err */ Error | Null, Unit] => Unit): Self = StObject.set(x, "saveNextPage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveNextPartition(value: js.Function1[/* err */ Error | Null, Unit] => Unit): Self = StObject.set(x, "saveNextPartition", js.Any.fromFunction1(value))
  }
}
