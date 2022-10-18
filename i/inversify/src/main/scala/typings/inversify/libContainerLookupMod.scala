package typings.inversify

import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContainerLookupMod {
  
  @JSImport("inversify/lib/container/lookup", "Lookup")
  @js.native
  open class Lookup[T] ()
    extends StObject
       with typings.inversify.libInterfacesInterfacesMod.interfaces.Lookup[T] {
    
    /* private */ var _map: Any = js.native
    
    /* private */ var _setValue: Any = js.native
    
    /* CompleteClass */
    override def add(serviceIdentifier: ServiceIdentifier[Any], value: T): Unit = js.native
    
    /* CompleteClass */
    override def get(serviceIdentifier: ServiceIdentifier[Any]): js.Array[T] = js.native
    
    /* CompleteClass */
    override def getMap(): Map[ServiceIdentifier[Any], js.Array[T]] = js.native
    
    /* CompleteClass */
    override def hasKey(serviceIdentifier: ServiceIdentifier[Any]): Boolean = js.native
    
    /* CompleteClass */
    override def remove(serviceIdentifier: ServiceIdentifier[Any]): Unit = js.native
    
    /* CompleteClass */
    override def removeByCondition(condition: js.Function1[T, Boolean]): js.Array[T] = js.native
    
    /* CompleteClass */
    override def removeIntersection(lookup: typings.inversify.libInterfacesInterfacesMod.interfaces.Lookup[T]): Unit = js.native
    
    /* CompleteClass */
    override def traverse(func: js.Function2[/* key */ ServiceIdentifier[Any], /* value */ js.Array[T], Unit]): Unit = js.native
  }
}
