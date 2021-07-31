package typings.lambdaPhi

import typings.lambdaPhi.lambdaModelMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiGatewayMod {
  
  @JSImport("lambda-phi/lib/api-gateway", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Any(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Any")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
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
    
    @scala.inline
    def addAnyMethod(target: js.Any, method: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAnyMethod")(target.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def addBodyProperty(target: js.Any, property: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBodyProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def addHandlerMethod(target: js.Any, method: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandlerMethod")(target.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def addHeadersProperty(target: js.Any, property: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHeadersProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def addHttpVerbMethod(name: String, target: js.Any, methodName: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHttpVerbMethod")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def addMethodProperty(target: js.Any, property: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMethodProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def addPathMethod(pattern: String, target: js.Any, method: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPathMethod")(pattern.asInstanceOf[js.Any], target.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def addPathParam(name: String, target: js.Any, methodName: js.Any, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPathParam")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def addPathParamsProperty(target: js.Any, property: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPathParamsProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def addPostConstructorMethod(target: js.Any, method: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPostConstructorMethod")(target.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def addQueryParamsProperty(target: js.Any, property: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addQueryParamsProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def addStageVariablesProperty(target: js.Any, property: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addStageVariablesProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.bodyAlias")
    @js.native
    def bodyAlias: js.Any = js.native
    @scala.inline
    def bodyAlias_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bodyAlias")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def executeAnyRequest(lambda: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("executeAnyRequest")(lambda.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def getArgs(keys: js.Any, pathToRegEx: js.Any, lambda: js.Any, path: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getArgs")(keys.asInstanceOf[js.Any], pathToRegEx.asInstanceOf[js.Any], lambda.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def getHttpVerbMethods(lambda: js.Any, method: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpVerbMethods")(lambda.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def getHttpVerbsByMethodName(lambda: js.Any, methodName: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpVerbsByMethodName")(lambda.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
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
    
    @scala.inline
    def methodHasPath(lambda: js.Any, methodName: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("methodHasPath")(lambda.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
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
    
    @scala.inline
    def setPathConfig(config: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPathConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.stageVariablesAlias")
    @js.native
    def stageVariablesAlias: js.Any = js.native
    @scala.inline
    def stageVariablesAlias_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stageVariablesAlias")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def verbExists(verbs: js.Any, verb: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("verbExists")(verbs.asInstanceOf[js.Any], verb.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  }
  
  @scala.inline
  def Body(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Body")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  @scala.inline
  def Body(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Body")(alias.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  @scala.inline
  def Delete(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Delete")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  @scala.inline
  def Get(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Get")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  @scala.inline
  def Head(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Head")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  @scala.inline
  def Headers(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Headers")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  @scala.inline
  def Headers(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Headers")(alias.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  @scala.inline
  def Method(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Method")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  @scala.inline
  def Method(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Method")(alias.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  @scala.inline
  def Options(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Options")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  @scala.inline
  def Patch(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Patch")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  @scala.inline
  def Path(pattern: String): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Path")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  @scala.inline
  def PathConfig(config: js.Any): js.Function1[/* target */ js.Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("PathConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Any, Unit]]
  
  @scala.inline
  def PathParam(name: String): js.Function3[/* target */ js.Object, /* propertyKey */ String, /* index */ Double, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("PathParam")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Object, /* propertyKey */ String, /* index */ Double, Unit]]
  
  @scala.inline
  def PathParams(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("PathParams")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  @scala.inline
  def PathParams(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("PathParams")(alias.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  @scala.inline
  def Post(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Post")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  @scala.inline
  def Put(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Put")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  @scala.inline
  def QueryParams(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("QueryParams")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  @scala.inline
  def QueryParams(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("QueryParams")(alias.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  @scala.inline
  def StageVariables(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("StageVariables")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  @scala.inline
  def StageVariables(alias: js.Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("StageVariables")(alias.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
}
