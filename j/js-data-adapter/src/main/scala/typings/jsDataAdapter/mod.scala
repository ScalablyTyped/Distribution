package typings.jsDataAdapter

import org.scalablytyped.runtime.StringDictionary
import typings.jsData.mod.Mapper
import typings.jsDataAdapter.anon.TypeofAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-data-adapter", "Adapter")
  @js.native
  class Adapter () extends StObject {
    def this(opts: IAdapterOpts) = this()
    
    def afterCount(mapper: Mapper, props: IDict, opts: IDict, response: IDict): js.Any = js.native
    def afterCount(mapper: Mapper, props: IDict, opts: IDict, response: Response): js.Any = js.native
    
    def afterCreate(mapper: Mapper, props: IDict, opts: IDict, response: IDict): js.Any = js.native
    def afterCreate(mapper: Mapper, props: IDict, opts: IDict, response: Response): js.Any = js.native
    
    def afterCreateMany(mapper: Mapper, props: js.Array[IDict], opts: IDict, response: js.Array[IDict]): js.Any = js.native
    def afterCreateMany(mapper: Mapper, props: js.Array[IDict], opts: IDict, response: Response): js.Any = js.native
    
    def afterDestroy(mapper: Mapper, id: String, opts: IDict, response: Unit): js.Any = js.native
    def afterDestroy(mapper: Mapper, id: String, opts: IDict, response: Response): js.Any = js.native
    def afterDestroy(mapper: Mapper, id: Double, opts: IDict, response: Unit): js.Any = js.native
    def afterDestroy(mapper: Mapper, id: Double, opts: IDict, response: Response): js.Any = js.native
    
    def afterDestroyAll(mapper: Mapper, query: IDict, opts: IDict, response: Unit): js.Any = js.native
    def afterDestroyAll(mapper: Mapper, query: IDict, opts: IDict, response: Response): js.Any = js.native
    
    def afterFind(mapper: Mapper, id: String, opts: IDict, response: IDict): js.Any = js.native
    def afterFind(mapper: Mapper, id: String, opts: IDict, response: Response): js.Any = js.native
    def afterFind(mapper: Mapper, id: Double, opts: IDict, response: IDict): js.Any = js.native
    def afterFind(mapper: Mapper, id: Double, opts: IDict, response: Response): js.Any = js.native
    
    def afterFindAll(mapper: Mapper, query: IDict, opts: IDict, response: js.Array[IDict]): js.Any = js.native
    def afterFindAll(mapper: Mapper, query: IDict, opts: IDict, response: Response): js.Any = js.native
    
    def afterSum(mapper: Mapper, field: String, query: IDict, opts: IDict, response: Double): js.Any = js.native
    def afterSum(mapper: Mapper, field: String, query: IDict, opts: IDict, response: Response): js.Any = js.native
    
    def afterUpdate(mapper: Mapper, id: String, props: IDict, opts: IDict, response: IDict): js.Any = js.native
    def afterUpdate(mapper: Mapper, id: String, props: IDict, opts: IDict, response: Response): js.Any = js.native
    def afterUpdate(mapper: Mapper, id: Double, props: IDict, opts: IDict, response: IDict): js.Any = js.native
    def afterUpdate(mapper: Mapper, id: Double, props: IDict, opts: IDict, response: Response): js.Any = js.native
    
    def afterUpdateAll(mapper: Mapper, props: IDict, query: IDict, opts: IDict, response: js.Array[IDict]): js.Any = js.native
    def afterUpdateAll(mapper: Mapper, props: IDict, query: IDict, opts: IDict, response: Response): js.Any = js.native
    
    def afterUpdateMany(mapper: Mapper, props: js.Array[IDict], opts: IDict, response: js.Array[IDict]): js.Any = js.native
    def afterUpdateMany(mapper: Mapper, props: js.Array[IDict], opts: IDict, response: Response): js.Any = js.native
    
    def beforeCount(mapper: Mapper, props: IDict, opts: IDict): js.Any = js.native
    
    def beforeCreate(mapper: Mapper, props: IDict, opts: IDict): js.Any = js.native
    
    def beforeCreateMany(mapper: Mapper, props: js.Array[IDict], opts: IDict): js.Any = js.native
    
    def beforeDestroy(mapper: Mapper, id: String, opts: IDict): js.Any = js.native
    def beforeDestroy(mapper: Mapper, id: Double, opts: IDict): js.Any = js.native
    
    def beforeDestroyAll(mapper: Mapper, query: IDict, opts: IDict): js.Any = js.native
    
    def beforeFind(mapper: Mapper, id: String, opts: IDict): js.Any = js.native
    def beforeFind(mapper: Mapper, id: Double, opts: IDict): js.Any = js.native
    
    def beforeFindAll(mapper: Mapper, query: IDict, opts: IDict): js.Any = js.native
    
    def beforeSum(mapper: Mapper, field: String, query: IDict, opts: IDict): js.Any = js.native
    
    def beforeUpdate(mapper: Mapper, id: String, props: IDict, opts: IDict): js.Any = js.native
    def beforeUpdate(mapper: Mapper, id: Double, props: IDict, opts: IDict): js.Any = js.native
    
    def beforeUpdateAll(mapper: Mapper, props: IDict, query: IDict, opts: IDict): js.Any = js.native
    
    def beforeUpdateMany(mapper: Mapper, props: js.Array[IDict], opts: IDict): js.Any = js.native
    
    def count(mapper: Mapper, props: IDict, opts: IDict): js.Any = js.native
    
    def create(mapper: Mapper, props: IDict, opts: IDict): js.Any = js.native
    
    def createMany(mapper: Mapper, props: js.Array[IDict], opts: IDict): js.Any = js.native
    
    def dbg(args: js.Any*): Unit = js.native
    
    var debug: Boolean = js.native
    
    def destroy(mapper: Mapper, id: String, opts: IDict): js.Any = js.native
    def destroy(mapper: Mapper, id: Double, opts: IDict): js.Any = js.native
    
    def destroyAll(mapper: Mapper, query: IDict, opts: IDict): js.Any = js.native
    
    def find(mapper: Mapper, id: String, opts: IDict): js.Any = js.native
    def find(mapper: Mapper, id: Double, opts: IDict): js.Any = js.native
    
    def findAll(mapper: Mapper, query: IDict, opts: IDict): js.Any = js.native
    
    def loadBelongsTo(mapper: Mapper, `def`: IDict, records: js.Array[IDict], __opts: IDict): js.Promise[_] = js.native
    def loadBelongsTo(mapper: Mapper, `def`: IDict, records: IDict, __opts: IDict): js.Promise[_] = js.native
    
    def loadHasMany(mapper: Mapper, `def`: IDict, records: js.Array[IDict], __opts: IDict): js.Promise[_] = js.native
    def loadHasMany(mapper: Mapper, `def`: IDict, records: IDict, __opts: IDict): js.Promise[_] = js.native
    
    def loadHasManyForeignKeys(mapper: Mapper, `def`: IDict, records: js.Array[IDict], __opts: IDict): js.Promise[_] = js.native
    def loadHasManyForeignKeys(mapper: Mapper, `def`: IDict, records: IDict, __opts: IDict): js.Promise[_] = js.native
    
    def loadHasManyLocalKeys(mapper: Mapper, `def`: IDict, records: js.Array[IDict], __opts: IDict): js.Promise[_] = js.native
    def loadHasManyLocalKeys(mapper: Mapper, `def`: IDict, records: IDict, __opts: IDict): js.Promise[_] = js.native
    
    def loadHasOne(mapper: Mapper, `def`: IDict, records: js.Array[IDict], __opts: IDict): js.Promise[_] = js.native
    def loadHasOne(mapper: Mapper, `def`: IDict, records: IDict, __opts: IDict): js.Promise[_] = js.native
    
    def log(level: String, args: js.Any*): Unit = js.native
    
    def makeBelongsToForeignKey(mapper: Mapper, `def`: IDict, record: IDict): String = js.native
    
    def makeHasManyForeignKey(mapper: Mapper, `def`: IDict, record: IDict): String = js.native
    
    def makeHasManyForeignKeys(mapper: Mapper, `def`: IDict, record: IDict): String = js.native
    
    def makeHasManyLocalKeys(mapper: Mapper, `def`: IDict, record: IDict): String = js.native
    
    var raw: Boolean = js.native
    
    def respond(response: Response, opts: IDict): IDict | Response = js.native
    
    def sum(mapper: Mapper, field: String, query: IDict, opts: IDict): js.Any = js.native
    
    def update(mapper: Mapper, id: String, props: IDict, opts: IDict): js.Any = js.native
    def update(mapper: Mapper, id: Double, props: IDict, opts: IDict): js.Any = js.native
    
    def updateAll(mapper: Mapper, props: IDict, query: IDict, opts: IDict): js.Any = js.native
    
    def updateMany(mapper: Mapper, props: js.Array[IDict], opts: IDict): js.Any = js.native
  }
  /* static members */
  object Adapter {
    
    @JSImport("js-data-adapter", "Adapter.extend")
    @js.native
    def extend(): TypeofAdapter = js.native
    @JSImport("js-data-adapter", "Adapter.extend")
    @js.native
    def extend(instanceProps: js.UndefOr[scala.Nothing], classProps: IDict): TypeofAdapter = js.native
    @JSImport("js-data-adapter", "Adapter.extend")
    @js.native
    def extend(instanceProps: IDict): TypeofAdapter = js.native
    @JSImport("js-data-adapter", "Adapter.extend")
    @js.native
    def extend(instanceProps: IDict, classProps: IDict): TypeofAdapter = js.native
  }
  
  @JSImport("js-data-adapter", "Response")
  @js.native
  class Response () extends IDict {
    
    var data: js.Any = js.native
    
    var op: String = js.native
  }
  
  @JSImport("js-data-adapter", "noop")
  @js.native
  def noop(args: js.Any*): js.Promise[_] = js.native
  
  @JSImport("js-data-adapter", "noop2")
  @js.native
  def noop2(args: js.Any*): js.Promise[_] = js.native
  
  @JSImport("js-data-adapter", "unique")
  @js.native
  def unique(array: js.Array[_]): js.Array[_] = js.native
  
  @js.native
  trait IAdapterOpts extends IDict {
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var raw: js.UndefOr[Boolean] = js.native
  }
  object IAdapterOpts {
    
    @scala.inline
    def apply(): IAdapterOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAdapterOpts]
    }
    
    @scala.inline
    implicit class IAdapterOptsMutableBuilder[Self <: IAdapterOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  type IDict = StringDictionary[js.Any]
}
