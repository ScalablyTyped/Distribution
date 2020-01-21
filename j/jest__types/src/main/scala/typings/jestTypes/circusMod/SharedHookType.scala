package typings.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jestTypes.jestTypesStrings.afterAll
  - typings.jestTypes.jestTypesStrings.beforeAll
*/
trait SharedHookType extends js.Object

object SharedHookType {
  @scala.inline
  def afterAll: typings.jestTypes.jestTypesStrings.afterAll = this.cast("afterAll")
  @scala.inline
  def beforeAll: typings.jestTypes.jestTypesStrings.beforeAll = this.cast("beforeAll")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

