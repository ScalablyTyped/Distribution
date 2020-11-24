package typings.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait dismissType extends js.Object
@JSImport("instabug-reactnative", "dismissType")
@js.native
object dismissType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[dismissType with Double] = js.native
  
  @js.native
  sealed trait addAttachment extends dismissType
  /* 2 */ @js.native
  object addAttachment extends TopLevel[addAttachment with Double]
  
  @js.native
  sealed trait cancel extends dismissType
  /* 1 */ @js.native
  object cancel extends TopLevel[cancel with Double]
  
  @js.native
  sealed trait submit extends dismissType
  /* 0 */ @js.native
  object submit extends TopLevel[submit with Double]
}
