package typings.materialChips

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/chips/trailingaction/constants", JSImport.Namespace)
@js.native
object trailingactionConstantsMod extends js.Object {
  @js.native
  sealed trait InteractionTrigger extends js.Object
  
  @js.native
  object InteractionTrigger extends js.Object {
    @js.native
    sealed trait BACKSPACE_KEY extends InteractionTrigger
    
    @js.native
    sealed trait CLICK extends InteractionTrigger
    
    @js.native
    sealed trait DELETE_KEY extends InteractionTrigger
    
    @js.native
    sealed trait ENTER_KEY extends InteractionTrigger
    
    @js.native
    sealed trait SPACEBAR_KEY extends InteractionTrigger
    
    @js.native
    sealed trait UNSPECIFIED extends InteractionTrigger
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InteractionTrigger with Double] = js.native
    /* 2 */ @js.native
    object BACKSPACE_KEY extends TopLevel[BACKSPACE_KEY with Double]
    
    /* 1 */ @js.native
    object CLICK extends TopLevel[CLICK with Double]
    
    /* 3 */ @js.native
    object DELETE_KEY extends TopLevel[DELETE_KEY with Double]
    
    /* 5 */ @js.native
    object ENTER_KEY extends TopLevel[ENTER_KEY with Double]
    
    /* 4 */ @js.native
    object SPACEBAR_KEY extends TopLevel[SPACEBAR_KEY with Double]
    
    /* 0 */ @js.native
    object UNSPECIFIED extends TopLevel[UNSPECIFIED with Double]
    
  }
  
  @js.native
  object strings extends js.Object {
    var ARIA_HIDDEN: String = js.native
    var INTERACTION_EVENT: String = js.native
    var NAVIGATION_EVENT: String = js.native
    var TAB_INDEX: String = js.native
  }
  
}

