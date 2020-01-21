package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initializer is information about an initializer that has not yet completed.
  */
@js.native
trait SchemaInitializer extends js.Object {
  /**
    * name of the process that is responsible for initializing this object.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaInitializer {
  @scala.inline
  def apply(name: String = null): SchemaInitializer = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInitializer]
  }
}

