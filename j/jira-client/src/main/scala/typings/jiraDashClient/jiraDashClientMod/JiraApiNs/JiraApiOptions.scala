package typings.jiraDashClient.jiraDashClientMod.JiraApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JiraApiOptions extends js.Object {
  var apiVersion: js.UndefOr[String] = js.undefined
  var base: js.UndefOr[String] = js.undefined
  var bearer: js.UndefOr[String] = js.undefined
  var greenhopperVersion: js.UndefOr[String] = js.undefined
  var host: String
  var intermediatePath: js.UndefOr[String] = js.undefined
  var oauth: js.UndefOr[OAuth] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[String] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var request: js.UndefOr[js.Any] = js.undefined
  var strictSSL: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var webhookVersion: js.UndefOr[String] = js.undefined
}

object JiraApiOptions {
  @scala.inline
  def apply(
    host: String,
    apiVersion: String = null,
    base: String = null,
    bearer: String = null,
    greenhopperVersion: String = null,
    intermediatePath: String = null,
    oauth: OAuth = null,
    password: String = null,
    port: String = null,
    protocol: String = null,
    request: js.Any = null,
    strictSSL: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    username: String = null,
    webhookVersion: String = null
  ): JiraApiOptions = {
    val __obj = js.Dynamic.literal(host = host)
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion)
    if (base != null) __obj.updateDynamic("base")(base)
    if (bearer != null) __obj.updateDynamic("bearer")(bearer)
    if (greenhopperVersion != null) __obj.updateDynamic("greenhopperVersion")(greenhopperVersion)
    if (intermediatePath != null) __obj.updateDynamic("intermediatePath")(intermediatePath)
    if (oauth != null) __obj.updateDynamic("oauth")(oauth)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (request != null) __obj.updateDynamic("request")(request)
    if (!js.isUndefined(strictSSL)) __obj.updateDynamic("strictSSL")(strictSSL)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    if (webhookVersion != null) __obj.updateDynamic("webhookVersion")(webhookVersion)
    __obj.asInstanceOf[JiraApiOptions]
  }
}

