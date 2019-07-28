package typings.atHapiCode.atHapiCodeMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Values[T] extends js.Object {
  /** Asserts that the reference value is about the provided value within a delta margin of difference. */
  def about(value: Double, delta: Double): AssertionChain[T] = js.native
  /** Asserts that the reference value is greater than (>) the provided value. */
  def above(value: T): AssertionChain[T] = js.native
  /** Asserts that the reference value is less than (<) the provided value. */
  def below(value: T): AssertionChain[T] = js.native
  /** Asserts that the reference value is between but not equal (from < value < to) the provided values. */
  def between(from: T, to: T): AssertionChain[T] = js.native
  def contain(values: T): AssertionChain[T] = js.native
  /** Asserts that the reference value (a string, array, or object) includes the provided values. */
  def contain(values: String): AssertionChain[T] = js.native
  def contain(values: js.Array[String | T]): AssertionChain[T] = js.native
  def contains(values: T): AssertionChain[T] = js.native
  /** Asserts that the reference value (a string, array, or object) includes the provided values. */
  def contains(values: String): AssertionChain[T] = js.native
  def contains(values: js.Array[String | T]): AssertionChain[T] = js.native
  /** Asserts that the reference value has a length property equal to zero or an object with no keys. */
  def empty(): AssertionChain[T] = js.native
  /** Asserts that the reference value (a string) ends with the provided value. */
  def endWith(value: String): AssertionChain[T] = js.native
  /** Asserts that the reference value (a string) ends with the provided value. */
  def endsWith(value: String): AssertionChain[T] = js.native
  /** Asserts that the reference value equals the provided value. */
  def equal(value: T): AssertionChain[T] = js.native
  def equal(value: T, options: js.Any): AssertionChain[T] = js.native
  def equal(value: js.Array[T]): AssertionChain[T] = js.native
  def equal(value: js.Array[T], options: js.Any): AssertionChain[T] = js.native
  def equals(value: T, options: js.Any): AssertionChain[T] = js.native
  def equals(value: js.Array[T]): AssertionChain[T] = js.native
  def equals(value: js.Array[T], options: js.Any): AssertionChain[T] = js.native
  /** Asserts that the reference value exists (not null or undefined). */
  def exist(): AssertionChain[T] = js.native
  /** Asserts that the reference value exists (not null or undefined). */
  def exists(): AssertionChain[T] = js.native
  /** Asserts that the reference value is false. */
  def `false`(): AssertionChain[T] = js.native
  /** Asserts that the reference value is greater than (>) the provided value. */
  def greaterThan(value: T): AssertionChain[T] = js.native
  def include(values: T): AssertionChain[T] = js.native
  /** Asserts that the reference value (a string, array, or object) includes the provided values. */
  def include(values: String): AssertionChain[T] = js.native
  def include(values: js.Array[String | T]): AssertionChain[T] = js.native
  def includes(values: T): AssertionChain[T] = js.native
  /** Asserts that the reference value (a string, array, or object) includes the provided values. */
  def includes(values: String): AssertionChain[T] = js.native
  def includes(values: js.Array[String | T]): AssertionChain[T] = js.native
  /** Asserts that the reference value has the provided instanceof value. */
  def instanceOf(`type`: js.Any): AssertionChain[T] = js.native
  /** Asserts that the reference value has the provided instanceof value. */
  def instanceof(`type`: js.Any): AssertionChain[T] = js.native
  /** Asserts that the reference value is at least (>=) the provided value. */
  def least(value: T): AssertionChain[T] = js.native
  /** Asserts that the reference value has a length property matching the provided size or an object with the specified number of keys. */
  def length(size: Double): AssertionChain[T] = js.native
  /** Asserts that the reference value is less than (<) the provided value. */
  def lessThan(value: T): AssertionChain[T] = js.native
  /** Asserts that the reference value's toString() representation matches the provided regular expression. */
  def `match`(regex: RegExp): AssertionChain[T] = js.native
  /** Asserts that the reference value's toString() representation matches the provided regular expression. */
  def matches(regex: RegExp): AssertionChain[T] = js.native
  /** Asserts that the reference value is at most (<=) the provided value. */
  def max(value: T): AssertionChain[T] = js.native
  /** Asserts that the reference value is at least (>=) the provided value. */
  def min(value: T): AssertionChain[T] = js.native
  /** Asserts that the reference value is at most (<=) the provided value. */
  def most(value: T): AssertionChain[T] = js.native
  /** Asserts that the reference value is null. */
  def `null`(): AssertionChain[T] = js.native
  /** Asserts that the reference value is within (from <= value <= to) the provided values. */
  def range(from: T, to: T): AssertionChain[T] = js.native
  /** Asserts that the Promise reference value rejects with an exception when called */
  def reject(): AssertionChain[T] = js.native
  def reject(`type`: js.Any): AssertionChain[T] = js.native
  def reject(`type`: js.Any, message: String): AssertionChain[T] = js.native
  def reject(`type`: js.Any, message: RegExp): AssertionChain[T] = js.native
  /** Asserts that the Promise reference value rejects with an exception when called */
  def rejects(): AssertionChain[T] = js.native
  def rejects(`type`: js.Any): AssertionChain[T] = js.native
  def rejects(`type`: js.Any, message: String): AssertionChain[T] = js.native
  def rejects(`type`: js.Any, message: RegExp): AssertionChain[T] = js.native
  /** Asserts that the reference value satisfies the provided validator function. */
  def satisfies(validator: js.Function1[/* value */ T, Boolean]): AssertionChain[T] = js.native
  /** Asserts that the reference value satisfies the provided validator function. */
  def satisfy(validator: js.Function1[/* value */ T, Boolean]): AssertionChain[T] = js.native
  /** Asserts that the reference value (a string) starts with the provided value. */
  def startWith(value: String): AssertionChain[T] = js.native
  /** Asserts that the reference value (a string) starts with the provided value. */
  def startsWith(value: String): AssertionChain[T] = js.native
  /** Asserts that the function reference value throws an exception when called. */
  def `throw`(): AssertionChain[T] = js.native
  def `throw`(`type`: js.Any): AssertionChain[T] = js.native
  def `throw`(`type`: js.Any, message: String): AssertionChain[T] = js.native
  def `throw`(`type`: js.Any, message: RegExp): AssertionChain[T] = js.native
  /** Asserts that the function reference value throws an exception when called. */
  def throws(): AssertionChain[T] = js.native
  def throws(`type`: js.Any): AssertionChain[T] = js.native
  def throws(`type`: js.Any, message: String): AssertionChain[T] = js.native
  def throws(`type`: js.Any, message: RegExp): AssertionChain[T] = js.native
  /** Asserts that the reference value is true. */
  def `true`(): AssertionChain[T] = js.native
  /** Asserts that the reference value is undefined. */
  def undefined(): AssertionChain[T] = js.native
  /** Asserts that the reference value is within (from <= value <= to) the provided values. */
  def within(from: T, to: T): AssertionChain[T] = js.native
}

