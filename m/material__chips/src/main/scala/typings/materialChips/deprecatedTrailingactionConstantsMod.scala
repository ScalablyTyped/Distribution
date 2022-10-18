package typings.materialChips

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedTrailingactionConstantsMod {
  
  @js.native
  sealed trait InteractionTrigger extends StObject
  @JSImport("@material/chips/deprecated/trailingaction/constants", "InteractionTrigger")
  @js.native
  object InteractionTrigger extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[InteractionTrigger & Double] = js.native
    
    @js.native
    sealed trait BACKSPACE_KEY
      extends StObject
         with InteractionTrigger
    /* 2 */ val BACKSPACE_KEY: typings.materialChips.deprecatedTrailingactionConstantsMod.InteractionTrigger.BACKSPACE_KEY & Double = js.native
    
    @js.native
    sealed trait CLICK
      extends StObject
         with InteractionTrigger
    /* 1 */ val CLICK: typings.materialChips.deprecatedTrailingactionConstantsMod.InteractionTrigger.CLICK & Double = js.native
    
    @js.native
    sealed trait DELETE_KEY
      extends StObject
         with InteractionTrigger
    /* 3 */ val DELETE_KEY: typings.materialChips.deprecatedTrailingactionConstantsMod.InteractionTrigger.DELETE_KEY & Double = js.native
    
    @js.native
    sealed trait ENTER_KEY
      extends StObject
         with InteractionTrigger
    /* 5 */ val ENTER_KEY: typings.materialChips.deprecatedTrailingactionConstantsMod.InteractionTrigger.ENTER_KEY & Double = js.native
    
    @js.native
    sealed trait SPACEBAR_KEY
      extends StObject
         with InteractionTrigger
    /* 4 */ val SPACEBAR_KEY: typings.materialChips.deprecatedTrailingactionConstantsMod.InteractionTrigger.SPACEBAR_KEY & Double = js.native
    
    @js.native
    sealed trait UNSPECIFIED
      extends StObject
         with InteractionTrigger
    /* 0 */ val UNSPECIFIED: typings.materialChips.deprecatedTrailingactionConstantsMod.InteractionTrigger.UNSPECIFIED & Double = js.native
  }
  
  object strings {
    
    @JSImport("@material/chips/deprecated/trailingaction/constants", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/chips/deprecated/trailingaction/constants", "strings.ARIA_HIDDEN")
    @js.native
    def ARIA_HIDDEN: String = js.native
    inline def ARIA_HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_HIDDEN")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated/trailingaction/constants", "strings.INTERACTION_EVENT")
    @js.native
    def INTERACTION_EVENT: String = js.native
    inline def INTERACTION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERACTION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated/trailingaction/constants", "strings.NAVIGATION_EVENT")
    @js.native
    def NAVIGATION_EVENT: String = js.native
    inline def NAVIGATION_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAVIGATION_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/chips/deprecated/trailingaction/constants", "strings.TAB_INDEX")
    @js.native
    def TAB_INDEX: String = js.native
    inline def TAB_INDEX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB_INDEX")(x.asInstanceOf[js.Any])
  }
}
