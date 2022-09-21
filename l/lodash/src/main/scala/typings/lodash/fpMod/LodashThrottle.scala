package typings.lodash.fpMod

import typings.lodash.mod.DebouncedFunc
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashThrottle extends StObject {
  
  def apply(wait: Double): LodashThrottle1x1 = js.native
  def apply[T /* <: js.Function1[/* args */ Any, Any] */](wait: Double, func: T): DebouncedFunc[T] = js.native
  def apply[T /* <: js.Function1[/* args */ Any, Any] */](wait: __, func: T): LodashThrottle1x2[T] = js.native
}
