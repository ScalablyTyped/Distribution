package typings.html2canvas

import typings.html2canvas.html2canvasStrings.`break-word`
import typings.html2canvas.html2canvasStrings.normal
import typings.html2canvas.ipropertydescriptorMod.IPropertyIdentValueDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overflowWrapMod {
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/overflow-wrap", "overflowWrap")
  @js.native
  val overflowWrap: IPropertyIdentValueDescriptor[OVERFLOW_WRAP] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.html2canvasStrings.normal
    - typings.html2canvas.html2canvasStrings.`break-word`
  */
  trait OVERFLOW_WRAP extends StObject
  object OVERFLOW_WRAP {
    
    inline def BREAK_WORD: `break-word` = "break-word".asInstanceOf[`break-word`]
    
    inline def NORMAL: normal = "normal".asInstanceOf[normal]
  }
}
