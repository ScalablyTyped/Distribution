package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Configuration extends js.Object {
  var appenders: ScalablyTyped.runtime.StringDictionary[Appender]
  var categories: ScalablyTyped.runtime.StringDictionary[log4jsLib.Anon_Level]
  var disableClustering: js.UndefOr[scala.Boolean] = js.undefined
  var levels: js.UndefOr[Levels] = js.undefined
  var pm2: js.UndefOr[scala.Boolean] = js.undefined
  var pm2InstanceVar: js.UndefOr[java.lang.String] = js.undefined
}

