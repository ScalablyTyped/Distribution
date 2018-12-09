package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Writable extends Readable {
  /** Delete a record or records. */
  def destroy(criteria: AnyObject[_]): js.Promise[js.Array[_]] = js.native
  /** Delete a record or records. */
  def destroy(criteria: AnyObject[_], options: ResultProcessingOptions): js.Promise[js.Array[_]] = js.native
  /**
           * Attempts to assemble primary key criteria for a record object representing a row in this table.
           * The criteria must include the full primary key, and must not invoke any operations.
           */
  def getPkCriteria(record: AnyObject[_]): AnyObject[_] = js.native
  def insert(data: js.Array[AnyObject[_]]): js.Promise[js.Array[AnyObject[_]]] = js.native
  def insert(data: js.Array[AnyObject[_]], options: PersistenceInsertOptions with ResultProcessingOptions): js.Promise[js.Array[AnyObject[_]]] = js.native
  /** Insert a record or records into the table. */
  def insert(data: AnyObject[_]): js.Promise[AnyObject[_]] = js.native
  /** Insert a record or records into the table. */
  def insert(data: AnyObject[_], options: PersistenceInsertOptions with ResultProcessingOptions): js.Promise[AnyObject[_]] = js.native
  /**
           * Saves an object.
           * If the object does not include a value for the table's primary key, this will emit an INSERT to create a new record.
           * if it does contain the primary key it will emit an UPDATE for the existing record.
           * Either way, the newest available version of the record will be returned.
           * This is not a true Postgres upsert! If you need the behavior of ON CONFLICT DO UPDATE, you'll need to use db.query or create an SQL script file.
           */
  def save(record: AnyObject[_]): js.Promise[AnyObject[_]] = js.native
  /**
           * Saves an object.
           * If the object does not include a value for the table's primary key, this will emit an INSERT to create a new record.
           * if it does contain the primary key it will emit an UPDATE for the existing record.
           * Either way, the newest available version of the record will be returned.
           * This is not a true Postgres upsert! If you need the behavior of ON CONFLICT DO UPDATE, you'll need to use db.query or create an SQL script file.
           */
  def save(
    record: AnyObject[_],
    options: PersistenceInsertOptions with PersistenceUpdateDocOptions with ResultProcessingOptions
  ): js.Promise[AnyObject[_]] = js.native
  /** Save a document to the database. This function will create or replace the entire document body. */
  def saveDoc(doc: AnyObject[_]): js.Promise[AnyObject[_]] = js.native
  def update(criteria: AnyObject[_], changes: AnyObject[_]): js.Promise[js.Array[AnyObject[_]]] = js.native
  def update(
    criteria: AnyObject[_],
    changes: AnyObject[_],
    options: PersistenceUpdateDocOptions with ResultProcessingOptions
  ): js.Promise[js.Array[AnyObject[_]]] = js.native
  /** Update a record. */
  def update(criteria: UUID, changes: AnyObject[_]): js.Promise[AnyObject[_]] = js.native
  /** Update a record. */
  def update(
    criteria: UUID,
    changes: AnyObject[_],
    options: PersistenceUpdateDocOptions with ResultProcessingOptions
  ): js.Promise[AnyObject[_]] = js.native
  /** Update a record. */
  def update(criteria: scala.Double, changes: AnyObject[_]): js.Promise[AnyObject[_]] = js.native
  /** Update a record. */
  def update(
    criteria: scala.Double,
    changes: AnyObject[_],
    options: PersistenceUpdateDocOptions with ResultProcessingOptions
  ): js.Promise[AnyObject[_]] = js.native
  /**
           * Update a document, adding new information and changing existing information.
           * This function can be used with any JSON field, not just document tables; however, only document tables can use criteria objects which directly reference document fields.
           * If calling updateDoc with a criteria object for a non-document table, the criteria will be tested against the entire row (as opposed to the document body as it is for document tables).
           * To test elements of the JSON field in a non-document table with a criteria object, use a JSON path string.
           */
  def updateDoc(criteria: AnyObject[_], changes: AnyObject[_]): js.Promise[AnyObject[_]] = js.native
  /**
           * Update a document, adding new information and changing existing information.
           * This function can be used with any JSON field, not just document tables; however, only document tables can use criteria objects which directly reference document fields.
           * If calling updateDoc with a criteria object for a non-document table, the criteria will be tested against the entire row (as opposed to the document body as it is for document tables).
           * To test elements of the JSON field in a non-document table with a criteria object, use a JSON path string.
           */
  def updateDoc(
    criteria: AnyObject[_],
    changes: AnyObject[_],
    options: PersistenceUpdateDocOptions with ResultProcessingOptions
  ): js.Promise[AnyObject[_]] = js.native
  /**
           * Update a document, adding new information and changing existing information.
           * This function can be used with any JSON field, not just document tables; however, only document tables can use criteria objects which directly reference document fields.
           * If calling updateDoc with a criteria object for a non-document table, the criteria will be tested against the entire row (as opposed to the document body as it is for document tables).
           * To test elements of the JSON field in a non-document table with a criteria object, use a JSON path string.
           */
  def updateDoc(criteria: UUID, changes: AnyObject[_]): js.Promise[AnyObject[_]] = js.native
  /**
           * Update a document, adding new information and changing existing information.
           * This function can be used with any JSON field, not just document tables; however, only document tables can use criteria objects which directly reference document fields.
           * If calling updateDoc with a criteria object for a non-document table, the criteria will be tested against the entire row (as opposed to the document body as it is for document tables).
           * To test elements of the JSON field in a non-document table with a criteria object, use a JSON path string.
           */
  def updateDoc(
    criteria: UUID,
    changes: AnyObject[_],
    options: PersistenceUpdateDocOptions with ResultProcessingOptions
  ): js.Promise[AnyObject[_]] = js.native
  /**
           * Update a document, adding new information and changing existing information.
           * This function can be used with any JSON field, not just document tables; however, only document tables can use criteria objects which directly reference document fields.
           * If calling updateDoc with a criteria object for a non-document table, the criteria will be tested against the entire row (as opposed to the document body as it is for document tables).
           * To test elements of the JSON field in a non-document table with a criteria object, use a JSON path string.
           */
  def updateDoc(criteria: scala.Double, changes: AnyObject[_]): js.Promise[AnyObject[_]] = js.native
  /**
           * Update a document, adding new information and changing existing information.
           * This function can be used with any JSON field, not just document tables; however, only document tables can use criteria objects which directly reference document fields.
           * If calling updateDoc with a criteria object for a non-document table, the criteria will be tested against the entire row (as opposed to the document body as it is for document tables).
           * To test elements of the JSON field in a non-document table with a criteria object, use a JSON path string.
           */
  def updateDoc(
    criteria: scala.Double,
    changes: AnyObject[_],
    options: PersistenceUpdateDocOptions with ResultProcessingOptions
  ): js.Promise[AnyObject[_]] = js.native
}

