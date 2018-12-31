package typings
package jschannelLib.jschannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelConfiguration extends js.Object {
  var debugOutput: js.UndefOr[scala.Boolean] = js.undefined
  var gotMessageObserver: js.UndefOr[js.Function2[/* origin */ java.lang.String, /* message */ Message, scala.Unit]] = js.undefined
  var onReady: js.UndefOr[js.Function1[/* channel */ MessagingChannel, scala.Unit]] = js.undefined
  var origin: java.lang.String
  var postMessageObserver: js.UndefOr[js.Function2[/* origin */ java.lang.String, /* message */ Message, scala.Unit]] = js.undefined
  var publish: js.UndefOr[scala.Boolean] = js.undefined
  var reconnect: js.UndefOr[scala.Boolean] = js.undefined
  var remote: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var scope: java.lang.String
  var window: stdLib.Window
}

