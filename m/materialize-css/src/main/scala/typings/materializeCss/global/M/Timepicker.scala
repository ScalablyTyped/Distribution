package typings.materializeCss.global.M

import typings.materializeCss.anon.PartialTimepickerOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("M.Timepicker")
@js.native
class Timepicker ()
  extends typings.materializeCss.M.Timepicker

/* static members */
@JSGlobal("M.Timepicker")
@js.native
object Timepicker extends js.Object {
  /**
    * Get Instance
    */
  def getInstance(elem: Element): typings.materializeCss.M.Timepicker = js.native
  /**
    * Init Timepickers
    */
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.Timepicker] = js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialTimepickerOptions
  ): js.Array[typings.materializeCss.M.Timepicker] = js.native
  /**
    * Init Timepicker
    */
  def init(els: Element): typings.materializeCss.M.Timepicker = js.native
  def init(els: Element, options: PartialTimepickerOptions): typings.materializeCss.M.Timepicker = js.native
}

