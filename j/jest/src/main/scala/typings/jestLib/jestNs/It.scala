package typings
package jestLib.jestNs

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
           * Creates a test closure.
           *
           * @param name The name of your test
           * @param fn The function for your test
           * @param timeout The timeout for an async function test
           */
  def apply(name: java.lang.String, fn: ProvidesCallback): scala.Unit = js.native
  /**
           * Creates a test closure.
           *
           * @param name The name of your test
           * @param fn The function for your test
           * @param timeout The timeout for an async function test
           */
  def apply(name: java.lang.String, fn: ProvidesCallback, timeout: scala.Double): scala.Unit = js.native
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
  def concurrent(name: java.lang.String, fn: ProvidesCallback): scala.Unit = js.native
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
  def concurrent(name: java.lang.String, fn: ProvidesCallback, timeout: scala.Double): scala.Unit = js.native
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
  def each(cases: js.Array[_]): js.Function2[
    /* name */ java.lang.String, 
    /* fn */ js.Function1[/* repeated */js.Any, _], 
    scala.Unit
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
  def each(strings: stdLib.TemplateStringsArray, placeholders: js.Any*): js.Function2[/* name */ java.lang.String, /* fn */ js.Function1[/* arg */ js.Any, _], scala.Unit] = js.native
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
  def only(name: java.lang.String, fn: ProvidesCallback): scala.Unit = js.native
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
  def only(name: java.lang.String, fn: ProvidesCallback, timeout: scala.Double): scala.Unit = js.native
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
  def skip(name: java.lang.String, fn: ProvidesCallback): scala.Unit = js.native
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
  def skip(name: java.lang.String, fn: ProvidesCallback, timeout: scala.Double): scala.Unit = js.native
}

