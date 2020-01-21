package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A property of an index.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1IndexedProperty extends js.Object {
  /**
    * The indexed property&#39;s direction.  Must not be DIRECTION_UNSPECIFIED.
    * Required.
    */
  var direction: js.UndefOr[String] = js.native
  /**
    * The property name to index. Required.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGoogleDatastoreAdminV1IndexedProperty {
  @scala.inline
  def apply(direction: String = null, name: String = null): SchemaGoogleDatastoreAdminV1IndexedProperty = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1IndexedProperty]
  }
}

