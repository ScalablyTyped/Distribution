package typings.gulpConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConnectRouteHandler = js.Tuple2[java.lang.String, typings.connect.mod.HandleFunction]
  
  type MiddlewareFactory = js.Function2[
    /* connect */ js.Function0[typings.connect.mod.Server] with typings.gulpConnect.anon.TypeofconnectModule, 
    /* options */ typings.gulpConnect.mod.ConnectAppOptions, 
    js.Array[typings.connect.mod.HandleFunction | typings.gulpConnect.mod.ConnectRouteHandler]
  ]
}
