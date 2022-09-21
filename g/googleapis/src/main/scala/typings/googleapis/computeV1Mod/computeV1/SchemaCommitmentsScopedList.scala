package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommitmentsScopedList extends StObject {
  
  /**
    * [Output Only] A list of commitments contained in this scope.
    */
  var commitments: js.UndefOr[js.Array[SchemaCommitment]] = js.undefined
  
  /**
    * [Output Only] Informational warning which replaces the list of commitments when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaCommitmentsScopedList {
  
  inline def apply(): SchemaCommitmentsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitmentsScopedList]
  }
  
  extension [Self <: SchemaCommitmentsScopedList](x: Self) {
    
    inline def setCommitments(value: js.Array[SchemaCommitment]): Self = StObject.set(x, "commitments", value.asInstanceOf[js.Any])
    
    inline def setCommitmentsUndefined: Self = StObject.set(x, "commitments", js.undefined)
    
    inline def setCommitmentsVarargs(value: SchemaCommitment*): Self = StObject.set(x, "commitments", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
