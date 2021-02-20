package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.Container
import typings.inversify.interfacesMod.interfaces.Request
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversify.interfacesMod.interfaces.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializationMod {
  
  @JSImport("inversify/dts/utils/serialization", "circularDependencyToException")
  @js.native
  def circularDependencyToException(request: Request): Unit = js.native
  
  @JSImport("inversify/dts/utils/serialization", "getFunctionName")
  @js.native
  def getFunctionName(v: js.Any): String = js.native
  
  @JSImport("inversify/dts/utils/serialization", "getServiceIdentifierAsString")
  @js.native
  def getServiceIdentifierAsString(serviceIdentifier: ServiceIdentifier[_]): String = js.native
  
  @JSImport("inversify/dts/utils/serialization", "listMetadataForTarget")
  @js.native
  def listMetadataForTarget(serviceIdentifierString: String, target: Target): String = js.native
  
  @JSImport("inversify/dts/utils/serialization", "listRegisteredBindingsForServiceIdentifier")
  @js.native
  def listRegisteredBindingsForServiceIdentifier(
    container: Container,
    serviceIdentifier: String,
    getBindings: js.Function2[
      /* container */ Container, 
      /* serviceIdentifier */ ServiceIdentifier[_], 
      js.Array[Binding[_]]
    ]
  ): String = js.native
}
