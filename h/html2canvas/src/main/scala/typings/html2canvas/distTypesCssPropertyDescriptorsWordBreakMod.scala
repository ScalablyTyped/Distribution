package typings.html2canvas

import typings.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyIdentValueDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssPropertyDescriptorsWordBreakMod {
  
  @js.native
  sealed trait WORD_BREAK extends StObject
  @JSImport("html2canvas/dist/types/css/property-descriptors/word-break", "WORD_BREAK")
  @js.native
  object WORD_BREAK extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WORD_BREAK & String] = js.native
    
    @js.native
    sealed trait BREAK_ALL
      extends StObject
         with WORD_BREAK
    /* "break-all" */ val BREAK_ALL: typings.html2canvas.distTypesCssPropertyDescriptorsWordBreakMod.WORD_BREAK.BREAK_ALL & String = js.native
    
    @js.native
    sealed trait KEEP_ALL
      extends StObject
         with WORD_BREAK
    /* "keep-all" */ val KEEP_ALL: typings.html2canvas.distTypesCssPropertyDescriptorsWordBreakMod.WORD_BREAK.KEEP_ALL & String = js.native
    
    @js.native
    sealed trait NORMAL
      extends StObject
         with WORD_BREAK
    /* "normal" */ val NORMAL: typings.html2canvas.distTypesCssPropertyDescriptorsWordBreakMod.WORD_BREAK.NORMAL & String = js.native
  }
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/word-break", "wordBreak")
  @js.native
  val wordBreak: IPropertyIdentValueDescriptor[WORD_BREAK] = js.native
}
