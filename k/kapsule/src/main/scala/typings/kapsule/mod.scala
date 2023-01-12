package typings.kapsule

import org.scalablytyped.runtime.StringDictionary
import typings.kapsule.anon.PartialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kapsule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): KapsuleClosure = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[KapsuleClosure]
  inline def default(cfg: KapsuleCfg): KapsuleClosure = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(cfg.asInstanceOf[js.Any]).asInstanceOf[KapsuleClosure]
  
  type InitOptions = js.Object
  
  @js.native
  trait KapsuleCfg extends StObject {
    
    var aliases: js.UndefOr[StringDictionary[String]] = js.native
    
    var init: js.UndefOr[
        js.Function3[
          /* contructorItem */ js.UndefOr[Any], 
          /* state */ js.UndefOr[State], 
          /* initOptions */ js.UndefOr[InitOptions], 
          Unit
        ]
      ] = js.native
    
    var methods: js.UndefOr[StringDictionary[MethodCfg]] = js.native
    
    var props: js.UndefOr[StringDictionary[PropCfg]] = js.native
    
    var stateInit: js.UndefOr[js.Function1[/* initOptions */ js.UndefOr[InitOptions], PartialState]] = js.native
    
    def update(): Unit = js.native
    def update(state: Unit, changedProps: StringDictionary[PropVal]): Unit = js.native
    def update(state: State): Unit = js.native
    def update(state: State, changedProps: StringDictionary[PropVal]): Unit = js.native
  }
  
  type KapsuleClosure = js.Function1[/* initOptions */ js.UndefOr[InitOptions], KapsuleInstance]
  
  @js.native
  trait KapsuleInstance
    extends StObject
       with /* propOrMethod */ StringDictionary[PropGetter | PropSetter | KapsuleMethod] {
    
    def apply(constructorItem: Any): KapsuleInstance = js.native
    
    def resetProps(): KapsuleInstance = js.native
  }
  
  @js.native
  trait KapsuleMethod extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  @js.native
  trait MethodCfg extends StObject {
    
    def apply(state: State, args: Any*): Any = js.native
  }
  
  trait PropCfg extends StObject {
    
    var default: js.UndefOr[PropVal] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function3[/* newVal */ PropVal, /* state */ State, /* prevVal */ PropVal, Unit]
      ] = js.undefined
    
    var triggerUpdate: js.UndefOr[Boolean] = js.undefined
  }
  object PropCfg {
    
    inline def apply(): PropCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropCfg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PropCfg] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: PropVal): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setOnChange(value: (/* newVal */ PropVal, /* state */ State, /* prevVal */ PropVal) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction3(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setTriggerUpdate(value: Boolean): Self = StObject.set(x, "triggerUpdate", value.asInstanceOf[js.Any])
      
      inline def setTriggerUpdateUndefined: Self = StObject.set(x, "triggerUpdate", js.undefined)
    }
  }
  
  type PropGetter = js.Function0[PropVal]
  
  type PropSetter = js.Function1[/* val */ PropVal, KapsuleInstance]
  
  type PropVal = Any
  
  trait State
    extends StObject
       with /* stateItem */ StringDictionary[StateVal] {
    
    def _rerender(): Unit
    
    var initialised: Boolean
  }
  object State {
    
    inline def apply(_rerender: () => Unit, initialised: Boolean): State = {
      val __obj = js.Dynamic.literal(_rerender = js.Any.fromFunction0(_rerender), initialised = initialised.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      inline def setInitialised(value: Boolean): Self = StObject.set(x, "initialised", value.asInstanceOf[js.Any])
      
      inline def set_rerender(value: () => Unit): Self = StObject.set(x, "_rerender", js.Any.fromFunction0(value))
    }
  }
  
  type StateVal = Any
}
