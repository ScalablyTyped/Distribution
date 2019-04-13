package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchCallbackResponse
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("on")
  def on_end(
    event: ldapjsLib.ldapjsLibStrings.end,
    listener: js.Function1[/* res */ LDAPResult | scala.Null, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: ldapjsLib.ldapjsLibStrings.error, listener: js.Function1[/* err */ Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_page(
    event: ldapjsLib.ldapjsLibStrings.page,
    listener: js.Function2[
      /* res */ LDAPResult, 
      /* cb */ js.Function1[/* repeated */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_searchEntry(
    event: ldapjsLib.ldapjsLibStrings.searchEntry,
    listener: js.Function1[/* entry */ SearchEntry, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_searchReference(
    event: ldapjsLib.ldapjsLibStrings.searchReference,
    listener: js.Function1[/* referral */ SearchReference, scala.Unit]
  ): this.type = js.native
}

