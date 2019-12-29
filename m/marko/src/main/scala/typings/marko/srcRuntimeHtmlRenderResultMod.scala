package typings.marko

import typings.marko.markoBooleans.`false`
import typings.marko.srcComponentsComponentMod.Component
import typings.marko.srcRuntimeDomElementMod.DomElement
import typings.std.Document
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/runtime/html/RenderResult", JSImport.Namespace)
@js.native
object srcRuntimeHtmlRenderResultMod extends js.Object {
  @js.native
  trait RenderResult extends DomElement {
    var document: Document | `false` = js.native
    def apply(out: js.Any): this.type = js.native
    def afterInsert(doc: Document): this.type = js.native
    def getComponent(): Component = js.native
    def getComponents(): js.Array[Component] = js.native
    def getComponents(selector: js.Any): js.Array[Component] = js.native
    def getNode(doc: Document): Node = js.native
    def getOutput(): js.Any = js.native
  }
  
}

