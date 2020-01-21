package typings.knex.mod

import typings.knex.knexBooleans.`true`
import typings.knex.mod.DeferredKeySelection.AddKey
import typings.knex.mod.DeferredKeySelection.SetBase
import typings.knex.mod.DeferredKeySelection.SetSingle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knex", "DeferredIndex")
@js.native
object DeferredIndex extends js.Object {
  type Augment[T, TBase, TKey /* <: String */, TAliasMapping] = SetSingle[AddKey[SetBase[T, TBase], TKey], `true`]
}

