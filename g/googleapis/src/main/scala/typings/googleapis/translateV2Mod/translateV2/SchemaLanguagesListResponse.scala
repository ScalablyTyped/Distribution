package typings.googleapis.translateV2Mod.translateV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLanguagesListResponse extends js.Object {
  /**
    * List of source/target languages supported by the translation API. If
    * target parameter is unspecified, the list is sorted by the ASCII code
    * point order of the language code. If target parameter is specified, the
    * list is sorted by the collation order of the language name in the target
    * language.
    */
  var languages: js.UndefOr[js.Array[SchemaLanguagesResource]] = js.native
}

object SchemaLanguagesListResponse {
  @scala.inline
  def apply(languages: js.Array[SchemaLanguagesResource] = null): SchemaLanguagesListResponse = {
    val __obj = js.Dynamic.literal()
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLanguagesListResponse]
  }
}

