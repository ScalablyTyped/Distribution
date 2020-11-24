package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An issue detected occurring during a test execution.
  */
@js.native
trait SchemaTestIssue extends js.Object {
  
  /**
    * Category of issue. Required.
    */
  var category: js.UndefOr[String] = js.native
  
  /**
    * A brief human-readable message describing the issue. Required.
    */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * Severity of issue. Required.
    */
  var severity: js.UndefOr[String] = js.native
  
  /**
    * Deprecated in favor of stack trace fields inside specific warnings.
    */
  var stackTrace: js.UndefOr[SchemaStackTrace] = js.native
  
  /**
    * Type of issue. Required.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Warning message with additional details of the issue. Should always be a
    * message from com.google.devtools.toolresults.v1.warnings
    */
  var warning: js.UndefOr[SchemaAny] = js.native
}
object SchemaTestIssue {
  
  @scala.inline
  def apply(): SchemaTestIssue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestIssue]
  }
  
  @scala.inline
  implicit class SchemaTestIssueOps[Self <: SchemaTestIssue] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverity: Self = this.set("severity", js.undefined)
    
    @scala.inline
    def setStackTrace(value: SchemaStackTrace): Self = this.set("stackTrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackTrace: Self = this.set("stackTrace", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWarning(value: SchemaAny): Self = this.set("warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarning: Self = this.set("warning", js.undefined)
  }
}
