package typings
package gulpDashInjectLib.gulpDashInjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var addPrefix: js.UndefOr[java.lang.String] = js.undefined
  var addRootSlash: js.UndefOr[scala.Boolean] = js.undefined
  var addSuffix: js.UndefOr[java.lang.String] = js.undefined
  var empty: js.UndefOr[scala.Boolean] = js.undefined
  var endtag: js.UndefOr[java.lang.String | ITagFunction] = js.undefined
  var ignorePath: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var relative: js.UndefOr[scala.Boolean] = js.undefined
  var removeTags: js.UndefOr[scala.Boolean] = js.undefined
  var selfClosingTag: js.UndefOr[scala.Boolean] = js.undefined
  var starttag: js.UndefOr[java.lang.String | ITagFunction] = js.undefined
  var transform: js.UndefOr[ITransformFunction] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    addPrefix: java.lang.String = null,
    addRootSlash: js.UndefOr[scala.Boolean] = js.undefined,
    addSuffix: java.lang.String = null,
    empty: js.UndefOr[scala.Boolean] = js.undefined,
    endtag: java.lang.String | ITagFunction = null,
    ignorePath: java.lang.String | js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    relative: js.UndefOr[scala.Boolean] = js.undefined,
    removeTags: js.UndefOr[scala.Boolean] = js.undefined,
    selfClosingTag: js.UndefOr[scala.Boolean] = js.undefined,
    starttag: java.lang.String | ITagFunction = null,
    transform: ITransformFunction = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (addPrefix != null) __obj.updateDynamic("addPrefix")(addPrefix)
    if (!js.isUndefined(addRootSlash)) __obj.updateDynamic("addRootSlash")(addRootSlash)
    if (addSuffix != null) __obj.updateDynamic("addSuffix")(addSuffix)
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty)
    if (endtag != null) __obj.updateDynamic("endtag")(endtag.asInstanceOf[js.Any])
    if (ignorePath != null) __obj.updateDynamic("ignorePath")(ignorePath.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(relative)) __obj.updateDynamic("relative")(relative)
    if (!js.isUndefined(removeTags)) __obj.updateDynamic("removeTags")(removeTags)
    if (!js.isUndefined(selfClosingTag)) __obj.updateDynamic("selfClosingTag")(selfClosingTag)
    if (starttag != null) __obj.updateDynamic("starttag")(starttag.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[IOptions]
  }
}

