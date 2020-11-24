package typings.knockoutTransformations.KnockoutTransformations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MappingOption[T, TResult] extends js.Object {
  
  var disposeItem: js.UndefOr[js.Function1[/* item */ TResult, Unit]] = js.native
  
  def mapping(value: T): TResult = js.native
  @JSName("mapping")
  var mapping_Original: Mapping[T, TResult] = js.native
}
