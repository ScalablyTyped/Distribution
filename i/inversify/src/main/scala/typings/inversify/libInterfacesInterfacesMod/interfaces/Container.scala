package typings.inversify.libInterfacesInterfacesMod.interfaces

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
  
  def getAllAsync[T](serviceIdentifier: ServiceIdentifier[T]): js.Promise[js.Array[T]] = js.native
  
  def getAllNamed[T](serviceIdentifier: ServiceIdentifier[T], named: String): js.Array[T] = js.native
  def getAllNamed[T](serviceIdentifier: ServiceIdentifier[T], named: js.Symbol): js.Array[T] = js.native
  def getAllNamed[T](serviceIdentifier: ServiceIdentifier[T], named: Double): js.Array[T] = js.native
  
  def getAllNamedAsync[T](serviceIdentifier: ServiceIdentifier[T], named: String): js.Promise[js.Array[T]] = js.native
  def getAllNamedAsync[T](serviceIdentifier: ServiceIdentifier[T], named: js.Symbol): js.Promise[js.Array[T]] = js.native
  def getAllNamedAsync[T](serviceIdentifier: ServiceIdentifier[T], named: Double): js.Promise[js.Array[T]] = js.native
  
  def getAllTagged[T](serviceIdentifier: ServiceIdentifier[T], key: String, value: Any): js.Array[T] = js.native
  def getAllTagged[T](serviceIdentifier: ServiceIdentifier[T], key: js.Symbol, value: Any): js.Array[T] = js.native
  def getAllTagged[T](serviceIdentifier: ServiceIdentifier[T], key: Double, value: Any): js.Array[T] = js.native
  
  def getAllTaggedAsync[T](serviceIdentifier: ServiceIdentifier[T], key: String, value: Any): js.Promise[js.Array[T]] = js.native
  def getAllTaggedAsync[T](serviceIdentifier: ServiceIdentifier[T], key: js.Symbol, value: Any): js.Promise[js.Array[T]] = js.native
  def getAllTaggedAsync[T](serviceIdentifier: ServiceIdentifier[T], key: Double, value: Any): js.Promise[js.Array[T]] = js.native
  
  def getAsync[T](serviceIdentifier: ServiceIdentifier[T]): js.Promise[T] = js.native
  
  def getNamed[T](serviceIdentifier: ServiceIdentifier[T], named: String): T = js.native
  def getNamed[T](serviceIdentifier: ServiceIdentifier[T], named: js.Symbol): T = js.native
  def getNamed[T](serviceIdentifier: ServiceIdentifier[T], named: Double): T = js.native
  
  def getNamedAsync[T](serviceIdentifier: ServiceIdentifier[T], named: String): js.Promise[T] = js.native
  def getNamedAsync[T](serviceIdentifier: ServiceIdentifier[T], named: js.Symbol): js.Promise[T] = js.native
  def getNamedAsync[T](serviceIdentifier: ServiceIdentifier[T], named: Double): js.Promise[T] = js.native
  
  def getTagged[T](serviceIdentifier: ServiceIdentifier[T], key: String, value: Any): T = js.native
  def getTagged[T](serviceIdentifier: ServiceIdentifier[T], key: js.Symbol, value: Any): T = js.native
  def getTagged[T](serviceIdentifier: ServiceIdentifier[T], key: Double, value: Any): T = js.native
  
  def getTaggedAsync[T](serviceIdentifier: ServiceIdentifier[T], key: String, value: Any): js.Promise[T] = js.native
  def getTaggedAsync[T](serviceIdentifier: ServiceIdentifier[T], key: js.Symbol, value: Any): js.Promise[T] = js.native
  def getTaggedAsync[T](serviceIdentifier: ServiceIdentifier[T], key: Double, value: Any): js.Promise[T] = js.native
  
  var id: Double = js.native
  
  def isBound(serviceIdentifier: ServiceIdentifier[Any]): Boolean = js.native
  
  def isBoundNamed(serviceIdentifier: ServiceIdentifier[Any], named: String): Boolean = js.native
  def isBoundNamed(serviceIdentifier: ServiceIdentifier[Any], named: js.Symbol): Boolean = js.native
  def isBoundNamed(serviceIdentifier: ServiceIdentifier[Any], named: Double): Boolean = js.native
  
  def isBoundTagged(serviceIdentifier: ServiceIdentifier[Any], key: String, value: Any): Boolean = js.native
  def isBoundTagged(serviceIdentifier: ServiceIdentifier[Any], key: js.Symbol, value: Any): Boolean = js.native
  def isBoundTagged(serviceIdentifier: ServiceIdentifier[Any], key: Double, value: Any): Boolean = js.native
  
  def isCurrentBound[T](serviceIdentifier: ServiceIdentifier[T]): Boolean = js.native
  
  def load(modules: ContainerModule*): Unit = js.native
  
  def loadAsync(modules: AsyncContainerModule*): js.Promise[Unit] = js.native
  
  def onActivation[T](serviceIdentifier: ServiceIdentifier[T], onActivation: BindingActivation[T]): Unit = js.native
  
  def onDeactivation[T](serviceIdentifier: ServiceIdentifier[T], onDeactivation: BindingDeactivation[T]): Unit = js.native
  
  var options: ContainerOptions = js.native
  
  var parent: Container | Null = js.native
  
  def rebind[T](serviceIdentifier: ServiceIdentifier[T]): BindingToSyntax[T] = js.native
  
  def rebindAsync[T](serviceIdentifier: ServiceIdentifier[T]): js.Promise[BindingToSyntax[T]] = js.native
  
  def resolve[T](constructorFunction: Newable[T]): T = js.native
  
  def restore(): Unit = js.native
  
  def snapshot(): Unit = js.native
  
  def unbind(serviceIdentifier: ServiceIdentifier[Any]): Unit = js.native
  
  def unbindAll(): Unit = js.native
  
  def unbindAllAsync(): js.Promise[Unit] = js.native
  
  def unbindAsync(serviceIdentifier: ServiceIdentifier[Any]): js.Promise[Unit] = js.native
  
  def unload(modules: ContainerModuleBase*): Unit = js.native
  
  def unloadAsync(modules: ContainerModuleBase*): js.Promise[Unit] = js.native
}
