package typings
package koaDashHelmetLib.koaDashHelmetMod

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
  var reportUri: js.UndefOr[java.lang.String] = js.undefined
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
    reportUri: java.lang.String = null,
    sandbox: js.Array[KoaHelmetCspDirectiveValue] = null,
    scriptSrc: js.Array[KoaHelmetCspDirectiveValue] = null,
    styleSrc: js.Array[KoaHelmetCspDirectiveValue] = null
  ): KoaHelmetContentSecurityPolicyDirectives = {
    val __obj = js.Dynamic.literal()
    if (baseUri != null) __obj.updateDynamic("baseUri")(baseUri)
    if (childSrc != null) __obj.updateDynamic("childSrc")(childSrc)
    if (connectSrc != null) __obj.updateDynamic("connectSrc")(connectSrc)
    if (defaultSrc != null) __obj.updateDynamic("defaultSrc")(defaultSrc)
    if (fontSrc != null) __obj.updateDynamic("fontSrc")(fontSrc)
    if (formAction != null) __obj.updateDynamic("formAction")(formAction)
    if (frameAncestors != null) __obj.updateDynamic("frameAncestors")(frameAncestors)
    if (frameSrc != null) __obj.updateDynamic("frameSrc")(frameSrc)
    if (imgSrc != null) __obj.updateDynamic("imgSrc")(imgSrc)
    if (mediaSrc != null) __obj.updateDynamic("mediaSrc")(mediaSrc)
    if (objectSrc != null) __obj.updateDynamic("objectSrc")(objectSrc)
    if (pluginTypes != null) __obj.updateDynamic("pluginTypes")(pluginTypes)
    if (reportUri != null) __obj.updateDynamic("reportUri")(reportUri)
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (scriptSrc != null) __obj.updateDynamic("scriptSrc")(scriptSrc)
    if (styleSrc != null) __obj.updateDynamic("styleSrc")(styleSrc)
    __obj.asInstanceOf[KoaHelmetContentSecurityPolicyDirectives]
  }
}

