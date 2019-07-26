package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonTabs extends js.Object {
  var useRouter: scala.Boolean = js.native
  def getRouteId(): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouteID */ _
    ]
  ] = js.native
  /**
    * Get the currently selected tab.
    */
  def getSelected(): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def getTab(tab: atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonTabElement): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonTabElement]] = js.native
  /**
    * Get a specific tab by the value of its `tab` property or an element reference.
    * @param tab The tab instance to select. If passed a string, it should be the value of the tab's `tab` property.
    */
  def getTab(tab: java.lang.String): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonTabElement]] = js.native
  def select(tab: atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonTabElement): js.Promise[scala.Boolean] = js.native
  /**
    * Select a tab by the value of its `tab` property or an element reference.
    * @param tab The tab instance to select. If passed a string, it should be the value of the tab's `tab` property.
    */
  def select(tab: java.lang.String): js.Promise[scala.Boolean] = js.native
  def setRouteId(id: java.lang.String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouteWrite */ _
  ] = js.native
}

