package typings.koaHelmet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KoaHelmetContentSecurityPolicyDirectives extends js.Object {
  var baseUri: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
  var childSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
  var connectSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
  var defaultSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
  var fontSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
  var formAction: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
  var frameAncestors: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
  var frameSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
  var imgSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
  var mediaSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
  var objectSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
  var pluginTypes: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
  var reportUri: js.UndefOr[String] = js.undefined
  var sandbox: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
  var scriptSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
  var styleSrc: js.UndefOr[js.Array[KoaHelmetCspDirectiveValue]] = js.undefined
}

object KoaHelmetContentSecurityPolicyDirectives {
  @scala.inline
  def apply(
    baseUri: js.Array[KoaHelmetCspDirectiveValue] = null,
    childSrc: js.Array[KoaHelmetCspDirectiveValue] = null,
    connectSrc: js.Array[KoaHelmetCspDirectiveValue] = null,
    defaultSrc: js.Array[KoaHelmetCspDirectiveValue] = null,
    fontSrc: js.Array[KoaHelmetCspDirectiveValue] = null,
    formAction: js.Array[KoaHelmetCspDirectiveValue] = null,
    frameAncestors: js.Array[KoaHelmetCspDirectiveValue] = null,
    frameSrc: js.Array[KoaHelmetCspDirectiveValue] = null,
    imgSrc: js.Array[KoaHelmetCspDirectiveValue] = null,
    mediaSrc: js.Array[KoaHelmetCspDirectiveValue] = null,
    objectSrc: js.Array[KoaHelmetCspDirectiveValue] = null,
    pluginTypes: js.Array[KoaHelmetCspDirectiveValue] = null,
    reportUri: String = null,
    sandbox: js.Array[KoaHelmetCspDirectiveValue] = null,
    scriptSrc: js.Array[KoaHelmetCspDirectiveValue] = null,
    styleSrc: js.Array[KoaHelmetCspDirectiveValue] = null
  ): KoaHelmetContentSecurityPolicyDirectives = {
    val __obj = js.Dynamic.literal()
    if (baseUri != null) __obj.updateDynamic("baseUri")(baseUri.asInstanceOf[js.Any])
    if (childSrc != null) __obj.updateDynamic("childSrc")(childSrc.asInstanceOf[js.Any])
    if (connectSrc != null) __obj.updateDynamic("connectSrc")(connectSrc.asInstanceOf[js.Any])
    if (defaultSrc != null) __obj.updateDynamic("defaultSrc")(defaultSrc.asInstanceOf[js.Any])
    if (fontSrc != null) __obj.updateDynamic("fontSrc")(fontSrc.asInstanceOf[js.Any])
    if (formAction != null) __obj.updateDynamic("formAction")(formAction.asInstanceOf[js.Any])
    if (frameAncestors != null) __obj.updateDynamic("frameAncestors")(frameAncestors.asInstanceOf[js.Any])
    if (frameSrc != null) __obj.updateDynamic("frameSrc")(frameSrc.asInstanceOf[js.Any])
    if (imgSrc != null) __obj.updateDynamic("imgSrc")(imgSrc.asInstanceOf[js.Any])
    if (mediaSrc != null) __obj.updateDynamic("mediaSrc")(mediaSrc.asInstanceOf[js.Any])
    if (objectSrc != null) __obj.updateDynamic("objectSrc")(objectSrc.asInstanceOf[js.Any])
    if (pluginTypes != null) __obj.updateDynamic("pluginTypes")(pluginTypes.asInstanceOf[js.Any])
    if (reportUri != null) __obj.updateDynamic("reportUri")(reportUri.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (scriptSrc != null) __obj.updateDynamic("scriptSrc")(scriptSrc.asInstanceOf[js.Any])
    if (styleSrc != null) __obj.updateDynamic("styleSrc")(styleSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[KoaHelmetContentSecurityPolicyDirectives]
  }
}

