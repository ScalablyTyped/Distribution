package typings.materializeCss.M

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the Tabs
  */
@js.native
trait TabsOptions extends js.Object {
  
  /**
    * Transition duration in milliseconds.
    * @default 300
    */
  var duration: Double = js.native
  
  /**
    * Callback for when a new tab content is shown
    */
  def onShow(newContent: Element): Unit = js.native
  
  /**
    * The maximum width of the screen, in pixels, where the swipeable functionality initializes.
    * @default infinity
    */
  var responsiveThreshold: Double = js.native
  
  /**
    * Set to true to enable swipeable tabs. This also uses the responsiveThreshold option
    * @default false
    */
  var swipeable: Boolean = js.native
}
object TabsOptions {
  
  @scala.inline
  def apply(duration: Double, onShow: Element => Unit, responsiveThreshold: Double, swipeable: Boolean): TabsOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], onShow = js.Any.fromFunction1(onShow), responsiveThreshold = responsiveThreshold.asInstanceOf[js.Any], swipeable = swipeable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsOptions]
  }
  
  @scala.inline
  implicit class TabsOptionsOps[Self <: TabsOptions] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShow(value: Element => Unit): Self = this.set("onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResponsiveThreshold(value: Double): Self = this.set("responsiveThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeable(value: Boolean): Self = this.set("swipeable", value.asInstanceOf[js.Any])
  }
}
