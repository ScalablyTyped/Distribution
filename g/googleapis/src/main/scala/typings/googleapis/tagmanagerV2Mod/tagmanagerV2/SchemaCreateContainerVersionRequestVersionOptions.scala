package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for new container versions.
  */
@js.native
trait SchemaCreateContainerVersionRequestVersionOptions extends js.Object {
  /**
    * The name of the container version to be created.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The notes of the container version to be created.
    */
  var notes: js.UndefOr[String] = js.native
}

object SchemaCreateContainerVersionRequestVersionOptions {
  @scala.inline
  def apply(name: String = null, notes: String = null): SchemaCreateContainerVersionRequestVersionOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreateContainerVersionRequestVersionOptions]
  }
}

