package typings.jqueryEasyLoading.JQueryEasyLoading

import typings.jqueryEasyLoading.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Class(es) to be applied to the overlay element when the loading state is stopped
    */
  var hiddenClass: js.UndefOr[String] = js.native
  
  /**
    * Message to be rendered on the overlay content
    * Has no effect if a custom overlay is defined
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * Function to be executed when the overlay is clicked
    * Receives the loading object as parameter
    *
    * The function is attached to the `loading.click` event
    */
  var onClick: js.UndefOr[js.Function] = js.native
  
  /**
    * Function to be executed when the loading state is started
    * Receives the loading object as parameter
    *
    * The function is attached to the `loading.start` event
    */
  var onStart: js.UndefOr[js.Function1[/* loading */ LoadingObject, Unit]] = js.native
  
  /**
    * Function to be executed when the loading state is stopped
    * Receives the loading object as parameter
    *
    * The function is attached to the `loading.stop` event
    */
  var onStop: js.UndefOr[js.Function1[/* loading */ LoadingObject, Unit]] = js.native
  
  /**
    * jQuery element to be used as overlay
    * If not defined, a default overlay will be created
    */
  var overlay: js.UndefOr[JQuery] = js.native
  
  /**
    * Class(es) to be applied to the overlay element when the loading state is started
    */
  var shownClass: js.UndefOr[String] = js.native
  
  /**
    * Set to false to not start the loading state when initialized
    */
  var start: js.UndefOr[Boolean] = js.native
  
  /**
    * Set to true to stop the loading state if the overlay is clicked
    * This options does NOT override the onClick event
    */
  var stoppable: js.UndefOr[Boolean] = js.native
  
  /**
    * Theme to be applied on the loading element
    *
    * Some default themes are implemented on `jquery.loading.css`, but you can
    *  define your own. Just add a `.loading-theme-my_awesome_theme` selector
    *  somewhere with your custom styles and change this option
    *  to 'my_awesome_theme'. The class is applied to the parent overlay div
    *
    * Has no effect if a custom overlay is defined
    */
  var theme: js.UndefOr[String] = js.native
  
  /**
    * z-index to be used by the default overlay
    * If not defined, a z-index will be calculated based on the
    * target's z-index
    * Has no effect if a custom overlay is defined
    */
  var zIndex: js.UndefOr[Double] = js.native
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
    def setHiddenClass(value: String): Self = this.set("hiddenClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHiddenClass: Self = this.set("hiddenClass", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setOnClick(value: js.Function): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnStart(value: /* loading */ LoadingObject => Unit): Self = this.set("onStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
    
    @scala.inline
    def setOnStop(value: /* loading */ LoadingObject => Unit): Self = this.set("onStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStop: Self = this.set("onStop", js.undefined)
    
    @scala.inline
    def setOverlay(value: JQuery): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setShownClass(value: String): Self = this.set("shownClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShownClass: Self = this.set("shownClass", js.undefined)
    
    @scala.inline
    def setStart(value: Boolean): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStoppable(value: Boolean): Self = this.set("stoppable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoppable: Self = this.set("stoppable", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
