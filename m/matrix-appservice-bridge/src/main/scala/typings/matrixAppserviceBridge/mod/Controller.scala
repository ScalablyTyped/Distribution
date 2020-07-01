package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Controller extends js.Object {
  var onAliasQueried: js.UndefOr[js.Function2[/* alias */ String, /* aliasLocalpart */ String, Unit]] = js.undefined
  var onAliasQuery: js.UndefOr[
    js.Function2[
      /* alias */ String, 
      /* aliasLocalpart */ String, 
      ProvisionedRoom | js.Promise[ProvisionedRoom]
    ]
  ] = js.undefined
  var onLog: js.UndefOr[js.Function2[/* line */ String, /* isError */ Boolean, Unit]] = js.undefined
  var onRoomUpgrade: js.UndefOr[
    js.Function4[
      /* oldRoomId */ String, 
      /* newRoomId */ String, 
      /* newVersion */ String, 
      /* context */ BridgeContext, 
      Unit
    ]
  ] = js.undefined
  var onUserQuery: js.UndefOr[
    js.Function1[/* matrixUser */ MatrixUser, ProvisionedUser | js.Promise[ProvisionedUser]]
  ] = js.undefined
  var thirdPartyLookup: js.UndefOr[js.Any] = js.undefined
  def onEvent(request: Request, context: BridgeContext): Unit
}

object Controller {
  @scala.inline
  def apply(
    onEvent: (Request, BridgeContext) => Unit,
    onAliasQueried: (/* alias */ String, /* aliasLocalpart */ String) => Unit = null,
    onAliasQuery: (/* alias */ String, /* aliasLocalpart */ String) => ProvisionedRoom | js.Promise[ProvisionedRoom] = null,
    onLog: (/* line */ String, /* isError */ Boolean) => Unit = null,
    onRoomUpgrade: (/* oldRoomId */ String, /* newRoomId */ String, /* newVersion */ String, /* context */ BridgeContext) => Unit = null,
    onUserQuery: /* matrixUser */ MatrixUser => ProvisionedUser | js.Promise[ProvisionedUser] = null,
    thirdPartyLookup: js.Any = null
  ): Controller = {
    val __obj = js.Dynamic.literal(onEvent = js.Any.fromFunction2(onEvent))
    if (onAliasQueried != null) __obj.updateDynamic("onAliasQueried")(js.Any.fromFunction2(onAliasQueried))
    if (onAliasQuery != null) __obj.updateDynamic("onAliasQuery")(js.Any.fromFunction2(onAliasQuery))
    if (onLog != null) __obj.updateDynamic("onLog")(js.Any.fromFunction2(onLog))
    if (onRoomUpgrade != null) __obj.updateDynamic("onRoomUpgrade")(js.Any.fromFunction4(onRoomUpgrade))
    if (onUserQuery != null) __obj.updateDynamic("onUserQuery")(js.Any.fromFunction1(onUserQuery))
    if (thirdPartyLookup != null) __obj.updateDynamic("thirdPartyLookup")(thirdPartyLookup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controller]
  }
}

