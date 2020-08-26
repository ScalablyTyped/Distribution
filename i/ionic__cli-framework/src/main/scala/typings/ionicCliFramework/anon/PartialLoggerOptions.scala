package typings.ionicCliFramework.anon

import typings.ionicCliFramework.loggerMod.LoggerHandler
import typings.ionicCliFramework.loggerMod.LoggerLevelWeight
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@ionic/cli-framework.@ionic/cli-framework/lib/logger.LoggerOptions> */
@js.native
trait PartialLoggerOptions extends js.Object {
  var handlers: js.UndefOr[Set[LoggerHandler]] = js.native
  var level: js.UndefOr[LoggerLevelWeight] = js.native
}

object PartialLoggerOptions {
  @scala.inline
  def apply(): PartialLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialLoggerOptions]
  }
  @scala.inline
  implicit class PartialLoggerOptionsOps[Self <: PartialLoggerOptions] (val x: Self) extends AnyVal {
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
    def setHandlers(value: Set[LoggerHandler]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    @scala.inline
    def setLevel(value: LoggerLevelWeight): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
  
}

