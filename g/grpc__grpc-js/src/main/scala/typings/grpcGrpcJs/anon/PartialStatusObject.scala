package typings.grpcGrpcJs.anon

import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import typings.grpcGrpcJs.buildSrcMetadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.StatusObject> */
trait PartialStatusObject extends StObject {
  
  var code: js.UndefOr[Status] = js.undefined
  
  var details: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
}
object PartialStatusObject {
  
  inline def apply(): PartialStatusObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStatusObject]
  }
  
  extension [Self <: PartialStatusObject](x: Self) {
    
    inline def setCode(value: Status): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
