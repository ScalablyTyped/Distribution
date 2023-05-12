package typings.immer

import org.scalablytyped.runtime.StringDictionary
import typings.immer.anon.AutoFreeze
import typings.immer.immerBooleans.`false`
import typings.immer.immerBooleans.`true`
import typings.immer.immerStrings.add
import typings.immer.immerStrings.remove
import typings.immer.immerStrings.replace
import typings.std.Map
import typings.std.Set
import typings.std.WeakMap
import typings.std.WeakSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("immer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("immer", "Immer")
  @js.native
  open class Immer ()
    extends StObject
       with ProducersFns {
    def this(config: AutoFreeze) = this()
    
    def applyPatches[T /* <: Objectish */](base: T, patches: js.Array[Patch]): T = js.native
    
    var autoFreeze_ : Boolean = js.native
    
    def createDraft[T /* <: Objectish */](base: T): Draft[T] = js.native
    
    def finishDraft[D /* <: Draft[Any] */](draft: D): /* import warning: importer.ImportType#apply Failed type conversion: D extends immer.immer.Draft<infer T> ? T : never */ js.Any = js.native
    def finishDraft[D /* <: Draft[Any] */](draft: D, patchListener: PatchListener): /* import warning: importer.ImportType#apply Failed type conversion: D extends immer.immer.Draft<infer T> ? T : never */ js.Any = js.native
    
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
    /** Normal producer */
    /* CompleteClass */
    override def produce[Base, D](
      // By using a default inferred D, rather than Draft<Base> in the recipe, we can override it.
    base: Base,
      recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]]
    ): Base = js.native
    /* CompleteClass */
    override def produce[Base, D](
      // By using a default inferred D, rather than Draft<Base> in the recipe, we can override it.
    base: Base,
      recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]],
      listener: PatchListener
    ): Base = js.native
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
    var produceWithPatches_Original: IProduceWithPatches = js.native
    
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
      * Pass true to enable strict shallow copy.
      *
      * By default, immer does not copy the object descriptors such as getter, setter and non-enumrable properties.
      */
    def setUseStrictShallowCopy(value: Boolean): Unit = js.native
    
    var useStrictShallowCopy_ : Boolean = js.native
  }
  
  /**
    * Apply an array of Immer patches to the first argument.
    *
    * This function is a producer, which means copy-on-write is in effect.
    */
  inline def applyPatches[T /* <: Objectish */](base: T, patches: js.Array[Patch]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatches")(base.asInstanceOf[js.Any], patches.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * This function is actually a no-op, but can be used to cast an immutable type
    * to an draft type and make TypeScript happy
    *
    * @param value
    */
  inline def castDraft[T](value: T): Draft[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("castDraft")(value.asInstanceOf[js.Any]).asInstanceOf[Draft[T]]
  
  /**
    * This function is actually a no-op, but can be used to cast a mutable type
    * to an immutable type and make TypeScript happy
    * @param value
    */
  inline def castImmutable[T](value: T): Immutable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("castImmutable")(value.asInstanceOf[js.Any]).asInstanceOf[Immutable[T]]
  
  /**
    * Create an Immer draft from the given base state, which may be a draft itself.
    * The draft can be modified until you finalize it with the `finishDraft` function.
    */
  inline def createDraft[T /* <: Objectish */](base: T): Draft[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDraft")(base.asInstanceOf[js.Any]).asInstanceOf[Draft[T]]
  
  /** Takes a snapshot of the current state of a draft and finalizes it (but without freezing). This is a great utility to print the current state during debugging (no Proxies in the way). The output of current can also be safely leaked outside the producer. */
  inline def current[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("current")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def enableMapSet(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableMapSet")().asInstanceOf[Unit]
  
  inline def enablePatches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enablePatches")().asInstanceOf[Unit]
  
  /**
    * Finalize an Immer draft from a `createDraft` call, returning the base state
    * (if no changes were made) or a modified copy. The draft must *not* be
    * mutated afterwards.
    *
    * Pass a function as the 2nd argument to generate Immer patches based on the
    * changes that were made.
    */
  inline def finishDraft[D /* <: Any */](draft: D): /* import warning: importer.ImportType#apply Failed type conversion: D extends immer.immer.Draft<infer T> ? T : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("finishDraft")(draft.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: D extends immer.immer.Draft<infer T> ? T : never */ js.Any]
  inline def finishDraft[D /* <: Any */](draft: D, patchListener: PatchListener): /* import warning: importer.ImportType#apply Failed type conversion: D extends immer.immer.Draft<infer T> ? T : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("finishDraft")(draft.asInstanceOf[js.Any], patchListener.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: D extends immer.immer.Draft<infer T> ? T : never */ js.Any]
  
  /**
    * Freezes draftable objects. Returns the original object.
    * By default freezes shallowly, but if the second argument is `true` it will freeze recursively.
    *
    * @param obj
    * @param deep
    */
  inline def freeze[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("freeze")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def freeze[T](obj: T, deep: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("freeze")(obj.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[T]
  
  /**
    * To let Immer treat your class instances as plain immutable objects
    * (albeit with a custom prototype), you must define either an instance property
    * or a static property on each of your custom classes.
    *
    * Otherwise, your class instance will never be drafted, which means it won't be
    * safe to mutate in a produce callback.
    */
  @JSImport("immer", "immerable")
  @js.native
  val immerable: js.Symbol = js.native
  
  /** Returns true if the given value is an Immer draft */
  inline def isDraft(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDraft")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Returns true if the given value can be drafted by Immer */
  inline def isDraftable(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDraftable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("immer", "nothing")
  @js.native
  val nothing: js.Symbol = js.native
  
  /** Get the underlying object that is represented by the given draft */
  inline def original[T](value: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("original")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
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
  @JSImport("immer", "produce")
  @js.native
  val produce: IProduce = js.native
  
  /**
    * Like `produce`, but `produceWithPatches` always returns a tuple
    * [nextState, patches, inversePatches] (instead of just the next state)
    */
  @JSImport("immer", "produceWithPatches")
  @js.native
  val produceWithPatches: IProduceWithPatches = js.native
  
  /**
    * Pass true to automatically freeze all copies created by Immer.
    *
    * Always freeze by default, even in production mode
    */
  inline def setAutoFreeze(value: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoFreeze")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Pass true to enable strict shallow copy.
    *
    * By default, immer does not copy the object descriptors such as getter, setter and non-enumrable properties.
    */
  inline def setUseStrictShallowCopy(value: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseStrictShallowCopy")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type AnyArray = js.Array[Any]
  
  @js.native
  trait AnyFunc extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  type AnyMap = Map[Any, Any]
  
  type AnyObject = StringDictionary[Any]
  
  type AnySet = Set[Any]
  
  /** Object types that should never be mapped */
  type AtomicObject = js.Function | js.Promise[Any] | js.Date | js.RegExp
  
  /** Convert a readonly type into a mutable type, if possible */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends immer.immer.PrimitiveType ? T : T extends immer.immer.AtomicObject ? T : T extends std.ReadonlyMap<infer K, infer V> ? std.Map<immer.immer.Draft<K>, immer.immer.Draft<V>> : T extends std.ReadonlySet<infer V> ? std.Set<immer.immer.Draft<V>> : T extends immer.immer.WeakReferences ? T : T extends object ? immer.immer.WritableDraft<T> : T
    }}}
    */
  type Draft[T] = T
  
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
  @js.native
  trait IProduce extends StObject {
    
    /** Curried producer that infers curried from the recipe  */
    def apply[Recipe /* <: AnyFunc */](recipe: Recipe): InferCurriedFromRecipe[Recipe, `false`] = js.native
    def apply[State](recipe: js.Function1[/* state */ Draft[State], ValidRecipeReturnType[State]]): js.Function1[/* state */ State, State] = js.native
    /** Curried producer that infers curried from the State generic, which is explicitly passed in.  */
    def apply[State](
      recipe: js.Function2[/* state */ Draft[State], /* initialState */ State, ValidRecipeReturnType[State]]
    ): js.Function1[/* state */ js.UndefOr[State], State] = js.native
    /** Curried producer that infers the recipe from the curried output function (e.g. when passing to setState) */
    def apply[Curried](recipe: InferRecipeFromCurried[Curried]): Curried = js.native
    def apply[Curried](recipe: InferRecipeFromCurried[Curried], initialState: InferInitialStateFromCurried[Curried]): Curried = js.native
    /** Normal producer */
    def apply[Base, D](
      // By using a default inferred D, rather than Draft<Base> in the recipe, we can override it.
    base: Base,
      recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]]
    ): Base = js.native
    def apply[Base, D](
      // By using a default inferred D, rather than Draft<Base> in the recipe, we can override it.
    base: Base,
      recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]],
      listener: PatchListener
    ): Base = js.native
    /** Curried producer with initial state, infers recipe from initial state */
    def apply[State, Recipe /* <: js.Function */](recipe: Recipe, initialState: State): InferCurriedFromInitialStateAndRecipe[State, Recipe, `false`] = js.native
    def apply[State, Args /* <: js.Array[Any] */](
      recipe: js.Function2[/* state */ Draft[State], /* args */ Args, ValidRecipeReturnType[State]],
      initialState: State
    ): js.Function2[/* state */ js.UndefOr[State], /* args */ Args, State] = js.native
  }
  
  /**
    * Like `produce`, but instead of just returning the new state,
    * a tuple is returned with [nextState, patches, inversePatches]
    *
    * Like produce, this function supports currying
    */
  @js.native
  trait IProduceWithPatches extends StObject {
    
    def apply[Recipe /* <: AnyFunc */](recipe: Recipe): InferCurriedFromRecipe[Recipe, `true`] = js.native
    def apply[Base, D](base: Base, recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]]): PatchesTuple[Base] = js.native
    def apply[Base, D](base: Base, recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]], listener: PatchListener): PatchesTuple[Base] = js.native
    def apply[State, Recipe /* <: js.Function */](recipe: Recipe, initialState: State): InferCurriedFromInitialStateAndRecipe[State, Recipe, `true`] = js.native
  }
  
  /**
    * If the lib "ES2015.Collection" is not included in tsconfig.json,
    * types like ReadonlyArray, WeakMap etc. fall back to `any` (specified nowhere)
    * or `{}` (from the node types), in both cases entering an infinite recursion in
    * pattern matching type mappings
    * This type can be used to cast these types to `void` in these cases.
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    true | false extends T extends never ? true : false ? Fallback : keyof T extends never ? Fallback : T
    }}}
    */
  type IfAvailable[T, Fallback] = Fallback
  
  /** Convert a mutable type into a readonly type */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends immer.immer.PrimitiveType ? T : T extends immer.immer.AtomicObject ? T : T extends std.ReadonlyMap<infer K, infer V> ? std.ReadonlyMap<immer.immer.Immutable<K>, immer.immer.Immutable<V>> : T extends std.ReadonlySet<infer V> ? std.ReadonlySet<immer.immer.Immutable<V>> : T extends immer.immer.WeakReferences ? T : T extends object ? {readonly [ K in keyof T ]: immer.immer.Immutable<T[K]>} : T
    }}}
    */
  type Immutable[T] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Recipe extends (draft : immer.immer.Draft<State>, rest : infer RestArgs): immer.immer.ValidRecipeReturnType<State> ? (base : State | undefined, args : RestArgs): immer.immer.ReturnTypeWithPatchesIfNeeded<State, UsePatches> : never
    }}}
    */
  @js.native
  trait InferCurriedFromInitialStateAndRecipe[State, Recipe, UsePatches /* <: Boolean */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Recipe extends (draft : infer DraftState, args : infer RestArgs): any ? std.ReturnType<Recipe> extends immer.immer.ValidRecipeReturnType<DraftState> ? (base : immer.immer.Immutable<DraftState>, args : RestArgs): immer.immer.ReturnTypeWithPatchesIfNeeded<DraftState, UsePatches> : never : never
    }}}
    */
  @js.native
  trait InferCurriedFromRecipe[Recipe, UsePatches /* <: Boolean */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Curried extends (base : infer State, rest : ...any): any ? State : never
    }}}
    */
  @js.native
  trait InferInitialStateFromCurried[Curried] extends StObject
  
  /**
    * Core Producer inference
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Curried extends (base : infer State, rest : infer Args): any ? std.ReturnType<Curried> extends State ? (draft : immer.immer.Draft<State>, rest : Args): immer.immer.ValidRecipeReturnType<immer.immer.Draft<State>> : never : never
    }}}
    */
  @js.native
  trait InferRecipeFromCurried[Curried] extends StObject
  
  type Objectish = AnyObject | AnyArray | AnyMap | AnySet
  
  trait Patch extends StObject {
    
    var op: replace | remove | add
    
    var path: js.Array[String | Double]
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object Patch {
    
    inline def apply(op: replace | remove | add, path: js.Array[String | Double]): Patch = {
      val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Patch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Patch] (val x: Self) extends AnyVal {
      
      inline def setOp(value: replace | remove | add): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      inline def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value*))
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type PatchListener = js.Function2[/* patches */ js.Array[Patch], /* inversePatches */ js.Array[Patch], Unit]
  
  /**
    * Utility types
    */
  type PatchesTuple[T] = js.Tuple3[T, js.Array[Patch], js.Array[Patch]]
  
  type PrimitiveType = Double | String | Boolean
  
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
    /** Normal producer */
    def produce[Base, D](
      // By using a default inferred D, rather than Draft<Base> in the recipe, we can override it.
    base: Base,
      recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]]
    ): Base
    def produce[Base, D](
      // By using a default inferred D, rather than Draft<Base> in the recipe, we can override it.
    base: Base,
      recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]],
      listener: PatchListener
    ): Base
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
    var produceWithPatches_Original: IProduceWithPatches
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProducersFns] (val x: Self) extends AnyVal {
      
      inline def setProduce(value: IProduce): Self = StObject.set(x, "produce", value.asInstanceOf[js.Any])
      
      inline def setProduceWithPatches(value: IProduceWithPatches): Self = StObject.set(x, "produceWithPatches", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    UsePatches extends true ? immer.immer.PatchesTuple<State> : State
    }}}
    */
  type ReturnTypeWithPatchesIfNeeded[State, UsePatches /* <: Boolean */] = State
  
  type ValidRecipeReturnType[State] = js.UndefOr[
    State | Unit | (/* import warning: importer.ImportType#apply Failed type conversion: State extends undefined ? symbol : never */ js.Any)
  ]
  
  /**
    * These should also never be mapped but must be tested after regular Map and
    * Set
    */
  type WeakReferences = IfAvailable[(WeakMap[Any, Any]) | WeakSet[Any], Unit]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {-readonly [ K in keyof T ]: immer.immer.Draft<T[K]>}
    }}}
    */
  @js.native
  trait WritableDraft[T] extends StObject
}
