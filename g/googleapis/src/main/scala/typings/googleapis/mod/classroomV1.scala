package typings.googleapis.mod

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classroomV1 {
  
  /**
    * Google Classroom API
    *
    * Manages classes, rosters, and invitations in Google Classroom.
    *
    * @example
    * const {google} = require('googleapis');
    * const classroom = google.classroom('v1');
    *
    * @namespace classroom
    * @type {Function}
    * @version v1
    * @variation v1
    * @param {object=} options Options for Classroom
    */
  @JSImport("googleapis", "classroom_v1.Classroom")
  @js.native
  class Classroom protected ()
    extends typings.googleapis.classroomV1Mod.classroomV1.Classroom {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @JSImport("googleapis", "classroom_v1.Resource$Courses")
  @js.native
  class ResourceCourses protected ()
    extends typings.googleapis.classroomV1Mod.classroomV1.ResourceCourses {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "classroom_v1.Resource$Courses$Aliases")
  @js.native
  class ResourceCoursesAliases protected ()
    extends typings.googleapis.classroomV1Mod.classroomV1.ResourceCoursesAliases {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "classroom_v1.Resource$Courses$Announcements")
  @js.native
  class ResourceCoursesAnnouncements protected ()
    extends typings.googleapis.classroomV1Mod.classroomV1.ResourceCoursesAnnouncements {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "classroom_v1.Resource$Courses$Coursework")
  @js.native
  class ResourceCoursesCoursework protected ()
    extends typings.googleapis.classroomV1Mod.classroomV1.ResourceCoursesCoursework {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "classroom_v1.Resource$Courses$Coursework$Studentsubmissions")
  @js.native
  class ResourceCoursesCourseworkStudentsubmissions protected ()
    extends typings.googleapis.classroomV1Mod.classroomV1.ResourceCoursesCourseworkStudentsubmissions {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "classroom_v1.Resource$Courses$Students")
  @js.native
  class ResourceCoursesStudents protected ()
    extends typings.googleapis.classroomV1Mod.classroomV1.ResourceCoursesStudents {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "classroom_v1.Resource$Courses$Teachers")
  @js.native
  class ResourceCoursesTeachers protected ()
    extends typings.googleapis.classroomV1Mod.classroomV1.ResourceCoursesTeachers {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "classroom_v1.Resource$Courses$Topics")
  @js.native
  class ResourceCoursesTopics protected ()
    extends typings.googleapis.classroomV1Mod.classroomV1.ResourceCoursesTopics {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "classroom_v1.Resource$Invitations")
  @js.native
  class ResourceInvitations protected ()
    extends typings.googleapis.classroomV1Mod.classroomV1.ResourceInvitations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "classroom_v1.Resource$Registrations")
  @js.native
  class ResourceRegistrations protected ()
    extends typings.googleapis.classroomV1Mod.classroomV1.ResourceRegistrations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "classroom_v1.Resource$Userprofiles")
  @js.native
  class ResourceUserprofiles protected ()
    extends typings.googleapis.classroomV1Mod.classroomV1.ResourceUserprofiles {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "classroom_v1.Resource$Userprofiles$Guardianinvitations")
  @js.native
  class ResourceUserprofilesGuardianinvitations protected ()
    extends typings.googleapis.classroomV1Mod.classroomV1.ResourceUserprofilesGuardianinvitations {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "classroom_v1.Resource$Userprofiles$Guardians")
  @js.native
  class ResourceUserprofilesGuardians protected ()
    extends typings.googleapis.classroomV1Mod.classroomV1.ResourceUserprofilesGuardians {
    def this(context: APIRequestContext) = this()
  }
}
