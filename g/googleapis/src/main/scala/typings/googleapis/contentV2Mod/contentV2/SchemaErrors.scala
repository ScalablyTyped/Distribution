package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of errors returned by a failed batch entry.
  */
@js.native
trait SchemaErrors extends StObject {
  
  /**
    * The HTTP status of the first error in errors.
    */
  var code: js.UndefOr[Double] = js.native
  
  /**
    * A list of errors.
    */
  var errors: js.UndefOr[js.Array[SchemaError]] = js.native
  
  /**
    * The message of the first error in errors.
    */
  var message: js.UndefOr[String] = js.native
}
object SchemaErrors {
  
  @scala.inline
  def apply(): SchemaErrors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrors]
  }
  
  @scala.inline
  implicit class SchemaErrorsMutableBuilder[Self <: SchemaErrors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setErrors(value: js.Array[SchemaError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: SchemaError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
