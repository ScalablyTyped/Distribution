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
    val __obj = js.Dynamic.literal(error = error, errorlns = errorlns, notverbose = notverbose, ok = ok, oklns = oklns, subhead = subhead, verbose = verbose, warn = warn, write = write, writeflags = writeflags, writeln = writeln)
  
    __obj.asInstanceOf[LogModule]
  }
}

