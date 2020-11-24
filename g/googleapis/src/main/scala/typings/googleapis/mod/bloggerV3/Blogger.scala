package typings.googleapis.mod.bloggerV3

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Blogger API
  *
  * API for access to the data within Blogger.
  *
  * @example
  * const {google} = require('googleapis');
  * const blogger = google.blogger('v3');
  *
  * @namespace blogger
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Blogger
  */
@JSImport("googleapis", "blogger_v3.Blogger")
@js.native
class Blogger protected ()
  extends typings.googleapis.bloggerV3Mod.bloggerV3.Blogger {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
