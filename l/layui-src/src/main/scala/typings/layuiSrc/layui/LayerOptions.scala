package typings.layuiSrc.layui

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Layer options
  */
trait LayerOptions extends StObject {
  
  var anim: js.UndefOr[Double] = js.undefined
  
  var area: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var btn: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var btn2: js.UndefOr[LayerCallbackYes] = js.undefined
  
  var btn3: js.UndefOr[LayerCallbackYes] = js.undefined
  
  var btnAlign: js.UndefOr[String] = js.undefined
  
  var cancel: js.UndefOr[LayerCallbackCancel] = js.undefined
  
  var closeBtn: js.UndefOr[String | Boolean | Double] = js.undefined
  
  var content: js.UndefOr[String | HTMLElement | JQuery[HTMLElement] | js.Array[String]] = js.undefined
  
  var end: js.UndefOr[LayerCallbackEnd] = js.undefined
  
  var fixed: js.UndefOr[Boolean] = js.undefined
  
  var full: js.UndefOr[LayerCallbackFull] = js.undefined
  
  var icon: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var isOutAnim: js.UndefOr[Boolean] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var maxmin: js.UndefOr[Boolean] = js.undefined
  
  var min: js.UndefOr[LayerCallbackMin] = js.undefined
  
  var move: js.UndefOr[String | Boolean | HTMLElement] = js.undefined
  
  var moveEnd: js.UndefOr[Null | (js.Function1[/* layero */ JQuery[HTMLElement], js.Any])] = js.undefined
  
  // moveType?: boolean; //固定1，不能修改
  var moveOut: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Double | String | js.Array[String]] = js.undefined
  
  var resize: js.UndefOr[Boolean] = js.undefined
  
  var resizing: js.UndefOr[js.Function1[/* layero */ JQuery[HTMLElement], js.Any]] = js.undefined
  
  var restore: js.UndefOr[LayerCallbackRestore] = js.undefined
  
  var scrollbar: js.UndefOr[Boolean] = js.undefined
  
  var shade: js.UndefOr[String | Boolean | Double | (js.Tuple2[Double, String])] = js.undefined
  
  var shadeClose: js.UndefOr[Boolean] = js.undefined
  
  var skin: js.UndefOr[String] = js.undefined
  
  var success: js.UndefOr[LayerCallbackSuccess] = js.undefined
  
  var time: js.UndefOr[Double] = js.undefined
  
  var tips: js.UndefOr[Double | (js.Tuple2[Double, String])] = js.undefined
  
  var tipsMore: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String | Boolean | js.Array[String]] = js.undefined
  
  // 基础参数  https://www.layui.com/doc/modules/layer.html#base
  var `type`: js.UndefOr[Double] = js.undefined
  
  var yes: js.UndefOr[LayerCallbackYes] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object LayerOptions {
  
  inline def apply(): LayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerOptions]
  }
  
  extension [Self <: LayerOptions](x: Self) {
    
    inline def setAnim(value: Double): Self = StObject.set(x, "anim", value.asInstanceOf[js.Any])
    
    inline def setAnimUndefined: Self = StObject.set(x, "anim", js.undefined)
    
    inline def setArea(value: String | js.Array[String]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setAreaVarargs(value: String*): Self = StObject.set(x, "area", js.Array(value :_*))
    
    inline def setBtn(value: String | js.Array[String]): Self = StObject.set(x, "btn", value.asInstanceOf[js.Any])
    
    inline def setBtn2(value: (/* index */ Double, /* layero */ JQuery[HTMLElement]) => Boolean | Unit): Self = StObject.set(x, "btn2", js.Any.fromFunction2(value))
    
    inline def setBtn2Null: Self = StObject.set(x, "btn2", null)
    
    inline def setBtn2Undefined: Self = StObject.set(x, "btn2", js.undefined)
    
    inline def setBtn3(value: (/* index */ Double, /* layero */ JQuery[HTMLElement]) => Boolean | Unit): Self = StObject.set(x, "btn3", js.Any.fromFunction2(value))
    
    inline def setBtn3Null: Self = StObject.set(x, "btn3", null)
    
    inline def setBtn3Undefined: Self = StObject.set(x, "btn3", js.undefined)
    
    inline def setBtnAlign(value: String): Self = StObject.set(x, "btnAlign", value.asInstanceOf[js.Any])
    
    inline def setBtnAlignUndefined: Self = StObject.set(x, "btnAlign", js.undefined)
    
    inline def setBtnUndefined: Self = StObject.set(x, "btn", js.undefined)
    
    inline def setBtnVarargs(value: String*): Self = StObject.set(x, "btn", js.Array(value :_*))
    
    inline def setCancel(value: (/* index */ Double, /* layero */ JQuery[HTMLElement]) => Boolean | Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction2(value))
    
    inline def setCancelNull: Self = StObject.set(x, "cancel", null)
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setCloseBtn(value: String | Boolean | Double): Self = StObject.set(x, "closeBtn", value.asInstanceOf[js.Any])
    
    inline def setCloseBtnUndefined: Self = StObject.set(x, "closeBtn", js.undefined)
    
    inline def setContent(value: String | HTMLElement | JQuery[HTMLElement] | js.Array[String]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentVarargs(value: String*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setEndNull: Self = StObject.set(x, "end", null)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setFull(value: /* layero */ JQuery[HTMLElement] => Unit): Self = StObject.set(x, "full", js.Any.fromFunction1(value))
    
    inline def setFullNull: Self = StObject.set(x, "full", null)
    
    inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
    
    inline def setIcon(value: Double): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsOutAnim(value: Boolean): Self = StObject.set(x, "isOutAnim", value.asInstanceOf[js.Any])
    
    inline def setIsOutAnimUndefined: Self = StObject.set(x, "isOutAnim", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMaxmin(value: Boolean): Self = StObject.set(x, "maxmin", value.asInstanceOf[js.Any])
    
    inline def setMaxminUndefined: Self = StObject.set(x, "maxmin", js.undefined)
    
    inline def setMin(value: /* layero */ JQuery[HTMLElement] => Unit): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
    
    inline def setMinNull: Self = StObject.set(x, "min", null)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMove(value: String | Boolean | HTMLElement): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setMoveEnd(value: /* layero */ JQuery[HTMLElement] => js.Any): Self = StObject.set(x, "moveEnd", js.Any.fromFunction1(value))
    
    inline def setMoveEndNull: Self = StObject.set(x, "moveEnd", null)
    
    inline def setMoveEndUndefined: Self = StObject.set(x, "moveEnd", js.undefined)
    
    inline def setMoveOut(value: Boolean): Self = StObject.set(x, "moveOut", value.asInstanceOf[js.Any])
    
    inline def setMoveOutUndefined: Self = StObject.set(x, "moveOut", js.undefined)
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setOffset(value: Double | String | js.Array[String]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOffsetVarargs(value: String*): Self = StObject.set(x, "offset", js.Array(value :_*))
    
    inline def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setResizing(value: /* layero */ JQuery[HTMLElement] => js.Any): Self = StObject.set(x, "resizing", js.Any.fromFunction1(value))
    
    inline def setResizingUndefined: Self = StObject.set(x, "resizing", js.undefined)
    
    inline def setRestore(value: /* layero */ JQuery[HTMLElement] => Unit): Self = StObject.set(x, "restore", js.Any.fromFunction1(value))
    
    inline def setRestoreNull: Self = StObject.set(x, "restore", null)
    
    inline def setRestoreUndefined: Self = StObject.set(x, "restore", js.undefined)
    
    inline def setScrollbar(value: Boolean): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
    
    inline def setShade(value: String | Boolean | Double | (js.Tuple2[Double, String])): Self = StObject.set(x, "shade", value.asInstanceOf[js.Any])
    
    inline def setShadeClose(value: Boolean): Self = StObject.set(x, "shadeClose", value.asInstanceOf[js.Any])
    
    inline def setShadeCloseUndefined: Self = StObject.set(x, "shadeClose", js.undefined)
    
    inline def setShadeUndefined: Self = StObject.set(x, "shade", js.undefined)
    
    inline def setSkin(value: String): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
    
    inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
    
    inline def setSuccess(value: (/* layero */ JQuery[HTMLElement], /* index */ Double) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
    
    inline def setSuccessNull: Self = StObject.set(x, "success", null)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTips(value: Double | (js.Tuple2[Double, String])): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
    
    inline def setTipsMore(value: Boolean): Self = StObject.set(x, "tipsMore", value.asInstanceOf[js.Any])
    
    inline def setTipsMoreUndefined: Self = StObject.set(x, "tipsMore", js.undefined)
    
    inline def setTipsUndefined: Self = StObject.set(x, "tips", js.undefined)
    
    inline def setTitle(value: String | Boolean | js.Array[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value :_*))
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setYes(value: (/* index */ Double, /* layero */ JQuery[HTMLElement]) => Boolean | Unit): Self = StObject.set(x, "yes", js.Any.fromFunction2(value))
    
    inline def setYesNull: Self = StObject.set(x, "yes", null)
    
    inline def setYesUndefined: Self = StObject.set(x, "yes", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
