package typings.lambdaPhi.lambdaManagerMod

import typings.lambdaPhi.apiGatewayMod.ApiGateway
import typings.lambdaPhi.lambdaConfigMod.LambdaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaManager extends js.Object {
  var _apiGateway: js.Any
  var _callback: js.Any
  var _context: js.Any
  var _event: js.Any
  var _lambdaModels: js.Any
  var _lambdas: js.Any
  var _rawHandler: js.Any
  var apiGateway: ApiGateway
  var callback: js.Any
  var context: js.Any
  var event: js.Any
  var rawHandler: js.Any
  def addCallbackProperty(target: js.Any, property: js.Any): Unit
  def addContextProperty(target: js.Any, property: js.Any): Unit
  def addEventContextProperty(target: js.Any, property: js.Any): Unit
  def addEventProperty(target: js.Any, property: js.Any): Unit
  def addHandlerMethod(target: js.Any, method: js.Any): Unit
  def addPostConstructorMethod(target: js.Any, method: js.Any): Unit
  def addPreLambdaCallbackMethod(target: js.Any, method: String): Unit
  def addPreLambdaTimeoutMethod(target: js.Any, method: String, miliSecondsBeforeTimeout: Double): Unit
  /* private */ def executeHandler(lambda: js.Any): js.Any
  /* private */ def executePostConstructor(lambda: js.Any): js.Any
  /* private */ def executePreLambdaCallback(lambda: js.Any): js.Any
  /* private */ def getEvent(lambda: js.Any): js.Any
  /* private */ def getEventContext(): js.Any
  def getLambdaByName(name: String): typings.lambdaPhi.lambdaModelMod.default
  def processLambdas(): Unit
  def setLambda(target: js.Any, lambdaConfig: LambdaConfig): Unit
  def setLambdaPath(target: js.Any, path: js.Any): Unit
  /* private */ def setLambdaProperties(lambda: js.Any): js.Any
  /* private */ def setPreLambdaTimeoutMethod(lambda: js.Any): js.Any
  def upsertLambdaModel(target: js.Any): typings.lambdaPhi.lambdaModelMod.default
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
}

