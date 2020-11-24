package typings.jsgraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraversalContext extends js.Object {
  
  var colorMap: js.Any = js.native
  
  var searchStatus: String = js.native
  
  var undiscoveredMap: js.Any = js.native
}
object TraversalContext {
  
  @scala.inline
  def apply(colorMap: js.Any, searchStatus: String, undiscoveredMap: js.Any): TraversalContext = {
    val __obj = js.Dynamic.literal(colorMap = colorMap.asInstanceOf[js.Any], searchStatus = searchStatus.asInstanceOf[js.Any], undiscoveredMap = undiscoveredMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraversalContext]
  }
  
  @scala.inline
  implicit class TraversalContextOps[Self <: TraversalContext] (val x: Self) extends AnyVal {
    
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
    def setColorMap(value: js.Any): Self = this.set("colorMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchStatus(value: String): Self = this.set("searchStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndiscoveredMap(value: js.Any): Self = this.set("undiscoveredMap", value.asInstanceOf[js.Any])
  }
}
