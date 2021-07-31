package typings.googleapis.gmailV1Mod.gmailV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Gmail API
  *
  * Access Gmail mailboxes including sending user email.
  *
  * @example
  * const {google} = require('googleapis');
  * const gmail = google.gmail('v1');
  *
  * @namespace gmail
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Gmail
  */
@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Gmail")
@js.native
class Gmail protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var users: ResourceUsers = js.native
}
