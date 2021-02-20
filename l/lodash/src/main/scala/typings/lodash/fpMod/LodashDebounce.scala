package typings.lodash.fpMod

import typings.lodash.mod.DebouncedFunc
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashDebounce extends StObject {
  
  def apply(wait: Double): LodashDebounce1x1 = js.native
  def apply[T /* <: js.Function1[/* args */ js.Any, _] */](wait: Double, func: T): DebouncedFunc[T] = js.native
  def apply[T /* <: js.Function1[/* args */ js.Any, _] */](wait: __, func: T): LodashDebounce1x2[T] = js.native
}
