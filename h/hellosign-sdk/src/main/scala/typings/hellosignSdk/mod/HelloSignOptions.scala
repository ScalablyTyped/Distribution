package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.hellosignSdk.anon.Key
  - typings.hellosignSdk.anon.Password
  - typings.hellosignSdk.anon.Clientid
*/
trait HelloSignOptions extends StObject
object HelloSignOptions {
  
  inline def Clientid(client_id: String, client_secret: String, key: String): typings.hellosignSdk.anon.Clientid = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hellosignSdk.anon.Clientid]
  }
  
  inline def Key(key: String): typings.hellosignSdk.anon.Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hellosignSdk.anon.Key]
  }
  
  inline def Password(password: String, username: String): typings.hellosignSdk.anon.Password = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hellosignSdk.anon.Password]
  }
}
