package typings.jiraDashClient.jiraDashClientMod

import typings.jiraDashClient.jiraDashClientStrings.`false`
import typings.jiraDashClient.jiraDashClientStrings.`true`
import typings.jiraDashClient.jiraDashClientStrings.active
import typings.jiraDashClient.jiraDashClientStrings.closed
import typings.jiraDashClient.jiraDashClientStrings.future
import typings.node.fsMod.ReadStream
import typings.request.requestMod.CoreOptions
import typings.request.requestMod.RequestResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JiraApi extends js.Object {
  var apiVersion: String = js.native
  var base: String = js.native
  var greenhopperVersion: String = js.native
  var host: String = js.native
  var intermediatePath: js.UndefOr[String] = js.native
  var port: String | Null = js.native
  var protocol: String = js.native
  var strictSSL: Boolean = js.native
  var webhookVersion: String = js.native
  def addAttachmentOnIssue(issueId: String, readStream: ReadStream): js.Promise[JsonResponse] = js.native
  def addComment(issueId: String, comment: String): js.Promise[JsonResponse] = js.native
  def addIssueToSprint(issueId: String, sprintId: String): js.Promise[JsonResponse] = js.native
  def addNewComponent(component: ComponentObject): js.Promise[JsonResponse] = js.native
  def addNewIssue(issue: IssueObject): js.Promise[JsonResponse] = js.native
  def addWatcher(issueKey: String, username: String): js.Promise[JsonResponse] = js.native
  def addWorklog(issueId: String, worklog: WorklogObject): js.Promise[JsonResponse] = js.native
  def addWorklog(issueId: String, worklog: WorklogObject, newEstimate: EstimateObject): js.Promise[JsonResponse] = js.native
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
  def findRapidView(projectName: String): js.Promise[js.Array[JsonResponse]] = js.native
  def getAllBoards(): js.Promise[JsonResponse] = js.native
  def getAllBoards(startAt: Double): js.Promise[JsonResponse] = js.native
  def getAllBoards(startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
  def getAllBoards(startAt: Double, maxResults: Double, `type`: String): js.Promise[JsonResponse] = js.native
  def getAllBoards(startAt: Double, maxResults: Double, `type`: String, name: String): js.Promise[JsonResponse] = js.native
  def getAllBoards(startAt: Double, maxResults: Double, `type`: String, name: String, projectKeyOrId: String): js.Promise[JsonResponse] = js.native
  def getAllSprints(boardId: String): js.Promise[JsonResponse] = js.native
  def getAllSprints(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
  def getAllSprints(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
  @JSName("getAllSprints")
  def getAllSprints_active(boardId: String, startAt: Double, maxResults: Double, state: active): js.Promise[JsonResponse] = js.native
  @JSName("getAllSprints")
  def getAllSprints_closed(boardId: String, startAt: Double, maxResults: Double, state: closed): js.Promise[JsonResponse] = js.native
  @JSName("getAllSprints")
  def getAllSprints_future(boardId: String, startAt: Double, maxResults: Double, state: future): js.Promise[JsonResponse] = js.native
  def getAllVersions(boardId: String): js.Promise[JsonResponse] = js.native
  def getAllVersions(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
  def getAllVersions(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
  @JSName("getAllVersions")
  def getAllVersions_false(boardId: String, startAt: Double, maxResults: Double, released: `false`): js.Promise[JsonResponse] = js.native
  @JSName("getAllVersions")
  def getAllVersions_true(boardId: String, startAt: Double, maxResults: Double, released: `true`): js.Promise[JsonResponse] = js.native
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
  def getBoardPropertiesKeys(boardId: String): js.Promise[JsonResponse] = js.native
  def getBoardProperty(boardId: String, propertyKey: String): js.Promise[JsonResponse] = js.native
  def getConfiguration(boardId: String): js.Promise[JsonResponse] = js.native
  def getCurrentUser(): js.Promise[JsonResponse] = js.native
  def getDevStatusDetail(issueId: String, applicationType: String, dataType: String): js.Promise[JsonResponse] = js.native
  def getDevStatusSummary(issueId: String): js.Promise[JsonResponse] = js.native
  def getEpics(boardId: String): js.Promise[JsonResponse] = js.native
  def getEpics(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
  def getEpics(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
  @JSName("getEpics")
  def getEpics_false(boardId: String, startAt: Double, maxResults: Double, done: `false`): js.Promise[JsonResponse] = js.native
  @JSName("getEpics")
  def getEpics_true(boardId: String, startAt: Double, maxResults: Double, done: `true`): js.Promise[JsonResponse] = js.native
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
  def getLastSprintForRapidView(rapidViewId: String): js.Promise[JsonResponse] = js.native
  def getProject(project: String): js.Promise[JsonResponse] = js.native
  def getProjects(boardId: String): js.Promise[JsonResponse] = js.native
  def getProjects(boardId: String, startAt: Double): js.Promise[JsonResponse] = js.native
  def getProjects(boardId: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
  def getProjectsFull(boardId: String): js.Promise[JsonResponse] = js.native
  def getRemoteLinks(issueNumber: String): js.Promise[JsonResponse] = js.native
  def getSprintIssues(rapidViewId: String, sprintId: String): js.Promise[JsonResponse] = js.native
  def getUnresolvedIssueCount(version: String): js.Promise[Double] = js.native
  def getUsersInGroup(groupname: String): js.Promise[JsonResponse] = js.native
  def getUsersInGroup(groupname: String, startAt: Double): js.Promise[JsonResponse] = js.native
  def getUsersInGroup(groupname: String, startAt: Double, maxResults: Double): js.Promise[JsonResponse] = js.native
  def getVersions(project: String): js.Promise[JsonResponse] = js.native
  def getWebhook(webhookID: String): js.Promise[JsonResponse] = js.native
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
  def registerWebhook(webhook: WebhookObject): js.Promise[JsonResponse] = js.native
  def searchJira(searchString: String): js.Promise[JsonResponse] = js.native
  def searchJira(searchString: String, optional: SearchQuery): js.Promise[JsonResponse] = js.native
  def searchUsers(options: SearchUserOptions): js.Promise[JsonResponse] = js.native
  def setBoardProperty(boardId: String, propertyKey: String, body: String): js.Promise[JsonResponse] = js.native
  def transitionIssue(issueId: String, issueTransition: TransitionObject): js.Promise[JsonResponse] = js.native
  def updateComment(issueId: String, commentId: String, comment: String): js.Promise[JsonResponse] = js.native
  def updateComment(issueId: String, commentId: String, comment: String, options: js.Any): js.Promise[JsonResponse] = js.native
  def updateIssue(issueId: String, issueUpdate: IssueObject): js.Promise[JsonResponse] = js.native
  def updateIssue(issueId: String, issueUpdate: IssueObject, query: Query): js.Promise[JsonResponse] = js.native
  def updateVersion(version: String): js.Promise[JsonResponse] = js.native
  def upsertFieldOption(fieldKey: String, optionId: String, option: FieldOptionObject): js.Promise[JsonResponse] = js.native
}

