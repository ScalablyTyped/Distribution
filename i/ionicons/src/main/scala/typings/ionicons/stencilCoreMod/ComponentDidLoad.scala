package typings.ionicons.stencilCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentDidLoad extends js.Object {
  /**
    * The component has loaded and has already rendered.
    *
    * Updating data in this method will cause the
    * component to re-render.
    *
    * componentDidLoad will only be called once.
    */
  def componentDidLoad(): Unit
}

object ComponentDidLoad {
  @scala.inline
  def apply(componentDidLoad: () => Unit): ComponentDidLoad = {
    val __obj = js.Dynamic.literal(componentDidLoad = js.Any.fromFunction0(componentDidLoad))
  
    __obj.asInstanceOf[ComponentDidLoad]
  }
}

