package typings
package gruntLib.gruntNs.logNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/api/grunt.log}
  */
trait LogModule extends CommonLogging[LogModule] {
  var notverbose: NotVerboseLogModule
  var verbose: VerboseLogModule
}

object LogModule {
  @scala.inline
  def apply(
    error: js.Function1[java.lang.String, LogModule],
    errorlns: js.Function1[java.lang.String, LogModule],
    notverbose: NotVerboseLogModule,
    ok: js.Function1[java.lang.String, LogModule],
    oklns: js.Function1[java.lang.String, LogModule],
    subhead: js.Function1[java.lang.String, LogModule],
    verbose: VerboseLogModule,
    warn: js.Function1[java.lang.String, LogModule],
    write: js.Function1[java.lang.String, LogModule],
    writeflags: js.Function1[js.Any, LogModule],
    writeln: js.Function1[java.lang.String, LogModule]
  ): LogModule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("errorlns")(errorlns)
    __obj.updateDynamic("notverbose")(notverbose)
    __obj.updateDynamic("ok")(ok)
    __obj.updateDynamic("oklns")(oklns)
    __obj.updateDynamic("subhead")(subhead)
    __obj.updateDynamic("verbose")(verbose)
    __obj.updateDynamic("warn")(warn)
    __obj.updateDynamic("write")(write)
    __obj.updateDynamic("writeflags")(writeflags)
    __obj.updateDynamic("writeln")(writeln)
    __obj.asInstanceOf[LogModule]
  }
}

