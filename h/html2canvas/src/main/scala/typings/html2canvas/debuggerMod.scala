package typings.html2canvas

import typings.html2canvas.html2canvasInts.`0`
import typings.html2canvas.html2canvasInts.`1`
import typings.html2canvas.html2canvasInts.`2`
import typings.html2canvas.html2canvasInts.`3`
import typings.html2canvas.html2canvasInts.`4`
import typings.std.Element
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debuggerMod {
  
  @JSImport("html2canvas/dist/types/core/debugger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDebugging_0(element: Element, `type`: Omit[DebuggerType, `0`]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDebugging")(element.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.html2canvas.html2canvasInts.`0`
    - typings.html2canvas.html2canvasInts.`1`
    - typings.html2canvas.html2canvasInts.`2`
    - typings.html2canvas.html2canvasInts.`3`
    - typings.html2canvas.html2canvasInts.`4`
  */
  trait DebuggerType extends StObject
  object DebuggerType {
    
    inline def ALL: `1` = 1.asInstanceOf[`1`]
    
    inline def CLONE: `2` = 2.asInstanceOf[`2`]
    
    inline def NONE: `0` = 0.asInstanceOf[`0`]
    
    inline def PARSE: `3` = 3.asInstanceOf[`3`]
    
    inline def RENDER: `4` = 4.asInstanceOf[`4`]
  }
}
