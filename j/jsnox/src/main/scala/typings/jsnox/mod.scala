package typings.jsnox

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DOMElement
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("jsnox", JSImport.Namespace)
  @js.native
  val ^ : Module = js.native
  
  @js.native
  trait CreateElement extends StObject {
    
    /**
      * Renders a React component, with optional props and children
      * @param component A plain React component (created from React.createClass()) or
      * component factory (created from React.createFactory())
      * @param props Props object to pass to the component
      * @param children A single React node (string or ReactElement) or array of nodes.
      * Note that unlike with React itself, multiple children must be placed into an array.
      */
    def apply[P](component: ComponentClass[P, ComponentState]): ReactElement = js.native
    /**
      * Renders a React component, with children but no props
      * @param component A plain React component (created from React.createClass()) or
      * component factory (created from React.createFactory())
      * @param children A single React node (string or ReactElement) or array of nodes.
      * Note that unlike with React itself, multiple children must be placed into an array.
      */
    def apply[P](component: ComponentClass[P, ComponentState], children: ReactNode): ReactElement = js.native
    def apply[P](component: ComponentClass[P, ComponentState], props: P): ReactElement = js.native
    def apply[P](component: ComponentClass[P, ComponentState], props: P, children: ReactNode): ReactElement = js.native
    def apply[P](
      component: ComponentClass[P, ComponentState],
      props: js.UndefOr[scala.Nothing],
      children: ReactNode
    ): ReactElement = js.native
    /**
      * Renders an HTML element from the given spec string, with optional props
      * and children
      * @param specString A string that defines a component in a way that resembles
      * CSS selectors. Eg. "input:email#foo.bar.baz[name=email][required]"
      * @param props Object of html attribute key-value pairs
      * @param children A single React node (string or ReactElement) or array of nodes.
      * Note that unlike with React itself, multiple children must be placed into an array.
      */
    def apply[P](specString: String): DOMElement[P, Element] = js.native
    /**
      * Renders an HTML element from the given spec string, with children but without
      * extra props.
      * @param specString A string that defines a component in a way that resembles
      * CSS selectors. Eg. "input:email#foo.bar.baz[name=email][required]"
      * @param children A single React node (string or ReactElement) or array of nodes.
      * Note that unlike with React itself, multiple children must be placed into an array.
      */
    def apply[P](specString: String, children: ReactNode): DOMElement[P, Element] = js.native
    def apply[P](specString: String, props: js.UndefOr[scala.Nothing], children: ReactNode): DOMElement[P, Element] = js.native
    def apply[P](specString: String, props: HTMLAttributes[js.Object]): DOMElement[P, Element] = js.native
    def apply[P](specString: String, props: HTMLAttributes[js.Object], children: ReactNode): DOMElement[P, Element] = js.native
  }
  
  type Module = js.Function1[/* reactObj */ ReactLikeObject, CreateElement]
  
  /*
    * JSnoX requires an object with a createElement method.
    * This will normally be the React object but could be something else
    */
  @js.native
  trait ReactLikeObject extends StObject {
    
    def createElement[P](`type`: String, props: P, children: ReactNode): ReactElement = js.native
    def createElement[P](`type`: ComponentClass[P, ComponentState], props: P, children: ReactNode): ReactElement = js.native
  }
  
  type _To = Module
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Module = ^
}
