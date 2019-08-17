package typings.lab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object labMod {
  import typings.std.Error

  type AsyncCallback = js.Function1[/* done */ DoneFunction, Unit]
  type AsyncPromise = js.Function0[js.Promise[js.Any]]
  type CleanupFunction = js.Function1[/* func */ js.Function1[/* next */ js.Function, Unit], Unit]
  type DoneFunction = js.Function1[/* err */ js.UndefOr[Error], Unit]
  type EmptyCallback = js.Function0[Unit]
  type ExperimentArgs = js.Function2[/* desc */ String, /* cb */ EmptyCallback, js.Object]
  type ExperimentWithOptionsArgs = js.Function3[/* desc */ String, /* options */ ExperimentOptions, /* cb */ EmptyCallback, js.Object]
  type TestArgs = js.Function2[/* desc */ String, /* cb */ TestCallback, js.Object]
  type TestCallback = js.Function2[
    /* done */ DoneFunction with DoneNote, 
    /* onCleanup */ js.UndefOr[CleanupFunction], 
    Unit
  ]
  type TestPromise = js.Function0[js.Promise[js.Any]]
  type TestWithOptionsArgs = js.Function3[/* desc */ String, /* options */ TestOptions, /* cb */ TestCallback, js.Object]
}
