package typings.immer

import org.scalablytyped.runtime.TopLevel
import typings.immer.immerBooleans.`false`
import typings.immer.immerBooleans.`true`
import typings.immer.immerStrings.add
import typings.immer.immerStrings.remove
import typings.immer.immerStrings.replace
import typings.immer.internalMod.Nothing
import typings.std.Map
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Set
import typings.std.WeakMap
import typings.std.WeakSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExternalMod {
  
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
  
  type Draft[T] = T | WritableDraft[T] | Set[Any] | (Map[Any, Any])
  
  /** Converts `nothing` into `undefined` */
  type FromNothing[T] = js.UndefOr[T]
  
  @js.native
  trait IProduce extends StObject {
    
    /** Curried producer that infers curried from the recipe  */
    def apply[Recipe /* <: AnyFunc */](recipe: Recipe): InferCurriedFromRecipe[Recipe, `false`] = js.native
    def apply[State](recipe: js.Function1[/* state */ Draft[State], ValidRecipeReturnType[State]]): js.Function1[/* state */ State, State] = js.native
    /** Curried producer that infers curried from the State generic, which is explicitly passed in.  */
    def apply[State](
      recipe: js.Function2[/* state */ Draft[State], /* initialState */ State, ValidRecipeReturnType[State]]
    ): js.Function1[/* state */ js.UndefOr[State], State] = js.native
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
  }
  
  @js.native
  trait IProduceWithPatches extends StObject {
    
    def apply[Recipe /* <: AnyFunc */](recipe: Recipe): InferCurriedFromRecipe[Recipe, `true`] = js.native
    def apply[Base, D](base: Base, recipe: js.Function1[/* draft */ D, js.Promise[ValidRecipeReturnType[D]]]): js.Promise[PatchesTuple[Base]] = js.native
    def apply[Base, D](
      base: Base,
      recipe: js.Function1[/* draft */ D, js.Promise[ValidRecipeReturnType[D]]],
      listener: PatchListener
    ): js.Promise[PatchesTuple[Base]] = js.native
    def apply[State, Recipe /* <: js.Function */](recipe: Recipe, initialState: State): InferCurriedFromInitialStateAndRecipe[State, Recipe, `true`] = js.native
  }
  
  type IfAvailable[T, Fallback] = T | Fallback
  
  type Immutable[T] = T | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof T ]: any}
    */ typings.immer.immerStrings.Immutable & TopLevel[Any]) | ReadonlySet[Any] | (ReadonlyMap[Any, Any])
  
  type InferCurriedFromInitialStateAndRecipe[State, Recipe, UsePatches /* <: Boolean */] = js.Function2[
    /* base */ js.UndefOr[State], 
    /* args */ Any, 
    PromisifyReturnIfNeeded[State, Recipe, UsePatches]
  ]
  
  type InferCurriedFromRecipe[Recipe, UsePatches /* <: Boolean */] = js.Function2[/* base */ Any, /* args */ Any, PromisifyReturnIfNeeded[Any, Recipe, UsePatches]]
  
  type InferInitialStateFromCurried[Curried] = Any
  
  /**
    * Core Producer inference
    */
  type InferRecipeFromCurried[Curried] = js.Function2[/* draft */ Any, /* rest */ Any, ValidRecipeReturnType[Any]]
  
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
  
  type Produced[Base, Return] = FromNothing[Return] | (js.Promise[FromNothing[Any] | Base]) | Base
  
  type PromisifyReturnIfNeeded[State, Recipe /* <: AnyFunc */, UsePatches /* <: Boolean */] = State | PatchesTuple[State] | (js.Promise[State | PatchesTuple[State]])
  
  type ValidRecipeReturnType[State] = js.UndefOr[State | Unit | Nothing]
  
  type ValidRecipeReturnTypePossiblyPromise[State] = ValidRecipeReturnType[State] | js.Promise[ValidRecipeReturnType[State]]
  
  /**
    * These should also never be mapped but must be tested after regular Map and
    * Set
    */
  type WeakReferences = IfAvailable[(WeakMap[Any, Any]) | WeakSet[Any], Unit]
  
  type WritableDraft[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ K in keyof T ]: immer.immer/dist/types/types-external.Draft<T[K]>}
    */ typings.immer.immerStrings.WritableDraft & TopLevel[T]
}
