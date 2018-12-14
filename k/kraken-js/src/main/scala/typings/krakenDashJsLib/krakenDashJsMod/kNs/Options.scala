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

