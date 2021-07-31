package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("massive", "Writable")
@js.native
class Writable protected () extends Readable {
  /** A database table or other writable object */
  def this(spec: WritableSpecification) = this()
  
  /** Delete a record or records. */
  def destroy(criteria: AnyObject[js.Any]): js.Promise[js.Array[js.Any]] = js.native
  def destroy(criteria: AnyObject[js.Any], options: ResultProcessingOptions): js.Promise[js.Array[js.Any]] = js.native
  
  /**
    * Attempts to assemble primary key criteria for a record object representing a row in this table.
    * The criteria must include the full primary key, and must not invoke any operations.
    */
  def getPkCriteria(record: AnyObject[js.Any]): AnyObject[js.Any] = js.native
  
  def insert(data: js.Array[AnyObject[js.Any]]): js.Promise[js.Array[AnyObject[js.Any]]] = js.native
  def insert(data: js.Array[AnyObject[js.Any]], options: PersistenceInsertOptions & ResultProcessingOptions): js.Promise[js.Array[AnyObject[js.Any]]] = js.native
  /** Insert a record or records into the table. */
  def insert(data: AnyObject[js.Any]): js.Promise[AnyObject[js.Any]] = js.native
  def insert(data: AnyObject[js.Any], options: PersistenceInsertOptions & ResultProcessingOptions): js.Promise[AnyObject[js.Any]] = js.native
  
  /**
    * Saves an object.
    * If the object does not include a value for the table's primary key, this will emit an INSERT to create a new record.
    * if it does contain the primary key it will emit an UPDATE for the existing record.
    * Either way, the newest available version of the record will be returned.
    * This is not a true Postgres upsert! If you need the behavior of ON CONFLICT DO UPDATE, you'll need to use db.query or create an SQL script file.
    */
  def save(record: AnyObject[js.Any]): js.Promise[AnyObject[js.Any]] = js.native
  def save(
    record: AnyObject[js.Any],
    options: PersistenceInsertOptions & PersistenceUpdateDocOptions & ResultProcessingOptions
  ): js.Promise[AnyObject[js.Any]] = js.native
  
  /** Save a document to the database. This function will create or replace the entire document body. */
  def saveDoc(doc: AnyObject[js.Any]): js.Promise[AnyObject[js.Any]] = js.native
  
  def update(criteria: Double, changes: AnyObject[js.Any]): js.Promise[AnyObject[js.Any]] = js.native
  def update(
    criteria: Double,
    changes: AnyObject[js.Any],
    options: PersistenceUpdateDocOptions & ResultProcessingOptions
  ): js.Promise[AnyObject[js.Any]] = js.native
  def update(criteria: AnyObject[js.Any], changes: AnyObject[js.Any]): js.Promise[js.Array[AnyObject[js.Any]]] = js.native
  def update(
    criteria: AnyObject[js.Any],
    changes: AnyObject[js.Any],
    options: PersistenceUpdateDocOptions & ResultProcessingOptions
  ): js.Promise[js.Array[AnyObject[js.Any]]] = js.native
  /** Update a record. */
  def update(criteria: UUID, changes: AnyObject[js.Any]): js.Promise[AnyObject[js.Any]] = js.native
  def update(
    criteria: UUID,
    changes: AnyObject[js.Any],
    options: PersistenceUpdateDocOptions & ResultProcessingOptions
  ): js.Promise[AnyObject[js.Any]] = js.native
  
  def updateDoc(criteria: Double, changes: AnyObject[js.Any]): js.Promise[AnyObject[js.Any]] = js.native
  def updateDoc(
    criteria: Double,
    changes: AnyObject[js.Any],
    options: PersistenceUpdateDocOptions & ResultProcessingOptions
  ): js.Promise[AnyObject[js.Any]] = js.native
  def updateDoc(criteria: AnyObject[js.Any], changes: AnyObject[js.Any]): js.Promise[AnyObject[js.Any]] = js.native
  def updateDoc(
    criteria: AnyObject[js.Any],
    changes: AnyObject[js.Any],
    options: PersistenceUpdateDocOptions & ResultProcessingOptions
  ): js.Promise[AnyObject[js.Any]] = js.native
  /**
    * Update a document, adding new information and changing existing information.
    * This function can be used with any JSON field, not just document tables; however, only document tables can use criteria objects which directly reference document fields.
    * If calling updateDoc with a criteria object for a non-document table, the criteria will be tested against the entire row (as opposed to the document body as it is for document tables).
    * To test elements of the JSON field in a non-document table with a criteria object, use a JSON path string.
    */
  def updateDoc(criteria: UUID, changes: AnyObject[js.Any]): js.Promise[AnyObject[js.Any]] = js.native
  def updateDoc(
    criteria: UUID,
    changes: AnyObject[js.Any],
    options: PersistenceUpdateDocOptions & ResultProcessingOptions
  ): js.Promise[AnyObject[js.Any]] = js.native
}
