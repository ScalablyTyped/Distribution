package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompressionAlgorithmsMod {
  
  @js.native
  sealed trait CompressionAlgorithms extends StObject
  @JSImport("@grpc/grpc-js/build/src/compression-algorithms", "CompressionAlgorithms")
  @js.native
  object CompressionAlgorithms extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CompressionAlgorithms & Double] = js.native
    
    @js.native
    sealed trait deflate
      extends StObject
         with CompressionAlgorithms
    /* 1 */ val deflate: typings.grpcGrpcJs.buildSrcCompressionAlgorithmsMod.CompressionAlgorithms.deflate & Double = js.native
    
    @js.native
    sealed trait gzip
      extends StObject
         with CompressionAlgorithms
    /* 2 */ val gzip: typings.grpcGrpcJs.buildSrcCompressionAlgorithmsMod.CompressionAlgorithms.gzip & Double = js.native
    
    @js.native
    sealed trait identity
      extends StObject
         with CompressionAlgorithms
    /* 0 */ val identity: typings.grpcGrpcJs.buildSrcCompressionAlgorithmsMod.CompressionAlgorithms.identity & Double = js.native
  }
}
