package typings.later.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recurrence
  extends /*
  * Custom Time Periods and Modifiers
  * For acces to custom time periods created as extension to the later static type
  * and modifiers created on the later modifier static type.
  */
/* timeperiodAndModifierName */ StringDictionary[js.UndefOr[js.Array[Double]]] {
  /** Day of the month. */
  var D: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var D_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var D_b: js.UndefOr[js.Array[Double]] = js.native
  /** Month in year. */
  var M: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var M_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var M_b: js.UndefOr[js.Array[Double]] = js.native
  /** Year. */
  var Y: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var Y_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var Y_b: js.UndefOr[js.Array[Double]] = js.native
  /** Nth day of the week in month. */
  var dc: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var dc_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var dc_b: js.UndefOr[js.Array[Double]] = js.native
  /** Day in week. */
  var dw: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var dw_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var dw_b: js.UndefOr[js.Array[Double]] = js.native
  /** Day in year. */
  var dy: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var dy_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var dy_b: js.UndefOr[js.Array[Double]] = js.native
  /** Hour in day. */
  var h: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var h_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var h_b: js.UndefOr[js.Array[Double]] = js.native
  /** Minutes in hour. */
  var m: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var m_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var m_b: js.UndefOr[js.Array[Double]] = js.native
  /** Seconds in minute. */
  var s: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var s_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var s_b: js.UndefOr[js.Array[Double]] = js.native
  /** Time in seconds from midnight. */
  var t: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var t_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var t_b: js.UndefOr[js.Array[Double]] = js.native
  /** Week in month. */
  var wm: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var wm_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var wm_b: js.UndefOr[js.Array[Double]] = js.native
  /** ISO week in year. */
  var wy: js.UndefOr[js.Array[Double]] = js.native
  /** After modifiers. */
  var wy_a: js.UndefOr[js.Array[Double]] = js.native
  /** Before modifiers. */
  var wy_b: js.UndefOr[js.Array[Double]] = js.native
}

object Recurrence {
  @scala.inline
  def apply(): Recurrence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recurrence]
  }
  @scala.inline
  implicit class RecurrenceOps[Self <: Recurrence] (val x: Self) extends AnyVal {
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
    def setDVarargs(value: Double*): Self = this.set("D", js.Array(value :_*))
    @scala.inline
    def setD(value: js.Array[Double]): Self = this.set("D", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("D", js.undefined)
    @scala.inline
    def setD_aVarargs(value: Double*): Self = this.set("D_a", js.Array(value :_*))
    @scala.inline
    def setD_a(value: js.Array[Double]): Self = this.set("D_a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD_a: Self = this.set("D_a", js.undefined)
    @scala.inline
    def setD_bVarargs(value: Double*): Self = this.set("D_b", js.Array(value :_*))
    @scala.inline
    def setD_b(value: js.Array[Double]): Self = this.set("D_b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD_b: Self = this.set("D_b", js.undefined)
    @scala.inline
    def setMVarargs(value: Double*): Self = this.set("M", js.Array(value :_*))
    @scala.inline
    def setM(value: js.Array[Double]): Self = this.set("M", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("M", js.undefined)
    @scala.inline
    def setM_aVarargs(value: Double*): Self = this.set("M_a", js.Array(value :_*))
    @scala.inline
    def setM_a(value: js.Array[Double]): Self = this.set("M_a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM_a: Self = this.set("M_a", js.undefined)
    @scala.inline
    def setM_bVarargs(value: Double*): Self = this.set("M_b", js.Array(value :_*))
    @scala.inline
    def setM_b(value: js.Array[Double]): Self = this.set("M_b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM_b: Self = this.set("M_b", js.undefined)
    @scala.inline
    def setYVarargs(value: Double*): Self = this.set("Y", js.Array(value :_*))
    @scala.inline
    def setY(value: js.Array[Double]): Self = this.set("Y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("Y", js.undefined)
    @scala.inline
    def setY_aVarargs(value: Double*): Self = this.set("Y_a", js.Array(value :_*))
    @scala.inline
    def setY_a(value: js.Array[Double]): Self = this.set("Y_a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY_a: Self = this.set("Y_a", js.undefined)
    @scala.inline
    def setY_bVarargs(value: Double*): Self = this.set("Y_b", js.Array(value :_*))
    @scala.inline
    def setY_b(value: js.Array[Double]): Self = this.set("Y_b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY_b: Self = this.set("Y_b", js.undefined)
    @scala.inline
    def setDcVarargs(value: Double*): Self = this.set("dc", js.Array(value :_*))
    @scala.inline
    def setDc(value: js.Array[Double]): Self = this.set("dc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDc: Self = this.set("dc", js.undefined)
    @scala.inline
    def setDc_aVarargs(value: Double*): Self = this.set("dc_a", js.Array(value :_*))
    @scala.inline
    def setDc_a(value: js.Array[Double]): Self = this.set("dc_a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDc_a: Self = this.set("dc_a", js.undefined)
    @scala.inline
    def setDc_bVarargs(value: Double*): Self = this.set("dc_b", js.Array(value :_*))
    @scala.inline
    def setDc_b(value: js.Array[Double]): Self = this.set("dc_b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDc_b: Self = this.set("dc_b", js.undefined)
    @scala.inline
    def setDwVarargs(value: Double*): Self = this.set("dw", js.Array(value :_*))
    @scala.inline
    def setDw(value: js.Array[Double]): Self = this.set("dw", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDw: Self = this.set("dw", js.undefined)
    @scala.inline
    def setDw_aVarargs(value: Double*): Self = this.set("dw_a", js.Array(value :_*))
    @scala.inline
    def setDw_a(value: js.Array[Double]): Self = this.set("dw_a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDw_a: Self = this.set("dw_a", js.undefined)
    @scala.inline
    def setDw_bVarargs(value: Double*): Self = this.set("dw_b", js.Array(value :_*))
    @scala.inline
    def setDw_b(value: js.Array[Double]): Self = this.set("dw_b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDw_b: Self = this.set("dw_b", js.undefined)
    @scala.inline
    def setDyVarargs(value: Double*): Self = this.set("dy", js.Array(value :_*))
    @scala.inline
    def setDy(value: js.Array[Double]): Self = this.set("dy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    @scala.inline
    def setDy_aVarargs(value: Double*): Self = this.set("dy_a", js.Array(value :_*))
    @scala.inline
    def setDy_a(value: js.Array[Double]): Self = this.set("dy_a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDy_a: Self = this.set("dy_a", js.undefined)
    @scala.inline
    def setDy_bVarargs(value: Double*): Self = this.set("dy_b", js.Array(value :_*))
    @scala.inline
    def setDy_b(value: js.Array[Double]): Self = this.set("dy_b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDy_b: Self = this.set("dy_b", js.undefined)
    @scala.inline
    def setHVarargs(value: Double*): Self = this.set("h", js.Array(value :_*))
    @scala.inline
    def setH(value: js.Array[Double]): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    @scala.inline
    def setH_aVarargs(value: Double*): Self = this.set("h_a", js.Array(value :_*))
    @scala.inline
    def setH_a(value: js.Array[Double]): Self = this.set("h_a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH_a: Self = this.set("h_a", js.undefined)
    @scala.inline
    def setH_bVarargs(value: Double*): Self = this.set("h_b", js.Array(value :_*))
    @scala.inline
    def setH_b(value: js.Array[Double]): Self = this.set("h_b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH_b: Self = this.set("h_b", js.undefined)
    @scala.inline
    def setSVarargs(value: Double*): Self = this.set("s", js.Array(value :_*))
    @scala.inline
    def setS(value: js.Array[Double]): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    @scala.inline
    def setS_aVarargs(value: Double*): Self = this.set("s_a", js.Array(value :_*))
    @scala.inline
    def setS_a(value: js.Array[Double]): Self = this.set("s_a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS_a: Self = this.set("s_a", js.undefined)
    @scala.inline
    def setS_bVarargs(value: Double*): Self = this.set("s_b", js.Array(value :_*))
    @scala.inline
    def setS_b(value: js.Array[Double]): Self = this.set("s_b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS_b: Self = this.set("s_b", js.undefined)
    @scala.inline
    def setTVarargs(value: Double*): Self = this.set("t", js.Array(value :_*))
    @scala.inline
    def setT(value: js.Array[Double]): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteT: Self = this.set("t", js.undefined)
    @scala.inline
    def setT_aVarargs(value: Double*): Self = this.set("t_a", js.Array(value :_*))
    @scala.inline
    def setT_a(value: js.Array[Double]): Self = this.set("t_a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteT_a: Self = this.set("t_a", js.undefined)
    @scala.inline
    def setT_bVarargs(value: Double*): Self = this.set("t_b", js.Array(value :_*))
    @scala.inline
    def setT_b(value: js.Array[Double]): Self = this.set("t_b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteT_b: Self = this.set("t_b", js.undefined)
    @scala.inline
    def setWmVarargs(value: Double*): Self = this.set("wm", js.Array(value :_*))
    @scala.inline
    def setWm(value: js.Array[Double]): Self = this.set("wm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWm: Self = this.set("wm", js.undefined)
    @scala.inline
    def setWm_aVarargs(value: Double*): Self = this.set("wm_a", js.Array(value :_*))
    @scala.inline
    def setWm_a(value: js.Array[Double]): Self = this.set("wm_a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWm_a: Self = this.set("wm_a", js.undefined)
    @scala.inline
    def setWm_bVarargs(value: Double*): Self = this.set("wm_b", js.Array(value :_*))
    @scala.inline
    def setWm_b(value: js.Array[Double]): Self = this.set("wm_b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWm_b: Self = this.set("wm_b", js.undefined)
    @scala.inline
    def setWyVarargs(value: Double*): Self = this.set("wy", js.Array(value :_*))
    @scala.inline
    def setWy(value: js.Array[Double]): Self = this.set("wy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWy: Self = this.set("wy", js.undefined)
    @scala.inline
    def setWy_aVarargs(value: Double*): Self = this.set("wy_a", js.Array(value :_*))
    @scala.inline
    def setWy_a(value: js.Array[Double]): Self = this.set("wy_a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWy_a: Self = this.set("wy_a", js.undefined)
    @scala.inline
    def setWy_bVarargs(value: Double*): Self = this.set("wy_b", js.Array(value :_*))
    @scala.inline
    def setWy_b(value: js.Array[Double]): Self = this.set("wy_b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWy_b: Self = this.set("wy_b", js.undefined)
  }
  
}

