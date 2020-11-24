package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StringDictionary
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
trait SchemaSecurityMarks extends js.Object {
  
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
  implicit class SchemaSecurityMarksOps[Self <: SchemaSecurityMarks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMarks(value: StringDictionary[String]): Self = this.set("marks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarks: Self = this.set("marks", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
