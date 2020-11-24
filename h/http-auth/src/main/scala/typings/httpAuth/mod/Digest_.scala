package typings.httpAuth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Digest_ extends Base {
  
  /* private */ def askNonce(): String = js.native
  
  var nonces: js.Array[Nonce] = js.native
  
  /* private */ def removeNonces(nonces: js.Array[Nonce]): Unit = js.native
  
  /* private */ def validate(ha2: String, clientOptions: ClientOptions, hash: String): Boolean = js.native
  
  /* private */ def validateNonce(nonce: String, qop: Qop, nc: String): Boolean = js.native
}
