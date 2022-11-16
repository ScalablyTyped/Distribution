package typings.grpc.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type GrpcObject = {[name: string] : grpc.grpc.GrpcObject | new (address : string, credentials : grpc.grpc.ChannelCredentials, options : object | undefined): grpc.grpc.Client | grpc.grpc.ProtobufMessage}
}}}
to avoid circular code involving: 
- grpc.grpc.GrpcObject
*/
trait GrpcObject
  extends StObject
     with /* name */ StringDictionary[
      GrpcObject | (Instantiable3[
        /* address */ String, 
        /* credentials */ ChannelCredentials, 
        /* options */ js.UndefOr[js.Object], 
        Client
      ]) | ProtobufMessage
    ]
object GrpcObject {
  
  inline def apply(): GrpcObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrpcObject]
  }
}
