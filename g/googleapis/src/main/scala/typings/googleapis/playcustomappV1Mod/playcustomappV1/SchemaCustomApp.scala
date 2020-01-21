package typings.googleapis.playcustomappV1Mod.playcustomappV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This resource represents a custom app.
  */
@js.native
trait SchemaCustomApp extends js.Object {
  /**
    * Default listing language in BCP 47 format.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * Title for the Android app.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaCustomApp {
  @scala.inline
  def apply(languageCode: String = null, title: String = null): SchemaCustomApp = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCustomApp]
  }
}

