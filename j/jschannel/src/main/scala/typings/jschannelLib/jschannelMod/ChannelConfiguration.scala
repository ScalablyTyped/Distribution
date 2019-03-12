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

object ChannelConfiguration {
  @scala.inline
  def apply(
    origin: java.lang.String,
    scope: java.lang.String,
    window: stdLib.Window,
    debugOutput: js.UndefOr[scala.Boolean] = js.undefined,
    gotMessageObserver: (/* origin */ java.lang.String, /* message */ Message) => scala.Unit = null,
    onReady: /* channel */ MessagingChannel => scala.Unit = null,
    postMessageObserver: (/* origin */ java.lang.String, /* message */ Message) => scala.Unit = null,
    publish: js.UndefOr[scala.Boolean] = js.undefined,
    reconnect: js.UndefOr[scala.Boolean] = js.undefined,
    remote: java.lang.String | js.Array[java.lang.String] = null
  ): ChannelConfiguration = {
    val __obj = js.Dynamic.literal(origin = origin, scope = scope, window = window)
    if (!js.isUndefined(debugOutput)) __obj.updateDynamic("debugOutput")(debugOutput)
    if (gotMessageObserver != null) __obj.updateDynamic("gotMessageObserver")(js.Any.fromFunction2(gotMessageObserver))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (postMessageObserver != null) __obj.updateDynamic("postMessageObserver")(js.Any.fromFunction2(postMessageObserver))
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish)
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect)
    if (remote != null) __obj.updateDynamic("remote")(remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelConfiguration]
  }
}

