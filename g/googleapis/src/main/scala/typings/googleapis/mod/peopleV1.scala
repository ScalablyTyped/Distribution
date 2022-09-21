package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peopleV1 {
  
  @JSImport("googleapis", "people_v1.People")
  @js.native
  open class People protected ()
    extends typings.googleapis.peopleV1Mod.peopleV1.People {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "people_v1.Resource$Contactgroups")
  @js.native
  open class ResourceContactgroups protected ()
    extends typings.googleapis.peopleV1Mod.peopleV1.ResourceContactgroups {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "people_v1.Resource$Contactgroups$Members")
  @js.native
  open class ResourceContactgroupsMembers protected ()
    extends typings.googleapis.peopleV1Mod.peopleV1.ResourceContactgroupsMembers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "people_v1.Resource$Othercontacts")
  @js.native
  open class ResourceOthercontacts protected ()
    extends typings.googleapis.peopleV1Mod.peopleV1.ResourceOthercontacts {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "people_v1.Resource$People")
  @js.native
  open class ResourcePeople protected ()
    extends typings.googleapis.peopleV1Mod.peopleV1.ResourcePeople {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "people_v1.Resource$People$Connections")
  @js.native
  open class ResourcePeopleConnections protected ()
    extends typings.googleapis.peopleV1Mod.peopleV1.ResourcePeopleConnections {
    def this(context: APIRequestContext) = this()
  }
}
