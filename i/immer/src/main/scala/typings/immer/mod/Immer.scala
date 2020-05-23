package typings.immer.mod

import typings.immer.anon.AutoFreeze
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immer", "Immer")
@js.native
class Immer protected () extends js.Object {
  def this(config: AutoFreeze) = this()
  /**
    * When true, `produce` will freeze the copies it creates.
    */
  val autoFreeze: Boolean = js.native
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
  @JSName("produce")
  var produce_Original: IProduce = js.native
  /**
    * When true, drafts are ES2015 proxies.
    */
  val useProxies: Boolean = js.native
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
  def produce[Base, Proxy, Return](base: Base, recipe: js.ThisFunction1[/* this */ Proxy, /* draft */ Proxy, Return]): Produced[Base, Return] = js.native
  def produce[Base, Proxy, Return](
    base: Base,
    recipe: js.ThisFunction1[/* this */ Proxy, /* draft */ Proxy, Return],
    listener: PatchListener
  ): Produced[Base, Return] = js.native
  /** Curried producer */
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
  def produce[Default, Base, Rest /* <: js.Array[_] */, Return](recipe: js.ThisFunction2[/* this */ Draft[Base], /* draft */ Draft[Base], /* rest */ Rest, Return]): js.Function2[/* base */ js.UndefOr[Base], /* rest */ Rest, Produced[Base, Return]] = js.native
  def produce[Default, Base, Rest /* <: js.Array[_] */, Return](
    recipe: js.ThisFunction2[/* this */ Draft[Base], /* draft */ Draft[Base], /* rest */ Rest, Return],
    defaultBase: Default
  ): js.Function2[/* base */ js.UndefOr[Base], /* rest */ Rest, Produced[Base, Return]] = js.native
  /**
    * Pass true to automatically freeze all copies created by Immer.
    *
    * By default, auto-freezing is disabled in production.
    */
  def setAutoFreeze(autoFreeze: Boolean): Unit = js.native
  /**
    * Pass true to use the ES2015 `Proxy` class when creating drafts, which is
    * always faster than using ES5 proxies.
    *
    * By default, feature detection is used, so calling this is rarely necessary.
    */
  def setUseProxies(useProxies: Boolean): Unit = js.native
}

