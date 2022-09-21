package typings.massive.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("massive", "Database")
@js.native
open class Database protected ()
  extends StObject
     with /* tableName */ StringDictionary[Writable | Any] {
  def this(connection: String) = this()
  /**
    * @param connection A connection object or connection string
    */
  def this(connection: js.Object) = this()
  def this(connection: String, loader: Loader) = this()
  def this(connection: js.Object, loader: Loader) = this()
  def this(connection: String, loader: Unit, driverConfig: js.Object) = this()
  def this(connection: String, loader: Loader, driverConfig: js.Object) = this()
  def this(connection: js.Object, loader: Unit, driverConfig: js.Object) = this()
  def this(connection: js.Object, loader: Loader, driverConfig: js.Object) = this()
  
  def attach(entities: js.Array[Any]): js.Promise[js.Array[Any]] = js.native
  /** Attach an entity to the connected instance. */
  def attach(entities: AnyObject[Any]): js.Promise[js.Array[Any]] = js.native
  
  /** Remove all attached entities from the instance, returning it to the pre- introspection state. */
  def clean(): Unit = js.native
  
  /** Clones the database handle for a task or transaction, replacing the internal instance with a dedicated connection. */
  def clone(conn: ConnectionInfo): Database = js.native
  
  /** Create a new document table and attach it to the Database for usage. */
  def createDocumentTable(location: String): js.Promise[Unit] = js.native
  
  /**  Create an extension. */
  def createExtension(extensionName: String): js.Promise[Unit] = js.native
  
  /** Create a new schema in the database. */
  def createSchema(schemaName: String): js.Promise[Unit] = js.native
  
  /** Forget an entity. */
  def detach(entityPath: String): Unit = js.native
  
  /** Drop an extension. */
  def dropExtension(extensionName: String): js.Promise[Unit] = js.native
  
  /** Drop a schema and remove it and its owned objects from the Database. */
  def dropSchema(schemaName: String): js.Promise[Unit] = js.native
  def dropSchema(schemaName: String, options: DropOptions): js.Promise[Unit] = js.native
  
  /** Drop a table and remove it from the Database. */
  def dropTable(tablePath: String): js.Promise[Unit] = js.native
  def dropTable(tablePath: String, options: DropOptions): js.Promise[Unit] = js.native
  
  /** List all the functions and scripts attached to the connected instance. */
  def listFunctions(): js.Promise[js.Array[Any]] = js.native
  
  /** List all the non-pk sequences attached to the connected instance. */
  def listSequences(): js.Promise[js.Array[Any]] = js.native
  
  /** List all the tables attached to the connected instance. */
  def listTables(): js.Promise[js.Array[Any]] = js.native
  
  /** List all the views attached to the connected instance. */
  def listViews(): js.Promise[js.Array[Any]] = js.native
  
  def query(query: String): js.Promise[Any] = js.native
  def query(query: String, params: Unit, options: ResultProcessingOptions): js.Promise[Any] = js.native
  def query(query: String, params: QueryParams): js.Promise[Any] = js.native
  def query(query: String, params: QueryParams, options: ResultProcessingOptions): js.Promise[Any] = js.native
  def query(query: Delete): js.Promise[Any] = js.native
  def query(query: Delete, params: Unit, options: ResultProcessingOptions): js.Promise[Any] = js.native
  def query(query: Delete, params: QueryParams): js.Promise[Any] = js.native
  def query(query: Delete, params: QueryParams, options: ResultProcessingOptions): js.Promise[Any] = js.native
  def query(query: Insert): js.Promise[Any] = js.native
  def query(query: Insert, params: Unit, options: ResultProcessingOptions): js.Promise[Any] = js.native
  def query(query: Insert, params: QueryParams): js.Promise[Any] = js.native
  def query(query: Insert, params: QueryParams, options: ResultProcessingOptions): js.Promise[Any] = js.native
  /** Execute a query. */
  def query(query: Select): js.Promise[Any] = js.native
  def query(query: Select, params: Unit, options: ResultProcessingOptions): js.Promise[Any] = js.native
  def query(query: Select, params: QueryParams): js.Promise[Any] = js.native
  def query(query: Select, params: QueryParams, options: ResultProcessingOptions): js.Promise[Any] = js.native
  def query(query: Update): js.Promise[Any] = js.native
  def query(query: Update, params: Unit, options: ResultProcessingOptions): js.Promise[Any] = js.native
  def query(query: Update, params: QueryParams): js.Promise[Any] = js.native
  def query(query: Update, params: QueryParams, options: ResultProcessingOptions): js.Promise[Any] = js.native
  
  /**
    * Synchronize the database API with the current state by scanning for tables, views, functions, and scripts.
    * Objects and files which no longer exist are cleared and new objects and files added.
    */
  def reload(): js.Promise[Database] = js.native
  
  /** Save a document. */
  def saveDoc(collection: String, doc: AnyObject[Any]): js.Promise[Any] = js.native
  
  /** Begin a task, returning a copy of the connected instance which will route all queries made in the callback through the task scope. */
  def withConnection(cb: js.Function1[/* withTask */ Any, Any]): js.Promise[Any] = js.native
  def withConnection(cb: js.Function1[/* withTask */ Any, Any], options: AnyObject[Any]): js.Promise[Any] = js.native
  
  /** Begin a transaction, returning a copy of the connected instance which will route all queries made in the callback through the transaction scope. */
  def withTransaction(cb: js.Function1[/* withTx */ Any, Any]): js.Promise[Any] = js.native
  def withTransaction(cb: js.Function1[/* withTx */ Any, Any], options: AnyObject[Any]): js.Promise[Any] = js.native
}
