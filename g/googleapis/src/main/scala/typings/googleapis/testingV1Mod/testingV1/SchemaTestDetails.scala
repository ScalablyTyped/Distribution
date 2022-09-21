package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestDetails extends StObject {
  
  /**
    * Output only. If the TestState is ERROR, then this string will contain human-readable details about the error.
    */
  var errorMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Human-readable, detailed descriptions of the test's progress. For example: "Provisioning a device", "Starting Test". During the course of execution new data may be appended to the end of progress_messages.
    */
  var progressMessages: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaTestDetails {
  
  inline def apply(): SchemaTestDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestDetails]
  }
  
  extension [Self <: SchemaTestDetails](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setProgressMessages(value: js.Array[String]): Self = StObject.set(x, "progressMessages", value.asInstanceOf[js.Any])
    
    inline def setProgressMessagesNull: Self = StObject.set(x, "progressMessages", null)
    
    inline def setProgressMessagesUndefined: Self = StObject.set(x, "progressMessages", js.undefined)
    
    inline def setProgressMessagesVarargs(value: String*): Self = StObject.set(x, "progressMessages", js.Array(value*))
  }
}
