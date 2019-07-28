package typings.ionicons.distTypesStencilDotCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDidUpdate extends js.Object {
  /**
    * The component has just re-rendered.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the
    * first render.
    */
  def componentDidUpdate(): Unit
}

object ComponentDidUpdate {
  @scala.inline
  def apply(componentDidUpdate: () => Unit): ComponentDidUpdate = {
    val __obj = js.Dynamic.literal(componentDidUpdate = js.Any.fromFunction0(componentDidUpdate))
  
    __obj.asInstanceOf[ComponentDidUpdate]
  }
}

