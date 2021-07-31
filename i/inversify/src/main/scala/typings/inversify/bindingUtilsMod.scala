package typings.inversify

import typings.inversify.interfacesMod.interfaces.Abstract
import typings.inversify.interfacesMod.interfaces.Container
import typings.inversify.interfacesMod.interfaces.Newable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingUtilsMod {
  
  @JSImport("inversify/dts/utils/binding_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def multiBindToService(container: Container): js.Function1[
    /* service */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], 
    js.Function1[/* repeated */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiBindToService")(container.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* service */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], 
    js.Function1[/* repeated */ String | js.Symbol | Newable[js.Any] | Abstract[js.Any], Unit]
  ]]
}
