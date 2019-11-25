package typings.atJestTypes.buildCircusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atJestTypes.atJestTypesStrings.afterEach
  - typings.atJestTypes.atJestTypesStrings.beforeEach
  - typings.atJestTypes.atJestTypesStrings.afterAll
  - typings.atJestTypes.atJestTypesStrings.beforeAll
*/
trait HookType extends js.Object

object HookType {
  @scala.inline
  def afterAll: typings.atJestTypes.atJestTypesStrings.afterAll = this.cast("afterAll")
  @scala.inline
  def afterEach: typings.atJestTypes.atJestTypesStrings.afterEach = this.cast("afterEach")
  @scala.inline
  def beforeAll: typings.atJestTypes.atJestTypesStrings.beforeAll = this.cast("beforeAll")
  @scala.inline
  def beforeEach: typings.atJestTypes.atJestTypesStrings.beforeEach = this.cast("beforeEach")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

