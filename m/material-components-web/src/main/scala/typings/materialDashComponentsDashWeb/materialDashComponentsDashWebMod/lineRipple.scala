package typings.materialDashComponentsDashWeb.materialDashComponentsDashWebMod

import typings.atMaterialLineDashRipple.adapterMod.MDCLineRippleAdapter
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "lineRipple")
@js.native
object lineRipple extends js.Object {
  @js.native
  class MDCLineRipple ()
    extends typings.atMaterialLineDashRipple.atMaterialLineDashRippleMod.MDCLineRipple
  
  @js.native
  class MDCLineRippleFoundation ()
    extends typings.atMaterialLineDashRipple.atMaterialLineDashRippleMod.MDCLineRippleFoundation
  
  /* static members */
  @js.native
  object MDCLineRipple extends js.Object {
    def attachTo(root: Element): typings.atMaterialLineDashRipple.atMaterialLineDashRippleMod.MDCLineRipple = js.native
  }
  
  /* static members */
  @js.native
  object MDCLineRippleFoundation extends js.Object {
    val cssClasses: typings.atMaterialLineDashRipple.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCLineRippleAdapter = js.native
  }
  
}

