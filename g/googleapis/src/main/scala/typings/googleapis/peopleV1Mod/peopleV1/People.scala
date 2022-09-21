package typings.googleapis.peopleV1Mod.peopleV1

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/people/v1", "people_v1.People")
@js.native
open class People protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var contactGroups: ResourceContactgroups = js.native
  
  var context: APIRequestContext = js.native
  
  var otherContacts: ResourceOthercontacts = js.native
  
  var people: ResourcePeople = js.native
}
