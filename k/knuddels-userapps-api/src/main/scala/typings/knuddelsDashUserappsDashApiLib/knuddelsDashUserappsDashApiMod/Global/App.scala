package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/App.html
	 */
trait App extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#property_chatCommands
  		 */
  var chatCommands: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      js.Function3[
        /* user */ User, 
        /* params */ java.lang.String, 
        /* command */ java.lang.String, 
        scala.Unit
      ]
    ]
  ] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayJoinChannel
  		 */
  var mayJoinChannel: js.UndefOr[js.Function1[/* user */ User, ChannelJoinPermission]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayShowPublicActionMessage
  		 */
  var mayShowPublicActionMessage: js.UndefOr[js.Function1[/* publicActionMessage */ PublicActionMessage, scala.Boolean]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayShowPublicMessage
  		 */
  var mayShowPublicMessage: js.UndefOr[js.Function1[/* publicMessage */ PublicMessage, scala.Boolean]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayUserDice
  		 */
  var mayUserDice: js.UndefOr[js.Function2[/* user */ User, /* diceConfig */ DiceConfiguration, scala.Boolean]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onAccountChangedKnuddelAmount
  		 */
  var onAccountChangedKnuddelAmount: js.UndefOr[
    js.Function4[
      /* user */ User, 
      /* knuddelAccount */ KnuddelAccount, 
      /* oldKnuddelAmount */ KnuddelAmount, 
      /* newKnuddelAmount */ KnuddelAmount, 
      scala.Unit
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
      scala.Unit
    ]
  ] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onAppEventReceived
  		 */
  var onAppEventReceived: js.UndefOr[
    js.Function3[
      /* appInstance */ AppInstance, 
      /* type */ java.lang.String, 
      /* data */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsEvent, 
      scala.Unit
    ]
  ] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onAppStart
  		 */
  var onAppStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onBeforeKnuddelReceived
  		 */
  var onBeforeKnuddelReceived: js.UndefOr[js.Function1[/* knuddelTransfer */ KnuddelTransfer, scala.Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onDeveloperCommand
  		 * @since AppServer 108662, ChatServer 108662
  		 */
  var onDeveloperCommand: js.UndefOr[js.Function2[/* user */ User, /* params */ java.lang.String, scala.Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onEventReceived
  		 */
  var onEventReceived: js.UndefOr[
    js.Function4[
      /* user */ User, 
      /* type */ java.lang.String, 
      /* data */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsEvent, 
      /* appContentSession */ AppContentSession, 
      scala.Unit
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
      scala.Unit
    ]
  ] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPrepareShutdown
  		 */
  var onPrepareShutdown: js.UndefOr[js.Function1[/* secondsTillShutdown */ scala.Double, scala.Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPrivateMessage
  		 */
  var onPrivateMessage: js.UndefOr[js.Function1[/* privateMessage */ PrivateMessage, scala.Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPublicActionMessage
  		 */
  var onPublicActionMessage: js.UndefOr[js.Function1[/* publicActionMessage */ PublicActionMessage, scala.Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPublicEventMessage
  		 */
  var onPublicEventMessage: js.UndefOr[js.Function1[/* publicEventMessage */ PublicEventMessage, scala.Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPublicMessage
  		 */
  var onPublicMessage: js.UndefOr[js.Function1[/* publicMessage */ PublicMessage, scala.Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onShutdown
  		 */
  var onShutdown: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserDeleted
  		 */
  var onUserDeleted: js.UndefOr[
    js.Function2[/* userId */ scala.Double, /* userPersistence */ UserPersistence, scala.Unit]
  ] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserDiced
  		 */
  var onUserDiced: js.UndefOr[js.Function1[/* diceEvent */ DiceEvent, scala.Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserJoined
  		 */
  var onUserJoined: js.UndefOr[js.Function1[/* user */ User, scala.Unit]] = js.undefined
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserLeft
  		 */
  var onUserLeft: js.UndefOr[js.Function1[/* user */ User, scala.Unit]] = js.undefined
}

object App {
  @scala.inline
  def apply(
    chatCommands: org.scalablytyped.runtime.StringDictionary[
      js.Function3[
        /* user */ User, 
        /* params */ java.lang.String, 
        /* command */ java.lang.String, 
        scala.Unit
      ]
    ] = null,
    mayJoinChannel: /* user */ User => ChannelJoinPermission = null,
    mayShowPublicActionMessage: /* publicActionMessage */ PublicActionMessage => scala.Boolean = null,
    mayShowPublicMessage: /* publicMessage */ PublicMessage => scala.Boolean = null,
    mayUserDice: (/* user */ User, /* diceConfig */ DiceConfiguration) => scala.Boolean = null,
    onAccountChangedKnuddelAmount: (/* user */ User, /* knuddelAccount */ KnuddelAccount, /* oldKnuddelAmount */ KnuddelAmount, /* newKnuddelAmount */ KnuddelAmount) => scala.Unit = null,
    onAccountReceivedKnuddel: (/* sender */ User, /* receiver */ BotUser, /* knuddelAmount */ KnuddelAmount, /* transferReason */ java.lang.String, /* knuddelAccount */ KnuddelAccount) => scala.Unit = null,
    onAppEventReceived: (/* appInstance */ AppInstance, /* type */ java.lang.String, /* data */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsEvent) => scala.Unit = null,
    onAppStart: () => scala.Unit = null,
    onBeforeKnuddelReceived: /* knuddelTransfer */ KnuddelTransfer => scala.Unit = null,
    onDeveloperCommand: (/* user */ User, /* params */ java.lang.String) => scala.Unit = null,
    onEventReceived: (/* user */ User, /* type */ java.lang.String, /* data */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsEvent, /* appContentSession */ AppContentSession) => scala.Unit = null,
    onKnuddelReceived: (/* sender */ User, /* receiver */ BotUser, /* knuddelAmount */ KnuddelAmount, /* transferReason */ java.lang.String) => scala.Unit = null,
    onPrepareShutdown: /* secondsTillShutdown */ scala.Double => scala.Unit = null,
    onPrivateMessage: /* privateMessage */ PrivateMessage => scala.Unit = null,
    onPublicActionMessage: /* publicActionMessage */ PublicActionMessage => scala.Unit = null,
    onPublicEventMessage: /* publicEventMessage */ PublicEventMessage => scala.Unit = null,
    onPublicMessage: /* publicMessage */ PublicMessage => scala.Unit = null,
    onShutdown: () => scala.Unit = null,
    onUserDeleted: (/* userId */ scala.Double, /* userPersistence */ UserPersistence) => scala.Unit = null,
    onUserDiced: /* diceEvent */ DiceEvent => scala.Unit = null,
    onUserJoined: /* user */ User => scala.Unit = null,
    onUserLeft: /* user */ User => scala.Unit = null
  ): App = {
    val __obj = js.Dynamic.literal()
    if (chatCommands != null) __obj.updateDynamic("chatCommands")(chatCommands)
    if (mayJoinChannel != null) __obj.updateDynamic("mayJoinChannel")(js.Any.fromFunction1(mayJoinChannel))
    if (mayShowPublicActionMessage != null) __obj.updateDynamic("mayShowPublicActionMessage")(js.Any.fromFunction1(mayShowPublicActionMessage))
    if (mayShowPublicMessage != null) __obj.updateDynamic("mayShowPublicMessage")(js.Any.fromFunction1(mayShowPublicMessage))
    if (mayUserDice != null) __obj.updateDynamic("mayUserDice")(js.Any.fromFunction2(mayUserDice))
    if (onAccountChangedKnuddelAmount != null) __obj.updateDynamic("onAccountChangedKnuddelAmount")(js.Any.fromFunction4(onAccountChangedKnuddelAmount))
    if (onAccountReceivedKnuddel != null) __obj.updateDynamic("onAccountReceivedKnuddel")(js.Any.fromFunction5(onAccountReceivedKnuddel))
    if (onAppEventReceived != null) __obj.updateDynamic("onAppEventReceived")(js.Any.fromFunction3(onAppEventReceived))
    if (onAppStart != null) __obj.updateDynamic("onAppStart")(js.Any.fromFunction0(onAppStart))
    if (onBeforeKnuddelReceived != null) __obj.updateDynamic("onBeforeKnuddelReceived")(js.Any.fromFunction1(onBeforeKnuddelReceived))
    if (onDeveloperCommand != null) __obj.updateDynamic("onDeveloperCommand")(js.Any.fromFunction2(onDeveloperCommand))
    if (onEventReceived != null) __obj.updateDynamic("onEventReceived")(js.Any.fromFunction4(onEventReceived))
    if (onKnuddelReceived != null) __obj.updateDynamic("onKnuddelReceived")(js.Any.fromFunction4(onKnuddelReceived))
    if (onPrepareShutdown != null) __obj.updateDynamic("onPrepareShutdown")(js.Any.fromFunction1(onPrepareShutdown))
    if (onPrivateMessage != null) __obj.updateDynamic("onPrivateMessage")(js.Any.fromFunction1(onPrivateMessage))
    if (onPublicActionMessage != null) __obj.updateDynamic("onPublicActionMessage")(js.Any.fromFunction1(onPublicActionMessage))
    if (onPublicEventMessage != null) __obj.updateDynamic("onPublicEventMessage")(js.Any.fromFunction1(onPublicEventMessage))
    if (onPublicMessage != null) __obj.updateDynamic("onPublicMessage")(js.Any.fromFunction1(onPublicMessage))
    if (onShutdown != null) __obj.updateDynamic("onShutdown")(js.Any.fromFunction0(onShutdown))
    if (onUserDeleted != null) __obj.updateDynamic("onUserDeleted")(js.Any.fromFunction2(onUserDeleted))
    if (onUserDiced != null) __obj.updateDynamic("onUserDiced")(js.Any.fromFunction1(onUserDiced))
    if (onUserJoined != null) __obj.updateDynamic("onUserJoined")(js.Any.fromFunction1(onUserJoined))
    if (onUserLeft != null) __obj.updateDynamic("onUserLeft")(js.Any.fromFunction1(onUserLeft))
    __obj.asInstanceOf[App]
  }
}

