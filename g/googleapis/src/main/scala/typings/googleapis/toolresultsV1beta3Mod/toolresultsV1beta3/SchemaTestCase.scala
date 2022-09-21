package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTestCase extends StObject {
  
  /**
    * The elapsed run time of the test case. Required.
    */
  var elapsedTime: js.UndefOr[SchemaDuration] = js.undefined
  
  /**
    * The end time of the test case.
    */
  var endTime: js.UndefOr[SchemaTimestamp] = js.undefined
  
  /**
    * Why the test case was skipped. Present only for skipped test case
    */
  var skippedMessage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The stack trace details if the test case failed or encountered an error. The maximum size of the stack traces is 100KiB, beyond which the stack track will be truncated. Zero if the test case passed.
    */
  var stackTraces: js.UndefOr[js.Array[SchemaStackTrace]] = js.undefined
  
  /**
    * The start time of the test case.
    */
  var startTime: js.UndefOr[SchemaTimestamp] = js.undefined
  
  /**
    * The status of the test case. Required.
    */
  var status: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A unique identifier within a Step for this Test Case.
    */
  var testCaseId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Test case reference, e.g. name, class name and test suite name. Required.
    */
  var testCaseReference: js.UndefOr[SchemaTestCaseReference] = js.undefined
  
  /**
    * References to opaque files of any format output by the tool execution. @OutputOnly
    */
  var toolOutputs: js.UndefOr[js.Array[SchemaToolOutputReference]] = js.undefined
}
object SchemaTestCase {
  
  inline def apply(): SchemaTestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestCase]
  }
  
  extension [Self <: SchemaTestCase](x: Self) {
    
    inline def setElapsedTime(value: SchemaDuration): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    inline def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
    
    inline def setEndTime(value: SchemaTimestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setSkippedMessage(value: String): Self = StObject.set(x, "skippedMessage", value.asInstanceOf[js.Any])
    
    inline def setSkippedMessageNull: Self = StObject.set(x, "skippedMessage", null)
    
    inline def setSkippedMessageUndefined: Self = StObject.set(x, "skippedMessage", js.undefined)
    
    inline def setStackTraces(value: js.Array[SchemaStackTrace]): Self = StObject.set(x, "stackTraces", value.asInstanceOf[js.Any])
    
    inline def setStackTracesUndefined: Self = StObject.set(x, "stackTraces", js.undefined)
    
    inline def setStackTracesVarargs(value: SchemaStackTrace*): Self = StObject.set(x, "stackTraces", js.Array(value*))
    
    inline def setStartTime(value: SchemaTimestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTestCaseId(value: String): Self = StObject.set(x, "testCaseId", value.asInstanceOf[js.Any])
    
    inline def setTestCaseIdNull: Self = StObject.set(x, "testCaseId", null)
    
    inline def setTestCaseIdUndefined: Self = StObject.set(x, "testCaseId", js.undefined)
    
    inline def setTestCaseReference(value: SchemaTestCaseReference): Self = StObject.set(x, "testCaseReference", value.asInstanceOf[js.Any])
    
    inline def setTestCaseReferenceUndefined: Self = StObject.set(x, "testCaseReference", js.undefined)
    
    inline def setToolOutputs(value: js.Array[SchemaToolOutputReference]): Self = StObject.set(x, "toolOutputs", value.asInstanceOf[js.Any])
    
    inline def setToolOutputsUndefined: Self = StObject.set(x, "toolOutputs", js.undefined)
    
    inline def setToolOutputsVarargs(value: SchemaToolOutputReference*): Self = StObject.set(x, "toolOutputs", js.Array(value*))
  }
}
