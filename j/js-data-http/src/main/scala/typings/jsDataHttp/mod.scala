package typings.jsDataHttp

import org.scalablytyped.runtime.StringDictionary
import typings.jsDataAdapter.mod.Adapter
import typings.jsDataHttp.anon.Alpha
import typings.jsDataHttp.anon.TypeofHttpAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-data-http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("js-data-http", "HttpAdapter")
  @js.native
  open class HttpAdapter () extends Adapter {
    def this(opts: IBaseHttpAdapter) = this()
    
    def DEL(url: String): js.Promise[Any] = js.native
    def DEL(url: String, config: Any): js.Promise[Any] = js.native
    def DEL(url: String, config: Any, opts: Any): js.Promise[Any] = js.native
    def DEL(url: String, config: Unit, opts: Any): js.Promise[Any] = js.native
    
    def GET(url: String): js.Promise[Any] = js.native
    def GET(url: String, config: Any): js.Promise[Any] = js.native
    def GET(url: String, config: Any, opts: Any): js.Promise[Any] = js.native
    def GET(url: String, config: Unit, opts: Any): js.Promise[Any] = js.native
    
    def HTTP(config: Any): js.Promise[Any] = js.native
    def HTTP(config: Any, opts: Any): js.Promise[Any] = js.native
    
    def POST(url: String, data: Any): js.Promise[Any] = js.native
    def POST(url: String, data: Any, config: Any): js.Promise[Any] = js.native
    def POST(url: String, data: Any, config: Any, opts: Any): js.Promise[Any] = js.native
    def POST(url: String, data: Any, config: Unit, opts: Any): js.Promise[Any] = js.native
    
    def PUT(url: String, data: Any): js.Promise[Any] = js.native
    def PUT(url: String, data: Any, config: Any): js.Promise[Any] = js.native
    def PUT(url: String, data: Any, config: Any, opts: Any): js.Promise[Any] = js.native
    def PUT(url: String, data: Any, config: Unit, opts: Any): js.Promise[Any] = js.native
    
    def _count(mapper: Any, query: Any): js.Promise[Any] = js.native
    def _count(mapper: Any, query: Any, opts: Any): js.Promise[Any] = js.native
    
    def _create(mapper: Any, props: Any): js.Promise[Any] = js.native
    def _create(mapper: Any, props: Any, opts: Any): js.Promise[Any] = js.native
    
    def _createMany(mapper: Any, props: Any): js.Promise[Any] = js.native
    def _createMany(mapper: Any, props: Any, opts: Any): js.Promise[Any] = js.native
    
    def _destroy(mapper: Any, id: String): js.Promise[Any] = js.native
    def _destroy(mapper: Any, id: String, opts: Any): js.Promise[Any] = js.native
    def _destroy(mapper: Any, id: Double): js.Promise[Any] = js.native
    def _destroy(mapper: Any, id: Double, opts: Any): js.Promise[Any] = js.native
    
    def _destroyAll(mapper: Any, query: Any): js.Promise[Any] = js.native
    def _destroyAll(mapper: Any, query: Any, opts: Any): js.Promise[Any] = js.native
    
    def _end(mapper: Any, opts: Any, response: Any): Any = js.native
    
    def _find(mapper: Any, id: String): js.Promise[Any] = js.native
    def _find(mapper: Any, id: String, opts: Any): js.Promise[Any] = js.native
    def _find(mapper: Any, id: Double): js.Promise[Any] = js.native
    def _find(mapper: Any, id: Double, opts: Any): js.Promise[Any] = js.native
    
    def _findAll(mapper: Any, query: Any): js.Promise[Any] = js.native
    def _findAll(mapper: Any, query: Any, opts: Any): js.Promise[Any] = js.native
    
    def _sum(mapper: Any, field: Any, query: Any): js.Promise[Any] = js.native
    def _sum(mapper: Any, field: Any, query: Any, opts: Any): js.Promise[Any] = js.native
    
    def _update(mapper: Any, id: Any, props: Any): js.Promise[Any] = js.native
    def _update(mapper: Any, id: Any, props: Any, opts: Any): js.Promise[Any] = js.native
    
    def _updateAll(mapper: Any, props: Any, query: Any): js.Promise[Any] = js.native
    def _updateAll(mapper: Any, props: Any, query: Any, opts: Any): js.Promise[Any] = js.native
    
    def _updateMany(mapper: Any, records: Any): js.Promise[Any] = js.native
    def _updateMany(mapper: Any, records: Any, opts: Any): js.Promise[Any] = js.native
    
    def afterDEL(url: String, config: Any, opts: Any, response: Any): Any = js.native
    
    def afterGET(url: String, config: Any, opts: Any, response: Any): Any = js.native
    
    def afterHTTP(config: Any, opts: Any, response: Any): Any = js.native
    
    def afterPOST(url: String, data: Any, config: Any, opts: Any, response: Any): Any = js.native
    
    def afterPUT(url: String, data: Any, config: Any, opts: Any, response: Any): Any = js.native
    
    def beforeDEL(url: String, config: Any, opts: Any): Any = js.native
    
    def beforeGET(url: String, config: Any, opts: Any): Any = js.native
    
    def beforeHTTP(config: Any, opts: Any): Any = js.native
    
    def beforePOST(url: String, data: Any, config: Any, opts: Any): Any = js.native
    
    def beforePUT(url: String, data: Any, config: Any, opts: Any): Any = js.native
    
    def count(mapper: Any, query: Any): js.Promise[Any] = js.native
    def count(mapper: Any, query: Any, opts: Any): js.Promise[Any] = js.native
    
    def create(mapper: Any, props: Any): js.Promise[Any] = js.native
    def create(mapper: Any, props: Any, opts: Any): js.Promise[Any] = js.native
    
    def createMany(mapper: Any, props: Any): js.Promise[Any] = js.native
    def createMany(mapper: Any, props: Any, opts: Any): js.Promise[Any] = js.native
    
    def deserialize(mapper: Any, response: Any): Any = js.native
    def deserialize(mapper: Any, response: Any, opts: Any): Any = js.native
    
    def destroy(mapper: Any, id: String): js.Promise[Any] = js.native
    def destroy(mapper: Any, id: String, opts: Any): js.Promise[Any] = js.native
    def destroy(mapper: Any, id: Double): js.Promise[Any] = js.native
    def destroy(mapper: Any, id: Double, opts: Any): js.Promise[Any] = js.native
    
    def destroyAll(mapper: Any, query: Any): js.Promise[Any] = js.native
    def destroyAll(mapper: Any, query: Any, opts: Any): js.Promise[Any] = js.native
    
    def error(args: Any*): Unit = js.native
    
    def fetch(config: Any): js.Promise[Any] = js.native
    def fetch(config: Any, opts: Any): js.Promise[Any] = js.native
    
    def find(mapper: Any, id: String): js.Promise[Any] = js.native
    def find(mapper: Any, id: String, opts: Any): js.Promise[Any] = js.native
    def find(mapper: Any, id: Double): js.Promise[Any] = js.native
    def find(mapper: Any, id: Double, opts: Any): js.Promise[Any] = js.native
    
    def findAll(mapper: Any, query: Any): js.Promise[Any] = js.native
    def findAll(mapper: Any, query: Any, opts: Any): js.Promise[Any] = js.native
    
    def getEndpoint(mapper: Any, id: String): Any = js.native
    def getEndpoint(mapper: Any, id: String, opts: Any): Any = js.native
    def getEndpoint(mapper: Any, id: Double): Any = js.native
    def getEndpoint(mapper: Any, id: Double, opts: Any): Any = js.native
    
    def getParams(): Any = js.native
    def getParams(opts: Any): Any = js.native
    
    def getPath(method: String, mapper: Any, id: Any): Any = js.native
    def getPath(method: String, mapper: Any, id: Any, opts: Any): Any = js.native
    
    def getSuffix(mapper: Any): Any = js.native
    def getSuffix(mapper: Any, opts: Any): Any = js.native
    
    def queryTransform(mapper: Any, params: Any): Any = js.native
    def queryTransform(mapper: Any, params: Any, opts: Any): Any = js.native
    
    def responseError(err: Any): Any = js.native
    def responseError(err: Any, config: Any): Any = js.native
    def responseError(err: Any, config: Any, opts: Any): Any = js.native
    def responseError(err: Any, config: Unit, opts: Any): Any = js.native
    
    def serialize(mapper: Any, data: Any): js.Promise[Any] = js.native
    def serialize(mapper: Any, data: Any, opts: Any): js.Promise[Any] = js.native
    
    def sum(mapper: Any, field: Any, query: Any): js.Promise[Any] = js.native
    def sum(mapper: Any, field: Any, query: Any, opts: Any): js.Promise[Any] = js.native
    
    def update(mapper: Any, id: Any, props: Any): js.Promise[Any] = js.native
    def update(mapper: Any, id: Any, props: Any, opts: Any): js.Promise[Any] = js.native
    
    def updateAll(mapper: Any, props: Any, query: Any): js.Promise[Any] = js.native
    def updateAll(mapper: Any, props: Any, query: Any, opts: Any): js.Promise[Any] = js.native
    
    def updateMany(mapper: Any, records: Any): js.Promise[Any] = js.native
    def updateMany(mapper: Any, records: Any, opts: Any): js.Promise[Any] = js.native
  }
  /* static members */
  object HttpAdapter {
    
    @JSImport("js-data-http", "HttpAdapter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def extend(): TypeofHttpAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")().asInstanceOf[TypeofHttpAdapter]
    inline def extend(instanceProps: Unit, classProps: IDict): TypeofHttpAdapter = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(instanceProps.asInstanceOf[js.Any], classProps.asInstanceOf[js.Any])).asInstanceOf[TypeofHttpAdapter]
    inline def extend(instanceProps: IDict): TypeofHttpAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(instanceProps.asInstanceOf[js.Any]).asInstanceOf[TypeofHttpAdapter]
    inline def extend(instanceProps: IDict, classProps: IDict): TypeofHttpAdapter = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(instanceProps.asInstanceOf[js.Any], classProps.asInstanceOf[js.Any])).asInstanceOf[TypeofHttpAdapter]
    
    @JSImport("js-data-http", "HttpAdapter.version")
    @js.native
    def version: Alpha = js.native
    inline def version_=(x: Alpha): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  inline def addAction(name: String, opts: IActionOpts): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("addAction")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  inline def addActions(): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("addActions")().asInstanceOf[js.Function]
  inline def addActions(opts: StringDictionary[IActionOpts]): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("addActions")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  trait IActionOpts extends StObject {
    
    var adapter: js.UndefOr[String] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var request: js.UndefOr[js.Function] = js.undefined
    
    var response: js.UndefOr[js.Function] = js.undefined
    
    var responseError: js.UndefOr[js.Function] = js.undefined
  }
  object IActionOpts {
    
    inline def apply(): IActionOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IActionOpts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IActionOpts] (val x: Self) extends AnyVal {
      
      inline def setAdapter(value: String): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setRequest(value: js.Function): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setResponse(value: js.Function): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseError(value: js.Function): Self = StObject.set(x, "responseError", value.asInstanceOf[js.Any])
      
      inline def setResponseErrorUndefined: Self = StObject.set(x, "responseError", js.undefined)
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  trait IBaseAdapter
    extends StObject
       with IDict {
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
  }
  object IBaseAdapter {
    
    inline def apply(): IBaseAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBaseAdapter] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  trait IBaseHttpAdapter
    extends StObject
       with IBaseAdapter {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var forceTrailingSlash: js.UndefOr[Boolean] = js.undefined
    
    var http: js.UndefOr[Any] = js.undefined
    
    var httpConfig: js.UndefOr[IDict] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var useFetch: js.UndefOr[Boolean] = js.undefined
  }
  object IBaseHttpAdapter {
    
    inline def apply(): IBaseHttpAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseHttpAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IBaseHttpAdapter] (val x: Self) extends AnyVal {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setForceTrailingSlash(value: Boolean): Self = StObject.set(x, "forceTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setForceTrailingSlashUndefined: Self = StObject.set(x, "forceTrailingSlash", js.undefined)
      
      inline def setHttp(value: Any): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpConfig(value: IDict): Self = StObject.set(x, "httpConfig", value.asInstanceOf[js.Any])
      
      inline def setHttpConfigUndefined: Self = StObject.set(x, "httpConfig", js.undefined)
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setUseFetch(value: Boolean): Self = StObject.set(x, "useFetch", value.asInstanceOf[js.Any])
      
      inline def setUseFetchUndefined: Self = StObject.set(x, "useFetch", js.undefined)
    }
  }
  
  type IDict = StringDictionary[Any]
}
