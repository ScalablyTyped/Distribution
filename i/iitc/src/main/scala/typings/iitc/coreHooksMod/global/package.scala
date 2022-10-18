package typings.iitc.coreHooksMod.global

import typings.iitc.coreInteltypesMod.Intel.PortalDetails
import typings.iitc.iitcStrings.artifactsUpdated
import typings.iitc.iitcStrings.factionChatDataAvailable
import typings.iitc.iitcStrings.fieldAdded
import typings.iitc.iitcStrings.fieldRemoved
import typings.iitc.iitcStrings.iitcLoaded
import typings.iitc.iitcStrings.linkAdded
import typings.iitc.iitcStrings.linkRemoved
import typings.iitc.iitcStrings.mapDataEntityInject
import typings.iitc.iitcStrings.mapDataRefreshEnd
import typings.iitc.iitcStrings.mapDataRefreshStart
import typings.iitc.iitcStrings.nicknameClicked
import typings.iitc.iitcStrings.paneChanged
import typings.iitc.iitcStrings.portalAdded
import typings.iitc.iitcStrings.portalDetailLoaded
import typings.iitc.iitcStrings.portalDetailsUpdated
import typings.iitc.iitcStrings.portalRemoved
import typings.iitc.iitcStrings.portalSelected
import typings.iitc.iitcStrings.publicChatDataAvailable
import typings.iitc.iitcStrings.requestFinished
import typings.iitc.iitcStrings.search
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * register a callback for an event
  * (user defined hooks)
  */
inline def addHook(event: String, callback: HookCallback): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * called when the set of artifacts (including targets) has changed.
  */
inline def addHook_artifactsUpdated(event: artifactsUpdated, callback: js.Function1[/* e */ EventArtifactsUpdated, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * this hook runs after data for the faction chat has been received and processed, but not yet been
  * displayed. The data hash contains both the unprocessed raw ajax response as well as the processed chat data
  * that is going to be used for display.
  */
inline def addHook_factionChatDataAvailable(
  event: factionChatDataAvailable,
  callback: js.Function1[/* e */ EventFactionChatDataAvailable, Unit]
): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * called when a field is about to be added to the map
  */
inline def addHook_fieldAdded(event: fieldAdded, callback: js.Function1[/* e */ EventFieldAdded, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * called when a field has been removed
  */
inline def addHook_fieldRemoved(event: fieldRemoved, callback: js.Function1[/* e */ EventFieldRemoved, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * called after IITC and all plugins loaded
  * NOTE: if iitc is already loaded this event never happens. Check the @see iitcLoaded flag
  */
inline def addHook_iitcLoaded(event: iitcLoaded, callback: js.Function0[Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * called when a link is about to be added to the map
  */
inline def addHook_linkAdded(event: linkAdded, callback: js.Function1[/* e */ EventLinkAdded, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * called when a link has been removed
  */
inline def addHook_linkRemoved(event: linkRemoved, callback: js.Function1[/* e */ EventLinkRemoved, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * called just as we start to render data. has callback to inject cached entities into the map render
  */
inline def addHook_mapDataEntityInject(event: mapDataEntityInject, callback: js.Function1[/* e */ EventMapDataEntityInject, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * called when we complete the map data load
  */
inline def addHook_mapDataRefreshEnd(event: mapDataRefreshEnd, callback: js.Function1[/* e */ EventMapDataRefreshEnd, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * called when we start refreshing map data
  */
inline def addHook_mapDataRefreshStart(event: mapDataRefreshStart, callback: js.Function1[/* e */ EventMapDataRefreshStart, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addHook_nicknameClicked(event: nicknameClicked, callback: js.Function1[/* e */ EventNicknameClicked, Boolean]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * called when the current pane has changed. On desktop, this only selects the current chat pane; on mobile, it
  * also switches between map, info and other panes defined by plugins
  */
inline def addHook_paneChanged(event: paneChanged, callback: js.Function1[/* e */ EventPaneChanged, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * called when a portal has been received and is about to be added to its layer group.
  * Note that this does NOT mean it is already visible or will be, shortly after.
  * If a portal is added to a hidden layer it may never be shown at all.
  */
inline def addHook_portalAdded(event: portalAdded, callback: js.Function1[/* e */ EventPortalAdded, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * alled when a request to load full portal detail completes.
  */
inline def addHook_portalDetailLoaded(event: portalDetailLoaded, callback: js.Function1[/* e */ EventPortalDetailLoaded, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * fired after the details in the sidebar have been (re-)rendered Provides data about the portal
  * that has been selected.
  */
inline def addHook_portalDetailsUpdated(event: portalDetailsUpdated, callback: js.Function1[/* e */ EventPortalDetailsUpdated, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * called when a portal has been removed
  */
inline def addHook_portalRemoved(event: portalRemoved, callback: js.Function1[/* e */ EventPortalRemoved, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * called when portal on map is selected/unselected
  */
inline def addHook_portalSelected(event: portalSelected, callback: js.Function1[/* e */ EventPortalSelected, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * this hook runs after data for any of the public chats has been received and processed, but not
  * yet been displayed. The data hash contains both the unprocessed raw ajax response as well as the processed
  * chat data that is going to be used for display.
  */
inline def addHook_publicChatDataAvailable(event: publicChatDataAvailable, callback: js.Function1[/* e */ EventPublicChatDataAvailable, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * register a callback for an event
  * called after each map data request finished.
  */
inline def addHook_requestFinished(event: requestFinished, callback: js.Function1[/* e */ EventRequestFinished, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def addHook_search(event: search, callback: js.Function1[/* e */ EventSearch, Unit]): Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/** register a custom event */
inline def pluginCreateHook(event: String): Unit = js.Dynamic.global.applyDynamic("pluginCreateHook")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]

/** remove a registered a callback */
inline def removeHook(event: String, callback: HookCallback): Unit = (js.Dynamic.global.applyDynamic("removeHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/** trigger event */
inline def runHooks(event: String, data: Any): Boolean = (js.Dynamic.global.applyDynamic("runHooks")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/* class search.Query */
type EventPaneChanged = String

type EventSearch = Any

type HookCallback = js.Function1[/* data */ Any, Boolean | Unit]

type PortalDetailEnt = js.Tuple3[/*guid*/ String, /*dict.timestamp*/ Double, /*data.result*/ PortalDetails]
