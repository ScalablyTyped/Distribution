package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User specified security marks that are attached to the parent Cloud
  * Security Command Center (Cloud SCC) resource. Security marks are scoped
  * within a Cloud SCC organization -- they can be modified and viewed by all
  * users who have proper permissions on the organization.
  */
@js.native
trait SchemaSecurityMarks extends StObject {
  
  /**
    * Mutable user specified security marks belonging to the parent resource.
    * Constraints are as follows:   - Keys and values are treated as case
    * insensitive   - Keys must be between 1 - 256 characters (inclusive)   -
    * Keys must be letters, numbers, underscores, or dashes   - Values have
    * leading and trailing whitespace trimmed, remaining     characters must be
    * between 1 - 4096 characters (inclusive)
    */
  var marks: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * The relative resource name of the SecurityMarks. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Examples: &quot;organizations/123/assets/456/securityMarks&quot;
    * &quot;organizations/123/sources/456/findings/789/securityMarks&quot;.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaSecurityMarks {
  
  @scala.inline
  def apply(): SchemaSecurityMarks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityMarks]
  }
  
  @scala.inline
  implicit class SchemaSecurityMarksMutableBuilder[Self <: SchemaSecurityMarks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarks(value: StringDictionary[String]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
