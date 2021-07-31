package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presence {
  
  @JSGlobal("KSR.presence")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def handlePublish(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("handle_publish")().asInstanceOf[Double]
  
  @scala.inline
  def handlePublishUri(sender_uri: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("handle_publish_uri")(sender_uri.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def handleSubscribe(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("handle_subscribe")().asInstanceOf[Double]
  
  @scala.inline
  def handleSubscribeUri(wuri: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("handle_subscribe_uri")(wuri.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def presAuthStatus(watcher_uri: String, presentity_uri: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pres_auth_status")(watcher_uri.asInstanceOf[js.Any], presentity_uri.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def presHasSubscribers(pres_uri: String, wevent: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pres_has_subscribers")(pres_uri.asInstanceOf[js.Any], wevent.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def presRefreshWatchers(pres: String, event: String, `type`: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pres_refresh_watchers")(pres.asInstanceOf[js.Any], event.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def presRefreshWatchersFile(pres: String, event: String, `type`: Double, file_uri: String, filename: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pres_refresh_watchers_file")(pres.asInstanceOf[js.Any], event.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], file_uri.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def presUpdateWatchers(pres_uri: String, event: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pres_update_watchers")(pres_uri.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Double]
}
