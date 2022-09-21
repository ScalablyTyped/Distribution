package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitmentsScopedList extends StObject {
  
  /** [Output Only] A list of commitments contained in this scope. */
  var commitments: js.UndefOr[js.Array[Commitment]] = js.undefined
  
  /** [Output Only] Informational warning which replaces the list of commitments when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object CommitmentsScopedList {
  
  inline def apply(): CommitmentsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitmentsScopedList]
  }
  
  extension [Self <: CommitmentsScopedList](x: Self) {
    
    inline def setCommitments(value: js.Array[Commitment]): Self = StObject.set(x, "commitments", value.asInstanceOf[js.Any])
    
    inline def setCommitmentsUndefined: Self = StObject.set(x, "commitments", js.undefined)
    
    inline def setCommitmentsVarargs(value: Commitment*): Self = StObject.set(x, "commitments", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
