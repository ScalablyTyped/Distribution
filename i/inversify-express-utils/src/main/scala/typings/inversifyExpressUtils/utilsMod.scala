package typings.inversifyExpressUtils

import typings.inversify.interfacesMod.interfaces.Container
import typings.inversifyExpressUtils.interfacesMod.interfaces.Controller
import typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerMetadata
import typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerMethodMetadata
import typings.inversifyExpressUtils.interfacesMod.interfaces.ControllerParameterMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("inversify-express-utils/dts/utils", "cleanUpMetadata")
  @js.native
  def cleanUpMetadata(): Unit = js.native
  
  @JSImport("inversify-express-utils/dts/utils", "getControllerMetadata")
  @js.native
  def getControllerMetadata(constructor: js.Any): ControllerMetadata = js.native
  
  @JSImport("inversify-express-utils/dts/utils", "getControllerMethodMetadata")
  @js.native
  def getControllerMethodMetadata(constructor: js.Any): js.Array[ControllerMethodMetadata] = js.native
  
  @JSImport("inversify-express-utils/dts/utils", "getControllerParameterMetadata")
  @js.native
  def getControllerParameterMetadata(constructor: js.Any): ControllerParameterMetadata = js.native
  
  @JSImport("inversify-express-utils/dts/utils", "getControllersFromContainer")
  @js.native
  def getControllersFromContainer(container: Container, forceControllers: Boolean): js.Array[Controller] = js.native
  
  @JSImport("inversify-express-utils/dts/utils", "getControllersFromMetadata")
  @js.native
  def getControllersFromMetadata(): js.Array[_] = js.native
  
  @JSImport("inversify-express-utils/dts/utils", "instanceOfIHttpActionResult")
  @js.native
  def instanceOfIHttpActionResult(value: js.Any): /* is inversify-express-utils.inversify-express-utils/dts/interfaces.interfaces.IHttpActionResult */ Boolean = js.native
}
