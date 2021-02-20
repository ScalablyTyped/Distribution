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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jira-client", JSImport.Namespace)
  @js.native
  class ^ protected () extends JiraApi {
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
    
    var apiVersion: String = js.native
    
    var base: String = js.native
    
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
    def findIssue(
      issueNumber: String,
      expand: js.UndefOr[scala.Nothing],
      fields: js.UndefOr[scala.Nothing],
      properties: js.UndefOr[scala.Nothing],
      fieldsByKeys: Boolean
    ): js.Promise[JsonResponse] = js.native
    def findIssue(
      issueNumber: String,
      expand: js.UndefOr[scala.Nothing],
      fields: js.UndefOr[scala.Nothing],
      properties: String
    ): js.Promise[JsonResponse] = js.native
    def findIssue(
      issueNumber: String,
      expand: js.UndefOr[scala.Nothing],
      fields: js.UndefOr[scala.Nothing],
      properties: String,
      fieldsByKeys: Boolean
    ): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: js.UndefOr[scala.Nothing], fields: String): js.Promise[JsonResponse] = js.native
    def findIssue(
      issueNumber: String,
      expand: js.UndefOr[scala.Nothing],
      fields: String,
      properties: js.UndefOr[scala.Nothing],
      fieldsByKeys: Boolean
    ): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: js.UndefOr[scala.Nothing], fields: String, properties: String): js.Promise[JsonResponse] = js.native
    def findIssue(
      issueNumber: String,
      expand: js.UndefOr[scala.Nothing],
      fields: String,
      properties: String,
      fieldsByKeys: Boolean
    ): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: String): js.Promise[JsonResponse] = js.native
    def findIssue(
      issueNumber: String,
      expand: String,
      fields: js.UndefOr[scala.Nothing],
      properties: js.UndefOr[scala.Nothing],
      fieldsByKeys: Boolean
    ): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: String, fields: js.UndefOr[scala.Nothing], properties: String): js.Promise[JsonResponse] = js.native
    def findIssue(
      issueNumber: String,
      expand: String,
      fields: js.UndefOr[scala.Nothing],
      properties: String,
      fieldsByKeys: Boolean
    ): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: String, fields: String): js.Promise[JsonResponse] = js.native
    def findIssue(
      issueNumber: String,
      expand: String,
      fields: String,
      properties: js.UndefOr[scala.Nothing],
      fieldsByKeys: Boolean
    ): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: String, fields: String, properties: String): js.Promise[JsonResponse] = js.native
    def findIssue(issueNumber: String, expand: String, fields: String, properties: String, fieldsByKeys: Boolean): js.Promise[JsonResponse] = js.native
    
    def findRapidView(projectName: String): js.Promise[js.Array[JsonResponse]] = js.native
    
    def getAllBoards(): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      projectKeyOrId: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      name: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      name: String,
      projectKeyOrId: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: js.UndefOr[scala.Nothing], maxResults: js.UndefOr[scala.Nothing], `type`: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      `type`: String,
      name: js.UndefOr[scala.Nothing],
      projectKeyOrId: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      `type`: String,
      name: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      `type`: String,
      name: String,
      projectKeyOrId: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      `type`: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      projectKeyOrId: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      `type`: js.UndefOr[scala.Nothing],
      name: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      `type`: js.UndefOr[scala.Nothing],
      name: String,
      projectKeyOrId: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: js.UndefOr[scala.Nothing], maxResults: Double, `type`: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      `type`: String,
      name: js.UndefOr[scala.Nothing],
      projectKeyOrId: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: js.UndefOr[scala.Nothing], maxResults: Double, `type`: String, name: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      `type`: String,
      name: String,
      projectKeyOrId: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      projectKeyOrId: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      name: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      name: String,
      projectKeyOrId: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: js.UndefOr[scala.Nothing], `type`: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      `type`: String,
      name: js.UndefOr[scala.Nothing],
      projectKeyOrId: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: js.UndefOr[scala.Nothing], `type`: String, name: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      `type`: String,
      name: String,
      projectKeyOrId: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: Double,
      maxResults: Double,
      `type`: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      projectKeyOrId: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Double, `type`: js.UndefOr[scala.Nothing], name: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: Double,
      maxResults: Double,
      `type`: js.UndefOr[scala.Nothing],
      name: String,
      projectKeyOrId: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Double, `type`: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(
      startAt: Double,
      maxResults: Double,
      `type`: String,
      name: js.UndefOr[scala.Nothing],
      projectKeyOrId: String
    ): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Double, `type`: String, name: String): js.Promise[JsonResponse] = js.native
    def getAllBoards(startAt: Double, maxResults: Double, `type`: String, name: String, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
    
    def getAllSprints(boardId: String): js.Promise[JsonResponse] = js.native
    def getAllSprints(boardId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[JsonResponse] = js.native
    def getAllSprints(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getAllSprints(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_active(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      state: active
    ): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_active(boardId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double, state: active): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_active(boardId: String, startAt: Double, maxResults: js.UndefOr[scala.Nothing], state: active): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_active(boardId: String, startAt: Double, maxResults: Double, state: active): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_closed(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      state: closed
    ): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_closed(boardId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double, state: closed): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_closed(boardId: String, startAt: Double, maxResults: js.UndefOr[scala.Nothing], state: closed): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_closed(boardId: String, startAt: Double, maxResults: Double, state: closed): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_future(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      state: future
    ): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_future(boardId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double, state: future): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_future(boardId: String, startAt: Double, maxResults: js.UndefOr[scala.Nothing], state: future): js.Promise[JsonResponse] = js.native
    @JSName("getAllSprints")
    def getAllSprints_future(boardId: String, startAt: Double, maxResults: Double, state: future): js.Promise[JsonResponse] = js.native
    
    def getAllVersions(boardId: String): js.Promise[JsonResponse] = js.native
    def getAllVersions(boardId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[JsonResponse] = js.native
    def getAllVersions(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getAllVersions(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_false(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      released: `false`
    ): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_false(boardId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double, released: `false`): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_false(boardId: String, startAt: Double, maxResults: js.UndefOr[scala.Nothing], released: `false`): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_false(boardId: String, startAt: Double, maxResults: Double, released: `false`): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_true(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      released: `true`
    ): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_true(boardId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double, released: `true`): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_true(boardId: String, startAt: Double, maxResults: js.UndefOr[scala.Nothing], released: `true`): js.Promise[JsonResponse] = js.native
    @JSName("getAllVersions")
    def getAllVersions_true(boardId: String, startAt: Double, maxResults: Double, released: `true`): js.Promise[JsonResponse] = js.native
    
    def getBacklogForRapidView(rapidViewId: String): js.Promise[JsonResponse] = js.native
    
    def getBoard(boardId: String): js.Promise[JsonResponse] = js.native
    
    def getBoardIssuesForEpic(boardId: String, epicId: String): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(boardId: String, epicId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(boardId: String, epicId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(boardId: String, epicId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(boardId: String, epicId: String, startAt: Double, maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForEpic(
      boardId: String,
      epicId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
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
    
    def getBoardIssuesForSprint(boardId: String, sprintId: String): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(boardId: String, sprintId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(boardId: String, sprintId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(boardId: String, sprintId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(boardId: String, sprintId: String, startAt: Double, maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getBoardIssuesForSprint(
      boardId: String,
      sprintId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
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
    
    def getBoardPropertiesKeys(boardId: String): js.Promise[JsonResponse] = js.native
    
    def getBoardProperty(boardId: String, propertyKey: String): js.Promise[JsonResponse] = js.native
    
    def getConfiguration(boardId: String): js.Promise[JsonResponse] = js.native
    
    def getCurrentUser(): js.Promise[JsonResponse] = js.native
    
    def getDevStatusDetail(issueId: String, applicationType: String, dataType: String): js.Promise[JsonResponse] = js.native
    
    def getDevStatusSummary(issueId: String): js.Promise[JsonResponse] = js.native
    
    def getEpics(boardId: String): js.Promise[JsonResponse] = js.native
    def getEpics(boardId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[JsonResponse] = js.native
    def getEpics(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getEpics(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_false(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      done: `false`
    ): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_false(boardId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double, done: `false`): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_false(boardId: String, startAt: Double, maxResults: js.UndefOr[scala.Nothing], done: `false`): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_false(boardId: String, startAt: Double, maxResults: Double, done: `false`): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_true(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      done: `true`
    ): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_true(boardId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double, done: `true`): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_true(boardId: String, startAt: Double, maxResults: js.UndefOr[scala.Nothing], done: `true`): js.Promise[JsonResponse] = js.native
    @JSName("getEpics")
    def getEpics_true(boardId: String, startAt: Double, maxResults: Double, done: `true`): js.Promise[JsonResponse] = js.native
    
    def getFieldOption(fieldKey: String, optionId: String): js.Promise[JsonResponse] = js.native
    
    def getIssueProperty(issueNumber: String, property: String): js.Promise[JsonResponse] = js.native
    
    def getIssueWatchers(issueId: String): js.Promise[js.Array[JsonResponse]] = js.native
    
    def getIssueWorklogs(issueId: String): js.Promise[JsonResponse] = js.native
    
    def getIssuesForBacklog(boardId: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Double, maxResults: js.UndefOr[scala.Nothing], jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Double, maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(boardId: String, startAt: Double, maxResults: Double, jql: String, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBacklog(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    
    def getIssuesForBoard(boardId: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: js.UndefOr[scala.Nothing],
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Double, maxResults: js.UndefOr[scala.Nothing], jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: js.UndefOr[scala.Nothing],
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: js.UndefOr[scala.Nothing],
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Double, maxResults: Double, jql: String): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: js.UndefOr[scala.Nothing],
      fields: String
    ): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(boardId: String, startAt: Double, maxResults: Double, jql: String, validateQuery: Boolean): js.Promise[JsonResponse] = js.native
    def getIssuesForBoard(
      boardId: String,
      startAt: Double,
      maxResults: Double,
      jql: String,
      validateQuery: Boolean,
      fields: String
    ): js.Promise[JsonResponse] = js.native
    
    def getLastSprintForRapidView(rapidViewId: String): js.Promise[JsonResponse] = js.native
    
    def getProject(project: String): js.Promise[JsonResponse] = js.native
    
    def getProjects(boardId: String): js.Promise[JsonResponse] = js.native
    def getProjects(boardId: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[JsonResponse] = js.native
    def getProjects(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getProjects(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    
    def getProjectsFull(boardId: String): js.Promise[JsonResponse] = js.native
    
    def getRemoteLinks(issueNumber: String): js.Promise[JsonResponse] = js.native
    
    def getSprintIssues(rapidViewId: String, sprintId: String): js.Promise[JsonResponse] = js.native
    
    def getUnresolvedIssueCount(version: String): js.Promise[Double] = js.native
    
    def getUsersInGroup(groupname: String): js.Promise[JsonResponse] = js.native
    def getUsersInGroup(groupname: String, startAt: js.UndefOr[scala.Nothing], maxResults: Double): js.Promise[JsonResponse] = js.native
    def getUsersInGroup(groupname: String, startAt: Double): js.Promise[JsonResponse] = js.native
    def getUsersInGroup(groupname: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
    
    def getVersions(project: String): js.Promise[JsonResponse] = js.native
    
    def getWebhook(webhookID: String): js.Promise[JsonResponse] = js.native
    
    var greenhopperVersion: String = js.native
    
    var host: String = js.native
    
    var intermediatePath: js.UndefOr[String] = js.native
    
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
    
    var port: String | Null = js.native
    
    var protocol: String = js.native
    
    def registerWebhook(webhook: WebhookObject): js.Promise[JsonResponse] = js.native
    
    def searchJira(searchString: String): js.Promise[JsonResponse] = js.native
    def searchJira(searchString: String, optional: SearchQuery): js.Promise[JsonResponse] = js.native
    
    def searchUsers(options: SearchUserOptions): js.Promise[JsonResponse] = js.native
    
    def setBoardProperty(boardId: String, propertyKey: String, body: String): js.Promise[JsonResponse] = js.native
    
    var strictSSL: Boolean = js.native
    
    def transitionIssue(issueId: String, issueTransition: TransitionObject): js.Promise[JsonResponse] = js.native
    
    def updateComment(issueId: String, commentId: String, comment: String): js.Promise[JsonResponse] = js.native
    def updateComment(issueId: String, commentId: String, comment: String, options: js.Any): js.Promise[JsonResponse] = js.native
    
    def updateIssue(issueId: String, issueUpdate: IssueObject): js.Promise[JsonResponse] = js.native
    def updateIssue(issueId: String, issueUpdate: IssueObject, query: Query): js.Promise[JsonResponse] = js.native
    
    def updateVersion(version: String): js.Promise[JsonResponse] = js.native
    
    def upsertFieldOption(fieldKey: String, optionId: String, option: FieldOptionObject): js.Promise[JsonResponse] = js.native
    
    var webhookVersion: String = js.native
  }
  
  @js.native
  trait JiraApiOptions extends StObject {
    
    var apiVersion: js.UndefOr[String] = js.native
    
    var base: js.UndefOr[String] = js.native
    
    var bearer: js.UndefOr[String] = js.native
    
    var greenhopperVersion: js.UndefOr[String] = js.native
    
    var host: String = js.native
    
    var intermediatePath: js.UndefOr[String] = js.native
    
    var oauth: js.UndefOr[OAuth] = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[String] = js.native
    
    var protocol: js.UndefOr[String] = js.native
    
    var request: js.UndefOr[js.Any] = js.native
    
    var strictSSL: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var username: js.UndefOr[String] = js.native
    
    var webhookVersion: js.UndefOr[String] = js.native
  }
  object JiraApiOptions {
    
    @scala.inline
    def apply(host: String): JiraApiOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[JiraApiOptions]
    }
    
    @scala.inline
    implicit class JiraApiOptionsMutableBuilder[Self <: JiraApiOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      @scala.inline
      def setBearer(value: String): Self = StObject.set(x, "bearer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBearerUndefined: Self = StObject.set(x, "bearer", js.undefined)
      
      @scala.inline
      def setGreenhopperVersion(value: String): Self = StObject.set(x, "greenhopperVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreenhopperVersionUndefined: Self = StObject.set(x, "greenhopperVersion", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntermediatePath(value: String): Self = StObject.set(x, "intermediatePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntermediatePathUndefined: Self = StObject.set(x, "intermediatePath", js.undefined)
      
      @scala.inline
      def setOauth(value: OAuth): Self = StObject.set(x, "oauth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauthUndefined: Self = StObject.set(x, "oauth", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRequest(value: js.Any): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      @scala.inline
      def setWebhookVersion(value: String): Self = StObject.set(x, "webhookVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebhookVersionUndefined: Self = StObject.set(x, "webhookVersion", js.undefined)
    }
  }
  
  type JsonResponse = StringDictionary[js.Any]
  
  type LinkObject = StringDictionary[js.Any]
  
  type NotificationObject = StringDictionary[js.Any]
  
  @js.native
  trait OAuth extends StObject {
    
    var access_token: String = js.native
    
    var access_token_secret: String = js.native
    
    var consumer_key: String = js.native
    
    var consumer_secret: String = js.native
    
    var signature_method: js.UndefOr[String] = js.native
  }
  object OAuth {
    
    @scala.inline
    def apply(access_token: String, access_token_secret: String, consumer_key: String, consumer_secret: String): OAuth = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], access_token_secret = access_token_secret.asInstanceOf[js.Any], consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth]
    }
    
    @scala.inline
    implicit class OAuthMutableBuilder[Self <: OAuth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_token_secret(value: String): Self = StObject.set(x, "access_token_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumer_key(value: String): Self = StObject.set(x, "consumer_key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumer_secret(value: String): Self = StObject.set(x, "consumer_secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature_method(value: String): Self = StObject.set(x, "signature_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature_methodUndefined: Self = StObject.set(x, "signature_method", js.undefined)
    }
  }
  
  type Query = StringDictionary[js.Any]
  
  @js.native
  trait SearchQuery extends StObject {
    
    var expand: js.UndefOr[js.Array[String]] = js.native
    
    var fields: js.UndefOr[js.Array[String]] = js.native
    
    var maxResults: js.UndefOr[Double] = js.native
    
    var startAt: js.UndefOr[Double] = js.native
  }
  object SearchQuery {
    
    @scala.inline
    def apply(): SearchQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchQuery]
    }
    
    @scala.inline
    implicit class SearchQueryMutableBuilder[Self <: SearchQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpand(value: js.Array[String]): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      @scala.inline
      def setExpandVarargs(value: String*): Self = StObject.set(x, "expand", js.Array(value :_*))
      
      @scala.inline
      def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      @scala.inline
      def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
    }
  }
  
  @js.native
  trait SearchUserOptions extends StObject {
    
    var includeActive: js.UndefOr[Boolean] = js.native
    
    var includeInactive: js.UndefOr[Boolean] = js.native
    
    var maxResults: js.UndefOr[Double] = js.native
    
    var startAt: js.UndefOr[Double] = js.native
    
    var username: String = js.native
  }
  object SearchUserOptions {
    
    @scala.inline
    def apply(username: String): SearchUserOptions = {
      val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchUserOptions]
    }
    
    @scala.inline
    implicit class SearchUserOptionsMutableBuilder[Self <: SearchUserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeActive(value: Boolean): Self = StObject.set(x, "includeActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeActiveUndefined: Self = StObject.set(x, "includeActive", js.undefined)
      
      @scala.inline
      def setIncludeInactive(value: Boolean): Self = StObject.set(x, "includeInactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeInactiveUndefined: Self = StObject.set(x, "includeInactive", js.undefined)
      
      @scala.inline
      def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
      
      @scala.inline
      def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  type TransitionObject = StringDictionary[js.Any]
  
  @js.native
  trait UriOptions extends StObject {
    
    var intermediatePath: js.UndefOr[String] = js.native
    
    var pathname: String = js.native
    
    var query: js.UndefOr[Query] = js.native
  }
  object UriOptions {
    
    @scala.inline
    def apply(pathname: String): UriOptions = {
      val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
      __obj.asInstanceOf[UriOptions]
    }
    
    @scala.inline
    implicit class UriOptionsMutableBuilder[Self <: UriOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntermediatePath(value: String): Self = StObject.set(x, "intermediatePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntermediatePathUndefined: Self = StObject.set(x, "intermediatePath", js.undefined)
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
  
  type UserObject = StringDictionary[js.Any]
  
  type WebhookObject = StringDictionary[js.Any]
  
  type WorklogObject = StringDictionary[js.Any]
}
