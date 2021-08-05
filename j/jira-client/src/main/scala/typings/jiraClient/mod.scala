package typings.jiraClient

import org.scalablytyped.runtime.StringDictionary
import typings.jiraClient.jiraClientStrings.`false`
import typings.jiraClient.jiraClientStrings.`true`
import typings.jiraClient.jiraClientStrings.active
import typings.jiraClient.jiraClientStrings.closed
import typings.jiraClient.jiraClientStrings.future
import typings.node.fsMod.ReadStream
import typings.request.mod.CoreOptions
import typings.request.mod.RequestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jira-client", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with JiraApi {
    def this(options: JiraApiOptions) = this()
  }
  
  type BoardObject = StringDictionary[js.Any]
  
  type ComponentObject = StringDictionary[js.Any]
  
  type EstimateObject = StringDictionary[js.Any]
  
  type FieldObject = StringDictionary[js.Any]
  
  type FieldOptionObject = StringDictionary[js.Any]
  
  type IssueObject = StringDictionary[js.Any]
  
  @js.native
  trait JiraApi extends StObject {
    
    def addAttachmentOnIssue(issueId: String, readStream: ReadStream): js.Promise[JsonResponse] = js.native
    
    def addComment(issueId: String, comment: String): js.Promise[JsonResponse] = js.native
    
    def addIssueToSprint(issueId: String, sprintId: String): js.Promise[JsonResponse] = js.native
    
    def addNewComponent(component: ComponentObject): js.Promise[JsonResponse] = js.native
    
    def addNewIssue(issue: IssueObject): js.Promise[JsonResponse] = js.native
    
    def addWatcher(issueKey: String, username: String): js.Promise[JsonResponse] = js.native
    
    def addWorklog(issueId: String, worklog: WorklogObject): js.Promise[JsonResponse] = js.native
    def addWorklog(issueId: String, worklog: WorklogObject, newEstimate: EstimateObject): js.Promise[JsonResponse] = js.native
    
    /* private */ var apiVersion: String = js.native
    
    /* private */ var base: String = js.native
    
    def createBoard(boardBody: BoardObject): js.Promise[JsonResponse] = js.native
    
    def createCustomField(field: FieldObject): js.Promise[JsonResponse] = js.native
    
    def createFieldOption(fieldKey: String, option: FieldOptionObject): js.Promise[JsonResponse] = js.native
    
    def createProject(project: String): js.Promise[JsonResponse] = js.native
    
    def createRemoteLink(issueNumber: String, remoteLink: LinkObject): js.Promise[JsonResponse] = js.native
    
    def createUser(user: UserObject): js.Promise[JsonResponse] = js.native
    
    def createVersion(version: String): js.Promise[JsonResponse] = js.native
    
    def deleteBoard(boardId: String): js.Promise[JsonResponse] = js.native
    
    def deleteBoardProperty(boardId: String, propertyKey: String): js.Promise[JsonResponse] = js.native
    
    def deleteComponent(componentId: String): js.Promise[JsonResponse] = js.native
    
    def deleteFieldOption(fieldKey: String, optionId: String): js.Promise[JsonResponse] = js.native
    
    def deleteIssue(issueId: String): js.Promise[JsonResponse] = js.native
    
    def deleteVersion(versionId: String, moveFixIssuesToId: String, moveAffectedIssuesToId: String): js.Promise[JsonResponse] = js.native
    
    def deleteWebhook(webhookID: String): js.Promise[JsonResponse] = js.native
    
    def deleteWorklog(issueId: String, worklogId: String): js.Promise[JsonResponse] = js.native
    
    /* private */ def doRequest(requestOptions: CoreOptions): js.Promise[RequestResponse] = js.native
    
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
    
    def findRapidView(projectName: String): js.Promise[js.Array[JsonResponse]] = js.native
    
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
    
    def getAllSprints(boardId: String): js.Promise[JsonResponse] = js.native
    def getAllSprints(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getAllSprints(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getAllSprints(boardId: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_active(boardId: String, startAt: Double, maxResults: Double, state: active): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_active(boardId: String, startAt: Double, maxResults: Unit, state: active): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_active(boardId: String, startAt: Unit, maxResults: Double, state: active): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_active(boardId: String, startAt: Unit, maxResults: Unit, state: active): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_closed(boardId: String, startAt: Double, maxResults: Double, state: closed): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_closed(boardId: String, startAt: Double, maxResults: Unit, state: closed): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_closed(boardId: String, startAt: Unit, maxResults: Double, state: closed): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_closed(boardId: String, startAt: Unit, maxResults: Unit, state: closed): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_future(boardId: String, startAt: Double, maxResults: Double, state: future): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_future(boardId: String, startAt: Double, maxResults: Unit, state: future): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_future(boardId: String, startAt: Unit, maxResults: Double, state: future): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_future(boardId: String, startAt: Unit, maxResults: Unit, state: future): js.Promise[JsonResponse] = js.native
    
    def getAllVersions(boardId: String): js.Promise[JsonResponse] = js.native
    def getAllVersions(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getAllVersions(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getAllVersions(boardId: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_false(boardId: String, startAt: Double, maxResults: Double, released: `false`): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_false(boardId: String, startAt: Double, maxResults: Unit, released: `false`): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_false(boardId: String, startAt: Unit, maxResults: Double, released: `false`): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_false(boardId: String, startAt: Unit, maxResults: Unit, released: `false`): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_true(boardId: String, startAt: Double, maxResults: Double, released: `true`): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_true(boardId: String, startAt: Double, maxResults: Unit, released: `true`): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_true(boardId: String, startAt: Unit, maxResults: Double, released: `true`): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_true(boardId: String, startAt: Unit, maxResults: Unit, released: `true`): js.Promise[JsonResponse] = js.native
    
    def getBacklogForRapidView(rapidViewId: String): js.Promise[JsonResponse] = js.native
    
    def getBoard(boardId: String): js.Promise[JsonResponse] = js.native
    
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
    
    def getBoardIssuesForSprint(boardId: String, sprintId: String): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(boardId: String, sprintId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(boardId: String, sprintId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(boardId: String, sprintId: String, startAt: Double, maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Double,
      jql: Unit,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Double,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Double,
      jql: Unit,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(boardId: String, sprintId: String, startAt: Double, maxResults: Unit, jql: String): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Unit,
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Unit,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Unit,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(boardId: String, sprintId: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(boardId: String, sprintId: String, startAt: Unit, maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Unit,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Unit,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Unit,
      maxResults: Double,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Unit,
      maxResults: Double,
      jql: Unit,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Unit,
      maxResults: Double,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Unit,
      maxResults: Double,
      jql: Unit,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(boardId: String, sprintId: String, startAt: Unit, maxResults: Unit, jql: String): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: String,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Unit,
      maxResults: Unit,
      jql: Unit,
      validateQuery: Unit,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    
    def getBoardPropertiesKeys(boardId: String): js.Promise[JsonResponse] = js.native
    
    def getBoardProperty(boardId: String, propertyKey: String): js.Promise[JsonResponse] = js.native
    
    def getConfiguration(boardId: String): js.Promise[JsonResponse] = js.native
    
    def getCurrentUser(): js.Promise[JsonResponse] = js.native
    
    def getDevStatusDetail(issueId: String, applicationType: String, dataType: String): js.Promise[JsonResponse] = js.native
    
    def getDevStatusSummary(issueId: String): js.Promise[JsonResponse] = js.native
    
    def getEpics(boardId: String): js.Promise[JsonResponse] = js.native
    def getEpics(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getEpics(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getEpics(boardId: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_false(boardId: String, startAt: Double, maxResults: Double, done: `false`): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_false(boardId: String, startAt: Double, maxResults: Unit, done: `false`): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_false(boardId: String, startAt: Unit, maxResults: Double, done: `false`): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_false(boardId: String, startAt: Unit, maxResults: Unit, done: `false`): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_true(boardId: String, startAt: Double, maxResults: Double, done: `true`): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_true(boardId: String, startAt: Double, maxResults: Unit, done: `true`): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_true(boardId: String, startAt: Unit, maxResults: Double, done: `true`): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_true(boardId: String, startAt: Unit, maxResults: Unit, done: `true`): js.Promise[JsonResponse] = js.native
    
    def getFieldOption(fieldKey: String, optionId: String): js.Promise[JsonResponse] = js.native
    
    def getIssueProperty(issueNumber: String, property: String): js.Promise[JsonResponse] = js.native
    
    def getIssueWatchers(issueId: String): js.Promise[js.Array[JsonResponse]] = js.native
    
    def getIssueWorklogs(issueId: String): js.Promise[JsonResponse] = js.native
    
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
    
    def getLastSprintForRapidView(rapidViewId: String): js.Promise[JsonResponse] = js.native
    
    def getProject(project: String): js.Promise[JsonResponse] = js.native
    
    def getProjects(boardId: String): js.Promise[JsonResponse] = js.native
    def getProjects(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getProjects(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getProjects(boardId: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    
    def getProjectsFull(boardId: String): js.Promise[JsonResponse] = js.native
    
    def getRemoteLinks(issueNumber: String): js.Promise[JsonResponse] = js.native
    
    def getSprintIssues(rapidViewId: String, sprintId: String): js.Promise[JsonResponse] = js.native
    
    def getUnresolvedIssueCount(version: String): js.Promise[Double] = js.native
    
    def getUsersInGroup(groupname: String): js.Promise[JsonResponse] = js.native
    def getUsersInGroup(groupname: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getUsersInGroup(groupname: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getUsersInGroup(groupname: String, startAt: Unit, maxResults: Double): js.Promise[JsonResponse] = js.native
    
    def getVersions(project: String): js.Promise[JsonResponse] = js.native
    
    def getWebhook(webhookID: String): js.Promise[JsonResponse] = js.native
    
    /* private */ var greenhopperVersion: String = js.native
    
    /* private */ var host: String = js.native
    
    /* private */ var intermediatePath: js.UndefOr[String] = js.native
    
    def issueLink(link: LinkObject): js.Promise[JsonResponse] = js.native
    
    def issueNotify(issueId: String, notificationBody: NotificationObject): js.Promise[JsonResponse] = js.native
    
    def listComponents(project: String): js.Promise[JsonResponse] = js.native
    
    def listFieldOptions(fieldKey: String): js.Promise[JsonResponse] = js.native
    
    def listFields(): js.Promise[js.Array[FieldObject]] = js.native
    
    def listIssueTypes(): js.Promise[JsonResponse] = js.native
    
    def listPriorities(): js.Promise[JsonResponse] = js.native
    
    def listProjects(): js.Promise[JsonResponse] = js.native
    
    def listSprints(rapidViewId: String): js.Promise[JsonResponse] = js.native
    
    def listStatus(): js.Promise[JsonResponse] = js.native
    
    def listTransitions(issueId: String): js.Promise[JsonResponse] = js.native
    
    def listWebhooks(): js.Promise[JsonResponse] = js.native
    
    /* private */ def makeAgileUri(options: UriOptions): String = js.native
    
    /* private */ def makeDevStatusUri(options: UriOptions): String = js.native
    
    /* private */ def makeRequestHeader(uri: String): js.Any = js.native
    /* private */ def makeRequestHeader(uri: String, options: UriOptions): js.Any = js.native
    
    /* private */ def makeSprintQueryUri(options: UriOptions): String = js.native
    
    /* private */ def makeUri(options: UriOptions): String = js.native
    
    /* private */ def makeWebhookUri(options: UriOptions): String = js.native
    
    def moveToBacklog(issues: js.Array[String]): js.Promise[JsonResponse] = js.native
    
    /* private */ var port: String | Null = js.native
    
    /* private */ var protocol: String = js.native
    
    def registerWebhook(webhook: WebhookObject): js.Promise[JsonResponse] = js.native
    
    def searchJira(searchString: String): js.Promise[JsonResponse] = js.native
    def searchJira(searchString: String, optional: SearchQuery): js.Promise[JsonResponse] = js.native
    
    def searchUsers(options: SearchUserOptions): js.Promise[JsonResponse] = js.native
    
    def setBoardProperty(boardId: String, propertyKey: String, body: String): js.Promise[JsonResponse] = js.native
    
    /* private */ var strictSSL: Boolean = js.native
    
    def transitionIssue(issueId: String, issueTransition: TransitionObject): js.Promise[JsonResponse] = js.native
    
    def updateComment(issueId: String, commentId: String, comment: String): js.Promise[JsonResponse] = js.native
    def updateComment(issueId: String, commentId: String, comment: String, options: js.Any): js.Promise[JsonResponse] = js.native
    
    def updateIssue(issueId: String, issueUpdate: IssueObject): js.Promise[JsonResponse] = js.native
    def updateIssue(issueId: String, issueUpdate: IssueObject, query: Query): js.Promise[JsonResponse] = js.native
    
    def updateVersion(version: String): js.Promise[JsonResponse] = js.native
    
    def upsertFieldOption(fieldKey: String, optionId: String, option: FieldOptionObject): js.Promise[JsonResponse] = js.native
    
    /* private */ var webhookVersion: String = js.native
  }
  
  trait JiraApiOptions extends StObject {
    
    var apiVersion: js.UndefOr[String] = js.undefined
    
    var base: js.UndefOr[String] = js.undefined
    
    var bearer: js.UndefOr[String] = js.undefined
    
    var greenhopperVersion: js.UndefOr[String] = js.undefined
    
    var host: String
    
    var intermediatePath: js.UndefOr[String] = js.undefined
    
    var oauth: js.UndefOr[OAuth] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    var request: js.UndefOr[js.Any] = js.undefined
    
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
      
      inline def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
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
  
  type JsonResponse = StringDictionary[js.Any]
  
  type LinkObject = StringDictionary[js.Any]
  
  type NotificationObject = StringDictionary[js.Any]
  
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
  
  type Query = StringDictionary[js.Any]
  
  trait SearchQuery extends StObject {
    
    var expand: js.UndefOr[js.Array[String]] = js.undefined
    
    var fields: js.UndefOr[js.Array[String]] = js.undefined
    
    var maxResults: js.UndefOr[Double] = js.undefined
    
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
      
      inline def setExpandVarargs(value: String*): Self = StObject.set(x, "expand", js.Array(value :_*))
      
      inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
    }
  }
  
  trait SearchUserOptions extends StObject {
    
    var includeActive: js.UndefOr[Boolean] = js.undefined
    
    var includeInactive: js.UndefOr[Boolean] = js.undefined
    
    var maxResults: js.UndefOr[Double] = js.undefined
    
    var startAt: js.UndefOr[Double] = js.undefined
    
    var username: String
  }
  object SearchUserOptions {
    
    inline def apply(username: String): SearchUserOptions = {
      val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchUserOptions]
    }
    
    extension [Self <: SearchUserOptions](x: Self) {
      
      inline def setIncludeActive(value: Boolean): Self = StObject.set(x, "includeActive", value.asInstanceOf[js.Any])
      
      inline def setIncludeActiveUndefined: Self = StObject.set(x, "includeActive", js.undefined)
      
      inline def setIncludeInactive(value: Boolean): Self = StObject.set(x, "includeInactive", value.asInstanceOf[js.Any])
      
      inline def setIncludeInactiveUndefined: Self = StObject.set(x, "includeInactive", js.undefined)
      
      inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      inline def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      inline def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  type TransitionObject = StringDictionary[js.Any]
  
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
  
  type UserObject = StringDictionary[js.Any]
  
  type WebhookObject = StringDictionary[js.Any]
  
  type WorklogObject = StringDictionary[js.Any]
}
