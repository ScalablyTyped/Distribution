package typings.knex.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.knex.knexStrings.Equalssign
  - typings.knex.knexStrings.Greaterthansign
  - typings.knex.knexStrings.GreaterthansignEqualssign
  - typings.knex.knexStrings.Lessthansign
  - typings.knex.knexStrings.LessthansignEqualssign
  - typings.knex.knexStrings.LessthansignGreaterthansign
*/
trait ComparisionOperator extends js.Object

object ComparisionOperator {
  @scala.inline
  def Equalssign: typings.knex.knexStrings.Equalssign = this.cast("=")
  @scala.inline
  def Greaterthansign: typings.knex.knexStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typings.knex.knexStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typings.knex.knexStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typings.knex.knexStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def LessthansignGreaterthansign: typings.knex.knexStrings.LessthansignGreaterthansign = this.cast("<>")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

