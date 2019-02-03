package typings
package inversifyLib.dtsContainerContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/container/container", "Container")
@js.native
class Container ()
  extends inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container {
  def this(containerOptions: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ContainerOptions) = this()
  var _bindingDictionary: js.Any = js.native
  var _metadataReader: js.Any = js.native
  var _middleware: js.Any = js.native
  var _snapshots: js.Any = js.native
  /* private */ def _get[T](avoidConstraints: js.Any, isMultiInject: js.Any, targetType: js.Any, serviceIdentifier: js.Any): js.Any = js.native
  /* private */ def _get[T](
    avoidConstraints: js.Any,
    isMultiInject: js.Any,
    targetType: js.Any,
    serviceIdentifier: js.Any,
    key: js.Any
  ): js.Any = js.native
  /* private */ def _get[T](
    avoidConstraints: js.Any,
    isMultiInject: js.Any,
    targetType: js.Any,
    serviceIdentifier: js.Any,
    key: js.Any,
    value: js.Any
  ): js.Any = js.native
  /* private */ def _getContainerModuleHelpersFactory(): js.Any = js.native
  /* private */ def _planAndResolve[T](): js.Any = js.native
  def createChild(containerOptions: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ContainerOptions): Container = js.native
  def getAllNamed[T](
    serviceIdentifier: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[T],
    named: java.lang.String
  ): js.Array[T] = js.native
  def getAllNamed[T](
    serviceIdentifier: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[T],
    named: js.Symbol
  ): js.Array[T] = js.native
  def getAllNamed[T](
    serviceIdentifier: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[T],
    named: scala.Double
  ): js.Array[T] = js.native
  def getAllTagged[T](
    serviceIdentifier: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[T],
    key: java.lang.String,
    value: js.Any
  ): js.Array[T] = js.native
  def getAllTagged[T](
    serviceIdentifier: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[T],
    key: js.Symbol,
    value: js.Any
  ): js.Array[T] = js.native
  def getAllTagged[T](
    serviceIdentifier: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[T],
    key: scala.Double,
    value: js.Any
  ): js.Array[T] = js.native
}

/* static members */
@JSImport("inversify/dts/container/container", "Container")
@js.native
object Container extends js.Object {
  def merge(
    container1: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container,
    container2: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container
  ): inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container = js.native
}

