package typings.inversify.libInterfacesInterfacesMod.interfaces

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lookup[T]
  extends StObject
     with Clonable[Lookup[T]] {
  
  def add(serviceIdentifier: ServiceIdentifier[Any], value: T): Unit
  
  def get(serviceIdentifier: ServiceIdentifier[Any]): js.Array[T]
  
  def getMap(): Map[ServiceIdentifier[Any], js.Array[T]]
  
  def hasKey(serviceIdentifier: ServiceIdentifier[Any]): Boolean
  
  def remove(serviceIdentifier: ServiceIdentifier[Any]): Unit
  
  def removeByCondition(condition: js.Function1[/* item */ T, Boolean]): js.Array[T]
  
  def removeIntersection(lookup: Lookup[T]): Unit
  
  def traverse(func: js.Function2[/* key */ ServiceIdentifier[Any], /* value */ js.Array[T], Unit]): Unit
}
object Lookup {
  
  inline def apply[T](
    add: (ServiceIdentifier[Any], T) => Unit,
    get: ServiceIdentifier[Any] => js.Array[T],
    getMap: () => Map[ServiceIdentifier[Any], js.Array[T]],
    hasKey: ServiceIdentifier[Any] => Boolean,
    remove: ServiceIdentifier[Any] => Unit,
    removeByCondition: js.Function1[/* item */ T, Boolean] => js.Array[T],
    removeIntersection: Lookup[T] => Unit,
    traverse: js.Function2[/* key */ ServiceIdentifier[Any], /* value */ js.Array[T], Unit] => Unit
  ): Lookup[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get = js.Any.fromFunction1(get), getMap = js.Any.fromFunction0(getMap), hasKey = js.Any.fromFunction1(hasKey), remove = js.Any.fromFunction1(remove), removeByCondition = js.Any.fromFunction1(removeByCondition), removeIntersection = js.Any.fromFunction1(removeIntersection), traverse = js.Any.fromFunction1(traverse))
    __obj.asInstanceOf[Lookup[T]]
  }
  
  extension [Self <: Lookup[?], T](x: Self & Lookup[T]) {
    
    inline def setAdd(value: (ServiceIdentifier[Any], T) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setGet(value: ServiceIdentifier[Any] => js.Array[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setGetMap(value: () => Map[ServiceIdentifier[Any], js.Array[T]]): Self = StObject.set(x, "getMap", js.Any.fromFunction0(value))
    
    inline def setHasKey(value: ServiceIdentifier[Any] => Boolean): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
    
    inline def setRemove(value: ServiceIdentifier[Any] => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRemoveByCondition(value: js.Function1[/* item */ T, Boolean] => js.Array[T]): Self = StObject.set(x, "removeByCondition", js.Any.fromFunction1(value))
    
    inline def setRemoveIntersection(value: Lookup[T] => Unit): Self = StObject.set(x, "removeIntersection", js.Any.fromFunction1(value))
    
    inline def setTraverse(value: js.Function2[/* key */ ServiceIdentifier[Any], /* value */ js.Array[T], Unit] => Unit): Self = StObject.set(x, "traverse", js.Any.fromFunction1(value))
  }
}
