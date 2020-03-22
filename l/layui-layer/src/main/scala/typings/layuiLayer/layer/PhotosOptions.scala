package typings.layuiLayer.layer

import typings.jquery.JQuery_
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

trait PhotosOptions extends Options {
  var photos: PhotosData | Selector
  /**
    * 切换图片时触发
    * @param pic
    * @param layero
    */
  var tab: js.UndefOr[js.Function2[/* pic */ PhotosDataItem, /* layero */ JQuery_[HTMLElement], Unit]] = js.undefined
}

object PhotosOptions {
  @scala.inline
  def apply(
    photos: PhotosData | Selector,
    anim: `-1` | `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    area: String | (js.Tuple2[String, String]) = null,
    btn: String | js.Array[String] = null,
    btn2: (/* index */ Index, /* layero */ JQuery_[HTMLElement]) => `false` | Unit = null,
    btn3: (/* index */ Index, /* layero */ JQuery_[HTMLElement]) => `false` | Unit = null,
    btn4: (/* index */ Index, /* layero */ JQuery_[HTMLElement]) => `false` | Unit = null,
    btn5: (/* index */ Index, /* layero */ JQuery_[HTMLElement]) => `false` | Unit = null,
    btn6: (/* index */ Index, /* layero */ JQuery_[HTMLElement]) => `false` | Unit = null,
    btn7: (/* index */ Index, /* layero */ JQuery_[HTMLElement]) => `false` | Unit = null,
    btn8: (/* index */ Index, /* layero */ JQuery_[HTMLElement]) => `false` | Unit = null,
    btn9: (/* index */ Index, /* layero */ JQuery_[HTMLElement]) => `false` | Unit = null,
    btnAlign: l | c | r = null,
    cancel: (/* index */ Index, /* layero */ JQuery_[HTMLElement]) => `false` | Unit = null,
    closeBtn: `0` | `1` | `2` = null,
    content: String | HTMLElement | JQuery_[HTMLElement] | (js.Tuple2[String, String]) = null,
    end: () => Unit = null,
    fix: js.UndefOr[Boolean] = js.undefined,
    fixed: js.UndefOr[Boolean] = js.undefined,
    full: /* layero */ JQuery_[HTMLElement] => Unit = null,
    icon: Int | Double = null,
    id: String = null,
    isOutAnim: js.UndefOr[Boolean] = js.undefined,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    maxmin: js.UndefOr[Boolean] = js.undefined,
    min: /* layero */ JQuery_[HTMLElement] => `false` | Unit = null,
    move: Selector | `false` | JQuery_[HTMLElement] = null,
    moveEnd: js.ThisFunction1[PhotosOptions, /* layero */ JQuery_[HTMLElement], Unit] = null,
    moveOut: js.UndefOr[Boolean] = js.undefined,
    moveType: Int | Double = null,
    offset: String | (js.Tuple2[String, String]) = null,
    resize: js.UndefOr[Boolean] = js.undefined,
    resizing: /* layero */ JQuery_[HTMLElement] => Unit = null,
    restore: /* layero */ JQuery_[HTMLElement] => Unit = null,
    scrollbar: js.UndefOr[Boolean] = js.undefined,
    shade: Double | `false` | (js.Tuple2[Double, String]) = null,
    shadeClose: js.UndefOr[Boolean] = js.undefined,
    shift: Int | Double = null,
    skin: String = null,
    success: (/* layero */ JQuery_[HTMLElement], /* index */ Index) => Unit = null,
    tab: (/* pic */ PhotosDataItem, /* layero */ JQuery_[HTMLElement]) => Unit = null,
    time: Int | Double = null,
    tips: Double | (js.Tuple2[Double, String]) = null,
    tipsMore: js.UndefOr[Boolean] = js.undefined,
    title: String | `false` | (js.Tuple2[String, String]) = null,
    `type`: `3` | `2` | `4` | `0` | `1` = null,
    yes: (/* index */ Index, /* layero */ JQuery_[HTMLElement]) => Unit = null,
    zIndex: Int | Double = null
  ): PhotosOptions = {
    val __obj = js.Dynamic.literal(photos = photos.asInstanceOf[js.Any])
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
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (full != null) __obj.updateDynamic("full")(js.Any.fromFunction1(full))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isOutAnim)) __obj.updateDynamic("isOutAnim")(isOutAnim.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(maxmin)) __obj.updateDynamic("maxmin")(maxmin.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(js.Any.fromFunction1(min))
    if (move != null) __obj.updateDynamic("move")(move.asInstanceOf[js.Any])
    if (moveEnd != null) __obj.updateDynamic("moveEnd")(moveEnd.asInstanceOf[js.Any])
    if (!js.isUndefined(moveOut)) __obj.updateDynamic("moveOut")(moveOut.asInstanceOf[js.Any])
    if (moveType != null) __obj.updateDynamic("moveType")(moveType.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(resize)) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (resizing != null) __obj.updateDynamic("resizing")(js.Any.fromFunction1(resizing))
    if (restore != null) __obj.updateDynamic("restore")(js.Any.fromFunction1(restore))
    if (!js.isUndefined(scrollbar)) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (shade != null) __obj.updateDynamic("shade")(shade.asInstanceOf[js.Any])
    if (!js.isUndefined(shadeClose)) __obj.updateDynamic("shadeClose")(shadeClose.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    if (skin != null) __obj.updateDynamic("skin")(skin.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction2(success))
    if (tab != null) __obj.updateDynamic("tab")(js.Any.fromFunction2(tab))
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (tips != null) __obj.updateDynamic("tips")(tips.asInstanceOf[js.Any])
    if (!js.isUndefined(tipsMore)) __obj.updateDynamic("tipsMore")(tipsMore.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (yes != null) __obj.updateDynamic("yes")(js.Any.fromFunction2(yes))
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotosOptions]
  }
}

