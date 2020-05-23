package typings.keystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Access = scala.Boolean | typings.keystonejsKeystone.mod.AccessCallback | typings.keystonejsKeystone.anon.Auth
  type AccessCallback = js.Function1[
    /* context */ typings.keystonejsKeystone.mod.AuthenticationContext, 
    scala.Boolean | typings.keystonejsKeystone.mod.GraphQLWhereClause
  ]
  /**
    * Lists
    */
  type DefaultValueFunction = js.Function0[js.Any]
  type GraphQLWhereClause = org.scalablytyped.runtime.StringDictionary[js.Any]
  type KeyValues[Keys /* <: java.lang.String */, Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]: Values}
    */ typings.keystonejsKeystone.keystonejsKeystoneStrings.KeyValues with org.scalablytyped.runtime.TopLevel[js.Any]
  type Plugin = js.Any
}
