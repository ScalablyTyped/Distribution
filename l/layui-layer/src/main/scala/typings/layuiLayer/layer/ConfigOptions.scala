package typings.layuiLayer.layer

import typings.jquery.JQuery
import typings.layuiLayer.layuiLayerBooleans.`false`
import typings.layuiLayer.layuiLayerNumbers.`-1`
import typings.layuiLayer.layuiLayerNumbers.`0`
import typings.layuiLayer.layuiLayerNumbers.`1`
import typings.layuiLayer.layuiLayerNumbers.`2`
import typings.layuiLayer.layuiLayerNumbers.`3`
import typings.layuiLayer.layuiLayerNumbers.`4`
import typings.layuiLayer.layuiLayerNumbers.`5`
import typings.layuiLayer.layuiLayerNumbers.`6`
import typings.layuiLayer.layuiLayerStrings.c
import typings.layuiLayer.layuiLayerStrings.l
import typings.layuiLayer.layuiLayerStrings.r
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends Options {
  /**
    * 拓展的css皮肤
    */
  var extend: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * js所在的目录，可以是绝对目录，也可以是相对目录
    */
  var path: js.UndefOr[String] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    anim: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    area: String | (js.Tuple2[String, String]) = null,
    btn: String | js.Array[String] = null,
    btn2: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btn3: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btn4: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btn5: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btn6: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btn7: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btn8: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btn9: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    btnAlign: l | c | r = null,
    cancel: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => `false` | Unit = null,
    closeBtn: `0` | `1` | `2` = null,
    content: String | HTMLElement | JQuery[HTMLElement] | (js.Tuple2[String, String]) = null,
    end: () => Unit = null,
    extend: String | js.Array[String] = null,
    fix: js.UndefOr[Boolean] = js.undefined,
    fixed: js.UndefOr[Boolean] = js.undefined,
    full: /* layero */ JQuery[HTMLElement] => Unit = null,
    icon: js.UndefOr[Double] = js.undefined,
    id: String = null,
    isOutAnim: js.UndefOr[Boolean] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    maxmin: js.UndefOr[Boolean] = js.undefined,
    min: /* layero */ JQuery[HTMLElement] => `false` | Unit = null,
    move: Selector | `false` | JQuery[HTMLElement] = null,
    moveEnd: js.ThisFunction1[ConfigOptions, /* layero */ JQuery[HTMLElement], Unit] = null,
    moveOut: js.UndefOr[Boolean] = js.undefined,
    moveType: js.UndefOr[Double] = js.undefined,
    offset: String | (js.Tuple2[String, String]) = null,
    path: String = null,
    resize: js.UndefOr[Boolean] = js.undefined,
    resizing: /* layero */ JQuery[HTMLElement] => Unit = null,
    restore: /* layero */ JQuery[HTMLElement] => Unit = null,
    scrollbar: js.UndefOr[Boolean] = js.undefined,
    shade: Double | `false` | (js.Tuple2[Double, String]) = null,
    shadeClose: js.UndefOr[Boolean] = js.undefined,
    shift: js.UndefOr[Double] = js.undefined,
    skin: String = null,
    success: (/* layero */ JQuery[HTMLElement], /* index */ Index) => Unit = null,
    time: js.UndefOr[Double] = js.undefined,
    tips: Double | (js.Tuple2[Double, String]) = null,
    tipsMore: js.UndefOr[Boolean] = js.undefined,
    title: String | `false` | (js.Tuple2[String, String]) = null,
    `type`: `3` | `2` | `4` | `0` | `1` = null,
    yes: (/* index */ Index, /* layero */ JQuery[HTMLElement]) => Unit = null,
    zIndex: js.UndefOr[Double] = js.undefined
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (anim != null) __obj.updateDynamic("anim")(anim.asInstanceOf[js.Any])
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (btn != null) __obj.updateDynamic("btn")(btn.asInstanceOf[js.Any])
    if (btn2 != null) __obj.updateDynamic("btn2")(js.Any.fromFunction2(btn2))
    if (btn3 != null) __obj.updateDynamic("btn3")(js.Any.fromFunction2(btn3))
    if (btn4 != null) __obj.updateDynamic("btn4")(js.Any.fromFunction2(btn4))
    if (btn5 != null) __obj.updateDynamic("btn5")(js.Any.fromFunction2(btn5))
    if (btn6 != null) __obj.updateDynamic("btn6")(js.Any.fromFunction2(btn6))
    if (btn7 != null) __obj.updateDynamic("btn7")(js.Any.fromFunction2(btn7))
    if (btn8 != null) __obj.updateDynamic("btn8")(js.Any.fromFunction2(btn8))
    if (btn9 != null) __obj.updateDynamic("btn9")(js.Any.fromFunction2(btn9))
    if (btnAlign != null) __obj.updateDynamic("btnAlign")(btnAlign.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction2(cancel))
    if (closeBtn != null) __obj.updateDynamic("closeBtn")(closeBtn.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(js.Any.fromFunction0(end))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.get.asInstanceOf[js.Any])
    if (full != null) __obj.updateDynamic("full")(js.Any.fromFunction1(full))
    if (!js.isUndefined(icon)) __obj.updateDynamic("icon")(icon.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isOutAnim)) __obj.updateDynamic("isOutAnim")(isOutAnim.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxmin)) __obj.updateDynamic("maxmin")(maxmin.get.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(js.Any.fromFunction1(min))
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    if (moveEnd != null) __obj.updateDynamic("moveEnd")(moveEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(moveOut)) __obj.updateDynamic("moveOut")(moveOut.get.asInstanceOf[js.Any])
    if (!js.isUndefined(moveType)) __obj.updateDynamic("moveType")(moveType.get.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.get.asInstanceOf[js.Any])
    if (resizing != null) __obj.updateDynamic("resizing")(js.Any.fromFunction1(resizing))
    if (restore != null) __obj.updateDynamic("restore")(js.Any.fromFunction1(restore))
    if (!js.isUndefined(scrollbar)) __obj.updateDynamic("scrollbar")(scrollbar.get.asInstanceOf[js.Any])
    if (shade != null) __obj.updateDynamic("shade")(shade.asInstanceOf[js.Any])
    if (!js.isUndefined(shadeClose)) __obj.updateDynamic("shadeClose")(shadeClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shift)) __obj.updateDynamic("shift")(shift.get.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction2(success))
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    if (tips != null) __obj.updateDynamic("tips")(tips.asInstanceOf[js.Any])
    if (!js.isUndefined(tipsMore)) __obj.updateDynamic("tipsMore")(tipsMore.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (yes != null) __obj.updateDynamic("yes")(js.Any.fromFunction2(yes))
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigOptions]
  }
}

