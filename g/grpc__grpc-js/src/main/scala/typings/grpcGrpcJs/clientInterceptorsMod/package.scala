package typings.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientInterceptorsMod {
  type CancelRequester = js.Function1[/* next */ js.Function0[scala.Unit], scala.Unit]
  type CloseRequester = js.Function1[/* next */ js.Function0[scala.Unit], scala.Unit]
  type Interceptor = js.Function2[
    /* options */ typings.grpcGrpcJs.clientInterceptorsMod.InterceptorOptions, 
    /* nextCall */ typings.grpcGrpcJs.clientInterceptorsMod.NextCall, 
    typings.grpcGrpcJs.clientInterceptorsMod.InterceptingCall
  ]
  type InterceptorProvider = js.Function1[
    /* methodDefinition */ typings.grpcGrpcJs.makeClientMod.ClientMethodDefinition[js.Any, js.Any], 
    typings.grpcGrpcJs.clientInterceptorsMod.Interceptor
  ]
  type MessageRequester = js.Function2[
    /* message */ js.Any, 
    /* next */ js.Function1[/* message */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type MetadataRequester = js.Function3[
    /* metadata */ typings.grpcGrpcJs.metadataMod.Metadata, 
    /* listener */ typings.grpcGrpcJs.callStreamMod.InterceptingListener, 
    /* next */ js.Function2[
      /* metadata */ typings.grpcGrpcJs.metadataMod.Metadata, 
      /* listener */ typings.grpcGrpcJs.callStreamMod.InterceptingListener | typings.grpcGrpcJs.callStreamMod.Listener, 
      scala.Unit
    ], 
    scala.Unit
  ]
  type NextCall = js.Function1[
    /* options */ typings.grpcGrpcJs.clientInterceptorsMod.InterceptorOptions, 
    typings.grpcGrpcJs.clientInterceptorsMod.InterceptingCallInterface
  ]
}
