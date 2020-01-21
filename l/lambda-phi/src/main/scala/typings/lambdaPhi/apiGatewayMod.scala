package typings.lambdaPhi

import typings.lambdaPhi.lambdaModelMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lambda-phi/lib/api-gateway", JSImport.Namespace)
@js.native
object apiGatewayMod extends js.Object {
  @js.native
  class ApiGateway () extends js.Object {
    var body: js.Any = js.native
    var context: js.Any = js.native
    var event: js.Any = js.native
    var headers: js.Any = js.native
    var method: js.Any = js.native
    var pathParams: js.Any = js.native
    var queryParams: js.Any = js.native
    var stageVariables: js.Any = js.native
    def executeHttpRequest(lambda: default): Unit = js.native
    def executePath(lambda: default): Boolean = js.native
    /* private */ def executePathLambdaMethod(pathToRegEx: js.Any, lambda: js.Any, path: js.Any): js.Any = js.native
    /* private */ def getAliasValue(event: js.Any, alias: js.Any): js.Any = js.native
    /* private */ def getHeaders(lambda: js.Any): js.Any = js.native
    /* private */ def getObjectValue(`object`: js.Any, name: js.Any): js.Any = js.native
    /* private */ def getPathParams(lambda: js.Any): js.Any = js.native
    /* private */ def getQueryParams(lambda: js.Any): js.Any = js.native
    /* private */ def getResourcePath(): js.Any = js.native
    def prepareHttpRequestVariables(event: js.Any, context: js.Any): Unit = js.native
    /* private */ def resetHttpVariables(): js.Any = js.native
    /* private */ def setBody(): js.Any = js.native
    /* private */ def setHeaders(): js.Any = js.native
    def setLambdaProperties(lambda: default): Unit = js.native
    /* private */ def setMethod(): js.Any = js.native
    /* private */ def setPathParams(): js.Any = js.native
    /* private */ def setQueryParams(): js.Any = js.native
    /* private */ def setStageVariables(): js.Any = js.native
  }
  
  def Any(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  def Body(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def Body(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def Delete(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  def Get(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  def Head(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  def Headers(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def Headers(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def Method(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def Method(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def Options(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  def Patch(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  def Path(pattern: String): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def PathConfig(config: js.Any): js.Function1[/* target */ js.Any, Unit] = js.native
  def PathParam(name: String): js.Function3[/* target */ js.Object, /* propertyKey */ String, /* index */ Double, Unit] = js.native
  def PathParams(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def PathParams(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def Post(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  def Put(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  def QueryParams(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def QueryParams(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def StageVariables(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  def StageVariables(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  /* static members */
  @js.native
  object ApiGateway extends js.Object {
    var bodyAlias: js.Any = js.native
    var headersAlias: js.Any = js.native
    var methodAlias: js.Any = js.native
    var pathConfig: js.Any = js.native
    var pathParamsAlias: js.Any = js.native
    var queryParamsAlias: js.Any = js.native
    var stageVariablesAlias: js.Any = js.native
    def addAnyMethod(target: js.Any, method: js.Any): Unit = js.native
    def addBodyProperty(target: js.Any, property: js.Any): Unit = js.native
    def addHandlerMethod(target: js.Any, method: js.Any): Unit = js.native
    def addHeadersProperty(target: js.Any, property: js.Any): Unit = js.native
    def addHttpVerbMethod(name: String, target: js.Any, methodName: js.Any): Unit = js.native
    def addMethodProperty(target: js.Any, property: js.Any): Unit = js.native
    def addPathMethod(pattern: String, target: js.Any, method: js.Any): Unit = js.native
    def addPathParam(name: String, target: js.Any, methodName: js.Any, index: Double): Unit = js.native
    def addPathParamsProperty(target: js.Any, property: js.Any): Unit = js.native
    def addPostConstructorMethod(target: js.Any, method: js.Any): Unit = js.native
    def addQueryParamsProperty(target: js.Any, property: js.Any): Unit = js.native
    def addStageVariablesProperty(target: js.Any, property: js.Any): Unit = js.native
    /* private */ def executeAnyRequest(lambda: js.Any): js.Any = js.native
    /* private */ def getArgs(keys: js.Any, pathToRegEx: js.Any, lambda: js.Any, path: js.Any): js.Any = js.native
    /* private */ def getHttpVerbMethods(lambda: js.Any, method: js.Any): js.Any = js.native
    /* private */ def getHttpVerbsByMethodName(lambda: js.Any, methodName: js.Any): js.Any = js.native
    /* private */ def methodHasPath(lambda: js.Any, methodName: js.Any): js.Any = js.native
    def setPathConfig(config: js.Any): Unit = js.native
    /* private */ def verbExists(verbs: js.Any, verb: js.Any): js.Any = js.native
  }
  
}

