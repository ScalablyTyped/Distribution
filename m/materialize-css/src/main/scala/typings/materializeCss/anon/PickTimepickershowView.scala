package typings.materializeCss.anon

import typings.materializeCss.materializeCssStrings.hours
import typings.materializeCss.materializeCssStrings.minutes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Timepicker, 'showView'> */
@js.native
trait PickTimepickershowView extends js.Object {
  @JSName("showView")
  var showView_Original: js.Function1[/* view */ hours | minutes, Unit] = js.native
  @JSName("showView")
  def showView_hours(view: hours): Unit = js.native
  @JSName("showView")
  def showView_minutes(view: minutes): Unit = js.native
}

