package typings.grasp.graspMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.grasp.graspStrings.squery
  - typings.grasp.graspStrings.equery
*/
trait QueryEngineType extends js.Object

object QueryEngineType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def equery: typings.grasp.graspStrings.equery = this.cast("equery")
  @scala.inline
  def squery: typings.grasp.graspStrings.squery = this.cast("squery")
}

