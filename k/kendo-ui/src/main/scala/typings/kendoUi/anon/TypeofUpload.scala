package typings.kendoUi.anon

import typings.kendoUi.kendo.ui.Upload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofUpload extends StObject {
  
  /* static member */
  def extend(proto: js.Object): Upload = js.native
  
  /* static member */
  var fn: Upload = js.native
}
object TypeofUpload {
  
  @scala.inline
  def apply(extend: js.Object => Upload, fn: Upload): TypeofUpload = {
    val __obj = js.Dynamic.literal(extend = js.Any.fromFunction1(extend), fn = fn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofUpload]
  }
  
  @scala.inline
  implicit class TypeofUploadMutableBuilder[Self <: TypeofUpload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtend(value: js.Object => Upload): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFn(value: Upload): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
  }
}
