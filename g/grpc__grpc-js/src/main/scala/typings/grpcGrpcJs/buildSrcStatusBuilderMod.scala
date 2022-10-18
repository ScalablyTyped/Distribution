package typings.grpcGrpcJs

import typings.grpcGrpcJs.anon.PartialStatusObject
import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcStatusBuilderMod {
  
  @JSImport("@grpc/grpc-js/build/src/status-builder", "StatusBuilder")
  @js.native
  open class StatusBuilder () extends StObject {
    
    /**
      * Builds the status object.
      */
    def build(): PartialStatusObject = js.native
    
    /* private */ var code: Any = js.native
    
    /* private */ var details: Any = js.native
    
    /* private */ var metadata: Any = js.native
    
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
