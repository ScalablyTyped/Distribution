package typings.jestWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ChildMessage = typings.jestWorker.typesMod.ChildMessageInitialize | typings.jestWorker.typesMod.ChildMessageCall | typings.jestWorker.typesMod.ChildMessageEnd
  
  type ChildMessageCall = js.Tuple4[
    typings.jestWorker.jestWorkerNumbers.`1`, 
    scala.Boolean, 
    java.lang.String, 
    js.Array[js.Any]
  ]
  
  type ChildMessageEnd = js.Tuple2[typings.jestWorker.jestWorkerNumbers.`2`, scala.Boolean]
  
  type ChildMessageInitialize = js.Tuple5[
    typings.jestWorker.jestWorkerNumbers.`0`, 
    scala.Boolean, 
    java.lang.String, 
    js.UndefOr[// file
  js.Array[js.Any]], 
    js.UndefOr[// setupArgs
  typings.jestWorker.typesMod.MessagePort]
  ]
  
  type OnEnd = js.Function2[/* err */ typings.std.Error | scala.Null, /* result */ js.Any, scala.Unit]
  
  type OnStart = js.Function1[/* worker */ typings.jestWorker.typesMod.WorkerInterface, scala.Unit]
  
  type ParentMessage = typings.jestWorker.typesMod.ParentMessageOk | typings.jestWorker.typesMod.ParentMessageError
  
  type ParentMessageError = js.Tuple5[
    typings.jestWorker.typesMod.PARENT_MESSAGE_ERROR, 
    java.lang.String, 
    java.lang.String, 
    java.lang.String, 
    js.Any
  ]
  
  type ParentMessageOk = js.Tuple2[typings.jestWorker.jestWorkerNumbers.`0`, js.Any]
}
