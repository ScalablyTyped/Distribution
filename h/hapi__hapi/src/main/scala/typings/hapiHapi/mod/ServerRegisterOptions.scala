package typings.hapiHapi.mod

import typings.hapiHapi.anon.Vhost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerRegisterOptions extends StObject {
  
  /**
    * if true, subsequent registrations of the same plugin are skipped without error. Cannot be used with plugin options. Defaults to false. If not set to true, an error will be thrown the second
    * time a plugin is registered on the server.
    */
  var once: js.UndefOr[Boolean] = js.native
  
  /**
    * modifiers applied to each route added by the plugin:
    */
  var routes: js.UndefOr[Vhost] = js.native
}
object ServerRegisterOptions {
  
  @scala.inline
  def apply(): ServerRegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerRegisterOptions]
  }
  
  @scala.inline
  implicit class ServerRegisterOptionsMutableBuilder[Self <: ServerRegisterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
    
    @scala.inline
    def setRoutes(value: Vhost): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
  }
}
