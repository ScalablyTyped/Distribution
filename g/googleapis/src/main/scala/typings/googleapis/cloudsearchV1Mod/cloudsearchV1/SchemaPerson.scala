package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object to represent a person.
  */
@js.native
trait SchemaPerson extends js.Object {
  /**
    * The person&#39;s email addresses
    */
  var emailAddresses: js.UndefOr[js.Array[SchemaEmailAddress]] = js.native
  /**
    * The resource name of the person to provide information about. See &lt;a
    * href=&quot;https://developers.google.com/people/api/rest/v1/people/get&quot;&gt;
    * People.get&lt;/a&gt; from Google People API.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Obfuscated ID of a person.
    */
  var obfuscatedId: js.UndefOr[String] = js.native
  /**
    * The person&#39;s name
    */
  var personNames: js.UndefOr[js.Array[SchemaName]] = js.native
  /**
    * A person&#39;s read-only photo. A picture shown next to the person&#39;s
    * name to help others recognize the person in search results.
    */
  var photos: js.UndefOr[js.Array[SchemaPhoto]] = js.native
}

object SchemaPerson {
  @scala.inline
  def apply(): SchemaPerson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerson]
  }
  @scala.inline
  implicit class SchemaPersonOps[Self <: SchemaPerson] (val x: Self) extends AnyVal {
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
    def setEmailAddressesVarargs(value: SchemaEmailAddress*): Self = this.set("emailAddresses", js.Array(value :_*))
    @scala.inline
    def setEmailAddresses(value: js.Array[SchemaEmailAddress]): Self = this.set("emailAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmailAddresses: Self = this.set("emailAddresses", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setObfuscatedId(value: String): Self = this.set("obfuscatedId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObfuscatedId: Self = this.set("obfuscatedId", js.undefined)
    @scala.inline
    def setPersonNamesVarargs(value: SchemaName*): Self = this.set("personNames", js.Array(value :_*))
    @scala.inline
    def setPersonNames(value: js.Array[SchemaName]): Self = this.set("personNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersonNames: Self = this.set("personNames", js.undefined)
    @scala.inline
    def setPhotosVarargs(value: SchemaPhoto*): Self = this.set("photos", js.Array(value :_*))
    @scala.inline
    def setPhotos(value: js.Array[SchemaPhoto]): Self = this.set("photos", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotos: Self = this.set("photos", js.undefined)
  }
  
}

