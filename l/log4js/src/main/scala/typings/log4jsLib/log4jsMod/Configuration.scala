package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var appenders: org.scalablytyped.runtime.StringDictionary[Appender]
  var categories: org.scalablytyped.runtime.StringDictionary[log4jsLib.Anon_Appenders]
  var disableClustering: js.UndefOr[scala.Boolean] = js.undefined
  var levels: js.UndefOr[Levels] = js.undefined
  var pm2: js.UndefOr[scala.Boolean] = js.undefined
  var pm2InstanceVar: js.UndefOr[java.lang.String] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    appenders: org.scalablytyped.runtime.StringDictionary[Appender],
    categories: org.scalablytyped.runtime.StringDictionary[log4jsLib.Anon_Appenders],
    disableClustering: js.UndefOr[scala.Boolean] = js.undefined,
    levels: Levels = null,
    pm2: js.UndefOr[scala.Boolean] = js.undefined,
    pm2InstanceVar: java.lang.String = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(appenders = appenders, categories = categories)
    if (!js.isUndefined(disableClustering)) __obj.updateDynamic("disableClustering")(disableClustering)
    if (levels != null) __obj.updateDynamic("levels")(levels)
    if (!js.isUndefined(pm2)) __obj.updateDynamic("pm2")(pm2)
    if (pm2InstanceVar != null) __obj.updateDynamic("pm2InstanceVar")(pm2InstanceVar)
    __obj.asInstanceOf[Configuration]
  }
}

