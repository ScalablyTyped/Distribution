package typings.grumblerScripts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grumbler-scripts/config/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  
  @js.native
  sealed trait ENV extends js.Object
  @js.native
  object ENV extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ENV with String] = js.native
    
    @js.native
    sealed trait DEMO extends ENV
    /* "demo" */ @js.native
    object DEMO extends TopLevel[DEMO with String]
    
    @js.native
    sealed trait LOCAL extends ENV
    /* "local" */ @js.native
    object LOCAL extends TopLevel[LOCAL with String]
    
    @js.native
    sealed trait PRODUCTION extends ENV
    /* "production" */ @js.native
    object PRODUCTION extends TopLevel[PRODUCTION with String]
    
    @js.native
    sealed trait SANDBOX extends ENV
    /* "sandbox" */ @js.native
    object SANDBOX extends TopLevel[SANDBOX with String]
    
    @js.native
    sealed trait STAGE extends ENV
    /* "stage" */ @js.native
    object STAGE extends TopLevel[STAGE with String]
    
    @js.native
    sealed trait TEST extends ENV
    /* "test" */ @js.native
    object TEST extends TopLevel[TEST with String]
  }
}
