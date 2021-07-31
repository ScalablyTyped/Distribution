package typings.loaderRunner

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("loader-runner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getContext(resource: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getContext")(resource.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def runLoaders(
    options: RunLoaderOption,
    callback: js.Function2[/* err */ ErrnoException | Null, /* result */ RunLoaderResult, js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("runLoaders")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ExtendedLoaderContext extends StObject {
    
    def addContextDependency(context: String): Unit
    
    def addDependency(file: String): Unit
    
    var async: js.Function0[js.UndefOr[js.Function0[Unit]]] | Null
    
    def cacheable(flag: Boolean): Unit
    
    var callback: js.Function0[Unit] | Null
    
    def clearDependencies(): Unit
    
    var context: String | Null
    
    var currentRequest: String
    
    var data: js.Any
    
    def dependency(file: String): Unit
    
    def getContextDependencies(): js.Array[String]
    
    def getDependencies(): js.Array[String]
    
    var loaderIndex: Double
    
    var loaders: js.Array[Loader]
    
    var previousRequest: String
    
    var query: StringDictionary[js.Any] | String
    
    var remainingRequest: String
    
    var request: String
    
    var resource: String
    
    var resourcePath: js.UndefOr[String] = js.undefined
    
    var resourceQuery: js.UndefOr[String] = js.undefined
  }
  object ExtendedLoaderContext {
    
    @scala.inline
    def apply(
      addContextDependency: String => Unit,
      addDependency: String => Unit,
      cacheable: Boolean => Unit,
      clearDependencies: () => Unit,
      currentRequest: String,
      data: js.Any,
      dependency: String => Unit,
      getContextDependencies: () => js.Array[String],
      getDependencies: () => js.Array[String],
      loaderIndex: Double,
      loaders: js.Array[Loader],
      previousRequest: String,
      query: StringDictionary[js.Any] | String,
      remainingRequest: String,
      request: String,
      resource: String
    ): ExtendedLoaderContext = {
      val __obj = js.Dynamic.literal(addContextDependency = js.Any.fromFunction1(addContextDependency), addDependency = js.Any.fromFunction1(addDependency), cacheable = js.Any.fromFunction1(cacheable), clearDependencies = js.Any.fromFunction0(clearDependencies), currentRequest = currentRequest.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dependency = js.Any.fromFunction1(dependency), getContextDependencies = js.Any.fromFunction0(getContextDependencies), getDependencies = js.Any.fromFunction0(getDependencies), loaderIndex = loaderIndex.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], previousRequest = previousRequest.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], remainingRequest = remainingRequest.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], async = null, callback = null, context = null)
      __obj.asInstanceOf[ExtendedLoaderContext]
    }
    
    @scala.inline
    implicit class ExtendedLoaderContextMutableBuilder[Self <: ExtendedLoaderContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddContextDependency(value: String => Unit): Self = StObject.set(x, "addContextDependency", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddDependency(value: String => Unit): Self = StObject.set(x, "addDependency", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAsync(value: () => js.UndefOr[js.Function0[Unit]]): Self = StObject.set(x, "async", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAsyncNull: Self = StObject.set(x, "async", null)
      
      @scala.inline
      def setCacheable(value: Boolean => Unit): Self = StObject.set(x, "cacheable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCallbackNull: Self = StObject.set(x, "callback", null)
      
      @scala.inline
      def setClearDependencies(value: () => Unit): Self = StObject.set(x, "clearDependencies", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextNull: Self = StObject.set(x, "context", null)
      
      @scala.inline
      def setCurrentRequest(value: String): Self = StObject.set(x, "currentRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependency(value: String => Unit): Self = StObject.set(x, "dependency", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetContextDependencies(value: () => js.Array[String]): Self = StObject.set(x, "getContextDependencies", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDependencies(value: () => js.Array[String]): Self = StObject.set(x, "getDependencies", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoaderIndex(value: Double): Self = StObject.set(x, "loaderIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaders(value: js.Array[Loader]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadersVarargs(value: Loader*): Self = StObject.set(x, "loaders", js.Array(value :_*))
      
      @scala.inline
      def setPreviousRequest(value: String): Self = StObject.set(x, "previousRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: StringDictionary[js.Any] | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemainingRequest(value: String): Self = StObject.set(x, "remainingRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcePath(value: String): Self = StObject.set(x, "resourcePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourcePathUndefined: Self = StObject.set(x, "resourcePath", js.undefined)
      
      @scala.inline
      def setResourceQuery(value: String): Self = StObject.set(x, "resourceQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceQueryUndefined: Self = StObject.set(x, "resourceQuery", js.undefined)
    }
  }
  
  trait Loader extends StObject {
    
    var data: js.Any
    
    var normal: Null | (js.Function1[/* request */ String, String])
    
    var normalExecuted: Boolean
    
    var options: js.Any
    
    var path: String
    
    var pitch: Null | (js.Function1[/* request */ String, String])
    
    var pitchExecuted: Boolean
    
    var query: String
    
    var raw: String
    
    var request: String
  }
  object Loader {
    
    @scala.inline
    def apply(
      data: js.Any,
      normalExecuted: Boolean,
      options: js.Any,
      path: String,
      pitchExecuted: Boolean,
      query: String,
      raw: String,
      request: String
    ): Loader = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], normalExecuted = normalExecuted.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pitchExecuted = pitchExecuted.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], normal = null, pitch = null)
      __obj.asInstanceOf[Loader]
    }
    
    @scala.inline
    implicit class LoaderMutableBuilder[Self <: Loader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormal(value: /* request */ String => String): Self = StObject.set(x, "normal", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNormalExecuted(value: Boolean): Self = StObject.set(x, "normalExecuted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalNull: Self = StObject.set(x, "normal", null)
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPitch(value: /* request */ String => String): Self = StObject.set(x, "pitch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPitchExecuted(value: Boolean): Self = StObject.set(x, "pitchExecuted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPitchNull: Self = StObject.set(x, "pitch", null)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait RunLoaderOption extends StObject {
    
    var context: js.Any
    
    var loaders: js.Array[js.Any]
    
    def readResource(
      filename: String,
      callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer | Null, Unit]
    ): Unit
    
    var resource: String
  }
  object RunLoaderOption {
    
    @scala.inline
    def apply(
      context: js.Any,
      loaders: js.Array[js.Any],
      readResource: (String, js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer | Null, Unit]) => Unit,
      resource: String
    ): RunLoaderOption = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], readResource = js.Any.fromFunction2(readResource), resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunLoaderOption]
    }
    
    @scala.inline
    implicit class RunLoaderOptionMutableBuilder[Self <: RunLoaderOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaders(value: js.Array[js.Any]): Self = StObject.set(x, "loaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadersVarargs(value: js.Any*): Self = StObject.set(x, "loaders", js.Array(value :_*))
      
      @scala.inline
      def setReadResource(
        value: (String, js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer | Null, Unit]) => Unit
      ): Self = StObject.set(x, "readResource", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    }
  }
  
  trait RunLoaderResult extends StObject {
    
    var cacheable: Boolean
    
    var contextDependencies: js.Array[String]
    
    var fileDependencies: js.Array[String]
    
    var resourceBuffer: js.UndefOr[Buffer | Null] = js.undefined
    
    var result: js.UndefOr[js.Array[Buffer | Null]] = js.undefined
  }
  object RunLoaderResult {
    
    @scala.inline
    def apply(cacheable: Boolean, contextDependencies: js.Array[String], fileDependencies: js.Array[String]): RunLoaderResult = {
      val __obj = js.Dynamic.literal(cacheable = cacheable.asInstanceOf[js.Any], contextDependencies = contextDependencies.asInstanceOf[js.Any], fileDependencies = fileDependencies.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunLoaderResult]
    }
    
    @scala.inline
    implicit class RunLoaderResultMutableBuilder[Self <: RunLoaderResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheable(value: Boolean): Self = StObject.set(x, "cacheable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextDependencies(value: js.Array[String]): Self = StObject.set(x, "contextDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextDependenciesVarargs(value: String*): Self = StObject.set(x, "contextDependencies", js.Array(value :_*))
      
      @scala.inline
      def setFileDependencies(value: js.Array[String]): Self = StObject.set(x, "fileDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileDependenciesVarargs(value: String*): Self = StObject.set(x, "fileDependencies", js.Array(value :_*))
      
      @scala.inline
      def setResourceBuffer(value: Buffer): Self = StObject.set(x, "resourceBuffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceBufferNull: Self = StObject.set(x, "resourceBuffer", null)
      
      @scala.inline
      def setResourceBufferUndefined: Self = StObject.set(x, "resourceBuffer", js.undefined)
      
      @scala.inline
      def setResult(value: js.Array[Buffer | Null]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      @scala.inline
      def setResultVarargs(value: (Buffer | Null)*): Self = StObject.set(x, "result", js.Array(value :_*))
    }
  }
}
