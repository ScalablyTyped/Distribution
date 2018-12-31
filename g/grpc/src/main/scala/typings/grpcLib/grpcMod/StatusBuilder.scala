package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grpc", "StatusBuilder")
@js.native
class StatusBuilder () extends js.Object {
  /**
    * Builds the status object
    * @return A gRPC status
    */
  def build(): StatusObject = js.native
  /**
    * Adds a status code to the builder
    * @param code The status code
    */
  def withCode(code: scala.Double): this.type = js.native
  /**
    * Adds details to the builder
    * @param details A status message
    */
  def withDetails(details: java.lang.String): this.type = js.native
  /**
    * Adds metadata to the builder
    * @param metadata The gRPC status metadata
    */
  def withMetadata(metadata: Metadata): this.type = js.native
}

