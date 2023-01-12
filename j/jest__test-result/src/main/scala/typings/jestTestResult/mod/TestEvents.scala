package typings.jestTestResult.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestEvents extends StObject {
  
  var `test-case-result`: js.Tuple2[String, AssertionResult]
  
  var `test-file-failure`: js.Tuple2[Test, SerializableError]
  
  var `test-file-start`: js.Array[Test]
  
  var `test-file-success`: js.Tuple2[Test, TestResult]
}
object TestEvents {
  
  inline def apply(
    `test-case-result`: js.Tuple2[String, AssertionResult],
    `test-file-failure`: js.Tuple2[Test, SerializableError],
    `test-file-start`: js.Array[Test],
    `test-file-success`: js.Tuple2[Test, TestResult]
  ): TestEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("test-case-result")(`test-case-result`.asInstanceOf[js.Any])
    __obj.updateDynamic("test-file-failure")(`test-file-failure`.asInstanceOf[js.Any])
    __obj.updateDynamic("test-file-start")(`test-file-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("test-file-success")(`test-file-success`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestEvents] (val x: Self) extends AnyVal {
    
    inline def `setTest-case-result`(value: js.Tuple2[String, AssertionResult]): Self = StObject.set(x, "test-case-result", value.asInstanceOf[js.Any])
    
    inline def `setTest-file-failure`(value: js.Tuple2[Test, SerializableError]): Self = StObject.set(x, "test-file-failure", value.asInstanceOf[js.Any])
    
    inline def `setTest-file-start`(value: js.Array[Test]): Self = StObject.set(x, "test-file-start", value.asInstanceOf[js.Any])
    
    inline def `setTest-file-startVarargs`(value: Test*): Self = StObject.set(x, "test-file-start", js.Array(value*))
    
    inline def `setTest-file-success`(value: js.Tuple2[Test, TestResult]): Self = StObject.set(x, "test-file-success", value.asInstanceOf[js.Any])
  }
}
