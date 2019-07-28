package typings.graphqlDashPlaygroundDashHtml.distRenderDashPlaygroundDashPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettings extends js.Object {
  var `editor.cursorShape`: CursorShape
  var `editor.fontFamily`: String
  var `editor.fontSize`: Double
  var `editor.reuseHeaders`: Boolean
  var `editor.theme`: Theme
  var `general.betaUpdates`: Boolean
  var `request.credentials`: String
  var `tracing.hideTracingResponse`: Boolean
}

object ISettings {
  @scala.inline
  def apply(
    `editor.cursorShape`: CursorShape,
    `editor.fontFamily`: String,
    `editor.fontSize`: Double,
    `editor.reuseHeaders`: Boolean,
    `editor.theme`: Theme,
    `general.betaUpdates`: Boolean,
    `request.credentials`: String,
    `tracing.hideTracingResponse`: Boolean
  ): ISettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("editor.cursorShape")(`editor.cursorShape`)
    __obj.updateDynamic("editor.fontFamily")(`editor.fontFamily`)
    __obj.updateDynamic("editor.fontSize")(`editor.fontSize`)
    __obj.updateDynamic("editor.reuseHeaders")(`editor.reuseHeaders`)
    __obj.updateDynamic("editor.theme")(`editor.theme`)
    __obj.updateDynamic("general.betaUpdates")(`general.betaUpdates`)
    __obj.updateDynamic("request.credentials")(`request.credentials`)
    __obj.updateDynamic("tracing.hideTracingResponse")(`tracing.hideTracingResponse`)
    __obj.asInstanceOf[ISettings]
  }
}

