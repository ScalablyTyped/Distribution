package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a folder&#39;s child.
  */
@js.native
trait SchemaChildReference extends js.Object {
  /**
    * A link to the child.
    */
  var childLink: js.UndefOr[String] = js.native
  /**
    * The ID of the child.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * This is always drive#childReference.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A link back to this reference.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaChildReference {
  @scala.inline
  def apply(childLink: String = null, id: String = null, kind: String = null, selfLink: String = null): SchemaChildReference = {
    val __obj = js.Dynamic.literal()
    if (childLink != null) __obj.updateDynamic("childLink")(childLink.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChildReference]
  }
}

