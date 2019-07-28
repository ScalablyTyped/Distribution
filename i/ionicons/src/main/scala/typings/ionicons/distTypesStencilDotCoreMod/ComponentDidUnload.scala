package typings.ionicons.distTypesStencilDotCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDidUnload extends js.Object {
  /**
    * The component did unload and the element
    * will be destroyed.
    */
  def componentDidUnload(): Unit
}

object ComponentDidUnload {
  @scala.inline
  def apply(componentDidUnload: () => Unit): ComponentDidUnload = {
    val __obj = js.Dynamic.literal(componentDidUnload = js.Any.fromFunction0(componentDidUnload))
  
    __obj.asInstanceOf[ComponentDidUnload]
  }
}

