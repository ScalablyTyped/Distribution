package typings.graphqlPlaygroundHtml.renderPlaygroundPageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOptions extends js.Object {
  var codeTheme: js.UndefOr[EditorColours] = js.undefined
  var config: js.UndefOr[js.Any] = js.undefined
  var endpoint: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[js.Any] = js.undefined
  var schema: js.UndefOr[IntrospectionResult] = js.undefined
  var settings: js.UndefOr[ISettings] = js.undefined
  var subscriptionEndpoint: js.UndefOr[String] = js.undefined
  var tabs: js.UndefOr[js.Array[Tab]] = js.undefined
  var workspaceName: js.UndefOr[String] = js.undefined
}

object MiddlewareOptions {
  @scala.inline
  def apply(
    codeTheme: EditorColours = null,
    config: js.Any = null,
    endpoint: String = null,
    env: js.Any = null,
    schema: IntrospectionResult = null,
    settings: ISettings = null,
    subscriptionEndpoint: String = null,
    tabs: js.Array[Tab] = null,
    workspaceName: String = null
  ): MiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (codeTheme != null) __obj.updateDynamic("codeTheme")(codeTheme.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (subscriptionEndpoint != null) __obj.updateDynamic("subscriptionEndpoint")(subscriptionEndpoint.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    if (workspaceName != null) __obj.updateDynamic("workspaceName")(workspaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiddlewareOptions]
  }
}

