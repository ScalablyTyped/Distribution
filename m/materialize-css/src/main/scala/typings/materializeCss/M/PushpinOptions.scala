package typings.materializeCss.M

import typings.materializeCss.materializeCssStrings.`pin-bottom`
import typings.materializeCss.materializeCssStrings.`pin-top`
import typings.materializeCss.materializeCssStrings.pinned
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushpinOptions extends js.Object {
  
  /**
    * The distance in pixels from the top of the page where the elements stops being fixed
    * @default Infinity
    */
  var bottom: Double = js.native
  
  /**
    * The offset from the top the element will be fixed at
    * @default 0
    */
  var offset: Double = js.native
  
  @JSName("onPositionChange")
  def onPositionChange_pinbottom(position: `pin-bottom`): Unit = js.native
  /**
    * Callback function called when pushpin position changes. You are provided with a position string
    * @default null
    */
  @JSName("onPositionChange")
  def onPositionChange_pinned(position: pinned): Unit = js.native
  @JSName("onPositionChange")
  def onPositionChange_pintop(position: `pin-top`): Unit = js.native
  
  /**
    * The distance in pixels from the top of the page where the element becomes fixed
    * @default 0
    */
  var top: Double = js.native
}
