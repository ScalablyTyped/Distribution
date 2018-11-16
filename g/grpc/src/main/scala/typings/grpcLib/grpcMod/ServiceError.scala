package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServiceError
  extends nodeLib.Error {
  /**
       * The error code, a key of {@link grpc.status} that is not `grpc.status.OK`
       */
  var code: js.UndefOr[status] = js.undefined
  /**
       * Trailing metadata sent with the status, if applicable
       */
  var metadata: js.UndefOr[Metadata] = js.undefined
}

