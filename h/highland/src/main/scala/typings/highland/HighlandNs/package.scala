package typings.highland

import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HighlandNs {
  type MappingHint = Double | js.Array[String] | js.Function
  type OnFinished = js.Function2[
    /* r */ ReadableStream, 
    /* cb */ js.Function1[/* repeated */ js.Any, Unit], 
    Unit | js.Function | CleanupObject
  ]
  type PipeableStream[T, R] = Stream[R]
}
