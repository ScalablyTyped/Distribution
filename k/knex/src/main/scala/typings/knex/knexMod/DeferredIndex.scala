package typings.knex.knexMod

import typings.knex.knexBooleans.`true`
import typings.knex.knexMod.DeferredKeySelection.AddKey
import typings.knex.knexMod.DeferredKeySelection.SetBase
import typings.knex.knexMod.DeferredKeySelection.SetSingle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knex", "DeferredIndex")
@js.native
object DeferredIndex extends js.Object {
  type Augment[T, TBase, TKey /* <: String */, TAliasMapping] = SetSingle[AddKey[SetBase[T, TBase], TKey], `true`]
}

