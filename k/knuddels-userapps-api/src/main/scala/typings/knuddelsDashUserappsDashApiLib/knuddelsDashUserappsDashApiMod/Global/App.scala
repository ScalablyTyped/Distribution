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
    mayJoinChannel: js.Function1[/* user */ User, ChannelJoinPermission] = null,
    mayShowPublicActionMessage: js.Function1[/* publicActionMessage */ PublicActionMessage, scala.Boolean] = null,
    mayShowPublicMessage: js.Function1[/* publicMessage */ PublicMessage, scala.Boolean] = null,
    mayUserDice: js.Function2[/* user */ User, /* diceConfig */ DiceConfiguration, scala.Boolean] = null,
    onAccountChangedKnuddelAmount: js.Function4[
      /* user */ User, 
      /* knuddelAccount */ KnuddelAccount, 
      /* oldKnuddelAmount */ KnuddelAmount, 
      /* newKnuddelAmount */ KnuddelAmount, 
      scala.Unit
    ] = null,
    onAccountReceivedKnuddel: js.Function5[
      /* sender */ User, 
      /* receiver */ BotUser, 
      /* knuddelAmount */ KnuddelAmount, 
      /* transferReason */ java.lang.String, 
      /* knuddelAccount */ KnuddelAccount, 
      scala.Unit
    ] = null,
    onAppEventReceived: js.Function3[
      /* appInstance */ AppInstance, 
      /* type */ java.lang.String, 
      /* data */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsEvent, 
      scala.Unit
    ] = null,
    onAppStart: js.Function0[scala.Unit] = null,
    onBeforeKnuddelReceived: js.Function1[/* knuddelTransfer */ KnuddelTransfer, scala.Unit] = null,
    onDeveloperCommand: js.Function2[/* user */ User, /* params */ java.lang.String, scala.Unit] = null,
    onEventReceived: js.Function4[
      /* user */ User, 
      /* type */ java.lang.String, 
      /* data */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsEvent, 
      /* appContentSession */ AppContentSession, 
      scala.Unit
    ] = null,
    onKnuddelReceived: js.Function4[
      /* sender */ User, 
      /* receiver */ BotUser, 
      /* knuddelAmount */ KnuddelAmount, 
      /* transferReason */ java.lang.String, 
      scala.Unit
    ] = null,
    onPrepareShutdown: js.Function1[/* secondsTillShutdown */ scala.Double, scala.Unit] = null,
    onPrivateMessage: js.Function1[/* privateMessage */ PrivateMessage, scala.Unit] = null,
    onPublicActionMessage: js.Function1[/* publicActionMessage */ PublicActionMessage, scala.Unit] = null,
    onPublicEventMessage: js.Function1[/* publicEventMessage */ PublicEventMessage, scala.Unit] = null,
    onPublicMessage: js.Function1[/* publicMessage */ PublicMessage, scala.Unit] = null,
    onShutdown: js.Function0[scala.Unit] = null,
    onUserDeleted: js.Function2[/* userId */ scala.Double, /* userPersistence */ UserPersistence, scala.Unit] = null,
    onUserDiced: js.Function1[/* diceEvent */ DiceEvent, scala.Unit] = null,
    onUserJoined: js.Function1[/* user */ User, scala.Unit] = null,
    onUserLeft: js.Function1[/* user */ User, scala.Unit] = null
  ): App = {
    val __obj = js.Dynamic.literal()
    if (chatCommands != null) __obj.updateDynamic("chatCommands")(chatCommands)
    if (mayJoinChannel != null) __obj.updateDynamic("mayJoinChannel")(mayJoinChannel)
    if (mayShowPublicActionMessage != null) __obj.updateDynamic("mayShowPublicActionMessage")(mayShowPublicActionMessage)
    if (mayShowPublicMessage != null) __obj.updateDynamic("mayShowPublicMessage")(mayShowPublicMessage)
    if (mayUserDice != null) __obj.updateDynamic("mayUserDice")(mayUserDice)
    if (onAccountChangedKnuddelAmount != null) __obj.updateDynamic("onAccountChangedKnuddelAmount")(onAccountChangedKnuddelAmount)
    if (onAccountReceivedKnuddel != null) __obj.updateDynamic("onAccountReceivedKnuddel")(onAccountReceivedKnuddel)
    if (onAppEventReceived != null) __obj.updateDynamic("onAppEventReceived")(onAppEventReceived)
    if (onAppStart != null) __obj.updateDynamic("onAppStart")(onAppStart)
    if (onBeforeKnuddelReceived != null) __obj.updateDynamic("onBeforeKnuddelReceived")(onBeforeKnuddelReceived)
    if (onDeveloperCommand != null) __obj.updateDynamic("onDeveloperCommand")(onDeveloperCommand)
    if (onEventReceived != null) __obj.updateDynamic("onEventReceived")(onEventReceived)
    if (onKnuddelReceived != null) __obj.updateDynamic("onKnuddelReceived")(onKnuddelReceived)
    if (onPrepareShutdown != null) __obj.updateDynamic("onPrepareShutdown")(onPrepareShutdown)
    if (onPrivateMessage != null) __obj.updateDynamic("onPrivateMessage")(onPrivateMessage)
    if (onPublicActionMessage != null) __obj.updateDynamic("onPublicActionMessage")(onPublicActionMessage)
    if (onPublicEventMessage != null) __obj.updateDynamic("onPublicEventMessage")(onPublicEventMessage)
    if (onPublicMessage != null) __obj.updateDynamic("onPublicMessage")(onPublicMessage)
    if (onShutdown != null) __obj.updateDynamic("onShutdown")(onShutdown)
    if (onUserDeleted != null) __obj.updateDynamic("onUserDeleted")(onUserDeleted)
    if (onUserDiced != null) __obj.updateDynamic("onUserDiced")(onUserDiced)
    if (onUserJoined != null) __obj.updateDynamic("onUserJoined")(onUserJoined)
    if (onUserLeft != null) __obj.updateDynamic("onUserLeft")(onUserLeft)
    __obj.asInstanceOf[App]
  }
}

