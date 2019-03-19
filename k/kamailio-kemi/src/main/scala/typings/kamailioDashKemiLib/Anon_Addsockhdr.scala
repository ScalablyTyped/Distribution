package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Addsockhdr extends js.Object {
  def add_sock_hdr(hdr_name: java.lang.String): scala.Double
  def lookup(table: java.lang.String): scala.Double
  def lookup_branches(_dtable: java.lang.String): scala.Double
  def lookup_to_dset(table: java.lang.String, uri: java.lang.String): scala.Double
  def lookup_uri(table: java.lang.String, uri: java.lang.String): scala.Double
  def reg_fetch_contacts(dtable: java.lang.String, uri: java.lang.String, profile: java.lang.String): scala.Double
  def reg_free_contacts(profile: java.lang.String): scala.Double
  def registered(table: java.lang.String): scala.Double
  def registered_action(_dtable: java.lang.String, _uri: java.lang.String, _f: scala.Double, _aflags: scala.Double): scala.Double
  def registered_flags(_dtable: java.lang.String, _uri: java.lang.String, _f: scala.Double): scala.Double
  def registered_uri(_dtable: java.lang.String, _uri: java.lang.String): scala.Double
  def save(table: java.lang.String, flags: scala.Double): scala.Double
  def save_uri(table: java.lang.String, flags: scala.Double, uri: java.lang.String): scala.Double
  def set_q_override(new_q: java.lang.String): scala.Double
  def unregister(_dtable: java.lang.String, _uri: java.lang.String): scala.Double
  def unregister_ruid(_dtable: java.lang.String, _uri: java.lang.String, _ruid: java.lang.String): scala.Double
}

object Anon_Addsockhdr {
  @scala.inline
  def apply(
    add_sock_hdr: java.lang.String => scala.Double,
    lookup: java.lang.String => scala.Double,
    lookup_branches: java.lang.String => scala.Double,
    lookup_to_dset: (java.lang.String, java.lang.String) => scala.Double,
    lookup_uri: (java.lang.String, java.lang.String) => scala.Double,
    reg_fetch_contacts: (java.lang.String, java.lang.String, java.lang.String) => scala.Double,
    reg_free_contacts: java.lang.String => scala.Double,
    registered: java.lang.String => scala.Double,
    registered_action: (java.lang.String, java.lang.String, scala.Double, scala.Double) => scala.Double,
    registered_flags: (java.lang.String, java.lang.String, scala.Double) => scala.Double,
    registered_uri: (java.lang.String, java.lang.String) => scala.Double,
    save: (java.lang.String, scala.Double) => scala.Double,
    save_uri: (java.lang.String, scala.Double, java.lang.String) => scala.Double,
    set_q_override: java.lang.String => scala.Double,
    unregister: (java.lang.String, java.lang.String) => scala.Double,
    unregister_ruid: (java.lang.String, java.lang.String, java.lang.String) => scala.Double
  ): Anon_Addsockhdr = {
    val __obj = js.Dynamic.literal(add_sock_hdr = js.Any.fromFunction1(add_sock_hdr), lookup = js.Any.fromFunction1(lookup), lookup_branches = js.Any.fromFunction1(lookup_branches), lookup_to_dset = js.Any.fromFunction2(lookup_to_dset), lookup_uri = js.Any.fromFunction2(lookup_uri), reg_fetch_contacts = js.Any.fromFunction3(reg_fetch_contacts), reg_free_contacts = js.Any.fromFunction1(reg_free_contacts), registered = js.Any.fromFunction1(registered), registered_action = js.Any.fromFunction4(registered_action), registered_flags = js.Any.fromFunction3(registered_flags), registered_uri = js.Any.fromFunction2(registered_uri), save = js.Any.fromFunction2(save), save_uri = js.Any.fromFunction3(save_uri), set_q_override = js.Any.fromFunction1(set_q_override), unregister = js.Any.fromFunction2(unregister), unregister_ruid = js.Any.fromFunction3(unregister_ruid))
  
    __obj.asInstanceOf[Anon_Addsockhdr]
  }
}

