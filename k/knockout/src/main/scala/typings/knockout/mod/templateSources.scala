package typings.knockout.mod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("knockout", "templateSources")
@js.native
object templateSources extends js.Object {
  
  @js.native
  class anonymousTemplate protected () extends domElement {
    def this(element: Node) = this()
  }
  
  @js.native
  class domElement protected () extends TemplateSource {
    def this(element: Node) = this()
    
    @JSName("nodes")
    def nodes_MdomElement(): Node = js.native
    @JSName("nodes")
    def nodes_MdomElement(valueToWrite: Node): Unit = js.native
  }
}
