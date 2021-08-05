package typings.inversify

import typings.inversify.interfacesMod.interfaces.Clonable
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lookupMod {
  
  @JSImport("inversify/dts/container/lookup", "Lookup")
  @js.native
  class Lookup[T /* <: Clonable[T] */] ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.Lookup[T] {
    
    /* private */ var _map: js.Any = js.native
    
    /* CompleteClass */
    override def add(serviceIdentifier: ServiceIdentifier[js.Any], value: T): Unit = js.native
    
    /* CompleteClass */
    override def get(serviceIdentifier: ServiceIdentifier[js.Any]): js.Array[T] = js.native
    
    /* CompleteClass */
    override def getMap(): Map[ServiceIdentifier[js.Any], js.Array[T]] = js.native
    
    /* CompleteClass */
    override def hasKey(serviceIdentifier: ServiceIdentifier[js.Any]): Boolean = js.native
    
    /* CompleteClass */
    override def remove(serviceIdentifier: ServiceIdentifier[js.Any]): Unit = js.native
    
    /* CompleteClass */
    override def removeByCondition(condition: js.Function1[T, Boolean]): Unit = js.native
    
    /* CompleteClass */
    override def traverse(func: js.Function2[/* key */ ServiceIdentifier[js.Any], /* value */ js.Array[T], Unit]): Unit = js.native
  }
}
