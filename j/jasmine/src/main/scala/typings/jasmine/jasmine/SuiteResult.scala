package typings.jasmine.jasmine

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuiteResult extends StObject {
  
  /**
    * The list of deprecation warnings that occurred during execution this spec.
    */
  var deprecationWarnings: js.Array[DeprecatedExpectation]
  
  /**
    * The description passed to the {@link it} that created this spec.
    */
  var description: String
  
  /**
    * The time in ms used by the spec execution, including any before/afterEach.
    */
  var duration: Double | Null
  
  /**
    * The list of expectations that failed during execution of this spec.
    */
  var failedExpectations: js.Array[FailedExpectation]
  
  /**
    * The full description including all ancestors of this spec.
    */
  var fullName: String
  
  /**
    * The unique id of this spec.
    */
  var id: String
  
  /**
    * User-supplied properties, if any, that were set using {@link Env.setSpecProperty}
    */
  var properties: StringDictionary[scala.Any] | Null
  
  /**
    * Once the spec has completed, this string represents the pass/fail status of this spec.
    */
  var status: String
}
object SuiteResult {
  
  inline def apply(
    deprecationWarnings: js.Array[DeprecatedExpectation],
    description: String,
    failedExpectations: js.Array[FailedExpectation],
    fullName: String,
    id: String,
    status: String
  ): SuiteResult = {
    val __obj = js.Dynamic.literal(deprecationWarnings = deprecationWarnings.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], failedExpectations = failedExpectations.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], duration = null, properties = null)
    __obj.asInstanceOf[SuiteResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuiteResult] (val x: Self) extends AnyVal {
    
    inline def setDeprecationWarnings(value: js.Array[DeprecatedExpectation]): Self = StObject.set(x, "deprecationWarnings", value.asInstanceOf[js.Any])
    
    inline def setDeprecationWarningsVarargs(value: DeprecatedExpectation*): Self = StObject.set(x, "deprecationWarnings", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setFailedExpectations(value: js.Array[FailedExpectation]): Self = StObject.set(x, "failedExpectations", value.asInstanceOf[js.Any])
    
    inline def setFailedExpectationsVarargs(value: FailedExpectation*): Self = StObject.set(x, "failedExpectations", js.Array(value*))
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: StringDictionary[scala.Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
