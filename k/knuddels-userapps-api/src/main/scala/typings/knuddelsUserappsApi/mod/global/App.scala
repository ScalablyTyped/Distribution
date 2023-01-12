package typings.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StringDictionary
import typings.knuddelsUserappsApi.mod.KnuddelsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/App.html
  */
trait App extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#property_chatCommands
    */
  var chatCommands: js.UndefOr[
    StringDictionary[
      js.Function3[/* user */ User, /* params */ java.lang.String, /* command */ java.lang.String, Unit]
    ]
  ] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_mayJoinChannel
    */
  var mayJoinChannel: js.UndefOr[js.Function1[/* user */ User, ChannelJoinPermission]] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_mayShowPublicActionMessage
    */
  var mayShowPublicActionMessage: js.UndefOr[js.Function1[/* publicActionMessage */ PublicActionMessage, Boolean]] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_mayShowPublicMessage
    */
  var mayShowPublicMessage: js.UndefOr[js.Function1[/* publicMessage */ PublicMessage, Boolean]] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_mayUserDice
    */
  var mayUserDice: js.UndefOr[js.Function2[/* user */ User, /* diceConfig */ DiceConfiguration, Boolean]] = js.undefined
  
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
  ] = js.undefined
  
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
  ] = js.undefined
  
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
  ] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_onAppStart
    */
  var onAppStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_onBeforeKnuddelReceived
    */
  var onBeforeKnuddelReceived: js.UndefOr[js.Function1[/* knuddelTransfer */ KnuddelTransfer, Unit]] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_onDebtsUpdate
    * @since AppServer 20201113-145716, ChatServer 20201113-145716
    */
  var onDebtsUpdate: js.UndefOr[js.Function1[/* debts */ KnuddelAmount, Unit]] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_onDeveloperCommand
    * @since AppServer 108662, ChatServer 108662
    */
  var onDeveloperCommand: js.UndefOr[js.Function2[/* user */ User, /* params */ java.lang.String, Unit]] = js.undefined
  
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
  ] = js.undefined
  
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
  ] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_onPrepareShutdown
    */
  var onPrepareShutdown: js.UndefOr[js.Function1[/* secondsTillShutdown */ Double, Unit]] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_onPrivateMessage
    */
  var onPrivateMessage: js.UndefOr[js.Function1[/* privateMessage */ PrivateMessage, Unit]] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_onPublicActionMessage
    */
  var onPublicActionMessage: js.UndefOr[js.Function1[/* publicActionMessage */ PublicActionMessage, Unit]] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_onPublicEventMessage
    */
  var onPublicEventMessage: js.UndefOr[js.Function1[/* publicEventMessage */ PublicEventMessage, Unit]] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_onPublicMessage
    */
  var onPublicMessage: js.UndefOr[js.Function1[/* publicMessage */ PublicMessage, Unit]] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_onShutdown
    */
  var onShutdown: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserDeleted
    */
  var onUserDeleted: js.UndefOr[js.Function2[/* userId */ Double, /* userPersistence */ UserPersistence, Unit]] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserDiced
    */
  var onUserDiced: js.UndefOr[js.Function1[/* diceEvent */ DiceEvent, Unit]] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserJoined
    */
  var onUserJoined: js.UndefOr[js.Function1[/* user */ User, Unit]] = js.undefined
  
  /**
    * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserLeft
    */
  var onUserLeft: js.UndefOr[js.Function1[/* user */ User, Unit]] = js.undefined
}
object App {
  
  inline def apply(): App = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: App] (val x: Self) extends AnyVal {
    
    inline def setChatCommands(
      value: StringDictionary[
          js.Function3[/* user */ User, /* params */ java.lang.String, /* command */ java.lang.String, Unit]
        ]
    ): Self = StObject.set(x, "chatCommands", value.asInstanceOf[js.Any])
    
    inline def setChatCommandsUndefined: Self = StObject.set(x, "chatCommands", js.undefined)
    
    inline def setMayJoinChannel(value: /* user */ User => ChannelJoinPermission): Self = StObject.set(x, "mayJoinChannel", js.Any.fromFunction1(value))
    
    inline def setMayJoinChannelUndefined: Self = StObject.set(x, "mayJoinChannel", js.undefined)
    
    inline def setMayShowPublicActionMessage(value: /* publicActionMessage */ PublicActionMessage => Boolean): Self = StObject.set(x, "mayShowPublicActionMessage", js.Any.fromFunction1(value))
    
    inline def setMayShowPublicActionMessageUndefined: Self = StObject.set(x, "mayShowPublicActionMessage", js.undefined)
    
    inline def setMayShowPublicMessage(value: /* publicMessage */ PublicMessage => Boolean): Self = StObject.set(x, "mayShowPublicMessage", js.Any.fromFunction1(value))
    
    inline def setMayShowPublicMessageUndefined: Self = StObject.set(x, "mayShowPublicMessage", js.undefined)
    
    inline def setMayUserDice(value: (/* user */ User, /* diceConfig */ DiceConfiguration) => Boolean): Self = StObject.set(x, "mayUserDice", js.Any.fromFunction2(value))
    
    inline def setMayUserDiceUndefined: Self = StObject.set(x, "mayUserDice", js.undefined)
    
    inline def setOnAccountChangedKnuddelAmount(
      value: (/* user */ User, /* knuddelAccount */ KnuddelAccount, /* oldKnuddelAmount */ KnuddelAmount, /* newKnuddelAmount */ KnuddelAmount) => Unit
    ): Self = StObject.set(x, "onAccountChangedKnuddelAmount", js.Any.fromFunction4(value))
    
    inline def setOnAccountChangedKnuddelAmountUndefined: Self = StObject.set(x, "onAccountChangedKnuddelAmount", js.undefined)
    
    inline def setOnAccountReceivedKnuddel(
      value: (/* sender */ User, /* receiver */ BotUser, /* knuddelAmount */ KnuddelAmount, /* transferReason */ java.lang.String, /* knuddelAccount */ KnuddelAccount) => Unit
    ): Self = StObject.set(x, "onAccountReceivedKnuddel", js.Any.fromFunction5(value))
    
    inline def setOnAccountReceivedKnuddelUndefined: Self = StObject.set(x, "onAccountReceivedKnuddel", js.undefined)
    
    inline def setOnAppEventReceived(
      value: (/* appInstance */ AppInstance, /* type */ java.lang.String, /* data */ KnuddelsEvent) => Unit
    ): Self = StObject.set(x, "onAppEventReceived", js.Any.fromFunction3(value))
    
    inline def setOnAppEventReceivedUndefined: Self = StObject.set(x, "onAppEventReceived", js.undefined)
    
    inline def setOnAppStart(value: () => Unit): Self = StObject.set(x, "onAppStart", js.Any.fromFunction0(value))
    
    inline def setOnAppStartUndefined: Self = StObject.set(x, "onAppStart", js.undefined)
    
    inline def setOnBeforeKnuddelReceived(value: /* knuddelTransfer */ KnuddelTransfer => Unit): Self = StObject.set(x, "onBeforeKnuddelReceived", js.Any.fromFunction1(value))
    
    inline def setOnBeforeKnuddelReceivedUndefined: Self = StObject.set(x, "onBeforeKnuddelReceived", js.undefined)
    
    inline def setOnDebtsUpdate(value: /* debts */ KnuddelAmount => Unit): Self = StObject.set(x, "onDebtsUpdate", js.Any.fromFunction1(value))
    
    inline def setOnDebtsUpdateUndefined: Self = StObject.set(x, "onDebtsUpdate", js.undefined)
    
    inline def setOnDeveloperCommand(value: (/* user */ User, /* params */ java.lang.String) => Unit): Self = StObject.set(x, "onDeveloperCommand", js.Any.fromFunction2(value))
    
    inline def setOnDeveloperCommandUndefined: Self = StObject.set(x, "onDeveloperCommand", js.undefined)
    
    inline def setOnEventReceived(
      value: (/* user */ User, /* type */ java.lang.String, /* data */ KnuddelsEvent, /* appContentSession */ AppContentSession) => Unit
    ): Self = StObject.set(x, "onEventReceived", js.Any.fromFunction4(value))
    
    inline def setOnEventReceivedUndefined: Self = StObject.set(x, "onEventReceived", js.undefined)
    
    inline def setOnKnuddelReceived(
      value: (/* sender */ User, /* receiver */ BotUser, /* knuddelAmount */ KnuddelAmount, /* transferReason */ java.lang.String) => Unit
    ): Self = StObject.set(x, "onKnuddelReceived", js.Any.fromFunction4(value))
    
    inline def setOnKnuddelReceivedUndefined: Self = StObject.set(x, "onKnuddelReceived", js.undefined)
    
    inline def setOnPrepareShutdown(value: /* secondsTillShutdown */ Double => Unit): Self = StObject.set(x, "onPrepareShutdown", js.Any.fromFunction1(value))
    
    inline def setOnPrepareShutdownUndefined: Self = StObject.set(x, "onPrepareShutdown", js.undefined)
    
    inline def setOnPrivateMessage(value: /* privateMessage */ PrivateMessage => Unit): Self = StObject.set(x, "onPrivateMessage", js.Any.fromFunction1(value))
    
    inline def setOnPrivateMessageUndefined: Self = StObject.set(x, "onPrivateMessage", js.undefined)
    
    inline def setOnPublicActionMessage(value: /* publicActionMessage */ PublicActionMessage => Unit): Self = StObject.set(x, "onPublicActionMessage", js.Any.fromFunction1(value))
    
    inline def setOnPublicActionMessageUndefined: Self = StObject.set(x, "onPublicActionMessage", js.undefined)
    
    inline def setOnPublicEventMessage(value: /* publicEventMessage */ PublicEventMessage => Unit): Self = StObject.set(x, "onPublicEventMessage", js.Any.fromFunction1(value))
    
    inline def setOnPublicEventMessageUndefined: Self = StObject.set(x, "onPublicEventMessage", js.undefined)
    
    inline def setOnPublicMessage(value: /* publicMessage */ PublicMessage => Unit): Self = StObject.set(x, "onPublicMessage", js.Any.fromFunction1(value))
    
    inline def setOnPublicMessageUndefined: Self = StObject.set(x, "onPublicMessage", js.undefined)
    
    inline def setOnShutdown(value: () => Unit): Self = StObject.set(x, "onShutdown", js.Any.fromFunction0(value))
    
    inline def setOnShutdownUndefined: Self = StObject.set(x, "onShutdown", js.undefined)
    
    inline def setOnUserDeleted(value: (/* userId */ Double, /* userPersistence */ UserPersistence) => Unit): Self = StObject.set(x, "onUserDeleted", js.Any.fromFunction2(value))
    
    inline def setOnUserDeletedUndefined: Self = StObject.set(x, "onUserDeleted", js.undefined)
    
    inline def setOnUserDiced(value: /* diceEvent */ DiceEvent => Unit): Self = StObject.set(x, "onUserDiced", js.Any.fromFunction1(value))
    
    inline def setOnUserDicedUndefined: Self = StObject.set(x, "onUserDiced", js.undefined)
    
    inline def setOnUserJoined(value: /* user */ User => Unit): Self = StObject.set(x, "onUserJoined", js.Any.fromFunction1(value))
    
    inline def setOnUserJoinedUndefined: Self = StObject.set(x, "onUserJoined", js.undefined)
    
    inline def setOnUserLeft(value: /* user */ User => Unit): Self = StObject.set(x, "onUserLeft", js.Any.fromFunction1(value))
    
    inline def setOnUserLeftUndefined: Self = StObject.set(x, "onUserLeft", js.undefined)
  }
}
