package typings.log4js.log4jsMod

import org.scalablytyped.runtime.StringDictionary
import typings.log4js.Anon_Appenders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var appenders: StringDictionary[Appender]
  var categories: StringDictionary[Anon_Appenders]
  var disableClustering: js.UndefOr[Boolean] = js.undefined
  var levels: js.UndefOr[Levels] = js.undefined
  var pm2: js.UndefOr[Boolean] = js.undefined
  var pm2InstanceVar: js.UndefOr[String] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    appenders: StringDictionary[Appender],
    categories: StringDictionary[Anon_Appenders],
    disableClustering: js.UndefOr[Boolean] = js.undefined,
    levels: Levels = null,
    pm2: js.UndefOr[Boolean] = js.undefined,
    pm2InstanceVar: String = null
  ): Configuration = {
    val __obj = js.Dynamic.literal(appenders = appenders.asInstanceOf[js.Any], categories = categories.asInstanceOf[js.Any])
    if (!js.isUndefined(disableClustering)) __obj.updateDynamic("disableClustering")(disableClustering.asInstanceOf[js.Any])
    if (levels != null) __obj.updateDynamic("levels")(levels.asInstanceOf[js.Any])
    if (!js.isUndefined(pm2)) __obj.updateDynamic("pm2")(pm2.asInstanceOf[js.Any])
    if (pm2InstanceVar != null) __obj.updateDynamic("pm2InstanceVar")(pm2InstanceVar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

