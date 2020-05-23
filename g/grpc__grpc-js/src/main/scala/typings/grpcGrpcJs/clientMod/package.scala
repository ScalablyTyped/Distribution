package typings.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  type UnaryCallback[ResponseType] = js.Function2[
    /* err */ typings.grpcGrpcJs.callMod.ServiceError | scala.Null, 
    /* value */ js.UndefOr[ResponseType], 
    scala.Unit
  ]
}
