package typings.karmaCoverage.mod

import org.scalablytyped.runtime.StringDictionary
import typings.istanbul.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KarmaCoverageReporter
  extends /* moreSettings */ StringDictionary[js.Any] {
  var check: js.UndefOr[js.Any] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var includeAllSources: js.UndefOr[Boolean] = js.undefined
  var instrumenter: js.UndefOr[js.Any] = js.undefined
  var sourceStore: js.UndefOr[Store] = js.undefined
  var subdir: js.UndefOr[String | (js.Function1[/* browser */ String, String])] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var watermarks: js.UndefOr[js.Any] = js.undefined
}

object KarmaCoverageReporter {
  @scala.inline
  def apply(
    StringDictionary: /* moreSettings */ StringDictionary[js.Any] = null,
    check: js.Any = null,
    dir: String = null,
    includeAllSources: js.UndefOr[Boolean] = js.undefined,
    instrumenter: js.Any = null,
    sourceStore: Store = null,
    subdir: String | (js.Function1[/* browser */ String, String]) = null,
    `type`: String = null,
    watermarks: js.Any = null
  ): KarmaCoverageReporter = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(includeAllSources)) __obj.updateDynamic("includeAllSources")(includeAllSources.asInstanceOf[js.Any])
    if (instrumenter != null) __obj.updateDynamic("instrumenter")(instrumenter.asInstanceOf[js.Any])
    if (sourceStore != null) __obj.updateDynamic("sourceStore")(sourceStore.asInstanceOf[js.Any])
    if (subdir != null) __obj.updateDynamic("subdir")(subdir.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (watermarks != null) __obj.updateDynamic("watermarks")(watermarks.asInstanceOf[js.Any])
    __obj.asInstanceOf[KarmaCoverageReporter]
  }
}

