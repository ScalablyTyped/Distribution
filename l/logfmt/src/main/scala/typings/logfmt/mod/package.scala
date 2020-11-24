package typings.logfmt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type HTTPHandler = js.Function3[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* res */ typings.node.httpMod.ServerResponse, 
    /* next */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit], 
    js.Any
  ]
  
  type RequestLoggerFormatter = js.Function2[
    /* req */ typings.node.httpMod.IncomingMessage, 
    /* res */ typings.node.httpMod.ServerResponse, 
    js.Object
  ]
}
