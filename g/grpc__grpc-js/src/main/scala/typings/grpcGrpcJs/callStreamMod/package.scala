package typings.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object callStreamMod {
  
  type Deadline = typings.std.Date | scala.Double
  
  type MessageListener = js.Function2[
    /* message */ js.Any, 
    /* next */ js.Function1[/* message */ js.Any, scala.Unit], 
    scala.Unit
  ]
  
  type MetadataListener = js.Function2[
    /* metadata */ typings.grpcGrpcJs.metadataMod.Metadata, 
    /* next */ js.Function1[/* metadata */ typings.grpcGrpcJs.metadataMod.Metadata, scala.Unit], 
    scala.Unit
  ]
  
  type StatusListener = js.Function2[
    /* status */ typings.grpcGrpcJs.callStreamMod.StatusObject, 
    /* next */ js.Function1[/* status */ typings.grpcGrpcJs.callStreamMod.StatusObject, scala.Unit], 
    scala.Unit
  ]
  
  type WriteCallback = js.Function1[/* error */ js.UndefOr[typings.std.Error | scala.Null], scala.Unit]
}
