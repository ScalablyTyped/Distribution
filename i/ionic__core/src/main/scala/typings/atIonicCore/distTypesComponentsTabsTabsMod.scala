package typings.atIonicCore

import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonTabElement
import typings.atIonicCore.distTypesComponentsMod._Global_.HTMLIonTabsElement
import typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.NavOutlet
import typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouteWrite
import typings.atIonicCore.distTypesStencilDotCoreMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/tabs/tabs", JSImport.Namespace)
@js.native
object distTypesComponentsTabsTabsMod extends js.Object {
  @js.native
  class Tabs () extends NavOutlet {
    var el: HTMLIonTabsElement = js.native
    /**
      * Emitted when the navigation will load a component.
      * @internal
      */
    var ionNavWillLoad: EventEmitter[Unit] = js.native
    /**
      * Emitted when the navigation has finished transitioning to a new component.
      */
    var ionTabsDidChange: EventEmitter[Anon_Tab] = js.native
    /**
      * Emitted when the navigation is about to transition to a new component.
      */
    var ionTabsWillChange: EventEmitter[Anon_Tab] = js.native
    var leavingTab: js.UndefOr[js.Any] = js.native
    var notifyRouter: js.Any = js.native
    var onTabClicked: js.Any = js.native
    var selectedTab: js.UndefOr[HTMLIonTabElement] = js.native
    var setActive: js.Any = js.native
    var shouldSwitch: js.Any = js.native
    var tabSwitch: js.Any = js.native
    val tabs: js.Any = js.native
    var transitioning: js.Any = js.native
    /** @internal */
    var useRouter: Boolean = js.native
    def componentWillLoad(): js.Promise[Unit] = js.native
    def componentWillRender(): Unit = js.native
    /**
      * Get the currently selected tab.
      */
    def getSelected(): js.Promise[js.UndefOr[String]] = js.native
    /**
      * Get a specific tab by the value of its `tab` property or an element reference.
      *
      * @param tab The tab instance to select. If passed a string, it should be the value of the tab's `tab` property.
      */
    def getTab(tab: String): js.Promise[js.UndefOr[HTMLIonTabElement]] = js.native
    def getTab(tab: HTMLIonTabElement): js.Promise[js.UndefOr[HTMLIonTabElement]] = js.native
    def render(): js.Any = js.native
    /**
      * Select a tab by the value of its `tab` property or an element reference.
      *
      * @param tab The tab instance to select. If passed a string, it should be the value of the tab's `tab` property.
      */
    def select(tab: String): js.Promise[Boolean] = js.native
    def select(tab: HTMLIonTabElement): js.Promise[Boolean] = js.native
    /** @internal */
    def setRouteId(id: String): js.Promise[RouteWrite] = js.native
  }
  
}

