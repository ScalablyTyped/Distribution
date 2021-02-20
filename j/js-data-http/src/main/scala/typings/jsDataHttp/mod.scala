package typings.jsDataHttp

import org.scalablytyped.runtime.StringDictionary
import typings.jsDataAdapter.mod.Adapter
import typings.jsDataHttp.anon.Alpha
import typings.jsDataHttp.anon.TypeofHttpAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-data-http", "HttpAdapter")
  @js.native
  class HttpAdapter () extends Adapter {
    def this(opts: IBaseHttpAdapter) = this()
    
    def DEL(url: String): js.Promise[_] = js.native
    def DEL(url: String, config: js.UndefOr[scala.Nothing], opts: js.Any): js.Promise[_] = js.native
    def DEL(url: String, config: js.Any): js.Promise[_] = js.native
    def DEL(url: String, config: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def GET(url: String): js.Promise[_] = js.native
    def GET(url: String, config: js.UndefOr[scala.Nothing], opts: js.Any): js.Promise[_] = js.native
    def GET(url: String, config: js.Any): js.Promise[_] = js.native
    def GET(url: String, config: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def HTTP(config: js.Any): js.Promise[_] = js.native
    def HTTP(config: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def POST(url: String, data: js.Any): js.Promise[_] = js.native
    def POST(url: String, data: js.Any, config: js.UndefOr[scala.Nothing], opts: js.Any): js.Promise[_] = js.native
    def POST(url: String, data: js.Any, config: js.Any): js.Promise[_] = js.native
    def POST(url: String, data: js.Any, config: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def PUT(url: String, data: js.Any): js.Promise[_] = js.native
    def PUT(url: String, data: js.Any, config: js.UndefOr[scala.Nothing], opts: js.Any): js.Promise[_] = js.native
    def PUT(url: String, data: js.Any, config: js.Any): js.Promise[_] = js.native
    def PUT(url: String, data: js.Any, config: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def _count(mapper: js.Any, query: js.Any): js.Promise[_] = js.native
    def _count(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def _create(mapper: js.Any, props: js.Any): js.Promise[_] = js.native
    def _create(mapper: js.Any, props: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def _createMany(mapper: js.Any, props: js.Any): js.Promise[_] = js.native
    def _createMany(mapper: js.Any, props: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def _destroy(mapper: js.Any, id: String): js.Promise[_] = js.native
    def _destroy(mapper: js.Any, id: String, opts: js.Any): js.Promise[_] = js.native
    def _destroy(mapper: js.Any, id: Double): js.Promise[_] = js.native
    def _destroy(mapper: js.Any, id: Double, opts: js.Any): js.Promise[_] = js.native
    
    def _destroyAll(mapper: js.Any, query: js.Any): js.Promise[_] = js.native
    def _destroyAll(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def _end(mapper: js.Any, opts: js.Any, response: js.Any): js.Any = js.native
    
    def _find(mapper: js.Any, id: String): js.Promise[_] = js.native
    def _find(mapper: js.Any, id: String, opts: js.Any): js.Promise[_] = js.native
    def _find(mapper: js.Any, id: Double): js.Promise[_] = js.native
    def _find(mapper: js.Any, id: Double, opts: js.Any): js.Promise[_] = js.native
    
    def _findAll(mapper: js.Any, query: js.Any): js.Promise[_] = js.native
    def _findAll(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def _sum(mapper: js.Any, field: js.Any, query: js.Any): js.Promise[_] = js.native
    def _sum(mapper: js.Any, field: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def _update(mapper: js.Any, id: js.Any, props: js.Any): js.Promise[_] = js.native
    def _update(mapper: js.Any, id: js.Any, props: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def _updateAll(mapper: js.Any, props: js.Any, query: js.Any): js.Promise[_] = js.native
    def _updateAll(mapper: js.Any, props: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def _updateMany(mapper: js.Any, records: js.Any): js.Promise[_] = js.native
    def _updateMany(mapper: js.Any, records: js.Any, opts: js.Any): js.Promise[_] = js.native
    
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
    
    def count(mapper: js.Any, query: js.Any): js.Promise[_] = js.native
    def count(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def create(mapper: js.Any, props: js.Any): js.Promise[_] = js.native
    def create(mapper: js.Any, props: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def createMany(mapper: js.Any, props: js.Any): js.Promise[_] = js.native
    def createMany(mapper: js.Any, props: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def deserialize(mapper: js.Any, response: js.Any): js.Any = js.native
    def deserialize(mapper: js.Any, response: js.Any, opts: js.Any): js.Any = js.native
    
    def destroy(mapper: js.Any, id: String): js.Promise[_] = js.native
    def destroy(mapper: js.Any, id: String, opts: js.Any): js.Promise[_] = js.native
    def destroy(mapper: js.Any, id: Double): js.Promise[_] = js.native
    def destroy(mapper: js.Any, id: Double, opts: js.Any): js.Promise[_] = js.native
    
    def destroyAll(mapper: js.Any, query: js.Any): js.Promise[_] = js.native
    def destroyAll(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def error(args: js.Any*): Unit = js.native
    
    def fetch(config: js.Any): js.Promise[_] = js.native
    def fetch(config: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def find(mapper: js.Any, id: String): js.Promise[_] = js.native
    def find(mapper: js.Any, id: String, opts: js.Any): js.Promise[_] = js.native
    def find(mapper: js.Any, id: Double): js.Promise[_] = js.native
    def find(mapper: js.Any, id: Double, opts: js.Any): js.Promise[_] = js.native
    
    def findAll(mapper: js.Any, query: js.Any): js.Promise[_] = js.native
    def findAll(mapper: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
    
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
    def responseError(err: js.Any, config: js.UndefOr[scala.Nothing], opts: js.Any): js.Any = js.native
    def responseError(err: js.Any, config: js.Any): js.Any = js.native
    def responseError(err: js.Any, config: js.Any, opts: js.Any): js.Any = js.native
    
    def serialize(mapper: js.Any, data: js.Any): js.Promise[_] = js.native
    def serialize(mapper: js.Any, data: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def sum(mapper: js.Any, field: js.Any, query: js.Any): js.Promise[_] = js.native
    def sum(mapper: js.Any, field: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def update(mapper: js.Any, id: js.Any, props: js.Any): js.Promise[_] = js.native
    def update(mapper: js.Any, id: js.Any, props: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def updateAll(mapper: js.Any, props: js.Any, query: js.Any): js.Promise[_] = js.native
    def updateAll(mapper: js.Any, props: js.Any, query: js.Any, opts: js.Any): js.Promise[_] = js.native
    
    def updateMany(mapper: js.Any, records: js.Any): js.Promise[_] = js.native
    def updateMany(mapper: js.Any, records: js.Any, opts: js.Any): js.Promise[_] = js.native
  }
  /* static members */
  object HttpAdapter {
    
    @JSImport("js-data-http", "HttpAdapter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("js-data-http", "HttpAdapter.extend")
    @js.native
    def extend(): TypeofHttpAdapter = js.native
    @JSImport("js-data-http", "HttpAdapter.extend")
    @js.native
    def extend(instanceProps: js.UndefOr[scala.Nothing], classProps: IDict): TypeofHttpAdapter = js.native
    @JSImport("js-data-http", "HttpAdapter.extend")
    @js.native
    def extend(instanceProps: IDict): TypeofHttpAdapter = js.native
    @JSImport("js-data-http", "HttpAdapter.extend")
    @js.native
    def extend(instanceProps: IDict, classProps: IDict): TypeofHttpAdapter = js.native
    
    @JSImport("js-data-http", "HttpAdapter.version")
    @js.native
    def version: Alpha = js.native
    @scala.inline
    def version_=(x: Alpha): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("js-data-http", "addAction")
  @js.native
  def addAction(name: String, opts: IActionOpts): js.Function = js.native
  
  @JSImport("js-data-http", "addActions")
  @js.native
  def addActions(): js.Function = js.native
  @JSImport("js-data-http", "addActions")
  @js.native
  def addActions(opts: StringDictionary[IActionOpts]): js.Function = js.native
  
  @js.native
  trait IActionOpts extends StObject {
    
    var adapter: js.UndefOr[String] = js.native
    
    var pathname: js.UndefOr[String] = js.native
    
    var request: js.UndefOr[js.Function] = js.native
    
    var response: js.UndefOr[js.Function] = js.native
    
    var responseError: js.UndefOr[js.Function] = js.native
  }
  object IActionOpts {
    
    @scala.inline
    def apply(): IActionOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IActionOpts]
    }
    
    @scala.inline
    implicit class IActionOptsMutableBuilder[Self <: IActionOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: String): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      @scala.inline
      def setRequest(value: js.Function): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setResponse(value: js.Function): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseError(value: js.Function): Self = StObject.set(x, "responseError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseErrorUndefined: Self = StObject.set(x, "responseError", js.undefined)
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  @js.native
  trait IBaseAdapter extends IDict {
    
    var debug: js.UndefOr[Boolean] = js.native
    
    var raw: js.UndefOr[Boolean] = js.native
  }
  object IBaseAdapter {
    
    @scala.inline
    def apply(): IBaseAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseAdapter]
    }
    
    @scala.inline
    implicit class IBaseAdapterMutableBuilder[Self <: IBaseAdapter] (val x: Self) extends AnyVal {
      
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
  
  @js.native
  trait IBaseHttpAdapter extends IBaseAdapter {
    
    var basePath: js.UndefOr[String] = js.native
    
    var forceTrailingSlash: js.UndefOr[Boolean] = js.native
    
    var http: js.UndefOr[js.Any] = js.native
    
    var httpConfig: js.UndefOr[IDict] = js.native
    
    var suffix: js.UndefOr[String] = js.native
    
    var useFetch: js.UndefOr[Boolean] = js.native
  }
  object IBaseHttpAdapter {
    
    @scala.inline
    def apply(): IBaseHttpAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBaseHttpAdapter]
    }
    
    @scala.inline
    implicit class IBaseHttpAdapterMutableBuilder[Self <: IBaseHttpAdapter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setForceTrailingSlash(value: Boolean): Self = StObject.set(x, "forceTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceTrailingSlashUndefined: Self = StObject.set(x, "forceTrailingSlash", js.undefined)
      
      @scala.inline
      def setHttp(value: js.Any): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpConfig(value: IDict): Self = StObject.set(x, "httpConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpConfigUndefined: Self = StObject.set(x, "httpConfig", js.undefined)
      
      @scala.inline
      def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setUseFetch(value: Boolean): Self = StObject.set(x, "useFetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseFetchUndefined: Self = StObject.set(x, "useFetch", js.undefined)
    }
  }
  
  type IDict = StringDictionary[js.Any]
}
