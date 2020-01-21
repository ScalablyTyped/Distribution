package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamic Links warning messages.
  */
@js.native
trait SchemaDynamicLinkWarning extends js.Object {
  /**
    * The warning code.
    */
  var warningCode: js.UndefOr[String] = js.native
  /**
    * The document describing the warning, and helps resolve.
    */
  var warningDocumentLink: js.UndefOr[String] = js.native
  /**
    * The warning message to help developers improve their requests.
    */
  var warningMessage: js.UndefOr[String] = js.native
}

object SchemaDynamicLinkWarning {
  @scala.inline
  def apply(warningCode: String = null, warningDocumentLink: String = null, warningMessage: String = null): SchemaDynamicLinkWarning = {
    val __obj = js.Dynamic.literal()
    if (warningCode != null) __obj.updateDynamic("warningCode")(warningCode.asInstanceOf[js.Any])
    if (warningDocumentLink != null) __obj.updateDynamic("warningDocumentLink")(warningDocumentLink.asInstanceOf[js.Any])
    if (warningMessage != null) __obj.updateDynamic("warningMessage")(warningMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDynamicLinkWarning]
  }
}

