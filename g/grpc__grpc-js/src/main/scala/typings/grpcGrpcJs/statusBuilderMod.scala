package typings.grpcGrpcJs

import typings.grpcGrpcJs.anon.PartialStatusObject
import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.metadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusBuilderMod {
  
  @JSImport("@grpc/grpc-js/build/src/status-builder", "StatusBuilder")
  @js.native
  class StatusBuilder () extends StObject {
    
    /**
      * Builds the status object.
      */
    def build(): PartialStatusObject = js.native
    
    /* private */ var code: js.Any = js.native
    
    /* private */ var details: js.Any = js.native
    
    /* private */ var metadata: js.Any = js.native
    
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
