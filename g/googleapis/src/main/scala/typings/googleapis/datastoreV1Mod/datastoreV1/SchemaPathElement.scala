package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A (kind, ID/name) pair used to construct a key path.  If either name or ID
  * is set, the element is complete. If neither is set, the element is
  * incomplete.
  */
@js.native
trait SchemaPathElement extends js.Object {
  /**
    * The auto-allocated ID of the entity. Never equal to zero. Values less
    * than zero are discouraged and may not be supported in the future.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of the entity. A kind matching regex `__.*__` is
    * reserved/read-only. A kind must not contain more than 1500 bytes when
    * UTF-8 encoded. Cannot be `&quot;&quot;`.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the entity. A name matching regex `__.*__` is
    * reserved/read-only. A name must not be more than 1500 bytes when UTF-8
    * encoded. Cannot be `&quot;&quot;`.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaPathElement {
  @scala.inline
  def apply(id: String = null, kind: String = null, name: String = null): SchemaPathElement = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPathElement]
  }
}

