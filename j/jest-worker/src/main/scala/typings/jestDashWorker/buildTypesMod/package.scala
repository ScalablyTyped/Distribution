package typings.jestDashWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import typings.jestDashWorker.jestDashWorkerNumbers.`0`
  import typings.jestDashWorker.jestDashWorkerNumbers.`1`
  import typings.jestDashWorker.jestDashWorkerNumbers.`2`
  import typings.std.Error

  type ChildMessage = ChildMessageInitialize | ChildMessageCall | ChildMessageEnd
  type ChildMessageCall = js.Tuple4[`1`, Boolean, String, js.Array[js.Any]]
  type ChildMessageEnd = js.Tuple2[`2`, Boolean]
  type ChildMessageInitialize = js.Tuple5[
    `0`, 
    Boolean, 
    String, 
    js.UndefOr[// file
  js.Array[js.Any]], 
    js.UndefOr[// setupArgs
  MessagePort]
  ]
  type OnEnd = js.Function2[/* err */ Error | Null, /* result */ js.Any, Unit]
  type OnStart = js.Function1[/* worker */ WorkerInterface, Unit]
  type ParentMessage = ParentMessageOk | ParentMessageError
  type ParentMessageError = js.Tuple5[PARENT_MESSAGE_ERROR, String, String, String, js.Any]
  type ParentMessageOk = js.Tuple2[`0`, js.Any]
}
