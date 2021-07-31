package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result containing the Finding and its StateChange.
  */
trait SchemaListFindingsResult extends StObject {
  
  /**
    * Finding matching the search request.
    */
  var finding: js.UndefOr[SchemaFinding] = js.undefined
  
  /**
    * State change of the finding between the points in time.
    */
  var stateChange: js.UndefOr[String] = js.undefined
}
object SchemaListFindingsResult {
  
  @scala.inline
  def apply(): SchemaListFindingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFindingsResult]
  }
  
  @scala.inline
  implicit class SchemaListFindingsResultMutableBuilder[Self <: SchemaListFindingsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinding(value: SchemaFinding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    @scala.inline
    def setStateChange(value: String): Self = StObject.set(x, "stateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChangeUndefined: Self = StObject.set(x, "stateChange", js.undefined)
  }
}
