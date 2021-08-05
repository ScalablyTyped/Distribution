package typings.maximMazurokGapiClientBigtableadmin.gapi.client.bigtableadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Split extends StObject {
  
  /** Row key to use as an initial tablet boundary. */
  var key: js.UndefOr[String] = js.undefined
}
object Split {
  
  inline def apply(): Split = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Split]
  }
  
  extension [Self <: Split](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
