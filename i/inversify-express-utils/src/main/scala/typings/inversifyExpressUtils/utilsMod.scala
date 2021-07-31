package typings.inversifyExpressUtils

import typings.inversify.interfacesMod.interfaces.Container
import typings.inversifyExpressUtils.interfacesMod.interfaces.Controller
import typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerMetadata
import typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerMethodMetadata
import typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerParameterMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("inversify-express-utils/dts/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cleanUpMetadata(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanUpMetadata")().asInstanceOf[Unit]
  
  @scala.inline
  def getControllerMetadata(constructor: js.Any): ControllerMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllerMetadata")(constructor.asInstanceOf[js.Any]).asInstanceOf[ControllerMetadata]
  
  @scala.inline
  def getControllerMethodMetadata(constructor: js.Any): js.Array[ControllerMethodMetadata] = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllerMethodMetadata")(constructor.asInstanceOf[js.Any]).asInstanceOf[js.Array[ControllerMethodMetadata]]
  
  @scala.inline
  def getControllerParameterMetadata(constructor: js.Any): ControllerParameterMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllerParameterMetadata")(constructor.asInstanceOf[js.Any]).asInstanceOf[ControllerParameterMetadata]
  
  @scala.inline
  def getControllersFromContainer(container: Container, forceControllers: Boolean): js.Array[Controller] = (^.asInstanceOf[js.Dynamic].applyDynamic("getControllersFromContainer")(container.asInstanceOf[js.Any], forceControllers.asInstanceOf[js.Any])).asInstanceOf[js.Array[Controller]]
  
  @scala.inline
  def getControllersFromMetadata(): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getControllersFromMetadata")().asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def instanceOfIHttpActionResult(value: js.Any): /* is inversify-express-utils.inversify-express-utils/dts/interfaces.interfaces.IHttpActionResult */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("instanceOfIHttpActionResult")(value.asInstanceOf[js.Any]).asInstanceOf[/* is inversify-express-utils.inversify-express-utils/dts/interfaces.interfaces.IHttpActionResult */ Boolean]
}
