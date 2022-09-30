package typings.immer

import org.scalablytyped.runtime.StringDictionary
import typings.immer.anon.ApplyPatches
import typings.immer.anon.CreateES5Proxy
import typings.immer.anon.DraftedAnyMapMapState
import typings.immer.anon.DraftedAnyObjectES5ArrayS
import typings.immer.anon.DraftedAnyObjectES5Object
import typings.immer.anon.DraftedAnySetSetState
import typings.immer.anon.ProxyMap
import typings.immer.immerInts.`2`
import typings.immer.immerInts.`3`
import typings.immer.immerInts.`4`
import typings.immer.immerInts.`5`
import typings.immer.immerStrings.ES5
import typings.immer.immerStrings.MapSet
import typings.immer.immerStrings.Patches
import typings.immer.scopeMod.ImmerScope
import typings.immer.typesInternalMod.AnyMap
import typings.immer.typesInternalMod.AnyObject
import typings.immer.typesInternalMod.AnySet
import typings.immer.typesInternalMod.Drafted
import typings.immer.typesInternalMod.ImmerBaseState
import typings.immer.typesInternalMod.ImmerState
import typings.std.Exclude
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMod {
  
  @JSImport("immer/dist/utils/plugins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPlugin_ES5(pluginKey: ES5): Exclude[js.UndefOr[CreateES5Proxy], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginKey.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[CreateES5Proxy], Unit]]
  
  inline def getPlugin_MapSet(pluginKey: MapSet): Exclude[js.UndefOr[ProxyMap], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginKey.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[ProxyMap], Unit]]
  
  inline def getPlugin_Patches(pluginKey: Patches): Exclude[js.UndefOr[ApplyPatches], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(pluginKey.asInstanceOf[js.Any]).asInstanceOf[Exclude[js.UndefOr[ApplyPatches], Unit]]
  
  inline def loadPlugin_ES5(pluginKey: ES5): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")(pluginKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loadPlugin_ES5(pluginKey: ES5, implementation: CreateES5Proxy): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")(pluginKey.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loadPlugin_MapSet(pluginKey: MapSet): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")(pluginKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loadPlugin_MapSet(pluginKey: MapSet, implementation: ProxyMap): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")(pluginKey.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def loadPlugin_Patches(pluginKey: Patches): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")(pluginKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def loadPlugin_Patches(pluginKey: Patches, implementation: ApplyPatches): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadPlugin")(pluginKey.asInstanceOf[js.Any], implementation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ES5ArrayState
    extends StObject
       with ES5BaseState
       with ImmerState {
    
    var base_ : Any
    
    var copy_ : Any
    
    var draft_ : DraftedAnyObjectES5ArrayS
    
    var type_ : `5`
  }
  object ES5ArrayState {
    
    inline def apply(
      assigned_ : StringDictionary[Any],
      base_ : Any,
      copy_ : Any,
      draft_ : DraftedAnyObjectES5ArrayS,
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoked_ : Boolean,
      scope_ : ImmerScope
    ): ES5ArrayState = {
      val __obj = js.Dynamic.literal(assigned_ = assigned_.asInstanceOf[js.Any], base_ = base_.asInstanceOf[js.Any], copy_ = copy_.asInstanceOf[js.Any], draft_ = draft_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoked_ = revoked_.asInstanceOf[js.Any], scope_ = scope_.asInstanceOf[js.Any], type_ = 5)
      __obj.asInstanceOf[ES5ArrayState]
    }
    
    extension [Self <: ES5ArrayState](x: Self) {
      
      inline def setBase_(value: Any): Self = StObject.set(x, "base_", value.asInstanceOf[js.Any])
      
      inline def setCopy_(value: Any): Self = StObject.set(x, "copy_", value.asInstanceOf[js.Any])
      
      inline def setDraft_(value: DraftedAnyObjectES5ArrayS): Self = StObject.set(x, "draft_", value.asInstanceOf[js.Any])
      
      inline def setType_(value: `5`): Self = StObject.set(x, "type_", value.asInstanceOf[js.Any])
    }
  }
  
  /** ES5 Plugin */
  trait ES5BaseState
    extends StObject
       with ImmerBaseState {
    
    var assigned_ : StringDictionary[Any]
    
    var revoked_ : Boolean
  }
  object ES5BaseState {
    
    inline def apply(
      assigned_ : StringDictionary[Any],
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoked_ : Boolean,
      scope_ : ImmerScope
    ): ES5BaseState = {
      val __obj = js.Dynamic.literal(assigned_ = assigned_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoked_ = revoked_.asInstanceOf[js.Any], scope_ = scope_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ES5BaseState]
    }
    
    extension [Self <: ES5BaseState](x: Self) {
      
      inline def setAssigned_(value: StringDictionary[Any]): Self = StObject.set(x, "assigned_", value.asInstanceOf[js.Any])
      
      inline def setRevoked_(value: Boolean): Self = StObject.set(x, "revoked_", value.asInstanceOf[js.Any])
    }
  }
  
  trait ES5ObjectState
    extends StObject
       with ES5BaseState
       with ImmerState {
    
    var base_ : AnyObject
    
    var copy_ : AnyObject | Null
    
    var draft_ : DraftedAnyObjectES5Object
    
    var type_ : `4`
  }
  object ES5ObjectState {
    
    inline def apply(
      assigned_ : StringDictionary[Any],
      base_ : AnyObject,
      draft_ : DraftedAnyObjectES5Object,
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoked_ : Boolean,
      scope_ : ImmerScope
    ): ES5ObjectState = {
      val __obj = js.Dynamic.literal(assigned_ = assigned_.asInstanceOf[js.Any], base_ = base_.asInstanceOf[js.Any], draft_ = draft_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoked_ = revoked_.asInstanceOf[js.Any], scope_ = scope_.asInstanceOf[js.Any], type_ = 4, copy_ = null)
      __obj.asInstanceOf[ES5ObjectState]
    }
    
    extension [Self <: ES5ObjectState](x: Self) {
      
      inline def setBase_(value: AnyObject): Self = StObject.set(x, "base_", value.asInstanceOf[js.Any])
      
      inline def setCopy_(value: AnyObject): Self = StObject.set(x, "copy_", value.asInstanceOf[js.Any])
      
      inline def setCopy_Null: Self = StObject.set(x, "copy_", null)
      
      inline def setDraft_(value: DraftedAnyObjectES5Object): Self = StObject.set(x, "draft_", value.asInstanceOf[js.Any])
      
      inline def setType_(value: `4`): Self = StObject.set(x, "type_", value.asInstanceOf[js.Any])
    }
  }
  
  trait MapState
    extends StObject
       with ImmerBaseState
       with ImmerState {
    
    var assigned_ : js.UndefOr[Map[Any, Boolean]] = js.undefined
    
    var base_ : AnyMap
    
    var copy_ : js.UndefOr[AnyMap] = js.undefined
    
    var draft_ : DraftedAnyMapMapState
    
    var revoked_ : Boolean
    
    var type_ : `2`
  }
  object MapState {
    
    inline def apply(
      base_ : AnyMap,
      draft_ : DraftedAnyMapMapState,
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoked_ : Boolean,
      scope_ : ImmerScope
    ): MapState = {
      val __obj = js.Dynamic.literal(base_ = base_.asInstanceOf[js.Any], draft_ = draft_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoked_ = revoked_.asInstanceOf[js.Any], scope_ = scope_.asInstanceOf[js.Any], type_ = 2)
      __obj.asInstanceOf[MapState]
    }
    
    extension [Self <: MapState](x: Self) {
      
      inline def setAssigned_(value: Map[Any, Boolean]): Self = StObject.set(x, "assigned_", value.asInstanceOf[js.Any])
      
      inline def setAssigned_Undefined: Self = StObject.set(x, "assigned_", js.undefined)
      
      inline def setBase_(value: AnyMap): Self = StObject.set(x, "base_", value.asInstanceOf[js.Any])
      
      inline def setCopy_(value: AnyMap): Self = StObject.set(x, "copy_", value.asInstanceOf[js.Any])
      
      inline def setCopy_Undefined: Self = StObject.set(x, "copy_", js.undefined)
      
      inline def setDraft_(value: DraftedAnyMapMapState): Self = StObject.set(x, "draft_", value.asInstanceOf[js.Any])
      
      inline def setRevoked_(value: Boolean): Self = StObject.set(x, "revoked_", value.asInstanceOf[js.Any])
      
      inline def setType_(value: `2`): Self = StObject.set(x, "type_", value.asInstanceOf[js.Any])
    }
  }
  
  type PatchPath = js.Array[String | Double]
  
  trait Plugins extends StObject {
    
    var ES5: js.UndefOr[CreateES5Proxy] = js.undefined
    
    var MapSet: js.UndefOr[ProxyMap] = js.undefined
    
    var Patches: js.UndefOr[ApplyPatches] = js.undefined
  }
  object Plugins {
    
    inline def apply(): Plugins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugins]
    }
    
    extension [Self <: Plugins](x: Self) {
      
      inline def setES5(value: CreateES5Proxy): Self = StObject.set(x, "ES5", value.asInstanceOf[js.Any])
      
      inline def setES5Undefined: Self = StObject.set(x, "ES5", js.undefined)
      
      inline def setMapSet(value: ProxyMap): Self = StObject.set(x, "MapSet", value.asInstanceOf[js.Any])
      
      inline def setMapSetUndefined: Self = StObject.set(x, "MapSet", js.undefined)
      
      inline def setPatches(value: ApplyPatches): Self = StObject.set(x, "Patches", value.asInstanceOf[js.Any])
      
      inline def setPatchesUndefined: Self = StObject.set(x, "Patches", js.undefined)
    }
  }
  
  trait SetState
    extends StObject
       with ImmerBaseState
       with ImmerState {
    
    var base_ : AnySet
    
    var copy_ : js.UndefOr[AnySet] = js.undefined
    
    var draft_ : DraftedAnySetSetState
    
    var drafts_ : Map[Any, Drafted[Any, ImmerState]]
    
    var revoked_ : Boolean
    
    var type_ : `3`
  }
  object SetState {
    
    inline def apply(
      base_ : AnySet,
      draft_ : DraftedAnySetSetState,
      drafts_ : Map[Any, Drafted[Any, ImmerState]],
      finalized_ : Boolean,
      isManual_ : Boolean,
      modified_ : Boolean,
      revoked_ : Boolean,
      scope_ : ImmerScope
    ): SetState = {
      val __obj = js.Dynamic.literal(base_ = base_.asInstanceOf[js.Any], draft_ = draft_.asInstanceOf[js.Any], drafts_ = drafts_.asInstanceOf[js.Any], finalized_ = finalized_.asInstanceOf[js.Any], isManual_ = isManual_.asInstanceOf[js.Any], modified_ = modified_.asInstanceOf[js.Any], revoked_ = revoked_.asInstanceOf[js.Any], scope_ = scope_.asInstanceOf[js.Any], type_ = 3)
      __obj.asInstanceOf[SetState]
    }
    
    extension [Self <: SetState](x: Self) {
      
      inline def setBase_(value: AnySet): Self = StObject.set(x, "base_", value.asInstanceOf[js.Any])
      
      inline def setCopy_(value: AnySet): Self = StObject.set(x, "copy_", value.asInstanceOf[js.Any])
      
      inline def setCopy_Undefined: Self = StObject.set(x, "copy_", js.undefined)
      
      inline def setDraft_(value: DraftedAnySetSetState): Self = StObject.set(x, "draft_", value.asInstanceOf[js.Any])
      
      inline def setDrafts_(value: Map[Any, Drafted[Any, ImmerState]]): Self = StObject.set(x, "drafts_", value.asInstanceOf[js.Any])
      
      inline def setRevoked_(value: Boolean): Self = StObject.set(x, "revoked_", value.asInstanceOf[js.Any])
      
      inline def setType_(value: `3`): Self = StObject.set(x, "type_", value.asInstanceOf[js.Any])
    }
  }
}
