package typings.jiraClient

import org.scalablytyped.runtime.StringDictionary
import typings.jiraClient.jiraClientStrings.`false`
import typings.jiraClient.jiraClientStrings.`true`
import typings.jiraClient.jiraClientStrings.active
import typings.jiraClient.jiraClientStrings.closed
import typings.jiraClient.jiraClientStrings.future
import typings.jiraClient.jiraClientStrings.kanban
import typings.jiraClient.jiraClientStrings.scrum
import typings.node.fsMod.ReadStream
import typings.request.mod.CoreOptions
import typings.request.mod.RequestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jira-client", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with JiraApi {
    def this(options: JiraApiOptions) = this()
  }
  
  type AttachmentObject = StringDictionary[Any]
  
  trait BoardObject extends StObject {
    
    /** Id of a filter that the user has permissions to view. */
    var filterId: String
    
    /** Must be less than 255 characters. */
    var name: String
    
    /** Valid values: scrum, kanban */
    var `type`: scrum | kanban
  }
  object BoardObject {
    
    inline def apply(filterId: String, name: String, `type`: scrum | kanban): BoardObject = {
      val __obj = js.Dynamic.literal(filterId = filterId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoardObject]
    }
    
    extension [Self <: BoardObject](x: Self) {
      
      inline def setFilterId(value: String): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: scrum | kanban): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type CommentAdvancedObject = StringDictionary[Any]
  
  type CommentOptions = StringDictionary[Any]
  
  type ComponentObject = StringDictionary[Any]
  
  trait CreateIssueMetadataObject extends StObject {
    
    /**  [optional] Include additional information about issue metadata. Valid value is 'projects.issuetypes.fields' */
    var expand: js.UndefOr[String] = js.undefined
    
    /**  [optional] Array of issuetype ids to return metadata for */
    var issuetypeIds: js.UndefOr[js.Array[String]] = js.undefined
    
    /**  [optional] Array of issuetype names to return metadata for */
    var issuetypeNames: js.UndefOr[js.Array[String]] = js.undefined
    
    /**  [optional] Array of project ids to return metadata for */
    var projectIds: js.UndefOr[js.Array[String]] = js.undefined
    
    /**  [optional] Array of project keys to return metadata for */
    var projectKeys: js.UndefOr[js.Array[String]] = js.undefined
  }
  object CreateIssueMetadataObject {
    
    inline def apply(): CreateIssueMetadataObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateIssueMetadataObject]
    }
    
    extension [Self <: CreateIssueMetadataObject](x: Self) {
      
      inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setIssuetypeIds(value: js.Array[String]): Self = StObject.set(x, "issuetypeIds", value.asInstanceOf[js.Any])
      
      inline def setIssuetypeIdsUndefined: Self = StObject.set(x, "issuetypeIds", js.undefined)
      
      inline def setIssuetypeIdsVarargs(value: String*): Self = StObject.set(x, "issuetypeIds", js.Array(value*))
      
      inline def setIssuetypeNames(value: js.Array[String]): Self = StObject.set(x, "issuetypeNames", value.asInstanceOf[js.Any])
      
      inline def setIssuetypeNamesUndefined: Self = StObject.set(x, "issuetypeNames", js.undefined)
      
      inline def setIssuetypeNamesVarargs(value: String*): Self = StObject.set(x, "issuetypeNames", js.Array(value*))
      
      inline def setProjectIds(value: js.Array[String]): Self = StObject.set(x, "projectIds", value.asInstanceOf[js.Any])
      
      inline def setProjectIdsUndefined: Self = StObject.set(x, "projectIds", js.undefined)
      
      inline def setProjectIdsVarargs(value: String*): Self = StObject.set(x, "projectIds", js.Array(value*))
      
      inline def setProjectKeys(value: js.Array[String]): Self = StObject.set(x, "projectKeys", value.asInstanceOf[js.Any])
      
      inline def setProjectKeysUndefined: Self = StObject.set(x, "projectKeys", js.undefined)
      
      inline def setProjectKeysVarargs(value: String*): Self = StObject.set(x, "projectKeys", js.Array(value*))
    }
  }
  
  type EstimateObject = StringDictionary[Any]
  
  type FieldObject = StringDictionary[Any]
  
  type FieldOptionObject = StringDictionary[Any]
  
  type IssueObject = StringDictionary[Any]
  
  @js.native
  trait JiraApi extends StObject {
    
    /**
      * Add attachment to a Issue
      * [Jira Doc](https://docs.atlassian.com/jira/REST/latest/#api/2/issue/{issueIdOrKey}/attachments-addAttachment)
      * @param issueId - issue id
      * @param readStream - readStream object from fs
      */
    def addAttachmentOnIssue(issueId: String, readStream: ReadStream): js.Promise[JsonResponse] = js.native
    
    /**
      * Add a comment to an issue
      * [Jira Doc](https://docs.atlassian.com/jira/REST/latest/#id108798)
      * @param issueId - Issue to add a comment to
      * @param comment - string containing comment
      */
    def addComment(issueId: String, comment: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Add a comment to an issue, supports full comment object
      * [Jira Doc](https://docs.atlassian.com/jira/REST/latest/#id108798)
      * @param issueId - Issue to add a comment to
      * @param comment - The object containing your comment data
      */
    def addCommentAdvanced(issueId: String, comment: CommentAdvancedObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Add an issue to the project's current sprint
      * @param issueId - the id of the existing issue
      * @param sprintId - the id of the sprint to add it to
      */
    def addIssueToSprint(issueId: String, sprintId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Add component to Jira
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id290028)
      * @param component - Properly Formatted Component
      */
    def addNewComponent(component: ComponentObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Add issue to Jira
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id290028)
      * @param issue - Properly Formatted Issue object
      */
    def addNewIssue(issue: IssueObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Add a user as a watcher on an issue
      * @param issueKey - the key of the existing issue
      * @param username - the jira username to add as a watcher to the issue
      */
    def addWatcher(issueKey: String, username: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Add a worklog to a project
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id291617)
      * @param issueId - Issue to add a worklog to
      * @param worklog - worklog object from the rest API
      * @param [optional] newEstimate - the new value for the remaining estimate field
      * @param [options={}] - extra options
      */
    def addWorklog(issueId: String, worklog: WorklogObject): js.Promise[JsonResponse] = js.native
    def addWorklog(issueId: String, worklog: WorklogObject, newEstimate: Unit, options: WorklogOptions): js.Promise[JsonResponse] = js.native
    def addWorklog(issueId: String, worklog: WorklogObject, newEstimate: EstimateObject): js.Promise[JsonResponse] = js.native
    def addWorklog(issueId: String, worklog: WorklogObject, newEstimate: EstimateObject, options: WorklogOptions): js.Promise[JsonResponse] = js.native
    
    /* private */ var apiVersion: String = js.native
    
    /* private */ var base: String = js.native
    
    /**
      * Create Board
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board-createBoard)
      * @param boardBody - Board name, type and filter Id is required.
      */
    def createBoard(boardBody: BoardObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Create custom Jira field
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#api/2/field-createCustomField)
      * @param field - Properly formatted Field object
      */
    def createCustomField(field: FieldObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Add an option for a select list issue field.
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#api/2/field/{fieldKey}/option-createOption)
      * @param fieldKey - the key of the select list field
      * @param option - properly formatted Option object
      */
    def createFieldOption(fieldKey: String, option: FieldOptionObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Create a new Project
      * [Jira Doc](https://docs.atlassian.com/jira/REST/latest/#api/2/project-createProject)
      * @param project - with specs
      */
    def createProject(project: ProjectObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Creates a remote link associated with the given issue.
      * @param issueNumber - The issue number to create the remotelink under
      * @param remoteLink - the remotelink object as specified by the Jira API
      */
    def createRemoteLink(issueNumber: String, remoteLink: LinkObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Create a Jira user
      * [Jira Doc](https://docs.atlassian.com/jira/REST/cloud/#api/2/user-createUser)
      * @param user - Properly Formatted User object
      */
    def createUser(user: UserObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Create a version
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id288232)
      * @param version - an object of the new version
      */
    def createVersion(version: VersionObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Delete Board
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board-deleteBoard)
      * @param boardId - Id of board to retrieve
      */
    def deleteBoard(boardId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Delete Board Property
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board/{boardId}/properties-deleteProperty)
      * @param boardId - Id of board to retrieve
      * @param propertyKey - Id of property to delete
      */
    def deleteBoardProperty(boardId: String, propertyKey: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Delete Comments by Id.
      * [Jira Doc](https://developer.atlassian.com/cloud/jira/platform/rest/v3/#api-rest-api-3-comment-list-post)
      * @param issueId - this issue this comment is on
      * @param commentId - the id of the comment
      */
    def deleteComment(issueId: String, commentId: Double): js.Promise[JsonResponse] = js.native
    
    /**
      * Delete component from Jira
      * [Jira Doc](https://developer.atlassian.com/cloud/jira/platform/rest/v2/#api-api-2-component-id-delete)
      * @param id - The ID of the component.
      * @param moveIssuesTo - The ID of the component to replace the deleted component.
      *                                If this value is null no replacement is made.
      */
    def deleteComponent(componentId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Deletes an option from a select list issue field.
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#api/2/field/{fieldKey}/option-delete)
      * @param fieldKey - the key of the select list field
      * @param optionId - the id of the deleted option
      */
    def deleteFieldOption(fieldKey: String, optionId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Delete issue from Jira
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id290791)
      * @param issueId - the Id of the issue to delete
      */
    def deleteIssue(issueId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Deletes an issue link.
      * [Jira Doc](https://developer.atlassian.com/cloud/jira/platform/rest/v3/#api-rest-api-3-issueLink-linkId-delete)
      * @param linkId - the Id of the issue link to delete
      */
    def deleteIssueLink(linkId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Delete a version
      * [Jira Doc](https://docs.atlassian.com/jira/REST/latest/#api/2/version-delete)
      * @param versionId - the ID of the version to delete
      * @param moveFixIssuesToId - when provided, existing fixVersions will be moved
      *                 to this ID. Otherwise, the deleted version will be removed from all
      *                 issue fixVersions.
      * @param moveAffectedIssuesToId - when provided, existing affectedVersions will
      *                 be moved to this ID. Otherwise, the deleted version will be removed
      *                 from all issue affectedVersions.
      */
    def deleteVersion(versionId: String, moveFixIssuesToId: String, moveAffectedIssuesToId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Delete a registered webhook
      * [Jira Doc](https://developer.atlassian.com/display/JIRADEV/JIRA+Webhooks+Overview)
      * @param webhookID - id of the webhook to delete
      */
    def deleteWebhook(webhookID: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Delete worklog from issue
      * [Jira Doc](https://docs.atlassian.com/jira/REST/latest/#d2e1673)
      * @param issueId - the Id of the issue to delete
      * @param worklogId - the Id of the worklog in issue to delete
      */
    def deleteWorklog(issueId: String, worklogId: String): js.Promise[JsonResponse] = js.native
    
    /* private */ def doRequest(requestOptions: CoreOptions): js.Promise[RequestResponse] = js.native
    
    /**
      * Download an attachment
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id288524)
      * @param attachment - the attachment
      */
    def downloadAttachment(attachment: js.Object): js.Promise[JsonResponse] = js.native
    
    /**
      * Estimate issue for board
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/issue-estimateIssueForBoard)
      * @param issueIdOrKey - Id of issue
      * @param boardId - The id of the board required to determine which field
      * is used for estimation.
      * @param body - value to set
      */
    def estimateIssueForBoard(issueIdOrKey: String, boardId: Double, body: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Find an issue in jira
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id290709)
      * @param issueNumber - The issue number to search for including the project key
      * @param expand - The resource expansion to return additional fields in the response
      * @param fields - Comma separated list of field ids or keys to retrieve
      * @param properties - Comma separated list of properties to retrieve
      * @param fieldsByKeys - False by default, used to retrieve fields by key instead of id
      */
    def findIssue(issueNumber: String): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: String): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: String, fields: String): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: String, fields: String, properties: String): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: String, fields: String, properties: String, fieldsByKeys: Boolean): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: String, fields: String, properties: Unit, fieldsByKeys: Boolean): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: String, fields: Unit, properties: String): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: String, fields: Unit, properties: String, fieldsByKeys: Boolean): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: String, fields: Unit, properties: Unit, fieldsByKeys: Boolean): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: Unit, fields: String): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: Unit, fields: String, properties: String): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: Unit, fields: String, properties: String, fieldsByKeys: Boolean): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: Unit, fields: String, properties: Unit, fieldsByKeys: Boolean): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: Unit, fields: Unit, properties: String): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: Unit, fields: Unit, properties: String, fieldsByKeys: Boolean): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: Unit, fields: Unit, properties: Unit, fieldsByKeys: Boolean): js.Promise[JsonResponse] = js.native
    
    /**
      * Find the Rapid View for a specified project
      * @param projectName - name for the project
      */
    def findRapidView(projectName: String): js.Promise[js.Array[JsonResponse]] = js.native
    
    /**
      * Generic Get Request to the Agile API
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/2/)
      * @param endpoint - Rest API endpoint
      */
    def genericAgileGet(endpoint: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Generic Get Request
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/2/)
      * @param endpoint - Rest API endpoint
      */
    def genericGet(endpoint: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get all boards
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board-getAllBoards)
      * @param [startAt=0] - The starting index of the returned boards.
      * @param [maxResults=50] - The maximum number of boards to return per page.
      * @param [type] - Filters results to boards of the specified type.
      * @param [name] - Filters results to boards that match the specified name.
      * @param [projectKeyOrId] - Filters results to boards that are relevant to a project.
      */
    def getAllBoards(): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Double, `type`: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Double, `type`: String, name: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Double, `type`: String, name: String, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Double, `type`: String, name: Unit, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Double, `type`: Unit, name: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Double, `type`: Unit, name: String, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Double, `type`: Unit, name: Unit, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Unit, `type`: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Unit, `type`: String, name: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Unit, `type`: String, name: String, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Unit, `type`: String, name: Unit, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Unit, `type`: Unit, name: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Unit, `type`: Unit, name: String, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Unit, `type`: Unit, name: Unit, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Unit, maxResults: Double, `type`: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Unit, maxResults: Double, `type`: String, name: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Unit, maxResults: Double, `type`: String, name: String, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Unit, maxResults: Double, `type`: String, name: Unit, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Unit, maxResults: Double, `type`: Unit, name: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Unit, maxResults: Double, `type`: Unit, name: String, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Unit, maxResults: Double, `type`: Unit, name: Unit, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Unit, maxResults: Unit, `type`: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Unit, maxResults: Unit, `type`: String, name: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Unit, maxResults: Unit, `type`: String, name: String, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Unit, maxResults: Unit, `type`: String, name: Unit, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Unit, maxResults: Unit, `type`: Unit, name: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Unit, maxResults: Unit, `type`: Unit, name: String, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Unit, maxResults: Unit, `type`: Unit, name: Unit, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get All Sprints
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board/{boardId}/sprint-getAllSprints)
      * @param boardId - Id of board to retrieve
      * @param [startAt=0] - The starting index of the returned sprints. Base index: 0.
      * @param [maxResults=50] - The maximum number of sprints to return per page.
      * Default: 50.
      * @param [state] - Filters results to sprints in specified states.
      * Valid values: future, active, closed.
      */
    def getAllSprints(boardId: String): js.Promise[JsonResponse] = js.native
    def getAllSprints(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getAllSprints(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getAllSprints(boardId: String, startAt: Double, maxResults: Double, state: future | active | closed): js.Promise[JsonResponse] = js.native
    def getAllSprints(boardId: String, startAt: Double, maxResults: Unit, state: future | active | closed): js.Promise[JsonResponse] = js.native
    def getAllSprints(boardId: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getAllSprints(boardId: String, startAt: Unit, maxResults: Double, state: future | active | closed): js.Promise[JsonResponse] = js.native
    def getAllSprints(boardId: String, startAt: Unit, maxResults: Unit, state: future | active | closed): js.Promise[JsonResponse] = js.native
    
    /**
      * Get All Versions
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board/{boardId}/version-getAllVersions)
      * @param boardId - Id of board to retrieve
      * @param [startAt=0] - The starting index of the returned versions. Base index: 0.
      * @param [maxResults=50] - The maximum number of versions to return per page.
      * Default: 50.
      * @param [released] - Filters results to versions that are either released or
      * unreleased.Valid values: true, false.
      */
    def getAllVersions(boardId: String): js.Promise[JsonResponse] = js.native
    def getAllVersions(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getAllVersions(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getAllVersions(boardId: String, startAt: Double, maxResults: Double, released: `true` | `false`): js.Promise[JsonResponse] = js.native
    def getAllVersions(boardId: String, startAt: Double, maxResults: Unit, released: `true` | `false`): js.Promise[JsonResponse] = js.native
    def getAllVersions(boardId: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getAllVersions(boardId: String, startAt: Unit, maxResults: Double, released: `true` | `false`): js.Promise[JsonResponse] = js.native
    def getAllVersions(boardId: String, startAt: Unit, maxResults: Unit, released: `true` | `false`): js.Promise[JsonResponse] = js.native
    
    /**
      * Retrieve the backlog of a certain Rapid View
      * @param rapidViewId - rapid view id
      */
    def getBacklogForRapidView(rapidViewId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get Board
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board-getBoard)
      * @param boardId - Id of board to retrieve
      */
    def getBoard(boardId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get board issues for epic
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board/{boardId}/epic-getIssuesForEpic)
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board/{boardId}/epic-getIssuesWithoutEpic)
      * @param boardId - Id of board to retrieve
      * @param epicId - Id of epic to retrieve, specify 'none' to get issues without an epic.
      * @param [startAt=0] - The starting index of the returned issues. Base index: 0.
      * @param [maxResults=50] - The maximum number of issues to return per page. Default: 50.
      * @param [jql] - Filters results using a JQL query.
      * @param [validateQuery] - Specifies whether to validate the JQL query or not.
      * Default: true.
      * @param [fields] - The list of fields to return for each issue.
      */
    def getBoardIssuesForEpic(boardId: String, epicId: String): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(boardId: String, epicId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(boardId: String, epicId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(boardId: String, epicId: String, startAt: Double, maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Double,
      jql: Unit,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Double,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Double,
      jql: Unit,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(boardId: String, epicId: String, startAt: Double, maxResults: Unit, jql: String): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Unit,
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Unit,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Unit,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(boardId: String, epicId: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(boardId: String, epicId: String, startAt: Unit, maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Unit,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Unit,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Unit,
      maxResults: Double,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Unit,
      maxResults: Double,
      jql: Unit,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Unit,
      maxResults: Double,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Unit,
      maxResults: Double,
      jql: Unit,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(boardId: String, epicId: String, startAt: Unit, maxResults: Unit, jql: String): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    
    /**
      * Get Board issues for sprint
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board/{boardId}/sprint-getIssuesForSprint)
      * @param boardId - Id of board to retrieve
      * @param sprintId - Id of sprint to retrieve
      * @param [startAt=0] - The starting index of the returned issues. Base index: 0.
      * @param [maxResults=50] - The maximum number of issues to return per page. Default: 50.
      * @param [jql] - Filters results using a JQL query.
      * @param [validateQuery] - Specifies whether to validate the JQL query or not.
      * Default: true.
      * @param [fields] - The list of fields to return for each issue.
      * @param [expand] - A comma-separated list of the parameters to expand.
      */
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: js.UndefOr[Double],
      maxResults: js.UndefOr[Double],
      jql: js.UndefOr[String],
      validateQuery: js.UndefOr[Boolean],
      fields: js.UndefOr[String],
      expand: js.UndefOr[String]
    ): js.Promise[JsonResponse] = js.native
    
    /**
      * Get Board Properties Keys
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board/{boardId}/properties-getPropertiesKeys)
      * @param boardId - Id of board to retrieve
      */
    def getBoardPropertiesKeys(boardId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get Board Property
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board/{boardId}/properties-getProperty)
      * @param boardId - Id of board to retrieve
      * @param propertyKey - Id of property to retrieve
      */
    def getBoardProperty(boardId: String, propertyKey: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get Comment by Id.
      * [Jira Doc](https://developer.atlassian.com/cloud/jira/platform/rest/v3/#api-rest-api-3-comment-list-post)
      * @param issueId - this issue this comment is on
      * @param commentId - the id of the comment
      */
    def getComment(issueId: String, commentId: Double): js.Promise[JsonResponse] = js.native
    
    /**
      * Get Comments by IssueId.
      * [Jira Doc](https://developer.atlassian.com/cloud/jira/platform/rest/v3/#api-rest-api-3-comment-list-post)
      * @param issueId - this issue this comment is on
      */
    def getComments(issueId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get Configuration
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board-getConfiguration)
      * @param boardId - Id of board to retrieve
      */
    def getConfiguration(boardId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Describe the currently authenticated user
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id2e865)
      */
    def getCurrentUser(): js.Promise[JsonResponse] = js.native
    
    /**
      * Get a Dev-Status detail by issue ID
      * @param issueId - id of issue to get
      * @param applicationType - type of application (stash, bitbucket)
      * @param dataType - info to return (repository, pullrequest)
      */
    def getDevStatusDetail(issueId: String, applicationType: String, dataType: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get a Dev-Status summary by issue ID
      * @param issueId - id of issue to get
      */
    def getDevStatusSummary(issueId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get Epic
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/epic-getEpic)
      * @param epicIdOrKey - Id of epic to retrieve
      */
    def getEpic(epicIdOrKey: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get Epics
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board/{boardId}/epic-getEpics)
      * @param boardId - Id of board to retrieve
      * @param [startAt=0] - The starting index of the returned epics. Base index: 0.
      * @param [maxResults=50] - The maximum number of epics to return per page. Default: 50.
      * @param [done] - Filters results to epics that are either done or not done.
      * Valid values: true, false.
      */
    def getEpics(boardId: String): js.Promise[JsonResponse] = js.native
    def getEpics(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getEpics(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getEpics(boardId: String, startAt: Double, maxResults: Double, done: `true` | `false`): js.Promise[JsonResponse] = js.native
    def getEpics(boardId: String, startAt: Double, maxResults: Unit, done: `true` | `false`): js.Promise[JsonResponse] = js.native
    def getEpics(boardId: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getEpics(boardId: String, startAt: Unit, maxResults: Double, done: `true` | `false`): js.Promise[JsonResponse] = js.native
    def getEpics(boardId: String, startAt: Unit, maxResults: Unit, done: `true` | `false`): js.Promise[JsonResponse] = js.native
    
    /**
      * Returns an option for a select list issue field.
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#api/2/field/{fieldKey}/option-getOption)
      * @param fieldKey - the key of the select list field
      * @param optionId - the id of the option
      */
    def getFieldOption(fieldKey: String, optionId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get Filter
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/filter)
      * @param filterId - Id of filter to retrieve
      */
    def getFilter(filterId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get issue
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/issue-getIssue)
      * @param issueIdOrKey - Id of issue
      * @param [fields] - [optional] The list of fields to return for each issue.
      * @param [expand] - [optional] A comma-separated list of the parameters to expand.
      */
    def getIssue(issueIdOrKey: String): js.Promise[JsonResponse] = js.native
    def getIssue(issueIdOrKey: String, fields: String): js.Promise[JsonResponse] = js.native
    def getIssue(issueIdOrKey: String, fields: String, expand: String): js.Promise[JsonResponse] = js.native
    def getIssue(issueIdOrKey: String, fields: js.Array[String]): js.Promise[JsonResponse] = js.native
    def getIssue(issueIdOrKey: String, fields: js.Array[String], expand: String): js.Promise[JsonResponse] = js.native
    def getIssue(issueIdOrKey: String, fields: Unit, expand: String): js.Promise[JsonResponse] = js.native
    
    /**
      * List all changes for an issue, sorted by date, starting from the latest
      * [Jira Doc](https://docs.atlassian.com/jira/REST/cloud/#api/2/issue/{issueIdOrKey}/changelog)
      * @param issueNumber - The issue number to search for including the project key
      * @param [startAt=0] - optional starting index number
      * @param [maxResults=50] - optional ending index number
      */
    def getIssueChangelog(issueNumber: String): js.Promise[JsonResponse] = js.native
    def getIssueChangelog(issueNumber: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getIssueChangelog(issueNumber: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getIssueChangelog(issueNumber: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    
    /**
      * @param optional - object containing any of the following properties
      * Get metadata for creating an issue.
      * [Jira Doc](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-issues/#api-rest-api-3-issue-createmeta-get)
      */
    def getIssueCreateMetadata(): js.Promise[JsonResponse] = js.native
    def getIssueCreateMetadata(optional: CreateIssueMetadataObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Get Property of Issue by Issue and Property Id
      * [Jira Doc](https://docs.atlassian.com/jira/REST/cloud/#api/2/issue/{issueIdOrKey}/properties-getProperty)
      * @param issueNumber - The issue number to search for including the project key
      * @param property - The property key to search for
      */
    def getIssueProperty(issueNumber: String, property: String): js.Promise[JsonResponse] = js.native
    
    /**
      * List all watchers for an issue
      * [Jira Doc](http://docs.atlassian.com/jira/REST/cloud/#api/2/issue-getIssueWatchers)
      * @param issueNumber - The issue number to search for including the project key
      */
    def getIssueWatchers(issueId: String): js.Promise[js.Array[JsonResponse]] = js.native
    
    /**
      * Get worklogs list from a given issue
      * [Jira Doc](https://developer.atlassian.com/cloud/jira/platform/rest/v3/#api-api-3-issue-issueIdOrKey-worklog-get)
      * @param issueId - the Id of the issue to find worklogs for
      * @param [startAt=0] - optional starting index number
      * @param [maxResults=1000] - optional ending index number
      */
    def getIssueWorklogs(issueId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get issues for backlog
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board-getIssuesForBacklog)
      * @param boardId - Id of board to retrieve
      * @param [startAt=0] - The starting index of the returned issues. Base index: 0.
      * @param [maxResults=50] - The maximum number of issues to return per page. Default: 50.
      * @param [jql] - Filters results using a JQL query.
      * @param [validateQuery] - Specifies whether to validate the JQL query or not.
      * Default: true.
      * @param [fields] - The list of fields to return for each issue.
      */
    def getIssuesForBacklog(boardId: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Double, maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Double, maxResults: Double, jql: String, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Double, maxResults: Double, jql: Unit, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: Unit,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Double, maxResults: Unit, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Double, maxResults: Unit, jql: String, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: Unit,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: Unit,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Double, maxResults: Unit, jql: Unit, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Double, maxResults: Unit, jql: Unit, validateQuery: Unit, fields: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Unit, maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Unit, maxResults: Double, jql: String, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Unit,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Unit,
      maxResults: Double,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Unit, maxResults: Double, jql: Unit, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Unit,
      maxResults: Double,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Unit, maxResults: Double, jql: Unit, validateQuery: Unit, fields: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Unit, maxResults: Unit, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Unit, maxResults: Unit, jql: String, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Unit, maxResults: Unit, jql: String, validateQuery: Unit, fields: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Unit, maxResults: Unit, jql: Unit, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Unit, maxResults: Unit, jql: Unit, validateQuery: Unit, fields: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get issues for board
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board-getIssuesForBoard)
      * @param boardId - Id of board to retrieve
      * @param [startAt=0] - The starting index of the returned issues. Base index: 0.
      * @param [maxResults=50] - The maximum number of issues to return per page. Default: 50.
      * @param [jql] - Filters results using a JQL query.
      * @param [validateQuery] - Specifies whether to validate the JQL query or not.
      * Default: true.
      * @param [fields] - The list of fields to return for each issue.
      */
    def getIssuesForBoard(boardId: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Double, maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Double, maxResults: Double, jql: String, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Double, maxResults: Double, jql: Unit, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: Unit,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Double, maxResults: Unit, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Double, maxResults: Unit, jql: String, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: Unit,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: Unit,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Double, maxResults: Unit, jql: Unit, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Double, maxResults: Unit, jql: Unit, validateQuery: Unit, fields: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Unit, maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Unit, maxResults: Double, jql: String, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Unit,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Unit,
      maxResults: Double,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Unit, maxResults: Double, jql: Unit, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Unit,
      maxResults: Double,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Unit, maxResults: Double, jql: Unit, validateQuery: Unit, fields: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Unit, maxResults: Unit, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Unit, maxResults: Unit, jql: String, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Unit, maxResults: Unit, jql: String, validateQuery: Unit, fields: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Unit, maxResults: Unit, jql: Unit, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Unit, maxResults: Unit, jql: Unit, validateQuery: Unit, fields: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get issues for epic
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/epic-getIssuesForEpic)
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/epic-getIssuesWithoutEpic)
      * @param epicId - Id of epic to retrieve, specify 'none' to get issues without an epic.
      * @param [startAt=0] - The starting index of the returned issues. Base index: 0.
      * @param [maxResults=50] - The maximum number of issues to return per page. Default: 50.
      * @param [jql] - Filters results using a JQL query.
      * @param [validateQuery] - Specifies whether to validate the JQL query or not.
      * Default: true.
      * @param [fields] - The list of fields to return for each issue.
      */
    def getIssuesForEpic(epicId: String): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Double, maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Double, maxResults: Double, jql: String, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(
      epicId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(
      epicId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Double, maxResults: Double, jql: Unit, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(
      epicId: String,
      startAt: Double,
      maxResults: Double,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(
      epicId: String,
      startAt: Double,
      maxResults: Double,
      jql: Unit,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Double, maxResults: Unit, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Double, maxResults: Unit, jql: String, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(
      epicId: String,
      startAt: Double,
      maxResults: Unit,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(
      epicId: String,
      startAt: Double,
      maxResults: Unit,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Double, maxResults: Unit, jql: Unit, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(
      epicId: String,
      startAt: Double,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Double, maxResults: Unit, jql: Unit, validateQuery: Unit, fields: String): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Unit, maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Unit, maxResults: Double, jql: String, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(
      epicId: String,
      startAt: Unit,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(
      epicId: String,
      startAt: Unit,
      maxResults: Double,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Unit, maxResults: Double, jql: Unit, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(
      epicId: String,
      startAt: Unit,
      maxResults: Double,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Unit, maxResults: Double, jql: Unit, validateQuery: Unit, fields: String): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Unit, maxResults: Unit, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Unit, maxResults: Unit, jql: String, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(
      epicId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Unit, maxResults: Unit, jql: String, validateQuery: Unit, fields: String): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Unit, maxResults: Unit, jql: Unit, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Unit, maxResults: Unit, jql: Unit, validateQuery: Boolean, fields: String): js.Promise[JsonResponse] = js.native
    def getIssuesForEpic(epicId: String, startAt: Unit, maxResults: Unit, jql: Unit, validateQuery: Unit, fields: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get the most recent sprint for a given rapidViewId
      * @param rapidViewId - the id for the rapid view
      */
    def getLastSprintForRapidView(rapidViewId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get the Project by project key
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id289232)
      * @param project - key for the project
      */
    def getProject(project: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get Projects
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board/{boardId}/project-getProjects)
      * @param boardId - Id of board to retrieve
      * @param [startAt=0] - The starting index of the returned projects. Base index: 0.
      * @param [maxResults=50] - The maximum number of projects to return per page.
      * Default: 50.
      */
    def getProjects(boardId: String): js.Promise[JsonResponse] = js.native
    def getProjects(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getProjects(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getProjects(boardId: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    
    /**
      * Get Projects Full
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board/{boardId}/project-getProjectsFull)
      * @param boardId - Id of board to retrieve
      */
    def getProjectsFull(boardId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Retrieves the remote links associated with the given issue.
      * @param issueNumber - the issue number to find remote links for.
      */
    def getRemoteLinks(issueNumber: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get server info
      * [Jira Doc](https://developer.atlassian.com/cloud/jira/platform/rest/v2/#api-api-2-serverInfo-get)
      */
    def getServerInfo(): js.Promise[JsonResponse] = js.native
    
    /**
      * Get details about a Sprint
      * @param sprintId - the id for the sprint view
      */
    def getSprint(sprintId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get the issues for a rapidView / sprint
      * @param rapidViewId - the id for the rapid view
      * @param sprintId - the id for the sprint
      */
    def getSprintIssues(rapidViewId: String, sprintId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get the unresolved issue count
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id288524)
      * @param version - the version of your product you want to find the unresolved
      * issues of.
      */
    def getUnresolvedIssueCount(version: String): js.Promise[Double] = js.native
    
    /**
      * Returns a user.
      * [Jira Doc](https://developer.atlassian.com/cloud/jira/platform/rest/v3/#api-rest-api-3-user-get)
      * @param accountId - The accountId of user to search for
      * @param expand - The expand for additional info (groups,applicationRoles)
      */
    def getUser(accountId: String, expand: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Returns a list of all (active and inactive) users.
      * [Jira Doc](https://developer.atlassian.com/cloud/jira/platform/rest/v3/#api-rest-api-3-users-search-get)
      * @param [startAt=0] - The index of the first user to return (0-based)
      * @param [maxResults=50] - The maximum number of users to return (defaults to 50).
      */
    def getUsers(): js.Promise[js.Array[JsonResponse]] = js.native
    def getUsers(startAt: Double): js.Promise[js.Array[JsonResponse]] = js.native
    def getUsers(startAt: Double, maxResults: Double): js.Promise[js.Array[JsonResponse]] = js.native
    def getUsers(startAt: Unit, maxResults: Double): js.Promise[js.Array[JsonResponse]] = js.native
    
    /**
      * Get all users in group on Jira
      * @param groupname - A query string used to search users in group
      * @param [startAt=0] - The index of the first user to return (0-based)
      * @param [maxResults=50] - The maximum number of users to return (defaults to 50).
      */
    def getUsersInGroup(groupname: String): js.Promise[JsonResponse] = js.native
    def getUsersInGroup(groupname: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getUsersInGroup(groupname: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getUsersInGroup(groupname: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    
    /**
      * Get issues related to a user
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id296043)
      * @param username - username of user to search for
      * @param open - determines if only open issues should be returned
      */
    def getUsersIssues(username: String, open: Boolean): js.Promise[JsonResponse] = js.native
    
    /**
      * Get details of single Version in project
      * [Jira Doc](https://docs.atlassian.com/jira/REST/cloud/#api/2/version-getVersion)
      * @param version - The id of this version
      */
    def getVersion(version: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get Versions for a project
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id289653)
      * @param project - A project key to get versions for
      */
    def getVersions(project: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get a webhook by its ID
      * [Jira Doc](https://developer.atlassian.com/display/JIRADEV/JIRA+Webhooks+Overview)
      * @param webhookID - id of webhook to get
      */
    def getWebhook(webhookID: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Returns worklog details for a list of worklog IDs.
      * [Jira Doc](https://developer.atlassian.com/cloud/jira/platform/rest/v3/#api-rest-api-3-worklog-list-post)
      * @param worklogsIDs - a list of worklog IDs.
      * @param expand - expand to include additional information about worklogs
      *
      */
    def getWorklogs(worklogsIDs: js.Array[String], expand: String): js.Promise[js.Array[JsonResponse]] = js.native
    
    /* private */ var greenhopperVersion: String = js.native
    
    /* private */ var host: String = js.native
    
    /* private */ var intermediatePath: js.UndefOr[String] = js.native
    
    /**
      * Create an issue link between two issues
      * @param link - a link object formatted how the Jira API specifies
      */
    def issueLink(link: LinkObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Notify people related to issue
      * [Jira Doc](https://docs.atlassian.com/jira/REST/cloud/#api/2/issue-notify)
      * @param issueId - issue id
      * @param notificationBody - properly formatted body
      */
    def issueNotify(issueId: String, notificationBody: NotificationObject): js.Promise[JsonResponse] = js.native
    
    /**
      * List Components
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id290489)
      * @param project - key for the project
      */
    def listComponents(project: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Returns all options defined for a select list issue field.
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#api/2/field/{fieldKey}/option-getAllOptions)
      * @param fieldKey - the key of the select list field
      */
    def listFieldOptions(fieldKey: String): js.Promise[JsonResponse] = js.native
    
    /**
      * List all fields custom and not that jira knows about.
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id290489)
      */
    def listFields(): js.Promise[js.Array[FieldObject]] = js.native
    
    /**
      * List all issue link types jira knows about
      * [Jira Doc](https://docs.atlassian.com/software/jira/docs/api/REST/8.5.0/#api/2/issueLinkType-getIssueLinkTypes)
      */
    def listIssueLinkTypes(): js.Promise[JsonResponse] = js.native
    
    /**
      * List all Issue Types jira knows about
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id295946)
      */
    def listIssueTypes(): js.Promise[JsonResponse] = js.native
    
    /**
      * List all priorities jira knows about
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id290489)
      */
    def listPriorities(): js.Promise[JsonResponse] = js.native
    
    /**
      * List all Viewable Projects
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id289193)
      */
    def listProjects(): js.Promise[js.Array[JsonResponse]] = js.native
    
    /**
      * Get a list of Sprints belonging to a Rapid View
      * @param rapidViewId - the id for the rapid view
      */
    def listSprints(rapidViewId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Get list of possible statuses
      * [Jira Doc](https://docs.atlassian.com/jira/REST/latest/#api/2/status-getStatuses)
      */
    def listStatus(): js.Promise[JsonResponse] = js.native
    
    /**
      * List Transitions for a specific issue that are available to the current user
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id290489)
      * @param issueId - get transitions available for the issue
      */
    def listTransitions(issueId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * List all registered webhooks
      * [Jira Doc](https://developer.atlassian.com/display/JIRADEV/JIRA+Webhooks+Overview)
      */
    def listWebhooks(): js.Promise[JsonResponse] = js.native
    
    /* private */ def makeAgileUri(options: UriOptions): String = js.native
    
    /* private */ def makeDevStatusUri(options: UriOptions): String = js.native
    
    /* private */ def makeRequestHeader(uri: String): Any = js.native
    /* private */ def makeRequestHeader(uri: String, options: UriOptions): Any = js.native
    
    /* private */ def makeSprintQueryUri(options: UriOptions): String = js.native
    
    /* private */ def makeUri(options: UriOptions): String = js.native
    
    /* private */ def makeWebhookUri(options: UriOptions): String = js.native
    
    /**
      * Move Issues to Epic
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/epic-moveIssuesToEpic)
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/epic-removeIssuesFromEpic)
      * @param epicIdOrKey - Id of epic to move issue to, or 'none' to remove from epic
      * @param issues - array of issues to move
      */
    def moveIssuesToEpic(epicIdOrKey: String, issues: js.Array[String]): js.Promise[JsonResponse] = js.native
    
    /**
      * Move issues to backlog
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/backlog-moveIssuesToBacklog)
      * @param issues - id or key of issues to get
      */
    def moveToBacklog(issues: js.Array[String]): js.Promise[JsonResponse] = js.native
    
    /**
      * Move version
      * [Jira Doc](https://docs.atlassian.com/jira/REST/cloud/#api/2/version-moveVersion)
      * @param versionId - the ID of the version to delete
      * @param position - an object of the new position
      */
    def moveVersion(versionId: String, position: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Partially update epic
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/epic-partiallyUpdateEpic)
      * @param epicIdOrKey - Id of epic to retrieve
      * @param body - value to set, for objects make sure to stringify first
      */
    def partiallyUpdateEpic(epicIdOrKey: String, body: String): js.Promise[JsonResponse] = js.native
    
    /* private */ var port: String | Null = js.native
    
    /* private */ var protocol: String = js.native
    
    /**
      * Rank Epics
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/epic-rankEpics)
      * @param epicIdOrKey - Id of epic
      * @param body - value to set (stringify first)
      */
    def rankEpics(epicIdOrKey: String, body: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Rank Issues
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/issue-rankIssues)
      * @param body - value to set
      */
    def rankIssues(body: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Register a webhook
      * [Jira Doc](https://developer.atlassian.com/display/JIRADEV/JIRA+Webhooks+Overview)
      * @param webhook - properly formatted webhook
      */
    def registerWebhook(webhook: WebhookObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Get count of issues assigned to the component.
      * [Jira Doc](https://developer.atlassian.com/cloud/jira/platform/rest/v2/#api-rest-api-2-component-id-relatedIssueCounts-get)
      * @param id - Component Id.
      */
    def relatedIssueCounts(id: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Pass a search query to Jira
      * [Jira Doc](https://docs.atlassian.com/jira/REST/latest/#d2e4424)
      * @param searchString - jira query string in JQL
      * @param optional - object containing any of the following properties
      */
    def searchJira(searchString: String): js.Promise[JsonResponse] = js.native
    def searchJira(searchString: String, optional: SearchQuery): js.Promise[JsonResponse] = js.native
    
    /**
      * Search user on Jira
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#d2e3756)
      * @param options
      */
    def searchUsers(options: SearchUserOptions): js.Promise[JsonResponse] = js.native
    
    /**
      * Set Board Property
      * [Jira Doc](https://docs.atlassian.com/jira-software/REST/cloud/#agile/1.0/board/{boardId}/properties-setProperty)
      * @param boardId - Id of board to retrieve
      * @param propertyKey - Id of property to delete
      * @param body - value to set, for objects make sure to stringify first
      */
    def setBoardProperty(boardId: String, propertyKey: String, body: String): js.Promise[JsonResponse] = js.native
    
    /* private */ var strictSSL: Boolean = js.native
    
    /**
      * Transition issue in Jira
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id290489)
      * @param issueId - the Id of the issue to delete
      * @param issueTransition - transition object from the jira rest API
      */
    def transitionIssue(issueId: String, issueTransition: TransitionObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Change an assignee on an issue
      * [Jira Doc](https://docs.atlassian.com/jira/REST/cloud/#api/2/issue-assign)
      * @param issueKey - the key of the existing issue
      * @param assigneeName - the jira username to add as a new assignee to the issue
      */
    def updateAssignee(issueKey: String, assigneeName: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Change an assignee on an issue
      * [Jira Doc](https://developer.atlassian.com/cloud/jira/platform/rest/v2/#api-rest-api-2-issue-issueIdOrKey-assignee-put)
      * @param issueKey - the key of the existing issue
      * @param userId - the jira username to add as a new assignee to the issue
      */
    def updateAssigneeWithId(issueKey: String, userId: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Update comment for an issue
      * [Jira Doc](https://docs.atlassian.com/jira/REST/cloud/#api/2/issue-updateComment)
      * @param issueId - Issue with the comment
      * @param commentId - Comment that is updated
      * @param comment - string containing new comment
      * @param [options={}] - extra options
      */
    def updateComment(issueId: String, commentId: String, comment: String): js.Promise[JsonResponse] = js.native
    def updateComment(issueId: String, commentId: String, comment: String, options: CommentOptions): js.Promise[JsonResponse] = js.native
    
    /**
      * Update Jira component
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#api/2/component-updateComponent)
      * @param componentId - the Id of the component to update
      * @param component - Properly Formatted Component
      */
    def updateComponent(componentId: String, component: ComponentObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Update issue in Jira
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#id290878)
      * @param issueId - the Id of the issue to update
      * @param issueUpdate - update Object as specified by the rest api
      * @param query - adds parameters to the query string
      */
    def updateIssue(issueId: String, issueUpdate: IssueObject): js.Promise[JsonResponse] = js.native
    def updateIssue(issueId: String, issueUpdate: IssueObject, query: Query): js.Promise[JsonResponse] = js.native
    
    /**
      * Update a version
      * [Jira Doc](https://docs.atlassian.com/jira/REST/latest/#d2e510)
      * @param version - an new object of the version to update
      */
    def updateVersion(version: VersionObject): js.Promise[JsonResponse] = js.native
    
    /**
      * Get ids of worklogs modified since
      * [Jira Doc](https://docs.atlassian.com/jira/REST/cloud/#api/2/worklog-getWorklogsForIds)
      * @param since - a date time in unix timestamp format since when updated worklogs
      * will be returned.
      * @param expand - ptional comma separated list of parameters to expand: properties
      * (provides worklog properties).
      */
    def updatedWorklogs(since: Double, expand: String): js.Promise[JsonResponse] = js.native
    
    /**
      * Creates or updates an option for a select list issue field.
      * [Jira Doc](http://docs.atlassian.com/jira/REST/latest/#api/2/field/{fieldKey}/option-putOption)
      * @param fieldKey - the key of the select list field
      * @param optionId - the id of the modified option
      * @param option - properly formatted Option object
      */
    def upsertFieldOption(fieldKey: String, optionId: String, option: FieldOptionObject): js.Promise[JsonResponse] = js.native
    
    /* private */ var webhookVersion: String = js.native
  }
  
  trait JiraApiOptions extends StObject {
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    var base: js.UndefOr[String] = js.undefined
    
    var bearer: js.UndefOr[String] = js.undefined
    
    var ca: js.UndefOr[String] = js.undefined
    
    var greenhopperVersion: js.UndefOr[String] = js.undefined
    
    var host: String
    
    var intermediatePath: js.UndefOr[String] = js.undefined
    
    var oauth: js.UndefOr[OAuth] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var request: js.UndefOr[Any] = js.undefined
    
    var strictSSL: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
    
    var webhookVersion: js.UndefOr[String] = js.undefined
  }
  object JiraApiOptions {
    
    inline def apply(host: String): JiraApiOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[JiraApiOptions]
    }
    
    extension [Self <: JiraApiOptions](x: Self) {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setBearer(value: String): Self = StObject.set(x, "bearer", value.asInstanceOf[js.Any])
      
      inline def setBearerUndefined: Self = StObject.set(x, "bearer", js.undefined)
      
      inline def setCa(value: String): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setGreenhopperVersion(value: String): Self = StObject.set(x, "greenhopperVersion", value.asInstanceOf[js.Any])
      
      inline def setGreenhopperVersionUndefined: Self = StObject.set(x, "greenhopperVersion", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setIntermediatePath(value: String): Self = StObject.set(x, "intermediatePath", value.asInstanceOf[js.Any])
      
      inline def setIntermediatePathUndefined: Self = StObject.set(x, "intermediatePath", js.undefined)
      
      inline def setOauth(value: OAuth): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
      
      inline def setOauthUndefined: Self = StObject.set(x, "oauth", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRequest(value: Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setWebhookVersion(value: String): Self = StObject.set(x, "webhookVersion", value.asInstanceOf[js.Any])
      
      inline def setWebhookVersionUndefined: Self = StObject.set(x, "webhookVersion", js.undefined)
    }
  }
  
  type JsonResponse = StringDictionary[Any]
  
  type LinkObject = StringDictionary[Any]
  
  type NotificationObject = StringDictionary[Any]
  
  trait OAuth extends StObject {
    
    var access_token: String
    
    var access_token_secret: String
    
    var consumer_key: String
    
    var consumer_secret: String
    
    var signature_method: js.UndefOr[String] = js.undefined
  }
  object OAuth {
    
    inline def apply(access_token: String, access_token_secret: String, consumer_key: String, consumer_secret: String): OAuth = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], access_token_secret = access_token_secret.asInstanceOf[js.Any], consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth]
    }
    
    extension [Self <: OAuth](x: Self) {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setAccess_token_secret(value: String): Self = StObject.set(x, "access_token_secret", value.asInstanceOf[js.Any])
      
      inline def setConsumer_key(value: String): Self = StObject.set(x, "consumer_key", value.asInstanceOf[js.Any])
      
      inline def setConsumer_secret(value: String): Self = StObject.set(x, "consumer_secret", value.asInstanceOf[js.Any])
      
      inline def setSignature_method(value: String): Self = StObject.set(x, "signature_method", value.asInstanceOf[js.Any])
      
      inline def setSignature_methodUndefined: Self = StObject.set(x, "signature_method", js.undefined)
    }
  }
  
  type ProjectObject = StringDictionary[Any]
  
  type Query = StringDictionary[Any]
  
  trait SearchQuery extends StObject {
    
    /** [optional] array of string names of desired expand nodes */
    var expand: js.UndefOr[js.Array[String]] = js.undefined
    
    /** [optional] array of string names of desired fields */
    var fields: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      *  [optional - default = 50] The maximum number of items to
      *  return per page. To manage page size, Jira may return fewer items per
      *  page where a large number of fields are requested.
      */
    var maxResults: js.UndefOr[Double] = js.undefined
    
    /** [optional - default = 0] starting index number */
    var startAt: js.UndefOr[Double] = js.undefined
  }
  object SearchQuery {
    
    inline def apply(): SearchQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchQuery]
    }
    
    extension [Self <: SearchQuery](x: Self) {
      
      inline def setExpand(value: js.Array[String]): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setExpandVarargs(value: String*): Self = StObject.set(x, "expand", js.Array(value*))
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
    }
  }
  
  trait SearchUserOptions extends StObject {
    
    /** [optional - default = true] If true, then active users are included in the results */
    var includeActive: js.UndefOr[Boolean] = js.undefined
    
    /** [optional - default = true] If true, then inactive users are included in the results */
    var includeInactive: js.UndefOr[Boolean] = js.undefined
    
    /** [optional - default = 50] The maximum number of users to return */
    var maxResults: js.UndefOr[Double] = js.undefined
    
    /**
      * A query string that is matched against user attributes
      * (displayName, and emailAddress) to find relevant users. The string can match the prefix of
      * the attribute's value. For example, query=john matches a user with a displayName of John
      * Smith and a user with an emailAddress of johnson@example.com. Required, unless accountId
      * or property is specified.
      */
    var query: String
    
    /** [optional - default = 0] The index of the first user to return (0-based) */
    var startAt: js.UndefOr[Double] = js.undefined
    
    /** (DEPRECATED) A query string used to search username, name or e-mail address */
    var username: String
  }
  object SearchUserOptions {
    
    inline def apply(query: String, username: String): SearchUserOptions = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchUserOptions]
    }
    
    extension [Self <: SearchUserOptions](x: Self) {
      
      inline def setIncludeActive(value: Boolean): Self = StObject.set(x, "includeActive", value.asInstanceOf[js.Any])
      
      inline def setIncludeActiveUndefined: Self = StObject.set(x, "includeActive", js.undefined)
      
      inline def setIncludeInactive(value: Boolean): Self = StObject.set(x, "includeInactive", value.asInstanceOf[js.Any])
      
      inline def setIncludeInactiveUndefined: Self = StObject.set(x, "includeInactive", js.undefined)
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  type TransitionObject = StringDictionary[Any]
  
  trait UriOptions extends StObject {
    
    var intermediatePath: js.UndefOr[String] = js.undefined
    
    var pathname: String
    
    var query: js.UndefOr[Query] = js.undefined
  }
  object UriOptions {
    
    inline def apply(pathname: String): UriOptions = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
      __obj.asInstanceOf[UriOptions]
    }
    
    extension [Self <: UriOptions](x: Self) {
      
      inline def setIntermediatePath(value: String): Self = StObject.set(x, "intermediatePath", value.asInstanceOf[js.Any])
      
      inline def setIntermediatePathUndefined: Self = StObject.set(x, "intermediatePath", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  type UserObject = StringDictionary[Any]
  
  type VersionObject = StringDictionary[Any]
  
  type WebhookObject = StringDictionary[Any]
  
  type WorklogObject = StringDictionary[Any]
  
  type WorklogOptions = StringDictionary[Any]
}
