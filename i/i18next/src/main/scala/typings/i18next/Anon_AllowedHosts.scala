package typings.i18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowedHosts extends js.Object {
  /**
    * Hostnames that are allowed to send last used data.
    * Please keep those to your local system, staging, test servers (not production)
    * @default ['localhost']
    */
  var allowedHosts: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An api key if you want to send missing keys
    */
  var apiKey: js.UndefOr[String] = js.undefined
  /**
    * Debounce interval to send data in milliseconds
    * @default 90000
    */
  var debounceSubmit: js.UndefOr[Double] = js.undefined
  /**
    * The id of your locize project
    */
  var projectId: String
  /**
    * The reference language of your project
    * @default 'en'
    */
  var referenceLng: js.UndefOr[String] = js.undefined
  /**
    * Version
    * @default 'latest'
    */
  var version: js.UndefOr[String] = js.undefined
}

object Anon_AllowedHosts {
  @scala.inline
  def apply(
    projectId: String,
    allowedHosts: js.Array[String] = null,
    apiKey: String = null,
    debounceSubmit: Int | Double = null,
    referenceLng: String = null,
    version: String = null
  ): Anon_AllowedHosts = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    if (allowedHosts != null) __obj.updateDynamic("allowedHosts")(allowedHosts.asInstanceOf[js.Any])
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey.asInstanceOf[js.Any])
    if (debounceSubmit != null) __obj.updateDynamic("debounceSubmit")(debounceSubmit.asInstanceOf[js.Any])
    if (referenceLng != null) __obj.updateDynamic("referenceLng")(referenceLng.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowedHosts]
  }
}

