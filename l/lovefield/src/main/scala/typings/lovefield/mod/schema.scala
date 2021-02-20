package typings.lovefield.mod

import org.scalablytyped.runtime.StringDictionary
import typings.lovefield.mod.raw.BackStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// module raw
object schema {
  
  @js.native
  sealed trait DataStoreType extends StObject
  @JSImport("lovefield", "schema.DataStoreType")
  @js.native
  object DataStoreType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DataStoreType with Double] = js.native
    
    @js.native
    sealed trait FIREBASE extends DataStoreType
    /* 3 */ val FIREBASE: typings.lovefield.mod.schema.DataStoreType.FIREBASE with Double = js.native
    
    @js.native
    sealed trait INDEXED_DB extends DataStoreType
    /* 0 */ val INDEXED_DB: typings.lovefield.mod.schema.DataStoreType.INDEXED_DB with Double = js.native
    
    @js.native
    sealed trait LOCAL_STORAGE extends DataStoreType
    /* 2 */ val LOCAL_STORAGE: typings.lovefield.mod.schema.DataStoreType.LOCAL_STORAGE with Double = js.native
    
    @js.native
    sealed trait MEMORY extends DataStoreType
    /* 1 */ val MEMORY: typings.lovefield.mod.schema.DataStoreType.MEMORY with Double = js.native
    
    @js.native
    sealed trait WEB_SQL extends DataStoreType
    /* 4 */ val WEB_SQL: typings.lovefield.mod.schema.DataStoreType.WEB_SQL with Double = js.native
  }
  
  @JSImport("lovefield", "schema.create")
  @js.native
  def create(dbName: String, dbVersion: Double): Builder = js.native
  
  @js.native
  trait Builder extends StObject {
    
    def connect(): js.Promise[typings.lovefield.mod.schema.Database] = js.native
    def connect(options: ConnectOptions): js.Promise[typings.lovefield.mod.schema.Database] = js.native
    
    def createTable(tableName: String): TableBuilder = js.native
    
    def getSchema(): typings.lovefield.mod.schema.Database = js.native
    
    def setPragma(pragma: DatabasePragma): Unit = js.native
  }
  
  @js.native
  trait Column extends PredicateProvider {
    
    def as(name: String): Column = js.native
    
    def getName(): String = js.native
    
    def getNormalizedName(): String = js.native
  }
  
  @js.native
  trait ConnectOptions extends StObject {
    
    var onUpgrade: js.UndefOr[js.Function1[/* rawDb */ BackStore, js.Promise[Unit]]] = js.native
    
    var storeType: js.UndefOr[DataStoreType] = js.native
    
    var webSqlDbSize: js.UndefOr[Double] = js.native
  }
  object ConnectOptions {
    
    @scala.inline
    def apply(): ConnectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectOptions]
    }
    
    @scala.inline
    implicit class ConnectOptionsMutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnUpgrade(value: /* rawDb */ BackStore => js.Promise[Unit]): Self = StObject.set(x, "onUpgrade", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUpgradeUndefined: Self = StObject.set(x, "onUpgrade", js.undefined)
      
      @scala.inline
      def setStoreType(value: DataStoreType): Self = StObject.set(x, "storeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreTypeUndefined: Self = StObject.set(x, "storeType", js.undefined)
      
      @scala.inline
      def setWebSqlDbSize(value: Double): Self = StObject.set(x, "webSqlDbSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebSqlDbSizeUndefined: Self = StObject.set(x, "webSqlDbSize", js.undefined)
    }
  }
  
  @js.native
  trait Database extends StObject {
    
    def name(): String = js.native
    
    def pragma(): DatabasePragma = js.native
    
    def table(tableName: String): Table = js.native
    
    def tables(): js.Array[Table] = js.native
    
    def version(): Double = js.native
  }
  object Database {
    
    @scala.inline
    def apply(
      name: () => String,
      pragma: () => DatabasePragma,
      table: String => Table,
      tables: () => js.Array[Table],
      version: () => Double
    ): typings.lovefield.mod.schema.Database = {
      val __obj = js.Dynamic.literal(name = js.Any.fromFunction0(name), pragma = js.Any.fromFunction0(pragma), table = js.Any.fromFunction1(table), tables = js.Any.fromFunction0(tables), version = js.Any.fromFunction0(version))
      __obj.asInstanceOf[typings.lovefield.mod.schema.Database]
    }
    
    @scala.inline
    implicit class DatabaseMutableBuilder[Self <: typings.lovefield.mod.schema.Database] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPragma(value: () => DatabasePragma): Self = StObject.set(x, "pragma", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTable(value: String => Table): Self = StObject.set(x, "table", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTables(value: () => js.Array[Table]): Self = StObject.set(x, "tables", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVersion(value: () => Double): Self = StObject.set(x, "version", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait DatabasePragma extends StObject {
    
    var enableBundledMode: Boolean = js.native
  }
  object DatabasePragma {
    
    @scala.inline
    def apply(enableBundledMode: Boolean): DatabasePragma = {
      val __obj = js.Dynamic.literal(enableBundledMode = enableBundledMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatabasePragma]
    }
    
    @scala.inline
    implicit class DatabasePragmaMutableBuilder[Self <: DatabasePragma] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableBundledMode(value: Boolean): Self = StObject.set(x, "enableBundledMode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITable extends StObject {
    
    def as(name: String): Table = js.native
    
    def createRow(value: js.Object): Row = js.native
    
    def getName(): String = js.native
  }
  object ITable {
    
    @scala.inline
    def apply(as: String => Table, createRow: js.Object => Row, getName: () => String): ITable = {
      val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), createRow = js.Any.fromFunction1(createRow), getName = js.Any.fromFunction0(getName))
      __obj.asInstanceOf[ITable]
    }
    
    @scala.inline
    implicit class ITableMutableBuilder[Self <: ITable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String => Table): Self = StObject.set(x, "as", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateRow(value: js.Object => Row): Self = StObject.set(x, "createRow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IndexedColumn extends StObject {
    
    var autoIncrement: Boolean = js.native
    
    var name: String = js.native
    
    var order: Order = js.native
  }
  object IndexedColumn {
    
    @scala.inline
    def apply(autoIncrement: Boolean, name: String, order: Order): IndexedColumn = {
      val __obj = js.Dynamic.literal(autoIncrement = autoIncrement.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexedColumn]
    }
    
    @scala.inline
    implicit class IndexedColumnMutableBuilder[Self <: IndexedColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoIncrement(value: Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RawForeignKeySpec extends StObject {
    
    var action: js.UndefOr[ConstraintAction] = js.native
    
    var local: String = js.native
    
    var ref: String = js.native
    
    var timing: js.UndefOr[ConstraintTiming] = js.native
  }
  object RawForeignKeySpec {
    
    @scala.inline
    def apply(local: String, ref: String): RawForeignKeySpec = {
      val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
      __obj.asInstanceOf[RawForeignKeySpec]
    }
    
    @scala.inline
    implicit class RawForeignKeySpecMutableBuilder[Self <: RawForeignKeySpec] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: ConstraintAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setLocal(value: String): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTiming(value: ConstraintTiming): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
    }
  }
  
  /* Inlined lovefield.lovefield.schema.ITable & {[index: string] : lovefield.lovefield.schema.Column} */
  @js.native
  trait Table extends /* index */ StringDictionary[Column] {
    
    def as(name: String): Table = js.native
    
    def createRow(value: js.Object): Row = js.native
    
    def getName(): String = js.native
  }
  object Table {
    
    @scala.inline
    def apply(as: String => Table, createRow: js.Object => Row, getName: () => String): Table = {
      val __obj = js.Dynamic.literal(as = js.Any.fromFunction1(as), createRow = js.Any.fromFunction1(createRow), getName = js.Any.fromFunction0(getName))
      __obj.asInstanceOf[Table]
    }
    
    @scala.inline
    implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String => Table): Self = StObject.set(x, "as", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateRow(value: js.Object => Row): Self = StObject.set(x, "createRow", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait TableBuilder extends StObject {
    
    def addColumn(name: String, `type`: Type): TableBuilder = js.native
    
    def addForeignKey(name: String, spec: RawForeignKeySpec): TableBuilder = js.native
    
    def addIndex(name: String, columns: js.Array[IndexedColumn | String]): TableBuilder = js.native
    def addIndex(
      name: String,
      columns: js.Array[IndexedColumn | String],
      unique: js.UndefOr[scala.Nothing],
      order: Order
    ): TableBuilder = js.native
    def addIndex(name: String, columns: js.Array[IndexedColumn | String], unique: Boolean): TableBuilder = js.native
    def addIndex(name: String, columns: js.Array[IndexedColumn | String], unique: Boolean, order: Order): TableBuilder = js.native
    
    def addNullable(columns: js.Array[String]): TableBuilder = js.native
    
    def addPrimaryKey(columns: js.Array[IndexedColumn | String]): TableBuilder = js.native
    def addPrimaryKey(columns: js.Array[IndexedColumn | String], autoInc: Boolean): TableBuilder = js.native
    
    def addUnique(name: String, columns: js.Array[String]): TableBuilder = js.native
  }
}
