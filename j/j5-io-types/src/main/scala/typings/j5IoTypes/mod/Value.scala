package typings.j5IoTypes.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Value extends js.Object
@JSImport("j5-io-types", "Value")
@js.native
object Value extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Value with Double] = js.native
  
  @js.native
  sealed trait HIGH extends Value
  /* 1 */ @js.native
  object HIGH extends TopLevel[HIGH with Double]
  
  @js.native
  sealed trait LOW extends Value
  /* 0 */ @js.native
  object LOW extends TopLevel[LOW with Double]
}
