package typings
package inversifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/utils/serialization", JSImport.Namespace)
@js.native
object dtsUtilsSerializationMod extends js.Object {
  def circularDependencyToException(request: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Request): scala.Unit = js.native
  def getFunctionName(v: js.Any): java.lang.String = js.native
  def getServiceIdentifierAsString(serviceIdentifier: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[_]): java.lang.String = js.native
  def listMetadataForTarget(
    serviceIdentifierString: java.lang.String,
    target: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Target
  ): java.lang.String = js.native
  def listRegisteredBindingsForServiceIdentifier(
    container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container,
    serviceIdentifier: java.lang.String,
    getBindings: js.Function2[
      /* container */ inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, 
      /* serviceIdentifier */ inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[_], 
      js.Array[inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Binding[_]]
    ]
  ): java.lang.String = js.native
}

