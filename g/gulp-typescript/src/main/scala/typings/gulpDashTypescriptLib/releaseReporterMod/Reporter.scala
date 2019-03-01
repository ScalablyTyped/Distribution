package typings
package gulpDashTypescriptLib.releaseReporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  var error: js.UndefOr[
    js.Function2[
      /* error */ TypeScriptError, 
      /* typescript */ gulpDashTypescriptLib.Anon_08, 
      scala.Unit
    ]
  ] = js.undefined
  var finish: js.UndefOr[js.Function1[/* results */ CompilationResult, scala.Unit]] = js.undefined
}

object Reporter {
  @scala.inline
  def apply(
    error: js.Function2[
      /* error */ TypeScriptError, 
      /* typescript */ gulpDashTypescriptLib.Anon_08, 
      scala.Unit
    ] = null,
    finish: js.Function1[/* results */ CompilationResult, scala.Unit] = null
  ): Reporter = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (finish != null) __obj.updateDynamic("finish")(finish)
    __obj.asInstanceOf[Reporter]
  }
}

