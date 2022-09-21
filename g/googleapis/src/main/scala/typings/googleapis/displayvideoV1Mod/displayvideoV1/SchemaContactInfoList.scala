package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContactInfoList extends StObject {
  
  /**
    * A list of ContactInfo objects defining Customer Match audience members. The size of members after splitting the contact_infos mustn't be greater than 500,000.
    */
  var contactInfos: js.UndefOr[js.Array[SchemaContactInfo]] = js.undefined
}
object SchemaContactInfoList {
  
  inline def apply(): SchemaContactInfoList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactInfoList]
  }
  
  extension [Self <: SchemaContactInfoList](x: Self) {
    
    inline def setContactInfos(value: js.Array[SchemaContactInfo]): Self = StObject.set(x, "contactInfos", value.asInstanceOf[js.Any])
    
    inline def setContactInfosUndefined: Self = StObject.set(x, "contactInfos", js.undefined)
    
    inline def setContactInfosVarargs(value: SchemaContactInfo*): Self = StObject.set(x, "contactInfos", js.Array(value*))
  }
}
