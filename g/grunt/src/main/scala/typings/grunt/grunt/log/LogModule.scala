package typings.grunt.grunt.log

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
    error: String => LogModule,
    errorlns: String => LogModule,
    notverbose: NotVerboseLogModule,
    ok: String => LogModule,
    oklns: String => LogModule,
    subhead: String => LogModule,
    verbose: VerboseLogModule,
    warn: String => LogModule,
    write: String => LogModule,
    writeflags: js.Any => LogModule,
    writeln: String => LogModule
  ): LogModule = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), errorlns = js.Any.fromFunction1(errorlns), notverbose = notverbose.asInstanceOf[js.Any], ok = js.Any.fromFunction1(ok), oklns = js.Any.fromFunction1(oklns), subhead = js.Any.fromFunction1(subhead), verbose = verbose.asInstanceOf[js.Any], warn = js.Any.fromFunction1(warn), write = js.Any.fromFunction1(write), writeflags = js.Any.fromFunction1(writeflags), writeln = js.Any.fromFunction1(writeln))
    __obj.asInstanceOf[LogModule]
  }
}

