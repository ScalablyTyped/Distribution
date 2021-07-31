package typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElectionsQueryResponse extends StObject {
  
  /** A list of available elections */
  var elections: js.UndefOr[js.Array[Election]] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "civicinfo#electionsQueryResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object ElectionsQueryResponse {
  
  @scala.inline
  def apply(): ElectionsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElectionsQueryResponse]
  }
  
  @scala.inline
  implicit class ElectionsQueryResponseMutableBuilder[Self <: ElectionsQueryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElections(value: js.Array[Election]): Self = StObject.set(x, "elections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElectionsUndefined: Self = StObject.set(x, "elections", js.undefined)
    
    @scala.inline
    def setElectionsVarargs(value: Election*): Self = StObject.set(x, "elections", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
