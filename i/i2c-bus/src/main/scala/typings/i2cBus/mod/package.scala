package typings.i2cBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BufferCallback = js.Function3[
    /* error */ js.Any, 
    /* bytesReadOrWritten */ scala.Double, 
    /* buffer */ typings.node.Buffer, 
    js.Any
  ]
  type CompletionCallback = js.Function1[/* error */ js.Any, js.Any]
  type ResultCallback[T] = js.Function2[/* error */ js.Any, /* result */ T, js.Any]
}
