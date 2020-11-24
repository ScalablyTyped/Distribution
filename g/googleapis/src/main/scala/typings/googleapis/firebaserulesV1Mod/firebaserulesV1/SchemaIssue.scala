package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Issues include warnings, errors, and deprecation notices.
  */
@js.native
trait SchemaIssue extends js.Object {
  
  /**
    * Short error description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The severity of the issue.
    */
  var severity: js.UndefOr[String] = js.native
  
  /**
    * Position of the issue in the `Source`.
    */
  var sourcePosition: js.UndefOr[SchemaSourcePosition] = js.native
}
object SchemaIssue {
  
  @scala.inline
  def apply(): SchemaIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIssue]
  }
  
  @scala.inline
  implicit class SchemaIssueOps[Self <: SchemaIssue] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setSourcePosition(value: SchemaSourcePosition): Self = this.set("sourcePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcePosition: Self = this.set("sourcePosition", js.undefined)
  }
}
