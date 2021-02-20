package typings.lambdaPhi

import typings.lambdaPhi.lambdaModelMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiGatewayMod {
  
  @JSImport("lambda-phi/lib/api-gateway", "Any")
  @js.native
  def Any(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "ApiGateway")
  @js.native
  class ApiGateway () extends StObject {
    
    var body: js.Any = js.native
    
    var context: js.Any = js.native
    
    var event: js.Any = js.native
    
    def executeHttpRequest(lambda: default): Unit = js.native
    
    def executePath(lambda: default): Boolean = js.native
    
    /* private */ def executePathLambdaMethod(pathToRegEx: js.Any, lambda: js.Any, path: js.Any): js.Any = js.native
    
    /* private */ def getAliasValue(event: js.Any, alias: js.Any): js.Any = js.native
    
    /* private */ def getHeaders(lambda: js.Any): js.Any = js.native
    
    /* private */ def getObjectValue(`object`: js.Any, name: js.Any): js.Any = js.native
    
    /* private */ def getPathParams(lambda: js.Any): js.Any = js.native
    
    /* private */ def getQueryParams(lambda: js.Any): js.Any = js.native
    
    /* private */ def getResourcePath(): js.Any = js.native
    
    var headers: js.Any = js.native
    
    var method: js.Any = js.native
    
    var pathParams: js.Any = js.native
    
    def prepareHttpRequestVariables(event: js.Any, context: js.Any): Unit = js.native
    
    var queryParams: js.Any = js.native
    
    /* private */ def resetHttpVariables(): js.Any = js.native
    
    /* private */ def setBody(): js.Any = js.native
    
    /* private */ def setHeaders(): js.Any = js.native
    
    def setLambdaProperties(lambda: default): Unit = js.native
    
    /* private */ def setMethod(): js.Any = js.native
    
    /* private */ def setPathParams(): js.Any = js.native
    
    /* private */ def setQueryParams(): js.Any = js.native
    
    /* private */ def setStageVariables(): js.Any = js.native
    
    var stageVariables: js.Any = js.native
  }
  /* static members */
  object ApiGateway {
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.addAnyMethod")
    @js.native
    def addAnyMethod(target: js.Any, method: js.Any): Unit = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.addBodyProperty")
    @js.native
    def addBodyProperty(target: js.Any, property: js.Any): Unit = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.addHandlerMethod")
    @js.native
    def addHandlerMethod(target: js.Any, method: js.Any): Unit = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.addHeadersProperty")
    @js.native
    def addHeadersProperty(target: js.Any, property: js.Any): Unit = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.addHttpVerbMethod")
    @js.native
    def addHttpVerbMethod(name: String, target: js.Any, methodName: js.Any): Unit = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.addMethodProperty")
    @js.native
    def addMethodProperty(target: js.Any, property: js.Any): Unit = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.addPathMethod")
    @js.native
    def addPathMethod(pattern: String, target: js.Any, method: js.Any): Unit = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.addPathParam")
    @js.native
    def addPathParam(name: String, target: js.Any, methodName: js.Any, index: Double): Unit = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.addPathParamsProperty")
    @js.native
    def addPathParamsProperty(target: js.Any, property: js.Any): Unit = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.addPostConstructorMethod")
    @js.native
    def addPostConstructorMethod(target: js.Any, method: js.Any): Unit = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.addQueryParamsProperty")
    @js.native
    def addQueryParamsProperty(target: js.Any, property: js.Any): Unit = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.addStageVariablesProperty")
    @js.native
    def addStageVariablesProperty(target: js.Any, property: js.Any): Unit = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.bodyAlias")
    @js.native
    def bodyAlias: js.Any = js.native
    @scala.inline
    def bodyAlias_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bodyAlias")(x.asInstanceOf[js.Any])
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.executeAnyRequest")
    @js.native
    def executeAnyRequest(lambda: js.Any): js.Any = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.getArgs")
    @js.native
    def getArgs(keys: js.Any, pathToRegEx: js.Any, lambda: js.Any, path: js.Any): js.Any = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.getHttpVerbMethods")
    @js.native
    def getHttpVerbMethods(lambda: js.Any, method: js.Any): js.Any = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.getHttpVerbsByMethodName")
    @js.native
    def getHttpVerbsByMethodName(lambda: js.Any, methodName: js.Any): js.Any = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.headersAlias")
    @js.native
    def headersAlias: js.Any = js.native
    @scala.inline
    def headersAlias_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headersAlias")(x.asInstanceOf[js.Any])
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.methodAlias")
    @js.native
    def methodAlias: js.Any = js.native
    @scala.inline
    def methodAlias_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("methodAlias")(x.asInstanceOf[js.Any])
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.methodHasPath")
    @js.native
    def methodHasPath(lambda: js.Any, methodName: js.Any): js.Any = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.pathConfig")
    @js.native
    def pathConfig: js.Any = js.native
    @scala.inline
    def pathConfig_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pathConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.pathParamsAlias")
    @js.native
    def pathParamsAlias: js.Any = js.native
    @scala.inline
    def pathParamsAlias_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pathParamsAlias")(x.asInstanceOf[js.Any])
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.queryParamsAlias")
    @js.native
    def queryParamsAlias: js.Any = js.native
    @scala.inline
    def queryParamsAlias_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryParamsAlias")(x.asInstanceOf[js.Any])
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.setPathConfig")
    @js.native
    def setPathConfig(config: js.Any): Unit = js.native
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.stageVariablesAlias")
    @js.native
    def stageVariablesAlias: js.Any = js.native
    @scala.inline
    def stageVariablesAlias_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stageVariablesAlias")(x.asInstanceOf[js.Any])
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.verbExists")
    @js.native
    def verbExists(verbs: js.Any, verb: js.Any): js.Any = js.native
  }
  
  @JSImport("lambda-phi/lib/api-gateway", "Body")
  @js.native
  def Body(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  @JSImport("lambda-phi/lib/api-gateway", "Body")
  @js.native
  def Body(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "Delete")
  @js.native
  def Delete(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "Get")
  @js.native
  def Get(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "Head")
  @js.native
  def Head(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "Headers")
  @js.native
  def Headers(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  @JSImport("lambda-phi/lib/api-gateway", "Headers")
  @js.native
  def Headers(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "Method")
  @js.native
  def Method(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  @JSImport("lambda-phi/lib/api-gateway", "Method")
  @js.native
  def Method(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "Options")
  @js.native
  def Options(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "Patch")
  @js.native
  def Patch(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "Path")
  @js.native
  def Path(pattern: String): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "PathConfig")
  @js.native
  def PathConfig(config: js.Any): js.Function1[/* target */ js.Any, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "PathParam")
  @js.native
  def PathParam(name: String): js.Function3[/* target */ js.Object, /* propertyKey */ String, /* index */ Double, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "PathParams")
  @js.native
  def PathParams(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  @JSImport("lambda-phi/lib/api-gateway", "PathParams")
  @js.native
  def PathParams(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "Post")
  @js.native
  def Post(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "Put")
  @js.native
  def Put(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "QueryParams")
  @js.native
  def QueryParams(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  @JSImport("lambda-phi/lib/api-gateway", "QueryParams")
  @js.native
  def QueryParams(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  
  @JSImport("lambda-phi/lib/api-gateway", "StageVariables")
  @js.native
  def StageVariables(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
  @JSImport("lambda-phi/lib/api-gateway", "StageVariables")
  @js.native
  def StageVariables(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = js.native
}
