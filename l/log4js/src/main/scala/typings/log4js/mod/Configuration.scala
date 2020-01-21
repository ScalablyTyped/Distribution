package typings.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import typings.log4js.AnonAppenders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  var appenders: StringDictionary[Appender]
  var categories: StringDictionary[AnonAppenders]
  var disableClustering: js.UndefOr[Boolean] = js.undefined
  var levels: js.UndefOr[Levels_] = js.undefined
  var pm2: js.UndefOr[Boolean] = js.undefined
  var pm2InstanceVar: js.UndefOr[String] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    appenders: StringDictionary[Appender],
    categories: StringDictionary[AnonAppenders],
    disableClustering: js.UndefOr[Boolean] = js.undefined,
    levels: Levels_ = null,
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

