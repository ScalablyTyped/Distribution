package typings.jqueryTypeahead.RunningCoder.Typeahead

import typings.jquery.JQueryEventObject
import typings.jqueryTypeahead.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  /** Perform operation on the source data before it gets in Typeahead cache */
  var onCacheSave: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* data */ js.UndefOr[js.Any], 
      /* group */ js.UndefOr[js.Any], 
      /* path */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /**
    * Any time there is text inside the input and it gets cleared (Backspace, Esc, Cancel button, etc).
    * It is possible to track back the event that cleared the input using event.originalEvent
    */
  var onCancel: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* event */ js.UndefOr[JQueryEventObject], Unit]
  ] = js.native
  /**
    * Will be executed when a result item is clicked or the right arrow is pressed when an item is selected from
    * the results list. This function will trigger before the regular behaviors.
    */
  var onClick: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /**
    * Will be executed when a result item is clicked or the right arrow is pressed when an item is selected from
    * the results list. This function will trigger after the regular behaviors.
    */
  var onClickAfter: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /**
    * Will be executed when a result item is clicked or the right arrow is pressed when an item is selected from
    * the results list. This function will trigger before the regular behaviors.
    */
  var onClickBefore: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /** Will be executed when a dropdown filter is selected. Requires `dropdownFilter: true`. */
  var onDropdownFilter: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /** When an item in the result list is focused */
  var onEnter: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* result */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /** Triggers when the Typeahead results layout is requested to hide. */
  var onHideLayout: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
  ] = js.native
  /** Will be executed on Typeahead initialization, before anything else. */
  var onInit: js.UndefOr[js.Function1[/* node */ js.UndefOr[JQuery], Unit]] = js.native
  /** Perform an action right after the result HTML gets inserted into Typeahead's DOM. */
  var onLayoutBuiltAfter: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[JQuery], 
      /* query */ js.UndefOr[String], 
      /* result */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /**
    * When the result HTML is build, modify it before it get showed.
    * This callback should be used to modify the result DOM before it gets inserted into Typeahead.
    * * If you are using this callback, the resultHtmlList param needs to be returned at the end of your function.
    */
  var onLayoutBuiltBefore: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* query */ js.UndefOr[String], 
      /* result */ js.UndefOr[js.Any], 
      /* resultHtmlList */ js.UndefOr[JQuery], 
      JQuery
    ]
  ] = js.native
  /** When an item in the result list is blurred */
  var onLeave: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* result */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /** Will be executed when a item is hovered inside the result list. */
  var onMouseEnter: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /** Will be executed when a result item is hovered out. */
  var onMouseLeave: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /** Called at the end of Navigate (once the `.active` class and other operations are completed). */
  var onNavigateAfter: js.UndefOr[
    js.Function6[
      /* node */ js.UndefOr[JQuery], 
      /* lis */ js.UndefOr[JQuery], 
      /* a */ js.UndefOr[JQuery], 
      /* item */ js.UndefOr[js.Any], 
      /* query */ js.UndefOr[String], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /**
    * When a key is pressed to navigate the results. It is possible to disable the input text change
    * when using up and down arrows when `event.preventInputChange` is set to true
    */
  var onNavigateBefore: js.UndefOr[
    js.Function3[
      /* node */ js.UndefOr[JQuery], 
      /* query */ js.UndefOr[String], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
  /**
    * Gets called after the Ajax requests are all received and the data is populated inside Typeahead.
    * This is the place where extra parsing or filtering should occure before the data gets available inside any Typeahead query
    * For example, the Backend sends the "display" key separated by underscores "_" instead of spaces " ".
    * * The `data` parameter HAS to be returned after it's transformed.
    */
  var onPopulateSource: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* data */ js.UndefOr[js.Array[_]], 
      /* group */ js.UndefOr[js.Any], 
      /* path */ js.UndefOr[js.Any], 
      js.Array[_]
    ]
  ] = js.native
  /** Triggers when the Typeahead initial preparation is completed. */
  var onReady: js.UndefOr[js.Function1[/* node */ js.UndefOr[JQuery], Unit]] = js.native
  /** Gets called when the Ajax request(s) are all received */
  var onReceiveRequest: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
  ] = js.native
  /** Whenever the result changes, this callback will be triggered. */
  var onResult: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* query */ js.UndefOr[String], 
      /* result */ js.UndefOr[js.Any], 
      /* resultCount */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  /** Triggers every time a new search is executed in Typeahead. */
  var onSearch: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
  ] = js.native
  /** Gets called when the Ajax request(s) are sent. Either on initial requests or on every dynamic requests. */
  var onSendRequest: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
  ] = js.native
  /** Triggers when the Typeahead results layout is displayed. */
  var onShowLayout: js.UndefOr[
    js.Function2[/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], Unit]
  ] = js.native
  /**
    * Override the native onSubmit function by your own.
    * If after performing a set of action(s) you want to submit the form, simply do `form.submit()`.
    * * The item parameter is not always defined. An item object will be sent if the submit happens after an item from the list has been selected.
    */
  var onSubmit: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[JQuery], 
      /* form */ js.UndefOr[js.Any], 
      /* item */ js.UndefOr[js.Any], 
      /* event */ js.UndefOr[JQueryEventObject], 
      Unit
    ]
  ] = js.native
}

object Callback {
  @scala.inline
  def apply(): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callback]
  }
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
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
    def setOnCacheSave(
      value: (/* node */ js.UndefOr[JQuery], /* data */ js.UndefOr[js.Any], /* group */ js.UndefOr[js.Any], /* path */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onCacheSave", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnCacheSave: Self = this.set("onCacheSave", js.undefined)
    @scala.inline
    def setOnCancel(value: (/* node */ js.UndefOr[JQuery], /* event */ js.UndefOr[JQueryEventObject]) => Unit): Self = this.set("onCancel", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnClick(
      value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnClickAfter(
      value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = this.set("onClickAfter", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnClickAfter: Self = this.set("onClickAfter", js.undefined)
    @scala.inline
    def setOnClickBefore(
      value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = this.set("onClickBefore", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnClickBefore: Self = this.set("onClickBefore", js.undefined)
    @scala.inline
    def setOnDropdownFilter(
      value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = this.set("onDropdownFilter", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnDropdownFilter: Self = this.set("onDropdownFilter", js.undefined)
    @scala.inline
    def setOnEnter(
      value: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = this.set("onEnter", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnEnter: Self = this.set("onEnter", js.undefined)
    @scala.inline
    def setOnHideLayout(value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => Unit): Self = this.set("onHideLayout", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnHideLayout: Self = this.set("onHideLayout", js.undefined)
    @scala.inline
    def setOnInit(value: /* node */ js.UndefOr[JQuery] => Unit): Self = this.set("onInit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInit: Self = this.set("onInit", js.undefined)
    @scala.inline
    def setOnLayoutBuiltAfter(
      value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* result */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onLayoutBuiltAfter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnLayoutBuiltAfter: Self = this.set("onLayoutBuiltAfter", js.undefined)
    @scala.inline
    def setOnLayoutBuiltBefore(
      value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* result */ js.UndefOr[js.Any], /* resultHtmlList */ js.UndefOr[JQuery]) => JQuery
    ): Self = this.set("onLayoutBuiltBefore", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnLayoutBuiltBefore: Self = this.set("onLayoutBuiltBefore", js.undefined)
    @scala.inline
    def setOnLeave(
      value: (/* node */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = this.set("onLeave", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnLeave: Self = this.set("onLeave", js.undefined)
    @scala.inline
    def setOnMouseEnter(
      value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = this.set("onMouseEnter", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnMouseEnter: Self = this.set("onMouseEnter", js.undefined)
    @scala.inline
    def setOnMouseLeave(
      value: (/* node */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = this.set("onMouseLeave", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnMouseLeave: Self = this.set("onMouseLeave", js.undefined)
    @scala.inline
    def setOnNavigateAfter(
      value: (/* node */ js.UndefOr[JQuery], /* lis */ js.UndefOr[JQuery], /* a */ js.UndefOr[JQuery], /* item */ js.UndefOr[js.Any], /* query */ js.UndefOr[String], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = this.set("onNavigateAfter", js.Any.fromFunction6(value))
    @scala.inline
    def deleteOnNavigateAfter: Self = this.set("onNavigateAfter", js.undefined)
    @scala.inline
    def setOnNavigateBefore(
      value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = this.set("onNavigateBefore", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnNavigateBefore: Self = this.set("onNavigateBefore", js.undefined)
    @scala.inline
    def setOnPopulateSource(
      value: (/* node */ js.UndefOr[JQuery], /* data */ js.UndefOr[js.Array[_]], /* group */ js.UndefOr[js.Any], /* path */ js.UndefOr[js.Any]) => js.Array[_]
    ): Self = this.set("onPopulateSource", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnPopulateSource: Self = this.set("onPopulateSource", js.undefined)
    @scala.inline
    def setOnReady(value: /* node */ js.UndefOr[JQuery] => Unit): Self = this.set("onReady", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    @scala.inline
    def setOnReceiveRequest(value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => Unit): Self = this.set("onReceiveRequest", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnReceiveRequest: Self = this.set("onReceiveRequest", js.undefined)
    @scala.inline
    def setOnResult(
      value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String], /* result */ js.UndefOr[js.Any], /* resultCount */ js.UndefOr[Double]) => Unit
    ): Self = this.set("onResult", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnResult: Self = this.set("onResult", js.undefined)
    @scala.inline
    def setOnSearch(value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => Unit): Self = this.set("onSearch", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSearch: Self = this.set("onSearch", js.undefined)
    @scala.inline
    def setOnSendRequest(value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => Unit): Self = this.set("onSendRequest", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnSendRequest: Self = this.set("onSendRequest", js.undefined)
    @scala.inline
    def setOnShowLayout(value: (/* node */ js.UndefOr[JQuery], /* query */ js.UndefOr[String]) => Unit): Self = this.set("onShowLayout", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnShowLayout: Self = this.set("onShowLayout", js.undefined)
    @scala.inline
    def setOnSubmit(
      value: (/* node */ js.UndefOr[JQuery], /* form */ js.UndefOr[js.Any], /* item */ js.UndefOr[js.Any], /* event */ js.UndefOr[JQueryEventObject]) => Unit
    ): Self = this.set("onSubmit", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
  }
  
}

