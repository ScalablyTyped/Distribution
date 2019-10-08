package typings.immer.immerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProduce extends js.Object {
  /**
    * The `produce` function takes a value and a "recipe function" (whose
    * return value often depends on the base state). The recipe function is
    * free to mutate its first argument however it wants. All mutations are
    * only ever applied to a __copy__ of the base state.
    *
    * Pass only a function to create a "curried producer" which relieves you
    * from passing the recipe function every time.
    *
    * Only plain objects and arrays are made mutable. All other objects are
    * considered uncopyable.
    *
    * Note: This function is __bound__ to its `Immer` instance.
    *
    * @param {any} base - the initial state
    * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
    * @param {Function} patchListener - optional function that will be called with all the patches produced here
    * @returns {any} a new state, or the initial state if nothing was modified
    */
  def apply[Base, Proxy, Return](base: Base, recipe: js.ThisFunction1[/* this */ Proxy, /* draft */ Proxy, Return]): Produced[Base, Return] = js.native
  def apply[Base, Proxy, Return](
    base: Base,
    recipe: js.ThisFunction1[/* this */ Proxy, /* draft */ Proxy, Return],
    listener: PatchListener
  ): Produced[Base, Return] = js.native
  /** Curried producer */
  def apply[Default, Base, Rest /* <: js.Array[_] */, Return](recipe: js.ThisFunction2[/* this */ Draft[Base], /* draft */ Draft[Base], /* rest */ Rest, Return]): js.Function2[/* base */ js.UndefOr[Base], /* rest */ Rest, Produced[Base, Return]] = js.native
  def apply[Default, Base, Rest /* <: js.Array[_] */, Return](
    recipe: js.ThisFunction2[/* this */ Draft[Base], /* draft */ Draft[Base], /* rest */ Rest, Return],
    defaultBase: Default
  ): js.Function2[/* base */ js.UndefOr[Base], /* rest */ Rest, Produced[Base, Return]] = js.native
}

