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
  class HttpAdapter () extends Adapter {
    def this(opts: IBaseHttpAdapter) = this()
    
    def DEL(url: String): js.Promise[js.Any] = js.native
    def DEL(url: String, config: js.Any): js.Promise[js.Any] = js.native
    def DEL(url: String, config: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    def DEL(url: String, config: Unit, opts: js.Any): js.Promise[js.Any] = js.native
    
    def GET(url: String): js.Promise[js.Any] = js.native
    def GET(url: String, config: js.Any): js.Promise[js.Any] = js.native
    def GET(url: String, config: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    def GET(url: String, config: Unit, opts: js.Any): js.Promise[js.Any] = js.native
    
    def HTTP(config: js.Any): js.Promise[js.Any] = js.native
    def HTTP(config: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def POST(url: String, data: js.Any): js.Promise[js.Any] = js.native
    def POST(url: String, data: js.Any, config: js.Any): js.Promise[js.Any] = js.native
    def POST(url: String, data: js.Any, config: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    def POST(url: String, data: js.Any, config: Unit, opts: js.Any): js.Promise[js.Any] = js.native
    
    def PUT(url: String, data: js.Any): js.Promise[js.Any] = js.native
    def PUT(url: String, data: js.Any, config: js.Any): js.Promise[js.Any] = js.native
    def PUT(url: String, data: js.Any, config: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    def PUT(url: String, data: js.Any, config: Unit, opts: js.Any): js.Promise[js.Any] = js.native
    
    def _count(mapper: js.Any, query: js.Any): js.Promise[js.Any] = js.native
    def _count(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def _create(mapper: js.Any, props: js.Any): js.Promise[js.Any] = js.native
    def _create(mapper: js.Any, props: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def _createMany(mapper: js.Any, props: js.Any): js.Promise[js.Any] = js.native
    def _createMany(mapper: js.Any, props: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def _destroy(mapper: js.Any, id: String): js.Promise[js.Any] = js.native
    def _destroy(mapper: js.Any, id: String, opts: js.Any): js.Promise[js.Any] = js.native
    def _destroy(mapper: js.Any, id: Double): js.Promise[js.Any] = js.native
    def _destroy(mapper: js.Any, id: Double, opts: js.Any): js.Promise[js.Any] = js.native
    
    def _destroyAll(mapper: js.Any, query: js.Any): js.Promise[js.Any] = js.native
    def _destroyAll(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def _end(mapper: js.Any, opts: js.Any, response: js.Any): js.Any = js.native
    
    def _find(mapper: js.Any, id: String): js.Promise[js.Any] = js.native
    def _find(mapper: js.Any, id: String, opts: js.Any): js.Promise[js.Any] = js.native
    def _find(mapper: js.Any, id: Double): js.Promise[js.Any] = js.native
    def _find(mapper: js.Any, id: Double, opts: js.Any): js.Promise[js.Any] = js.native
    
    def _findAll(mapper: js.Any, query: js.Any): js.Promise[js.Any] = js.native
    def _findAll(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def _sum(mapper: js.Any, field: js.Any, query: js.Any): js.Promise[js.Any] = js.native
    def _sum(mapper: js.Any, field: js.Any, query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def _update(mapper: js.Any, id: js.Any, props: js.Any): js.Promise[js.Any] = js.native
    def _update(mapper: js.Any, id: js.Any, props: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def _updateAll(mapper: js.Any, props: js.Any, query: js.Any): js.Promise[js.Any] = js.native
    def _updateAll(mapper: js.Any, props: js.Any, query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def _updateMany(mapper: js.Any, records: js.Any): js.Promise[js.Any] = js.native
    def _updateMany(mapper: js.Any, records: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def afterDEL(url: String, config: js.Any, opts: js.Any, response: js.Any): js.Any = js.native
    
    def afterGET(url: String, config: js.Any, opts: js.Any, response: js.Any): js.Any = js.native
    
    def afterHTTP(config: js.Any, opts: js.Any, response: js.Any): js.Any = js.native
    
    def afterPOST(url: String, data: js.Any, config: js.Any, opts: js.Any, response: js.Any): js.Any = js.native
    
    def afterPUT(url: String, data: js.Any, config: js.Any, opts: js.Any, response: js.Any): js.Any = js.native
    
    def beforeDEL(url: String, config: js.Any, opts: js.Any): js.Any = js.native
    
    def beforeGET(url: String, config: js.Any, opts: js.Any): js.Any = js.native
    
    def beforeHTTP(config: js.Any, opts: js.Any): js.Any = js.native
    
    def beforePOST(url: String, data: js.Any, config: js.Any, opts: js.Any): js.Any = js.native
    
    def beforePUT(url: String, data: js.Any, config: js.Any, opts: js.Any): js.Any = js.native
    
    def count(mapper: js.Any, query: js.Any): js.Promise[js.Any] = js.native
    def count(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def create(mapper: js.Any, props: js.Any): js.Promise[js.Any] = js.native
    def create(mapper: js.Any, props: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def createMany(mapper: js.Any, props: js.Any): js.Promise[js.Any] = js.native
    def createMany(mapper: js.Any, props: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def deserialize(mapper: js.Any, response: js.Any): js.Any = js.native
    def deserialize(mapper: js.Any, response: js.Any, opts: js.Any): js.Any = js.native
    
    def destroy(mapper: js.Any, id: String): js.Promise[js.Any] = js.native
    def destroy(mapper: js.Any, id: String, opts: js.Any): js.Promise[js.Any] = js.native
    def destroy(mapper: js.Any, id: Double): js.Promise[js.Any] = js.native
    def destroy(mapper: js.Any, id: Double, opts: js.Any): js.Promise[js.Any] = js.native
    
    def destroyAll(mapper: js.Any, query: js.Any): js.Promise[js.Any] = js.native
    def destroyAll(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def error(args: js.Any*): Unit = js.native
    
    def fetch(config: js.Any): js.Promise[js.Any] = js.native
    def fetch(config: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def find(mapper: js.Any, id: String): js.Promise[js.Any] = js.native
    def find(mapper: js.Any, id: String, opts: js.Any): js.Promise[js.Any] = js.native
    def find(mapper: js.Any, id: Double): js.Promise[js.Any] = js.native
    def find(mapper: js.Any, id: Double, opts: js.Any): js.Promise[js.Any] = js.native
    
    def findAll(mapper: js.Any, query: js.Any): js.Promise[js.Any] = js.native
    def findAll(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def getEndpoint(mapper: js.Any, id: String): js.Any = js.native
    def getEndpoint(mapper: js.Any, id: String, opts: js.Any): js.Any = js.native
    def getEndpoint(mapper: js.Any, id: Double): js.Any = js.native
    def getEndpoint(mapper: js.Any, id: Double, opts: js.Any): js.Any = js.native
    
    def getParams(): js.Any = js.native
    def getParams(opts: js.Any): js.Any = js.native
    
    def getPath(method: String, mapper: js.Any, id: js.Any): js.Any = js.native
    def getPath(method: String, mapper: js.Any, id: js.Any, opts: js.Any): js.Any = js.native
    
    def getSuffix(mapper: js.Any): js.Any = js.native
    def getSuffix(mapper: js.Any, opts: js.Any): js.Any = js.native
    
    def queryTransform(mapper: js.Any, params: js.Any): js.Any = js.native
    def queryTransform(mapper: js.Any, params: js.Any, opts: js.Any): js.Any = js.native
    
    def responseError(err: js.Any): js.Any = js.native
    def responseError(err: js.Any, config: js.Any): js.Any = js.native
    def responseError(err: js.Any, config: js.Any, opts: js.Any): js.Any = js.native
    def responseError(err: js.Any, config: Unit, opts: js.Any): js.Any = js.native
    
    def serialize(mapper: js.Any, data: js.Any): js.Promise[js.Any] = js.native
    def serialize(mapper: js.Any, data: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def sum(mapper: js.Any, field: js.Any, query: js.Any): js.Promise[js.Any] = js.native
    def sum(mapper: js.Any, field: js.Any, query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def update(mapper: js.Any, id: js.Any, props: js.Any): js.Promise[js.Any] = js.native
    def update(mapper: js.Any, id: js.Any, props: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def updateAll(mapper: js.Any, props: js.Any, query: js.Any): js.Promise[js.Any] = js.native
    def updateAll(mapper: js.Any, props: js.Any, query: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
    
    def updateMany(mapper: js.Any, records: js.Any): js.Promise[js.Any] = js.native
    def updateMany(mapper: js.Any, records: js.Any, opts: js.Any): js.Promise[js.Any] = js.native
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
    
    extension [Self <: IActionOpts](x: Self) {
      
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
    
    extension [Self <: IBaseAdapter](x: Self) {
      
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
    
    var http: js.UndefOr[js.Any] = js.undefined
    
    var httpConfig: js.UndefOr[IDict] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var useFetch: js.UndefOr[Boolean] = js.undefined
  }
  object IBaseHttpAdapter {
    
    inline def apply(): IBaseHttpAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseHttpAdapter]
    }
    
    extension [Self <: IBaseHttpAdapter](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setForceTrailingSlash(value: Boolean): Self = StObject.set(x, "forceTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setForceTrailingSlashUndefined: Self = StObject.set(x, "forceTrailingSlash", js.undefined)
      
      inline def setHttp(value: js.Any): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpConfig(value: IDict): Self = StObject.set(x, "httpConfig", value.asInstanceOf[js.Any])
      
      inline def setHttpConfigUndefined: Self = StObject.set(x, "httpConfig", js.undefined)
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setUseFetch(value: Boolean): Self = StObject.set(x, "useFetch", value.asInstanceOf[js.Any])
      
      inline def setUseFetchUndefined: Self = StObject.set(x, "useFetch", js.undefined)
    }
  }
  
  type IDict = StringDictionary[js.Any]
}
