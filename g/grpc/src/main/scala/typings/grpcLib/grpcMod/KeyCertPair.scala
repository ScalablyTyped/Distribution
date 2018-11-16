package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait KeyCertPair extends js.Object {
  /**
       * The server's certificate chain
       */
  var cert_chain: nodeLib.Buffer
  /**
       * The server's private key
       */
  var private_key: nodeLib.Buffer
}

