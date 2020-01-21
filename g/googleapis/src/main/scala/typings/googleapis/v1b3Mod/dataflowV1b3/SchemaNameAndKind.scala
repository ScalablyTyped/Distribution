package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic metadata about a counter.
  */
@js.native
trait SchemaNameAndKind extends js.Object {
  /**
    * Counter aggregation kind.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the counter.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaNameAndKind {
  @scala.inline
  def apply(kind: String = null, name: String = null): SchemaNameAndKind = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNameAndKind]
  }
}

