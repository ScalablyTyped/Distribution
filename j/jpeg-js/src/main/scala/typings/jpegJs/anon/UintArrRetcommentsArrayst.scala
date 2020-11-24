package typings.jpegJs.anon

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jpeg-js.jpeg-js.UintArrRet & {  comments :std.Array<string> | undefined} */
@js.native
trait UintArrRetcommentsArrayst extends js.Object {
  
  var comments: js.UndefOr[js.Array[String]] = js.native
  
  var data: Uint8Array = js.native
  
  var height: Double = js.native
  
  var width: Double = js.native
}
object UintArrRetcommentsArrayst {
  
  @scala.inline
  def apply(data: Uint8Array, height: Double, width: Double): UintArrRetcommentsArrayst = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UintArrRetcommentsArrayst]
  }
  
  @scala.inline
  implicit class UintArrRetcommentsArraystOps[Self <: UintArrRetcommentsArrayst] (val x: Self) extends AnyVal {
    
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
    def setData(value: Uint8Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsVarargs(value: String*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[String]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
  }
}
