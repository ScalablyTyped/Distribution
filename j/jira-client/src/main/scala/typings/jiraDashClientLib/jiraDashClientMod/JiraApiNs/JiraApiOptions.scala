package typings
package jiraDashClientLib.jiraDashClientMod.JiraApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JiraApiOptions extends js.Object {
  var apiVersion: js.UndefOr[java.lang.String] = js.undefined
  var base: js.UndefOr[java.lang.String] = js.undefined
  var bearer: js.UndefOr[java.lang.String] = js.undefined
  var greenhopperVersion: js.UndefOr[java.lang.String] = js.undefined
  var host: java.lang.String
  var intermediatePath: js.UndefOr[java.lang.String] = js.undefined
  var oauth: js.UndefOr[OAuth] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[java.lang.String] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var request: js.UndefOr[js.Any] = js.undefined
  var strictSSL: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
  var webhookVersion: js.UndefOr[java.lang.String] = js.undefined
}

object JiraApiOptions {
  @scala.inline
  def apply(
    host: java.lang.String,
    apiVersion: java.lang.String = null,
    base: java.lang.String = null,
    bearer: java.lang.String = null,
    greenhopperVersion: java.lang.String = null,
    intermediatePath: java.lang.String = null,
    oauth: OAuth = null,
    password: java.lang.String = null,
    port: java.lang.String = null,
    protocol: java.lang.String = null,
    request: js.Any = null,
    strictSSL: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    username: java.lang.String = null,
    webhookVersion: java.lang.String = null
  ): JiraApiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
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

