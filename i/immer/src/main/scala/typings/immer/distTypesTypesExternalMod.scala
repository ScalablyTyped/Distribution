package typings.immer

import typings.immer.immerBooleans.`false`
import typings.immer.immerBooleans.`true`
import typings.immer.immerStrings.add
import typings.immer.immerStrings.remove
import typings.immer.immerStrings.replace
import typings.std.WeakMap
import typings.std.WeakSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTypesExternalMod {
  
  @JSImport("immer/dist/types/types-external", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def neverUsed(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("never_used")().asInstanceOf[Unit]
  
  @js.native
  trait AnyFunc extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  /** Object types that should never be mapped */
  type AtomicObject = js.Function | js.Promise[Any] | js.Date | js.RegExp
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends immer.immer/dist/types/types-external.PrimitiveType ? T : T extends immer.immer/dist/types/types-external.AtomicObject ? T : T extends immer.immer/dist/types/types-external.IfAvailable<std.ReadonlyMap<infer K, infer V>, void> ? std.Map<immer.immer/dist/types/types-external.Draft<K>, immer.immer/dist/types/types-external.Draft<V>> : T extends immer.immer/dist/types/types-external.IfAvailable<std.ReadonlySet<infer V>, void> ? std.Set<immer.immer/dist/types/types-external.Draft<V>> : T extends immer.immer/dist/types/types-external.WeakReferences ? T : T extends object ? immer.immer/dist/types/types-external.WritableDraft<T> : T
    }}}
    */
  @js.native
  trait Draft[T] extends StObject
  
  /** Converts `nothing` into `undefined` */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends immer.immer/dist/internal.Nothing ? undefined : T
    }}}
    */
  @js.native
  trait FromNothing[T] extends StObject
  
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
    /** Promisified dormal producer */
    def apply[Base, D](base: Base, recipe: js.Function1[/* draft */ D, js.Promise[ValidRecipeReturnType[D]]]): js.Promise[Base] = js.native
    def apply[Base, D](
      base: Base,
      recipe: js.Function1[/* draft */ D, js.Promise[ValidRecipeReturnType[D]]],
      listener: PatchListener
    ): js.Promise[Base] = js.native
    /** Curried producer with initial state, infers recipe from initial state */
    def apply[State, Recipe /* <: js.Function */](recipe: Recipe, initialState: State): InferCurriedFromInitialStateAndRecipe[State, Recipe, `false`] = js.native
    def apply[State, Args /* <: js.Array[Any] */](
      recipe: js.Function2[/* state */ Draft[State], /* args */ Args, ValidRecipeReturnType[State]],
      initialState: State
    ): js.Function2[/* state */ js.UndefOr[State], /* args */ Args, State] = js.native
  }
  
  @js.native
  trait IProduceWithPatches extends StObject {
    
    def apply[Recipe /* <: AnyFunc */](recipe: Recipe): InferCurriedFromRecipe[Recipe, `true`] = js.native
    def apply[Base, D](base: Base, recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]]): PatchesTuple[Base] = js.native
    def apply[Base, D](base: Base, recipe: js.Function1[/* draft */ D, ValidRecipeReturnType[D]], listener: PatchListener): PatchesTuple[Base] = js.native
    def apply[State, Recipe /* <: js.Function */](recipe: Recipe, initialState: State): InferCurriedFromInitialStateAndRecipe[State, Recipe, `true`] = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    true | false extends T extends never ? true : false ? Fallback : keyof T extends never ? Fallback : T
    }}}
    */
  @js.native
  trait IfAvailable[T, Fallback] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends immer.immer/dist/types/types-external.PrimitiveType ? T : T extends immer.immer/dist/types/types-external.AtomicObject ? T : T extends immer.immer/dist/types/types-external.IfAvailable<std.ReadonlyMap<infer K, infer V>, void> ? std.ReadonlyMap<immer.immer/dist/types/types-external.Immutable<K>, immer.immer/dist/types/types-external.Immutable<V>> : T extends immer.immer/dist/types/types-external.IfAvailable<std.ReadonlySet<infer V>, void> ? std.ReadonlySet<immer.immer/dist/types/types-external.Immutable<V>> : T extends immer.immer/dist/types/types-external.WeakReferences ? T : T extends object ? {readonly [ K in keyof T ]: immer.immer/dist/types/types-external.Immutable<T[K]>} : T
    }}}
    */
  @js.native
  trait Immutable[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Recipe extends (draft : immer.immer/dist/types/types-external.Draft<State>, rest : infer RestArgs): immer.immer/dist/types/types-external.ValidRecipeReturnTypePossiblyPromise<State> ? (base : State | undefined, args : RestArgs): immer.immer/dist/types/types-external.PromisifyReturnIfNeeded<State, Recipe, UsePatches> : never
    }}}
    */
  @js.native
  trait InferCurriedFromInitialStateAndRecipe[State, Recipe, UsePatches /* <: Boolean */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Recipe extends (draft : infer DraftState, args : infer RestArgs): any ? std.ReturnType<Recipe> extends immer.immer/dist/types/types-external.ValidRecipeReturnTypePossiblyPromise<DraftState> ? (base : immer.immer/dist/types/types-external.Immutable<DraftState>, args : RestArgs): immer.immer/dist/types/types-external.PromisifyReturnIfNeeded<DraftState, Recipe, UsePatches> : never : never
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
    Curried extends (base : infer State, rest : infer Args): any ? std.ReturnType<Curried> extends State ? (draft : immer.immer/dist/types/types-external.Draft<State>, rest : Args): immer.immer/dist/types/types-external.ValidRecipeReturnType<immer.immer/dist/types/types-external.Draft<State>> : never : never
    }}}
    */
  @js.native
  trait InferRecipeFromCurried[Curried] extends StObject
  
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
    
    extension [Self <: Patch](x: Self) {
      
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    Return extends void ? Base : Return extends std.Promise<infer Result> ? std.Promise<Result extends void ? Base : immer.immer/dist/types/types-external.FromNothing<Result>> : immer.immer/dist/types/types-external.FromNothing<Return>
    }}}
    */
  @js.native
  trait Produced[Base, Return] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    std.ReturnType<Recipe> extends std.Promise<any> ? std.Promise<UsePatches extends true ? immer.immer/dist/types/types-external.PatchesTuple<State> : State> : UsePatches extends true ? immer.immer/dist/types/types-external.PatchesTuple<State> : State
    }}}
    */
  @js.native
  trait PromisifyReturnIfNeeded[State, Recipe /* <: AnyFunc */, UsePatches /* <: Boolean */] extends StObject
  
  type ValidRecipeReturnType[State] = js.UndefOr[
    State | Unit | (/* import warning: importer.ImportType#apply Failed type conversion: State extends undefined ? immer.immer/dist/internal.Nothing : never */ js.Any)
  ]
  
  type ValidRecipeReturnTypePossiblyPromise[State] = ValidRecipeReturnType[State] | js.Promise[ValidRecipeReturnType[State]]
  
  /**
    * These should also never be mapped but must be tested after regular Map and
    * Set
    */
  type WeakReferences = IfAvailable[(WeakMap[Any, Any]) | WeakSet[Any], Unit]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {-readonly [ K in keyof T ]: immer.immer/dist/types/types-external.Draft<T[K]>}
    }}}
    */
  @js.native
  trait WritableDraft[T] extends StObject
}
