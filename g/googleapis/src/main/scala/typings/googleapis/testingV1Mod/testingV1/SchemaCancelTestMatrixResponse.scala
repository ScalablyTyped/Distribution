package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response containing the current state of the specified test matrix.
  */
trait SchemaCancelTestMatrixResponse extends StObject {
  
  /**
    * The current rolled-up state of the test matrix. If this state is already
    * final, then the cancelation request will have no effect.
    */
  var testState: js.UndefOr[String] = js.undefined
}
object SchemaCancelTestMatrixResponse {
  
  inline def apply(): SchemaCancelTestMatrixResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCancelTestMatrixResponse]
  }
  
  extension [Self <: SchemaCancelTestMatrixResponse](x: Self) {
    
    inline def setTestState(value: String): Self = StObject.set(x, "testState", value.asInstanceOf[js.Any])
    
    inline def setTestStateUndefined: Self = StObject.set(x, "testState", js.undefined)
  }
}
