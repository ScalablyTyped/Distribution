package typings.atHapiBell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiBellMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atHapiHapi.atHapiHapiMod.AuthCredentials
  import typings.atHapiHapi.atHapiHapiMod.Request

  type AuthedRequest = js.Function2[
    /* uri */ String, 
    /* params */ js.UndefOr[StringDictionary[String]], 
    js.Promise[js.Object]
  ]
  type ProfileGetter[C /* <: Credentials */] = js.ThisFunction3[
    /* this */ CustomProviderOptions, 
    /* credentials */ C, 
    /* params */ StringDictionary[String], 
    /* get */ AuthedRequest, 
    js.Promise[Unit]
  ]
  type RequestPassThrough = js.Function1[/* request */ Request, js.Thenable[AuthCredentials] | AuthCredentials]
  type StringLikeMap = StringDictionary[String | Double]
}
