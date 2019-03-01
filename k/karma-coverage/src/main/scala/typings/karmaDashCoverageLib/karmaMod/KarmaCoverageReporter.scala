package typings
package karmaDashCoverageLib.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KarmaCoverageReporter
  extends /* moreSettings */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var check: js.UndefOr[js.Any] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var includeAllSources: js.UndefOr[scala.Boolean] = js.undefined
  var instrumenter: js.UndefOr[js.Any] = js.undefined
  var sourceStore: js.UndefOr[istanbulLib.istanbulMod.istanbulNs.Store] = js.undefined
  var subdir: js.UndefOr[
    java.lang.String | (js.Function1[/* browser */ java.lang.String, java.lang.String])
  ] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var watermarks: js.UndefOr[js.Any] = js.undefined
}

object KarmaCoverageReporter {
  @scala.inline
  def apply(
    StringDictionary: /* moreSettings */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    check: js.Any = null,
    dir: java.lang.String = null,
    includeAllSources: js.UndefOr[scala.Boolean] = js.undefined,
    instrumenter: js.Any = null,
    sourceStore: istanbulLib.istanbulMod.istanbulNs.Store = null,
    subdir: java.lang.String | (js.Function1[/* browser */ java.lang.String, java.lang.String]) = null,
    `type`: java.lang.String = null,
    watermarks: js.Any = null
  ): KarmaCoverageReporter = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (check != null) __obj.updateDynamic("check")(check)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(includeAllSources)) __obj.updateDynamic("includeAllSources")(includeAllSources)
    if (instrumenter != null) __obj.updateDynamic("instrumenter")(instrumenter)
    if (sourceStore != null) __obj.updateDynamic("sourceStore")(sourceStore)
    if (subdir != null) __obj.updateDynamic("subdir")(subdir.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (watermarks != null) __obj.updateDynamic("watermarks")(watermarks)
    __obj.asInstanceOf[KarmaCoverageReporter]
  }
}

