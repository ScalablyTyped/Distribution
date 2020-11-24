package typings.jsspecJsspec

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object JSSpec {
  
  /**
    * Sync Function - with optional arguments
    */
  type ArgFunc = js.Function1[/* repeated */ js.Any, scala.Unit]
  
  /**
    * Async Function
    */
  type AsyncFunc = js.Function0[js.Thenable[js.Any]]
  
  /**
    * Sync Function
    */
  type Func = js.Function0[scala.Unit]
  
  type LazyEvaluated = js.Function2[/* varName */ java.lang.String, /* fnOrValue */ js.Any, scala.Unit]
  
  type SharedInvocation = js.Function2[/* contextName */ java.lang.String, /* repeated */ js.Any, scala.Unit]
}
