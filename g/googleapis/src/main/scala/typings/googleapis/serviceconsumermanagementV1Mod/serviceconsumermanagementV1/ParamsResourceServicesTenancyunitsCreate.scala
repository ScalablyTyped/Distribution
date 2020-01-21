package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceServicesTenancyunitsCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * services/{service}/{collection id}/{resource id} {collection id} is the
    * cloud resource collection type representing the service consumer, for
    * example 'projects', or 'organizations'. {resource id} is the consumer
    * numeric id, such as project number: '123456'. {service} the name of a
    * managed service, such as 'service.googleapis.com'. Enables service
    * binding using the new tenancy unit.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCreateTenancyUnitRequest] = js.native
}

