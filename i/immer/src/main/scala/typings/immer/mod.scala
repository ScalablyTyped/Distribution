package typings.immer

import typings.immer.anon.AutoFreeze
import typings.immer.distTypesTypesExternalMod.Draft
import typings.immer.distTypesTypesExternalMod.IProduce
import typings.immer.distTypesTypesExternalMod.IProduceWithPatches
import typings.immer.distTypesTypesExternalMod.Immutable
import typings.immer.distTypesTypesExternalMod.Patch
import typings.immer.distTypesTypesExternalMod.PatchListener
import typings.immer.distTypesTypesInternalMod.Objectish
import typings.immer.distUtilsEnvMod.Nothing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("immer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("immer", JSImport.Default)
  @js.native
  val default: IProduce = js.native
  
  @JSImport("immer", "Immer")
  @js.native
  open class Immer ()
    extends typings.immer.distInternalMod.Immer {
    def this(config: AutoFreeze) = this()
  }
  
  inline def applyPatches[T /* <: Objectish */](base: T, patches: js.Array[Patch]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPatches")(base.asInstanceOf[js.Any], patches.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def castDraft[T](value: T): Draft[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("castDraft")(value.asInstanceOf[js.Any]).asInstanceOf[Draft[T]]
  
  inline def castImmutable[T](value: T): Immutable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("castImmutable")(value.asInstanceOf[js.Any]).asInstanceOf[Immutable[T]]
  
  inline def createDraft[T /* <: Objectish */](base: T): Draft[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDraft")(base.asInstanceOf[js.Any]).asInstanceOf[Draft[T]]
  
  inline def current[T](value: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("current")(value.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def enableAllPlugins(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableAllPlugins")().asInstanceOf[Unit]
  
  inline def enableES5(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableES5")().asInstanceOf[Unit]
  
  inline def enableMapSet(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableMapSet")().asInstanceOf[Unit]
  
  inline def enablePatches(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enablePatches")().asInstanceOf[Unit]
  
  inline def finishDraft[D /* <: Any */](draft: D): /* import warning: importer.ImportType#apply Failed type conversion: D extends immer.immer/dist/types/types-external.Draft<infer T> ? T : never */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("finishDraft")(draft.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: D extends immer.immer/dist/types/types-external.Draft<infer T> ? T : never */ js.Any]
  inline def finishDraft[D /* <: Any */](draft: D, patchListener: PatchListener): /* import warning: importer.ImportType#apply Failed type conversion: D extends immer.immer/dist/types/types-external.Draft<infer T> ? T : never */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("finishDraft")(draft.asInstanceOf[js.Any], patchListener.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: D extends immer.immer/dist/types/types-external.Draft<infer T> ? T : never */ js.Any]
  
  inline def freeze[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("freeze")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def freeze[T](obj: T, deep: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("freeze")(obj.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[T]
  
  @JSImport("immer", "immerable")
  @js.native
  val immerable: js.Symbol = js.native
  
  inline def isDraft(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDraft")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDraftable(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDraftable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("immer", "nothing")
  @js.native
  val nothing: Nothing = js.native
  
  inline def original[T](value: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("original")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  @JSImport("immer", "produce")
  @js.native
  val produce: IProduce = js.native
  
  @JSImport("immer", "produceWithPatches")
  @js.native
  val produceWithPatches: IProduceWithPatches = js.native
  
  inline def setAutoFreeze(value: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAutoFreeze")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUseProxies(value: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUseProxies")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
