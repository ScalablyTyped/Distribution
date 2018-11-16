package typings
package jschannelLib.jschannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Message extends js.Object {
  var error: js.UndefOr[js.Function2[/* error */ js.Any, /* message */ java.lang.String, scala.Unit]] = js.undefined
  var method: java.lang.String
  var params: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[js.Function1[/* result */ js.Any, scala.Unit]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

