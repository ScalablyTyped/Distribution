package typings.immer

import typings.immer.distInternalMod.Immer
import typings.immer.distTypesTypesExternalMod.Patch
import typings.immer.distTypesTypesExternalMod.PatchListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreScopeMod {
  
  @JSImport("immer/dist/core/scope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def enterScope(immer: Immer): ImmerScope = ^.asInstanceOf[js.Dynamic].applyDynamic("enterScope")(immer.asInstanceOf[js.Any]).asInstanceOf[ImmerScope]
  
  inline def getCurrentScope(): ImmerScope = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentScope")().asInstanceOf[ImmerScope]
  
  inline def leaveScope(scope: ImmerScope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("leaveScope")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def revokeScope(scope: ImmerScope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("revokeScope")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def usePatchesInScope(scope: ImmerScope): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("usePatchesInScope")(scope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def usePatchesInScope(scope: ImmerScope, patchListener: PatchListener): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("usePatchesInScope")(scope.asInstanceOf[js.Any], patchListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ImmerScope extends StObject {
    
    var canAutoFreeze_ : Boolean
    
    var drafts_ : js.Array[Any]
    
    var immer_ : Immer
    
    var inversePatches_ : js.UndefOr[js.Array[Patch]] = js.undefined
    
    var parent_ : js.UndefOr[ImmerScope] = js.undefined
    
    var patchListener_ : js.UndefOr[PatchListener] = js.undefined
    
    var patches_ : js.UndefOr[js.Array[Patch]] = js.undefined
    
    var unfinalizedDrafts_ : Double
  }
  object ImmerScope {
    
    inline def apply(canAutoFreeze_ : Boolean, drafts_ : js.Array[Any], immer_ : Immer, unfinalizedDrafts_ : Double): ImmerScope = {
      val __obj = js.Dynamic.literal(canAutoFreeze_ = canAutoFreeze_.asInstanceOf[js.Any], drafts_ = drafts_.asInstanceOf[js.Any], immer_ = immer_.asInstanceOf[js.Any], unfinalizedDrafts_ = unfinalizedDrafts_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImmerScope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImmerScope] (val x: Self) extends AnyVal {
      
      inline def setCanAutoFreeze_(value: Boolean): Self = StObject.set(x, "canAutoFreeze_", value.asInstanceOf[js.Any])
      
      inline def setDrafts_(value: js.Array[Any]): Self = StObject.set(x, "drafts_", value.asInstanceOf[js.Any])
      
      inline def setDrafts_Varargs(value: Any*): Self = StObject.set(x, "drafts_", js.Array(value*))
      
      inline def setImmer_(value: Immer): Self = StObject.set(x, "immer_", value.asInstanceOf[js.Any])
      
      inline def setInversePatches_(value: js.Array[Patch]): Self = StObject.set(x, "inversePatches_", value.asInstanceOf[js.Any])
      
      inline def setInversePatches_Undefined: Self = StObject.set(x, "inversePatches_", js.undefined)
      
      inline def setInversePatches_Varargs(value: Patch*): Self = StObject.set(x, "inversePatches_", js.Array(value*))
      
      inline def setParent_(value: ImmerScope): Self = StObject.set(x, "parent_", value.asInstanceOf[js.Any])
      
      inline def setParent_Undefined: Self = StObject.set(x, "parent_", js.undefined)
      
      inline def setPatchListener_(value: (/* patches */ js.Array[Patch], /* inversePatches */ js.Array[Patch]) => Unit): Self = StObject.set(x, "patchListener_", js.Any.fromFunction2(value))
      
      inline def setPatchListener_Undefined: Self = StObject.set(x, "patchListener_", js.undefined)
      
      inline def setPatches_(value: js.Array[Patch]): Self = StObject.set(x, "patches_", value.asInstanceOf[js.Any])
      
      inline def setPatches_Undefined: Self = StObject.set(x, "patches_", js.undefined)
      
      inline def setPatches_Varargs(value: Patch*): Self = StObject.set(x, "patches_", js.Array(value*))
      
      inline def setUnfinalizedDrafts_(value: Double): Self = StObject.set(x, "unfinalizedDrafts_", value.asInstanceOf[js.Any])
    }
  }
}
