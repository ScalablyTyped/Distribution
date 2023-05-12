package typings.jotai

import typings.jotai.vanillaAtomMod.Atom_
import typings.jotai.vanillaAtomMod.PrimitiveAtom
import typings.jotai.vanillaAtomMod.WritableAtom
import typings.jotai.vanillaTypeUtilsMod.Getter
import typings.jotai.vanillaTypeUtilsMod.SetStateAction
import typings.jotai.vanillaUtilsAtomFamilyMod.AtomFamily_
import typings.jotai.vanillaUtilsAtomWithDefaultMod.Read
import typings.jotai.vanillaUtilsAtomWithObservableMod.ObservableLike
import typings.jotai.vanillaUtilsAtomWithObservableMod.Options
import typings.jotai.vanillaUtilsAtomWithObservableMod.OptionsWithInitialValue
import typings.jotai.vanillaUtilsAtomWithObservableMod.SubjectLike
import typings.jotai.vanillaUtilsAtomWithResetMod.SetStateActionWithReset
import typings.jotai.vanillaUtilsAtomWithStorageMod.AsyncStorage
import typings.jotai.vanillaUtilsAtomWithStorageMod.AsyncStringStorage
import typings.jotai.vanillaUtilsAtomWithStorageMod.SyncStorage
import typings.jotai.vanillaUtilsAtomWithStorageMod.SyncStringStorage
import typings.jotai.vanillaUtilsLoadableMod.Loadable_
import typings.jotai.vanillaUtilsSplitAtomMod.SplitAtomAction
import typings.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vanillaUtilsMod {
  
  @JSImport("jotai/vanilla/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jotai/vanilla/utils", "RESET")
  @js.native
  val RESET: js.Symbol = js.native
  
  inline def atomFamily[Param, AtomType /* <: Atom_[Any] */](initializeAtom: js.Function1[/* param */ Param, AtomType]): AtomFamily_[Param, AtomType] = ^.asInstanceOf[js.Dynamic].applyDynamic("atomFamily")(initializeAtom.asInstanceOf[js.Any]).asInstanceOf[AtomFamily_[Param, AtomType]]
  inline def atomFamily[Param, AtomType /* <: Atom_[Any] */](
    initializeAtom: js.Function1[/* param */ Param, AtomType],
    areEqual: js.Function2[/* a */ Param, /* b */ Param, Boolean]
  ): AtomFamily_[Param, AtomType] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomFamily")(initializeAtom.asInstanceOf[js.Any], areEqual.asInstanceOf[js.Any])).asInstanceOf[AtomFamily_[Param, AtomType]]
  
  inline def atomWithDefault[Value](
    getDefault: Read[
      js.Promise[Value] | Value, 
      js.Array[SetStateAction[Awaited[Value]] | js.Symbol], 
      Unit
    ]
  ): WritableAtom[Value, js.Array[SetStateAction[Awaited[Value]] | js.Symbol], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("atomWithDefault")(getDefault.asInstanceOf[js.Any]).asInstanceOf[WritableAtom[Value, js.Array[SetStateAction[Awaited[Value]] | js.Symbol], Unit]]
  
  inline def atomWithObservable[Data](getObservable: js.Function1[/* get */ Getter, SubjectLike[Data]]): WritableAtom[Data | js.Promise[Data], js.Array[Data], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("atomWithObservable")(getObservable.asInstanceOf[js.Any]).asInstanceOf[WritableAtom[Data | js.Promise[Data], js.Array[Data], Unit]]
  inline def atomWithObservable[Data](getObservable: js.Function1[/* get */ Getter, SubjectLike[Data]], options: Options[Data]): WritableAtom[Data | js.Promise[Data], js.Array[Data], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithObservable")(getObservable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[Data | js.Promise[Data], js.Array[Data], Unit]]
  inline def atomWithObservable[Data](
    getObservable: js.Function1[/* get */ Getter, SubjectLike[Data]],
    options: OptionsWithInitialValue[Data]
  ): WritableAtom[Data, js.Array[Data], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithObservable")(getObservable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[Data, js.Array[Data], Unit]]
  
  inline def atomWithObservable_Data_Atom_[Data](getObservable: js.Function1[/* get */ Getter, ObservableLike[Data]]): Atom_[Data | js.Promise[Data]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atomWithObservable")(getObservable.asInstanceOf[js.Any]).asInstanceOf[Atom_[Data | js.Promise[Data]]]
  inline def atomWithObservable_Data_Atom_[Data](getObservable: js.Function1[/* get */ Getter, ObservableLike[Data]], options: Options[Data]): Atom_[Data | js.Promise[Data]] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithObservable")(getObservable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Atom_[Data | js.Promise[Data]]]
  inline def atomWithObservable_Data_Atom_[Data](
    getObservable: js.Function1[/* get */ Getter, ObservableLike[Data]],
    options: OptionsWithInitialValue[Data]
  ): Atom_[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithObservable")(getObservable.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Atom_[Data]]
  
  inline def atomWithReducer[Value, Action](
    initialValue: Value,
    reducer: js.Function2[/* value */ Value, js.UndefOr[/* action */ Action], Value]
  ): WritableAtom[Value, js.Array[Action], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithReducer")(initialValue.asInstanceOf[js.Any], reducer.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[Value, js.Array[Action], Unit]]
  
  inline def atomWithReset[Value](initialValue: Value): WritableAtom[Value, js.Array[SetStateActionWithReset[Value]], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("atomWithReset")(initialValue.asInstanceOf[js.Any]).asInstanceOf[WritableAtom[Value, js.Array[SetStateActionWithReset[Value]], Unit]]
  
  inline def atomWithStorage[Value](key: String, initialValue: Value): WritableAtom[
    Value, 
    js.Array[typings.jotai.vanillaUtilsAtomWithStorageMod.SetStateActionWithReset[Value]], 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithStorage")(key.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[
    Value, 
    js.Array[typings.jotai.vanillaUtilsAtomWithStorageMod.SetStateActionWithReset[Value]], 
    Unit
  ]]
  inline def atomWithStorage[Value](key: String, initialValue: Value, storage: AsyncStorage[Value]): WritableAtom[
    Value, 
    js.Array[typings.jotai.vanillaUtilsAtomWithStorageMod.SetStateActionWithReset[Value]], 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithStorage")(key.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], storage.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[
    Value, 
    js.Array[typings.jotai.vanillaUtilsAtomWithStorageMod.SetStateActionWithReset[Value]], 
    Unit
  ]]
  inline def atomWithStorage[Value](key: String, initialValue: Value, storage: SyncStorage[Value]): WritableAtom[
    Value, 
    js.Array[typings.jotai.vanillaUtilsAtomWithStorageMod.SetStateActionWithReset[Value]], 
    Unit
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("atomWithStorage")(key.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any], storage.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[
    Value, 
    js.Array[typings.jotai.vanillaUtilsAtomWithStorageMod.SetStateActionWithReset[Value]], 
    Unit
  ]]
  
  inline def createJSONStorage[Value](getStringStorage: js.Function0[AsyncStringStorage]): AsyncStorage[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("createJSONStorage")(getStringStorage.asInstanceOf[js.Any]).asInstanceOf[AsyncStorage[Value]]
  
  inline def createJSONStorage_Value_SyncStorage[Value](getStringStorage: js.Function0[SyncStringStorage]): SyncStorage[Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("createJSONStorage")(getStringStorage.asInstanceOf[js.Any]).asInstanceOf[SyncStorage[Value]]
  
  inline def freezeAtom[AtomType /* <: Atom_[Any] */](anAtom: AtomType): AtomType = ^.asInstanceOf[js.Dynamic].applyDynamic("freezeAtom")(anAtom.asInstanceOf[js.Any]).asInstanceOf[AtomType]
  
  inline def freezeAtomCreator[CreateAtom /* <: js.Function1[/* repeated */ Any, Atom_[Any]] */](createAtom: CreateAtom): CreateAtom = ^.asInstanceOf[js.Dynamic].applyDynamic("freezeAtomCreator")(createAtom.asInstanceOf[js.Any]).asInstanceOf[CreateAtom]
  
  inline def loadable[Value](anAtom: Atom_[Value]): Atom_[Loadable_[Value]] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadable")(anAtom.asInstanceOf[js.Any]).asInstanceOf[Atom_[Loadable_[Value]]]
  
  inline def selectAtom[Value, Slice](
    anAtom: Atom_[js.Promise[Value] | Value],
    selector: js.Function2[/* v */ Awaited[Value], js.UndefOr[Slice], Slice]
  ): Atom_[Slice] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAtom")(anAtom.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Atom_[Slice]]
  inline def selectAtom[Value, Slice](
    anAtom: Atom_[js.Promise[Value] | Value],
    selector: js.Function2[/* v */ Awaited[Value], js.UndefOr[Slice], Slice],
    equalityFn: js.Function2[/* a */ Slice, /* b */ Slice, Boolean]
  ): Atom_[Slice] = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAtom")(anAtom.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], equalityFn.asInstanceOf[js.Any])).asInstanceOf[Atom_[Slice]]
  
  inline def splitAtom[Item, Key](arrAtom: Atom_[js.Array[Item]]): Atom_[js.Array[Atom_[Item]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAtom")(arrAtom.asInstanceOf[js.Any]).asInstanceOf[Atom_[js.Array[Atom_[Item]]]]
  inline def splitAtom[Item, Key](arrAtom: Atom_[js.Array[Item]], keyExtractor: js.Function1[/* item */ Item, Key]): Atom_[js.Array[Atom_[Item]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitAtom")(arrAtom.asInstanceOf[js.Any], keyExtractor.asInstanceOf[js.Any])).asInstanceOf[Atom_[js.Array[Atom_[Item]]]]
  inline def splitAtom[Item, Key](arrAtom: WritableAtom[js.Array[Item], js.Array[js.Array[Item]], Unit]): WritableAtom[js.Array[PrimitiveAtom[Item]], js.Array[SplitAtomAction[Item]], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAtom")(arrAtom.asInstanceOf[js.Any]).asInstanceOf[WritableAtom[js.Array[PrimitiveAtom[Item]], js.Array[SplitAtomAction[Item]], Unit]]
  inline def splitAtom[Item, Key](
    arrAtom: WritableAtom[js.Array[Item], js.Array[js.Array[Item]], Unit],
    keyExtractor: js.Function1[/* item */ Item, Key]
  ): WritableAtom[js.Array[PrimitiveAtom[Item]], js.Array[SplitAtomAction[Item]], Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitAtom")(arrAtom.asInstanceOf[js.Any], keyExtractor.asInstanceOf[js.Any])).asInstanceOf[WritableAtom[js.Array[PrimitiveAtom[Item]], js.Array[SplitAtomAction[Item]], Unit]]
  
  inline def unstableUnwrap[Value](anAtom: Atom_[js.Promise[Value]]): Atom_[js.UndefOr[Awaited[Value]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unstable_unwrap")(anAtom.asInstanceOf[js.Any]).asInstanceOf[Atom_[js.UndefOr[Awaited[Value]]]]
  inline def unstableUnwrap[Value, PendingValue](
    anAtom: Atom_[js.Promise[Value]],
    fallback: js.Function1[/* prev */ js.UndefOr[Value], PendingValue]
  ): Atom_[Awaited[Value] | PendingValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("unstable_unwrap")(anAtom.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Atom_[Awaited[Value] | PendingValue]]
}
