package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.knex.knexStrings.`=`
  - typings.knex.knexStrings.`>`
  - typings.knex.knexStrings.`>=`
  - typings.knex.knexStrings.`<`
  - typings.knex.knexStrings.`<=`
  - typings.knex.knexStrings.`<>`
*/
trait ComparisionOperator extends js.Object

object ComparisionOperator {
  @scala.inline
  def `<`: typings.knex.knexStrings.`<` = this.cast("<")
  @scala.inline
  def `<=`: typings.knex.knexStrings.`<=` = this.cast("<=")
  @scala.inline
  def `<>`: typings.knex.knexStrings.`<>` = this.cast("<>")
  @scala.inline
  def `=`: typings.knex.knexStrings.`=` = this.cast("=")
  @scala.inline
  def `>`: typings.knex.knexStrings.`>` = this.cast(">")
  @scala.inline
  def `>=`: typings.knex.knexStrings.`>=` = this.cast(">=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

