package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePeopleUpdatecontactphoto
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdateContactPhotoRequest] = js.undefined
  
  /**
    * Required. Person resource name
    */
  var resourceName: js.UndefOr[String] = js.undefined
}
object ParamsResourcePeopleUpdatecontactphoto {
  
  inline def apply(): ParamsResourcePeopleUpdatecontactphoto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePeopleUpdatecontactphoto]
  }
  
  extension [Self <: ParamsResourcePeopleUpdatecontactphoto](x: Self) {
    
    inline def setRequestBody(value: SchemaUpdateContactPhotoRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
