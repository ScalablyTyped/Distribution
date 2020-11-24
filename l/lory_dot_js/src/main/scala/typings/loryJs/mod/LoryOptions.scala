package typings.loryJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoryOptions extends js.Object {
  
  /**
    * executed after initialisation (end of setup function)
    */
  var afterInit: js.UndefOr[js.Function0[_]] = js.native
  
  //////////////////////////////////////////////////
  //  Callbacks
  //////////////////////////////////////////////////
  /**
    * executed before initialisation (first in setup function)
    */
  var beforeInit: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * executed on click of next controls (next function)
    */
  var beforeNext: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * executed on click of prev controls (prev function)
    */
  var beforePrev: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * executed on every resize event
    */
  var beforeResize: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * executed on touch attempt (touchstart)
    */
  var beforeTouch: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * class name for slider frame
    * default: 'js_frame'
    */
  var classNameFrame: js.UndefOr[String] = js.native
  
  /**
    * class name for slider next control
    * default: 'js_next'
    */
  var classNameNextCtrl: js.UndefOr[String] = js.native
  
  /**
    * class name for slider previous control
    * default: 'js_prev'
    */
  var classNamePrevCtrl: js.UndefOr[String] = js.native
  
  /**
    * class name for slides container
    * default: 'js_slides'
    */
  var classNameSlideContainer: js.UndefOr[String] = js.native
  
  /**
    * cubic bezier easing functions: http://easings.net/de (default: 'cubic-bezier(0.455, 0.03, 0.515, 0.955)').
    */
  var ease: js.UndefOr[String] = js.native
  
  /**
    * enabled mouse events
    * default: false
    */
  var enableMouseEvents: js.UndefOr[Boolean] = js.native
  
  /**
    * like carousel, works with multiple slides (default: false). (do not combine with rewind)
    */
  var infinite: js.UndefOr[Boolean | Double] = js.native
  
  /**
    * the slide index to show when the slider is initialized (    default: 0 )
    */
  var initialIndex: js.UndefOr[Double] = js.native
  
  /**
    * if slider reached the last slide, with next click the slider goes back to the startindex (default: false).
    */
  var rewind: js.UndefOr[Boolean] = js.native
  
  /**
    * time in milliseconds for the animation of the rewind after the last slide (default: 600).
    */
  var rewindSpeed: js.UndefOr[Double] = js.native
  
  /**
    * time in milliseconds for the animation of a valid slide attempt (default: 300).
    */
  var slideSpeed: js.UndefOr[Double] = js.native
  
  //////////////////////////////////////////////////
  //  Options
  //////////////////////////////////////////////////
  /**
    * slides scrolled at once (default: 1).
    */
  var slidesToScroll: js.UndefOr[Double] = js.native
  
  /**
    * time for the snapBack of the slider if the slide attempt was not valid (default: 200).
    */
  var snapBackSpeed: js.UndefOr[Double] = js.native
}
object LoryOptions {
  
  @scala.inline
  def apply(): LoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoryOptions]
  }
  
  @scala.inline
  implicit class LoryOptionsOps[Self <: LoryOptions] (val x: Self) extends AnyVal {
    
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
    def setAfterInit(value: () => _): Self = this.set("afterInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAfterInit: Self = this.set("afterInit", js.undefined)
    
    @scala.inline
    def setBeforeInit(value: () => _): Self = this.set("beforeInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeInit: Self = this.set("beforeInit", js.undefined)
    
    @scala.inline
    def setBeforeNext(value: () => _): Self = this.set("beforeNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeNext: Self = this.set("beforeNext", js.undefined)
    
    @scala.inline
    def setBeforePrev(value: () => _): Self = this.set("beforePrev", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforePrev: Self = this.set("beforePrev", js.undefined)
    
    @scala.inline
    def setBeforeResize(value: () => _): Self = this.set("beforeResize", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeResize: Self = this.set("beforeResize", js.undefined)
    
    @scala.inline
    def setBeforeTouch(value: () => _): Self = this.set("beforeTouch", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteBeforeTouch: Self = this.set("beforeTouch", js.undefined)
    
    @scala.inline
    def setClassNameFrame(value: String): Self = this.set("classNameFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNameFrame: Self = this.set("classNameFrame", js.undefined)
    
    @scala.inline
    def setClassNameNextCtrl(value: String): Self = this.set("classNameNextCtrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNameNextCtrl: Self = this.set("classNameNextCtrl", js.undefined)
    
    @scala.inline
    def setClassNamePrevCtrl(value: String): Self = this.set("classNamePrevCtrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNamePrevCtrl: Self = this.set("classNamePrevCtrl", js.undefined)
    
    @scala.inline
    def setClassNameSlideContainer(value: String): Self = this.set("classNameSlideContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNameSlideContainer: Self = this.set("classNameSlideContainer", js.undefined)
    
    @scala.inline
    def setEase(value: String): Self = this.set("ease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEase: Self = this.set("ease", js.undefined)
    
    @scala.inline
    def setEnableMouseEvents(value: Boolean): Self = this.set("enableMouseEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableMouseEvents: Self = this.set("enableMouseEvents", js.undefined)
    
    @scala.inline
    def setInfinite(value: Boolean | Double): Self = this.set("infinite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfinite: Self = this.set("infinite", js.undefined)
    
    @scala.inline
    def setInitialIndex(value: Double): Self = this.set("initialIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialIndex: Self = this.set("initialIndex", js.undefined)
    
    @scala.inline
    def setRewind(value: Boolean): Self = this.set("rewind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRewind: Self = this.set("rewind", js.undefined)
    
    @scala.inline
    def setRewindSpeed(value: Double): Self = this.set("rewindSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRewindSpeed: Self = this.set("rewindSpeed", js.undefined)
    
    @scala.inline
    def setSlideSpeed(value: Double): Self = this.set("slideSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideSpeed: Self = this.set("slideSpeed", js.undefined)
    
    @scala.inline
    def setSlidesToScroll(value: Double): Self = this.set("slidesToScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlidesToScroll: Self = this.set("slidesToScroll", js.undefined)
    
    @scala.inline
    def setSnapBackSpeed(value: Double): Self = this.set("snapBackSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapBackSpeed: Self = this.set("snapBackSpeed", js.undefined)
  }
}
