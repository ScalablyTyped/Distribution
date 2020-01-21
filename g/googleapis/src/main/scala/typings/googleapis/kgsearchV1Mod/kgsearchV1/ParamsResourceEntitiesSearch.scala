package typings.googleapis.kgsearchV1Mod.kgsearchV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceEntitiesSearch extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The list of entity id to be used for search instead of query string. To
    * specify multiple ids in the HTTP request, repeat the parameter in the URL
    * as in ...?ids=A&ids=B
    */
  var ids: js.UndefOr[js.Array[String]] = js.native
  /**
    * Enables indenting of json results.
    */
  var indent: js.UndefOr[Boolean] = js.native
  /**
    * The list of language codes (defined in ISO 693) to run the query with,
    * e.g. 'en'.
    */
  var languages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Limits the number of entities to be returned.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Enables prefix match against names and aliases of entities
    */
  var prefix: js.UndefOr[Boolean] = js.native
  /**
    * The literal query string for search.
    */
  var query: js.UndefOr[String] = js.native
  /**
    * Restricts returned entities with these types, e.g. Person (as defined in
    * http://schema.org/Person). If multiple types are specified, returned
    * entities will contain one or more of these types.
    */
  var types: js.UndefOr[js.Array[String]] = js.native
}

