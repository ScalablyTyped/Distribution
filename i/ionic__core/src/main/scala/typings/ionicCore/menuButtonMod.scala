package typings.ionicCore

import typings.ionicCore.componentsMod.global.HTMLIonSegmentElement
import typings.ionicCore.elementInterfaceMod.ButtonInterface
import typings.ionicCore.mod.Color
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuButtonMod {
  
  @JSImport("@ionic/core/dist/types/components/menu-button/menu-button", "MenuButton")
  @js.native
  class MenuButton ()
    extends ComponentInterface
       with ButtonInterface {
    
    /**
      * Automatically hides the menu button when the corresponding menu is not active
      */
    var autoHide: Boolean = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MMenuButton(): Unit = js.native
    
    var el: HTMLIonSegmentElement = js.native
    
    /**
      * Optional property that maps to a Menu's `menuId` prop. Can also be `start` or `end` for the menu side. This is used to find the correct menu to toggle
      */
    var menu: js.UndefOr[String] = js.native
    
    var onClick: js.Any = js.native
    
    @JSName("render")
    def render_MMenuButton(): js.Any = js.native
    
    def visibilityChanged(): js.Promise[Unit] = js.native
    
    var visible: Boolean = js.native
  }
}
