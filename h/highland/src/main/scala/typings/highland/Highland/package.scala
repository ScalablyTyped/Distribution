package typings.highland

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Highland {
  
  type MappingHint = scala.Double | js.Array[java.lang.String] | js.Function
  
  type OnFinished = js.Function2[
    /* r */ typings.node.NodeJS.ReadableStream, 
    /* cb */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    scala.Unit | js.Function | typings.highland.Highland.CleanupObject
  ]
  
  type PipeableStream[T, R] = typings.highland.Highland.Stream[R]
}
