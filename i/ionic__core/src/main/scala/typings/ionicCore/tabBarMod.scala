package typings.ionicCore

import typings.ionicCore.mod.Color
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.ionicCore.tabBarInterfaceMod.TabBarChangedEventDetail
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabBarMod {
  
  @JSImport("@ionic/core/dist/types/components/tab-bar/tab-bar", "TabBar")
  @js.native
  class TabBar ()
    extends StObject
       with ComponentInterface {
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MTabBar(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /** @internal */
    var ionTabBarChanged: EventEmitter[TabBarChangedEventDetail] = js.native
    
    var keyboardVisible: Boolean = js.native
    
    /* protected */ def onKeyboardWillHide(): Unit = js.native
    
    /* protected */ def onKeyboardWillShow(): Unit = js.native
    
    @JSName("render")
    def render_MTabBar(): js.Any = js.native
    
    /**
      * The selected tab component
      */
    var selectedTab: js.UndefOr[String] = js.native
    
    def selectedTabChanged(): Unit = js.native
    
    /**
      * If `true`, the tab bar will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      */
    var translucent: Boolean = js.native
  }
}
