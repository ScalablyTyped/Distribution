package typings.ionicons.stencilPublicRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentWillLoad extends js.Object {
  /**
    * The component is about to load and it has not
    * rendered yet.
    *
    * This is the best place to make any data updates
    * before the first render.
    *
    * componentWillLoad will only be called once.
    */
  def componentWillLoad(): js.Promise[Unit] | Unit
}

object ComponentWillLoad {
  @scala.inline
  def apply(componentWillLoad: () => js.Promise[Unit] | Unit): ComponentWillLoad = {
    val __obj = js.Dynamic.literal(componentWillLoad = js.Any.fromFunction0(componentWillLoad))
    __obj.asInstanceOf[ComponentWillLoad]
  }
}

