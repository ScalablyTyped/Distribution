package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Course extends StObject {
  
  /** Absolute link to this course in the Classroom web UI. Read-only. */
  var alternateLink: js.UndefOr[String] = js.undefined
  
  /** The Calendar ID for a calendar that all course members can see, to which Classroom adds events for course work and announcements in the course. Read-only. */
  var calendarId: js.UndefOr[String] = js.undefined
  
  /** The email address of a Google group containing all members of the course. This group does not accept email and can only be used for permissions. Read-only. */
  var courseGroupEmail: js.UndefOr[String] = js.undefined
  
  /** Sets of materials that appear on the "about" page of this course. Read-only. */
  var courseMaterialSets: js.UndefOr[js.Array[CourseMaterialSet]] = js.undefined
  
  /** State of the course. If unspecified, the default state is `PROVISIONED`. */
  var courseState: js.UndefOr[String] = js.undefined
  
  /** Creation time of the course. Specifying this field in a course update mask results in an error. Read-only. */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional description. For example, "We'll be learning about the structure of living creatures from a combination of textbooks, guest lectures, and lab work. Expect to be excited!"
    * If set, this field must be a valid UTF-8 string and no longer than 30,000 characters.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /** Optional heading for the description. For example, "Welcome to 10th Grade Biology." If set, this field must be a valid UTF-8 string and no longer than 3600 characters. */
  var descriptionHeading: js.UndefOr[String] = js.undefined
  
  /** Enrollment code to use when joining this course. Specifying this field in a course update mask results in an error. Read-only. */
  var enrollmentCode: js.UndefOr[String] = js.undefined
  
  /** Whether or not guardian notifications are enabled for this course. Read-only. */
  var guardiansEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifier for this course assigned by Classroom. When creating a course, you may optionally set this identifier to an alias string in the request to create a corresponding alias.
    * The `id` is still assigned by Classroom and cannot be updated after the course is created. Specifying this field in a course update mask results in an error.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /** Name of the course. For example, "10th Grade Biology". The name is required. It must be between 1 and 750 characters and a valid UTF-8 string. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the owner of a course. When specified as a parameter of a create course request, this field is required. The identifier can be one of the following: * the numeric
    * identifier for the user * the email address of the user * the string literal `"me"`, indicating the requesting user This must be set in a create request. Admins can also specify
    * this field in a patch course request to transfer ownership. In other contexts, it is read-only.
    */
  var ownerId: js.UndefOr[String] = js.undefined
  
  /** Optional room location. For example, "301". If set, this field must be a valid UTF-8 string and no longer than 650 characters. */
  var room: js.UndefOr[String] = js.undefined
  
  /** Section of the course. For example, "Period 2". If set, this field must be a valid UTF-8 string and no longer than 2800 characters. */
  var section: js.UndefOr[String] = js.undefined
  
  /** Information about a Drive Folder that is shared with all teachers of the course. This field will only be set for teachers of the course and domain administrators. Read-only. */
  var teacherFolder: js.UndefOr[DriveFolder] = js.undefined
  
  /** The email address of a Google group containing all teachers of the course. This group does not accept email and can only be used for permissions. Read-only. */
  var teacherGroupEmail: js.UndefOr[String] = js.undefined
  
  /** Time of the most recent update to this course. Specifying this field in a course update mask results in an error. Read-only. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Course {
  
  inline def apply(): Course = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Course]
  }
  
  extension [Self <: Course](x: Self) {
    
    inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    inline def setCalendarIdUndefined: Self = StObject.set(x, "calendarId", js.undefined)
    
    inline def setCourseGroupEmail(value: String): Self = StObject.set(x, "courseGroupEmail", value.asInstanceOf[js.Any])
    
    inline def setCourseGroupEmailUndefined: Self = StObject.set(x, "courseGroupEmail", js.undefined)
    
    inline def setCourseMaterialSets(value: js.Array[CourseMaterialSet]): Self = StObject.set(x, "courseMaterialSets", value.asInstanceOf[js.Any])
    
    inline def setCourseMaterialSetsUndefined: Self = StObject.set(x, "courseMaterialSets", js.undefined)
    
    inline def setCourseMaterialSetsVarargs(value: CourseMaterialSet*): Self = StObject.set(x, "courseMaterialSets", js.Array(value :_*))
    
    inline def setCourseState(value: String): Self = StObject.set(x, "courseState", value.asInstanceOf[js.Any])
    
    inline def setCourseStateUndefined: Self = StObject.set(x, "courseState", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionHeading(value: String): Self = StObject.set(x, "descriptionHeading", value.asInstanceOf[js.Any])
    
    inline def setDescriptionHeadingUndefined: Self = StObject.set(x, "descriptionHeading", js.undefined)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnrollmentCode(value: String): Self = StObject.set(x, "enrollmentCode", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentCodeUndefined: Self = StObject.set(x, "enrollmentCode", js.undefined)
    
    inline def setGuardiansEnabled(value: Boolean): Self = StObject.set(x, "guardiansEnabled", value.asInstanceOf[js.Any])
    
    inline def setGuardiansEnabledUndefined: Self = StObject.set(x, "guardiansEnabled", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    
    inline def setRoom(value: String): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
    
    inline def setRoomUndefined: Self = StObject.set(x, "room", js.undefined)
    
    inline def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
    
    inline def setTeacherFolder(value: DriveFolder): Self = StObject.set(x, "teacherFolder", value.asInstanceOf[js.Any])
    
    inline def setTeacherFolderUndefined: Self = StObject.set(x, "teacherFolder", js.undefined)
    
    inline def setTeacherGroupEmail(value: String): Self = StObject.set(x, "teacherGroupEmail", value.asInstanceOf[js.Any])
    
    inline def setTeacherGroupEmailUndefined: Self = StObject.set(x, "teacherGroupEmail", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
