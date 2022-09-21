package typings.googleapis.securitycenterV1beta2Mod.securitycenterV1beta2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityMarks extends StObject {
  
  /**
    * The canonical name of the marks. Examples: "organizations/{organization_id\}/assets/{asset_id\}/securityMarks" "folders/{folder_id\}/assets/{asset_id\}/securityMarks" "projects/{project_number\}/assets/{asset_id\}/securityMarks" "organizations/{organization_id\}/sources/{source_id\}/findings/{finding_id\}/securityMarks" "folders/{folder_id\}/sources/{source_id\}/findings/{finding_id\}/securityMarks" "projects/{project_number\}/sources/{source_id\}/findings/{finding_id\}/securityMarks"
    */
  var canonicalName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mutable user specified security marks belonging to the parent resource. Constraints are as follows: * Keys and values are treated as case insensitive * Keys must be between 1 - 256 characters (inclusive) * Keys must be letters, numbers, underscores, or dashes * Values have leading and trailing whitespace trimmed, remaining characters must be between 1 - 4096 characters (inclusive)
    */
  var marks: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The relative resource name of the SecurityMarks. See: https://cloud.google.com/apis/design/resource_names#relative_resource_name Examples: "organizations/{organization_id\}/assets/{asset_id\}/securityMarks" "organizations/{organization_id\}/sources/{source_id\}/findings/{finding_id\}/securityMarks".
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecurityMarks {
  
  inline def apply(): SchemaSecurityMarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityMarks]
  }
  
  extension [Self <: SchemaSecurityMarks](x: Self) {
    
    inline def setCanonicalName(value: String): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
    
    inline def setCanonicalNameNull: Self = StObject.set(x, "canonicalName", null)
    
    inline def setCanonicalNameUndefined: Self = StObject.set(x, "canonicalName", js.undefined)
    
    inline def setMarks(value: StringDictionary[String]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    
    inline def setMarksNull: Self = StObject.set(x, "marks", null)
    
    inline def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
