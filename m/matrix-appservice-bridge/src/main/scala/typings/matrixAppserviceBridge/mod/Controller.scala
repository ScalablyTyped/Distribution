package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Controller extends js.Object {
  var onAliasQueried: js.UndefOr[js.Function2[/* alias */ String, /* aliasLocalpart */ String, Unit]] = js.native
  var onAliasQuery: js.UndefOr[
    js.Function2[
      /* alias */ String, 
      /* aliasLocalpart */ String, 
      ProvisionedRoom | js.Promise[ProvisionedRoom]
    ]
  ] = js.native
  var onLog: js.UndefOr[js.Function2[/* line */ String, /* isError */ Boolean, Unit]] = js.native
  var onRoomUpgrade: js.UndefOr[
    js.Function4[
      /* oldRoomId */ String, 
      /* newRoomId */ String, 
      /* newVersion */ String, 
      /* context */ BridgeContext, 
      Unit
    ]
  ] = js.native
  var onUserQuery: js.UndefOr[
    js.Function1[/* matrixUser */ MatrixUser, ProvisionedUser | js.Promise[ProvisionedUser]]
  ] = js.native
  var thirdPartyLookup: js.UndefOr[js.Any] = js.native
  def onEvent(request: Request, context: BridgeContext): Unit = js.native
}

object Controller {
  @scala.inline
  def apply(onEvent: (Request, BridgeContext) => Unit): Controller = {
    val __obj = js.Dynamic.literal(onEvent = js.Any.fromFunction2(onEvent))
    __obj.asInstanceOf[Controller]
  }
  @scala.inline
  implicit class ControllerOps[Self <: Controller] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnEvent(value: (Request, BridgeContext) => Unit): Self = this.set("onEvent", js.Any.fromFunction2(value))
    @scala.inline
    def setOnAliasQueried(value: (/* alias */ String, /* aliasLocalpart */ String) => Unit): Self = this.set("onAliasQueried", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAliasQueried: Self = this.set("onAliasQueried", js.undefined)
    @scala.inline
    def setOnAliasQuery(
      value: (/* alias */ String, /* aliasLocalpart */ String) => ProvisionedRoom | js.Promise[ProvisionedRoom]
    ): Self = this.set("onAliasQuery", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnAliasQuery: Self = this.set("onAliasQuery", js.undefined)
    @scala.inline
    def setOnLog(value: (/* line */ String, /* isError */ Boolean) => Unit): Self = this.set("onLog", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnLog: Self = this.set("onLog", js.undefined)
    @scala.inline
    def setOnRoomUpgrade(
      value: (/* oldRoomId */ String, /* newRoomId */ String, /* newVersion */ String, /* context */ BridgeContext) => Unit
    ): Self = this.set("onRoomUpgrade", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnRoomUpgrade: Self = this.set("onRoomUpgrade", js.undefined)
    @scala.inline
    def setOnUserQuery(value: /* matrixUser */ MatrixUser => ProvisionedUser | js.Promise[ProvisionedUser]): Self = this.set("onUserQuery", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUserQuery: Self = this.set("onUserQuery", js.undefined)
    @scala.inline
    def setThirdPartyLookup(value: js.Any): Self = this.set("thirdPartyLookup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThirdPartyLookup: Self = this.set("thirdPartyLookup", js.undefined)
  }
  
}

