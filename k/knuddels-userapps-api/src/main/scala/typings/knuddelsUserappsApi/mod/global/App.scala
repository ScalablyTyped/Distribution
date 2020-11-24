package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StringDictionary
import typings.knuddelsUserappsApi.mod.KnuddelsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/App.html
	 */
@js.native
trait App extends js.Object {
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#property_chatCommands
  		 */
  var chatCommands: js.UndefOr[
    StringDictionary[
      js.Function3[/* user */ User, /* params */ java.lang.String, /* command */ java.lang.String, Unit]
    ]
  ] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayJoinChannel
  		 */
  var mayJoinChannel: js.UndefOr[js.Function1[/* user */ User, ChannelJoinPermission]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayShowPublicActionMessage
  		 */
  var mayShowPublicActionMessage: js.UndefOr[js.Function1[/* publicActionMessage */ PublicActionMessage, Boolean]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayShowPublicMessage
  		 */
  var mayShowPublicMessage: js.UndefOr[js.Function1[/* publicMessage */ PublicMessage, Boolean]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayUserDice
  		 */
  var mayUserDice: js.UndefOr[js.Function2[/* user */ User, /* diceConfig */ DiceConfiguration, Boolean]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onAccountChangedKnuddelAmount
  		 */
  var onAccountChangedKnuddelAmount: js.UndefOr[
    js.Function4[
      /* user */ User, 
      /* knuddelAccount */ KnuddelAccount, 
      /* oldKnuddelAmount */ KnuddelAmount, 
      /* newKnuddelAmount */ KnuddelAmount, 
      Unit
    ]
  ] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onAccountReceivedKnuddel
  		 */
  var onAccountReceivedKnuddel: js.UndefOr[
    js.Function5[
      /* sender */ User, 
      /* receiver */ BotUser, 
      /* knuddelAmount */ KnuddelAmount, 
      /* transferReason */ java.lang.String, 
      /* knuddelAccount */ KnuddelAccount, 
      Unit
    ]
  ] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onAppEventReceived
  		 */
  var onAppEventReceived: js.UndefOr[
    js.Function3[
      /* appInstance */ AppInstance, 
      /* type */ java.lang.String, 
      /* data */ KnuddelsEvent, 
      Unit
    ]
  ] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onAppStart
  		 */
  var onAppStart: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onBeforeKnuddelReceived
  		 */
  var onBeforeKnuddelReceived: js.UndefOr[js.Function1[/* knuddelTransfer */ KnuddelTransfer, Unit]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onDeveloperCommand
  		 * @since AppServer 108662, ChatServer 108662
  		 */
  var onDeveloperCommand: js.UndefOr[js.Function2[/* user */ User, /* params */ java.lang.String, Unit]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onEventReceived
  		 */
  var onEventReceived: js.UndefOr[
    js.Function4[
      /* user */ User, 
      /* type */ java.lang.String, 
      /* data */ KnuddelsEvent, 
      /* appContentSession */ AppContentSession, 
      Unit
    ]
  ] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onKnuddelReceived
  		 */
  var onKnuddelReceived: js.UndefOr[
    js.Function4[
      /* sender */ User, 
      /* receiver */ BotUser, 
      /* knuddelAmount */ KnuddelAmount, 
      /* transferReason */ java.lang.String, 
      Unit
    ]
  ] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPrepareShutdown
  		 */
  var onPrepareShutdown: js.UndefOr[js.Function1[/* secondsTillShutdown */ Double, Unit]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPrivateMessage
  		 */
  var onPrivateMessage: js.UndefOr[js.Function1[/* privateMessage */ PrivateMessage, Unit]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPublicActionMessage
  		 */
  var onPublicActionMessage: js.UndefOr[js.Function1[/* publicActionMessage */ PublicActionMessage, Unit]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPublicEventMessage
  		 */
  var onPublicEventMessage: js.UndefOr[js.Function1[/* publicEventMessage */ PublicEventMessage, Unit]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPublicMessage
  		 */
  var onPublicMessage: js.UndefOr[js.Function1[/* publicMessage */ PublicMessage, Unit]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onShutdown
  		 */
  var onShutdown: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserDeleted
  		 */
  var onUserDeleted: js.UndefOr[js.Function2[/* userId */ Double, /* userPersistence */ UserPersistence, Unit]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserDiced
  		 */
  var onUserDiced: js.UndefOr[js.Function1[/* diceEvent */ DiceEvent, Unit]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserJoined
  		 */
  var onUserJoined: js.UndefOr[js.Function1[/* user */ User, Unit]] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserLeft
  		 */
  var onUserLeft: js.UndefOr[js.Function1[/* user */ User, Unit]] = js.native
}
object App {
  
  @scala.inline
  def apply(): App = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChatCommands(
      value: StringDictionary[
          js.Function3[/* user */ User, /* params */ java.lang.String, /* command */ java.lang.String, Unit]
        ]
    ): Self = this.set("chatCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChatCommands: Self = this.set("chatCommands", js.undefined)
    
    @scala.inline
    def setMayJoinChannel(value: /* user */ User => ChannelJoinPermission): Self = this.set("mayJoinChannel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMayJoinChannel: Self = this.set("mayJoinChannel", js.undefined)
    
    @scala.inline
    def setMayShowPublicActionMessage(value: /* publicActionMessage */ PublicActionMessage => Boolean): Self = this.set("mayShowPublicActionMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMayShowPublicActionMessage: Self = this.set("mayShowPublicActionMessage", js.undefined)
    
    @scala.inline
    def setMayShowPublicMessage(value: /* publicMessage */ PublicMessage => Boolean): Self = this.set("mayShowPublicMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMayShowPublicMessage: Self = this.set("mayShowPublicMessage", js.undefined)
    
    @scala.inline
    def setMayUserDice(value: (/* user */ User, /* diceConfig */ DiceConfiguration) => Boolean): Self = this.set("mayUserDice", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMayUserDice: Self = this.set("mayUserDice", js.undefined)
    
    @scala.inline
    def setOnAccountChangedKnuddelAmount(
      value: (/* user */ User, /* knuddelAccount */ KnuddelAccount, /* oldKnuddelAmount */ KnuddelAmount, /* newKnuddelAmount */ KnuddelAmount) => Unit
    ): Self = this.set("onAccountChangedKnuddelAmount", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnAccountChangedKnuddelAmount: Self = this.set("onAccountChangedKnuddelAmount", js.undefined)
    
    @scala.inline
    def setOnAccountReceivedKnuddel(
      value: (/* sender */ User, /* receiver */ BotUser, /* knuddelAmount */ KnuddelAmount, /* transferReason */ java.lang.String, /* knuddelAccount */ KnuddelAccount) => Unit
    ): Self = this.set("onAccountReceivedKnuddel", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOnAccountReceivedKnuddel: Self = this.set("onAccountReceivedKnuddel", js.undefined)
    
    @scala.inline
    def setOnAppEventReceived(
      value: (/* appInstance */ AppInstance, /* type */ java.lang.String, /* data */ KnuddelsEvent) => Unit
    ): Self = this.set("onAppEventReceived", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnAppEventReceived: Self = this.set("onAppEventReceived", js.undefined)
    
    @scala.inline
    def setOnAppStart(value: () => Unit): Self = this.set("onAppStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnAppStart: Self = this.set("onAppStart", js.undefined)
    
    @scala.inline
    def setOnBeforeKnuddelReceived(value: /* knuddelTransfer */ KnuddelTransfer => Unit): Self = this.set("onBeforeKnuddelReceived", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeKnuddelReceived: Self = this.set("onBeforeKnuddelReceived", js.undefined)
    
    @scala.inline
    def setOnDeveloperCommand(value: (/* user */ User, /* params */ java.lang.String) => Unit): Self = this.set("onDeveloperCommand", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDeveloperCommand: Self = this.set("onDeveloperCommand", js.undefined)
    
    @scala.inline
    def setOnEventReceived(
      value: (/* user */ User, /* type */ java.lang.String, /* data */ KnuddelsEvent, /* appContentSession */ AppContentSession) => Unit
    ): Self = this.set("onEventReceived", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnEventReceived: Self = this.set("onEventReceived", js.undefined)
    
    @scala.inline
    def setOnKnuddelReceived(
      value: (/* sender */ User, /* receiver */ BotUser, /* knuddelAmount */ KnuddelAmount, /* transferReason */ java.lang.String) => Unit
    ): Self = this.set("onKnuddelReceived", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnKnuddelReceived: Self = this.set("onKnuddelReceived", js.undefined)
    
    @scala.inline
    def setOnPrepareShutdown(value: /* secondsTillShutdown */ Double => Unit): Self = this.set("onPrepareShutdown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPrepareShutdown: Self = this.set("onPrepareShutdown", js.undefined)
    
    @scala.inline
    def setOnPrivateMessage(value: /* privateMessage */ PrivateMessage => Unit): Self = this.set("onPrivateMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPrivateMessage: Self = this.set("onPrivateMessage", js.undefined)
    
    @scala.inline
    def setOnPublicActionMessage(value: /* publicActionMessage */ PublicActionMessage => Unit): Self = this.set("onPublicActionMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPublicActionMessage: Self = this.set("onPublicActionMessage", js.undefined)
    
    @scala.inline
    def setOnPublicEventMessage(value: /* publicEventMessage */ PublicEventMessage => Unit): Self = this.set("onPublicEventMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPublicEventMessage: Self = this.set("onPublicEventMessage", js.undefined)
    
    @scala.inline
    def setOnPublicMessage(value: /* publicMessage */ PublicMessage => Unit): Self = this.set("onPublicMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnPublicMessage: Self = this.set("onPublicMessage", js.undefined)
    
    @scala.inline
    def setOnShutdown(value: () => Unit): Self = this.set("onShutdown", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnShutdown: Self = this.set("onShutdown", js.undefined)
    
    @scala.inline
    def setOnUserDeleted(value: (/* userId */ Double, /* userPersistence */ UserPersistence) => Unit): Self = this.set("onUserDeleted", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnUserDeleted: Self = this.set("onUserDeleted", js.undefined)
    
    @scala.inline
    def setOnUserDiced(value: /* diceEvent */ DiceEvent => Unit): Self = this.set("onUserDiced", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUserDiced: Self = this.set("onUserDiced", js.undefined)
    
    @scala.inline
    def setOnUserJoined(value: /* user */ User => Unit): Self = this.set("onUserJoined", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUserJoined: Self = this.set("onUserJoined", js.undefined)
    
    @scala.inline
    def setOnUserLeft(value: /* user */ User => Unit): Self = this.set("onUserLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnUserLeft: Self = this.set("onUserLeft", js.undefined)
  }
}
