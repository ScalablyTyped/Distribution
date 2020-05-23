package typings.jqueryJoyride.mod.global

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoyrideOptions extends js.Object {
  /**
    * true or false - false tour starts when restart called
    * @member {boolean}
    */
  var autoStart: js.UndefOr[Boolean] = js.undefined
  /**
    * Will this cookie be attached to a domain, ie. '.notableapp.com'
    * @member {any}
    */
  var cookieDomain: js.UndefOr[js.Any] = js.undefined
  /**
    * true/false for whether cookies are used
    * @member {boolean}
    */
  var cookieMonster: js.UndefOr[Boolean] = js.undefined
  /**
    * choose your own cookie name
    * member {string}
    */
  var cookieName: js.UndefOr[String] = js.undefined
  /**
    * Set to '/' if you want the cookie for the whole website
    * @member {any}
    */
  var cookiePath: js.UndefOr[js.Any] = js.undefined
  /**
    *  Whether to expose the elements at each step in the tour (requires modal:true)
    * @member {boolean}
    */
  var expose: js.UndefOr[Boolean] = js.undefined
  /**
    * true or false to control whether localstorage is used
    * @member {boolean}
    */
  var localStorage: js.UndefOr[Boolean] = js.undefined
  /**
    * Keyname in localstorage
    @member {string}
    */
  var localStorageKey: js.UndefOr[String] = js.undefined
  /**
    * Whether to cover page with modal during the tour
    * @member {boolean}
    */
  var modal: js.UndefOr[Boolean] = js.undefined
  /**
    * true/false for next button visibility
    * @member {boolean}
    */
  var nextButton: js.UndefOr[Boolean] = js.undefined
  /**
    * override on a per tooltip bases
    * @member {any}
    */
  var nubPosition: js.UndefOr[js.Any] = js.undefined
  /**
    * array of indexes where to pause the tour after
    * @member {any[]}
    */
  var pauseAfter: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * A method to call after an element has been exposed
    * @method
    * @param {number} index Tip Index
    * @param {JQuery} nextTip Tip object
    * @param {JQuery} el Element
    */
  var postExposeCallback: js.UndefOr[
    js.Function3[/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery], Unit]
  ] = js.undefined
  /**
    * a method to call once the tour closes
    * @method
    * @param {number} index Current Tip Index
    * @param {JQuery} currentTip Current Tip object
    * @param {boolean} isAborted Is Aborted?
    */
  var postRideCallback: js.UndefOr[
    js.Function3[/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /**
    * A method to call after each step
    * @method
    * @param {number} index Current Tip Index
    * @param {JQuery} currentTip Current Tip object
    * @param {boolean} isAborted Is Aborted?
    */
  var postStepCallback: js.UndefOr[
    js.Function3[/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /**
    * A method to call before the tour starts (passed index, tip, and cloned exposed element)
    * @method
    * @param {number} index Current Tip Index
    * @param {JQuery} currentTip Current Tip object
    * @param {JQuery} el Element
    */
  var preRideCallback: js.UndefOr[
    js.Function3[/* index */ Double, /* currentTip */ JQuery, /* el */ js.UndefOr[JQuery], Unit]
  ] = js.undefined
  /**
    * A method to call before each step
    * @method
    * @param {number} index Tip Index
    * @param {JQuery} nextTip Tip object
    * @param {JQuery} el Element
    */
  var preStepCallback: js.UndefOr[
    js.Function3[/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery], Unit]
  ] = js.undefined
  /**
    * whether to scroll to tips
    * @member {boolean}
    */
  var scroll: js.UndefOr[Boolean] = js.undefined
  /**
    * Page scrolling speed in ms
    * @member {number}
    */
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  /**
    * the index of the tooltip you want to start on (index of the li)
    * @member {number}
    */
  var startOffset: js.UndefOr[Double] = js.undefined
  /**
    * true/false to start timer on first click
    * @member {boolean}
    */
  var startTimerOnClick: js.UndefOr[Boolean] = js.undefined
  /**
    * HTML segments for tip layout
    * @member {JoyrideTemplate}
    */
  var template: js.UndefOr[JoyrideTemplate] = js.undefined
  /**
    * 0 = off, all other numbers = time(ms)
    * @member {number}
    */
  var timer: js.UndefOr[Double] = js.undefined
  /**
    * 'pop' or 'fade' in each tip
    * @member {string}
    */
  var tipAnimation: js.UndefOr[String] = js.undefined
  /**
    * if 'fade'- speed in ms of transition
    * @member {number}
    */
  var tipAnimationFadeSpeed: js.UndefOr[Double] = js.undefined
  /**
    * Where the tip be attached if not inline
    * @member {HTMLElement}
    */
  var tipContainer: js.UndefOr[HTMLElement] = js.undefined
  /**
    * 'top' or 'bottom' in relation to parent
    * @member {string}
    */
  var tipLocation: js.UndefOr[String] = js.undefined
  /**
    * Version
    * @member {string}
    */
  var version: js.UndefOr[String] = js.undefined
}

object JoyrideOptions {
  @scala.inline
  def apply(
    autoStart: js.UndefOr[Boolean] = js.undefined,
    cookieDomain: js.Any = null,
    cookieMonster: js.UndefOr[Boolean] = js.undefined,
    cookieName: String = null,
    cookiePath: js.Any = null,
    expose: js.UndefOr[Boolean] = js.undefined,
    localStorage: js.UndefOr[Boolean] = js.undefined,
    localStorageKey: String = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    nextButton: js.UndefOr[Boolean] = js.undefined,
    nubPosition: js.Any = null,
    pauseAfter: js.Array[_] = null,
    postExposeCallback: (/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery]) => Unit = null,
    postRideCallback: (/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean]) => Unit = null,
    postStepCallback: (/* index */ Double, /* currentTip */ JQuery, /* isAborted */ js.UndefOr[Boolean]) => Unit = null,
    preRideCallback: (/* index */ Double, /* currentTip */ JQuery, /* el */ js.UndefOr[JQuery]) => Unit = null,
    preStepCallback: (/* index */ Double, /* nextTip */ JQuery, /* el */ js.UndefOr[JQuery]) => Unit = null,
    scroll: js.UndefOr[Boolean] = js.undefined,
    scrollSpeed: js.UndefOr[Double] = js.undefined,
    startOffset: js.UndefOr[Double] = js.undefined,
    startTimerOnClick: js.UndefOr[Boolean] = js.undefined,
    template: JoyrideTemplate = null,
    timer: js.UndefOr[Double] = js.undefined,
    tipAnimation: String = null,
    tipAnimationFadeSpeed: js.UndefOr[Double] = js.undefined,
    tipContainer: HTMLElement = null,
    tipLocation: String = null,
    version: String = null
  ): JoyrideOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.get.asInstanceOf[js.Any])
    if (cookieDomain != null) __obj.updateDynamic("cookieDomain")(cookieDomain.asInstanceOf[js.Any])
    if (!js.isUndefined(cookieMonster)) __obj.updateDynamic("cookieMonster")(cookieMonster.get.asInstanceOf[js.Any])
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName.asInstanceOf[js.Any])
    if (cookiePath != null) __obj.updateDynamic("cookiePath")(cookiePath.asInstanceOf[js.Any])
    if (!js.isUndefined(expose)) __obj.updateDynamic("expose")(expose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(localStorage)) __obj.updateDynamic("localStorage")(localStorage.get.asInstanceOf[js.Any])
    if (localStorageKey != null) __obj.updateDynamic("localStorageKey")(localStorageKey.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nextButton)) __obj.updateDynamic("nextButton")(nextButton.get.asInstanceOf[js.Any])
    if (nubPosition != null) __obj.updateDynamic("nubPosition")(nubPosition.asInstanceOf[js.Any])
    if (pauseAfter != null) __obj.updateDynamic("pauseAfter")(pauseAfter.asInstanceOf[js.Any])
    if (postExposeCallback != null) __obj.updateDynamic("postExposeCallback")(js.Any.fromFunction3(postExposeCallback))
    if (postRideCallback != null) __obj.updateDynamic("postRideCallback")(js.Any.fromFunction3(postRideCallback))
    if (postStepCallback != null) __obj.updateDynamic("postStepCallback")(js.Any.fromFunction3(postStepCallback))
    if (preRideCallback != null) __obj.updateDynamic("preRideCallback")(js.Any.fromFunction3(preRideCallback))
    if (preStepCallback != null) __obj.updateDynamic("preStepCallback")(js.Any.fromFunction3(preStepCallback))
    if (!js.isUndefined(scroll)) __obj.updateDynamic("scroll")(scroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSpeed)) __obj.updateDynamic("scrollSpeed")(scrollSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startOffset)) __obj.updateDynamic("startOffset")(startOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startTimerOnClick)) __obj.updateDynamic("startTimerOnClick")(startTimerOnClick.get.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(timer)) __obj.updateDynamic("timer")(timer.get.asInstanceOf[js.Any])
    if (tipAnimation != null) __obj.updateDynamic("tipAnimation")(tipAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(tipAnimationFadeSpeed)) __obj.updateDynamic("tipAnimationFadeSpeed")(tipAnimationFadeSpeed.get.asInstanceOf[js.Any])
    if (tipContainer != null) __obj.updateDynamic("tipContainer")(tipContainer.asInstanceOf[js.Any])
    if (tipLocation != null) __obj.updateDynamic("tipLocation")(tipLocation.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoyrideOptions]
  }
}

