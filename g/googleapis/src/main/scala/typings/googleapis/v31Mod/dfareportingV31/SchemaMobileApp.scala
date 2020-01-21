package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information about a mobile app. Used as a landing page deep link.
  */
@js.native
trait SchemaMobileApp extends js.Object {
  /**
    * Mobile app directory.
    */
  var directory: js.UndefOr[String] = js.native
  /**
    * ID of this mobile app.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#mobileApp&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Publisher name.
    */
  var publisherName: js.UndefOr[String] = js.native
  /**
    * Title of this mobile app.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaMobileApp {
  @scala.inline
  def apply(
    directory: String = null,
    id: String = null,
    kind: String = null,
    publisherName: String = null,
    title: String = null
  ): SchemaMobileApp = {
    val __obj = js.Dynamic.literal()
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (publisherName != null) __obj.updateDynamic("publisherName")(publisherName.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMobileApp]
  }
}

