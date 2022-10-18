package typings.immer

import typings.immer.anon.AutoFreeze
import typings.immer.distTypesTypesExternalMod.AnyFunc
import typings.immer.distTypesTypesExternalMod.Draft
import typings.immer.distTypesTypesExternalMod.IProduce
import typings.immer.distTypesTypesExternalMod.IProduceWithPatches
import typings.immer.distTypesTypesExternalMod.InferCurriedFromInitialStateAndRecipe
import typings.immer.distTypesTypesExternalMod.InferCurriedFromRecipe
import typings.immer.distTypesTypesExternalMod.InferInitialStateFromCurried
import typings.immer.distTypesTypesExternalMod.InferRecipeFromCurried
import typings.immer.distTypesTypesExternalMod.Patch
import typings.immer.distTypesTypesExternalMod.PatchListener
import typings.immer.distTypesTypesExternalMod.PatchesTuple
import typings.immer.distTypesTypesExternalMod.ValidRecipeReturnType
import typings.immer.distTypesTypesInternalMod.Drafted
import typings.immer.distTypesTypesInternalMod.ImmerState
import typings.immer.distTypesTypesInternalMod.Objectish
import typings.immer.immerBooleans.`false`
import typings.immer.immerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreImmerClassMod {
  
  @JSImport("immer/dist/core/immerClass", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("immer/dist/core/immerClass", "Immer")
  @js.native
  open class Immer ()
    extends StObject
       with ProducersFns {
    def this(config: AutoFreeze) = this()
    
    def applyPatches[T /* <: Objectish */](base: T, patches: js.Array[Patch]): T = js.native
    
    var autoFreeze_ : Boolean = js.native
    
    def createDraft[T /* <: Objectish */](base: T): Draft[T] = js.native
    
    def finishDraft[D /* <: Draft[Any] */](draft: D): /* import warning: importer.ImportType#apply Failed type conversion: D extends immer.immer/dist/types/types-external.Draft<infer T> ? T : never */ js.Any = js.native
    def finishDraft[D /* <: Draft[Any] */](draft: D, patchListener: PatchListener): /* import warning: importer.ImportType#apply Failed type conversion: D extends immer.immer/dist/types/types-external.Draft<infer T> ? T : never */ js.Any = js.native
    
    /** Curried producer that infers curried from the recipe  */
    /* CompleteClass */
    override def produce[Recipe /* <: AnyFunc */](recipe: Recipe): InferCurriedFromRecipe[Recipe, `false`] = js.native
    /* CompleteClass */
    override def produce[State](recipe: js.Function1[/* state */ Draft[State], ValidRecipeReturnType[State]]): js.Function1[/* state */ State, State] = js.native
    /** Curried producer that infers curried from the State generic, which is explicitly passed in.  */
    /* CompleteClass */
    override def produce[State](
      recipe: js.Function2[/* state */ Draft[State], /* initialState */ State, ValidRecipeReturnType[State]]
    ): js.Function1[/* state */ js.UndefOr[State], State] = js.native
    /** Curried producer that infers the recipe from the curried output function (e.g. when passing to setState) */
    /* CompleteClass */
    override def produce[Curried](recipe: InferRecipeFromCurried[Curried]): Curried = js.native
    /* CompleteClass */
    override def produce[Curried](recipe: InferRecipeFromCurried[Curried], initialState: InferInitialStateFromCurried[Curried]): Curried = js.native
    /** Promisified dormal producer */
    /* CompleteClass */
    override def produce[Base, D](base: Base, recipe: js.Function1[/* draft */ D, js.Promise[ValidRecipeReturnType[D]]]): js.Promise[Base] = js.native
    /* CompleteClass */
    override def produce[Base, D](
      base: Base,
      recipe: js.Function1[/* draft */ D, js.Promise[ValidRecipeReturnType[D]]],
      listener: PatchListener
    ): js.Promise[Base] = js.native
    /** Curried producer with initial state, infers recipe from initial state */
    /* CompleteClass */
    override def produce[State, Recipe /* <: js.Function */](recipe: Recipe, initialState: State): InferCurriedFromInitialStateAndRecipe[State, Recipe, `false`] = js.native
    /* CompleteClass */
    override def produce[State, Args /* <: js.Array[Any] */](
      recipe: js.Function2[/* state */ Draft[State], /* args */ Args, ValidRecipeReturnType[State]],
      initialState: State
    ): js.Function2[/* state */ js.UndefOr[State], /* args */ Args, State] = js.native
    
    /* CompleteClass */
    override def produceWithPatches[Recipe /* <: AnyFunc */](recipe: Recipe): InferCurriedFromRecipe[Recipe, `true`] = js.native
    /* CompleteClass */
    override def produceWithPatches[Base, D](base: Base, recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]]): PatchesTuple[Base] = js.native
    /* CompleteClass */
    override def produceWithPatches[Base, D](base: Base, recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]], listener: PatchListener): PatchesTuple[Base] = js.native
    /* CompleteClass */
    override def produceWithPatches[State, Recipe /* <: js.Function */](recipe: Recipe, initialState: State): InferCurriedFromInitialStateAndRecipe[State, Recipe, `true`] = js.native
    /* CompleteClass */
    @JSName("produceWithPatches")
    override def produceWithPatches_BaseD_Promise[Base, D](base: Base, recipe: js.Function1[/* draft */ D, js.Promise[ValidRecipeReturnType[D]]]): js.Promise[PatchesTuple[Base]] = js.native
    /* CompleteClass */
    @JSName("produceWithPatches")
    override def produceWithPatches_BaseD_Promise[Base, D](
      base: Base,
      recipe: js.Function1[/* draft */ D, js.Promise[ValidRecipeReturnType[D]]],
      listener: PatchListener
    ): js.Promise[PatchesTuple[Base]] = js.native
    /* CompleteClass */
    @JSName("produceWithPatches")
    var produceWithPatches_Original: IProduceWithPatches = js.native
    
    /** Normal producer */
    /* CompleteClass */
    @JSName("produce")
    override def produce_BaseD_Base[Base, D](
      // By using a default inferred D, rather than Draft<Base> in the recipe, we can override it.
    base: Base,
      recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]]
    ): Base = js.native
    /* CompleteClass */
    @JSName("produce")
    override def produce_BaseD_Base[Base, D](
      // By using a default inferred D, rather than Draft<Base> in the recipe, we can override it.
    base: Base,
      recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]],
      listener: PatchListener
    ): Base = js.native
    /* CompleteClass */
    @JSName("produce")
    var produce_Original: IProduce = js.native
    /* CompleteClass */
    @JSName("produce")
    override def produce_StateArgs_Function2[State, Args /* <: js.Array[Any] */](recipe: js.Function2[/* state */ Draft[State], /* args */ Args, ValidRecipeReturnType[State]]): js.Function2[/* state */ State, /* args */ Args, State] = js.native
    
    /**
      * Pass true to automatically freeze all copies created by Immer.
      *
      * By default, auto-freezing is enabled.
      */
    def setAutoFreeze(value: Boolean): Unit = js.native
    
    /**
      * Pass true to use the ES2015 `Proxy` class when creating drafts, which is
      * always faster than using ES5 proxies.
      *
      * By default, feature detection is used, so calling this is rarely necessary.
      */
    def setUseProxies(value: Boolean): Unit = js.native
    
    var useProxies_ : Boolean = js.native
  }
  
  inline def createProxy[T /* <: Objectish */](immer: Immer, value: T): Drafted[T, ImmerState] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxy")(immer.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Drafted[T, ImmerState]]
  inline def createProxy[T /* <: Objectish */](immer: Immer, value: T, parent: ImmerState): Drafted[T, ImmerState] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxy")(immer.asInstanceOf[js.Any], value.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Drafted[T, ImmerState]]
  
  trait ProducersFns extends StObject {
    
    /** Curried producer that infers curried from the recipe  */
    def produce[Recipe /* <: AnyFunc */](recipe: Recipe): InferCurriedFromRecipe[Recipe, `false`]
    def produce[State](recipe: js.Function1[/* state */ Draft[State], ValidRecipeReturnType[State]]): js.Function1[/* state */ State, State]
    /** Curried producer that infers curried from the State generic, which is explicitly passed in.  */
    def produce[State](
      recipe: js.Function2[/* state */ Draft[State], /* initialState */ State, ValidRecipeReturnType[State]]
    ): js.Function1[/* state */ js.UndefOr[State], State]
    /** Curried producer that infers the recipe from the curried output function (e.g. when passing to setState) */
    def produce[Curried](recipe: InferRecipeFromCurried[Curried]): Curried
    def produce[Curried](recipe: InferRecipeFromCurried[Curried], initialState: InferInitialStateFromCurried[Curried]): Curried
    /** Promisified dormal producer */
    def produce[Base, D](base: Base, recipe: js.Function1[/* draft */ D, js.Promise[ValidRecipeReturnType[D]]]): js.Promise[Base]
    def produce[Base, D](
      base: Base,
      recipe: js.Function1[/* draft */ D, js.Promise[ValidRecipeReturnType[D]]],
      listener: PatchListener
    ): js.Promise[Base]
    /** Curried producer with initial state, infers recipe from initial state */
    def produce[State, Recipe /* <: js.Function */](recipe: Recipe, initialState: State): InferCurriedFromInitialStateAndRecipe[State, Recipe, `false`]
    def produce[State, Args /* <: js.Array[Any] */](
      recipe: js.Function2[/* state */ Draft[State], /* args */ Args, ValidRecipeReturnType[State]],
      initialState: State
    ): js.Function2[/* state */ js.UndefOr[State], /* args */ Args, State]
    
    def produceWithPatches[Recipe /* <: AnyFunc */](recipe: Recipe): InferCurriedFromRecipe[Recipe, `true`]
    def produceWithPatches[Base, D](base: Base, recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]]): PatchesTuple[Base]
    def produceWithPatches[Base, D](base: Base, recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]], listener: PatchListener): PatchesTuple[Base]
    def produceWithPatches[State, Recipe /* <: js.Function */](recipe: Recipe, initialState: State): InferCurriedFromInitialStateAndRecipe[State, Recipe, `true`]
    @JSName("produceWithPatches")
    def produceWithPatches_BaseD_Promise[Base, D](base: Base, recipe: js.Function1[/* draft */ D, js.Promise[ValidRecipeReturnType[D]]]): js.Promise[PatchesTuple[Base]]
    @JSName("produceWithPatches")
    def produceWithPatches_BaseD_Promise[Base, D](
      base: Base,
      recipe: js.Function1[/* draft */ D, js.Promise[ValidRecipeReturnType[D]]],
      listener: PatchListener
    ): js.Promise[PatchesTuple[Base]]
    @JSName("produceWithPatches")
    var produceWithPatches_Original: IProduceWithPatches
    
    /** Normal producer */
    @JSName("produce")
    def produce_BaseD_Base[Base, D](
      // By using a default inferred D, rather than Draft<Base> in the recipe, we can override it.
    base: Base,
      recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]]
    ): Base
    @JSName("produce")
    def produce_BaseD_Base[Base, D](
      // By using a default inferred D, rather than Draft<Base> in the recipe, we can override it.
    base: Base,
      recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]],
      listener: PatchListener
    ): Base
    @JSName("produce")
    var produce_Original: IProduce
    @JSName("produce")
    def produce_StateArgs_Function2[State, Args /* <: js.Array[Any] */](recipe: js.Function2[/* state */ Draft[State], /* args */ Args, ValidRecipeReturnType[State]]): js.Function2[/* state */ State, /* args */ Args, State]
  }
  object ProducersFns {
    
    inline def apply(produce: IProduce, produceWithPatches: IProduceWithPatches): ProducersFns = {
      val __obj = js.Dynamic.literal(produce = produce.asInstanceOf[js.Any], produceWithPatches = produceWithPatches.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProducersFns]
    }
    
    extension [Self <: ProducersFns](x: Self) {
      
      inline def setProduce(value: IProduce): Self = StObject.set(x, "produce", value.asInstanceOf[js.Any])
      
      inline def setProduceWithPatches(value: IProduceWithPatches): Self = StObject.set(x, "produceWithPatches", value.asInstanceOf[js.Any])
    }
  }
}
