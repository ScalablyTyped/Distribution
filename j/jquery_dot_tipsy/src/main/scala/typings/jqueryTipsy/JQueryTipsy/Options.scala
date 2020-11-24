package typings.jqueryTipsy.JQueryTipsy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * delay before showing tooltip (ms)
    *
    * default: 0
    */
  var delayIn: js.UndefOr[Double] = js.native
  
  /**
    * delay before hiding  tooltip (ms)
    *
    * default: 0
    */
  var delayOut: js.UndefOr[Double] = js.native
  
  /**
    * fade tooltips in/out?
    *
    * default: false
    */
  var fade: js.UndefOr[Boolean] = js.native
  
  /**
    * fallback text to use when no tooltip text
    *
    * default: ''
    */
  var fallback: js.UndefOr[String] = js.native
  
  /**
    * gravity
    *
    * default: 'n'
    */
  var gravity: js.UndefOr[js.Any] = js.native
  
   // string or () => string
  /**
    * is tooltip content HTML?
    *
    * default: false
    */
  var html: js.UndefOr[Boolean] = js.native
  
  /**
    * use live event support?
    *
    * default: false
    */
  var live: js.UndefOr[Boolean] = js.native
  
  /**
    * pixel offset of tooltip from element
    *
    * default: 0
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * opacity of tooltip
    *
    * default: 0.8
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * attribute/callback containing tooltip text
    *
    * default: 'title'
    */
  var title: js.UndefOr[js.Any] = js.native
  
   // string or () => string
  /**
    * how tooltip is triggered - hover | focus | manual
    *
    * default: 'hover'
    */
  var trigger: js.UndefOr[String] = js.native
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
    def setDelayIn(value: Double): Self = this.set("delayIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayIn: Self = this.set("delayIn", js.undefined)
    
    @scala.inline
    def setDelayOut(value: Double): Self = this.set("delayOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayOut: Self = this.set("delayOut", js.undefined)
    
    @scala.inline
    def setFade(value: Boolean): Self = this.set("fade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFade: Self = this.set("fade", js.undefined)
    
    @scala.inline
    def setFallback(value: String): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    
    @scala.inline
    def setGravity(value: js.Any): Self = this.set("gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setLive(value: Boolean): Self = this.set("live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLive: Self = this.set("live", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setTitle(value: js.Any): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
  }
}
