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
  
  @scala.inline
  def apply(): SchemaCancelTestMatrixResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCancelTestMatrixResponse]
  }
  
  @scala.inline
  implicit class SchemaCancelTestMatrixResponseMutableBuilder[Self <: SchemaCancelTestMatrixResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTestState(value: String): Self = StObject.set(x, "testState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestStateUndefined: Self = StObject.set(x, "testState", js.undefined)
  }
}
