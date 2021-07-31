package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client metadata associated with Safe Browsing API requests.
  */
trait SchemaClientInfo extends StObject {
  
  /**
    * A client ID that (hopefully) uniquely identifies the client
    * implementation of the Safe Browsing API.
    */
  var clientId: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the client implementation.
    */
  var clientVersion: js.UndefOr[String] = js.undefined
}
object SchemaClientInfo {
  
  @scala.inline
  def apply(): SchemaClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClientInfo]
  }
  
  @scala.inline
  implicit class SchemaClientInfoMutableBuilder[Self <: SchemaClientInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
  }
}
