package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A precondition on a document, used for conditional operations.
  */
@js.native
trait SchemaPrecondition extends js.Object {
  /**
    * When set to `true`, the target document must exist. When set to `false`,
    * the target document must not exist.
    */
  var exists: js.UndefOr[Boolean] = js.native
  /**
    * When set, the target document must exist and have been last updated at
    * that time.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaPrecondition {
  @scala.inline
  def apply(exists: js.UndefOr[Boolean] = js.undefined, updateTime: String = null): SchemaPrecondition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exists)) __obj.updateDynamic("exists")(exists.get.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPrecondition]
  }
}

