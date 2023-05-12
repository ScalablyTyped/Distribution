package typings.jotai

import typings.jotai.vanillaAtomMod.WritableAtom
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactUtilsUseHydrateAtomsMod {
  
  @JSImport("jotai/react/utils/useHydrateAtoms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useHydrateAtoms[T /* <: AtomMap[AnyWritableAtom, Any] */](values: T): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useHydrateAtoms")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useHydrateAtoms[T /* <: AtomMap[AnyWritableAtom, Any] */](values: T, options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useHydrateAtoms")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useHydrateAtoms[T /* <: js.Array[AtomTuple[AnyWritableAtom, Any]] */](values: InferAtoms[T]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useHydrateAtoms")(values.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useHydrateAtoms[T /* <: js.Array[AtomTuple[AnyWritableAtom, Any]] */](values: InferAtoms[T], options: Options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useHydrateAtoms")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AnyWritableAtom = WritableAtom[Any, js.Array[Any], Any]
  
  type AtomMap[A, V] = Map[A, V]
  
  type AtomTuple[A, V] = js.Tuple2[A, V]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: T[K] extends jotai.jotai/react/utils/useHydrateAtoms.AtomTuple<infer A, unknown>? A extends jotai.jotai/react/utils/useHydrateAtoms.AnyWritableAtom? jotai.jotai/react/utils/useHydrateAtoms.AtomTuple<A, std.ReturnType<A['read']>> : T[K] : never}
    }}}
    */
  @js.native
  trait InferAtoms[T /* <: js.Iterable[AtomTuple[AnyWritableAtom, Any]] */] extends StObject
  
  type Options = /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(options : jotai.jotai/react/Provider.Options | undefined): jotai.jotai/react/Provider.Store>[0] */ js.Any
}
