package typings.atJestTypes.buildCircusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atJestTypes.atJestTypesStrings.afterAll
  - typings.atJestTypes.atJestTypesStrings.beforeAll
*/
trait SharedHookType extends js.Object

object SharedHookType {
  @scala.inline
  def afterAll: typings.atJestTypes.atJestTypesStrings.afterAll = this.cast("afterAll")
  @scala.inline
  def beforeAll: typings.atJestTypes.atJestTypesStrings.beforeAll = this.cast("beforeAll")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

