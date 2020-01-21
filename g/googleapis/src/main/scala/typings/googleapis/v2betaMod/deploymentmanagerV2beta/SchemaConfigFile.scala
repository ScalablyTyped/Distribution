package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConfigFile extends js.Object {
  /**
    * The contents of the file.
    */
  var content: js.UndefOr[String] = js.native
}

object SchemaConfigFile {
  @scala.inline
  def apply(content: String = null): SchemaConfigFile = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaConfigFile]
  }
}

