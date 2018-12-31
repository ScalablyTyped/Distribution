package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusObject extends js.Object {
  /**
    * The error code, a key of `grpc.status`
    */
  var code: status
  /**
    * Human-readable description of the status
    */
  var details: java.lang.String
  /**
    * Trailing metadata sent with the status, if applicable
    */
  var metadata: Metadata
}

