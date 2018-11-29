package typings
package maliLib.maliMod.MaliNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Request extends js.Object {
  var call: js.Any
  var metadata: js.Any
  var req: maliLib.GrpcRequest
  var `type`: java.lang.String
  def get(field: java.lang.String): js.Any
  def getMetadata(): grpcLib.grpcMod.Metadata
}

