package typings.infernoCreateClass

import org.scalablytyped.runtime.StringDictionary
import typings.inferno.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inferno-create-class", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createClass[P, S](obj: ComponentSpec[P, S]): ClassicComponentClass[P, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("createClass")(obj.asInstanceOf[js.Any]).asInstanceOf[ClassicComponentClass[P, S]]
  
  @js.native
  trait ClassicComponent[P, S] extends Component[P, S] {
    
    var getInitialState: js.UndefOr[js.Function0[S]] = js.native
    
    def isMounted(): Boolean = js.native
    
    def replaceState(nextState: S): Unit = js.native
    def replaceState(nextState: S, callback: js.Function0[Any]): Unit = js.native
  }
  
  @js.native
  trait ClassicComponentClass[P, S] extends ComponentClass[P, S]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.Instantiable2 because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.Instantiable1 because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.Instantiable0 because Inheritance from two classes. Inlined  */ @js.native
  trait ComponentClass[P, S] extends Mixin[P, S] {
    
    var childContextTypes: js.UndefOr[js.Object] = js.native
    
    var contextTypes: js.UndefOr[js.Object] = js.native
    
    var defaultProps: js.UndefOr[P] = js.native
    
    @JSName("propTypes")
    var propTypes_ComponentClass: js.UndefOr[js.Object] = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
  - js.Any because Inheritance from two classes. Inlined 
  - scala.AnyRef because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined 
  - js.Any because Inheritance from two classes. Inlined 
  - org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
  - js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
  - org.scalablytyped.runtime.StringDictionary because Inheritance from two classes. Inlined  */ @js.native
  trait ComponentSpec[P, S] extends Mixin[P, S] {
    
    def render(props: P, context: Any): Any = js.native
  }
  
  @js.native
  trait Mixin[P, S] extends Component[P, S] {
    
    var getDefaultProps: js.UndefOr[js.Function0[P]] = js.native
    
    var getInitialState: js.UndefOr[js.Function0[S]] = js.native
    
    var mixins: js.UndefOr[Any] = js.native
    
    var propTypes: js.UndefOr[StringDictionary[js.Function]] = js.native
    
    var statics: js.UndefOr[StringDictionary[Any]] = js.native
  }
}
