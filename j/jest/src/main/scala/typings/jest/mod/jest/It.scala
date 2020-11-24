package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a test closure
  */
@js.native
trait It extends js.Object {
  
  /**
    * Creates a test closure.
    *
    * @param name The name of your test
    * @param fn The function for your test
    * @param timeout The timeout for an async function test
    */
  def apply(name: String): Unit = js.native
  def apply(name: String, fn: js.UndefOr[scala.Nothing], timeout: Double): Unit = js.native
  def apply(name: String, fn: ProvidesCallback): Unit = js.native
  def apply(name: String, fn: ProvidesCallback, timeout: Double): Unit = js.native
  
  /**
    * Experimental and should be avoided.
    */
  var concurrent: It = js.native
  
  /**
    * Use if you keep duplicating the same test with different data. `.each` allows you to write the
    * test once and pass data in.
    *
    * `.each` is available with two APIs:
    *
    * #### 1  `test.each(table)(name, fn)`
    *
    * - `table`: Array of Arrays with the arguments that are passed into the test fn for each row.
    * - `name`: String the title of the test block.
    * - `fn`: Function the test to be ran, this is the function that will receive the parameters in each row as function arguments.
    *
    *
    * #### 2  `test.each table(name, fn)`
    *
    * - `table`: Tagged Template Literal
    * - `name`: String the title of the test, use `$variable` to inject test data into the test title from the tagged template expressions.
    * - `fn`: Function the test to be ran, this is the function that will receive the test data object..
    *
    * @example
    *
    * // API 1
    * test.each([[1, 1, 2], [1, 2, 3], [2, 1, 3]])(
    *   '.add(%i, %i)',
    *   (a, b, expected) => {
    *     expect(a + b).toBe(expected);
    *   },
    * );
    *
    * // API 2
    * test.each`
    * a    | b    | expected
    * ${1} | ${1} | ${2}
    * ${1} | ${2} | ${3}
    * ${2} | ${1} | ${3}
    * `('returns $expected when $a is added $b', ({a, b, expected}) => {
    *    expect(a + b).toBe(expected);
    * });
    *
    */
  var each: Each = js.native
  
  /**
    * Only runs this test in the current file.
    */
  var only: It = js.native
  
  /**
    * Skips running this test in the current file.
    */
  var skip: It = js.native
  
  /**
    * Sketch out which tests to write in the future.
    */
  var todo: It = js.native
}
