package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for a transaction that can only be used to read documents.
  */
@js.native
trait SchemaReadOnly extends js.Object {
  /**
    * Reads documents at the given time. This may not be older than 60 seconds.
    */
  var readTime: js.UndefOr[String] = js.native
}

object SchemaReadOnly {
  @scala.inline
  def apply(readTime: String = null): SchemaReadOnly = {
    val __obj = js.Dynamic.literal()
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReadOnly]
  }
}

