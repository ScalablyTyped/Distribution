package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "drawer")
@js.native
object drawerNs extends js.Object {
  @js.native
  class MDCPersistentDrawer ()
    extends atMaterialDrawerLib.drawerMod.MDCPersistentDrawer
  
  @js.native
  class MDCPersistentDrawerFoundation ()
    extends atMaterialDrawerLib.drawerMod.MDCPersistentDrawerFoundation
  
  @js.native
  class MDCTemporaryDrawer ()
    extends atMaterialDrawerLib.drawerMod.MDCTemporaryDrawer
  
  @js.native
  class MDCTemporaryDrawerFoundation ()
    extends atMaterialDrawerLib.drawerMod.MDCTemporaryDrawerFoundation
  
  @js.native
  object MDCPersistentDrawer extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialDrawerLib.persistentMod.MDCPersistentDrawer = js.native
  }
  
  @js.native
  object MDCPersistentDrawerFoundation extends js.Object {
    val cssClasses: atMaterialDrawerLib.persistentConstantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialDrawerLib.slidableAdapterMod.MDCSlidableDrawerAdapter = js.native
    val strings: atMaterialDrawerLib.persistentConstantsMod.strings = js.native
  }
  
  @js.native
  object MDCTemporaryDrawer extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialDrawerLib.temporaryMod.MDCTemporaryDrawer = js.native
  }
  
  @js.native
  object MDCTemporaryDrawerFoundation extends js.Object {
    val cssClasses: atMaterialDrawerLib.temporaryConstantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialDrawerLib.slidableAdapterMod.MDCSlidableDrawerAdapter = js.native
    val strings: atMaterialDrawerLib.temporaryConstantsMod.strings = js.native
  }
  
  @JSName("util")
  @js.native
  object utilNs extends js.Object {
    def applyPassive(): scala.Boolean | atMaterialDrawerLib.Anon_Passive = js.native
    def applyPassive(globalObj: stdLib.Window): scala.Boolean | atMaterialDrawerLib.Anon_Passive = js.native
    def applyPassive(globalObj: stdLib.Window, forceRefresh: scala.Boolean): scala.Boolean | atMaterialDrawerLib.Anon_Passive = js.native
    def getTransformPropertyName(): java.lang.String = js.native
    def getTransformPropertyName(globalObj: stdLib.Window): java.lang.String = js.native
    def getTransformPropertyName(globalObj: stdLib.Window, forceRefresh: scala.Boolean): java.lang.String = js.native
    def remapEvent(eventName: java.lang.String): java.lang.String = js.native
    def remapEvent(eventName: java.lang.String, globalObj: stdLib.Window): java.lang.String = js.native
    def restoreElementTabState(el: stdLib.Element): scala.Unit = js.native
    def saveElementTabState(el: stdLib.Element): scala.Unit = js.native
    def supportsCssCustomProperties(): scala.Boolean = js.native
    def supportsCssCustomProperties(globalObj: stdLib.Window): scala.Boolean = js.native
  }
  
}

