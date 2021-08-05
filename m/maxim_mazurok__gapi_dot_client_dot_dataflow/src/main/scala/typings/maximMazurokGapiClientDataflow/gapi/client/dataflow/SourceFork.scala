package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceFork extends StObject {
  
  /** DEPRECATED */
  var primary: js.UndefOr[SourceSplitShard] = js.undefined
  
  /** DEPRECATED */
  var primarySource: js.UndefOr[DerivedSource] = js.undefined
  
  /** DEPRECATED */
  var residual: js.UndefOr[SourceSplitShard] = js.undefined
  
  /** DEPRECATED */
  var residualSource: js.UndefOr[DerivedSource] = js.undefined
}
object SourceFork {
  
  inline def apply(): SourceFork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceFork]
  }
  
  extension [Self <: SourceFork](x: Self) {
    
    inline def setPrimary(value: SourceSplitShard): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setPrimarySource(value: DerivedSource): Self = StObject.set(x, "primarySource", value.asInstanceOf[js.Any])
    
    inline def setPrimarySourceUndefined: Self = StObject.set(x, "primarySource", js.undefined)
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    inline def setResidual(value: SourceSplitShard): Self = StObject.set(x, "residual", value.asInstanceOf[js.Any])
    
    inline def setResidualSource(value: DerivedSource): Self = StObject.set(x, "residualSource", value.asInstanceOf[js.Any])
    
    inline def setResidualSourceUndefined: Self = StObject.set(x, "residualSource", js.undefined)
    
    inline def setResidualUndefined: Self = StObject.set(x, "residual", js.undefined)
  }
}
