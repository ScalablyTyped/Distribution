package typings.gulpRevReplace.mod

import typings.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var canonicalUris: js.UndefOr[Boolean] = js.undefined
  var manifest: js.UndefOr[ReadWriteStream] = js.undefined
  var modifyReved: js.UndefOr[js.Function] = js.undefined
  var modifyUnreved: js.UndefOr[js.Function] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var replaceInExtensions: js.UndefOr[js.Array[String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    canonicalUris: js.UndefOr[Boolean] = js.undefined,
    manifest: ReadWriteStream = null,
    modifyReved: js.Function = null,
    modifyUnreved: js.Function = null,
    prefix: String = null,
    replaceInExtensions: js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canonicalUris)) __obj.updateDynamic("canonicalUris")(canonicalUris.get.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (modifyReved != null) __obj.updateDynamic("modifyReved")(modifyReved.asInstanceOf[js.Any])
    if (modifyUnreved != null) __obj.updateDynamic("modifyUnreved")(modifyUnreved.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (replaceInExtensions != null) __obj.updateDynamic("replaceInExtensions")(replaceInExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

