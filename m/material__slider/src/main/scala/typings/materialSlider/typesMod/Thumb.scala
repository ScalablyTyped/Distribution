package typings.materialSlider.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Thumb extends js.Object
@JSImport("@material/slider/types", "Thumb")
@js.native
object Thumb extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Thumb with Double] = js.native
  
  @js.native
  sealed trait END extends Thumb
  /* 2 */ @js.native
  object END extends TopLevel[END with Double]
  
  @js.native
  sealed trait START extends Thumb
  /* 1 */ @js.native
  object START extends TopLevel[START with Double]
}
