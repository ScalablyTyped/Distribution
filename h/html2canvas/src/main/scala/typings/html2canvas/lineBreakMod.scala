package typings.html2canvas

import typings.html2canvas.ipropertydescriptorMod.IPropertyIdentValueDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineBreakMod {
  
  @js.native
  sealed trait LINE_BREAK extends StObject
  @JSImport("html2canvas/dist/types/css/property-descriptors/line-break", "LINE_BREAK")
  @js.native
  object LINE_BREAK extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LINE_BREAK & String] = js.native
    
    @js.native
    sealed trait NORMAL
      extends StObject
         with LINE_BREAK
    /* "normal" */ val NORMAL: typings.html2canvas.lineBreakMod.LINE_BREAK.NORMAL & String = js.native
    
    @js.native
    sealed trait STRICT
      extends StObject
         with LINE_BREAK
    /* "strict" */ val STRICT: typings.html2canvas.lineBreakMod.LINE_BREAK.STRICT & String = js.native
  }
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/line-break", "lineBreak")
  @js.native
  val lineBreak: IPropertyIdentValueDescriptor[LINE_BREAK] = js.native
}
