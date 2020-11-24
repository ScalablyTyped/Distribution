package typings.lightMyRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CallbackFunc = js.Function2[
    /* err */ typings.std.Error, 
    /* response */ typings.lightMyRequest.mod.Response, 
    scala.Unit
  ]
  
  type DispatchFunc = js.Function2[
    /* req */ typings.lightMyRequest.mod.Request, 
    /* res */ typings.lightMyRequest.mod.Response, 
    scala.Unit
  ]
  
  type InjectPayload = java.lang.String | js.Object | typings.node.Buffer | typings.node.NodeJS.ReadableStream
}
