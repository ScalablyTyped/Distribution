package typings.grommet

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object announceContextMod {
  
  @JSImport("grommet/contexts/AnnounceContext", "AnnounceContext")
  @js.native
  val AnnounceContext: Context[AnnounceValue] = js.native
  
  type AnnounceMessage = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.grommet.grommetStrings.off
    - typings.grommet.grommetStrings.polite
    - typings.grommet.grommetStrings.assertive
  */
  trait AnnounceMode extends StObject
  object AnnounceMode {
    
    inline def assertive: typings.grommet.grommetStrings.assertive = "assertive".asInstanceOf[typings.grommet.grommetStrings.assertive]
    
    inline def off: typings.grommet.grommetStrings.off = "off".asInstanceOf[typings.grommet.grommetStrings.off]
    
    inline def polite: typings.grommet.grommetStrings.polite = "polite".asInstanceOf[typings.grommet.grommetStrings.polite]
  }
  
  type AnnounceValue = js.Function3[/* message */ AnnounceMessage, /* mode */ AnnounceMode, /* timeout */ Timeout, Unit]
  
  type Timeout = Double
}
