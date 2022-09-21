package typings.materialComponentsWeb.mod

import typings.materialBase.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object base {
  
  @JSImport("material-components-web", "base.MDCComponent")
  @js.native
  open class MDCComponent[FoundationType /* <: typings.materialBase.foundationMod.MDCFoundation[js.Object] */] protected ()
    extends typings.materialBase.mod.MDCComponent[FoundationType] {
    def this(root: Element, foundation: FoundationType, args: Any*) = this()
    def this(root: Element, foundation: Unit, args: Any*) = this()
  }
  /* static members */
  object MDCComponent {
    
    @JSImport("material-components-web", "base.MDCComponent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): typings.materialBase.componentMod.MDCComponent[typings.materialBase.foundationMod.MDCFoundation[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialBase.componentMod.MDCComponent[typings.materialBase.foundationMod.MDCFoundation[js.Object]]]
  }
  
  @JSImport("material-components-web", "base.MDCFoundation")
  @js.native
  open class MDCFoundation[AdapterType /* <: js.Object */] ()
    extends typings.materialBase.mod.MDCFoundation[AdapterType] {
    def this(adapter: AdapterType) = this()
  }
}
