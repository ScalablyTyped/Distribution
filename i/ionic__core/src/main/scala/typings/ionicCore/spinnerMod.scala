package typings.ionicCore

import typings.ionicCore.mod.Color
import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinnerMod {
  
  @JSImport("@ionic/core/dist/types/components/spinner/spinner", "Spinner")
  @js.native
  class Spinner ()
    extends StObject
       with ComponentInterface {
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    /**
      * Duration of the spinner animation in milliseconds. The default varies based on the spinner.
      */
    var duration: js.UndefOr[Double] = js.native
    
    /* private */ var getName: js.Any = js.native
    
    /**
      * The name of the SVG spinner to use. If a name is not provided, the platform's default
      * spinner will be used.
      */
    var name: js.UndefOr[SpinnerTypes] = js.native
    
    /**
      * If `true`, the spinner's animation will be paused.
      */
    var paused: Boolean = js.native
    
    @JSName("render")
    def render_MSpinner(): js.Any = js.native
  }
}
