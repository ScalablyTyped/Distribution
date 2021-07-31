package typings.maximMazurokGapiClientDeploymentmanager.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  /** [Output Only] The error type identifier for this error. */
  var code: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Indicates the field in the request that caused the error. This property is optional. */
  var location: js.UndefOr[String] = js.undefined
  
  /** [Output Only] An optional, human-readable error message. */
  var message: js.UndefOr[String] = js.undefined
}
object Code {
  
  @scala.inline
  def apply(): Code = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
