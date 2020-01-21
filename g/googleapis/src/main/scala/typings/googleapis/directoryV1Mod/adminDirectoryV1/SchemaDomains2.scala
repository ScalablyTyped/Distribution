package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template to list Domains in Directory API.
  */
@js.native
trait SchemaDomains2 extends js.Object {
  /**
    * List of domain objects.
    */
  var domains: js.UndefOr[js.Array[SchemaDomains]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDomains2 {
  @scala.inline
  def apply(domains: js.Array[SchemaDomains] = null, etag: String = null, kind: String = null): SchemaDomains2 = {
    val __obj = js.Dynamic.literal()
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDomains2]
  }
}

