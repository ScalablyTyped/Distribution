package typings.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registrar {
  
  @JSGlobal("KSR.registrar.add_sock_hdr")
  @js.native
  def addSockHdr(hdr_name: String): Double = js.native
  
  @JSGlobal("KSR.registrar.lookup")
  @js.native
  def lookup(table: String): Double = js.native
  
  @JSGlobal("KSR.registrar.lookup_branches")
  @js.native
  def lookupBranches(_dtable: String): Double = js.native
  
  @JSGlobal("KSR.registrar.lookup_to_dset")
  @js.native
  def lookupToDset(table: String, uri: String): Double = js.native
  
  @JSGlobal("KSR.registrar.lookup_uri")
  @js.native
  def lookupUri(table: String, uri: String): Double = js.native
  
  @JSGlobal("KSR.registrar.reg_fetch_contacts")
  @js.native
  def regFetchContacts(dtable: String, uri: String, profile: String): Double = js.native
  
  @JSGlobal("KSR.registrar.reg_free_contacts")
  @js.native
  def regFreeContacts(profile: String): Double = js.native
  
  @JSGlobal("KSR.registrar.registered")
  @js.native
  def registered(table: String): Double = js.native
  
  @JSGlobal("KSR.registrar.registered_action")
  @js.native
  def registeredAction(_dtable: String, _uri: String, _f: Double, _aflags: Double): Double = js.native
  
  @JSGlobal("KSR.registrar.registered_flags")
  @js.native
  def registeredFlags(_dtable: String, _uri: String, _f: Double): Double = js.native
  
  @JSGlobal("KSR.registrar.registered_uri")
  @js.native
  def registeredUri(_dtable: String, _uri: String): Double = js.native
  
  @JSGlobal("KSR.registrar.save")
  @js.native
  def save(table: String, flags: Double): Double = js.native
  
  @JSGlobal("KSR.registrar.save_uri")
  @js.native
  def saveUri(table: String, flags: Double, uri: String): Double = js.native
  
  @JSGlobal("KSR.registrar.set_q_override")
  @js.native
  def setQOverride(new_q: String): Double = js.native
  
  @JSGlobal("KSR.registrar.unregister")
  @js.native
  def unregister(_dtable: String, _uri: String): Double = js.native
  
  @JSGlobal("KSR.registrar.unregister_ruid")
  @js.native
  def unregisterRuid(_dtable: String, _uri: String, _ruid: String): Double = js.native
}
