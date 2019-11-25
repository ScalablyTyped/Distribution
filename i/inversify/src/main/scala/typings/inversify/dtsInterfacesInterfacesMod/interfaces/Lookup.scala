package typings.inversify.dtsInterfacesInterfacesMod.interfaces

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lookup[T] extends Clonable[Lookup[T]] {
  def add(serviceIdentifier: ServiceIdentifier[_], value: T): Unit
  def get(serviceIdentifier: ServiceIdentifier[_]): js.Array[T]
  def getMap(): Map[ServiceIdentifier[_], js.Array[T]]
  def hasKey(serviceIdentifier: ServiceIdentifier[_]): Boolean
  def remove(serviceIdentifier: ServiceIdentifier[_]): Unit
  def removeByCondition(condition: js.Function1[/* item */ T, Boolean]): Unit
  def traverse(func: js.Function2[/* key */ ServiceIdentifier[_], /* value */ js.Array[T], Unit]): Unit
}

object Lookup {
  @scala.inline
  def apply[T](
    add: (ServiceIdentifier[_], T) => Unit,
    get: ServiceIdentifier[_] => js.Array[T],
    getMap: () => Map[ServiceIdentifier[_], js.Array[T]],
    hasKey: ServiceIdentifier[_] => Boolean,
    remove: ServiceIdentifier[_] => Unit,
    removeByCondition: js.Function1[/* item */ T, Boolean] => Unit,
    traverse: js.Function2[/* key */ ServiceIdentifier[_], /* value */ js.Array[T], Unit] => Unit
  ): Lookup[T] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get = js.Any.fromFunction1(get), getMap = js.Any.fromFunction0(getMap), hasKey = js.Any.fromFunction1(hasKey), remove = js.Any.fromFunction1(remove), removeByCondition = js.Any.fromFunction1(removeByCondition), traverse = js.Any.fromFunction1(traverse))
  
    __obj.asInstanceOf[Lookup[T]]
  }
}

