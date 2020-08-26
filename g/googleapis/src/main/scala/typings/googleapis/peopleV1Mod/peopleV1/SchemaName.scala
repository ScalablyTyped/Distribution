package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A person&#39;s name. If the name is a mononym, the family name is empty.
  */
@js.native
trait SchemaName extends js.Object {
  /**
    * The read-only display name formatted according to the locale specified by
    * the viewer&#39;s account or the `Accept-Language` HTTP header.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The read-only display name with the last name first formatted according
    * to the locale specified by the viewer&#39;s account or the
    * `Accept-Language` HTTP header.
    */
  var displayNameLastFirst: js.UndefOr[String] = js.native
  /**
    * The family name.
    */
  var familyName: js.UndefOr[String] = js.native
  /**
    * The given name.
    */
  var givenName: js.UndefOr[String] = js.native
  /**
    * The honorific prefixes, such as `Mrs.` or `Dr.`
    */
  var honorificPrefix: js.UndefOr[String] = js.native
  /**
    * The honorific suffixes, such as `Jr.`
    */
  var honorificSuffix: js.UndefOr[String] = js.native
  /**
    * Metadata about the name.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The middle name(s).
    */
  var middleName: js.UndefOr[String] = js.native
  /**
    * The family name spelled as it sounds.
    */
  var phoneticFamilyName: js.UndefOr[String] = js.native
  /**
    * The full name spelled as it sounds.
    */
  var phoneticFullName: js.UndefOr[String] = js.native
  /**
    * The given name spelled as it sounds.
    */
  var phoneticGivenName: js.UndefOr[String] = js.native
  /**
    * The honorific prefixes spelled as they sound.
    */
  var phoneticHonorificPrefix: js.UndefOr[String] = js.native
  /**
    * The honorific suffixes spelled as they sound.
    */
  var phoneticHonorificSuffix: js.UndefOr[String] = js.native
  /**
    * The middle name(s) spelled as they sound.
    */
  var phoneticMiddleName: js.UndefOr[String] = js.native
}

object SchemaName {
  @scala.inline
  def apply(): SchemaName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaName]
  }
  @scala.inline
  implicit class SchemaNameOps[Self <: SchemaName] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setDisplayNameLastFirst(value: String): Self = this.set("displayNameLastFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayNameLastFirst: Self = this.set("displayNameLastFirst", js.undefined)
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamilyName: Self = this.set("familyName", js.undefined)
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    @scala.inline
    def setHonorificPrefix(value: String): Self = this.set("honorificPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHonorificPrefix: Self = this.set("honorificPrefix", js.undefined)
    @scala.inline
    def setHonorificSuffix(value: String): Self = this.set("honorificSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHonorificSuffix: Self = this.set("honorificSuffix", js.undefined)
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setMiddleName(value: String): Self = this.set("middleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddleName: Self = this.set("middleName", js.undefined)
    @scala.inline
    def setPhoneticFamilyName(value: String): Self = this.set("phoneticFamilyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneticFamilyName: Self = this.set("phoneticFamilyName", js.undefined)
    @scala.inline
    def setPhoneticFullName(value: String): Self = this.set("phoneticFullName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneticFullName: Self = this.set("phoneticFullName", js.undefined)
    @scala.inline
    def setPhoneticGivenName(value: String): Self = this.set("phoneticGivenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneticGivenName: Self = this.set("phoneticGivenName", js.undefined)
    @scala.inline
    def setPhoneticHonorificPrefix(value: String): Self = this.set("phoneticHonorificPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneticHonorificPrefix: Self = this.set("phoneticHonorificPrefix", js.undefined)
    @scala.inline
    def setPhoneticHonorificSuffix(value: String): Self = this.set("phoneticHonorificSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneticHonorificSuffix: Self = this.set("phoneticHonorificSuffix", js.undefined)
    @scala.inline
    def setPhoneticMiddleName(value: String): Self = this.set("phoneticMiddleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneticMiddleName: Self = this.set("phoneticMiddleName", js.undefined)
  }
  
}

