package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait dismissType extends StObject
@JSImport("instabug-reactnative", "dismissType")
@js.native
object dismissType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[dismissType with Double] = js.native
  
  @js.native
  sealed trait addAttachment extends dismissType
  /* 2 */ val addAttachment: typings.instabugReactnative.mod.dismissType.addAttachment with Double = js.native
  
  @js.native
  sealed trait cancel extends dismissType
  /* 1 */ val cancel: typings.instabugReactnative.mod.dismissType.cancel with Double = js.native
  
  @js.native
  sealed trait submit extends dismissType
  /* 0 */ val submit: typings.instabugReactnative.mod.dismissType.submit with Double = js.native
}
