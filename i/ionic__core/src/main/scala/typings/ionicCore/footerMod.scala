package typings.ionicCore

import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object footerMod {
  
  @JSImport("@ionic/core/dist/types/components/footer/footer", "Footer")
  @js.native
  class Footer ()
    extends StObject
       with ComponentInterface {
    
    @JSName("render")
    def render_MFooter(): js.Any = js.native
    
    /**
      * If `true`, the footer will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      *
      * Note: In order to scroll content behind the footer, the `fullscreen`
      * attribute needs to be set on the content.
      */
    var translucent: Boolean = js.native
  }
}
