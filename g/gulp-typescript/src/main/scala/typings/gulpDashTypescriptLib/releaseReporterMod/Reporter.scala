package typings
package gulpDashTypescriptLib.releaseReporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  var error: js.UndefOr[
    js.Function2[
      /* error */ TypeScriptError, 
      /* typescript */ gulpDashTypescriptLib.Anon_CreateFunctionExpression, 
      scala.Unit
    ]
  ] = js.undefined
  var finish: js.UndefOr[js.Function1[/* results */ CompilationResult, scala.Unit]] = js.undefined
}

