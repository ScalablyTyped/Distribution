package typings.ionicCore.componentsMod.Components

import typings.ionicCore.componentsMod.global.HTMLIonTabElement
import typings.ionicCore.interfaceMod.RouteID
import typings.ionicCore.interfaceMod.RouteWrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonTabs extends StObject {
  
  def getRouteId(): js.Promise[js.UndefOr[RouteID]] = js.native
  
  /**
    * Get the currently selected tab.
    */
  def getSelected(): js.Promise[js.UndefOr[String]] = js.native
  
  /**
    * Get a specific tab by the value of its `tab` property or an element reference.
    * @param tab The tab instance to select. If passed a string, it should be the value of the tab's `tab` property.
    */
  def getTab(tab: String): js.Promise[js.UndefOr[HTMLIonTabElement]] = js.native
  def getTab(tab: HTMLIonTabElement): js.Promise[js.UndefOr[HTMLIonTabElement]] = js.native
  
  /**
    * Select a tab by the value of its `tab` property or an element reference.
    * @param tab The tab instance to select. If passed a string, it should be the value of the tab's `tab` property.
    */
  def select(tab: String): js.Promise[Boolean] = js.native
  def select(tab: HTMLIonTabElement): js.Promise[Boolean] = js.native
  
  def setRouteId(id: String): js.Promise[RouteWrite] = js.native
  
  var useRouter: Boolean = js.native
}
