package typings
package jsnoxLib.jsnoxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateElement extends js.Object {
  /**
    * Renders a React component, with optional props and children
    * @param component A plain React component (created from React.createClass()) or
    * component factory (created from React.createFactory())
    * @param props Props object to pass to the component
    * @param children A single React node (string or ReactElement) or array of nodes.
    * Note that unlike with React itself, multiple children must be placed into an array.
    */
  def apply[P](component: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState]): reactLib.reactMod.ReactNs.ReactElement[P] = js.native
  /**
    * Renders a React component, with children but no props
    * @param component A plain React component (created from React.createClass()) or
    * component factory (created from React.createFactory())
    * @param children A single React node (string or ReactElement) or array of nodes.
    * Note that unlike with React itself, multiple children must be placed into an array.
    */
  def apply[P](
    component: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState],
    children: reactLib.reactMod.ReactNs.ReactNode
  ): reactLib.reactMod.ReactNs.ReactElement[P] = js.native
  def apply[P](
    component: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState],
    props: P
  ): reactLib.reactMod.ReactNs.ReactElement[P] = js.native
  def apply[P](
    component: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState],
    props: P,
    children: reactLib.reactMod.ReactNs.ReactNode
  ): reactLib.reactMod.ReactNs.ReactElement[P] = js.native
  /**
    * Renders an HTML element from the given spec string, with optional props
    * and children
    * @param specString A string that defines a component in a way that resembles
    * CSS selectors. Eg. "input:email#foo.bar.baz[name=email][required]"
    * @param props Object of html attribute key-value pairs
    * @param children A single React node (string or ReactElement) or array of nodes.
    * Note that unlike with React itself, multiple children must be placed into an array.
    */
  def apply[P](specString: java.lang.String): reactLib.reactMod.ReactNs.DOMElement[P, stdLib.Element] = js.native
  /**
    * Renders an HTML element from the given spec string, with children but without
    * extra props.
    * @param specString A string that defines a component in a way that resembles
    * CSS selectors. Eg. "input:email#foo.bar.baz[name=email][required]"
    * @param children A single React node (string or ReactElement) or array of nodes.
    * Note that unlike with React itself, multiple children must be placed into an array.
    */
  def apply[P](specString: java.lang.String, children: reactLib.reactMod.ReactNs.ReactNode): reactLib.reactMod.ReactNs.DOMElement[P, stdLib.Element] = js.native
  def apply[P](specString: java.lang.String, props: reactLib.reactMod.ReactNs.HTMLAttributes[js.Object]): reactLib.reactMod.ReactNs.DOMElement[P, stdLib.Element] = js.native
  def apply[P](
    specString: java.lang.String,
    props: reactLib.reactMod.ReactNs.HTMLAttributes[js.Object],
    children: reactLib.reactMod.ReactNs.ReactNode
  ): reactLib.reactMod.ReactNs.DOMElement[P, stdLib.Element] = js.native
}

