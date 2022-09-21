package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CourseWork extends StObject {
  
  /** Absolute link to this course work in the Classroom web UI. This is only populated if `state` is `PUBLISHED`. Read-only. */
  var alternateLink: js.UndefOr[String] = js.undefined
  
  /** Assignee mode of the coursework. If unspecified, the default value is `ALL_STUDENTS`. */
  var assigneeMode: js.UndefOr[String] = js.undefined
  
  /** Assignment details. This is populated only when `work_type` is `ASSIGNMENT`. Read-only. */
  var assignment: js.UndefOr[Assignment] = js.undefined
  
  /** Whether this course work item is associated with the Developer Console project making the request. See CreateCourseWork for more details. Read-only. */
  var associatedWithDeveloper: js.UndefOr[Boolean] = js.undefined
  
  /** Identifier of the course. Read-only. */
  var courseId: js.UndefOr[String] = js.undefined
  
  /** Timestamp when this course work was created. Read-only. */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /** Identifier for the user that created the coursework. Read-only. */
  var creatorUserId: js.UndefOr[String] = js.undefined
  
  /** Optional description of this course work. If set, the description must be a valid UTF-8 string containing no more than 30,000 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Optional date, in UTC, that submissions for this course work are due. This must be specified if `due_time` is specified. */
  var dueDate: js.UndefOr[Date] = js.undefined
  
  /** Optional time of day, in UTC, that submissions for this course work are due. This must be specified if `due_date` is specified. */
  var dueTime: js.UndefOr[TimeOfDay] = js.undefined
  
  /** The category that this coursework's grade contributes to. Present only when a category has been chosen for the coursework. May be used in calculating the overall grade. Read-only. */
  var gradeCategory: js.UndefOr[GradeCategory] = js.undefined
  
  /** Classroom-assigned identifier of this course work, unique per course. Read-only. */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifiers of students with access to the coursework. This field is set only if `assigneeMode` is `INDIVIDUAL_STUDENTS`. If the `assigneeMode` is `INDIVIDUAL_STUDENTS`, then only
    * students specified in this field are assigned the coursework.
    */
  var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.undefined
  
  /** Additional materials. CourseWork must have no more than 20 material items. */
  var materials: js.UndefOr[js.Array[Material]] = js.undefined
  
  /** Maximum grade for this course work. If zero or unspecified, this assignment is considered ungraded. This must be a non-negative integer value. */
  var maxPoints: js.UndefOr[Double] = js.undefined
  
  /**
    * Multiple choice question details. For read operations, this field is populated only when `work_type` is `MULTIPLE_CHOICE_QUESTION`. For write operations, this field must be
    * specified when creating course work with a `work_type` of `MULTIPLE_CHOICE_QUESTION`, and it must not be set otherwise.
    */
  var multipleChoiceQuestion: js.UndefOr[MultipleChoiceQuestion] = js.undefined
  
  /** Optional timestamp when this course work is scheduled to be published. */
  var scheduledTime: js.UndefOr[String] = js.undefined
  
  /** Status of this course work. If unspecified, the default state is `DRAFT`. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Setting to determine when students are allowed to modify submissions. If unspecified, the default value is `MODIFIABLE_UNTIL_TURNED_IN`. */
  var submissionModificationMode: js.UndefOr[String] = js.undefined
  
  /** Title of this course work. The title must be a valid UTF-8 string containing between 1 and 3000 characters. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Identifier for the topic that this coursework is associated with. Must match an existing topic in the course. */
  var topicId: js.UndefOr[String] = js.undefined
  
  /** Timestamp of the most recent change to this course work. Read-only. */
  var updateTime: js.UndefOr[String] = js.undefined
  
  /** Type of this course work. The type is set when the course work is created and cannot be changed. */
  var workType: js.UndefOr[String] = js.undefined
}
object CourseWork {
  
  inline def apply(): CourseWork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CourseWork]
  }
  
  extension [Self <: CourseWork](x: Self) {
    
    inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    inline def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
    
    inline def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
    
    inline def setAssignment(value: Assignment): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
    
    inline def setAssignmentUndefined: Self = StObject.set(x, "assignment", js.undefined)
    
    inline def setAssociatedWithDeveloper(value: Boolean): Self = StObject.set(x, "associatedWithDeveloper", value.asInstanceOf[js.Any])
    
    inline def setAssociatedWithDeveloperUndefined: Self = StObject.set(x, "associatedWithDeveloper", js.undefined)
    
    inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setCreatorUserId(value: String): Self = StObject.set(x, "creatorUserId", value.asInstanceOf[js.Any])
    
    inline def setCreatorUserIdUndefined: Self = StObject.set(x, "creatorUserId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDueDate(value: Date): Self = StObject.set(x, "dueDate", value.asInstanceOf[js.Any])
    
    inline def setDueDateUndefined: Self = StObject.set(x, "dueDate", js.undefined)
    
    inline def setDueTime(value: TimeOfDay): Self = StObject.set(x, "dueTime", value.asInstanceOf[js.Any])
    
    inline def setDueTimeUndefined: Self = StObject.set(x, "dueTime", js.undefined)
    
    inline def setGradeCategory(value: GradeCategory): Self = StObject.set(x, "gradeCategory", value.asInstanceOf[js.Any])
    
    inline def setGradeCategoryUndefined: Self = StObject.set(x, "gradeCategory", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndividualStudentsOptions(value: IndividualStudentsOptions): Self = StObject.set(x, "individualStudentsOptions", value.asInstanceOf[js.Any])
    
    inline def setIndividualStudentsOptionsUndefined: Self = StObject.set(x, "individualStudentsOptions", js.undefined)
    
    inline def setMaterials(value: js.Array[Material]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setMaterialsVarargs(value: Material*): Self = StObject.set(x, "materials", js.Array(value*))
    
    inline def setMaxPoints(value: Double): Self = StObject.set(x, "maxPoints", value.asInstanceOf[js.Any])
    
    inline def setMaxPointsUndefined: Self = StObject.set(x, "maxPoints", js.undefined)
    
    inline def setMultipleChoiceQuestion(value: MultipleChoiceQuestion): Self = StObject.set(x, "multipleChoiceQuestion", value.asInstanceOf[js.Any])
    
    inline def setMultipleChoiceQuestionUndefined: Self = StObject.set(x, "multipleChoiceQuestion", js.undefined)
    
    inline def setScheduledTime(value: String): Self = StObject.set(x, "scheduledTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledTimeUndefined: Self = StObject.set(x, "scheduledTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSubmissionModificationMode(value: String): Self = StObject.set(x, "submissionModificationMode", value.asInstanceOf[js.Any])
    
    inline def setSubmissionModificationModeUndefined: Self = StObject.set(x, "submissionModificationMode", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTopicId(value: String): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
    
    inline def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setWorkType(value: String): Self = StObject.set(x, "workType", value.asInstanceOf[js.Any])
    
    inline def setWorkTypeUndefined: Self = StObject.set(x, "workType", js.undefined)
  }
}
