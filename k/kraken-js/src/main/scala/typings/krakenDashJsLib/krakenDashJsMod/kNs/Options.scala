package typings
package krakenDashJsLib.krakenDashJsMod.kNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var basedir: js.UndefOr[java.lang.String] = js.undefined
  var configdir: js.UndefOr[java.lang.String] = js.undefined
  var inheritViews: js.UndefOr[scala.Boolean] = js.undefined
  var mountpath: js.UndefOr[java.lang.String] = js.undefined
  var onconfig: js.UndefOr[
    js.Function2[
      /* config */ stdLib.Map[java.lang.String, _], 
      /* next */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* config */ js.UndefOr[js.Object], _], 
      _
    ]
  ] = js.undefined
  var protocols: js.UndefOr[js.Object] = js.undefined
  var startupHeaders: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var uncaughtException: js.UndefOr[js.Function1[/* err */ nodeLib.Error, _]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    basedir: java.lang.String = null,
    configdir: java.lang.String = null,
    inheritViews: js.UndefOr[scala.Boolean] = js.undefined,
    mountpath: java.lang.String = null,
    onconfig: js.Function2[
      /* config */ stdLib.Map[java.lang.String, _], 
      /* next */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* config */ js.UndefOr[js.Object], _], 
      _
    ] = null,
    protocols: js.Object = null,
    startupHeaders: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    uncaughtException: js.Function1[/* err */ nodeLib.Error, _] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (configdir != null) __obj.updateDynamic("configdir")(configdir)
    if (!js.isUndefined(inheritViews)) __obj.updateDynamic("inheritViews")(inheritViews)
    if (mountpath != null) __obj.updateDynamic("mountpath")(mountpath)
    if (onconfig != null) __obj.updateDynamic("onconfig")(onconfig)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (startupHeaders != null) __obj.updateDynamic("startupHeaders")(startupHeaders)
    if (uncaughtException != null) __obj.updateDynamic("uncaughtException")(uncaughtException)
    __obj.asInstanceOf[Options]
  }
}

