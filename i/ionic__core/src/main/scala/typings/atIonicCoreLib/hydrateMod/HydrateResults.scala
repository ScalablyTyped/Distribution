package typings
package atIonicCoreLib.hydrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydrateResults extends js.Object {
  var anchors: js.Array[HydrateAnchorElement]
  var components: js.Array[HydrateComponent]
  var diagnostics: js.Array[HydrateDiagnostic]
  var hash: java.lang.String
  var host: java.lang.String
  var hostname: java.lang.String
  var href: java.lang.String
  var html: java.lang.String
  var httpStatus: js.UndefOr[scala.Double] = js.undefined
  var hydratedCount: scala.Double
  var imgs: js.Array[HydrateImgElement]
  var pathname: java.lang.String
  var port: java.lang.String
  var scripts: js.Array[HydrateScriptElement]
  var search: java.lang.String
  var styles: js.Array[HydrateStyleElement]
  var title: java.lang.String
  var url: java.lang.String
}

object HydrateResults {
  @scala.inline
  def apply(
    anchors: js.Array[HydrateAnchorElement],
    components: js.Array[HydrateComponent],
    diagnostics: js.Array[HydrateDiagnostic],
    hash: java.lang.String,
    host: java.lang.String,
    hostname: java.lang.String,
    href: java.lang.String,
    html: java.lang.String,
    hydratedCount: scala.Double,
    imgs: js.Array[HydrateImgElement],
    pathname: java.lang.String,
    port: java.lang.String,
    scripts: js.Array[HydrateScriptElement],
    search: java.lang.String,
    styles: js.Array[HydrateStyleElement],
    title: java.lang.String,
    url: java.lang.String,
    httpStatus: scala.Int | scala.Double = null
  ): HydrateResults = {
    val __obj = js.Dynamic.literal(anchors = anchors, components = components, diagnostics = diagnostics, hash = hash, host = host, hostname = hostname, href = href, html = html, hydratedCount = hydratedCount, imgs = imgs, pathname = pathname, port = port, scripts = scripts, search = search, styles = styles, title = title, url = url)
    if (httpStatus != null) __obj.updateDynamic("httpStatus")(httpStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[HydrateResults]
  }
}

