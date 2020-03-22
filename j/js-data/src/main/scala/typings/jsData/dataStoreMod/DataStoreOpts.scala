package typings.jsData.dataStoreMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsData.simpleStoreMod.SimpleStoreOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataStoreOpts
  extends SimpleStoreOpts
     with /* customAttr */ StringDictionary[js.Any] {
  var collectionClass: js.UndefOr[js.Any] = js.undefined
  var linkRelations: js.UndefOr[Boolean] = js.undefined
  var mapperClass: js.UndefOr[js.Any] = js.undefined
  var scopes: js.UndefOr[js.Any] = js.undefined
  var unlinkOnDestroy: js.UndefOr[Boolean] = js.undefined
}

object DataStoreOpts {
  @scala.inline
  def apply(
    StringDictionary: /* customAttr */ StringDictionary[js.Any] = null,
    collectionClass: js.Any = null,
    linkRelations: js.UndefOr[Boolean] = js.undefined,
    mapperClass: js.Any = null,
    scopes: js.Any = null,
    unlinkOnDestroy: js.UndefOr[Boolean] = js.undefined,
    usePendingFind: Boolean | js.Function = null,
    usePendingFindAll: Boolean | js.Function = null
  ): DataStoreOpts = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (collectionClass != null) __obj.updateDynamic("collectionClass")(collectionClass.asInstanceOf[js.Any])
    if (!js.isUndefined(linkRelations)) __obj.updateDynamic("linkRelations")(linkRelations.asInstanceOf[js.Any])
    if (mapperClass != null) __obj.updateDynamic("mapperClass")(mapperClass.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (!js.isUndefined(unlinkOnDestroy)) __obj.updateDynamic("unlinkOnDestroy")(unlinkOnDestroy.asInstanceOf[js.Any])
    if (usePendingFind != null) __obj.updateDynamic("usePendingFind")(usePendingFind.asInstanceOf[js.Any])
    if (usePendingFindAll != null) __obj.updateDynamic("usePendingFindAll")(usePendingFindAll.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataStoreOpts]
  }
}

