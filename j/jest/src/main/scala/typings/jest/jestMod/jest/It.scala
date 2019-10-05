package typings.jest.jestMod.jest

import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a test closure
  */
@js.native
trait It extends js.Object {
  /**
    * Experimental and should be avoided.
    */
  @JSName("concurrent")
  var concurrent_Original: It = js.native
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
  @JSName("each")
  var each_Original: Each = js.native
  /**
    * Only runs this test in the current file.
    */
  @JSName("only")
  var only_Original: It = js.native
  /**
    * Skips running this test in the current file.
    */
  @JSName("skip")
  var skip_Original: It = js.native
  /**
    * Sketch out which tests to write in the future.
    */
  @JSName("todo")
  var todo_Original: It = js.native
  /**
    * Creates a test closure.
    *
    * @param name The name of your test
    * @param fn The function for your test
    * @param timeout The timeout for an async function test
    */
  def apply(name: String): Unit = js.native
  def apply(name: String, fn: ProvidesCallback): Unit = js.native
  def apply(name: String, fn: ProvidesCallback, timeout: Double): Unit = js.native
  /**
    * Creates a test closure.
    *
    * @param name The name of your test
    * @param fn The function for your test
    * @param timeout The timeout for an async function test
    */
  /**
    * Experimental and should be avoided.
    */
  def concurrent(name: String): Unit = js.native
  def concurrent(name: String, fn: ProvidesCallback): Unit = js.native
  def concurrent(name: String, fn: ProvidesCallback, timeout: Double): Unit = js.native
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
  def each(cases: js.Array[js.Array[_]]): js.Function3[
    /* name */ String, 
    /* fn */ js.Function1[/* repeated */ js.Any, _], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
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
  def each(strings: TemplateStringsArray, placeholders: js.Any*): js.Function3[
    /* name */ String, 
    /* fn */ js.Function1[/* arg */ js.Any, _], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
  // Not arrays.
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
  @JSName("each")
  def each_T[T](cases: js.Array[T]): js.Function3[
    /* name */ String, 
    /* fn */ js.Function1[/* repeated */ T, _], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
  // Exclusively arrays.
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
  @JSName("each")
  def each_T_ArrayWildcard[T /* <: js.Array[_] */](cases: js.Array[T]): js.Function3[
    /* name */ String, 
    /* fn */ js.Function1[/* args */ T, _], 
    /* timeout */ js.UndefOr[Double], 
    Unit
  ] = js.native
  /**
    * Creates a test closure.
    *
    * @param name The name of your test
    * @param fn The function for your test
    * @param timeout The timeout for an async function test
    */
  /**
    * Only runs this test in the current file.
    */
  def only(name: String): Unit = js.native
  def only(name: String, fn: ProvidesCallback): Unit = js.native
  def only(name: String, fn: ProvidesCallback, timeout: Double): Unit = js.native
  /**
    * Creates a test closure.
    *
    * @param name The name of your test
    * @param fn The function for your test
    * @param timeout The timeout for an async function test
    */
  /**
    * Skips running this test in the current file.
    */
  def skip(name: String): Unit = js.native
  def skip(name: String, fn: ProvidesCallback): Unit = js.native
  def skip(name: String, fn: ProvidesCallback, timeout: Double): Unit = js.native
  /**
    * Creates a test closure.
    *
    * @param name The name of your test
    * @param fn The function for your test
    * @param timeout The timeout for an async function test
    */
  /**
    * Sketch out which tests to write in the future.
    */
  def todo(name: String): Unit = js.native
  def todo(name: String, fn: ProvidesCallback): Unit = js.native
  def todo(name: String, fn: ProvidesCallback, timeout: Double): Unit = js.native
}

