package typings
package highlandLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HighlandNs {
  type MappingHint = scala.Double | js.Array[java.lang.String] | js.Function
  type OnFinished = js.Function2[
    /* r */ nodeLib.NodeJSNs.ReadableStream, 
    /* cb */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    scala.Unit | js.Function | CleanupObject
  ]
  type PipeableStream[T, R] = Stream[R]
}
