package typings.ionicCore

import typings.ionicCore.elementInterfaceMod.AnchorInterface
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.ionicCore.tabBarInterfaceMod.TabBarChangedEventDetail
import typings.ionicCore.tabBarInterfaceMod.TabButtonClickEventDetail
import typings.ionicCore.tabBarInterfaceMod.TabButtonLayout
import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabButtonMod {
  
  @JSImport("@ionic/core/dist/types/components/tab-button/tab-button", "TabButton")
  @js.native
  class TabButton ()
    extends StObject
       with ComponentInterface
       with AnchorInterface {
    
    @JSName("componentWillLoad")
    def componentWillLoad_MTabButton(): Unit = js.native
    
    /**
      * If `true`, the user cannot interact with the tab button.
      */
    var disabled: Boolean = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ def hasIcon: js.Any = js.native
    
    /* private */ def hasLabel: js.Any = js.native
    
    /**
      * Emitted when the tab bar is clicked
      * @internal
      */
    var ionTabButtonClick: EventEmitter[TabButtonClickEventDetail] = js.native
    
    /**
      * Set the layout of the text and icon in the tab bar.
      * It defaults to `'icon-top'`.
      */
    var layout: js.UndefOr[TabButtonLayout] = js.native
    
    /* private */ var onClick: js.Any = js.native
    
    /* private */ var onKeyUp: js.Any = js.native
    
    def onTabBarChanged(ev: CustomEvent[TabBarChangedEventDetail]): Unit = js.native
    
    @JSName("render")
    def render_MTabButton(): js.Any = js.native
    
    /* private */ var selectTab: js.Any = js.native
    
    /**
      * The selected tab component
      */
    var selected: Boolean = js.native
    
    /**
      * A tab id must be provided for each `ion-tab`. It's used internally to reference
      * the selected tab or by the router to switch between them.
      */
    var tab: js.UndefOr[String] = js.native
    
    /* private */ def tabIndex: js.Any = js.native
  }
}
