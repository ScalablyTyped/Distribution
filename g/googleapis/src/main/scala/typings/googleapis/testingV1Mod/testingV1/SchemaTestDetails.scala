package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Additional details about the progress of the running test.
  */
trait SchemaTestDetails extends StObject {
  
  /**
    * Output only. If the TestState is ERROR, then this string will contain
    * human-readable details about the error.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. Human-readable, detailed descriptions of the test&#39;s
    * progress. For example: &quot;Provisioning a device&quot;, &quot;Starting
    * Test&quot;.  During the course of execution new data may be appended to
    * the end of progress_messages.
    */
  var progressMessages: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaTestDetails {
  
  @scala.inline
  def apply(): SchemaTestDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestDetails]
  }
  
  @scala.inline
  implicit class SchemaTestDetailsMutableBuilder[Self <: SchemaTestDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setProgressMessages(value: js.Array[String]): Self = StObject.set(x, "progressMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressMessagesUndefined: Self = StObject.set(x, "progressMessages", js.undefined)
    
    @scala.inline
    def setProgressMessagesVarargs(value: String*): Self = StObject.set(x, "progressMessages", js.Array(value :_*))
  }
}
