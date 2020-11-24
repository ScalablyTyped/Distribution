package typings.markerAnimateUnobtrusive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class MarkerWithGhost ()
    extends typings.markerAnimateUnobtrusive.MarkerWithGhost
  
  @js.native
  class SlidingMarker ()
    extends typings.markerAnimateUnobtrusive.SlidingMarker {
    def this(opts: SlidingMarkerOptions) = this()
  }
  /* static members */
  @js.native
  object SlidingMarker extends js.Object {
    
    def initializeGlobally(): Unit = js.native
  }
}
