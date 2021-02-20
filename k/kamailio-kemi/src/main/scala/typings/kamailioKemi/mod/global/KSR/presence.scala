package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presence {
  
  @JSGlobal("KSR.presence.handle_publish")
  @js.native
  def handlePublish(): Double = js.native
  
  @JSGlobal("KSR.presence.handle_publish_uri")
  @js.native
  def handlePublishUri(sender_uri: String): Double = js.native
  
  @JSGlobal("KSR.presence.handle_subscribe")
  @js.native
  def handleSubscribe(): Double = js.native
  
  @JSGlobal("KSR.presence.handle_subscribe_uri")
  @js.native
  def handleSubscribeUri(wuri: String): Double = js.native
  
  @JSGlobal("KSR.presence.pres_auth_status")
  @js.native
  def presAuthStatus(watcher_uri: String, presentity_uri: String): Double = js.native
  
  @JSGlobal("KSR.presence.pres_has_subscribers")
  @js.native
  def presHasSubscribers(pres_uri: String, wevent: String): Double = js.native
  
  @JSGlobal("KSR.presence.pres_refresh_watchers")
  @js.native
  def presRefreshWatchers(pres: String, event: String, `type`: Double): Double = js.native
  
  @JSGlobal("KSR.presence.pres_refresh_watchers_file")
  @js.native
  def presRefreshWatchersFile(pres: String, event: String, `type`: Double, file_uri: String, filename: String): Double = js.native
  
  @JSGlobal("KSR.presence.pres_update_watchers")
  @js.native
  def presUpdateWatchers(pres_uri: String, event: String): Double = js.native
}
