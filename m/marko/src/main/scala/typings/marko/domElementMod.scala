package typings.marko

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("marko/src/runtime/DomElement", JSImport.Namespace)
@js.native
object domElementMod extends js.Object {
  
  @js.native
  trait DomElement extends js.Object {
    
    def appendTo(referenceEl: String): this.type = js.native
    def appendTo(referenceEl: Node): this.type = js.native
    
    def insertAfter(referenceEl: String): this.type = js.native
    def insertAfter(referenceEl: Node): this.type = js.native
    
    def insertBefore(referenceEl: String): this.type = js.native
    def insertBefore(referenceEl: Node): this.type = js.native
    
    def prependTo(referenceEl: String): this.type = js.native
    def prependTo(referenceEl: Node): this.type = js.native
    
    def replace(referenceEl: String): this.type = js.native
    def replace(referenceEl: Node): this.type = js.native
    
    def replaceChildrenOf(referenceEl: String): this.type = js.native
    def replaceChildrenOf(referenceEl: Node): this.type = js.native
  }
}
