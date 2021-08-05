package typings.materialBase

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/base", "MDCComponent")
  @js.native
  class MDCComponent[FoundationType /* <: typings.materialBase.foundationMod.MDCFoundation[js.Object] */] protected ()
    extends typings.materialBase.componentMod.MDCComponent[FoundationType] {
    def this(root: Element, foundation: FoundationType, args: js.Any*) = this()
    def this(root: Element, foundation: Unit, args: js.Any*) = this()
  }
  /* static members */
  object MDCComponent {
    
    @JSImport("@material/base", "MDCComponent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: Element): typings.materialBase.componentMod.MDCComponent[typings.materialBase.foundationMod.MDCFoundation[js.Object]] = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typings.materialBase.componentMod.MDCComponent[typings.materialBase.foundationMod.MDCFoundation[js.Object]]]
  }
  
  @JSImport("@material/base", "MDCFoundation")
  @js.native
  class MDCFoundation[AdapterType /* <: js.Object */] ()
    extends typings.materialBase.foundationMod.MDCFoundation[AdapterType] {
    def this(adapter: AdapterType) = this()
  }
}
