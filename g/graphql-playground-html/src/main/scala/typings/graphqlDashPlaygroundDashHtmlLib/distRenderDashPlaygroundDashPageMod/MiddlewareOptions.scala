package typings
package graphqlDashPlaygroundDashHtmlLib.distRenderDashPlaygroundDashPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOptions extends js.Object {
  var codeTheme: js.UndefOr[EditorColours] = js.undefined
  var config: js.UndefOr[js.Any] = js.undefined
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var schema: js.UndefOr[IntrospectionResult] = js.undefined
  var settings: js.UndefOr[ISettings] = js.undefined
  var subscriptionEndpoint: js.UndefOr[java.lang.String] = js.undefined
  var tabs: js.UndefOr[js.Array[Tab]] = js.undefined
  var workspaceName: js.UndefOr[java.lang.String] = js.undefined
}

object MiddlewareOptions {
  @scala.inline
  def apply(
    codeTheme: EditorColours = null,
    config: js.Any = null,
    endpoint: java.lang.String = null,
    env: js.Any = null,
    schema: IntrospectionResult = null,
    settings: ISettings = null,
    subscriptionEndpoint: java.lang.String = null,
    tabs: js.Array[Tab] = null,
    workspaceName: java.lang.String = null
  ): MiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (codeTheme != null) __obj.updateDynamic("codeTheme")(codeTheme)
    if (config != null) __obj.updateDynamic("config")(config)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (env != null) __obj.updateDynamic("env")(env)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (subscriptionEndpoint != null) __obj.updateDynamic("subscriptionEndpoint")(subscriptionEndpoint)
    if (tabs != null) __obj.updateDynamic("tabs")(tabs)
    if (workspaceName != null) __obj.updateDynamic("workspaceName")(workspaceName)
    __obj.asInstanceOf[MiddlewareOptions]
  }
}

