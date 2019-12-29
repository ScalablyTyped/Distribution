package typings.grunt.grunt.log

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @note all methods available under grunt.verbose work exactly like grunt.log methods,
  *       but only log if the --verbose command-line option was specified.
  */
trait VerboseLogModule extends CommonLogging[VerboseLogModule] {
  var or: NotVerboseLogModule
}

object VerboseLogModule {
  @scala.inline
  def apply(
    error: String => VerboseLogModule,
    errorlns: String => VerboseLogModule,
    ok: String => VerboseLogModule,
    oklns: String => VerboseLogModule,
    or: NotVerboseLogModule,
    subhead: String => VerboseLogModule,
    warn: String => VerboseLogModule,
    write: String => VerboseLogModule,
    writeflags: js.Any => VerboseLogModule,
    writeln: String => VerboseLogModule
  ): VerboseLogModule = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), errorlns = js.Any.fromFunction1(errorlns), ok = js.Any.fromFunction1(ok), oklns = js.Any.fromFunction1(oklns), or = or.asInstanceOf[js.Any], subhead = js.Any.fromFunction1(subhead), warn = js.Any.fromFunction1(warn), write = js.Any.fromFunction1(write), writeflags = js.Any.fromFunction1(writeflags), writeln = js.Any.fromFunction1(writeln))
  
    __obj.asInstanceOf[VerboseLogModule]
  }
}

