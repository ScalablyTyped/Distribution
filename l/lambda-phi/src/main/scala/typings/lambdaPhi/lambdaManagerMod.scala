package typings.lambdaPhi

import typings.lambdaPhi.apiGatewayMod.ApiGateway
import typings.lambdaPhi.lambdaConfigMod.LambdaConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lambdaManagerMod {
  
  @JSImport("lambda-phi/lib/lambda-manager", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with LambdaManager {
    
    /* private */ /* CompleteClass */
    var _apiGateway: Any = js.native
    
    /* private */ /* CompleteClass */
    var _callback: Any = js.native
    
    /* private */ /* CompleteClass */
    var _context: Any = js.native
    
    /* private */ /* CompleteClass */
    var _event: Any = js.native
    
    /* private */ /* CompleteClass */
    var _lambdaModels: Any = js.native
    
    /* private */ /* CompleteClass */
    var _lambdas: Any = js.native
    
    /* private */ /* CompleteClass */
    var _rawHandler: Any = js.native
    
    /* CompleteClass */
    override def addCallbackProperty(target: Any, property: Any): Unit = js.native
    
    /* CompleteClass */
    override def addContextProperty(target: Any, property: Any): Unit = js.native
    
    /* CompleteClass */
    override def addEventContextProperty(target: Any, property: Any): Unit = js.native
    
    /* CompleteClass */
    override def addEventProperty(target: Any, property: Any): Unit = js.native
    
    /* CompleteClass */
    override def addHandlerMethod(target: Any, method: Any): Unit = js.native
    
    /* CompleteClass */
    override def addPostConstructorMethod(target: Any, method: Any): Unit = js.native
    
    /* CompleteClass */
    override def addPreLambdaCallbackMethod(target: Any, method: String): Unit = js.native
    
    /* CompleteClass */
    override def addPreLambdaTimeoutMethod(target: Any, method: String, miliSecondsBeforeTimeout: Double): Unit = js.native
    
    /* CompleteClass */
    var apiGateway: ApiGateway = js.native
    
    /* CompleteClass */
    var callback: Any = js.native
    
    /* CompleteClass */
    var context: Any = js.native
    
    /* CompleteClass */
    var event: Any = js.native
    
    /* private */ /* CompleteClass */
    override def executeHandler(lambda: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def executePostConstructor(lambda: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def executePreLambdaCallback(lambda: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def getEvent(lambda: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def getEventContext(): Any = js.native
    
    /* CompleteClass */
    override def getLambdaByName(name: String): typings.lambdaPhi.lambdaModelMod.default = js.native
    
    /* CompleteClass */
    override def processLambdas(): Unit = js.native
    
    /* CompleteClass */
    var rawHandler: Any = js.native
    
    /* CompleteClass */
    override def setLambda(target: Any, lambdaConfig: LambdaConfig): Unit = js.native
    
    /* CompleteClass */
    override def setLambdaPath(target: Any, path: Any): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def setLambdaProperties(lambda: Any): Any = js.native
    
    /* private */ /* CompleteClass */
    override def setPreLambdaTimeoutMethod(lambda: Any): Any = js.native
    
    /* CompleteClass */
    override def upsertLambdaModel(target: Any): typings.lambdaPhi.lambdaModelMod.default = js.native
  }
  /* static members */
  object default {
    
    @JSImport("lambda-phi/lib/lambda-manager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("lambda-phi/lib/lambda-manager", "default.instance")
    @js.native
    def instance: LambdaManager = js.native
    inline def instance_=(x: LambdaManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
  }
  
  trait LambdaManager extends StObject {
    
    /* private */ var _apiGateway: Any
    
    /* private */ var _callback: Any
    
    /* private */ var _context: Any
    
    /* private */ var _event: Any
    
    /* private */ var _lambdaModels: Any
    
    /* private */ var _lambdas: Any
    
    /* private */ var _rawHandler: Any
    
    def addCallbackProperty(target: Any, property: Any): Unit
    
    def addContextProperty(target: Any, property: Any): Unit
    
    def addEventContextProperty(target: Any, property: Any): Unit
    
    def addEventProperty(target: Any, property: Any): Unit
    
    def addHandlerMethod(target: Any, method: Any): Unit
    
    def addPostConstructorMethod(target: Any, method: Any): Unit
    
    def addPreLambdaCallbackMethod(target: Any, method: String): Unit
    
    def addPreLambdaTimeoutMethod(target: Any, method: String, miliSecondsBeforeTimeout: Double): Unit
    
    var apiGateway: ApiGateway
    
    var callback: Any
    
    var context: Any
    
    var event: Any
    
    /* private */ def executeHandler(lambda: Any): Any
    
    /* private */ def executePostConstructor(lambda: Any): Any
    
    /* private */ def executePreLambdaCallback(lambda: Any): Any
    
    /* private */ def getEvent(lambda: Any): Any
    
    /* private */ def getEventContext(): Any
    
    def getLambdaByName(name: String): typings.lambdaPhi.lambdaModelMod.default
    
    def processLambdas(): Unit
    
    var rawHandler: Any
    
    def setLambda(target: Any, lambdaConfig: LambdaConfig): Unit
    
    def setLambdaPath(target: Any, path: Any): Unit
    
    /* private */ def setLambdaProperties(lambda: Any): Any
    
    /* private */ def setPreLambdaTimeoutMethod(lambda: Any): Any
    
    def upsertLambdaModel(target: Any): typings.lambdaPhi.lambdaModelMod.default
  }
  object LambdaManager {
    
    inline def apply(
      _apiGateway: Any,
      _callback: Any,
      _context: Any,
      _event: Any,
      _lambdaModels: Any,
      _lambdas: Any,
      _rawHandler: Any,
      addCallbackProperty: (Any, Any) => Unit,
      addContextProperty: (Any, Any) => Unit,
      addEventContextProperty: (Any, Any) => Unit,
      addEventProperty: (Any, Any) => Unit,
      addHandlerMethod: (Any, Any) => Unit,
      addPostConstructorMethod: (Any, Any) => Unit,
      addPreLambdaCallbackMethod: (Any, String) => Unit,
      addPreLambdaTimeoutMethod: (Any, String, Double) => Unit,
      apiGateway: ApiGateway,
      callback: Any,
      context: Any,
      event: Any,
      executeHandler: Any => Any,
      executePostConstructor: Any => Any,
      executePreLambdaCallback: Any => Any,
      getEvent: Any => Any,
      getEventContext: () => Any,
      getLambdaByName: String => typings.lambdaPhi.lambdaModelMod.default,
      processLambdas: () => Unit,
      rawHandler: Any,
      setLambda: (Any, LambdaConfig) => Unit,
      setLambdaPath: (Any, Any) => Unit,
      setLambdaProperties: Any => Any,
      setPreLambdaTimeoutMethod: Any => Any,
      upsertLambdaModel: Any => typings.lambdaPhi.lambdaModelMod.default
    ): LambdaManager = {
      val __obj = js.Dynamic.literal(_apiGateway = _apiGateway.asInstanceOf[js.Any], _callback = _callback.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _event = _event.asInstanceOf[js.Any], _lambdaModels = _lambdaModels.asInstanceOf[js.Any], _lambdas = _lambdas.asInstanceOf[js.Any], _rawHandler = _rawHandler.asInstanceOf[js.Any], addCallbackProperty = js.Any.fromFunction2(addCallbackProperty), addContextProperty = js.Any.fromFunction2(addContextProperty), addEventContextProperty = js.Any.fromFunction2(addEventContextProperty), addEventProperty = js.Any.fromFunction2(addEventProperty), addHandlerMethod = js.Any.fromFunction2(addHandlerMethod), addPostConstructorMethod = js.Any.fromFunction2(addPostConstructorMethod), addPreLambdaCallbackMethod = js.Any.fromFunction2(addPreLambdaCallbackMethod), addPreLambdaTimeoutMethod = js.Any.fromFunction3(addPreLambdaTimeoutMethod), apiGateway = apiGateway.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], executeHandler = js.Any.fromFunction1(executeHandler), executePostConstructor = js.Any.fromFunction1(executePostConstructor), executePreLambdaCallback = js.Any.fromFunction1(executePreLambdaCallback), getEvent = js.Any.fromFunction1(getEvent), getEventContext = js.Any.fromFunction0(getEventContext), getLambdaByName = js.Any.fromFunction1(getLambdaByName), processLambdas = js.Any.fromFunction0(processLambdas), rawHandler = rawHandler.asInstanceOf[js.Any], setLambda = js.Any.fromFunction2(setLambda), setLambdaPath = js.Any.fromFunction2(setLambdaPath), setLambdaProperties = js.Any.fromFunction1(setLambdaProperties), setPreLambdaTimeoutMethod = js.Any.fromFunction1(setPreLambdaTimeoutMethod), upsertLambdaModel = js.Any.fromFunction1(upsertLambdaModel))
      __obj.asInstanceOf[LambdaManager]
    }
    
    extension [Self <: LambdaManager](x: Self) {
      
      inline def setAddCallbackProperty(value: (Any, Any) => Unit): Self = StObject.set(x, "addCallbackProperty", js.Any.fromFunction2(value))
      
      inline def setAddContextProperty(value: (Any, Any) => Unit): Self = StObject.set(x, "addContextProperty", js.Any.fromFunction2(value))
      
      inline def setAddEventContextProperty(value: (Any, Any) => Unit): Self = StObject.set(x, "addEventContextProperty", js.Any.fromFunction2(value))
      
      inline def setAddEventProperty(value: (Any, Any) => Unit): Self = StObject.set(x, "addEventProperty", js.Any.fromFunction2(value))
      
      inline def setAddHandlerMethod(value: (Any, Any) => Unit): Self = StObject.set(x, "addHandlerMethod", js.Any.fromFunction2(value))
      
      inline def setAddPostConstructorMethod(value: (Any, Any) => Unit): Self = StObject.set(x, "addPostConstructorMethod", js.Any.fromFunction2(value))
      
      inline def setAddPreLambdaCallbackMethod(value: (Any, String) => Unit): Self = StObject.set(x, "addPreLambdaCallbackMethod", js.Any.fromFunction2(value))
      
      inline def setAddPreLambdaTimeoutMethod(value: (Any, String, Double) => Unit): Self = StObject.set(x, "addPreLambdaTimeoutMethod", js.Any.fromFunction3(value))
      
      inline def setApiGateway(value: ApiGateway): Self = StObject.set(x, "apiGateway", value.asInstanceOf[js.Any])
      
      inline def setCallback(value: Any): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setExecuteHandler(value: Any => Any): Self = StObject.set(x, "executeHandler", js.Any.fromFunction1(value))
      
      inline def setExecutePostConstructor(value: Any => Any): Self = StObject.set(x, "executePostConstructor", js.Any.fromFunction1(value))
      
      inline def setExecutePreLambdaCallback(value: Any => Any): Self = StObject.set(x, "executePreLambdaCallback", js.Any.fromFunction1(value))
      
      inline def setGetEvent(value: Any => Any): Self = StObject.set(x, "getEvent", js.Any.fromFunction1(value))
      
      inline def setGetEventContext(value: () => Any): Self = StObject.set(x, "getEventContext", js.Any.fromFunction0(value))
      
      inline def setGetLambdaByName(value: String => typings.lambdaPhi.lambdaModelMod.default): Self = StObject.set(x, "getLambdaByName", js.Any.fromFunction1(value))
      
      inline def setProcessLambdas(value: () => Unit): Self = StObject.set(x, "processLambdas", js.Any.fromFunction0(value))
      
      inline def setRawHandler(value: Any): Self = StObject.set(x, "rawHandler", value.asInstanceOf[js.Any])
      
      inline def setSetLambda(value: (Any, LambdaConfig) => Unit): Self = StObject.set(x, "setLambda", js.Any.fromFunction2(value))
      
      inline def setSetLambdaPath(value: (Any, Any) => Unit): Self = StObject.set(x, "setLambdaPath", js.Any.fromFunction2(value))
      
      inline def setSetLambdaProperties(value: Any => Any): Self = StObject.set(x, "setLambdaProperties", js.Any.fromFunction1(value))
      
      inline def setSetPreLambdaTimeoutMethod(value: Any => Any): Self = StObject.set(x, "setPreLambdaTimeoutMethod", js.Any.fromFunction1(value))
      
      inline def setUpsertLambdaModel(value: Any => typings.lambdaPhi.lambdaModelMod.default): Self = StObject.set(x, "upsertLambdaModel", js.Any.fromFunction1(value))
      
      inline def set_apiGateway(value: Any): Self = StObject.set(x, "_apiGateway", value.asInstanceOf[js.Any])
      
      inline def set_callback(value: Any): Self = StObject.set(x, "_callback", value.asInstanceOf[js.Any])
      
      inline def set_context(value: Any): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
      
      inline def set_event(value: Any): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
      
      inline def set_lambdaModels(value: Any): Self = StObject.set(x, "_lambdaModels", value.asInstanceOf[js.Any])
      
      inline def set_lambdas(value: Any): Self = StObject.set(x, "_lambdas", value.asInstanceOf[js.Any])
      
      inline def set_rawHandler(value: Any): Self = StObject.set(x, "_rawHandler", value.asInstanceOf[js.Any])
    }
  }
}
