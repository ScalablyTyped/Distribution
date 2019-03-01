package typings
package gulpDashRevDashReplaceLib.gulpDashRevDashReplaceMod.revReplaceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var canonicalUris: js.UndefOr[scala.Boolean] = js.undefined
  var manifest: js.UndefOr[nodeLib.NodeJSNs.ReadWriteStream] = js.undefined
  var modifyReved: js.UndefOr[js.Function] = js.undefined
  var modifyUnreved: js.UndefOr[js.Function] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var replaceInExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    canonicalUris: js.UndefOr[scala.Boolean] = js.undefined,
    manifest: nodeLib.NodeJSNs.ReadWriteStream = null,
    modifyReved: js.Function = null,
    modifyUnreved: js.Function = null,
    prefix: java.lang.String = null,
    replaceInExtensions: js.Array[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canonicalUris)) __obj.updateDynamic("canonicalUris")(canonicalUris)
    if (manifest != null) __obj.updateDynamic("manifest")(manifest)
    if (modifyReved != null) __obj.updateDynamic("modifyReved")(modifyReved)
    if (modifyUnreved != null) __obj.updateDynamic("modifyUnreved")(modifyUnreved)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (replaceInExtensions != null) __obj.updateDynamic("replaceInExtensions")(replaceInExtensions)
    __obj.asInstanceOf[Options]
  }
}

