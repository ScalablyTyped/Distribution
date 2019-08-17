package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DeferredIndexNs {
  import typings.knex.knexMod.DeferredKeySelectionNs.AddKey
  import typings.knex.knexMod.DeferredKeySelectionNs.SetBase
  import typings.knex.knexMod.DeferredKeySelectionNs.SetSingle
  import typings.knex.knexNumbers.`true`

  type Augment[T, TBase, TKey /* <: String */, TAliasMapping] = SetSingle[AddKey[SetBase[T, TBase], TKey], `true`]
}
