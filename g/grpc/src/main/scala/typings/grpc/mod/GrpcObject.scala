package typings.grpc.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrpcObject
  extends /* name */ StringDictionary[
      GrpcObject | (Instantiable3[
        /* address */ String, 
        /* credentials */ ChannelCredentials, 
        /* options */ js.UndefOr[js.Object], 
        Client
      ]) | ProtobufMessage
    ]

object GrpcObject {
  @scala.inline
  def apply(): GrpcObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrpcObject]
  }
}

