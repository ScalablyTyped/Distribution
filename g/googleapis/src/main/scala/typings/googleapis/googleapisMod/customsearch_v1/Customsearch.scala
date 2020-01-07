package typings.googleapis.googleapisMod.customsearch_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomSearch API
  *
  * Searches over a website or collection of websites
  *
  * @example
  * const {google} = require('googleapis');
  * const customsearch = google.customsearch('v1');
  *
  * @namespace customsearch
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Customsearch
  */
@JSImport("googleapis", "customsearch_v1.Customsearch")
@js.native
class Customsearch protected ()
  extends typings.googleapis.buildSrcApisCustomsearchV1Mod.customsearch_v1.Customsearch {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

