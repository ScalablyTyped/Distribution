package typings.maximMazurokGapiClientClassroom

import typings.maximMazurokGapiClientClassroom.gapi.client.classroom.CoursesResource
import typings.maximMazurokGapiClientClassroom.gapi.client.classroom.InvitationsResource
import typings.maximMazurokGapiClientClassroom.gapi.client.classroom.RegistrationsResource
import typings.maximMazurokGapiClientClassroom.gapi.client.classroom.UserProfilesResource
import typings.maximMazurokGapiClientClassroom.maximMazurokGapiClientClassroomStrings.classroom
import typings.maximMazurokGapiClientClassroom.maximMazurokGapiClientClassroomStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object gapi extends js.Object {
    
    @js.native
    object client extends js.Object {
      
      /** Load Google Classroom API v1 */
      def load(name: classroom, version: v1): js.Thenable[Unit] = js.native
      def load(name: classroom, version: v1, callback: js.Function0[_]): Unit = js.native
      
      @js.native
      object classroom extends js.Object {
        
        val courses: CoursesResource = js.native
        
        val invitations: InvitationsResource = js.native
        
        val registrations: RegistrationsResource = js.native
        
        val userProfiles: UserProfilesResource = js.native
      }
    }
  }
}
