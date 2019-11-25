package typings.koaDashDocs.koaDashDocsMod.koaDocs

import typings.koaDashDocs.Anon_Description
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var groups: js.Array[Anon_Description]
  var routeHandlers: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var version: String
}

object Options {
  @scala.inline
  def apply(
    groups: js.Array[Anon_Description],
    version: String,
    routeHandlers: String = null,
    theme: String = null,
    title: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (routeHandlers != null) __obj.updateDynamic("routeHandlers")(routeHandlers.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

