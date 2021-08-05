package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SslCerts insert request.
  */
trait SchemaSslCertsInsertRequest extends StObject {
  
  /**
    * User supplied name. Must be a distinct name from the other certificates
    * for this instance.
    */
  var commonName: js.UndefOr[String] = js.undefined
}
object SchemaSslCertsInsertRequest {
  
  inline def apply(): SchemaSslCertsInsertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertsInsertRequest]
  }
  
  extension [Self <: SchemaSslCertsInsertRequest](x: Self) {
    
    inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    
    inline def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
  }
}
