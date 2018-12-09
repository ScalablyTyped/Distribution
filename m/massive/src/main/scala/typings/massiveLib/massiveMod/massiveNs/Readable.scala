package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Readable extends Entity {
  def count(conditions: java.lang.String, params: js.Array[_]): js.Promise[scala.Double] = js.native
  /** Count rows matching criteria. */
  def count(conditions: AnyObject[_]): js.Promise[scala.Double] = js.native
  /** Count documents matching criteria. Unlike count, this function only supports criteria objects. */
  def countDoc(criteria: js.Object): js.Promise[scala.Double] = js.native
  /** Find rows matching criteria. */
  def find(): js.Promise[_] = js.native
  /** Find rows matching criteria. */
  def find(criteria: AnyObject[_]): js.Promise[_] = js.native
  /** Find rows matching criteria. */
  def find(criteria: AnyObject[_], options: RetrievalOptions with ResultProcessingOptions): js.Promise[_] = js.native
  /** Find rows matching criteria. */
  def find(criteria: UUID): js.Promise[_] = js.native
  /** Find rows matching criteria. */
  def find(criteria: UUID, options: RetrievalOptions with ResultProcessingOptions): js.Promise[_] = js.native
  /** Find rows matching criteria. */
  def find(criteria: scala.Double): js.Promise[_] = js.native
  /** Find rows matching criteria. */
  def find(criteria: scala.Double, options: RetrievalOptions with ResultProcessingOptions): js.Promise[_] = js.native
  /** Find a document by searching in the body. */
  def findDoc(): js.Promise[_] = js.native
  /** Find a document by searching in the body. */
  def findDoc(criteria: AnyObject[_]): js.Promise[_] = js.native
  /** Find a document by searching in the body. */
  def findDoc(criteria: AnyObject[_], options: RetrievalOptions): js.Promise[_] = js.native
  /** Find a document by searching in the body. */
  def findDoc(criteria: UUID): js.Promise[_] = js.native
  /** Find a document by searching in the body. */
  def findDoc(criteria: UUID, options: RetrievalOptions): js.Promise[_] = js.native
  /** Find a document by searching in the body. */
  def findDoc(criteria: scala.Double): js.Promise[_] = js.native
  /** Find a document by searching in the body. */
  def findDoc(criteria: scala.Double, options: RetrievalOptions): js.Promise[_] = js.native
  /** Return a single record. */
  def findOne(criteria: AnyObject[_]): js.Promise[_] = js.native
  /** Return a single record. */
  def findOne(criteria: AnyObject[_], options: RetrievalOptions with ResultProcessingOptions): js.Promise[_] = js.native
  /** Return a single record. */
  def findOne(criteria: UUID): js.Promise[_] = js.native
  /** Return a single record. */
  def findOne(criteria: UUID, options: RetrievalOptions with ResultProcessingOptions): js.Promise[_] = js.native
  /** Return a single record. */
  def findOne(criteria: scala.Double): js.Promise[_] = js.native
  /** Return a single record. */
  def findOne(criteria: scala.Double, options: RetrievalOptions with ResultProcessingOptions): js.Promise[_] = js.native
  /**
           * Determine whether criteria represent a search by primary key.
           * If a number or uuid are passed, it is assumed to be a primary key value; if an object, it must have only one key, which must specify the primary key column.
           */
  def isPkSearch(criteria: AnyObject[_]): scala.Boolean = js.native
  /**
           * Determine whether criteria represent a search by primary key.
           * If a number or uuid are passed, it is assumed to be a primary key value; if an object, it must have only one key, which must specify the primary key column.
           */
  def isPkSearch(criteria: UUID): scala.Boolean = js.native
  /**
           * Determine whether criteria represent a search by primary key.
           * If a number or uuid are passed, it is assumed to be a primary key value; if an object, it must have only one key, which must specify the primary key column.
           */
  def isPkSearch(criteria: scala.Double): scala.Boolean = js.native
  /** Refresh a materialized view. */
  def refresh(): js.Promise[scala.Unit] = js.native
  /** Refresh a materialized view. */
  def refresh(concurrently: scala.Boolean): js.Promise[scala.Unit] = js.native
  /**
           * Perform a full-text search on queryable fields. If options.document is true, looks in the document body fields instead of the table columns.
           */
  def search(plan: SearchDefinition): js.Promise[js.Array[_]] = js.native
  /**
           * Perform a full-text search on queryable fields. If options.document is true, looks in the document body fields instead of the table columns.
           */
  def search(plan: SearchDefinition, options: RetrievalOptions): js.Promise[js.Array[_]] = js.native
  /** Shortcut to perform a full text search on a document table. */
  def searchDoc(
    plan: stdLib.Pick[
      SearchDefinition, 
      massiveLib.massiveLibStrings.fields | massiveLib.massiveLibStrings.term
    ]
  ): js.Promise[js.Array[_]] = js.native
  /** Shortcut to perform a full text search on a document table. */
  def searchDoc(
    plan: stdLib.Pick[
      SearchDefinition, 
      massiveLib.massiveLibStrings.fields | massiveLib.massiveLibStrings.term
    ],
    options: RetrievalOptions
  ): js.Promise[js.Array[_]] = js.native
  /** Run a query with a raw SQL predicate, eg: db.mytable.where('id=$1', [123]).then(...); */
  def where(conditions: java.lang.String): js.Promise[js.Array[_]] = js.native
  /** Run a query with a raw SQL predicate, eg: db.mytable.where('id=$1', [123]).then(...); */
  def where(conditions: java.lang.String, params: js.Array[_]): js.Promise[js.Array[_]] = js.native
  /** Run a query with a raw SQL predicate, eg: db.mytable.where('id=$1', [123]).then(...); */
  def where(
    conditions: java.lang.String,
    params: js.Array[_],
    options: RetrievalOptions with ResultProcessingOptions
  ): js.Promise[js.Array[_]] = js.native
}

