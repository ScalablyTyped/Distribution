package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registrar {
  
  @JSGlobal("KSR.registrar")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addSockHdr(hdr_name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("add_sock_hdr")(hdr_name.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def lookup(table: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(table.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def lookupBranches(_dtable: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lookup_branches")(_dtable.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def lookupToDset(table: String, uri: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup_to_dset")(table.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def lookupUri(table: String, uri: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup_uri")(table.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def regFetchContacts(dtable: String, uri: String, profile: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("reg_fetch_contacts")(dtable.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], profile.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def regFreeContacts(profile: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("reg_free_contacts")(profile.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def registered(table: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("registered")(table.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def registeredAction(_dtable: String, _uri: String, _f: Double, _aflags: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("registered_action")(_dtable.asInstanceOf[js.Any], _uri.asInstanceOf[js.Any], _f.asInstanceOf[js.Any], _aflags.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def registeredFlags(_dtable: String, _uri: String, _f: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("registered_flags")(_dtable.asInstanceOf[js.Any], _uri.asInstanceOf[js.Any], _f.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def registeredUri(_dtable: String, _uri: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("registered_uri")(_dtable.asInstanceOf[js.Any], _uri.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def save(table: String, flags: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("save")(table.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def saveUri(table: String, flags: Double, uri: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("save_uri")(table.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def setQOverride(new_q: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("set_q_override")(new_q.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def unregister(_dtable: String, _uri: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(_dtable.asInstanceOf[js.Any], _uri.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def unregisterRuid(_dtable: String, _uri: String, _ruid: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("unregister_ruid")(_dtable.asInstanceOf[js.Any], _uri.asInstanceOf[js.Any], _ruid.asInstanceOf[js.Any])).asInstanceOf[Double]
}
