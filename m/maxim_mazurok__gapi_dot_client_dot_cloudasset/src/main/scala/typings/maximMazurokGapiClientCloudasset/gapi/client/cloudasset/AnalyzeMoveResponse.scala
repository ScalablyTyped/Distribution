package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyzeMoveResponse extends StObject {
  
  /** The list of analyses returned from performing the intended resource move analysis. The analysis is grouped by different Cloud services. */
  var moveAnalysis: js.UndefOr[js.Array[MoveAnalysis]] = js.undefined
}
object AnalyzeMoveResponse {
  
  inline def apply(): AnalyzeMoveResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnalyzeMoveResponse]
  }
  
  extension [Self <: AnalyzeMoveResponse](x: Self) {
    
    inline def setMoveAnalysis(value: js.Array[MoveAnalysis]): Self = StObject.set(x, "moveAnalysis", value.asInstanceOf[js.Any])
    
    inline def setMoveAnalysisUndefined: Self = StObject.set(x, "moveAnalysis", js.undefined)
    
    inline def setMoveAnalysisVarargs(value: MoveAnalysis*): Self = StObject.set(x, "moveAnalysis", js.Array(value*))
  }
}
