package typings
package lovefieldLib.lovefieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// module raw
@JSImport("lovefield", "schema")
@js.native
object schemaNs extends js.Object {
  @js.native
  trait Builder extends js.Object {
    def connect(): js.Promise[Database] = js.native
    def connect(options: ConnectOptions): js.Promise[Database] = js.native
    def createTable(tableName: java.lang.String): TableBuilder = js.native
    def getSchema(): Database = js.native
    def setPragma(pragma: DatabasePragma): scala.Unit = js.native
  }
  
  @js.native
  trait Column
    extends lovefieldLib.lovefieldMod.PredicateProvider {
    def as(name: java.lang.String): Column = js.native
    def getName(): java.lang.String = js.native
    def getNormalizedName(): java.lang.String = js.native
  }
  
  trait ConnectOptions extends js.Object {
    var onUpgrade: js.UndefOr[
        js.Function1[/* rawDb */ lovefieldLib.lovefieldMod.rawNs.BackStore, js.Promise[scala.Unit]]
      ] = js.undefined
    var storeType: js.UndefOr[DataStoreType] = js.undefined
    var webSqlDbSize: js.UndefOr[scala.Double] = js.undefined
  }
  
  @js.native
  sealed trait DataStoreType extends js.Object
  
  trait Database extends js.Object {
    def name(): java.lang.String
    def pragma(): DatabasePragma
    def table(tableName: java.lang.String): Table
    def tables(): js.Array[Table]
    def version(): scala.Double
  }
  
  trait DatabasePragma extends js.Object {
    var enableBundledMode: scala.Boolean
  }
  
  trait ITable extends js.Object {
    def as(name: java.lang.String): Table
    def createRow(value: js.Object): lovefieldLib.lovefieldMod.Row
    def getName(): java.lang.String
  }
  
  trait IndexedColumn extends js.Object {
    var autoIncrement: scala.Boolean
    var name: java.lang.String
    var order: lovefieldLib.lovefieldMod.Order
  }
  
  trait RawForeignKeySpec extends js.Object {
    var action: js.UndefOr[lovefieldLib.lovefieldMod.ConstraintAction] = js.undefined
    var local: java.lang.String
    var ref: java.lang.String
    var timing: js.UndefOr[lovefieldLib.lovefieldMod.ConstraintTiming] = js.undefined
  }
  
  @js.native
  trait TableBuilder extends js.Object {
    def addColumn(name: java.lang.String, `type`: lovefieldLib.lovefieldMod.Type): TableBuilder = js.native
    def addForeignKey(name: java.lang.String, spec: RawForeignKeySpec): TableBuilder = js.native
    def addIndex(name: java.lang.String, columns: js.Array[IndexedColumn | java.lang.String]): TableBuilder = js.native
    def addIndex(name: java.lang.String, columns: js.Array[IndexedColumn | java.lang.String], unique: scala.Boolean): TableBuilder = js.native
    def addIndex(
      name: java.lang.String,
      columns: js.Array[IndexedColumn | java.lang.String],
      unique: scala.Boolean,
      order: lovefieldLib.lovefieldMod.Order
    ): TableBuilder = js.native
    def addNullable(columns: js.Array[java.lang.String]): TableBuilder = js.native
    def addPrimaryKey(columns: js.Array[IndexedColumn | java.lang.String]): TableBuilder = js.native
    def addPrimaryKey(columns: js.Array[IndexedColumn | java.lang.String], autoInc: scala.Boolean): TableBuilder = js.native
    def addUnique(name: java.lang.String, columns: js.Array[java.lang.String]): TableBuilder = js.native
  }
  
  def create(dbName: java.lang.String, dbVersion: scala.Double): Builder = js.native
  @js.native
  object DataStoreType extends js.Object {
    @js.native
    sealed trait FIREBASE
      extends lovefieldLib.lovefieldMod.schemaNs.DataStoreType
    
    @js.native
    sealed trait INDEXED_DB
      extends lovefieldLib.lovefieldMod.schemaNs.DataStoreType
    
    @js.native
    sealed trait LOCAL_STORAGE
      extends lovefieldLib.lovefieldMod.schemaNs.DataStoreType
    
    @js.native
    sealed trait MEMORY
      extends lovefieldLib.lovefieldMod.schemaNs.DataStoreType
    
    @js.native
    sealed trait WEB_SQL
      extends lovefieldLib.lovefieldMod.schemaNs.DataStoreType
    
    /* 3 */ val FIREBASE: FIREBASE with scala.Double = js.native
    /* 0 */ val INDEXED_DB: INDEXED_DB with scala.Double = js.native
    /* 2 */ val LOCAL_STORAGE: LOCAL_STORAGE with scala.Double = js.native
    /* 1 */ val MEMORY: MEMORY with scala.Double = js.native
    /* 4 */ val WEB_SQL: WEB_SQL with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[lovefieldLib.lovefieldMod.schemaNs.DataStoreType with scala.Double] = js.native
  }
  
  type Table = ITable with org.scalablytyped.runtime.StringDictionary[Column]
}

