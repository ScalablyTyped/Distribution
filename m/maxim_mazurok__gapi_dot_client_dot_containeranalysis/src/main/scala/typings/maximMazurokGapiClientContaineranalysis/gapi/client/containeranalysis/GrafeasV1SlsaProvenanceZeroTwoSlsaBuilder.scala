package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrafeasV1SlsaProvenanceZeroTwoSlsaBuilder extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
}
object GrafeasV1SlsaProvenanceZeroTwoSlsaBuilder {
  
  inline def apply(): GrafeasV1SlsaProvenanceZeroTwoSlsaBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrafeasV1SlsaProvenanceZeroTwoSlsaBuilder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GrafeasV1SlsaProvenanceZeroTwoSlsaBuilder] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
