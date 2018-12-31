package typings
package jwsLib.jwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyStream
  extends nodeLib.eventsMod.EventEmitter {
  /**
    * Key.  Can be a string, buffer, or object.
    */
  var key: js.Any = js.native
  /**
    * A Writable Stream that expects a public key or secret.
    * Do not use if you passed a key or secret option to the
    * constructor.
    */
  var publicKey: nodeLib.streamMod.Writable = js.native
  /**
    * Secret.  Can be a string, buffer, or object.
    */
  var secret: js.Any = js.native
  /**
    * A Writable Stream that expects a JWS Signature. Do not
    * use if you passed a signature option to the constructor.
    */
  var signature: nodeLib.streamMod.Writable = js.native
}

