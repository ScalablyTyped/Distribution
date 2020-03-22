package typings.lunr.mod

import typings.lunr.mod.Index.Attributes
import typings.lunr.mod.Index.QueryBuilder
import typings.lunr.mod.Index.QueryString
import typings.lunr.mod.Index.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An index contains the built index of all documents and provides a query interface
  * to the index.
  *
  * Usually instances of lunr.Index will not be created using this constructor, instead
  * lunr.Builder should be used to construct new indexes, or lunr.Index.load should be
  * used to load previously built and serialized indexes.
  */
@JSImport("lunr", "Index")
@js.native
class Index_ protected () extends js.Object {
  /**
    * @param attrs The attributes of the built search index.
    */
  def this(attrs: Attributes) = this()
  /**
    * Performs a query against the index using the yielded lunr.Query object.
    *
    * If performing programmatic queries against the index, this method is preferred
    * over lunr.Index#search so as to avoid the additional query parsing overhead.
    *
    * A query object is yielded to the supplied function which should be used to
    * express the query to be run against the index.
    *
    * Note that although this function takes a callback parameter it is _not_ an
    * asynchronous operation, the callback is just yielded a query object to be
    * customized.
    *
    * @param fn - A function that is used to build the query.
    */
  def query(fn: QueryBuilder): js.Array[Result] = js.native
  /**
    * Performs a search against the index using lunr query syntax.
    *
    * Results will be returned sorted by their score, the most relevant results
    * will be returned first.
    *
    * For more programmatic querying use lunr.Index#query.
    *
    * @param queryString - A string containing a lunr query.
    * @throws {lunr.QueryParseError} If the passed query string cannot be parsed.
    */
  def search(queryString: QueryString): js.Array[Result] = js.native
  /**
    * Prepares the index for JSON serialization.
    *
    * The schema for this JSON blob will be described in a
    * separate JSON schema file.
    *
    */
  def toJSON(): js.Object = js.native
}

