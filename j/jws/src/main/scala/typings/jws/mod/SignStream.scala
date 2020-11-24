package typings.jws.mod

import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignStream extends Readable {
  
  /**
    * Can be a string, Buffer, Readable stream, or object.
    */
  var key: js.Any = js.native
  
  /**
    * A Writable Stream that expects the JWS payload. Do not
    * use if you passed a payload option to the constructor.
    *
    *  Example: payloadStream.pipe(signer.payload);
    */
  var payload: Writable = js.native
  
  /**
    * A Writable Stream. Expects the JWS secret for HMAC, or
    * the privateKey for ECDSA and RSA. Do not use if you
    * passed a secret or key option to the constructor.
    *
    * Example: privateKeyStream.pipe(signer.privateKey);
    */
  var privateKey: js.Any = js.native
  
  /**
    * Can be a string, Buffer, Readable stream, or object.
    */
  var secret: js.Any = js.native
}
