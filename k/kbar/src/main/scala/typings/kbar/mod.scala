package typings.kbar

import typings.kbar.actionImplMod.ActionImplOptions
import typings.kbar.actionInterfaceMod.ActionInterfaceOptions
import typings.kbar.anon.InputHTMLAttributesHTMLIn
import typings.kbar.anon.OmitActionid
import typings.kbar.anon.Results
import typings.kbar.kbaranimatorMod.KBarAnimatorProps
import typings.kbar.kbarportalMod.Props
import typings.kbar.kbarresultsMod.KBarResultsProps
import typings.kbar.typesMod.Action
import typings.kbar.typesMod.IKBarContext
import typings.kbar.typesMod.KBarProviderProps
import typings.kbar.typesMod.KBarState
import typings.kbar.useKBarMod.useKBarReturnType
import typings.react.mod.Context
import typings.react.mod.DependencyList
import typings.react.mod.FC
import typings.react.mod.PropsWithChildren
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("kbar", "ActionImpl")
  @js.native
  open class ActionImpl protected ()
    extends typings.kbar.actionMod.ActionImpl {
    def this(action: Action, options: ActionImplOptions) = this()
  }
  /* static members */
  object ActionImpl {
    
    @JSImport("kbar", "ActionImpl")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(action: Action, options: ActionImplOptions): typings.kbar.actionImplMod.ActionImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(action.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.kbar.actionImplMod.ActionImpl]
  }
  
  @JSImport("kbar", "ActionInterface")
  @js.native
  open class ActionInterface ()
    extends typings.kbar.actionMod.ActionInterface {
    def this(actions: js.Array[Action]) = this()
    def this(actions: js.Array[Action], options: ActionInterfaceOptions) = this()
    def this(actions: Unit, options: ActionInterfaceOptions) = this()
  }
  
  @JSImport("kbar", "KBAR_LISTBOX")
  @js.native
  val KBAR_LISTBOX: /* "kbar-listbox" */ String = js.native
  
  @JSImport("kbar", "KBarAnimator")
  @js.native
  val KBarAnimator: FC[PropsWithChildren[KBarAnimatorProps]] = js.native
  
  @JSImport("kbar", "KBarContext")
  @js.native
  val KBarContext: Context[IKBarContext] = js.native
  
  inline def KBarPortal(props: Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("KBarPortal")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @JSImport("kbar", "KBarPositioner")
  @js.native
  val KBarPositioner: FC[PropsWithChildren[typings.kbar.kbarpositionerMod.Props]] = js.native
  
  @JSImport("kbar", "KBarProvider")
  @js.native
  val KBarProvider: FC[PropsWithChildren[KBarProviderProps]] = js.native
  
  @JSImport("kbar", "KBarResults")
  @js.native
  val KBarResults: FC[KBarResultsProps] = js.native
  
  inline def KBarSearch(props: InputHTMLAttributesHTMLIn): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("KBarSearch")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object NO_GROUP {
    
    @JSImport("kbar", "NO_GROUP")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("kbar", "NO_GROUP.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("kbar", "NO_GROUP.priority")
    @js.native
    def priority: Double = js.native
    inline def priority_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("priority")(x.asInstanceOf[js.Any])
  }
  
  object Priority {
    
    @JSImport("kbar", "Priority")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("kbar", "Priority.HIGH")
    @js.native
    def HIGH: Double = js.native
    inline def HIGH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIGH")(x.asInstanceOf[js.Any])
    
    @JSImport("kbar", "Priority.LOW")
    @js.native
    def LOW: Double = js.native
    inline def LOW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOW")(x.asInstanceOf[js.Any])
    
    @JSImport("kbar", "Priority.NORMAL")
    @js.native
    def NORMAL: Double = js.native
    inline def NORMAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("kbar", "VisualState")
  @js.native
  object VisualState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.kbar.typesMod.VisualState & String] = js.native
    
    /* "animating-in" */ val animatingIn: typings.kbar.typesMod.VisualState.animatingIn & String = js.native
    
    /* "animating-out" */ val animatingOut: typings.kbar.typesMod.VisualState.animatingOut & String = js.native
    
    /* "hidden" */ val hidden: typings.kbar.typesMod.VisualState.hidden & String = js.native
    
    /* "showing" */ val showing: typings.kbar.typesMod.VisualState.showing & String = js.native
  }
  
  inline def createAction(params: OmitActionid): Action = ^.asInstanceOf[js.Dynamic].applyDynamic("createAction")(params.asInstanceOf[js.Any]).asInstanceOf[Action]
  
  inline def getListboxItemId(id: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListboxItemId")(id.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("kbar", "useDeepMatches")
  @js.native
  val useDeepMatches: js.Function0[Results] = js.native
  
  inline def useKBar[C](): useKBarReturnType[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKBar")().asInstanceOf[useKBarReturnType[C]]
  inline def useKBar[C](collector: js.Function1[/* state */ KBarState, C]): useKBarReturnType[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("useKBar")(collector.asInstanceOf[js.Any]).asInstanceOf[useKBarReturnType[C]]
  
  inline def useMatches(): Results = ^.asInstanceOf[js.Dynamic].applyDynamic("useMatches")().asInstanceOf[Results]
  
  inline def useRegisterActions(actions: js.Array[Action]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useRegisterActions")(actions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useRegisterActions(actions: js.Array[Action], dependencies: DependencyList): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useRegisterActions")(actions.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
