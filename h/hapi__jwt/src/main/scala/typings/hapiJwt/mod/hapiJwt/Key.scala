package typings.hapiJwt.mod.hapiJwt

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.hapiJwt.mod.hapiJwt.StandardKey
  - typings.hapiJwt.mod.hapiJwt.JWKSKey
*/
trait Key extends StObject
object Key {
  
  inline def JWKSKey(uri: String): typings.hapiJwt.mod.hapiJwt.JWKSKey = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hapiJwt.mod.hapiJwt.JWKSKey]
  }
  
  inline def StandardKey(key: String | Buffer): typings.hapiJwt.mod.hapiJwt.StandardKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.hapiJwt.mod.hapiJwt.StandardKey]
  }
}
