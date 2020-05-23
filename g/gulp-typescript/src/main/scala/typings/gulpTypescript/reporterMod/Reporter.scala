package typings.gulpTypescript.reporterMod

import typings.gulpTypescript.anon.Typeofts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  var error: js.UndefOr[js.Function2[/* error */ TypeScriptError, /* typescript */ Typeofts, Unit]] = js.undefined
  var finish: js.UndefOr[js.Function1[/* results */ CompilationResult, Unit]] = js.undefined
}

object Reporter {
  @scala.inline
  def apply(
    error: (/* error */ TypeScriptError, /* typescript */ Typeofts) => Unit = null,
    finish: /* results */ CompilationResult => Unit = null
  ): Reporter = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2(error))
    if (finish != null) __obj.updateDynamic("finish")(js.Any.fromFunction1(finish))
    __obj.asInstanceOf[Reporter]
  }
}

