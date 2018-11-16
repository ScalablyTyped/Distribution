package typings
package materialDashComponentsDashWebLib.materialDashComponentsDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-components-web", "lineRipple")
@js.native
object lineRippleNs extends js.Object {
  @js.native
  class MDCLineRipple ()
    extends atMaterialLineDashRippleLib.lineDashRippleMod.MDCLineRipple
  
  @js.native
  class MDCLineRippleFoundation ()
    extends atMaterialLineDashRippleLib.lineDashRippleMod.MDCLineRippleFoundation
  
  @js.native
  object MDCLineRipple extends js.Object {
    def attachTo(root: stdLib.Element): atMaterialLineDashRippleLib.lineDashRippleMod.MDCLineRipple = js.native
  }
  
  @js.native
  object MDCLineRippleFoundation extends js.Object {
    val cssClasses: atMaterialLineDashRippleLib.constantsMod.cssClasses = js.native
    val defaultAdapter: atMaterialLineDashRippleLib.adapterMod.MDCLineRippleAdapter = js.native
  }
  
}

