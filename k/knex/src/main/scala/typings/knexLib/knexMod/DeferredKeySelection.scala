package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Container type for situations when we want a partial/intersection eventually
// but the keys being selected or additional properties being augmented are not
// all known at once and we would want to effectively build up a partial/intersection
// over multiple steps.
trait DeferredKeySelection[// The base of selection. In intermediate stages this may be unknown.
// If it remains unknown at the point of resolution, the selection will fall back to any
TBase, // Union of keys to be selected
// In intermediate stages this may be never.
TKeys /* <: java.lang.String */, // Changes how the resolution should behave if TKeys is never.
// If true, then we assume that some keys were selected, and if TKeys is never, we will fall back to any.
// If false, and TKeys is never, then we select TBase in its entirity
THasSelect /* <: knexLib.knexLibNumbers.`true` | knexLib.knexLibNumbers.`false` */, // Mapping of aliases <key in result> -> <key in TBase>
TAliasMapping /* <: js.Object */, // If enabled, then instead of extracting a partial, during resolution
// we will pick just a single property.
TSingle /* <: scala.Boolean */] extends js.Object {
  var _aliases: TAliasMapping
  // These properties are not actually used, but exist simply because
  // typescript doesn't end up happy when type parameters are unused
  var _base: TBase
  var _hasSelection: THasSelect
  var _keys: TKeys
  var _single: TSingle
}

object DeferredKeySelection {
  @scala.inline
  def apply[// The base of selection. In intermediate stages this may be unknown.
  // If it remains unknown at the point of resolution, the selection will fall back to any
  TBase, // Union of keys to be selected
  // In intermediate stages this may be never.
  TKeys /* <: java.lang.String */, // Changes how the resolution should behave if TKeys is never.
  // If true, then we assume that some keys were selected, and if TKeys is never, we will fall back to any.
  // If false, and TKeys is never, then we select TBase in its entirity
  THasSelect /* <: knexLib.knexLibNumbers.`true` | knexLib.knexLibNumbers.`false` */, // Mapping of aliases <key in result> -> <key in TBase>
  TAliasMapping /* <: js.Object */, // If enabled, then instead of extracting a partial, during resolution
  // we will pick just a single property.
  TSingle /* <: scala.Boolean */](_aliases: TAliasMapping, _base: TBase, _hasSelection: THasSelect, _keys: TKeys, _single: TSingle): DeferredKeySelection[TBase, TKeys, THasSelect, TAliasMapping, TSingle] = {
    val __obj = js.Dynamic.literal(_aliases = _aliases.asInstanceOf[js.Any], _base = _base.asInstanceOf[js.Any], _hasSelection = _hasSelection.asInstanceOf[js.Any], _keys = _keys.asInstanceOf[js.Any], _single = _single.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeferredKeySelection[TBase, TKeys, THasSelect, TAliasMapping, TSingle]]
  }
}

