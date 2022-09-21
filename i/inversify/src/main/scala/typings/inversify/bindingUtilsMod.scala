package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.Container
import typings.inversify.interfacesMod.interfaces.FactoryDetails
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingUtilsMod {
  
  @JSImport("inversify/lib/utils/binding_utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureFullyBound[T](binding: Binding[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureFullyBound")(binding.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getFactoryDetails[T](binding: Binding[T]): FactoryDetails = ^.asInstanceOf[js.Dynamic].applyDynamic("getFactoryDetails")(binding.asInstanceOf[js.Any]).asInstanceOf[FactoryDetails]
  
  inline def multiBindToService(container: Container): js.Function1[
    /* service */ ServiceIdentifier[Any], 
    js.Function1[/* repeated */ ServiceIdentifier[Any], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("multiBindToService")(container.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* service */ ServiceIdentifier[Any], 
    js.Function1[/* repeated */ ServiceIdentifier[Any], Unit]
  ]]
}
