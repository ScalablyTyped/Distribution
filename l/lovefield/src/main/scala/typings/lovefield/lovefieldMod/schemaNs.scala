package typings.lovefield.lovefieldMod

import org.scalablytyped.runtime.StringDictionary
import typings.lovefield.lovefieldMod.rawNs.BackStore
import typings.lovefield.lovefieldMod.schemaNs.Builder
import typings.lovefield.lovefieldMod.schemaNs.Column
import typings.lovefield.lovefieldMod.schemaNs.ConnectOptions
import typings.lovefield.lovefieldMod.schemaNs.DataStoreType
import typings.lovefield.lovefieldMod.schemaNs.DatabasePragma
import typings.lovefield.lovefieldMod.schemaNs.ITable
import typings.lovefield.lovefieldMod.schemaNs.IndexedColumn
import typings.lovefield.lovefieldMod.schemaNs.RawForeignKeySpec
import typings.lovefield.lovefieldMod.schemaNs.Table
import typings.lovefield.lovefieldMod.schemaNs.TableBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// module raw
@JSImport("lovefield", "schema")
@js.native
object schemaNs extends js.Object {
  @js.native
  trait Builder extends js.Object {
    def connect(): js.Promise[typings.lovefield.lovefieldMod.schemaNs.Database] = js.native
    def connect(options: ConnectOptions): js.Promise[typings.lovefield.lovefieldMod.schemaNs.Database] = js.native
    def createTable(tableName: String): TableBuilder = js.native
    def getSchema(): typings.lovefield.lovefieldMod.schemaNs.Database = js.native
    def setPragma(pragma: DatabasePragma): Unit = js.native
  }
  
  @js.native
  trait Column extends PredicateProvider {
    def as(name: String): Column = js.native
    def getName(): String = js.native
    def getNormalizedName(): String = js.native
  }
  
  trait ConnectOptions extends js.Object {
    var onUpgrade: js.UndefOr[js.Function1[/* rawDb */ BackStore, js.Promise[Unit]]] = js.undefined
    var storeType: js.UndefOr[DataStoreType] = js.undefined
    var webSqlDbSize: js.UndefOr[Double] = js.undefined
  }
  
  @js.native
  sealed trait DataStoreType extends js.Object
  
  trait Database extends js.Object {
    def name(): String
    def pragma(): DatabasePragma
    def table(tableName: String): Table
    def tables(): js.Array[Table]
    def version(): Double
  }
  
  trait DatabasePragma extends js.Object {
    var enableBundledMode: Boolean
  }
  
  trait ITable extends js.Object {
    def as(name: String): Table
    def createRow(value: js.Object): Row
    def getName(): String
  }
  
  trait IndexedColumn extends js.Object {
    var autoIncrement: Boolean
    var name: String
    var order: Order
  }
  
  trait RawForeignKeySpec extends js.Object {
    var action: js.UndefOr[ConstraintAction] = js.undefined
    var local: String
    var ref: String
    var timing: js.UndefOr[ConstraintTiming] = js.undefined
  }
  
  @js.native
  trait TableBuilder extends js.Object {
    def addColumn(name: String, `type`: Type): TableBuilder = js.native
    def addForeignKey(name: String, spec: RawForeignKeySpec): TableBuilder = js.native
    def addIndex(name: String, columns: js.Array[IndexedColumn | String]): TableBuilder = js.native
    def addIndex(name: String, columns: js.Array[IndexedColumn | String], unique: Boolean): TableBuilder = js.native
    def addIndex(name: String, columns: js.Array[IndexedColumn | String], unique: Boolean, order: Order): TableBuilder = js.native
    def addNullable(columns: js.Array[String]): TableBuilder = js.native
    def addPrimaryKey(columns: js.Array[IndexedColumn | String]): TableBuilder = js.native
    def addPrimaryKey(columns: js.Array[IndexedColumn | String], autoInc: Boolean): TableBuilder = js.native
    def addUnique(name: String, columns: js.Array[String]): TableBuilder = js.native
  }
  
  def create(dbName: String, dbVersion: Double): Builder = js.native
  @js.native
  object DataStoreType extends js.Object {
    @js.native
    sealed trait FIREBASE extends DataStoreType
    
    @js.native
    sealed trait INDEXED_DB extends DataStoreType
    
    @js.native
    sealed trait LOCAL_STORAGE extends DataStoreType
    
    @js.native
    sealed trait MEMORY extends DataStoreType
    
    @js.native
    sealed trait WEB_SQL extends DataStoreType
    
    /* 3 */ val FIREBASE: typings.lovefield.lovefieldMod.schemaNs.DataStoreType.FIREBASE with Double = js.native
    /* 0 */ val INDEXED_DB: typings.lovefield.lovefieldMod.schemaNs.DataStoreType.INDEXED_DB with Double = js.native
    /* 2 */ val LOCAL_STORAGE: typings.lovefield.lovefieldMod.schemaNs.DataStoreType.LOCAL_STORAGE with Double = js.native
    /* 1 */ val MEMORY: typings.lovefield.lovefieldMod.schemaNs.DataStoreType.MEMORY with Double = js.native
    /* 4 */ val WEB_SQL: typings.lovefield.lovefieldMod.schemaNs.DataStoreType.WEB_SQL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DataStoreType with Double] = js.native
  }
  
  type Table = ITable with StringDictionary[Column]
}

