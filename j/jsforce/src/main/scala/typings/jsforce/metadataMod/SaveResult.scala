package typings.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveResult extends StObject {
  
  var fullName: String
  
  var success: Boolean
}
object SaveResult {
  
  @scala.inline
  def apply(fullName: String, success: Boolean): SaveResult = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResult]
  }
  
  @scala.inline
  implicit class SaveResultMutableBuilder[Self <: SaveResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
