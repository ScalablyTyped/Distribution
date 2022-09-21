package typings.ipldCar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iteratorChannelMod {
  
  @JSImport("@ipld/car/types/lib/iterator-channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create[T /* <: Any */](): typings.ipldCar.codingMod.IteratorChannel[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.ipldCar.codingMod.IteratorChannel[T]]
  
  type IteratorChannel[T /* <: Any */] = typings.ipldCar.codingMod.IteratorChannel[T]
}
