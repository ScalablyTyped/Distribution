package typings.justCurryIt

import typings.justCurryIt.justCurryItInts.`0`
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("just-curry-it", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[F /* <: js.Function1[/* repeated */ Any, Any] */, L /* <: Double */](fn: F): Curry[
    F, 
    js.UndefOr[L], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<F>[number] */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[Curry[
    F, 
    js.UndefOr[L], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<F>[number] */ js.Any
  ]]
  inline def default[F /* <: js.Function1[/* repeated */ Any, Any] */, L /* <: Double */](fn: F, arity: L): Curry[
    F, 
    js.UndefOr[L], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<F>[number] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], arity.asInstanceOf[js.Any])).asInstanceOf[Curry[
    F, 
    js.UndefOr[L], 
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<F>[number] */ js.Any
  ]]
  
  type Curry[F /* <: js.Function1[/* repeated */ Any, Any] */, LEN /* <: js.UndefOr[Double] */, I /* <: Any */] = (CurryInternal[F, (MakeTuple[LEN | `0`, I, js.Array[Any]]) | Parameters[F]]) | js.Function0[ReturnType[F]]
  
  type CurryInternal[F /* <: js.Function1[/* repeated */ Any, Any] */, N /* <: js.Array[Any] */] = (CurryOverload[F, N, js.Array[Any]]) | ReturnType[F]
  
  type CurryOverload[F /* <: js.Function1[/* repeated */ Any, Any] */, N /* <: js.Array[Any] */, P /* <: js.Array[Any] */] = js.Function0[Any] | ((js.Function1[
    /* import warning: importer.ImportType#apply c repeated non-array type: P */ /* args */ js.Array[P], 
    Any
  ]) & Any)
  
  type MakeTuple[LEN /* <: Double */, T /* <: Any */, C /* <: js.Array[T] */] = C
}
