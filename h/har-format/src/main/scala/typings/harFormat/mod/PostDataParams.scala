package typings.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostDataParams extends StObject {
  
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
  implicit class PostDataParamsMutableBuilder[Self <: PostDataParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParams(value: js.Array[Param]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: Param*): Self = StObject.set(x, "params", js.Array(value :_*))
  }
}
