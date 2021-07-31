package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Discovery extends StObject {
  
  /** Required. Immutable. The kind of analysis that is handled by this discovery. */
  var analysisKind: js.UndefOr[String] = js.undefined
}
object Discovery {
  
  @scala.inline
  def apply(): Discovery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Discovery]
  }
  
  @scala.inline
  implicit class DiscoveryMutableBuilder[Self <: Discovery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalysisKind(value: String): Self = StObject.set(x, "analysisKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalysisKindUndefined: Self = StObject.set(x, "analysisKind", js.undefined)
  }
}
