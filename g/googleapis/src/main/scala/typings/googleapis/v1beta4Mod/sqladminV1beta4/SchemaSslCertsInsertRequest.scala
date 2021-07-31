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
  
  @scala.inline
  def apply(): SchemaSslCertsInsertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertsInsertRequest]
  }
  
  @scala.inline
  implicit class SchemaSslCertsInsertRequestMutableBuilder[Self <: SchemaSslCertsInsertRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
  }
}
