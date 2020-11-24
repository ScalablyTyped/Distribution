package typings.jsondiffpatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectMove extends js.Object {
  
  // default true, detect items moved inside the array (otherwise they will be registered as remove+add)
  var detectMove: Boolean = js.native
  
  // default false, the value of items moved is not included in deltas
  var includeValueOnMove: Boolean = js.native
}
object DetectMove {
  
  @scala.inline
  def apply(detectMove: Boolean, includeValueOnMove: Boolean): DetectMove = {
    val __obj = js.Dynamic.literal(detectMove = detectMove.asInstanceOf[js.Any], includeValueOnMove = includeValueOnMove.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectMove]
  }
  
  @scala.inline
  implicit class DetectMoveOps[Self <: DetectMove] (val x: Self) extends AnyVal {
    
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
    def setDetectMove(value: Boolean): Self = this.set("detectMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeValueOnMove(value: Boolean): Self = this.set("includeValueOnMove", value.asInstanceOf[js.Any])
  }
}
