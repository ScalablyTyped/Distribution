package typings.atKeystonejsKeystone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atKeystonejsKeystoneMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atKeystonejsKeystone.Anon_AddFieldValidationError
  import typings.atKeystonejsKeystone.Anon_Auth
  import typings.std.Partial

  type Access = Boolean | AccessCallback | Anon_Auth
  type AccessCallback = js.Function1[/* context */ AuthenticationContext, Boolean | GraphQLWhereClause]
  type GraphQLWhereClause = StringDictionary[js.Any]
  type Hooks = Partial[Anon_AddFieldValidationError]
  type KeyValues[Keys /* <: String */, Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Keys ]: Values}
    */ typings.atKeystonejsKeystone.atKeystonejsKeystoneStrings.KeyValues with js.Any
  type Plugin = js.Any
}
