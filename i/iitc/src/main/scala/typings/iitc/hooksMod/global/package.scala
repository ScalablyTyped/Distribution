package typings.iitc.hooksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object global {
  
  /* class search.Query */
  type EventPaneChanged = java.lang.String
  
  type EventSearch = js.Any
  
  type HookCallback = js.Function1[/* data */ js.Any, scala.Boolean | scala.Unit]
  
  type PortalDetailEnt = js.Tuple3[
    /*guid*/ java.lang.String, 
    /*dict.timestamp*/ scala.Double, 
    /*data.result*/ typings.iitc.inteltypesMod.Intel.PortalDetails
  ]
  
  /**
    * register a callback for an event
    * (user defined hooks)
    */
  @scala.inline
  def addHook(event: java.lang.String, callback: typings.iitc.hooksMod.global.HookCallback): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * called when the set of artifacts (including targets) has changed.
    */
  @scala.inline
  def addHook_artifactsUpdated(
    event: typings.iitc.iitcStrings.artifactsUpdated,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventArtifactsUpdated, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * this hook runs after data for the faction chat has been received and processed, but not yet been
    * displayed. The data hash contains both the unprocessed raw ajax response as well as the processed chat data
    * that is going to be used for display.
    */
  @scala.inline
  def addHook_factionChatDataAvailable(
    event: typings.iitc.iitcStrings.factionChatDataAvailable,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventFactionChatDataAvailable, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * called when a field is about to be added to the map
    */
  @scala.inline
  def addHook_fieldAdded(
    event: typings.iitc.iitcStrings.fieldAdded,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventFieldAdded, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * called when a field has been removed
    */
  @scala.inline
  def addHook_fieldRemoved(
    event: typings.iitc.iitcStrings.fieldRemoved,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventFieldRemoved, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * called after IITC and all plugins loaded
    * NOTE: if iitc is already loaded this event never happens. Check the @see iitcLoaded flag
    */
  @scala.inline
  def addHook_iitcLoaded(event: typings.iitc.iitcStrings.iitcLoaded, callback: js.Function0[scala.Unit]): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * called when a link is about to be added to the map
    */
  @scala.inline
  def addHook_linkAdded(
    event: typings.iitc.iitcStrings.linkAdded,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventLinkAdded, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * called when a link has been removed
    */
  @scala.inline
  def addHook_linkRemoved(
    event: typings.iitc.iitcStrings.linkRemoved,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventLinkRemoved, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * called just as we start to render data. has callback to inject cached entities into the map render
    */
  @scala.inline
  def addHook_mapDataEntityInject(
    event: typings.iitc.iitcStrings.mapDataEntityInject,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventMapDataEntityInject, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * called when we complete the map data load
    */
  @scala.inline
  def addHook_mapDataRefreshEnd(
    event: typings.iitc.iitcStrings.mapDataRefreshEnd,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventMapDataRefreshEnd, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * called when we start refreshing map data
    */
  @scala.inline
  def addHook_mapDataRefreshStart(
    event: typings.iitc.iitcStrings.mapDataRefreshStart,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventMapDataRefreshStart, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def addHook_nicknameClicked(
    event: typings.iitc.iitcStrings.nicknameClicked,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventNicknameClicked, scala.Boolean]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * called when the current pane has changed. On desktop, this only selects the current chat pane; on mobile, it
    * also switches between map, info and other panes defined by plugins
    */
  @scala.inline
  def addHook_paneChanged(
    event: typings.iitc.iitcStrings.paneChanged,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventPaneChanged, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * called when a portal has been received and is about to be added to its layer group.
    * Note that this does NOT mean it is already visible or will be, shortly after.
    * If a portal is added to a hidden layer it may never be shown at all.
    */
  @scala.inline
  def addHook_portalAdded(
    event: typings.iitc.iitcStrings.portalAdded,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventPortalAdded, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * alled when a request to load full portal detail completes.
    */
  @scala.inline
  def addHook_portalDetailLoaded(
    event: typings.iitc.iitcStrings.portalDetailLoaded,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventPortalDetailLoaded, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * fired after the details in the sidebar have been (re-)rendered Provides data about the portal
    * that has been selected.
    */
  @scala.inline
  def addHook_portalDetailsUpdated(
    event: typings.iitc.iitcStrings.portalDetailsUpdated,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventPortalDetailsUpdated, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * called when a portal has been removed
    */
  @scala.inline
  def addHook_portalRemoved(
    event: typings.iitc.iitcStrings.portalRemoved,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventPortalRemoved, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * called when portal on map is selected/unselected
    */
  @scala.inline
  def addHook_portalSelected(
    event: typings.iitc.iitcStrings.portalSelected,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventPortalSelected, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * this hook runs after data for any of the public chats has been received and processed, but not
    * yet been displayed. The data hash contains both the unprocessed raw ajax response as well as the processed
    * chat data that is going to be used for display.
    */
  @scala.inline
  def addHook_publicChatDataAvailable(
    event: typings.iitc.iitcStrings.publicChatDataAvailable,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventPublicChatDataAvailable, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * register a callback for an event
    * called after each map data request finished.
    */
  @scala.inline
  def addHook_requestFinished(
    event: typings.iitc.iitcStrings.requestFinished,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventRequestFinished, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def addHook_search(
    event: typings.iitc.iitcStrings.search,
    callback: js.Function1[/* e */ typings.iitc.hooksMod.global.EventSearch, scala.Unit]
  ): scala.Unit = (js.Dynamic.global.applyDynamic("addHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /** register a custom event */
  @scala.inline
  def pluginCreateHook(event: java.lang.String): scala.Unit = js.Dynamic.global.applyDynamic("pluginCreateHook")(event.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /** remove a registered a callback */
  @scala.inline
  def removeHook(event: java.lang.String, callback: typings.iitc.hooksMod.global.HookCallback): scala.Unit = (js.Dynamic.global.applyDynamic("removeHook")(event.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /** trigger event */
  @scala.inline
  def runHooks(event: java.lang.String, data: js.Any): scala.Boolean = (js.Dynamic.global.applyDynamic("runHooks")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
}
