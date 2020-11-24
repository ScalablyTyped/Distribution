package typings.lambdaPhi.lambdaManagerMod

import typings.lambdaPhi.apiGatewayMod.ApiGateway
import typings.lambdaPhi.lambdaConfigMod.LambdaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LambdaManager extends js.Object {
  
  var _apiGateway: js.Any = js.native
  
  var _callback: js.Any = js.native
  
  var _context: js.Any = js.native
  
  var _event: js.Any = js.native
  
  var _lambdaModels: js.Any = js.native
  
  var _lambdas: js.Any = js.native
  
  var _rawHandler: js.Any = js.native
  
  def addCallbackProperty(target: js.Any, property: js.Any): Unit = js.native
  
  def addContextProperty(target: js.Any, property: js.Any): Unit = js.native
  
  def addEventContextProperty(target: js.Any, property: js.Any): Unit = js.native
  
  def addEventProperty(target: js.Any, property: js.Any): Unit = js.native
  
  def addHandlerMethod(target: js.Any, method: js.Any): Unit = js.native
  
  def addPostConstructorMethod(target: js.Any, method: js.Any): Unit = js.native
  
  def addPreLambdaCallbackMethod(target: js.Any, method: String): Unit = js.native
  
  def addPreLambdaTimeoutMethod(target: js.Any, method: String, miliSecondsBeforeTimeout: Double): Unit = js.native
  
  var apiGateway: ApiGateway = js.native
  
  var callback: js.Any = js.native
  
  var context: js.Any = js.native
  
  var event: js.Any = js.native
  
  /* private */ def executeHandler(lambda: js.Any): js.Any = js.native
  
  /* private */ def executePostConstructor(lambda: js.Any): js.Any = js.native
  
  /* private */ def executePreLambdaCallback(lambda: js.Any): js.Any = js.native
  
  /* private */ def getEvent(lambda: js.Any): js.Any = js.native
  
  /* private */ def getEventContext(): js.Any = js.native
  
  def getLambdaByName(name: String): typings.lambdaPhi.lambdaModelMod.default = js.native
  
  def processLambdas(): Unit = js.native
  
  var rawHandler: js.Any = js.native
  
  def setLambda(target: js.Any, lambdaConfig: LambdaConfig): Unit = js.native
  
  def setLambdaPath(target: js.Any, path: js.Any): Unit = js.native
  
  /* private */ def setLambdaProperties(lambda: js.Any): js.Any = js.native
  
  /* private */ def setPreLambdaTimeoutMethod(lambda: js.Any): js.Any = js.native
  
  def upsertLambdaModel(target: js.Any): typings.lambdaPhi.lambdaModelMod.default = js.native
}
object LambdaManager {
  
  @scala.inline
  def apply(
    _apiGateway: js.Any,
    _callback: js.Any,
    _context: js.Any,
    _event: js.Any,
    _lambdaModels: js.Any,
    _lambdas: js.Any,
    _rawHandler: js.Any,
    addCallbackProperty: (js.Any, js.Any) => Unit,
    addContextProperty: (js.Any, js.Any) => Unit,
    addEventContextProperty: (js.Any, js.Any) => Unit,
    addEventProperty: (js.Any, js.Any) => Unit,
    addHandlerMethod: (js.Any, js.Any) => Unit,
    addPostConstructorMethod: (js.Any, js.Any) => Unit,
    addPreLambdaCallbackMethod: (js.Any, String) => Unit,
    addPreLambdaTimeoutMethod: (js.Any, String, Double) => Unit,
    apiGateway: ApiGateway,
    callback: js.Any,
    context: js.Any,
    event: js.Any,
    executeHandler: js.Any => js.Any,
    executePostConstructor: js.Any => js.Any,
    executePreLambdaCallback: js.Any => js.Any,
    getEvent: js.Any => js.Any,
    getEventContext: () => js.Any,
    getLambdaByName: String => typings.lambdaPhi.lambdaModelMod.default,
    processLambdas: () => Unit,
    rawHandler: js.Any,
    setLambda: (js.Any, LambdaConfig) => Unit,
    setLambdaPath: (js.Any, js.Any) => Unit,
    setLambdaProperties: js.Any => js.Any,
    setPreLambdaTimeoutMethod: js.Any => js.Any,
    upsertLambdaModel: js.Any => typings.lambdaPhi.lambdaModelMod.default
  ): LambdaManager = {
    val __obj = js.Dynamic.literal(_apiGateway = _apiGateway.asInstanceOf[js.Any], _callback = _callback.asInstanceOf[js.Any], _context = _context.asInstanceOf[js.Any], _event = _event.asInstanceOf[js.Any], _lambdaModels = _lambdaModels.asInstanceOf[js.Any], _lambdas = _lambdas.asInstanceOf[js.Any], _rawHandler = _rawHandler.asInstanceOf[js.Any], addCallbackProperty = js.Any.fromFunction2(addCallbackProperty), addContextProperty = js.Any.fromFunction2(addContextProperty), addEventContextProperty = js.Any.fromFunction2(addEventContextProperty), addEventProperty = js.Any.fromFunction2(addEventProperty), addHandlerMethod = js.Any.fromFunction2(addHandlerMethod), addPostConstructorMethod = js.Any.fromFunction2(addPostConstructorMethod), addPreLambdaCallbackMethod = js.Any.fromFunction2(addPreLambdaCallbackMethod), addPreLambdaTimeoutMethod = js.Any.fromFunction3(addPreLambdaTimeoutMethod), apiGateway = apiGateway.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], executeHandler = js.Any.fromFunction1(executeHandler), executePostConstructor = js.Any.fromFunction1(executePostConstructor), executePreLambdaCallback = js.Any.fromFunction1(executePreLambdaCallback), getEvent = js.Any.fromFunction1(getEvent), getEventContext = js.Any.fromFunction0(getEventContext), getLambdaByName = js.Any.fromFunction1(getLambdaByName), processLambdas = js.Any.fromFunction0(processLambdas), rawHandler = rawHandler.asInstanceOf[js.Any], setLambda = js.Any.fromFunction2(setLambda), setLambdaPath = js.Any.fromFunction2(setLambdaPath), setLambdaProperties = js.Any.fromFunction1(setLambdaProperties), setPreLambdaTimeoutMethod = js.Any.fromFunction1(setPreLambdaTimeoutMethod), upsertLambdaModel = js.Any.fromFunction1(upsertLambdaModel))
    __obj.asInstanceOf[LambdaManager]
  }
  
  @scala.inline
  implicit class LambdaManagerOps[Self <: LambdaManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_apiGateway(value: js.Any): Self = this.set("_apiGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_callback(value: js.Any): Self = this.set("_callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_context(value: js.Any): Self = this.set("_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_event(value: js.Any): Self = this.set("_event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lambdaModels(value: js.Any): Self = this.set("_lambdaModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_lambdas(value: js.Any): Self = this.set("_lambdas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_rawHandler(value: js.Any): Self = this.set("_rawHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddCallbackProperty(value: (js.Any, js.Any) => Unit): Self = this.set("addCallbackProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddContextProperty(value: (js.Any, js.Any) => Unit): Self = this.set("addContextProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddEventContextProperty(value: (js.Any, js.Any) => Unit): Self = this.set("addEventContextProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddEventProperty(value: (js.Any, js.Any) => Unit): Self = this.set("addEventProperty", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddHandlerMethod(value: (js.Any, js.Any) => Unit): Self = this.set("addHandlerMethod", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddPostConstructorMethod(value: (js.Any, js.Any) => Unit): Self = this.set("addPostConstructorMethod", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddPreLambdaCallbackMethod(value: (js.Any, String) => Unit): Self = this.set("addPreLambdaCallbackMethod", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddPreLambdaTimeoutMethod(value: (js.Any, String, Double) => Unit): Self = this.set("addPreLambdaTimeoutMethod", js.Any.fromFunction3(value))
    
    @scala.inline
    def setApiGateway(value: ApiGateway): Self = this.set("apiGateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallback(value: js.Any): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecuteHandler(value: js.Any => js.Any): Self = this.set("executeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExecutePostConstructor(value: js.Any => js.Any): Self = this.set("executePostConstructor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExecutePreLambdaCallback(value: js.Any => js.Any): Self = this.set("executePreLambdaCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetEvent(value: js.Any => js.Any): Self = this.set("getEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetEventContext(value: () => js.Any): Self = this.set("getEventContext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLambdaByName(value: String => typings.lambdaPhi.lambdaModelMod.default): Self = this.set("getLambdaByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProcessLambdas(value: () => Unit): Self = this.set("processLambdas", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRawHandler(value: js.Any): Self = this.set("rawHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetLambda(value: (js.Any, LambdaConfig) => Unit): Self = this.set("setLambda", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetLambdaPath(value: (js.Any, js.Any) => Unit): Self = this.set("setLambdaPath", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetLambdaProperties(value: js.Any => js.Any): Self = this.set("setLambdaProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPreLambdaTimeoutMethod(value: js.Any => js.Any): Self = this.set("setPreLambdaTimeoutMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpsertLambdaModel(value: js.Any => typings.lambdaPhi.lambdaModelMod.default): Self = this.set("upsertLambdaModel", js.Any.fromFunction1(value))
  }
}
