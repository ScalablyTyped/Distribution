package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Language List Response
  */
@js.native
trait SchemaLanguagesListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#languagesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Language collection.
    */
  var languages: js.UndefOr[js.Array[SchemaLanguage]] = js.native
}

object SchemaLanguagesListResponse {
  @scala.inline
  def apply(kind: String = null, languages: js.Array[SchemaLanguage] = null): SchemaLanguagesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLanguagesListResponse]
  }
}

