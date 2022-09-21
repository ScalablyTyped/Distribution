package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks extends StObject {
  
  /**
    * Mutable user specified security marks belonging to the parent resource. Constraints are as follows: * Keys and values are treated as case insensitive * Keys must be between 1 - 256 characters (inclusive) * Keys must be letters, numbers, underscores, or dashes * Values have leading and trailing whitespace trimmed, remaining characters must be between 1 - 4096 characters (inclusive)
    */
  var marks: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The relative resource name of the SecurityMarks. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Examples: "organizations/{organization_id\}/assets/{asset_id\}/securityMarks" "organizations/{organization_id\}/sources/{source_id\}/findings/{finding_id\}/securityMarks".
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks {
  
  inline def apply(): SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks]
  }
  
  extension [Self <: SchemaGoogleCloudSecuritycenterV1beta1SecurityMarks](x: Self) {
    
    inline def setMarks(value: StringDictionary[String]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    
    inline def setMarksNull: Self = StObject.set(x, "marks", null)
    
    inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
