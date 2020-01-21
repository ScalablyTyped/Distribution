package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a SQL database on the Cloud SQL instance.
  */
@js.native
trait SchemaDatabase extends js.Object {
  /**
    * The MySQL charset value.
    */
  var charset: js.UndefOr[String] = js.native
  /**
    * The MySQL collation value.
    */
  var collation: js.UndefOr[String] = js.native
  /**
    * This field is deprecated and will be removed from a future version of the
    * API.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The name of the Cloud SQL instance. This does not include the project ID.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * This is always sql#database.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The name of the database in the Cloud SQL instance. This does not include
    * the project ID or instance name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The project ID of the project containing the Cloud SQL database. The
    * Google apps domain is prefixed if applicable.
    */
  var project: js.UndefOr[String] = js.native
  /**
    * The URI of this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
}

object SchemaDatabase {
  @scala.inline
  def apply(
    charset: String = null,
    collation: String = null,
    etag: String = null,
    instance: String = null,
    kind: String = null,
    name: String = null,
    project: String = null,
    selfLink: String = null
  ): SchemaDatabase = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatabase]
  }
}

