package typings.inferno

import typings.inferno.anon.ReadonlychildrenInfernoNo
import typings.inferno.typesMod.IComponent
import typings.inferno.typesMod.Inferno.StatelessComponent
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("inferno/dist/core/component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("inferno/dist/core/component", "Component")
  @js.native
  open class Component[P, S] ()
    extends StObject
       with IComponent[P, S] {
    def this(props: P) = this()
    def this(props: P, context: Any) = this()
    def this(props: Unit, context: Any) = this()
    
    @JSName("$BR")
    var $BR: Boolean = js.native
    
    @JSName("$BS")
    var $BS: Boolean = js.native
    
    @JSName("$CX")
    var $CX: Any = js.native
    
    @JSName("$F")
    var $F: Boolean = js.native
    
    @JSName("$L")
    var $L: js.Array[js.Function] | Null = js.native
    
    @JSName("$LI")
    var $LI: Any = js.native
    
    @JSName("$N")
    var $N: Boolean = js.native
    
    @JSName("$PS")
    var $PS: Partial[S] | Null = js.native
    
    @JSName("$QU")
    var $QU: js.Array[js.Function] | Null = js.native
    
    @JSName("$SSR")
    var $SSR: js.UndefOr[Boolean] = js.native
    
    @JSName("$SVG")
    var $SVG: Boolean = js.native
    
    @JSName("$UN")
    var $UN: Boolean = js.native
    
    @JSName("props")
    var props_Component: ReadonlychildrenInfernoNo & P = js.native
  }
  /* static members */
  object Component {
    
    @JSImport("inferno/dist/core/component", "Component")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("inferno/dist/core/component", "Component.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[js.Object] = js.native
    inline def defaultProps_=(x: js.UndefOr[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("inferno/dist/core/component", "Component.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps: js.UndefOr[js.Function2[/* nextProps */ Any, /* state */ Any, Any]] = js.native
    inline def getDerivedStateFromProps_=(x: js.UndefOr[js.Function2[/* nextProps */ Any, /* state */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
  }
  
  inline def rerender(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rerender")().asInstanceOf[Unit]
  
  type ComponentType[P] = (Component[P, js.Object]) | StatelessComponent[P]
}
