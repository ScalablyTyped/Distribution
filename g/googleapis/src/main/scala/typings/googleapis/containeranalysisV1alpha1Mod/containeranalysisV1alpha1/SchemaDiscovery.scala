package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDiscovery extends StObject {
  
  /**
    * The kind of analysis that is handled by this discovery.
    */
  var analysisKind: js.UndefOr[String | Null] = js.undefined
}
object SchemaDiscovery {
  
  inline def apply(): SchemaDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiscovery]
  }
  
  extension [Self <: SchemaDiscovery](x: Self) {
    
    inline def setAnalysisKind(value: String): Self = StObject.set(x, "analysisKind", value.asInstanceOf[js.Any])
    
    inline def setAnalysisKindNull: Self = StObject.set(x, "analysisKind", null)
    
    inline def setAnalysisKindUndefined: Self = StObject.set(x, "analysisKind", js.undefined)
  }
}
