package typings
package gruntLib.gruntNs.logNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @note all methods available under grunt.verbose work exactly like grunt.log methods,
  *       but only log if the --verbose command-line option was not specified.
  */
trait NotVerboseLogModule extends CommonLogging[NotVerboseLogModule] {
  var or: VerboseLogModule
}

object NotVerboseLogModule {
  @scala.inline
  def apply(
    error: js.Function1[java.lang.String, NotVerboseLogModule],
    errorlns: js.Function1[java.lang.String, NotVerboseLogModule],
    ok: js.Function1[java.lang.String, NotVerboseLogModule],
    oklns: js.Function1[java.lang.String, NotVerboseLogModule],
    or: VerboseLogModule,
    subhead: js.Function1[java.lang.String, NotVerboseLogModule],
    warn: js.Function1[java.lang.String, NotVerboseLogModule],
    write: js.Function1[java.lang.String, NotVerboseLogModule],
    writeflags: js.Function1[js.Any, NotVerboseLogModule],
    writeln: js.Function1[java.lang.String, NotVerboseLogModule]
  ): NotVerboseLogModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("errorlns")(errorlns)
    __obj.updateDynamic("ok")(ok)
    __obj.updateDynamic("oklns")(oklns)
    __obj.updateDynamic("or")(or)
    __obj.updateDynamic("subhead")(subhead)
    __obj.updateDynamic("warn")(warn)
    __obj.updateDynamic("write")(write)
    __obj.updateDynamic("writeflags")(writeflags)
    __obj.updateDynamic("writeln")(writeln)
    __obj.asInstanceOf[NotVerboseLogModule]
  }
}

