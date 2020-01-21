package typings.hapiHoek.mod.reach

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Value to return if the path or value is not present. No default value.
    *
    * @default false
    */
  val default: js.UndefOr[js.Any] = js.undefined
  /**
    * If true, allows traversing functions for properties. false will throw an error if a function is part of the chain.
    *
    * @default true
    */
  val functions: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, allows traversing Set and Map objects for properties. false will return undefined regardless of the Set or Map passed.
    *
    * @default false
    */
  val iterables: js.UndefOr[Boolean] = js.undefined
  /**
    * String to split chain path on. Defaults to '.'.
    *
    * @default false
    */
  val separator: js.UndefOr[String] = js.undefined
  /**
    * If true, will throw an error on missing member in the chain. Default to false.
    *
    * @default false
    */
  val strict: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    default: js.Any = null,
    functions: js.UndefOr[Boolean] = js.undefined,
    iterables: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(functions)) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (!js.isUndefined(iterables)) __obj.updateDynamic("iterables")(iterables.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

