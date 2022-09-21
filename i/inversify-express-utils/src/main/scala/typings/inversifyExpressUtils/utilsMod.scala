package typings.inversifyExpressUtils

import org.scalablytyped.runtime.Instantiable0
import typings.inversify.interfacesMod.interfaces.Container
import typings.inversifyExpressUtils.interfacesMod.Controller
import typings.inversifyExpressUtils.interfacesMod.ControllerMetadata
import typings.inversifyExpressUtils.interfacesMod.ControllerMethodMetadata
import typings.inversifyExpressUtils.interfacesMod.ControllerParameterMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("inversify-express-utils/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanUpMetadata(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanUpMetadata")().asInstanceOf[Unit]
  
  inline def getControllerMetadata(constructor: Any): ControllerMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllerMetadata")(constructor.asInstanceOf[js.Any]).asInstanceOf[ControllerMetadata]
  
  inline def getControllerMethodMetadata(constructor: Any): js.Array[ControllerMethodMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllerMethodMetadata")(constructor.asInstanceOf[js.Any]).asInstanceOf[js.Array[ControllerMethodMetadata]]
  
  inline def getControllerParameterMetadata(constructor: Any): ControllerParameterMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllerParameterMetadata")(constructor.asInstanceOf[js.Any]).asInstanceOf[ControllerParameterMetadata]
  
  inline def getControllersFromContainer(container: Container, forceControllers: Boolean): js.Array[Controller] = (^.asInstanceOf[js.Dynamic].applyDynamic("getControllersFromContainer")(container.asInstanceOf[js.Any], forceControllers.asInstanceOf[js.Any])).asInstanceOf[js.Array[Controller]]
  
  inline def getControllersFromMetadata(): js.Array[Instantiable0[Controller]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllersFromMetadata")().asInstanceOf[js.Array[Instantiable0[Controller]]]
  
  inline def instanceOfIHttpActionResult(value: Any): /* is inversify-express-utils.inversify-express-utils/lib/interfaces.IHttpActionResult */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOfIHttpActionResult")(value.asInstanceOf[js.Any]).asInstanceOf[/* is inversify-express-utils.inversify-express-utils/lib/interfaces.IHttpActionResult */ Boolean]
}
