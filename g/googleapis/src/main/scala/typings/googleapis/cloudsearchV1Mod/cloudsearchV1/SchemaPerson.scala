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
  def apply(
    emailAddresses: js.Array[SchemaEmailAddress] = null,
    name: String = null,
    obfuscatedId: String = null,
    personNames: js.Array[SchemaName] = null,
    photos: js.Array[SchemaPhoto] = null
  ): SchemaPerson = {
    val __obj = js.Dynamic.literal()
    if (emailAddresses != null) __obj.updateDynamic("emailAddresses")(emailAddresses.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (obfuscatedId != null) __obj.updateDynamic("obfuscatedId")(obfuscatedId.asInstanceOf[js.Any])
    if (personNames != null) __obj.updateDynamic("personNames")(personNames.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPerson]
  }
}

