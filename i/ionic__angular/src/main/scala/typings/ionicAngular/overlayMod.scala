package typings.ionicAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayMod {
  
  @JSImport("@ionic/angular/util/overlay", "OverlayBaseController")
  @js.native
  class OverlayBaseController[Opts, Overlay] protected ()
    extends StObject
       with ControllerShape[Opts, Overlay] {
    def this(ctrl: ControllerShape[Opts, Overlay]) = this()
    
    /**
      * Creates a new overlay
      */
    def create(): js.Promise[Overlay] = js.native
    
    var ctrl: js.Any = js.native
  }
  
  @js.native
  trait ControllerShape[Opts, HTMLElm] extends StObject {
    
    def create(options: Opts): js.Promise[HTMLElm] = js.native
    
    def dismiss(): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: String, id: String): js.Promise[Boolean] = js.native
    def dismiss(data: js.Any, role: Unit, id: String): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: String): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: String, id: String): js.Promise[Boolean] = js.native
    def dismiss(data: Unit, role: Unit, id: String): js.Promise[Boolean] = js.native
    
    def getTop(): js.Promise[js.UndefOr[HTMLElm]] = js.native
  }
}
