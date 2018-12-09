package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  var id: scala.Double = js.native
  var options: ContainerOptions = js.native
  var parent: Container | scala.Null = js.native
  def applyCustomMetadataReader(metadataReader: MetadataReader): scala.Unit = js.native
  def applyMiddleware(middleware: Middleware*): scala.Unit = js.native
  def bind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T] = js.native
  def createChild(): Container = js.native
  def get[T](serviceIdentifier: ServiceIdentifier[T]): T = js.native
  def getAll[T](serviceIdentifier: ServiceIdentifier[T]): js.Array[T] = js.native
  def getNamed[T](serviceIdentifier: ServiceIdentifier[T], named: java.lang.String): T = js.native
  def getNamed[T](serviceIdentifier: ServiceIdentifier[T], named: js.Symbol): T = js.native
  def getNamed[T](serviceIdentifier: ServiceIdentifier[T], named: scala.Double): T = js.native
  def getTagged[T](serviceIdentifier: ServiceIdentifier[T], key: java.lang.String, value: js.Any): T = js.native
  def getTagged[T](serviceIdentifier: ServiceIdentifier[T], key: js.Symbol, value: js.Any): T = js.native
  def getTagged[T](serviceIdentifier: ServiceIdentifier[T], key: scala.Double, value: js.Any): T = js.native
  def isBound(serviceIdentifier: ServiceIdentifier[_]): scala.Boolean = js.native
  def isBoundNamed(serviceIdentifier: ServiceIdentifier[_], named: java.lang.String): scala.Boolean = js.native
  def isBoundNamed(serviceIdentifier: ServiceIdentifier[_], named: js.Symbol): scala.Boolean = js.native
  def isBoundNamed(serviceIdentifier: ServiceIdentifier[_], named: scala.Double): scala.Boolean = js.native
  def isBoundTagged(serviceIdentifier: ServiceIdentifier[_], key: java.lang.String, value: js.Any): scala.Boolean = js.native
  def isBoundTagged(serviceIdentifier: ServiceIdentifier[_], key: js.Symbol, value: js.Any): scala.Boolean = js.native
  def isBoundTagged(serviceIdentifier: ServiceIdentifier[_], key: scala.Double, value: js.Any): scala.Boolean = js.native
  def load(modules: ContainerModule*): scala.Unit = js.native
  def loadAsync(modules: AsyncContainerModule*): js.Promise[scala.Unit] = js.native
  def rebind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T] = js.native
  def resolve[T](constructorFunction: Newable[T]): T = js.native
  def restore(): scala.Unit = js.native
  def snapshot(): scala.Unit = js.native
  def unbind(serviceIdentifier: ServiceIdentifier[_]): scala.Unit = js.native
  def unbindAll(): scala.Unit = js.native
  def unload(modules: ContainerModule*): scala.Unit = js.native
}

