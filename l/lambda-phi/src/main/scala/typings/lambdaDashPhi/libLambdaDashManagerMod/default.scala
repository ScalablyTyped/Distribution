package typings.lambdaDashPhi.libLambdaDashManagerMod

import typings.lambdaDashPhi.libApiDashGatewayMod.ApiGateway
import typings.lambdaDashPhi.libLambdaDashConfigMod.LambdaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-phi/lib/lambda-manager", JSImport.Default)
@js.native
class default () extends LambdaManager {
  /* CompleteClass */
  override var _apiGateway: js.Any = js.native
  /* CompleteClass */
  override var _callback: js.Any = js.native
  /* CompleteClass */
  override var _context: js.Any = js.native
  /* CompleteClass */
  override var _event: js.Any = js.native
  /* CompleteClass */
  override var _lambdaModels: js.Any = js.native
  /* CompleteClass */
  override var _lambdas: js.Any = js.native
  /* CompleteClass */
  override var _rawHandler: js.Any = js.native
  /* CompleteClass */
  override var apiGateway: ApiGateway = js.native
  /* CompleteClass */
  override var callback: js.Any = js.native
  /* CompleteClass */
  override var context: js.Any = js.native
  /* CompleteClass */
  override var event: js.Any = js.native
  /* CompleteClass */
  override var rawHandler: js.Any = js.native
  /* CompleteClass */
  override def addCallbackProperty(target: js.Any, property: js.Any): Unit = js.native
  /* CompleteClass */
  override def addContextProperty(target: js.Any, property: js.Any): Unit = js.native
  /* CompleteClass */
  override def addEventContextProperty(target: js.Any, property: js.Any): Unit = js.native
  /* CompleteClass */
  override def addEventProperty(target: js.Any, property: js.Any): Unit = js.native
  /* CompleteClass */
  override def addHandlerMethod(target: js.Any, method: js.Any): Unit = js.native
  /* CompleteClass */
  override def addPostConstructorMethod(target: js.Any, method: js.Any): Unit = js.native
  /* CompleteClass */
  override def addPreLambdaCallbackMethod(target: js.Any, method: String): Unit = js.native
  /* CompleteClass */
  override def addPreLambdaTimeoutMethod(target: js.Any, method: String, miliSecondsBeforeTimeout: Double): Unit = js.native
  /* CompleteClass */
  /* private */ override def executeHandler(lambda: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def executePostConstructor(lambda: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def executePreLambdaCallback(lambda: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def getEvent(lambda: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def getEventContext(): js.Any = js.native
  /* CompleteClass */
  override def getLambdaByName(name: String): typings.lambdaDashPhi.libLambdaDashModelMod.default = js.native
  /* CompleteClass */
  override def processLambdas(): Unit = js.native
  /* CompleteClass */
  override def setLambda(target: js.Any, lambdaConfig: LambdaConfig): Unit = js.native
  /* CompleteClass */
  override def setLambdaPath(target: js.Any, path: js.Any): Unit = js.native
  /* CompleteClass */
  /* private */ override def setLambdaProperties(lambda: js.Any): js.Any = js.native
  /* CompleteClass */
  /* private */ override def setPreLambdaTimeoutMethod(lambda: js.Any): js.Any = js.native
  /* CompleteClass */
  override def upsertLambdaModel(target: js.Any): typings.lambdaDashPhi.libLambdaDashModelMod.default = js.native
}

/* static members */
@JSImport("lambda-phi/lib/lambda-manager", JSImport.Default)
@js.native
object default extends js.Object {
  var instance: LambdaManager = js.native
}

