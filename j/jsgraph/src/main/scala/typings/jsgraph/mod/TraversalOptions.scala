package typings.jsgraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraversalOptions extends js.Object {
  
  var allowEmptyStartVector: Boolean = js.native
  
  var signalStart: Boolean = js.native
  
  var startVector: String | js.Array[String] = js.native
  
  var traverseContext: TraversalContext = js.native
}
object TraversalOptions {
  
  @scala.inline
  def apply(
    allowEmptyStartVector: Boolean,
    signalStart: Boolean,
    startVector: String | js.Array[String],
    traverseContext: TraversalContext
  ): TraversalOptions = {
    val __obj = js.Dynamic.literal(allowEmptyStartVector = allowEmptyStartVector.asInstanceOf[js.Any], signalStart = signalStart.asInstanceOf[js.Any], startVector = startVector.asInstanceOf[js.Any], traverseContext = traverseContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraversalOptions]
  }
  
  @scala.inline
  implicit class TraversalOptionsOps[Self <: TraversalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowEmptyStartVector(value: Boolean): Self = this.set("allowEmptyStartVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalStart(value: Boolean): Self = this.set("signalStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartVectorVarargs(value: String*): Self = this.set("startVector", js.Array(value :_*))
    
    @scala.inline
    def setStartVector(value: String | js.Array[String]): Self = this.set("startVector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraverseContext(value: TraversalContext): Self = this.set("traverseContext", value.asInstanceOf[js.Any])
  }
}
