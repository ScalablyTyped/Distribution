package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Chainable interface
//
/* Rewritten from type alias, can be one of: 
  - typings.knex.knexStrings.`then`
  - typings.knex.knexStrings.`catch`
  - typings.knex.knexStrings.`finally`
*/
trait ExposedPromiseKeys extends js.Object

object ExposedPromiseKeys {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `catch`: typings.knex.knexStrings.`catch` = this.cast("catch")
  @scala.inline
  def `finally`: typings.knex.knexStrings.`finally` = this.cast("finally")
  @scala.inline
  def `then`: typings.knex.knexStrings.`then` = this.cast("then")
}

