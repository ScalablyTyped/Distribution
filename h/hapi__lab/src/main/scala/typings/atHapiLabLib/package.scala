package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiLabLib {
  type AsyncCallback = js.Function1[/* done */ DoneFunction, scala.Unit]
  type AsyncPromise = js.Function0[js.Promise[js.Any]]
  type CleanupFunction = js.Function1[/* func */ js.Function1[/* next */ js.Function, scala.Unit], scala.Unit]
  type DoneFunction = js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]
  type EmptyCallback = js.Function0[scala.Unit]
  type ExperimentArgs = js.Function2[/* desc */ java.lang.String, /* cb */ EmptyCallback, js.Object]
  type ExperimentWithOptionsArgs = js.Function3[
    /* desc */ java.lang.String, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ExperimentOptions */ /* options */ js.Any, 
    /* cb */ EmptyCallback, 
    js.Object
  ]
  type TestArgs = js.Function2[/* desc */ java.lang.String, /* cb */ TestCallback, js.Object]
  type TestCallback = js.Function2[
    /* done */ DoneFunction with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DoneNote */ js.Any), 
    /* onCleanup */ js.UndefOr[CleanupFunction], 
    scala.Unit
  ]
  type TestPromise = js.Function0[js.Promise[js.Any]]
  type TestWithOptionsArgs = js.Function3[
    /* desc */ java.lang.String, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TestOptions */ /* options */ js.Any, 
    /* cb */ TestCallback, 
    js.Object
  ]
}
