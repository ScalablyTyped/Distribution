package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A note that indicates a type of analysis a provider would perform. This
  * note exists in a provider&#39;s project. A `Discovery` occurrence is
  * created in a consumer&#39;s project at the start of analysis. The
  * occurrence&#39;s operation will indicate the status of the analysis.
  * Absence of an occurrence linked to this note for a resource indicates that
  * analysis hasn&#39;t started.
  */
trait SchemaDiscovery extends StObject {
  
  /**
    * The kind of analysis that is handled by this discovery.
    */
  var analysisKind: js.UndefOr[String] = js.undefined
}
object SchemaDiscovery {
  
  inline def apply(): SchemaDiscovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDiscovery]
  }
  
  extension [Self <: SchemaDiscovery](x: Self) {
    
    inline def setAnalysisKind(value: String): Self = StObject.set(x, "analysisKind", value.asInstanceOf[js.Any])
    
    inline def setAnalysisKindUndefined: Self = StObject.set(x, "analysisKind", js.undefined)
  }
}
