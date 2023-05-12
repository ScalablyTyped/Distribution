package typings.jotai

import typings.jotai.reactUtilsUseAtomCallbackMod.Options
import typings.jotai.reactUtilsUseHydrateAtomsMod.AnyWritableAtom
import typings.jotai.reactUtilsUseHydrateAtomsMod.AtomMap
import typings.jotai.reactUtilsUseHydrateAtomsMod.AtomTuple
import typings.jotai.reactUtilsUseHydrateAtomsMod.InferAtoms
import typings.jotai.vanillaAtomMod.PrimitiveAtom
import typings.jotai.vanillaAtomMod.WritableAtom
import typings.jotai.vanillaTypeUtilsMod.Getter
import typings.jotai.vanillaTypeUtilsMod.Setter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactUtilsMod {
  
  @JSImport("jotai/react/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAtomCallback[Result, Args /* <: js.Array[Any] */](callback: js.Function3[/* get */ Getter, /* set */ Setter, /* arg */ Args, Result]): js.Function1[/* args */ Args, Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("useAtomCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, Result]]
  inline def useAtomCallback[Result, Args /* <: js.Array[Any] */](
    callback: js.Function3[/* get */ Getter, /* set */ Setter, /* arg */ Args, Result],
    options: Options
  ): js.Function1[/* args */ Args, Result] = (^.asInstanceOf[js.Dynamic].applyDynamic("useAtomCallback")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Args, Result]]
  
  inline def useHydrateAtoms[T /* <: AtomMap[AnyWritableAtom, Any] */](values: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useHydrateAtoms")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useHydrateAtoms[T /* <: AtomMap[AnyWritableAtom, Any] */](values: T, options: typings.jotai.reactUtilsUseHydrateAtomsMod.Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useHydrateAtoms")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useHydrateAtoms[T /* <: js.Iterable[AtomTuple[AnyWritableAtom, Any]] */](values: InferAtoms[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useHydrateAtoms")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useHydrateAtoms[T /* <: js.Iterable[AtomTuple[AnyWritableAtom, Any]] */](values: InferAtoms[T], options: typings.jotai.reactUtilsUseHydrateAtomsMod.Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useHydrateAtoms")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useReducerAtom[Value, Action](
    anAtom: PrimitiveAtom[Value],
    reducer: js.Function2[/* v */ Value, js.UndefOr[/* a */ Action], Value]
  ): js.Tuple2[Value, js.Function1[/* action */ Action, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducerAtom")(anAtom.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Value, js.Function1[/* action */ Action, Unit]]]
  inline def useReducerAtom[Value, Action](
    anAtom: PrimitiveAtom[Value],
    reducer: js.Function2[/* v */ Value, js.UndefOr[/* a */ Action], Value],
    options: typings.jotai.reactUtilsUseReducerAtomMod.Options
  ): js.Tuple2[Value, js.Function1[/* action */ Action, Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducerAtom")(anAtom.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Value, js.Function1[/* action */ Action, Unit]]]
  
  inline def useResetAtom(anAtom: WritableAtom[Any, js.Array[js.Symbol], Any]): js.Function0[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("useResetAtom")(anAtom.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Any]]
  inline def useResetAtom(
    anAtom: WritableAtom[Any, js.Array[js.Symbol], Any],
    options: typings.jotai.reactUtilsUseResetAtomMod.Options
  ): js.Function0[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("useResetAtom")(anAtom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Any]]
}
