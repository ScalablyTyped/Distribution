package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Student extends StObject {
  
  /** Identifier of the course. Read-only. */
  var courseId: js.UndefOr[String] = js.undefined
  
  /** Global user information for the student. Read-only. */
  var profile: js.UndefOr[UserProfile] = js.undefined
  
  /** Information about a Drive Folder for this student's work in this course. Only visible to the student and domain administrators. Read-only. */
  var studentWorkFolder: js.UndefOr[DriveFolder] = js.undefined
  
  /**
    * Identifier of the user. When specified as a parameter of a request, this identifier can be one of the following: * the numeric identifier for the user * the email address of the
    * user * the string literal `"me"`, indicating the requesting user
    */
  var userId: js.UndefOr[String] = js.undefined
}
object Student {
  
  @scala.inline
  def apply(): Student = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Student]
  }
  
  @scala.inline
  implicit class StudentMutableBuilder[Self <: Student] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    @scala.inline
    def setProfile(value: UserProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    @scala.inline
    def setStudentWorkFolder(value: DriveFolder): Self = StObject.set(x, "studentWorkFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStudentWorkFolderUndefined: Self = StObject.set(x, "studentWorkFolder", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
