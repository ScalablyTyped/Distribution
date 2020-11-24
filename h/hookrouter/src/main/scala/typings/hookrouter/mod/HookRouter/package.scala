package typings.hookrouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object HookRouter {
  
  type InterceptedPath = java.lang.String | scala.Null
  
  type QueryParams = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type RouteObject[T] = org.scalablytyped.runtime.StringDictionary[js.Function1[/* params */ typings.hookrouter.mod.HookRouter.QueryParams, T]]
}
