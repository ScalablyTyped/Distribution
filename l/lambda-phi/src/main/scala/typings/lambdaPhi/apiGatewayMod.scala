package typings.lambdaPhi

import typings.lambdaPhi.lambdaModelMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiGatewayMod {
  
  @JSImport("lambda-phi/lib/api-gateway", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Any(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Any")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  @JSImport("lambda-phi/lib/api-gateway", "ApiGateway")
  @js.native
  open class ApiGateway () extends StObject {
    
    /* private */ var body: Any = js.native
    
    /* private */ var context: Any = js.native
    
    /* private */ var event: Any = js.native
    
    def executeHttpRequest(lambda: default): Unit = js.native
    
    def executePath(lambda: default): Boolean = js.native
    
    /* private */ def executePathLambdaMethod(pathToRegEx: Any, lambda: Any, path: Any): Any = js.native
    
    /* private */ def getAliasValue(event: Any, alias: Any): Any = js.native
    
    /* private */ def getHeaders(lambda: Any): Any = js.native
    
    /* private */ def getObjectValue(`object`: Any, name: Any): Any = js.native
    
    /* private */ def getPathParams(lambda: Any): Any = js.native
    
    /* private */ def getQueryParams(lambda: Any): Any = js.native
    
    /* private */ def getResourcePath(): Any = js.native
    
    /* private */ var headers: Any = js.native
    
    /* private */ var method: Any = js.native
    
    /* private */ var pathParams: Any = js.native
    
    def prepareHttpRequestVariables(event: Any, context: Any): Unit = js.native
    
    /* private */ var queryParams: Any = js.native
    
    /* private */ def resetHttpVariables(): Any = js.native
    
    /* private */ def setBody(): Any = js.native
    
    /* private */ def setHeaders(): Any = js.native
    
    def setLambdaProperties(lambda: default): Unit = js.native
    
    /* private */ def setMethod(): Any = js.native
    
    /* private */ def setPathParams(): Any = js.native
    
    /* private */ def setQueryParams(): Any = js.native
    
    /* private */ def setStageVariables(): Any = js.native
    
    /* private */ var stageVariables: Any = js.native
  }
  /* static members */
  object ApiGateway {
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addAnyMethod(target: Any, method: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addAnyMethod")(target.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addBodyProperty(target: Any, property: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addBodyProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addHandlerMethod(target: Any, method: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHandlerMethod")(target.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addHeadersProperty(target: Any, property: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHeadersProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addHttpVerbMethod(name: String, target: Any, methodName: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addHttpVerbMethod")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addMethodProperty(target: Any, property: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addMethodProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addPathMethod(pattern: String, target: Any, method: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPathMethod")(pattern.asInstanceOf[js.Any], target.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addPathParam(name: String, target: Any, methodName: Any, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPathParam")(name.asInstanceOf[js.Any], target.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addPathParamsProperty(target: Any, property: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPathParamsProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addPostConstructorMethod(target: Any, method: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addPostConstructorMethod")(target.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addQueryParamsProperty(target: Any, property: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addQueryParamsProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def addStageVariablesProperty(target: Any, property: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addStageVariablesProperty")(target.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.bodyAlias")
    @js.native
    def bodyAlias: Any = js.native
    inline def bodyAlias_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bodyAlias")(x.asInstanceOf[js.Any])
    
    inline def executeAnyRequest(lambda: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("executeAnyRequest")(lambda.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getArgs(keys: Any, pathToRegEx: Any, lambda: Any, path: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getArgs")(keys.asInstanceOf[js.Any], pathToRegEx.asInstanceOf[js.Any], lambda.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getHttpVerbMethods(lambda: Any, method: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpVerbMethods")(lambda.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getHttpVerbsByMethodName(lambda: Any, methodName: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpVerbsByMethodName")(lambda.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.headersAlias")
    @js.native
    def headersAlias: Any = js.native
    inline def headersAlias_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headersAlias")(x.asInstanceOf[js.Any])
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.methodAlias")
    @js.native
    def methodAlias: Any = js.native
    inline def methodAlias_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("methodAlias")(x.asInstanceOf[js.Any])
    
    inline def methodHasPath(lambda: Any, methodName: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("methodHasPath")(lambda.asInstanceOf[js.Any], methodName.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.pathConfig")
    @js.native
    def pathConfig: Any = js.native
    inline def pathConfig_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pathConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.pathParamsAlias")
    @js.native
    def pathParamsAlias: Any = js.native
    inline def pathParamsAlias_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pathParamsAlias")(x.asInstanceOf[js.Any])
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.queryParamsAlias")
    @js.native
    def queryParamsAlias: Any = js.native
    inline def queryParamsAlias_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("queryParamsAlias")(x.asInstanceOf[js.Any])
    
    inline def setPathConfig(config: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPathConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("lambda-phi/lib/api-gateway", "ApiGateway.stageVariablesAlias")
    @js.native
    def stageVariablesAlias: Any = js.native
    inline def stageVariablesAlias_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stageVariablesAlias")(x.asInstanceOf[js.Any])
    
    inline def verbExists(verbs: Any, verb: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("verbExists")(verbs.asInstanceOf[js.Any], verb.asInstanceOf[js.Any])).asInstanceOf[Any]
  }
  
  inline def Body(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Body")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  inline def Body(alias: Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Body")(alias.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  inline def Delete(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Delete")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  inline def Get(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Get")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  inline def Head(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Head")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  inline def Headers(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Headers")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  inline def Headers(alias: Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Headers")(alias.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  inline def Method(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Method")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  inline def Method(alias: Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Method")(alias.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  inline def Options(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Options")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  inline def Patch(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Patch")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  inline def Path(pattern: String): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Path")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  inline def PathConfig(config: Any): js.Function1[/* target */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("PathConfig")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ Any, Unit]]
  
  inline def PathParam(name: String): js.Function3[/* target */ js.Object, /* propertyKey */ String, /* index */ Double, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("PathParam")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Object, /* propertyKey */ String, /* index */ Double, Unit]]
  
  inline def PathParams(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("PathParams")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  inline def PathParams(alias: Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("PathParams")(alias.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  inline def Post(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Post")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  inline def Put(): js.Function2[/* target */ js.Object, /* methodName */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("Put")().asInstanceOf[js.Function2[/* target */ js.Object, /* methodName */ String, Unit]]
  
  inline def QueryParams(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("QueryParams")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  inline def QueryParams(alias: Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("QueryParams")(alias.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  
  inline def StageVariables(): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("StageVariables")().asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
  inline def StageVariables(alias: Any): js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("StageVariables")(alias.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* target */ js.Object, /* propertyKey */ String, Unit]]
}
