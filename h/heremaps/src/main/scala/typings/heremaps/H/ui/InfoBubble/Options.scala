package typings.heremaps.H.ui.InfoBubble

import typings.heremaps.H.util.Event
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * content to be added to the info bubble
    */
  var content: String | Node = js.native
  
  /**
    * a callback to be invoked when the info bubble's state changes
    * @param event {H.util.Event}
    */
  var onStateChange: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
}
object Options {
  
  @scala.inline
  def apply(content: String | Node): Options = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
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
    def setContent(value: String | Node): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnStateChange(value: /* event */ Event => Unit): Self = this.set("onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStateChange: Self = this.set("onStateChange", js.undefined)
  }
}
