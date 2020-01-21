package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `File` containing source content.
  */
@js.native
trait SchemaFile extends js.Object {
  /**
    * Textual Content.
    */
  var content: js.UndefOr[String] = js.native
  /**
    * Fingerprint (e.g. github sha) associated with the `File`.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * File name.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaFile {
  @scala.inline
  def apply(content: String = null, fingerprint: String = null, name: String = null): SchemaFile = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFile]
  }
}

