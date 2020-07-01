package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Publish container version response.
  */
@js.native
trait SchemaPublishContainerVersionResponse extends js.Object {
  /**
    * Compiler errors or not.
    */
  var compilerError: js.UndefOr[Boolean] = js.native
  /**
    * The container version created.
    */
  var containerVersion: js.UndefOr[SchemaContainerVersion] = js.native
}

object SchemaPublishContainerVersionResponse {
  @scala.inline
  def apply(compilerError: js.UndefOr[Boolean] = js.undefined, containerVersion: SchemaContainerVersion = null): SchemaPublishContainerVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compilerError)) __obj.updateDynamic("compilerError")(compilerError.get.asInstanceOf[js.Any])
    if (containerVersion != null) __obj.updateDynamic("containerVersion")(containerVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPublishContainerVersionResponse]
  }
}

