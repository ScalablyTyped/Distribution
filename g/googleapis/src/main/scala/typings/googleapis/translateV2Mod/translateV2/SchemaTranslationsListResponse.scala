package typings.googleapis.translateV2Mod.translateV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The main language translation response message.
  */
@js.native
trait SchemaTranslationsListResponse extends js.Object {
  /**
    * Translations contains list of translation results of given text
    */
  var translations: js.UndefOr[js.Array[SchemaTranslationsResource]] = js.native
}

object SchemaTranslationsListResponse {
  @scala.inline
  def apply(translations: js.Array[SchemaTranslationsResource] = null): SchemaTranslationsListResponse = {
    val __obj = js.Dynamic.literal()
    if (translations != null) __obj.updateDynamic("translations")(translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTranslationsListResponse]
  }
}

