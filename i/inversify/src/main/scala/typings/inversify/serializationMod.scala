package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.Container
import typings.inversify.interfacesMod.interfaces.Request
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversify.interfacesMod.interfaces.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializationMod {
  
  @JSImport("inversify/dts/utils/serialization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def circularDependencyToException(request: Request): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("circularDependencyToException")(request.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getFunctionName(v: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionName")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def getServiceIdentifierAsString(serviceIdentifier: ServiceIdentifier[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceIdentifierAsString")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def listMetadataForTarget(serviceIdentifierString: String, target: Target): String = (^.asInstanceOf[js.Dynamic].applyDynamic("listMetadataForTarget")(serviceIdentifierString.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def listRegisteredBindingsForServiceIdentifier(
    container: Container,
    serviceIdentifier: String,
    getBindings: js.Function2[
      /* container */ Container, 
      /* serviceIdentifier */ ServiceIdentifier[js.Any], 
      js.Array[Binding[js.Any]]
    ]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("listRegisteredBindingsForServiceIdentifier")(container.asInstanceOf[js.Any], serviceIdentifier.asInstanceOf[js.Any], getBindings.asInstanceOf[js.Any])).asInstanceOf[String]
}
