package typings
package ioniconsLib.distTypesStencilDotCoreMod

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
  def componentDidLoad(): scala.Unit
}

object ComponentDidLoad {
  @scala.inline
  def apply(componentDidLoad: () => scala.Unit): ComponentDidLoad = {
    val __obj = js.Dynamic.literal(componentDidLoad = js.Any.fromFunction0(componentDidLoad))
  
    __obj.asInstanceOf[ComponentDidLoad]
  }
}

