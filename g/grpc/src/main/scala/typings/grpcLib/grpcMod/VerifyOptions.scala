package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait VerifyOptions extends js.Object {
  /**
       * If set, this callback will be invoked after the usual hostname verification
       * has been performed on the peer certificate.
       */
  var checkServerIdentity: js.UndefOr[CheckServerIdentityCallback] = js.undefined
}

