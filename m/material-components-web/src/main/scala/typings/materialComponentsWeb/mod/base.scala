package typings.materialComponentsWeb.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("material-components-web", "base")
@js.native
object base extends js.Object {
  
  @js.native
  class MDCComponent[FoundationType /* <: typings.materialBase.foundationMod.MDCFoundation[js.Object] */] protected ()
    extends typings.materialBase.mod.MDCComponent[FoundationType] {
    def this(root: Element, foundation: FoundationType, args: js.Any*) = this()
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
  }
  /* static members */
  @js.native
  object MDCComponent extends js.Object {
    
    def attachTo(root: Element): typings.materialBase.componentMod.MDCComponent[typings.materialBase.foundationMod.MDCFoundation[js.Object]] = js.native
  }
  
  @js.native
  class MDCFoundation[AdapterType /* <: js.Object */] ()
    extends typings.materialBase.mod.MDCFoundation[AdapterType] {
    def this(adapter: AdapterType) = this()
  }
  /* static members */
  @js.native
  object MDCFoundation extends js.Object {
    
    def cssClasses: StringDictionary[String] = js.native
    
    def defaultAdapter: js.Object = js.native
    
    def numbers: StringDictionary[Double] = js.native
    
    def strings: StringDictionary[String] = js.native
  }
}
