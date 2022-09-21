package typings.maximMazurokGapiClientClassroom.gapi.client.classroom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CourseWorkMaterial extends StObject {
  
  /** Absolute link to this course work material in the Classroom web UI. This is only populated if `state` is `PUBLISHED`. Read-only. */
  var alternateLink: js.UndefOr[String] = js.undefined
  
  /** Assignee mode of the course work material. If unspecified, the default value is `ALL_STUDENTS`. */
  var assigneeMode: js.UndefOr[String] = js.undefined
  
  /** Identifier of the course. Read-only. */
  var courseId: js.UndefOr[String] = js.undefined
  
  /** Timestamp when this course work material was created. Read-only. */
  var creationTime: js.UndefOr[String] = js.undefined
  
  /** Identifier for the user that created the course work material. Read-only. */
  var creatorUserId: js.UndefOr[String] = js.undefined
  
  /** Optional description of this course work material. The text must be a valid UTF-8 string containing no more than 30,000 characters. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Classroom-assigned identifier of this course work material, unique per course. Read-only. */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifiers of students with access to the course work material. This field is set only if `assigneeMode` is `INDIVIDUAL_STUDENTS`. If the `assigneeMode` is `INDIVIDUAL_STUDENTS`,
    * then only students specified in this field can see the course work material.
    */
  var individualStudentsOptions: js.UndefOr[IndividualStudentsOptions] = js.undefined
  
  /** Additional materials. A course work material must have no more than 20 material items. */
  var materials: js.UndefOr[js.Array[Material]] = js.undefined
  
  /** Optional timestamp when this course work material is scheduled to be published. */
  var scheduledTime: js.UndefOr[String] = js.undefined
  
  /** Status of this course work material. If unspecified, the default state is `DRAFT`. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Title of this course work material. The title must be a valid UTF-8 string containing between 1 and 3000 characters. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Identifier for the topic that this course work material is associated with. Must match an existing topic in the course. */
  var topicId: js.UndefOr[String] = js.undefined
  
  /** Timestamp of the most recent change to this course work material. Read-only. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object CourseWorkMaterial {
  
  inline def apply(): CourseWorkMaterial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CourseWorkMaterial]
  }
  
  extension [Self <: CourseWorkMaterial](x: Self) {
    
    inline def setAlternateLink(value: String): Self = StObject.set(x, "alternateLink", value.asInstanceOf[js.Any])
    
    inline def setAlternateLinkUndefined: Self = StObject.set(x, "alternateLink", js.undefined)
    
    inline def setAssigneeMode(value: String): Self = StObject.set(x, "assigneeMode", value.asInstanceOf[js.Any])
    
    inline def setAssigneeModeUndefined: Self = StObject.set(x, "assigneeMode", js.undefined)
    
    inline def setCourseId(value: String): Self = StObject.set(x, "courseId", value.asInstanceOf[js.Any])
    
    inline def setCourseIdUndefined: Self = StObject.set(x, "courseId", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setCreatorUserId(value: String): Self = StObject.set(x, "creatorUserId", value.asInstanceOf[js.Any])
    
    inline def setCreatorUserIdUndefined: Self = StObject.set(x, "creatorUserId", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIndividualStudentsOptions(value: IndividualStudentsOptions): Self = StObject.set(x, "individualStudentsOptions", value.asInstanceOf[js.Any])
    
    inline def setIndividualStudentsOptionsUndefined: Self = StObject.set(x, "individualStudentsOptions", js.undefined)
    
    inline def setMaterials(value: js.Array[Material]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setMaterialsVarargs(value: Material*): Self = StObject.set(x, "materials", js.Array(value*))
    
    inline def setScheduledTime(value: String): Self = StObject.set(x, "scheduledTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledTimeUndefined: Self = StObject.set(x, "scheduledTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTopicId(value: String): Self = StObject.set(x, "topicId", value.asInstanceOf[js.Any])
    
    inline def setTopicIdUndefined: Self = StObject.set(x, "topicId", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
