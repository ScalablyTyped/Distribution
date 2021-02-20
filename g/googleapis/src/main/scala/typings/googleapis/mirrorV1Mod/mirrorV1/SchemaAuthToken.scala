package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAuthToken extends StObject {
  
  var authToken: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object SchemaAuthToken {
  
  @scala.inline
  def apply(): SchemaAuthToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthToken]
  }
  
  @scala.inline
  implicit class SchemaAuthTokenMutableBuilder[Self <: SchemaAuthToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthToken(value: String): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
