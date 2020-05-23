package typings.lokijs.global

import typings.lokijs.LokiPersistenceAdapter
import typings.lokijs.PageIterator
import typings.lokijs.anon.PageSize
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("LokiPartitioningAdapter")
@js.native
class LokiPartitioningAdapter protected ()
  extends typings.lokijs.LokiPartitioningAdapter {
  def this(adapter: LokiPersistenceAdapter) = this()
  def this(adapter: LokiPersistenceAdapter, options: PageSize) = this()
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

