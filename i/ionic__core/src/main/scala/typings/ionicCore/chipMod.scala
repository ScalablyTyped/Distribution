package typings.ionicCore

import typings.ionicCore.mod.Color
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chipMod {
  
  @JSImport("@ionic/core/dist/types/components/chip/chip", "Chip")
  @js.native
  class Chip () extends ComponentInterface {
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    /**
      * If `true`, the user cannot interact with the chip.
      */
    var disabled: Boolean = js.native
    
    /**
      * Display an outline style button.
      */
    var outline: Boolean = js.native
    
    @JSName("render")
    def render_MChip(): js.Any = js.native
  }
}
