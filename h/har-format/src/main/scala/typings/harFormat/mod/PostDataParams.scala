package typings.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostDataParams extends js.Object {
  
  /**
    * List of posted parameters (in case of URL encoded parameters).
    */
  var params: js.Array[Param] = js.native
  
  /**
    * _`params` and `text` fields are mutually exclusive._
    */
  var text: js.UndefOr[scala.Nothing] = js.native
}
object PostDataParams {
  
  @scala.inline
  def apply(params: js.Array[Param]): PostDataParams = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostDataParams]
  }
  
  @scala.inline
  implicit class PostDataParamsOps[Self <: PostDataParams] (val x: Self) extends AnyVal {
    
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
    def setParamsVarargs(value: Param*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[Param]): Self = this.set("params", value.asInstanceOf[js.Any])
  }
}
