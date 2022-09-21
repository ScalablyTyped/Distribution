package typings.humblebeeStyledComponentsBreakpoint

import org.scalablytyped.runtime.StringDictionary
import typings.humblebeeStyledComponentsBreakpoint.anon.Down
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@humblebee/styled-components-breakpoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(breakpoints: Breakpoints): Down = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(breakpoints.asInstanceOf[js.Any]).asInstanceOf[Down]
  
  inline def getMedia(breakpoints: Breakpoints): Down = ^.asInstanceOf[js.Dynamic].applyDynamic("getMedia")(breakpoints.asInstanceOf[js.Any]).asInstanceOf[Down]
  
  type Breakpoints = StringDictionary[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.up
    - typings.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.down
    - typings.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.only
  */
  trait Rule extends StObject
  object Rule {
    
    inline def down: typings.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.down = "down".asInstanceOf[typings.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.down]
    
    inline def only: typings.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.only = "only".asInstanceOf[typings.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.only]
    
    inline def up: typings.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.up = "up".asInstanceOf[typings.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.up]
  }
}
