package typings.atGrpcGrpcDashJs

import typings.atGrpcGrpcDashJs.buildSrcCallDashStreamMod.StatusObject
import typings.atGrpcGrpcDashJs.buildSrcConstantsMod.Status
import typings.atGrpcGrpcDashJs.buildSrcMetadataMod.Metadata
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/status-builder", JSImport.Namespace)
@js.native
object buildSrcStatusDashBuilderMod extends js.Object {
  @js.native
  class StatusBuilder () extends js.Object {
    var code: js.Any = js.native
    var details: js.Any = js.native
    var metadata: js.Any = js.native
    /**
      * Builds the status object.
      */
    def build(): Partial[StatusObject] = js.native
    /**
      * Adds a status code to the builder.
      */
    def withCode(code: Status): this.type = js.native
    /**
      * Adds details to the builder.
      */
    def withDetails(details: String): this.type = js.native
    /**
      * Adds metadata to the builder.
      */
    def withMetadata(metadata: Metadata): this.type = js.native
  }
  
}

