package typings
package ioniconsLib.distTypesStencilDotCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentWillUpdate extends js.Object {
  /**
    * The component is about to update and re-render.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the first render.
    */
  def componentWillUpdate(): js.Promise[scala.Unit] | scala.Unit
}

object ComponentWillUpdate {
  @scala.inline
  def apply(componentWillUpdate: () => js.Promise[scala.Unit] | scala.Unit): ComponentWillUpdate = {
    val __obj = js.Dynamic.literal(componentWillUpdate = js.Any.fromFunction0(componentWillUpdate))
  
    __obj.asInstanceOf[ComponentWillUpdate]
  }
}

