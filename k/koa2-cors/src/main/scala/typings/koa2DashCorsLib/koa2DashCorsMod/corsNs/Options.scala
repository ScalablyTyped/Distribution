package typings
package koa2DashCorsLib.koa2DashCorsMod.corsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var allowMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var credentials: js.UndefOr[scala.Boolean] = js.undefined
  var exposeHeaders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var origin: js.UndefOr[
    java.lang.String | (js.Function1[/* ctx */ koaLib.koaMod.ApplicationNs.Context, scala.Boolean | java.lang.String])
  ] = js.undefined
}

