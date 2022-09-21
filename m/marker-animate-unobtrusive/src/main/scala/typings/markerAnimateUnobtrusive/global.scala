package typings.markerAnimateUnobtrusive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("MarkerWithGhost")
  @js.native
  open class MarkerWithGhost ()
    extends StObject
       with typings.markerAnimateUnobtrusive.MarkerWithGhost
  
  @JSGlobal("SlidingMarker")
  @js.native
  open class SlidingMarker ()
    extends StObject
       with typings.markerAnimateUnobtrusive.SlidingMarker {
    def this(opts: SlidingMarkerOptions) = this()
  }
  object SlidingMarker {
    
    @JSGlobal("SlidingMarker")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def initializeGlobally(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeGlobally")().asInstanceOf[Unit]
  }
}
