package typings.lab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncCallback = js.Function1[/* done */ typings.lab.mod.DoneFunction, scala.Unit]
  
  type AsyncPromise = js.Function0[js.Promise[js.Any]]
  
  type CleanupFunction = js.Function1[/* func */ js.Function1[/* next */ js.Function, scala.Unit], scala.Unit]
  
  type DoneFunction = js.Function1[/* err */ js.UndefOr[typings.std.Error], scala.Unit]
  
  type EmptyCallback = js.Function0[scala.Unit]
  
  type ExperimentArgs = js.Function2[/* desc */ java.lang.String, /* cb */ typings.lab.mod.EmptyCallback, js.Object]
  
  type ExperimentWithOptionsArgs = js.Function3[
    /* desc */ java.lang.String, 
    /* options */ typings.lab.mod.ExperimentOptions, 
    /* cb */ typings.lab.mod.EmptyCallback, 
    js.Object
  ]
  
  type TestArgs = js.Function2[/* desc */ java.lang.String, /* cb */ typings.lab.mod.TestCallback, js.Object]
  
  type TestCallback = js.Function2[
    /* done */ typings.lab.mod.DoneFunction with typings.lab.mod.DoneNote, 
    /* onCleanup */ js.UndefOr[typings.lab.mod.CleanupFunction], 
    scala.Unit
  ]
  
  type TestPromise = js.Function0[js.Promise[js.Any]]
  
  type TestWithOptionsArgs = js.Function3[
    /* desc */ java.lang.String, 
    /* options */ typings.lab.mod.TestOptions, 
    /* cb */ typings.lab.mod.TestCallback, 
    js.Object
  ]
}
