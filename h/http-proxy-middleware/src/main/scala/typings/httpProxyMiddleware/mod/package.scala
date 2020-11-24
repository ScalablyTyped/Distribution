package typings.httpProxyMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Filter = js.Function2[
    /* pathname */ java.lang.String, 
    /* req */ typings.node.httpMod.IncomingMessage, 
    scala.Boolean
  ]
  
  type Logger = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  type Proxy = typings.connect.mod.NextHandleFunction
}
