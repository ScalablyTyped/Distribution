package typings.jqueryMaskPlugin.jQueryMask

import typings.jqueryMaskPlugin.JQuery
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var byPassKeys: js.UndefOr[js.Array[Double]] = js.native
  
  var clearIfNotMatch: js.UndefOr[Boolean] = js.native
  
  var dataMask: js.UndefOr[Boolean] = js.native
  
  var dataMaskAttr: js.UndefOr[String] = js.native
  
  var maskElements: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[
    js.Function4[/* value */ String, /* e */ Event, /* $element */ JQuery, /* options */ this.type, Unit]
  ] = js.native
  
  var onComplete: js.UndefOr[
    js.Function4[/* value */ String, /* e */ Event, /* $element */ JQuery, /* options */ this.type, Unit]
  ] = js.native
  
  var onInvalid: js.UndefOr[
    js.Function5[
      /* value */ String, 
      /* e */ Event, 
      /* $element */ JQuery, 
      /* invalid */ js.Array[Invalid], 
      /* options */ this.type, 
      Unit
    ]
  ] = js.native
  
  var onKeyPress: js.UndefOr[
    js.Function4[/* value */ String, /* e */ Event, /* $element */ JQuery, /* options */ this.type, Unit]
  ] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var selectOnFocus: js.UndefOr[Boolean] = js.native
  
  var translation: js.UndefOr[Translation] = js.native
  
  var watchDataMask: js.UndefOr[Boolean] = js.native
  
  var watchInputs: js.UndefOr[Boolean] = js.native
  
  var watchInterval: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setByPassKeysVarargs(value: Double*): Self = this.set("byPassKeys", js.Array(value :_*))
    
    @scala.inline
    def setByPassKeys(value: js.Array[Double]): Self = this.set("byPassKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteByPassKeys: Self = this.set("byPassKeys", js.undefined)
    
    @scala.inline
    def setClearIfNotMatch(value: Boolean): Self = this.set("clearIfNotMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearIfNotMatch: Self = this.set("clearIfNotMatch", js.undefined)
    
    @scala.inline
    def setDataMask(value: Boolean): Self = this.set("dataMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMask: Self = this.set("dataMask", js.undefined)
    
    @scala.inline
    def setDataMaskAttr(value: String): Self = this.set("dataMaskAttr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMaskAttr: Self = this.set("dataMaskAttr", js.undefined)
    
    @scala.inline
    def setMaskElements(value: String): Self = this.set("maskElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskElements: Self = this.set("maskElements", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* value */ String, /* e */ Event, /* $element */ JQuery, Options) => Unit): Self = this.set("onChange", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnComplete(value: (/* value */ String, /* e */ Event, /* $element */ JQuery, Options) => Unit): Self = this.set("onComplete", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnComplete: Self = this.set("onComplete", js.undefined)
    
    @scala.inline
    def setOnInvalid(
      value: (/* value */ String, /* e */ Event, /* $element */ JQuery, /* invalid */ js.Array[Invalid], Options) => Unit
    ): Self = this.set("onInvalid", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOnInvalid: Self = this.set("onInvalid", js.undefined)
    
    @scala.inline
    def setOnKeyPress(value: (/* value */ String, /* e */ Event, /* $element */ JQuery, Options) => Unit): Self = this.set("onKeyPress", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnKeyPress: Self = this.set("onKeyPress", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setSelectOnFocus(value: Boolean): Self = this.set("selectOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectOnFocus: Self = this.set("selectOnFocus", js.undefined)
    
    @scala.inline
    def setTranslation(value: Translation): Self = this.set("translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslation: Self = this.set("translation", js.undefined)
    
    @scala.inline
    def setWatchDataMask(value: Boolean): Self = this.set("watchDataMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchDataMask: Self = this.set("watchDataMask", js.undefined)
    
    @scala.inline
    def setWatchInputs(value: Boolean): Self = this.set("watchInputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchInputs: Self = this.set("watchInputs", js.undefined)
    
    @scala.inline
    def setWatchInterval(value: Double): Self = this.set("watchInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatchInterval: Self = this.set("watchInterval", js.undefined)
  }
}
