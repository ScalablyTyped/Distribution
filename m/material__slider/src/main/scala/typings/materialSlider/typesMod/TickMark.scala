package typings.materialSlider.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TickMark extends js.Object
@JSImport("@material/slider/types", "TickMark")
@js.native
object TickMark extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TickMark with Double] = js.native
  
  @js.native
  sealed trait ACTIVE extends TickMark
  /* 0 */ @js.native
  object ACTIVE extends TopLevel[ACTIVE with Double]
  
  @js.native
  sealed trait INACTIVE extends TickMark
  /* 1 */ @js.native
  object INACTIVE extends TopLevel[INACTIVE with Double]
}
