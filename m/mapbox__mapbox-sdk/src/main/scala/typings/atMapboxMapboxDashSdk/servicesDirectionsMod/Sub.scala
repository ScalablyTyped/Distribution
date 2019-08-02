package typings.atMapboxMapboxDashSdk.servicesDirectionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sub extends js.Object {
  /**
    * Objects that, together, make up what should be displayed in the banner.
    * Includes additional information intended to be used to aid in visual layout
    */
  var components: js.Array[Component]
  /**
    * String that contains all the text that should be displayed.
    */
  var text: String
}

object Sub {
  @scala.inline
  def apply(components: js.Array[Component], text: String): Sub = {
    val __obj = js.Dynamic.literal(components = components, text = text)
  
    __obj.asInstanceOf[Sub]
  }
}

