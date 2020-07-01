package typings.googleapis.driveV2Mod.driveV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a file&#39;s parent.
  */
@js.native
trait SchemaParentReference extends js.Object {
  /**
    * The ID of the parent.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether or not the parent is the root folder.
    */
  var isRoot: js.UndefOr[Boolean] = js.native
  /**
    * This is always drive#parentReference.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A link to the parent.
    */
  var parentLink: js.UndefOr[String] = js.native
  /**
    * A link back to this reference.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaParentReference {
  @scala.inline
  def apply(
    id: String = null,
    isRoot: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    parentLink: String = null,
    selfLink: String = null
  ): SchemaParentReference = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isRoot)) __obj.updateDynamic("isRoot")(isRoot.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaParentReference]
  }
}

