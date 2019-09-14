package typings.ineum

import typings.ineum.ineumStrings.autoClearResourceTimings
import typings.ineum.ineumStrings.getPageLoadId
import typings.ineum.ineumStrings.ignoreErrorMessages
import typings.ineum.ineumStrings.ignoreUrls
import typings.ineum.ineumStrings.key
import typings.ineum.ineumStrings.meta
import typings.ineum.ineumStrings.page
import typings.ineum.ineumStrings.reportError
import typings.ineum.ineumStrings.reportingUrl
import typings.ineum.ineumStrings.traceId
import typings.ineum.ineumStrings.user
import typings.ineum.ineumStrings.whitelistedOrigins
import typings.ineum.ineumStrings.wrapEventHandlers
import typings.ineum.ineumStrings.wrapTimers
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  @JSName("ineum")
  def ineum_autoClearResourceTimings(command: autoClearResourceTimings, enable: Boolean): Unit = js.native
  @JSName("ineum")
  def ineum_getPageLoadId(command: getPageLoadId): js.UndefOr[String] = js.native
  @JSName("ineum")
  def ineum_ignoreErrorMessages(command: ignoreErrorMessages, values: js.Array[RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_ignoreUrls(command: ignoreUrls, values: js.Array[RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_key(command: key, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_meta(command: meta, key: String, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_page(command: page, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_reportError(command: reportError, error: String): Unit = js.native
  @JSName("ineum")
  def ineum_reportError(command: reportError, error: String, opts: Anon_ComponentStack): Unit = js.native
  @JSName("ineum")
  def ineum_reportingUrl(command: reportingUrl, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_traceId(command: traceId, value: String): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: String): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: String, userName: String): Unit = js.native
  @JSName("ineum")
  def ineum_user(command: user, userId: String, userName: String, userEmail: String): Unit = js.native
  @JSName("ineum")
  def ineum_whitelistedOrigins(command: whitelistedOrigins, values: js.Array[RegExp]): Unit = js.native
  @JSName("ineum")
  def ineum_wrapEventHandlers(command: wrapEventHandlers, enable: Boolean): Unit = js.native
  @JSName("ineum")
  def ineum_wrapTimers(command: wrapTimers, enable: Boolean): Unit = js.native
}

