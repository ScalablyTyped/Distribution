package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entity whose actions triggered a Gmail phishing alert.
  */
@js.native
trait SchemaMaliciousEntity extends js.Object {
  /**
    * The sender email address.
    */
  var fromHeader: js.UndefOr[String] = js.native
}

object SchemaMaliciousEntity {
  @scala.inline
  def apply(fromHeader: String = null): SchemaMaliciousEntity = {
    val __obj = js.Dynamic.literal()
    if (fromHeader != null) __obj.updateDynamic("fromHeader")(fromHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMaliciousEntity]
  }
}

