package typings.logProcessErrors.mod

import typings.logProcessErrors.anon.PartialRecordExceptionTyp
import typings.logProcessErrors.logProcessErrorsStrings.`node-tap`
import typings.logProcessErrors.logProcessErrorsStrings.ava
import typings.logProcessErrors.logProcessErrorsStrings.jasmine
import typings.logProcessErrors.logProcessErrorsStrings.mocha
import typings.logProcessErrors.logProcessErrorsStrings.tape
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * log-process-errors constructor options.
  */
@js.native
trait Options extends js.Object {
  
  /**
    * Whether or not to colorize messages.
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#colors
    */
  var colors: js.UndefOr[Boolean] = js.native
  
  /**
    * Which process should trigger `process.exit(1)`
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#exiton
    */
  var exitOn: js.UndefOr[js.Array[ExceptionType]] = js.native
  
  /**
    * Which log level to use for different exceptions.
    *
    * https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#log
    */
  var level: js.UndefOr[PartialRecordExceptionTyp] = js.native
  
  /**
    * Override logger
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#log
    */
  var log: js.UndefOr[js.Function2[/* error */ Error, /* level */ LogLevel, js.Promise[Unit] | Unit]] = js.native
  
  /**
    * When running tests, makes them fail if there are any process errors.
    *
    * @link https://github.com/ehmicky/log-process-errors/blob/master/docs/API.md#testing
    */
  var testing: js.UndefOr[ava | mocha | jasmine | tape | `node-tap`] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setColors(value: Boolean): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setExitOnVarargs(value: ExceptionType*): Self = this.set("exitOn", js.Array(value :_*))
    
    @scala.inline
    def setExitOn(value: js.Array[ExceptionType]): Self = this.set("exitOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitOn: Self = this.set("exitOn", js.undefined)
    
    @scala.inline
    def setLevel(value: PartialRecordExceptionTyp): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setLog(value: (/* error */ Error, /* level */ LogLevel) => js.Promise[Unit] | Unit): Self = this.set("log", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setTesting(value: ava | mocha | jasmine | tape | `node-tap`): Self = this.set("testing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTesting: Self = this.set("testing", js.undefined)
  }
}
