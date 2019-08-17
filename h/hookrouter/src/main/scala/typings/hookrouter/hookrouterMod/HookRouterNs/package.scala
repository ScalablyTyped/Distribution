package typings.hookrouter.hookrouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HookRouterNs {
  import org.scalablytyped.runtime.StringDictionary

  type InterceptedPath = String | Null
  type QueryParams = StringDictionary[js.Any]
  type RouteObject = StringDictionary[js.Function1[/* params */ QueryParams, js.Any]]
}
