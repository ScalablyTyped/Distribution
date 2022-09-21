package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailLoggingSourceLocation extends StObject {
  
  /**
    * Human-readable name of a function or method. For example, "google.cloud.retail.v2.UserEventService.ImportUserEvents".
    */
  var functionName: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailLoggingSourceLocation {
  
  inline def apply(): SchemaGoogleCloudRetailLoggingSourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailLoggingSourceLocation]
  }
  
  extension [Self <: SchemaGoogleCloudRetailLoggingSourceLocation](x: Self) {
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameNull: Self = StObject.set(x, "functionName", null)
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "functionName", js.undefined)
  }
}
