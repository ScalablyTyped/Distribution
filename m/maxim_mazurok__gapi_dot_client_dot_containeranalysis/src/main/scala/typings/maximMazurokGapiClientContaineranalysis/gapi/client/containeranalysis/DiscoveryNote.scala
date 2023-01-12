package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoveryNote extends StObject {
  
  /** Required. Immutable. The kind of analysis that is handled by this discovery. */
  var analysisKind: js.UndefOr[String] = js.undefined
}
object DiscoveryNote {
  
  inline def apply(): DiscoveryNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoveryNote]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiscoveryNote] (val x: Self) extends AnyVal {
    
    inline def setAnalysisKind(value: String): Self = StObject.set(x, "analysisKind", value.asInstanceOf[js.Any])
    
    inline def setAnalysisKindUndefined: Self = StObject.set(x, "analysisKind", js.undefined)
  }
}
