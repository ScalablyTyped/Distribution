package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instance rotate server CA context.
  */
@js.native
trait SchemaRotateServerCaContext extends js.Object {
  /**
    * This is always sql#rotateServerCaContext.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The fingerprint of the next version to be rotated to. If left
    * unspecified, will be rotated to the most recently added server CA
    * version.
    */
  var nextVersion: js.UndefOr[String] = js.native
}

object SchemaRotateServerCaContext {
  @scala.inline
  def apply(kind: String = null, nextVersion: String = null): SchemaRotateServerCaContext = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextVersion != null) __obj.updateDynamic("nextVersion")(nextVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRotateServerCaContext]
  }
}

