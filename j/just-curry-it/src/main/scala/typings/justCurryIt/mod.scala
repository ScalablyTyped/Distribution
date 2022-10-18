package typings.justCurryIt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("just-curry-it", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[F /* <: js.Function1[/* repeated */ Any, Any] */, L /* <: Double */](fn: F): Curry[
    F, 
    /* import warning: importer.ImportType#apply Failed type conversion: number extends L ? undefined : L */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<F>[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[Curry[
    F, 
    /* import warning: importer.ImportType#apply Failed type conversion: number extends L ? undefined : L */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<F>[number] */ js.Any
  ]]
  inline def default[F /* <: js.Function1[/* repeated */ Any, Any] */, L /* <: Double */](fn: F, arity: L): Curry[
    F, 
    /* import warning: importer.ImportType#apply Failed type conversion: number extends L ? undefined : L */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<F>[number] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], arity.asInstanceOf[js.Any])).asInstanceOf[Curry[
    F, 
    /* import warning: importer.ImportType#apply Failed type conversion: number extends L ? undefined : L */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<F>[number] */ js.Any
  ]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    0 extends LEN extends undefined ? std.Parameters<F>['length'] : LEN ? (): std.ReturnType<F> : just-curry-it.just-curry-it.CurryInternal<F, LEN extends undefined ? std.Parameters<F> : just-curry-it.just-curry-it.MakeTuple<LEN extends undefined ? 0 : LEN, I, []>>
    }}}
    */
  @js.native
  trait Curry[F /* <: js.Function1[/* repeated */ Any, Any] */, LEN /* <: js.UndefOr[Double] */, I /* <: Any */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    0 extends N['length'] ? std.ReturnType<F> : just-curry-it.just-curry-it.CurryOverload<F, N, []>
    }}}
    */
  @js.native
  trait CurryInternal[F /* <: js.Function1[/* repeated */ Any, Any] */, N /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    N extends [infer L, ...infer R] ? (args : [...P, L]): just-curry-it.just-curry-it.CurryInternal<F, R> & just-curry-it.just-curry-it.CurryOverload<F, R, [...P, L]> : (): just-curry-it.just-curry-it.CurryInternal<F, P>
    }}}
    */
  @js.native
  trait CurryOverload[F /* <: js.Function1[/* repeated */ Any, Any] */, N /* <: js.Array[Any] */, P /* <: js.Array[Any] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    C['length'] extends LEN ? C : just-curry-it.just-curry-it.MakeTuple<LEN, T, [T, ...C]>
    }}}
    */
  @js.native
  trait MakeTuple[LEN /* <: Double */, T /* <: Any */, C /* <: js.Array[T] */] extends StObject
}
