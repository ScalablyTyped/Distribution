package typings.knex

import typings.knex.knexMod.AreKeysOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object knexNumbers {
  @js.native
  sealed trait `false`
    extends AreKeysOf[js.Any, js.Any]
  
  @js.native
  sealed trait `true`
    extends AreKeysOf[js.Any, js.Any]
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

