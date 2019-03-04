package typings
package gruntLib.gruntNs.logNs

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
    error: js.Function1[java.lang.String, VerboseLogModule],
    errorlns: js.Function1[java.lang.String, VerboseLogModule],
    ok: js.Function1[java.lang.String, VerboseLogModule],
    oklns: js.Function1[java.lang.String, VerboseLogModule],
    or: NotVerboseLogModule,
    subhead: js.Function1[java.lang.String, VerboseLogModule],
    warn: js.Function1[java.lang.String, VerboseLogModule],
    write: js.Function1[java.lang.String, VerboseLogModule],
    writeflags: js.Function1[js.Any, VerboseLogModule],
    writeln: js.Function1[java.lang.String, VerboseLogModule]
  ): VerboseLogModule = {
    val __obj = js.Dynamic.literal(error = error, errorlns = errorlns, ok = ok, oklns = oklns, or = or, subhead = subhead, warn = warn, write = write, writeflags = writeflags, writeln = writeln)
  
    __obj.asInstanceOf[VerboseLogModule]
  }
}

