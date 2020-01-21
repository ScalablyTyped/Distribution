package typings.jestTypes.circusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jestTypes.jestTypesStrings.afterEach
  - typings.jestTypes.jestTypesStrings.beforeEach
  - typings.jestTypes.jestTypesStrings.afterAll
  - typings.jestTypes.jestTypesStrings.beforeAll
*/
trait HookType extends js.Object

object HookType {
  @scala.inline
  def afterAll: typings.jestTypes.jestTypesStrings.afterAll = this.cast("afterAll")
  @scala.inline
  def afterEach: typings.jestTypes.jestTypesStrings.afterEach = this.cast("afterEach")
  @scala.inline
  def beforeAll: typings.jestTypes.jestTypesStrings.beforeAll = this.cast("beforeAll")
  @scala.inline
  def beforeEach: typings.jestTypes.jestTypesStrings.beforeEach = this.cast("beforeEach")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

