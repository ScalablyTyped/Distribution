package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends StObject {
  
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
  
  var id: Double = js.native
  
  def isBound(serviceIdentifier: ServiceIdentifier[js.Any]): Boolean = js.native
  
  def isBoundNamed(serviceIdentifier: ServiceIdentifier[js.Any], named: String): Boolean = js.native
  def isBoundNamed(serviceIdentifier: ServiceIdentifier[js.Any], named: js.Symbol): Boolean = js.native
  def isBoundNamed(serviceIdentifier: ServiceIdentifier[js.Any], named: Double): Boolean = js.native
  
  def isBoundTagged(serviceIdentifier: ServiceIdentifier[js.Any], key: String, value: js.Any): Boolean = js.native
  def isBoundTagged(serviceIdentifier: ServiceIdentifier[js.Any], key: js.Symbol, value: js.Any): Boolean = js.native
  def isBoundTagged(serviceIdentifier: ServiceIdentifier[js.Any], key: Double, value: js.Any): Boolean = js.native
  
  def load(modules: ContainerModule*): Unit = js.native
  
  def loadAsync(modules: AsyncContainerModule*): js.Promise[Unit] = js.native
  
  var options: ContainerOptions = js.native
  
  var parent: Container | Null = js.native
  
  def rebind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T] = js.native
  
  def resolve[T](constructorFunction: Newable[T]): T = js.native
  
  def restore(): Unit = js.native
  
  def snapshot(): Unit = js.native
  
  def unbind(serviceIdentifier: ServiceIdentifier[js.Any]): Unit = js.native
  
  def unbindAll(): Unit = js.native
  
  def unload(modules: ContainerModule*): Unit = js.native
}
