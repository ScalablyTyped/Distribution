package typings
package jiraDashClientLib.jiraDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JiraApi extends js.Object {
  var apiVersion: java.lang.String = js.native
  var base: java.lang.String = js.native
  var greenhopperVersion: java.lang.String = js.native
  var host: java.lang.String = js.native
  var intermediatePath: js.UndefOr[java.lang.String] = js.native
  var port: java.lang.String | scala.Null = js.native
  var protocol: java.lang.String = js.native
  var strictSSL: scala.Boolean = js.native
  var webhookVersion: java.lang.String = js.native
  def addAttachmentOnIssue(issueId: java.lang.String, readStream: nodeLib.fsMod.ReadStream): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def addComment(issueId: java.lang.String, comment: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def addIssueToSprint(issueId: java.lang.String, sprintId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def addNewComponent(component: jiraDashClientLib.jiraDashClientMod.JiraApiNs.ComponentObject): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def addNewIssue(issue: jiraDashClientLib.jiraDashClientMod.JiraApiNs.IssueObject): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def addWatcher(issueKey: java.lang.String, username: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def addWorklog(
    issueId: java.lang.String,
    worklog: jiraDashClientLib.jiraDashClientMod.JiraApiNs.WorklogObject,
    newEstimate: jiraDashClientLib.jiraDashClientMod.JiraApiNs.EstimateObject
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def createBoard(boardBody: jiraDashClientLib.jiraDashClientMod.JiraApiNs.BoardObject): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def createCustomField(field: jiraDashClientLib.jiraDashClientMod.JiraApiNs.FieldObject): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def createFieldOption(
    fieldKey: java.lang.String,
    option: jiraDashClientLib.jiraDashClientMod.JiraApiNs.FieldOptionObject
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def createProject(project: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def createRemoteLink(
    issueNumber: java.lang.String,
    remoteLink: jiraDashClientLib.jiraDashClientMod.JiraApiNs.LinkObject
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def createUser(user: jiraDashClientLib.jiraDashClientMod.JiraApiNs.UserObject): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def createVersion(version: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def deleteBoard(boardId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def deleteBoardProperty(boardId: java.lang.String, propertyKey: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def deleteComponent(componentId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def deleteFieldOption(fieldKey: java.lang.String, optionId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def deleteIssue(issueId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def deleteVersion(
    versionId: java.lang.String,
    moveFixIssuesToId: java.lang.String,
    moveAffectedIssuesToId: java.lang.String
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def deleteWebhook(webhookID: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def deleteWorklog(issueId: java.lang.String, worklogId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  /* private */ def doRequest(requestOptions: requestLib.requestMod.requestNs.CoreOptions): js.Promise[requestLib.requestMod.requestNs.RequestResponse] = js.native
  def findIssue(issueNumber: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def findIssue(issueNumber: java.lang.String, expand: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def findIssue(issueNumber: java.lang.String, expand: java.lang.String, fields: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def findIssue(
    issueNumber: java.lang.String,
    expand: java.lang.String,
    fields: java.lang.String,
    properties: java.lang.String
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def findIssue(
    issueNumber: java.lang.String,
    expand: java.lang.String,
    fields: java.lang.String,
    properties: java.lang.String,
    fieldsByKeys: scala.Boolean
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def findRapidView(projectName: java.lang.String): js.Promise[js.Array[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse]] = js.native
  def getAllBoards(): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getAllBoards(startAt: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getAllBoards(startAt: scala.Double, maxResults: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getAllBoards(startAt: scala.Double, maxResults: scala.Double, `type`: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getAllBoards(startAt: scala.Double, maxResults: scala.Double, `type`: java.lang.String, name: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getAllBoards(
    startAt: scala.Double,
    maxResults: scala.Double,
    `type`: java.lang.String,
    name: java.lang.String,
    projectKeyOrId: java.lang.String
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getAllSprints(boardId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getAllSprints(boardId: java.lang.String, startAt: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getAllSprints(boardId: java.lang.String, startAt: scala.Double, maxResults: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  @JSName("getAllSprints")
  def getAllSprints_active(
    boardId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    state: jiraDashClientLib.jiraDashClientLibStrings.active
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  @JSName("getAllSprints")
  def getAllSprints_closed(
    boardId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    state: jiraDashClientLib.jiraDashClientLibStrings.closed
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  @JSName("getAllSprints")
  def getAllSprints_future(
    boardId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    state: jiraDashClientLib.jiraDashClientLibStrings.future
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getAllVersions(boardId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getAllVersions(boardId: java.lang.String, startAt: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getAllVersions(boardId: java.lang.String, startAt: scala.Double, maxResults: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  @JSName("getAllVersions")
  def getAllVersions_false(
    boardId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    released: jiraDashClientLib.jiraDashClientLibStrings.`false`
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  @JSName("getAllVersions")
  def getAllVersions_true(
    boardId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    released: jiraDashClientLib.jiraDashClientLibStrings.`true`
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBacklogForRapidView(rapidViewId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBoard(boardId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBoardIssuesForEpic(boardId: java.lang.String, epicId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBoardIssuesForEpic(boardId: java.lang.String, epicId: java.lang.String, startAt: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBoardIssuesForEpic(
    boardId: java.lang.String,
    epicId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBoardIssuesForEpic(
    boardId: java.lang.String,
    epicId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    jql: java.lang.String
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBoardIssuesForEpic(
    boardId: java.lang.String,
    epicId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    jql: java.lang.String,
    validateQuery: scala.Boolean
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBoardIssuesForEpic(
    boardId: java.lang.String,
    epicId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    jql: java.lang.String,
    validateQuery: scala.Boolean,
    fields: java.lang.String
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBoardIssuesForSprint(boardId: java.lang.String, sprintId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBoardIssuesForSprint(boardId: java.lang.String, sprintId: java.lang.String, startAt: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBoardIssuesForSprint(
    boardId: java.lang.String,
    sprintId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBoardIssuesForSprint(
    boardId: java.lang.String,
    sprintId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    jql: java.lang.String
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBoardIssuesForSprint(
    boardId: java.lang.String,
    sprintId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    jql: java.lang.String,
    validateQuery: scala.Boolean
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBoardIssuesForSprint(
    boardId: java.lang.String,
    sprintId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    jql: java.lang.String,
    validateQuery: scala.Boolean,
    fields: java.lang.String
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBoardPropertiesKeys(boardId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getBoardProperty(boardId: java.lang.String, propertyKey: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getConfiguration(boardId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getCurrentUser(): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getDevStatusDetail(issueId: java.lang.String, applicationType: java.lang.String, dataType: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getDevStatusSummary(issueId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getEpics(boardId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getEpics(boardId: java.lang.String, startAt: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getEpics(boardId: java.lang.String, startAt: scala.Double, maxResults: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  @JSName("getEpics")
  def getEpics_false(
    boardId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    done: jiraDashClientLib.jiraDashClientLibStrings.`false`
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  @JSName("getEpics")
  def getEpics_true(
    boardId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    done: jiraDashClientLib.jiraDashClientLibStrings.`true`
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getFieldOption(fieldKey: java.lang.String, optionId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getIssueProperty(issueNumber: java.lang.String, property: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getIssuesForBacklog(boardId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getIssuesForBacklog(boardId: java.lang.String, startAt: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getIssuesForBacklog(boardId: java.lang.String, startAt: scala.Double, maxResults: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getIssuesForBacklog(boardId: java.lang.String, startAt: scala.Double, maxResults: scala.Double, jql: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getIssuesForBacklog(
    boardId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    jql: java.lang.String,
    validateQuery: scala.Boolean
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getIssuesForBacklog(
    boardId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    jql: java.lang.String,
    validateQuery: scala.Boolean,
    fields: java.lang.String
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getIssuesForBoard(boardId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getIssuesForBoard(boardId: java.lang.String, startAt: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getIssuesForBoard(boardId: java.lang.String, startAt: scala.Double, maxResults: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getIssuesForBoard(boardId: java.lang.String, startAt: scala.Double, maxResults: scala.Double, jql: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getIssuesForBoard(
    boardId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    jql: java.lang.String,
    validateQuery: scala.Boolean
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getIssuesForBoard(
    boardId: java.lang.String,
    startAt: scala.Double,
    maxResults: scala.Double,
    jql: java.lang.String,
    validateQuery: scala.Boolean,
    fields: java.lang.String
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getLastSprintForRapidView(rapidViewId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getProject(project: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getProjects(boardId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getProjects(boardId: java.lang.String, startAt: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getProjects(boardId: java.lang.String, startAt: scala.Double, maxResults: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getProjectsFull(boardId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getRemoteLinks(issueNumber: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getSprintIssues(rapidViewId: java.lang.String, sprintId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getUnresolvedIssueCount(version: java.lang.String): js.Promise[scala.Double] = js.native
  def getUsersInGroup(groupname: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getUsersInGroup(groupname: java.lang.String, startAt: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getUsersInGroup(groupname: java.lang.String, startAt: scala.Double, maxResults: scala.Double): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getVersions(project: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def getWebhook(webhookID: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def issueLink(link: jiraDashClientLib.jiraDashClientMod.JiraApiNs.LinkObject): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def issueNotify(
    issueId: java.lang.String,
    notificationBody: jiraDashClientLib.jiraDashClientMod.JiraApiNs.NotificationObject
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def listComponents(project: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def listFieldOptions(fieldKey: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def listFields(): js.Promise[js.Array[jiraDashClientLib.jiraDashClientMod.JiraApiNs.FieldObject]] = js.native
  def listIssueTypes(): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def listPriorities(): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def listProjects(): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def listSprints(rapidViewId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def listStatus(): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def listTransitions(issueId: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def listWebhooks(): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  /* private */ def makeAgileUri(options: jiraDashClientLib.jiraDashClientMod.JiraApiNs.UriOptions): java.lang.String = js.native
  /* private */ def makeDevStatusUri(options: jiraDashClientLib.jiraDashClientMod.JiraApiNs.UriOptions): java.lang.String = js.native
  /* private */ def makeRequestHeader(uri: java.lang.String): js.Any = js.native
  /* private */ def makeRequestHeader(uri: java.lang.String, options: jiraDashClientLib.jiraDashClientMod.JiraApiNs.UriOptions): js.Any = js.native
  /* private */ def makeSprintQueryUri(options: jiraDashClientLib.jiraDashClientMod.JiraApiNs.UriOptions): java.lang.String = js.native
  /* private */ def makeUri(options: jiraDashClientLib.jiraDashClientMod.JiraApiNs.UriOptions): java.lang.String = js.native
  /* private */ def makeWebhookUri(options: jiraDashClientLib.jiraDashClientMod.JiraApiNs.UriOptions): java.lang.String = js.native
  def moveToBacklog(issues: js.Array[java.lang.String]): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def registerWebhook(webhook: jiraDashClientLib.jiraDashClientMod.JiraApiNs.WebhookObject): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def searchJira(searchString: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def searchJira(
    searchString: java.lang.String,
    optional: jiraDashClientLib.jiraDashClientMod.JiraApiNs.SearchQuery
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def searchUsers(options: jiraDashClientLib.jiraDashClientMod.JiraApiNs.SearchUserOptions): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def setBoardProperty(boardId: java.lang.String, propertyKey: java.lang.String, body: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def transitionIssue(
    issueId: java.lang.String,
    issueTransition: jiraDashClientLib.jiraDashClientMod.JiraApiNs.TransitionObject
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def updateComment(issueId: java.lang.String, commentId: java.lang.String, comment: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def updateComment(issueId: java.lang.String, commentId: java.lang.String, comment: java.lang.String, options: js.Any): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def updateIssue(issueId: java.lang.String, issueUpdate: jiraDashClientLib.jiraDashClientMod.JiraApiNs.IssueObject): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def updateVersion(version: java.lang.String): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
  def upsertFieldOption(
    fieldKey: java.lang.String,
    optionId: java.lang.String,
    option: jiraDashClientLib.jiraDashClientMod.JiraApiNs.FieldOptionObject
  ): js.Promise[jiraDashClientLib.jiraDashClientMod.JiraApiNs.JsonResponse] = js.native
}

