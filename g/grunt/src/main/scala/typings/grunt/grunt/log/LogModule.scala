package typings.grunt.grunt.log

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link http://gruntjs.com/api/grunt.log}
  */
@js.native
trait LogModule extends CommonLogging[LogModule] {
  
  var notverbose: NotVerboseLogModule = js.native
  
  var verbose: VerboseLogModule = js.native
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
  
  @scala.inline
  implicit class LogModuleOps[Self <: LogModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNotverbose(value: NotVerboseLogModule): Self = this.set("notverbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbose(value: VerboseLogModule): Self = this.set("verbose", value.asInstanceOf[js.Any])
  }
}
