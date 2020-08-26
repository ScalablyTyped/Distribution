package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for Domain Alias object in Directory API.
  */
@js.native
trait SchemaDomainAlias extends js.Object {
  /**
    * The creation time of the domain alias. (Read-only).
    */
  var creationTime: js.UndefOr[String] = js.native
  /**
    * The domain alias name.
    */
  var domainAliasName: js.UndefOr[String] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The parent domain name that the domain alias is associated with. This can
    * either be a primary or secondary domain name within a customer.
    */
  var parentDomainName: js.UndefOr[String] = js.native
  /**
    * Indicates the verification state of a domain alias. (Read-only)
    */
  var verified: js.UndefOr[Boolean] = js.native
}

object SchemaDomainAlias {
  @scala.inline
  def apply(): SchemaDomainAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainAlias]
  }
  @scala.inline
  implicit class SchemaDomainAliasOps[Self <: SchemaDomainAlias] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationTime(value: String): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setDomainAliasName(value: String): Self = this.set("domainAliasName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainAliasName: Self = this.set("domainAliasName", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setParentDomainName(value: String): Self = this.set("parentDomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentDomainName: Self = this.set("parentDomainName", js.undefined)
    @scala.inline
    def setVerified(value: Boolean): Self = this.set("verified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerified: Self = this.set("verified", js.undefined)
  }
  
}

