package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrpcObject
  extends /* name */ org.scalablytyped.runtime.StringDictionary[
      GrpcObject | (org.scalablytyped.runtime.Instantiable3[
        /* address */ java.lang.String, 
        /* credentials */ ChannelCredentials, 
        js.UndefOr[/* options */ js.Object], 
        Client
      ]) | protobufjsLib.protobufjsMod.Message[js.Object]
    ]

object GrpcObject {
  @scala.inline
  def apply(
    StringDictionary: /* name */ org.scalablytyped.runtime.StringDictionary[
      GrpcObject | (org.scalablytyped.runtime.Instantiable3[
        /* address */ java.lang.String, 
        /* credentials */ ChannelCredentials, 
        js.UndefOr[/* options */ js.Object], 
        Client
      ]) | protobufjsLib.protobufjsMod.Message[js.Object]
    ] = null
  ): GrpcObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GrpcObject]
  }
}

