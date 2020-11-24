package typings.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object globalMod {
  
  /**
    * Log message procedure.
    */
  type Logger = js.Function2[/* msg */ js.Any, /* repeated */ js.Any, scala.Unit]
}
