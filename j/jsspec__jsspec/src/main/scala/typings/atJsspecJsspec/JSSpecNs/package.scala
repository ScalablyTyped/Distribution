package typings.atJsspecJsspec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSSpecNs {
  /**
    * Sync Function - with optional arguments
    */
  type ArgFunc = js.Function1[/* repeated */ js.Any, Unit]
  /**
    * Async Function
    */
  type AsyncFunc = js.Function0[js.Thenable[js.Any]]
  /**
    * Sync Function
    */
  type Func = js.Function0[Unit]
  type LazyEvaluated = js.Function2[/* varName */ String, /* fnOrValue */ js.Any, Unit]
  type SharedInvocation = js.Function2[/* contextName */ String, /* repeated */ js.Any, Unit]
}
