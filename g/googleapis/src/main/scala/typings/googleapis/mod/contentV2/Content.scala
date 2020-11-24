package typings.googleapis.mod.contentV2

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Content API for Shopping
  *
  * Manages product items, inventory, and Merchant Center accounts for Google
  * Shopping.
  *
  * @example
  * const {google} = require('googleapis');
  * const content = google.content('v2');
  *
  * @namespace content
  * @type {Function}
  * @version v2
  * @variation v2
  * @param {object=} options Options for Content
  */
@JSImport("googleapis", "content_v2.Content")
@js.native
class Content protected ()
  extends typings.googleapis.contentV2Mod.contentV2.Content {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
