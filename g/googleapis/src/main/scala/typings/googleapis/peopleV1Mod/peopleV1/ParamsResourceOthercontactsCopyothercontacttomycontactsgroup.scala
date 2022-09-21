package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOthercontactsCopyothercontacttomycontactsgroup
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCopyOtherContactToMyContactsGroupRequest] = js.undefined
  
  /**
    * Required. The resource name of the "Other contact" to copy.
    */
  var resourceName: js.UndefOr[String] = js.undefined
}
object ParamsResourceOthercontactsCopyothercontacttomycontactsgroup {
  
  inline def apply(): ParamsResourceOthercontactsCopyothercontacttomycontactsgroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOthercontactsCopyothercontacttomycontactsgroup]
  }
  
  extension [Self <: ParamsResourceOthercontactsCopyothercontacttomycontactsgroup](x: Self) {
    
    inline def setRequestBody(value: SchemaCopyOtherContactToMyContactsGroupRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
  }
}
