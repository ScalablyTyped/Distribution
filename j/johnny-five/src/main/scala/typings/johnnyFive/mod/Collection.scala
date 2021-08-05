package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Collection")
@js.native
class Collection[Base] protected () extends StObject {
  def this(options: js.Array[Double | String | js.Object]) = this()
  def this(options: CollectionPinOptions) = this()
  
  def add(args: (Double | js.Object)*): Double = js.native
  
  def byId(id: js.Any): js.UndefOr[Base] = js.native
  
  def each(callback: js.Function2[/* item */ Base, /* index */ Double, Unit]): this.type = js.native
  
  def forEach(callback: js.Function2[/* item */ Base, /* index */ Double, Unit]): this.type = js.native
  
  def includes(item: Base): Boolean = js.native
  
  def indexOf(item: Base): Double = js.native
  
  def map(callback: js.Function2[/* item */ Base, /* index */ Double, Unit]): js.Array[js.Any] = js.native
  
  def slice(): Collection[Base] = js.native
  def slice(begin: Double): Collection[Base] = js.native
  def slice(begin: Double, end: Double): Collection[Base] = js.native
  def slice(begin: Unit, end: Double): Collection[Base] = js.native
  
  var `type`: js.UndefOr[Base] = js.native
}
/* static members */
object Collection {
  
  @JSImport("johnny-five", "Collection")
  @js.native
  val ^ : js.Any = js.native
  
  inline def installMethodForwarding(target: js.Object, source: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("installMethodForwarding")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
