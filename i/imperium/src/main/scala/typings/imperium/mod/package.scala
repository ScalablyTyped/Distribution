package typings.imperium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Actions = js.Array[java.lang.String] | java.lang.String
  type Context_ = js.Array[
    typings.imperium.imperiumStrings.params | typings.imperium.imperiumStrings.query | typings.imperium.imperiumStrings.headers | typings.imperium.imperiumStrings.body
  ]
  type GetAcl = js.Function1[
    /* req */ typings.express.mod.Request_[
      typings.expressServeStaticCore.mod.ParamsDictionary, 
      js.Any, 
      js.Any, 
      typings.expressServeStaticCore.mod.Query
    ], 
    js.Promise[scala.Boolean | js.Object]
  ]
  type RoleParams = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Roles_ = org.scalablytyped.runtime.StringDictionary[typings.imperium.mod.RoleActions]
}
