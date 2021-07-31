package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Empty response.
  */
trait SchemaEmptyResponse extends StObject {
  
  /**
    * Apiary error details
    */
  var errors: js.UndefOr[SchemaErrors] = js.undefined
}
object SchemaEmptyResponse {
  
  @scala.inline
  def apply(): SchemaEmptyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmptyResponse]
  }
  
  @scala.inline
  implicit class SchemaEmptyResponseMutableBuilder[Self <: SchemaEmptyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: SchemaErrors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
  }
}
