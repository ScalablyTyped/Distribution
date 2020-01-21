package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceServicesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Include services consumed by the specified consumer.  The Google Service
    * Management implementation accepts the following forms: -
    * project:<project_id>
    */
  var consumerId: js.UndefOr[String] = js.native
  /**
    * The max number of items to include in the response list. Page size is 50
    * if not specified. Maximum value is 100.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Token identifying which result to start with; returned by a previous list
    * call.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Include services produced by the specified project.
    */
  var producerProjectId: js.UndefOr[String] = js.native
}

