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
    error: java.lang.String => VerboseLogModule,
    errorlns: java.lang.String => VerboseLogModule,
    ok: java.lang.String => VerboseLogModule,
    oklns: java.lang.String => VerboseLogModule,
    or: NotVerboseLogModule,
    subhead: java.lang.String => VerboseLogModule,
    warn: java.lang.String => VerboseLogModule,
    write: java.lang.String => VerboseLogModule,
    writeflags: js.Any => VerboseLogModule,
    writeln: java.lang.String => VerboseLogModule
  ): VerboseLogModule = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), errorlns = js.Any.fromFunction1(errorlns), ok = js.Any.fromFunction1(ok), oklns = js.Any.fromFunction1(oklns), or = or, subhead = js.Any.fromFunction1(subhead), warn = js.Any.fromFunction1(warn), write = js.Any.fromFunction1(write), writeflags = js.Any.fromFunction1(writeflags), writeln = js.Any.fromFunction1(writeln))
  
    __obj.asInstanceOf[VerboseLogModule]
  }
}

