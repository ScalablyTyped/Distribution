package typings.inversify

import typings.inversify.interfacesMod.interfaces.ContainerOptions
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerMod {
  
  @JSImport("inversify/dts/container/container", "Container")
  @js.native
  class Container ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.Container {
    def this(containerOptions: ContainerOptions) = this()
    
    var _bindingDictionary: js.Any = js.native
    
    /* private */ def _get[T](
      avoidConstraints: js.Any,
      isMultiInject: js.Any,
      targetType: js.Any,
      serviceIdentifier: js.Any,
      key: js.Any,
      value: js.Any
    ): js.Any = js.native
    
    /* private */ def _getContainerModuleHelpersFactory(): js.Any = js.native
    
    var _metadataReader: js.Any = js.native
    
    var _middleware: js.Any = js.native
    
    /* private */ def _planAndResolve[T](): js.Any = js.native
    
    var _snapshots: js.Any = js.native
    
    def createChild(containerOptions: ContainerOptions): Container = js.native
    
    def getAllNamed[T](serviceIdentifier: ServiceIdentifier[T], named: String): js.Array[T] = js.native
    def getAllNamed[T](serviceIdentifier: ServiceIdentifier[T], named: js.Symbol): js.Array[T] = js.native
    def getAllNamed[T](serviceIdentifier: ServiceIdentifier[T], named: Double): js.Array[T] = js.native
    
    def getAllTagged[T](serviceIdentifier: ServiceIdentifier[T], key: String, value: js.Any): js.Array[T] = js.native
    def getAllTagged[T](serviceIdentifier: ServiceIdentifier[T], key: js.Symbol, value: js.Any): js.Array[T] = js.native
    def getAllTagged[T](serviceIdentifier: ServiceIdentifier[T], key: Double, value: js.Any): js.Array[T] = js.native
  }
  object Container {
    
    @JSImport("inversify/dts/container/container", "Container")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def merge(
      container1: typings.inversify.interfacesMod.interfaces.Container,
      container2: typings.inversify.interfacesMod.interfaces.Container
    ): typings.inversify.interfacesMod.interfaces.Container = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(container1.asInstanceOf[js.Any], container2.asInstanceOf[js.Any])).asInstanceOf[typings.inversify.interfacesMod.interfaces.Container]
  }
}
