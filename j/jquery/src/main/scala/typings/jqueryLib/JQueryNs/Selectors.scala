package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selectors
  extends sizzleLib.sizzleMod.Selectors {
  /**
    * @deprecated ​ Deprecated since 3.0. Use \`{@link Selectors#pseudos }\`.
    *
    * **Cause**: The standard way to add new custom selectors through jQuery is `jQuery.expr.pseudos`. These two other aliases are deprecated, although they still work as of jQuery 3.0.
    *
    * **Solution**: Rename any of the older usage to `jQuery.expr.pseudos`. The functionality is identical.
    */
  var `:`: sizzleLib.sizzleMod.SelectorsNs.PseudoFunctions
}

object Selectors {
  @scala.inline
  def apply(
    `:`: sizzleLib.sizzleMod.SelectorsNs.PseudoFunctions,
    attrHandle: sizzleLib.sizzleMod.SelectorsNs.AttrHandleFunctions,
    cacheLength: scala.Double,
    createPseudo: sizzleLib.sizzleMod.SelectorsNs.CreatePseudoFunction => sizzleLib.sizzleMod.SelectorsNs.PseudoFunction,
    filter: sizzleLib.sizzleMod.SelectorsNs.FilterFunctions,
    find: sizzleLib.sizzleMod.SelectorsNs.FindFunctions,
    `match`: sizzleLib.sizzleMod.SelectorsNs.Matches,
    preFilter: sizzleLib.sizzleMod.SelectorsNs.PreFilterFunctions,
    pseudos: sizzleLib.sizzleMod.SelectorsNs.PseudoFunctions,
    setFilters: sizzleLib.sizzleMod.SelectorsNs.SetFilterFunctions
  ): Selectors = {
    val __obj = js.Dynamic.literal(attrHandle = attrHandle, cacheLength = cacheLength, createPseudo = js.Any.fromFunction1(createPseudo), filter = filter, find = find, preFilter = preFilter, pseudos = pseudos, setFilters = setFilters)
    __obj.updateDynamic(":")(`:`)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Selectors]
  }
}

