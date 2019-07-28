package typings.atIonicCore.hydrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HydrateResults extends js.Object {
  var anchors: js.Array[HydrateAnchorElement]
  var components: js.Array[HydrateComponent]
  var diagnostics: js.Array[HydrateDiagnostic]
  var hash: String
  var host: String
  var hostname: String
  var href: String
  var html: String
  var httpStatus: js.UndefOr[Double] = js.undefined
  var hydratedCount: Double
  var imgs: js.Array[HydrateImgElement]
  var pathname: String
  var port: String
  var scripts: js.Array[HydrateScriptElement]
  var search: String
  var styles: js.Array[HydrateStyleElement]
  var title: String
  var url: String
}

object HydrateResults {
  @scala.inline
  def apply(
    anchors: js.Array[HydrateAnchorElement],
    components: js.Array[HydrateComponent],
    diagnostics: js.Array[HydrateDiagnostic],
    hash: String,
    host: String,
    hostname: String,
    href: String,
    html: String,
    hydratedCount: Double,
    imgs: js.Array[HydrateImgElement],
    pathname: String,
    port: String,
    scripts: js.Array[HydrateScriptElement],
    search: String,
    styles: js.Array[HydrateStyleElement],
    title: String,
    url: String,
    httpStatus: Int | Double = null
  ): HydrateResults = {
    val __obj = js.Dynamic.literal(anchors = anchors, components = components, diagnostics = diagnostics, hash = hash, host = host, hostname = hostname, href = href, html = html, hydratedCount = hydratedCount, imgs = imgs, pathname = pathname, port = port, scripts = scripts, search = search, styles = styles, title = title, url = url)
    if (httpStatus != null) __obj.updateDynamic("httpStatus")(httpStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[HydrateResults]
  }
}

