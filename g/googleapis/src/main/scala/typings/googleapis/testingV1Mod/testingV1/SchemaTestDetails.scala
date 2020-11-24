package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional details about the progress of the running test.
  */
@js.native
trait SchemaTestDetails extends js.Object {
  
  /**
    * Output only. If the TestState is ERROR, then this string will contain
    * human-readable details about the error.
    */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * Output only. Human-readable, detailed descriptions of the test&#39;s
    * progress. For example: &quot;Provisioning a device&quot;, &quot;Starting
    * Test&quot;.  During the course of execution new data may be appended to
    * the end of progress_messages.
    */
  var progressMessages: js.UndefOr[js.Array[String]] = js.native
}
object SchemaTestDetails {
  
  @scala.inline
  def apply(): SchemaTestDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestDetails]
  }
  
  @scala.inline
  implicit class SchemaTestDetailsOps[Self <: SchemaTestDetails] (val x: Self) extends AnyVal {
    
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
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setProgressMessagesVarargs(value: String*): Self = this.set("progressMessages", js.Array(value :_*))
    
    @scala.inline
    def setProgressMessages(value: js.Array[String]): Self = this.set("progressMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressMessages: Self = this.set("progressMessages", js.undefined)
  }
}
