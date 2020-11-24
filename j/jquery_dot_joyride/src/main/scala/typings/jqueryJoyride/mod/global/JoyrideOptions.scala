package typings.jqueryJoyride.mod.global

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoyrideOptions extends js.Object {
  
  /**
    * true or false - false tour starts when restart called
    * @member {boolean}
    */
  var autoStart: js.UndefOr[Boolean] = js.native
  
  /**
    * Will this cookie be attached to a domain, ie. '.notableapp.com'
    * @member {any}
    */
  var cookieDomain: js.UndefOr[js.Any] = js.native
  
  /**
    * true/false for whether cookies are used
    * @member {boolean}
    */
  var cookieMonster: js.UndefOr[Boolean] = js.native
  
  /**
    * choose your own cookie name
    * member {string}
    */
  var cookieName: js.UndefOr[String] = js.native
  
  /**
    * Set to '/' if you want the cookie for the whole website
    * @member {any}
    */
  var cookiePath: js.UndefOr[js.Any] = js.native
  
  /**
    *  Whether to expose the elements at each step in the tour (requires modal:true)
    * @member {boolean}
    */
  var expose: js.UndefOr[Boolean] = js.native
  
  /**
    * true or false to control whether localstorage is used
    * @member {boolean}
    */
  var localStorage: js.UndefOr[Boolean] = js.native
  
  /**
    * Keyname in localstorage
    @member {string}
    */
  var localStorageKey: js.UndefOr[String] = js.native
  
  /**
    * Whether to cover page with modal during the tour
    * @member {boolean}
    */
  var modal: js.UndefOr[Boolean] = js.native
  
  /**
    * true/false for next button visibility
    * @member {boolean}
    */
  var nextButton: js.UndefOr[Boolean] = js.native
  
  /**
    * override on a per tooltip bases
    * @member {any}
    */
  var nubPosition: js.UndefOr[js.Any] = js.native
  
  /**
    * array of indexes where to pause the tour after
    * @member {any[]}
    */
  var pauseAfter: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * A method to call after an element has been exposed
    * @method
    * @param {number} index Tip Index
    * @param {JQuery} nextTip Tip object
    * @param {JQuery} el Element
    */
  var postExposeCallback: js.UndefOr[
    js.Function3[/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery], Unit]
  ] = js.native
  
  /**
    * a method to call once the tour closes
    * @method
    * @param {number} index Current Tip Index
    * @param {JQuery} currentTip Current Tip object
    * @param {boolean} isAborted Is Aborted?
    */
  var postRideCallback: js.UndefOr[
    js.Function3[/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /**
    * A method to call after each step
    * @method
    * @param {number} index Current Tip Index
    * @param {JQuery} currentTip Current Tip object
    * @param {boolean} isAborted Is Aborted?
    */
  var postStepCallback: js.UndefOr[
    js.Function3[/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean], Unit]
  ] = js.native
  
  /**
    * A method to call before the tour starts (passed index, tip, and cloned exposed element)
    * @method
    * @param {number} index Current Tip Index
    * @param {JQuery} currentTip Current Tip object
    * @param {JQuery} el Element
    */
  var preRideCallback: js.UndefOr[
    js.Function3[/* index */ Double, /* currentTip */ JQuery, /* el */ js.UndefOr[JQuery], Unit]
  ] = js.native
  
  /**
    * A method to call before each step
    * @method
    * @param {number} index Tip Index
    * @param {JQuery} nextTip Tip object
    * @param {JQuery} el Element
    */
  var preStepCallback: js.UndefOr[
    js.Function3[/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery], Unit]
  ] = js.native
  
  /**
    * whether to scroll to tips
    * @member {boolean}
    */
  var scroll: js.UndefOr[Boolean] = js.native
  
  /**
    * Page scrolling speed in ms
    * @member {number}
    */
  var scrollSpeed: js.UndefOr[Double] = js.native
  
  /**
    * the index of the tooltip you want to start on (index of the li)
    * @member {number}
    */
  var startOffset: js.UndefOr[Double] = js.native
  
  /**
    * true/false to start timer on first click
    * @member {boolean}
    */
  var startTimerOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * HTML segments for tip layout
    * @member {JoyrideTemplate}
    */
  var template: js.UndefOr[JoyrideTemplate] = js.native
  
  /**
    * 0 = off, all other numbers = time(ms)
    * @member {number}
    */
  var timer: js.UndefOr[Double] = js.native
  
  /**
    * 'pop' or 'fade' in each tip
    * @member {string}
    */
  var tipAnimation: js.UndefOr[String] = js.native
  
  /**
    * if 'fade'- speed in ms of transition
    * @member {number}
    */
  var tipAnimationFadeSpeed: js.UndefOr[Double] = js.native
  
  /**
    * Where the tip be attached if not inline
    * @member {HTMLElement}
    */
  var tipContainer: js.UndefOr[HTMLElement] = js.native
  
  /**
    * 'top' or 'bottom' in relation to parent
    * @member {string}
    */
  var tipLocation: js.UndefOr[String] = js.native
  
  /**
    * Version
    * @member {string}
    */
  var version: js.UndefOr[String] = js.native
}
object JoyrideOptions {
  
  @scala.inline
  def apply(): JoyrideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoyrideOptions]
  }
  
  @scala.inline
  implicit class JoyrideOptionsOps[Self <: JoyrideOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
    
    @scala.inline
    def setCookieDomain(value: js.Any): Self = this.set("cookieDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieDomain: Self = this.set("cookieDomain", js.undefined)
    
    @scala.inline
    def setCookieMonster(value: Boolean): Self = this.set("cookieMonster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieMonster: Self = this.set("cookieMonster", js.undefined)
    
    @scala.inline
    def setCookieName(value: String): Self = this.set("cookieName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookieName: Self = this.set("cookieName", js.undefined)
    
    @scala.inline
    def setCookiePath(value: js.Any): Self = this.set("cookiePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookiePath: Self = this.set("cookiePath", js.undefined)
    
    @scala.inline
    def setExpose(value: Boolean): Self = this.set("expose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpose: Self = this.set("expose", js.undefined)
    
    @scala.inline
    def setLocalStorage(value: Boolean): Self = this.set("localStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalStorage: Self = this.set("localStorage", js.undefined)
    
    @scala.inline
    def setLocalStorageKey(value: String): Self = this.set("localStorageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalStorageKey: Self = this.set("localStorageKey", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setNextButton(value: Boolean): Self = this.set("nextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextButton: Self = this.set("nextButton", js.undefined)
    
    @scala.inline
    def setNubPosition(value: js.Any): Self = this.set("nubPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNubPosition: Self = this.set("nubPosition", js.undefined)
    
    @scala.inline
    def setPauseAfterVarargs(value: js.Any*): Self = this.set("pauseAfter", js.Array(value :_*))
    
    @scala.inline
    def setPauseAfter(value: js.Array[_]): Self = this.set("pauseAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseAfter: Self = this.set("pauseAfter", js.undefined)
    
    @scala.inline
    def setPostExposeCallback(value: (/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery]) => Unit): Self = this.set("postExposeCallback", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePostExposeCallback: Self = this.set("postExposeCallback", js.undefined)
    
    @scala.inline
    def setPostRideCallback(value: (/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean]) => Unit): Self = this.set("postRideCallback", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePostRideCallback: Self = this.set("postRideCallback", js.undefined)
    
    @scala.inline
    def setPostStepCallback(value: (/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean]) => Unit): Self = this.set("postStepCallback", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePostStepCallback: Self = this.set("postStepCallback", js.undefined)
    
    @scala.inline
    def setPreRideCallback(value: (/* index */ Double, /* currentTip */ JQuery, /* el */ js.UndefOr[JQuery]) => Unit): Self = this.set("preRideCallback", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePreRideCallback: Self = this.set("preRideCallback", js.undefined)
    
    @scala.inline
    def setPreStepCallback(value: (/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery]) => Unit): Self = this.set("preStepCallback", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePreStepCallback: Self = this.set("preStepCallback", js.undefined)
    
    @scala.inline
    def setScroll(value: Boolean): Self = this.set("scroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    
    @scala.inline
    def setScrollSpeed(value: Double): Self = this.set("scrollSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSpeed: Self = this.set("scrollSpeed", js.undefined)
    
    @scala.inline
    def setStartOffset(value: Double): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartOffset: Self = this.set("startOffset", js.undefined)
    
    @scala.inline
    def setStartTimerOnClick(value: Boolean): Self = this.set("startTimerOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimerOnClick: Self = this.set("startTimerOnClick", js.undefined)
    
    @scala.inline
    def setTemplate(value: JoyrideTemplate): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setTimer(value: Double): Self = this.set("timer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimer: Self = this.set("timer", js.undefined)
    
    @scala.inline
    def setTipAnimation(value: String): Self = this.set("tipAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTipAnimation: Self = this.set("tipAnimation", js.undefined)
    
    @scala.inline
    def setTipAnimationFadeSpeed(value: Double): Self = this.set("tipAnimationFadeSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTipAnimationFadeSpeed: Self = this.set("tipAnimationFadeSpeed", js.undefined)
    
    @scala.inline
    def setTipContainer(value: HTMLElement): Self = this.set("tipContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTipContainer: Self = this.set("tipContainer", js.undefined)
    
    @scala.inline
    def setTipLocation(value: String): Self = this.set("tipLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTipLocation: Self = this.set("tipLocation", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
