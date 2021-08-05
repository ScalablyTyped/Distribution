package typings.inversifyExpressUtils

import typings.inversifyExpressUtils.constantsMod.PARAMETER_TYPE
import typings.inversifyExpressUtils.interfacesMod.interfaces.HandlerDecorator
import typings.inversifyExpressUtils.interfacesMod.interfaces.Middleware
import typings.std.ParameterDecorator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("inversify-express-utils/dts/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def all(path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def controller(path: String, middleware: Middleware*): js.Function1[/* target */ js.Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("controller")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ js.Any, Unit]]
  
  inline def cookies(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("cookies")().asInstanceOf[ParameterDecorator]
  inline def cookies(cookieName: String): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("cookies")(cookieName.asInstanceOf[js.Any]).asInstanceOf[ParameterDecorator]
  
  inline def httpDelete(path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("httpDelete")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def httpGet(path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("httpGet")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def httpHead(path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("httpHead")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def httpMethod(method: String, path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("httpMethod")(method.asInstanceOf[js.Any], path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def httpPatch(path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("httpPatch")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def httpPost(path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("httpPost")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def httpPut(path: String, middleware: Middleware*): HandlerDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("httpPut")(path.asInstanceOf[js.Any], middleware.asInstanceOf[js.Any])).asInstanceOf[HandlerDecorator]
  
  inline def injectHttpContext(target: js.Any, targetKey: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectHttpContext")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def injectHttpContext(target: js.Any, targetKey: String, index: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("injectHttpContext")(target.asInstanceOf[js.Any], targetKey.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def next(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("next")().asInstanceOf[ParameterDecorator]
  
  inline def params(`type`: PARAMETER_TYPE): js.Function3[/* target */ js.Object, /* methodName */ String, /* index */ Double, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("params")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Object, /* methodName */ String, /* index */ Double, Unit]]
  inline def params(`type`: PARAMETER_TYPE, parameterName: String): js.Function3[/* target */ js.Object, /* methodName */ String, /* index */ Double, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("params")(`type`.asInstanceOf[js.Any], parameterName.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* target */ js.Object, /* methodName */ String, /* index */ Double, Unit]]
  
  inline def principal(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("principal")().asInstanceOf[ParameterDecorator]
  
  inline def queryParam(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParam")().asInstanceOf[ParameterDecorator]
  inline def queryParam(queryParamName: String): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("queryParam")(queryParamName.asInstanceOf[js.Any]).asInstanceOf[ParameterDecorator]
  
  inline def request(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("request")().asInstanceOf[ParameterDecorator]
  
  inline def requestBody(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("requestBody")().asInstanceOf[ParameterDecorator]
  
  inline def requestHeaders(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("requestHeaders")().asInstanceOf[ParameterDecorator]
  inline def requestHeaders(headerName: String): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("requestHeaders")(headerName.asInstanceOf[js.Any]).asInstanceOf[ParameterDecorator]
  
  inline def requestParam(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("requestParam")().asInstanceOf[ParameterDecorator]
  inline def requestParam(paramName: String): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("requestParam")(paramName.asInstanceOf[js.Any]).asInstanceOf[ParameterDecorator]
  
  inline def response(): ParameterDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("response")().asInstanceOf[ParameterDecorator]
}
