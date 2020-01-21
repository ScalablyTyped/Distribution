package typings.googleapis.mod.tagmanagerV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tag Manager API
  *
  * Accesses Tag Manager accounts and containers.
  *
  * @example
  * const {google} = require('googleapis');
  * const tagmanager = google.tagmanager('v1');
  *
  * @namespace tagmanager
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Tagmanager
  */
@JSImport("googleapis", "tagmanager_v1.Tagmanager")
@js.native
class Tagmanager protected ()
  extends typings.googleapis.tagmanagerV1Mod.tagmanagerV1.Tagmanager {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

