package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofregistrar extends js.Object {
  def add_sock_hdr(hdr_name: String): Double
  def lookup(table: String): Double
  def lookup_branches(_dtable: String): Double
  def lookup_to_dset(table: String, uri: String): Double
  def lookup_uri(table: String, uri: String): Double
  def reg_fetch_contacts(dtable: String, uri: String, profile: String): Double
  def reg_free_contacts(profile: String): Double
  def registered(table: String): Double
  def registered_action(_dtable: String, _uri: String, _f: Double, _aflags: Double): Double
  def registered_flags(_dtable: String, _uri: String, _f: Double): Double
  def registered_uri(_dtable: String, _uri: String): Double
  def save(table: String, flags: Double): Double
  def save_uri(table: String, flags: Double, uri: String): Double
  def set_q_override(new_q: String): Double
  def unregister(_dtable: String, _uri: String): Double
  def unregister_ruid(_dtable: String, _uri: String, _ruid: String): Double
}

object Typeofregistrar {
  @scala.inline
  def apply(
    add_sock_hdr: String => Double,
    lookup: String => Double,
    lookup_branches: String => Double,
    lookup_to_dset: (String, String) => Double,
    lookup_uri: (String, String) => Double,
    reg_fetch_contacts: (String, String, String) => Double,
    reg_free_contacts: String => Double,
    registered: String => Double,
    registered_action: (String, String, Double, Double) => Double,
    registered_flags: (String, String, Double) => Double,
    registered_uri: (String, String) => Double,
    save: (String, Double) => Double,
    save_uri: (String, Double, String) => Double,
    set_q_override: String => Double,
    unregister: (String, String) => Double,
    unregister_ruid: (String, String, String) => Double
  ): Typeofregistrar = {
    val __obj = js.Dynamic.literal(add_sock_hdr = js.Any.fromFunction1(add_sock_hdr), lookup = js.Any.fromFunction1(lookup), lookup_branches = js.Any.fromFunction1(lookup_branches), lookup_to_dset = js.Any.fromFunction2(lookup_to_dset), lookup_uri = js.Any.fromFunction2(lookup_uri), reg_fetch_contacts = js.Any.fromFunction3(reg_fetch_contacts), reg_free_contacts = js.Any.fromFunction1(reg_free_contacts), registered = js.Any.fromFunction1(registered), registered_action = js.Any.fromFunction4(registered_action), registered_flags = js.Any.fromFunction3(registered_flags), registered_uri = js.Any.fromFunction2(registered_uri), save = js.Any.fromFunction2(save), save_uri = js.Any.fromFunction3(save_uri), set_q_override = js.Any.fromFunction1(set_q_override), unregister = js.Any.fromFunction2(unregister), unregister_ruid = js.Any.fromFunction3(unregister_ruid))
    __obj.asInstanceOf[Typeofregistrar]
  }
}

