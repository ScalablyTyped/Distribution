package typings.materialToolbar

import typings.materialBase.componentMod.MDCComponent
import typings.materialToolbar.foundationMod.MDCToolbarFoundation
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/toolbar/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCToolbar () extends MDCComponent[MDCToolbarFoundation] {
    
    var fixedAdjustElement: HTMLElement | Null = js.native
    
    def initialize(): Unit = js.native
    
    var root_ : HTMLElement = js.native
  }
  /* static members */
  @js.native
  object MDCToolbar extends js.Object {
    
    def attachTo(root: Element): MDCToolbar = js.native
  }
}
