package typings.knockout.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateSources {
  
  @JSImport("knockout", "templateSources.anonymousTemplate")
  @js.native
  open class anonymousTemplate protected () extends domElement {
    def this(element: Node) = this()
  }
  
  @JSImport("knockout", "templateSources.domElement")
  @js.native
  open class domElement protected ()
    extends StObject
       with TemplateSource {
    def this(element: Node) = this()
    
    @JSName("nodes")
    def nodes_MdomElement(): Node = js.native
    @JSName("nodes")
    def nodes_MdomElement(valueToWrite: Node): Unit = js.native
  }
}
