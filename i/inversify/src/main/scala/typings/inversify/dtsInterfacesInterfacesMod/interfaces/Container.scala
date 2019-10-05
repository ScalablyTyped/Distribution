package typings.inversify.dtsInterfacesInterfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Container extends js.Object {
  var id: Double = js.native
  var options: ContainerOptions = js.native
  var parent: Container | Null = js.native
  def applyCustomMetadataReader(metadataReader: MetadataReader): Unit = js.native
  def applyMiddleware(middleware: Middleware*): Unit = js.native
  def bind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T] = js.native
  def createChild(): Container = js.native
  def get[T](serviceIdentifier: ServiceIdentifier[T]): T = js.native
  def getAll[T](serviceIdentifier: ServiceIdentifier[T]): js.Array[T] = js.native
  def getNamed[T](serviceIdentifier: ServiceIdentifier[T], named: String): T = js.native
  def getNamed[T](serviceIdentifier: ServiceIdentifier[T], named: js.Symbol): T = js.native
  def getNamed[T](serviceIdentifier: ServiceIdentifier[T], named: Double): T = js.native
  def getTagged[T](serviceIdentifier: ServiceIdentifier[T], key: String, value: js.Any): T = js.native
  def getTagged[T](serviceIdentifier: ServiceIdentifier[T], key: js.Symbol, value: js.Any): T = js.native
  def getTagged[T](serviceIdentifier: ServiceIdentifier[T], key: Double, value: js.Any): T = js.native
  def isBound(serviceIdentifier: ServiceIdentifier[_]): Boolean = js.native
  def isBoundNamed(serviceIdentifier: ServiceIdentifier[_], named: String): Boolean = js.native
  def isBoundNamed(serviceIdentifier: ServiceIdentifier[_], named: js.Symbol): Boolean = js.native
  def isBoundNamed(serviceIdentifier: ServiceIdentifier[_], named: Double): Boolean = js.native
  def isBoundTagged(serviceIdentifier: ServiceIdentifier[_], key: String, value: js.Any): Boolean = js.native
  def isBoundTagged(serviceIdentifier: ServiceIdentifier[_], key: js.Symbol, value: js.Any): Boolean = js.native
  def isBoundTagged(serviceIdentifier: ServiceIdentifier[_], key: Double, value: js.Any): Boolean = js.native
  def load(modules: ContainerModule*): Unit = js.native
  def loadAsync(modules: AsyncContainerModule*): js.Promise[Unit] = js.native
  def rebind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T] = js.native
  def resolve[T](constructorFunction: Newable[T]): T = js.native
  def restore(): Unit = js.native
  def snapshot(): Unit = js.native
  def unbind(serviceIdentifier: ServiceIdentifier[_]): Unit = js.native
  def unbindAll(): Unit = js.native
  def unload(modules: ContainerModule*): Unit = js.native
}

