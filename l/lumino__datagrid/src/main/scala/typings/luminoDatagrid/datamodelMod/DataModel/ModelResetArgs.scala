package typings.luminoDatagrid.datamodelMod.DataModel

import typings.luminoDatagrid.luminoDatagridStrings.`model-reset`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `changed` signal.
  *
  * #### Notes
  * Data models should emit the `changed` signal with this args object
  * type when the model has changed in a fashion that cannot be easily
  * expressed by the other args object types.
  *
  * This is the "big hammer" approach, and will cause any associated
  * data grid to perform a full reset. The other changed args types
  * should be used whenever possible.
  */
trait ModelResetArgs extends ChangedArgs {
  /**
    * The discriminated type of the args object.
    */
  val `type`: `model-reset`
}

object ModelResetArgs {
  @scala.inline
  def apply(`type`: `model-reset`): ModelResetArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelResetArgs]
  }
}

