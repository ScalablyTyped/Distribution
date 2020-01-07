package typings.googleapis.googleapisMod.chat_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hangouts Chat API
  *
  * Enables bots to fetch information and perform actions in Hangouts Chat.
  *
  * @example
  * const {google} = require('googleapis');
  * const chat = google.chat('v1');
  *
  * @namespace chat
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Chat
  */
@JSImport("googleapis", "chat_v1.Chat")
@js.native
class Chat protected ()
  extends typings.googleapis.buildSrcApisChatV1Mod.chat_v1.Chat {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

