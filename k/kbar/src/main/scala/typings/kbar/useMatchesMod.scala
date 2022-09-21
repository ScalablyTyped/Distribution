package typings.kbar

import typings.kbar.anon.Results
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMatchesMod {
  
  @JSImport("kbar/lib/useMatches", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object NO_GROUP {
    
    @JSImport("kbar/lib/useMatches", "NO_GROUP")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("kbar/lib/useMatches", "NO_GROUP.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("kbar/lib/useMatches", "NO_GROUP.priority")
    @js.native
    def priority: Double = js.native
    inline def priority_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("priority")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("kbar/lib/useMatches", "useDeepMatches")
  @js.native
  val useDeepMatches: js.Function0[Results] = js.native
  
  inline def useMatches(): Results = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatches")().asInstanceOf[Results]
}
