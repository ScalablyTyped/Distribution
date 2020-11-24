package typings.googleapis.peopleV1Mod.peopleV1

import typings.googleapisCommon.apiMod.APIRequestContext
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
@JSImport("googleapis/build/src/apis/people/v1", "people_v1.People")
@js.native
class People protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var contactGroups: ResourceContactgroups = js.native
  
  var context: APIRequestContext = js.native
  
  var people: ResourcePeople = js.native
}
