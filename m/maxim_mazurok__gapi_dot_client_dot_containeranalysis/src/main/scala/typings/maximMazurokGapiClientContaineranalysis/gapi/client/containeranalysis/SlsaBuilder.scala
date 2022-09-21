package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlsaBuilder extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
}
object SlsaBuilder {
  
  inline def apply(): SlsaBuilder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlsaBuilder]
  }
  
  extension [Self <: SlsaBuilder](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
