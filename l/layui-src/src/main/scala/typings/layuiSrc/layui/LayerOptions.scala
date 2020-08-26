package typings.layuiSrc.layui

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Layer options
  */
@js.native
trait LayerOptions extends js.Object {
  var anim: js.UndefOr[Double] = js.native
  var area: js.UndefOr[String | js.Array[String]] = js.native
  var btn: js.UndefOr[String | js.Array[String]] = js.native
  var btn2: js.UndefOr[LayerCallbackYes] = js.native
  var btn3: js.UndefOr[LayerCallbackYes] = js.native
  var btnAlign: js.UndefOr[String] = js.native
  var cancel: js.UndefOr[LayerCallbackCancel] = js.native
  var closeBtn: js.UndefOr[String | Boolean | Double] = js.native
  var content: js.UndefOr[String | HTMLElement | JQuery[HTMLElement] | js.Array[String]] = js.native
  var end: js.UndefOr[LayerCallbackEnd] = js.native
  var fixed: js.UndefOr[Boolean] = js.native
  var full: js.UndefOr[LayerCallbackFull] = js.native
  var icon: js.UndefOr[Double] = js.native
  var id: js.UndefOr[String] = js.native
  var isOutAnim: js.UndefOr[Boolean] = js.native
  var maxWidth: js.UndefOr[Double] = js.native
  var maxmin: js.UndefOr[Boolean] = js.native
  var min: js.UndefOr[LayerCallbackMin] = js.native
  var move: js.UndefOr[String | Boolean | HTMLElement] = js.native
  var moveEnd: js.UndefOr[Null | (js.Function1[/* layero */ JQuery[HTMLElement], _])] = js.native
  // moveType?: boolean; //固定1，不能修改
  var moveOut: js.UndefOr[Boolean] = js.native
  var offset: js.UndefOr[Double | String | js.Array[String]] = js.native
  var resize: js.UndefOr[Boolean] = js.native
  var resizing: js.UndefOr[js.Function1[/* layero */ JQuery[HTMLElement], _]] = js.native
  var restore: js.UndefOr[LayerCallbackRestore] = js.native
  var scrollbar: js.UndefOr[Boolean] = js.native
  var shade: js.UndefOr[String | Boolean | Double | (js.Tuple2[Double, String])] = js.native
  var shadeClose: js.UndefOr[Boolean] = js.native
  var skin: js.UndefOr[String] = js.native
  var success: js.UndefOr[LayerCallbackSuccess] = js.native
  var time: js.UndefOr[Double] = js.native
  var tips: js.UndefOr[Double | (js.Tuple2[Double, String])] = js.native
  var tipsMore: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String | Boolean | js.Array[String]] = js.native
  // 基础参数  https://www.layui.com/doc/modules/layer.html#base
  var `type`: js.UndefOr[Double] = js.native
  var yes: js.UndefOr[LayerCallbackYes] = js.native
  var zIndex: js.UndefOr[Double] = js.native
}

object LayerOptions {
  @scala.inline
  def apply(): LayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerOptions]
  }
  @scala.inline
  implicit class LayerOptionsOps[Self <: LayerOptions] (val x: Self) extends AnyVal {
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
    def setAnim(value: Double): Self = this.set("anim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnim: Self = this.set("anim", js.undefined)
    @scala.inline
    def setAreaVarargs(value: String*): Self = this.set("area", js.Array(value :_*))
    @scala.inline
    def setArea(value: String | js.Array[String]): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    @scala.inline
    def setBtnVarargs(value: String*): Self = this.set("btn", js.Array(value :_*))
    @scala.inline
    def setBtn(value: String | js.Array[String]): Self = this.set("btn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBtn: Self = this.set("btn", js.undefined)
    @scala.inline
    def setBtn2(value: (/* index */ Double, /* layero */ JQuery[HTMLElement]) => Boolean | Unit): Self = this.set("btn2", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBtn2: Self = this.set("btn2", js.undefined)
    @scala.inline
    def setBtn2Null: Self = this.set("btn2", null)
    @scala.inline
    def setBtn3(value: (/* index */ Double, /* layero */ JQuery[HTMLElement]) => Boolean | Unit): Self = this.set("btn3", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBtn3: Self = this.set("btn3", js.undefined)
    @scala.inline
    def setBtn3Null: Self = this.set("btn3", null)
    @scala.inline
    def setBtnAlign(value: String): Self = this.set("btnAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBtnAlign: Self = this.set("btnAlign", js.undefined)
    @scala.inline
    def setCancel(value: (/* index */ Double, /* layero */ JQuery[HTMLElement]) => Boolean | Unit): Self = this.set("cancel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCancelNull: Self = this.set("cancel", null)
    @scala.inline
    def setCloseBtn(value: String | Boolean | Double): Self = this.set("closeBtn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseBtn: Self = this.set("closeBtn", js.undefined)
    @scala.inline
    def setContentVarargs(value: String*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: String | HTMLElement | JQuery[HTMLElement] | js.Array[String]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setEndNull: Self = this.set("end", null)
    @scala.inline
    def setFixed(value: Boolean): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFixed: Self = this.set("fixed", js.undefined)
    @scala.inline
    def setFull(value: /* layero */ JQuery[HTMLElement] => Unit): Self = this.set("full", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFull: Self = this.set("full", js.undefined)
    @scala.inline
    def setFullNull: Self = this.set("full", null)
    @scala.inline
    def setIcon(value: Double): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsOutAnim(value: Boolean): Self = this.set("isOutAnim", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOutAnim: Self = this.set("isOutAnim", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMaxmin(value: Boolean): Self = this.set("maxmin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxmin: Self = this.set("maxmin", js.undefined)
    @scala.inline
    def setMin(value: /* layero */ JQuery[HTMLElement] => Unit): Self = this.set("min", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinNull: Self = this.set("min", null)
    @scala.inline
    def setMove(value: String | Boolean | HTMLElement): Self = this.set("move", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMove: Self = this.set("move", js.undefined)
    @scala.inline
    def setMoveEnd(value: /* layero */ JQuery[HTMLElement] => _): Self = this.set("moveEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMoveEnd: Self = this.set("moveEnd", js.undefined)
    @scala.inline
    def setMoveEndNull: Self = this.set("moveEnd", null)
    @scala.inline
    def setMoveOut(value: Boolean): Self = this.set("moveOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveOut: Self = this.set("moveOut", js.undefined)
    @scala.inline
    def setOffsetVarargs(value: String*): Self = this.set("offset", js.Array(value :_*))
    @scala.inline
    def setOffset(value: Double | String | js.Array[String]): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setResize(value: Boolean): Self = this.set("resize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    @scala.inline
    def setResizing(value: /* layero */ JQuery[HTMLElement] => _): Self = this.set("resizing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResizing: Self = this.set("resizing", js.undefined)
    @scala.inline
    def setRestore(value: /* layero */ JQuery[HTMLElement] => Unit): Self = this.set("restore", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRestore: Self = this.set("restore", js.undefined)
    @scala.inline
    def setRestoreNull: Self = this.set("restore", null)
    @scala.inline
    def setScrollbar(value: Boolean): Self = this.set("scrollbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollbar: Self = this.set("scrollbar", js.undefined)
    @scala.inline
    def setShade(value: String | Boolean | Double | (js.Tuple2[Double, String])): Self = this.set("shade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShade: Self = this.set("shade", js.undefined)
    @scala.inline
    def setShadeClose(value: Boolean): Self = this.set("shadeClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadeClose: Self = this.set("shadeClose", js.undefined)
    @scala.inline
    def setSkin(value: String): Self = this.set("skin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkin: Self = this.set("skin", js.undefined)
    @scala.inline
    def setSuccess(value: (/* layero */ JQuery[HTMLElement], /* index */ Double) => Unit): Self = this.set("success", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    @scala.inline
    def setSuccessNull: Self = this.set("success", null)
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setTips(value: Double | (js.Tuple2[Double, String])): Self = this.set("tips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTips: Self = this.set("tips", js.undefined)
    @scala.inline
    def setTipsMore(value: Boolean): Self = this.set("tipsMore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTipsMore: Self = this.set("tipsMore", js.undefined)
    @scala.inline
    def setTitleVarargs(value: String*): Self = this.set("title", js.Array(value :_*))
    @scala.inline
    def setTitle(value: String | Boolean | js.Array[String]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setYes(value: (/* index */ Double, /* layero */ JQuery[HTMLElement]) => Boolean | Unit): Self = this.set("yes", js.Any.fromFunction2(value))
    @scala.inline
    def deleteYes: Self = this.set("yes", js.undefined)
    @scala.inline
    def setYesNull: Self = this.set("yes", null)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

