package typings.maximMazurokGapiClientClassroom

import typings.maximMazurokGapiClientClassroom.gapi.client.classroom.CoursesResource
import typings.maximMazurokGapiClientClassroom.gapi.client.classroom.InvitationsResource
import typings.maximMazurokGapiClientClassroom.gapi.client.classroom.RegistrationsResource
import typings.maximMazurokGapiClientClassroom.gapi.client.classroom.UserProfilesResource
import typings.maximMazurokGapiClientClassroom.maximMazurokGapiClientClassroomStrings.classroom
import typings.maximMazurokGapiClientClassroom.maximMazurokGapiClientClassroomStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object classroom {
        
        @JSGlobal("gapi.client.classroom.courses")
        @js.native
        val courses: CoursesResource = js.native
        
        @JSGlobal("gapi.client.classroom.invitations")
        @js.native
        val invitations: InvitationsResource = js.native
        
        @JSGlobal("gapi.client.classroom.registrations")
        @js.native
        val registrations: RegistrationsResource = js.native
        
        @JSGlobal("gapi.client.classroom.userProfiles")
        @js.native
        val userProfiles: UserProfilesResource = js.native
      }
      
      /** Load Google Classroom API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: classroom, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: classroom, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
