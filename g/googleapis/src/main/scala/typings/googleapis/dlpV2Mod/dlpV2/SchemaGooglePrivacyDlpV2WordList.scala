package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message defining a list of words or phrases to search for in the data.
  */
@js.native
trait SchemaGooglePrivacyDlpV2WordList extends js.Object {
  /**
    * Words or phrases defining the dictionary. The dictionary must contain at
    * least one phrase and every phrase must contain at least 2 characters that
    * are letters or digits. [required]
    */
  var words: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGooglePrivacyDlpV2WordList {
  @scala.inline
  def apply(words: js.Array[String] = null): SchemaGooglePrivacyDlpV2WordList = {
    val __obj = js.Dynamic.literal()
    if (words != null) __obj.updateDynamic("words")(words.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2WordList]
  }
}

