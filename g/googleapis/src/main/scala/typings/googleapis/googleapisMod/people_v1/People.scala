package typings.googleapis.googleapisMod.people_v1

import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * People API
  *
  * Provides access to information about profiles and contacts.
  *
  * @example
  * const {google} = require('googleapis');
  * const people = google.people('v1');
  *
  * @namespace people
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for People
  */
@JSImport("googleapis", "people_v1.People")
@js.native
class People protected ()
  extends typings.googleapis.buildSrcApisPeopleV1Mod.people_v1.People {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

