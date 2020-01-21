package typings.hapiBell

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AuthedRequest = js.Function2[
    /* uri */ java.lang.String, 
    /* params */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]], 
    js.Promise[js.Object]
  ]
  type ProfileGetter[C /* <: typings.hapiBell.mod.Credentials */] = js.ThisFunction3[
    /* this */ typings.hapiBell.mod.CustomProviderOptions, 
    /* credentials */ C, 
    /* params */ org.scalablytyped.runtime.StringDictionary[java.lang.String], 
    /* get */ typings.hapiBell.mod.AuthedRequest, 
    js.Promise[scala.Unit]
  ]
  type RequestPassThrough = js.Function1[
    /* request */ typings.hapiHapi.mod.Request, 
    js.Thenable[typings.hapiHapi.mod.AuthCredentials] | typings.hapiHapi.mod.AuthCredentials
  ]
  type StringLikeMap = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
}
