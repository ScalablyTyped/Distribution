package typings.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object clientMod {
  
  type CallInvocationTransformer = js.Function1[
    /* callProperties */ typings.grpcGrpcJs.clientMod.CallProperties[js.Any, js.Any], 
    typings.grpcGrpcJs.clientMod.CallProperties[js.Any, js.Any]
  ]
  
  type UnaryCallback[ResponseType] = js.Function2[
    /* err */ typings.grpcGrpcJs.callMod.ServiceError | scala.Null, 
    /* value */ js.UndefOr[ResponseType], 
    scala.Unit
  ]
}
