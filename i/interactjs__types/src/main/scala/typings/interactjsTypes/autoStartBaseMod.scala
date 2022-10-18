package typings.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typings.interactjsTypes.anon.FnCallInteractableElementActionScope
import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.anon.InteractableAllowFrom
import typings.interactjsTypes.coreInteractionMod.Interaction
import typings.interactjsTypes.coreScopeMod.Plugin
import typings.interactjsTypes.coreScopeMod.Scope
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.ActionProps
import typings.interactjsTypes.coreTypesMod.CursorChecker
import typings.interactjsTypes.coreTypesMod.Element
import typings.interactjsTypes.interactjsTypesInts.`0`
import typings.interactjsTypes.interactjsTypesInts.`16`
import typings.interactjsTypes.interactjsTypesInts.`1`
import typings.interactjsTypes.interactjsTypesInts.`2`
import typings.interactjsTypes.interactjsTypesInts.`4`
import typings.interactjsTypes.interactjsTypesInts.`8`
import typings.interactjsTypes.interactjsTypesStrings.drag
import typings.interactjsTypes.interactjsTypesStrings.drop
import typings.interactjsTypes.interactjsTypesStrings.gesture
import typings.interactjsTypes.interactjsTypesStrings.interaction
import typings.interactjsTypes.interactjsTypesStrings.resize
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoStartBaseMod extends Shortcut {
  
  @JSImport("@interactjs/auto-start/base", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  trait AutoStart extends StObject {
    
    var cursorElement: Element
    
    var maxInteractions: Double
    
    @JSName("withinInteractionLimit")
    var withinInteractionLimit_Original: FnCallInteractableElementActionScope
    @JSName("withinInteractionLimit")
    def withinInteractionLimit_drag(interactable: InteractableAllowFrom, element: Element, action: ActionProps[drag], scope: Scope): Boolean
    @JSName("withinInteractionLimit")
    def withinInteractionLimit_drop(interactable: InteractableAllowFrom, element: Element, action: ActionProps[drop], scope: Scope): Boolean
    @JSName("withinInteractionLimit")
    def withinInteractionLimit_gesture(interactable: InteractableAllowFrom, element: Element, action: ActionProps[gesture], scope: Scope): Boolean
    @JSName("withinInteractionLimit")
    def withinInteractionLimit_resize(interactable: InteractableAllowFrom, element: Element, action: ActionProps[resize], scope: Scope): Boolean
  }
  object AutoStart {
    
    inline def apply(
      cursorElement: Element,
      maxInteractions: Double,
      withinInteractionLimit: FnCallInteractableElementActionScope
    ): AutoStart = {
      val __obj = js.Dynamic.literal(cursorElement = cursorElement.asInstanceOf[js.Any], maxInteractions = maxInteractions.asInstanceOf[js.Any], withinInteractionLimit = withinInteractionLimit.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoStart]
    }
    
    extension [Self <: AutoStart](x: Self) {
      
      inline def setCursorElement(value: Element): Self = StObject.set(x, "cursorElement", value.asInstanceOf[js.Any])
      
      inline def setMaxInteractions(value: Double): Self = StObject.set(x, "maxInteractions", value.asInstanceOf[js.Any])
      
      inline def setWithinInteractionLimit(value: FnCallInteractableElementActionScope): Self = StObject.set(x, "withinInteractionLimit", value.asInstanceOf[js.Any])
    }
  }
  
  trait CheckSignalArg extends StObject {
    
    var action: ActionProps[ActionName]
    
    var buttons: Double
    
    var element: Element
    
    var interactable: InteractableActions
    
    var interaction: Interaction[ActionName]
  }
  object CheckSignalArg {
    
    inline def apply(
      action: ActionProps[ActionName],
      buttons: Double,
      element: Element,
      interactable: InteractableActions,
      interaction: Interaction[ActionName]
    ): CheckSignalArg = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], interactable = interactable.asInstanceOf[js.Any], interaction = interaction.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckSignalArg]
    }
    
    extension [Self <: CheckSignalArg](x: Self) {
      
      inline def setAction(value: ActionProps[ActionName]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setInteractable(value: InteractableActions): Self = StObject.set(x, "interactable", value.asInstanceOf[js.Any])
      
      inline def setInteraction(value: Interaction[ActionName]): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `autoStartBaseMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object interactjsCoreInteractStaticAugmentingMod {
    
    trait InteractStatic extends StObject {
      
      def maxInteractions(newValue: Any): Any
    }
    object InteractStatic {
      
      inline def apply(maxInteractions: Any => Any): InteractStatic = {
        val __obj = js.Dynamic.literal(maxInteractions = js.Any.fromFunction1(maxInteractions))
        __obj.asInstanceOf[InteractStatic]
      }
      
      extension [Self <: InteractStatic](x: Self) {
        
        inline def setMaxInteractions(value: Any => Any): Self = StObject.set(x, "maxInteractions", js.Any.fromFunction1(value))
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreOptionsAugmentingMod {
    
    trait BaseDefaults extends StObject {
      
      var actionChecker: js.UndefOr[Any] = js.undefined
      
      var cursorChecker: js.UndefOr[Any] = js.undefined
      
      var styleCursor: js.UndefOr[Any] = js.undefined
    }
    object BaseDefaults {
      
      inline def apply(): BaseDefaults = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BaseDefaults]
      }
      
      extension [Self <: BaseDefaults](x: Self) {
        
        inline def setActionChecker(value: Any): Self = StObject.set(x, "actionChecker", value.asInstanceOf[js.Any])
        
        inline def setActionCheckerUndefined: Self = StObject.set(x, "actionChecker", js.undefined)
        
        inline def setCursorChecker(value: Any): Self = StObject.set(x, "cursorChecker", value.asInstanceOf[js.Any])
        
        inline def setCursorCheckerUndefined: Self = StObject.set(x, "cursorChecker", js.undefined)
        
        inline def setStyleCursor(value: Any): Self = StObject.set(x, "styleCursor", value.asInstanceOf[js.Any])
        
        inline def setStyleCursorUndefined: Self = StObject.set(x, "styleCursor", js.undefined)
      }
    }
    
    trait PerActionDefaults extends StObject {
      
      var allowFrom: js.UndefOr[String | Element] = js.undefined
      
      var cursorChecker: js.UndefOr[CursorChecker] = js.undefined
      
      var ignoreFrom: js.UndefOr[String | Element] = js.undefined
      
      var manualStart: js.UndefOr[Boolean] = js.undefined
      
      var max: js.UndefOr[Double] = js.undefined
      
      var maxPerElement: js.UndefOr[Double] = js.undefined
      
      var mouseButtons: js.UndefOr[`0` | `1` | `2` | `4` | `8` | `16`] = js.undefined
    }
    object PerActionDefaults {
      
      inline def apply(): PerActionDefaults = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PerActionDefaults]
      }
      
      extension [Self <: PerActionDefaults](x: Self) {
        
        inline def setAllowFrom(value: String | Element): Self = StObject.set(x, "allowFrom", value.asInstanceOf[js.Any])
        
        inline def setAllowFromUndefined: Self = StObject.set(x, "allowFrom", js.undefined)
        
        inline def setCursorChecker(
          value: (/* action */ ActionProps[ActionName], /* interactable */ InteractableActions, /* element */ Element, /* interacting */ Boolean) => String
        ): Self = StObject.set(x, "cursorChecker", js.Any.fromFunction4(value))
        
        inline def setCursorCheckerUndefined: Self = StObject.set(x, "cursorChecker", js.undefined)
        
        inline def setIgnoreFrom(value: String | Element): Self = StObject.set(x, "ignoreFrom", value.asInstanceOf[js.Any])
        
        inline def setIgnoreFromUndefined: Self = StObject.set(x, "ignoreFrom", js.undefined)
        
        inline def setManualStart(value: Boolean): Self = StObject.set(x, "manualStart", value.asInstanceOf[js.Any])
        
        inline def setManualStartUndefined: Self = StObject.set(x, "manualStart", js.undefined)
        
        inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        inline def setMaxPerElement(value: Double): Self = StObject.set(x, "maxPerElement", value.asInstanceOf[js.Any])
        
        inline def setMaxPerElementUndefined: Self = StObject.set(x, "maxPerElement", js.undefined)
        
        inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
        
        inline def setMouseButtons(value: `0` | `1` | `2` | `4` | `8` | `16`): Self = StObject.set(x, "mouseButtons", value.asInstanceOf[js.Any])
        
        inline def setMouseButtonsUndefined: Self = StObject.set(x, "mouseButtons", js.undefined)
      }
    }
  }
  
  /* augmented module */
  object interactjsCoreScopeAugmentingMod {
    
    trait Scope extends StObject {
      
      var autoStart: AutoStart
    }
    object Scope {
      
      inline def apply(autoStart: AutoStart): typings.interactjsTypes.autoStartBaseMod.interactjsCoreScopeAugmentingMod.Scope = {
        val __obj = js.Dynamic.literal(autoStart = autoStart.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.interactjsTypes.autoStartBaseMod.interactjsCoreScopeAugmentingMod.Scope]
      }
      
      extension [Self <: typings.interactjsTypes.autoStartBaseMod.interactjsCoreScopeAugmentingMod.Scope](x: Self) {
        
        inline def setAutoStart(value: AutoStart): Self = StObject.set(x, "autoStart", value.asInstanceOf[js.Any])
      }
    }
    
    trait SignalArgs extends StObject {
      
      @JSName("auto-start:check")
      var `auto-startColoncheck`: CheckSignalArg
      
      @JSName("autoStart:before-start")
      var `autoStartColonbefore-start`: (Omit[
            /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/auto-start/base.@interactjs/core/scope.SignalArgs['interactions:move'] */ js.Any, 
            interaction
          ]) & typings.interactjsTypes.anon.Interaction
      
      @JSName("autoStart:prepared")
      var autoStartColonprepared: typings.interactjsTypes.anon.Interaction
    }
    object SignalArgs {
      
      inline def apply(
        `auto-startColoncheck`: CheckSignalArg,
        `autoStartColonbefore-start`: (Omit[
              /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/auto-start/base.@interactjs/core/scope.SignalArgs['interactions:move'] */ js.Any, 
              interaction
            ]) & typings.interactjsTypes.anon.Interaction,
        autoStartColonprepared: typings.interactjsTypes.anon.Interaction
      ): SignalArgs = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("auto-start:check")(`auto-startColoncheck`.asInstanceOf[js.Any])
        __obj.updateDynamic("autoStart:before-start")(`autoStartColonbefore-start`.asInstanceOf[js.Any])
        __obj.updateDynamic("autoStart:prepared")(autoStartColonprepared.asInstanceOf[js.Any])
        __obj.asInstanceOf[SignalArgs]
      }
      
      extension [Self <: SignalArgs](x: Self) {
        
        inline def `setAuto-startColoncheck`(value: CheckSignalArg): Self = StObject.set(x, "auto-start:check", value.asInstanceOf[js.Any])
        
        inline def `setAutoStartColonbefore-start`(
          value: (Omit[
                  /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/auto-start/base.@interactjs/core/scope.SignalArgs['interactions:move'] */ js.Any, 
                  interaction
                ]) & typings.interactjsTypes.anon.Interaction
        ): Self = StObject.set(x, "autoStart:before-start", value.asInstanceOf[js.Any])
        
        inline def setAutoStartColonprepared(value: typings.interactjsTypes.anon.Interaction): Self = StObject.set(x, "autoStart:prepared", value.asInstanceOf[js.Any])
      }
    }
  }
}
