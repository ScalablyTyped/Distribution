package typings.later.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recurrence
  extends /*
  * Custom Time Periods and Modifiers
  * For acces to custom time periods created as extension to the later static type
  * and modifiers created on the later modifier static type.
  */
/* timeperiodAndModifierName */ StringDictionary[js.UndefOr[js.Array[Double]]] {
  /** Day of the month. */
  var D: js.UndefOr[js.Array[Double]] = js.undefined
  /** After modifiers. */
  var D_a: js.UndefOr[js.Array[Double]] = js.undefined
  /** Before modifiers. */
  var D_b: js.UndefOr[js.Array[Double]] = js.undefined
  /** Month in year. */
  var M: js.UndefOr[js.Array[Double]] = js.undefined
  /** After modifiers. */
  var M_a: js.UndefOr[js.Array[Double]] = js.undefined
  /** Before modifiers. */
  var M_b: js.UndefOr[js.Array[Double]] = js.undefined
  /** Year. */
  var Y: js.UndefOr[js.Array[Double]] = js.undefined
  /** After modifiers. */
  var Y_a: js.UndefOr[js.Array[Double]] = js.undefined
  /** Before modifiers. */
  var Y_b: js.UndefOr[js.Array[Double]] = js.undefined
  /** Nth day of the week in month. */
  var dc: js.UndefOr[js.Array[Double]] = js.undefined
  /** After modifiers. */
  var dc_a: js.UndefOr[js.Array[Double]] = js.undefined
  /** Before modifiers. */
  var dc_b: js.UndefOr[js.Array[Double]] = js.undefined
  /** Day in week. */
  var dw: js.UndefOr[js.Array[Double]] = js.undefined
  /** After modifiers. */
  var dw_a: js.UndefOr[js.Array[Double]] = js.undefined
  /** Before modifiers. */
  var dw_b: js.UndefOr[js.Array[Double]] = js.undefined
  /** Day in year. */
  var dy: js.UndefOr[js.Array[Double]] = js.undefined
  /** After modifiers. */
  var dy_a: js.UndefOr[js.Array[Double]] = js.undefined
  /** Before modifiers. */
  var dy_b: js.UndefOr[js.Array[Double]] = js.undefined
  /** Hour in day. */
  var h: js.UndefOr[js.Array[Double]] = js.undefined
  /** After modifiers. */
  var h_a: js.UndefOr[js.Array[Double]] = js.undefined
  /** Before modifiers. */
  var h_b: js.UndefOr[js.Array[Double]] = js.undefined
  /** Minutes in hour. */
  var m: js.UndefOr[js.Array[Double]] = js.undefined
  /** After modifiers. */
  var m_a: js.UndefOr[js.Array[Double]] = js.undefined
  /** Before modifiers. */
  var m_b: js.UndefOr[js.Array[Double]] = js.undefined
  /** Seconds in minute. */
  var s: js.UndefOr[js.Array[Double]] = js.undefined
  /** After modifiers. */
  var s_a: js.UndefOr[js.Array[Double]] = js.undefined
  /** Before modifiers. */
  var s_b: js.UndefOr[js.Array[Double]] = js.undefined
  /** Time in seconds from midnight. */
  var t: js.UndefOr[js.Array[Double]] = js.undefined
  /** After modifiers. */
  var t_a: js.UndefOr[js.Array[Double]] = js.undefined
  /** Before modifiers. */
  var t_b: js.UndefOr[js.Array[Double]] = js.undefined
  /** Week in month. */
  var wm: js.UndefOr[js.Array[Double]] = js.undefined
  /** After modifiers. */
  var wm_a: js.UndefOr[js.Array[Double]] = js.undefined
  /** Before modifiers. */
  var wm_b: js.UndefOr[js.Array[Double]] = js.undefined
  /** ISO week in year. */
  var wy: js.UndefOr[js.Array[Double]] = js.undefined
  /** After modifiers. */
  var wy_a: js.UndefOr[js.Array[Double]] = js.undefined
  /** Before modifiers. */
  var wy_b: js.UndefOr[js.Array[Double]] = js.undefined
}

object Recurrence {
  @scala.inline
  def apply(
    D: js.Array[Double] = null,
    D_a: js.Array[Double] = null,
    D_b: js.Array[Double] = null,
    M: js.Array[Double] = null,
    M_a: js.Array[Double] = null,
    M_b: js.Array[Double] = null,
    StringDictionary: /*
    * Custom Time Periods and Modifiers
    * For acces to custom time periods created as extension to the later static type
    * and modifiers created on the later modifier static type.
    */
  /* timeperiodAndModifierName */ StringDictionary[js.UndefOr[js.Array[Double]]] = null,
    Y: js.Array[Double] = null,
    Y_a: js.Array[Double] = null,
    Y_b: js.Array[Double] = null,
    dc: js.Array[Double] = null,
    dc_a: js.Array[Double] = null,
    dc_b: js.Array[Double] = null,
    dw: js.Array[Double] = null,
    dw_a: js.Array[Double] = null,
    dw_b: js.Array[Double] = null,
    dy: js.Array[Double] = null,
    dy_a: js.Array[Double] = null,
    dy_b: js.Array[Double] = null,
    h: js.Array[Double] = null,
    h_a: js.Array[Double] = null,
    h_b: js.Array[Double] = null,
    m: js.Array[Double] = null,
    m_a: js.Array[Double] = null,
    m_b: js.Array[Double] = null,
    s: js.Array[Double] = null,
    s_a: js.Array[Double] = null,
    s_b: js.Array[Double] = null,
    t: js.Array[Double] = null,
    t_a: js.Array[Double] = null,
    t_b: js.Array[Double] = null,
    wm: js.Array[Double] = null,
    wm_a: js.Array[Double] = null,
    wm_b: js.Array[Double] = null,
    wy: js.Array[Double] = null,
    wy_a: js.Array[Double] = null,
    wy_b: js.Array[Double] = null
  ): Recurrence = {
    val __obj = js.Dynamic.literal()
    if (D != null) __obj.updateDynamic("D")(D.asInstanceOf[js.Any])
    if (D_a != null) __obj.updateDynamic("D_a")(D_a.asInstanceOf[js.Any])
    if (D_b != null) __obj.updateDynamic("D_b")(D_b.asInstanceOf[js.Any])
    if (M != null) __obj.updateDynamic("M")(M.asInstanceOf[js.Any])
    if (M_a != null) __obj.updateDynamic("M_a")(M_a.asInstanceOf[js.Any])
    if (M_b != null) __obj.updateDynamic("M_b")(M_b.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (Y != null) __obj.updateDynamic("Y")(Y.asInstanceOf[js.Any])
    if (Y_a != null) __obj.updateDynamic("Y_a")(Y_a.asInstanceOf[js.Any])
    if (Y_b != null) __obj.updateDynamic("Y_b")(Y_b.asInstanceOf[js.Any])
    if (dc != null) __obj.updateDynamic("dc")(dc.asInstanceOf[js.Any])
    if (dc_a != null) __obj.updateDynamic("dc_a")(dc_a.asInstanceOf[js.Any])
    if (dc_b != null) __obj.updateDynamic("dc_b")(dc_b.asInstanceOf[js.Any])
    if (dw != null) __obj.updateDynamic("dw")(dw.asInstanceOf[js.Any])
    if (dw_a != null) __obj.updateDynamic("dw_a")(dw_a.asInstanceOf[js.Any])
    if (dw_b != null) __obj.updateDynamic("dw_b")(dw_b.asInstanceOf[js.Any])
    if (dy != null) __obj.updateDynamic("dy")(dy.asInstanceOf[js.Any])
    if (dy_a != null) __obj.updateDynamic("dy_a")(dy_a.asInstanceOf[js.Any])
    if (dy_b != null) __obj.updateDynamic("dy_b")(dy_b.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (h_a != null) __obj.updateDynamic("h_a")(h_a.asInstanceOf[js.Any])
    if (h_b != null) __obj.updateDynamic("h_b")(h_b.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (m_a != null) __obj.updateDynamic("m_a")(m_a.asInstanceOf[js.Any])
    if (m_b != null) __obj.updateDynamic("m_b")(m_b.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (s_a != null) __obj.updateDynamic("s_a")(s_a.asInstanceOf[js.Any])
    if (s_b != null) __obj.updateDynamic("s_b")(s_b.asInstanceOf[js.Any])
    if (t != null) __obj.updateDynamic("t")(t.asInstanceOf[js.Any])
    if (t_a != null) __obj.updateDynamic("t_a")(t_a.asInstanceOf[js.Any])
    if (t_b != null) __obj.updateDynamic("t_b")(t_b.asInstanceOf[js.Any])
    if (wm != null) __obj.updateDynamic("wm")(wm.asInstanceOf[js.Any])
    if (wm_a != null) __obj.updateDynamic("wm_a")(wm_a.asInstanceOf[js.Any])
    if (wm_b != null) __obj.updateDynamic("wm_b")(wm_b.asInstanceOf[js.Any])
    if (wy != null) __obj.updateDynamic("wy")(wy.asInstanceOf[js.Any])
    if (wy_a != null) __obj.updateDynamic("wy_a")(wy_a.asInstanceOf[js.Any])
    if (wy_b != null) __obj.updateDynamic("wy_b")(wy_b.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recurrence]
  }
}

