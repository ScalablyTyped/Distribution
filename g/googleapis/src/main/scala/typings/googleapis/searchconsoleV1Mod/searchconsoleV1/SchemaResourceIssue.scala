package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a resource with issue.
  */
@js.native
trait SchemaResourceIssue extends js.Object {
  
  /**
    * Describes a blocked resource issue.
    */
  var blockedResource: js.UndefOr[SchemaBlockedResource] = js.native
}
object SchemaResourceIssue {
  
  @scala.inline
  def apply(): SchemaResourceIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceIssue]
  }
  
  @scala.inline
  implicit class SchemaResourceIssueOps[Self <: SchemaResourceIssue] (val x: Self) extends AnyVal {
    
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
    def setBlockedResource(value: SchemaBlockedResource): Self = this.set("blockedResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockedResource: Self = this.set("blockedResource", js.undefined)
  }
}
