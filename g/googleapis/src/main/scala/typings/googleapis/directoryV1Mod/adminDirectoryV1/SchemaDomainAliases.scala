package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON response template to list domain aliases in Directory API.
  */
@js.native
trait SchemaDomainAliases extends js.Object {
  /**
    * List of domain alias objects.
    */
  var domainAliases: js.UndefOr[js.Array[SchemaDomainAlias]] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDomainAliases {
  @scala.inline
  def apply(domainAliases: js.Array[SchemaDomainAlias] = null, etag: String = null, kind: String = null): SchemaDomainAliases = {
    val __obj = js.Dynamic.literal()
    if (domainAliases != null) __obj.updateDynamic("domainAliases")(domainAliases.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDomainAliases]
  }
}

