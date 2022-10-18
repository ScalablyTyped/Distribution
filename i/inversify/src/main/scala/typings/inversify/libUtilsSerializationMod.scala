package typings.inversify

import typings.inversify.anon.Name
import typings.inversify.libInterfacesInterfacesMod.interfaces.Binding
import typings.inversify.libInterfacesInterfacesMod.interfaces.Container
import typings.inversify.libInterfacesInterfacesMod.interfaces.Request
import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.inversify.libInterfacesInterfacesMod.interfaces.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSerializationMod {
  
  @JSImport("inversify/lib/utils/serialization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def circularDependencyToException(request: Request): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("circularDependencyToException")(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getFunctionName(func: Name): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionName")(func.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getServiceIdentifierAsString(serviceIdentifier: ServiceIdentifier[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceIdentifierAsString")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getSymbolDescription(symbol: js.Symbol): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSymbolDescription")(symbol.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def listMetadataForTarget(serviceIdentifierString: String, target: Target): String = (^.asInstanceOf[js.Dynamic].applyDynamic("listMetadataForTarget")(serviceIdentifierString.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def listRegisteredBindingsForServiceIdentifier(
    container: Container,
    serviceIdentifier: String,
    getBindings: js.Function2[
      /* container */ Container, 
      /* serviceIdentifier */ ServiceIdentifier[Any], 
      js.Array[Binding[Any]]
    ]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("listRegisteredBindingsForServiceIdentifier")(container.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], getBindings.asInstanceOf[js.Any])).asInstanceOf[String]
}
