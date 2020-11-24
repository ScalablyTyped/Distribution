package typings.googleapis.mod.peopleV1

import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends typings.googleapis.peopleV1Mod.peopleV1.People {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}
