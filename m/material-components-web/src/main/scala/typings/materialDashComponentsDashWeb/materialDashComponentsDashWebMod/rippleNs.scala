package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialRipple.Anon_IsUnbounded
import typings.atMaterialRipple.Anon_Passive
import typings.atMaterialRipple.Anon_X
import typings.atMaterialRipple.adapterMod.MDCRippleAdapter
import typings.std.ClientRect
import typings.std.Element
import typings.std.Event
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "ripple")
@js.native
object rippleNs extends js.Object {
  @js.native
  class MDCRipple ()
    extends typings.atMaterialRipple.atMaterialRippleMod.MDCRipple
  
  @js.native
  class MDCRippleFoundation ()
    extends typings.atMaterialRipple.atMaterialRippleMod.MDCRippleFoundation
  
  @js.native
  class RippleCapableSurface ()
    extends typings.atMaterialRipple.atMaterialRippleMod.RippleCapableSurface
  
  /* static members */
  @js.native
  object MDCRipple extends js.Object {
    def attachTo(root: Element): typings.atMaterialRipple.atMaterialRippleMod.MDCRipple = js.native
    def attachTo(root: Element, options: Anon_IsUnbounded): typings.atMaterialRipple.atMaterialRippleMod.MDCRipple = js.native
    def createAdapter(instance: typings.atMaterialRipple.atMaterialRippleMod.RippleCapableSurface): MDCRippleAdapter = js.native
  }
  
  /* static members */
  @js.native
  object MDCRippleFoundation extends js.Object {
    val cssClasses: typings.atMaterialRipple.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCRippleAdapter = js.native
    val numbers: typings.atMaterialRipple.constantsMod.numbers = js.native
    val strings: typings.atMaterialRipple.constantsMod.strings = js.native
  }
  
  @JSName("util")
  @js.native
  object utilNs extends js.Object {
    def applyPassive(): Boolean | Anon_Passive = js.native
    def applyPassive(globalObj: Window): Boolean | Anon_Passive = js.native
    def applyPassive(globalObj: Window, forceRefresh: Boolean): Boolean | Anon_Passive = js.native
    def getMatchesProperty(HTMLElementPrototype: js.Object): js.Array[String] = js.native
    def getNormalizedEventCoords(ev: Event, pageOffset: Anon_X, clientRect: ClientRect): Anon_X = js.native
    def supportsCssVariables(windowObj: Window): js.UndefOr[Boolean] = js.native
    def supportsCssVariables(windowObj: Window, forceRefresh: Boolean): js.UndefOr[Boolean] = js.native
  }
  
}

