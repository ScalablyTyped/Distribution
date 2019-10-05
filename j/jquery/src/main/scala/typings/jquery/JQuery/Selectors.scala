package typings.jquery.JQuery

import typings.sizzle.sizzleMod.Selectors.AttrHandleFunctions
import typings.sizzle.sizzleMod.Selectors.CreatePseudoFunction
import typings.sizzle.sizzleMod.Selectors.FilterFunctions
import typings.sizzle.sizzleMod.Selectors.FindFunctions
import typings.sizzle.sizzleMod.Selectors.Matches
import typings.sizzle.sizzleMod.Selectors.PreFilterFunctions
import typings.sizzle.sizzleMod.Selectors.PseudoFunction
import typings.sizzle.sizzleMod.Selectors.PseudoFunctions
import typings.sizzle.sizzleMod.Selectors.SetFilterFunctions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selectors
  extends typings.sizzle.sizzleMod.Selectors {
  /**
    * @deprecated ​ Deprecated since 3.0. Use \`{@link Selectors#pseudos }\`.
    *
    * **Cause**: The standard way to add new custom selectors through jQuery is `jQuery.expr.pseudos`. These two other aliases are deprecated, although they still work as of jQuery 3.0.
    *
    * **Solution**: Rename any of the older usage to `jQuery.expr.pseudos`. The functionality is identical.
    */
  var `:`: PseudoFunctions
}

object Selectors {
  @scala.inline
  def apply(
    `:`: PseudoFunctions,
    attrHandle: AttrHandleFunctions,
    cacheLength: Double,
    createPseudo: CreatePseudoFunction => PseudoFunction,
    filter: FilterFunctions,
    find: FindFunctions,
    `match`: Matches,
    preFilter: PreFilterFunctions,
    pseudos: PseudoFunctions,
    setFilters: SetFilterFunctions
  ): Selectors = {
    val __obj = js.Dynamic.literal(attrHandle = attrHandle, cacheLength = cacheLength, createPseudo = js.Any.fromFunction1(createPseudo), filter = filter, find = find, preFilter = preFilter, pseudos = pseudos, setFilters = setFilters)
    __obj.updateDynamic(":")(`:`)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Selectors]
  }
}

