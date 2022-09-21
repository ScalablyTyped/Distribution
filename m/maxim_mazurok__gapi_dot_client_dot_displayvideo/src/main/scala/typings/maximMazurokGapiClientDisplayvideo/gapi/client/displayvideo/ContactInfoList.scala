package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactInfoList extends StObject {
  
  /** A list of ContactInfo objects defining Customer Match audience members. The size of members after splitting the contact_infos mustn't be greater than 500,000. */
  var contactInfos: js.UndefOr[js.Array[ContactInfo]] = js.undefined
}
object ContactInfoList {
  
  inline def apply(): ContactInfoList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactInfoList]
  }
  
  extension [Self <: ContactInfoList](x: Self) {
    
    inline def setContactInfos(value: js.Array[ContactInfo]): Self = StObject.set(x, "contactInfos", value.asInstanceOf[js.Any])
    
    inline def setContactInfosUndefined: Self = StObject.set(x, "contactInfos", js.undefined)
    
    inline def setContactInfosVarargs(value: ContactInfo*): Self = StObject.set(x, "contactInfos", js.Array(value*))
  }
}
