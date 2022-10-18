package typings.immer

import org.scalablytyped.runtime.StringDictionary
import typings.immer.anon.Base
import typings.immer.anon.DraftedAnyArrayProxyArray
import typings.immer.anon.DraftedAnyObjectProxyObje
import typings.immer.distCoreScopeMod.ImmerScope
import typings.immer.distTypesTypesInternalMod.AnyArray
import typings.immer.distTypesTypesInternalMod.Drafted
import typings.immer.distTypesTypesInternalMod.ImmerBaseState
import typings.immer.distTypesTypesInternalMod.ImmerState
import typings.immer.distTypesTypesInternalMod.Objectish
import typings.immer.immerInts.`0`
import typings.immer.immerInts.`1`
import typings.std.ProxyHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreProxyMod {
  
  @JSImport("immer/dist/core/proxy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createProxyProxy[T /* <: Objectish */](base: T): Drafted[T, ProxyState] = ^.asInstanceOf[js.Dynamic].applyDynamic("createProxyProxy")(base.asInstanceOf[js.Any]).asInstanceOf[Drafted[T, ProxyState]]
  inline def createProxyProxy[T /* <: Objectish */](base: T, parent: ImmerState): Drafted[T, ProxyState] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProxyProxy")(base.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Drafted[T, ProxyState]]
  
  inline def markChanged(state: ImmerState): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markChanged")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("immer/dist/core/proxy", "objectTraps")
  @js.native
  val objectTraps: ProxyHandler[ProxyState] = js.native
  
  inline def prepareCopy(state: Base): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareCopy")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ProxyArrayState
    extends StObject
       with ProxyBaseState
       with ImmerState
       with ProxyState {
    
    var base_ : AnyArray
    
    var copy_ : AnyArray | Null
    
    var draft_ : DraftedAnyArrayProxyArray
    
    var type_ : `1`
  }
  object ProxyArrayState {
    
    inline def apply(
      assigned_ : StringDictionary[Boolean],
      base_ : AnyArray,
      draft_ : DraftedAnyArrayProxyArray,
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoke_ : () => Unit,
      scope_ : ImmerScope
    ): ProxyArrayState = {
      val __obj = js.Dynamic.literal(assigned_ = assigned_.asInstanceOf[js.Any], base_ = base_.asInstanceOf[js.Any], draft_ = draft_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoke_ = js.Any.fromFunction0(revoke_), scope_ = scope_.asInstanceOf[js.Any], type_ = 1, copy_ = null)
      __obj.asInstanceOf[ProxyArrayState]
    }
    
    extension [Self <: ProxyArrayState](x: Self) {
      
      inline def setBase_(value: AnyArray): Self = StObject.set(x, "base_", value.asInstanceOf[js.Any])
      
      inline def setBase_Varargs(value: Any*): Self = StObject.set(x, "base_", js.Array(value*))
      
      inline def setCopy_(value: AnyArray): Self = StObject.set(x, "copy_", value.asInstanceOf[js.Any])
      
      inline def setCopy_Null: Self = StObject.set(x, "copy_", null)
      
      inline def setCopy_Varargs(value: Any*): Self = StObject.set(x, "copy_", js.Array(value*))
      
      inline def setDraft_(value: DraftedAnyArrayProxyArray): Self = StObject.set(x, "draft_", value.asInstanceOf[js.Any])
      
      inline def setType_(value: `1`): Self = StObject.set(x, "type_", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProxyBaseState
    extends StObject
       with ImmerBaseState {
    
    var assigned_ : StringDictionary[Boolean]
    
    def revoke_(): Unit
  }
  object ProxyBaseState {
    
    inline def apply(
      assigned_ : StringDictionary[Boolean],
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoke_ : () => Unit,
      scope_ : ImmerScope
    ): ProxyBaseState = {
      val __obj = js.Dynamic.literal(assigned_ = assigned_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoke_ = js.Any.fromFunction0(revoke_), scope_ = scope_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyBaseState]
    }
    
    extension [Self <: ProxyBaseState](x: Self) {
      
      inline def setAssigned_(value: StringDictionary[Boolean]): Self = StObject.set(x, "assigned_", value.asInstanceOf[js.Any])
      
      inline def setRevoke_(value: () => Unit): Self = StObject.set(x, "revoke_", js.Any.fromFunction0(value))
    }
  }
  
  trait ProxyObjectState
    extends StObject
       with ProxyBaseState
       with ImmerState
       with ProxyState {
    
    var base_ : Any
    
    var copy_ : Any
    
    var draft_ : DraftedAnyObjectProxyObje
    
    var type_ : `0`
  }
  object ProxyObjectState {
    
    inline def apply(
      assigned_ : StringDictionary[Boolean],
      base_ : Any,
      copy_ : Any,
      draft_ : DraftedAnyObjectProxyObje,
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoke_ : () => Unit,
      scope_ : ImmerScope
    ): ProxyObjectState = {
      val __obj = js.Dynamic.literal(assigned_ = assigned_.asInstanceOf[js.Any], base_ = base_.asInstanceOf[js.Any], copy_ = copy_.asInstanceOf[js.Any], draft_ = draft_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoke_ = js.Any.fromFunction0(revoke_), scope_ = scope_.asInstanceOf[js.Any], type_ = 0)
      __obj.asInstanceOf[ProxyObjectState]
    }
    
    extension [Self <: ProxyObjectState](x: Self) {
      
      inline def setBase_(value: Any): Self = StObject.set(x, "base_", value.asInstanceOf[js.Any])
      
      inline def setCopy_(value: Any): Self = StObject.set(x, "copy_", value.asInstanceOf[js.Any])
      
      inline def setDraft_(value: DraftedAnyObjectProxyObje): Self = StObject.set(x, "draft_", value.asInstanceOf[js.Any])
      
      inline def setType_(value: `0`): Self = StObject.set(x, "type_", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.immer.distCoreProxyMod.ProxyObjectState
    - typings.immer.distCoreProxyMod.ProxyArrayState
  */
  trait ProxyState extends StObject
  object ProxyState {
    
    inline def ProxyArrayState(
      assigned_ : StringDictionary[Boolean],
      base_ : AnyArray,
      draft_ : DraftedAnyArrayProxyArray,
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoke_ : () => Unit,
      scope_ : ImmerScope
    ): typings.immer.distCoreProxyMod.ProxyArrayState = {
      val __obj = js.Dynamic.literal(assigned_ = assigned_.asInstanceOf[js.Any], base_ = base_.asInstanceOf[js.Any], draft_ = draft_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoke_ = js.Any.fromFunction0(revoke_), scope_ = scope_.asInstanceOf[js.Any], type_ = 1, copy_ = null)
      __obj.asInstanceOf[typings.immer.distCoreProxyMod.ProxyArrayState]
    }
    
    inline def ProxyObjectState(
      assigned_ : StringDictionary[Boolean],
      base_ : Any,
      copy_ : Any,
      draft_ : DraftedAnyObjectProxyObje,
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoke_ : () => Unit,
      scope_ : ImmerScope
    ): typings.immer.distCoreProxyMod.ProxyObjectState = {
      val __obj = js.Dynamic.literal(assigned_ = assigned_.asInstanceOf[js.Any], base_ = base_.asInstanceOf[js.Any], copy_ = copy_.asInstanceOf[js.Any], draft_ = draft_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoke_ = js.Any.fromFunction0(revoke_), scope_ = scope_.asInstanceOf[js.Any], type_ = 0)
      __obj.asInstanceOf[typings.immer.distCoreProxyMod.ProxyObjectState]
    }
  }
}
