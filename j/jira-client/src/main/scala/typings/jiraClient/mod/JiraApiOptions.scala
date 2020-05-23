package typings.jiraClient.mod

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
    timeout: js.UndefOr[Double] = js.undefined,
    username: String = null,
    webhookVersion: String = null
  ): JiraApiOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (bearer != null) __obj.updateDynamic("bearer")(bearer.asInstanceOf[js.Any])
    if (greenhopperVersion != null) __obj.updateDynamic("greenhopperVersion")(greenhopperVersion.asInstanceOf[js.Any])
    if (intermediatePath != null) __obj.updateDynamic("intermediatePath")(intermediatePath.asInstanceOf[js.Any])
    if (oauth != null) __obj.updateDynamic("oauth")(oauth.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (!js.isUndefined(strictSSL)) __obj.updateDynamic("strictSSL")(strictSSL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (webhookVersion != null) __obj.updateDynamic("webhookVersion")(webhookVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[JiraApiOptions]
  }
}

