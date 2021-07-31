package typings.ink

import typings.ink.anon.ChildrenRequireable
import typings.ink.stylesMod.Styles
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deprecatedStaticMod {
  
  @JSImport("ink/build/components/DeprecatedStatic", "DeprecatedStatic")
  @js.native
  class DeprecatedStatic protected ()
    extends Component[Styles, State, js.Any] {
    def this(props: Styles) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Styles, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MDeprecatedStatic(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDeprecatedStatic(_prevProps: Styles, prevState: State): Unit = js.native
    
    def saveLastIndex(children: ReactNode): Unit = js.native
  }
  /* static members */
  object DeprecatedStatic {
    
    @JSImport("ink/build/components/DeprecatedStatic", "DeprecatedStatic")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ink/build/components/DeprecatedStatic", "DeprecatedStatic.propTypes")
    @js.native
    def propTypes: ChildrenRequireable = js.native
    @scala.inline
    def propTypes_=(x: ChildrenRequireable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait State extends StObject {
    
    var lastIndex: Double | Null
  }
  object State {
    
    @scala.inline
    def apply(): State = {
      val __obj = js.Dynamic.literal(lastIndex = null)
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastIndexNull: Self = StObject.set(x, "lastIndex", null)
    }
  }
}
