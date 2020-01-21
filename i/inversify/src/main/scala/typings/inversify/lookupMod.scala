package typings.inversify

import typings.inversify.interfacesMod.interfaces.Clonable
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/container/lookup", JSImport.Namespace)
@js.native
object lookupMod extends js.Object {
  @js.native
  class Lookup[T /* <: Clonable[T] */] ()
    extends typings.inversify.interfacesMod.interfaces.Lookup[T] {
    var _map: js.Any = js.native
    /* CompleteClass */
    override def add(serviceIdentifier: ServiceIdentifier[_], value: T): Unit = js.native
    /* CompleteClass */
    override def get(serviceIdentifier: ServiceIdentifier[_]): js.Array[T] = js.native
    /* CompleteClass */
    override def getMap(): Map[ServiceIdentifier[_], js.Array[T]] = js.native
    /* CompleteClass */
    override def hasKey(serviceIdentifier: ServiceIdentifier[_]): Boolean = js.native
    /* CompleteClass */
    override def remove(serviceIdentifier: ServiceIdentifier[_]): Unit = js.native
    /* CompleteClass */
    override def removeByCondition(condition: js.Function1[T, Boolean]): Unit = js.native
    /* CompleteClass */
    override def traverse(func: js.Function2[/* key */ ServiceIdentifier[_], /* value */ js.Array[T], Unit]): Unit = js.native
  }
  
}

