package typings.knockout

import typings.knockout.KnockoutComponentTypesNs.Config
import typings.knockout.KnockoutComponentTypesNs.Definition
import typings.knockout.KnockoutComponentTypesNs.EmptyConfig
import typings.knockout.KnockoutComponentTypesNs.Loader
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComponents extends js.Object {
  var defaultLoader: Loader = js.native
  var loaders: js.Array[Loader] = js.native
  /**
    * Clears the cache knockout creates to speed up component loading, for a given component.
    * @param componentName Component name.
    */
  def clearCachedDefinition(componentName: String): Unit = js.native
  /**
    * Searchs each registered component loader by component name, and returns the viewmodel/template declaration via callback parameter.
    * @param componentName Component name.
    * @param callback Function to be called with the viewmodel/template declaration parameter.
    */
  def get(componentName: String, callback: js.Function1[/* definition */ Definition, Unit]): Unit = js.native
  /**
    * Returns the registered component name for a HTML element. Can be overwriten to to control dynamically which HTML element map to which component name.
    * @param node html element that corresponds to a custom component.
    */
  def getComponentNameForNode(node: Node): String = js.native
  /**
    * Determine if a component with the specified name is already registered in the default component loader.
    * @param componentName Component name.
    */
  def isRegistered(componentName: String): Boolean = js.native
  /**
    * Registers a component, in the default component loader, to be used by name in the component binding.
    * @param componentName Component name. Will be used for your custom HTML tag name.
    * @param config Component configuration.
    */
  def register(componentName: String, config: Config): Unit = js.native
  def register(componentName: String, config: EmptyConfig): Unit = js.native
  /**
    * Removes the named component from the default component loader registry. Or if no such component was registered, does nothing.
    * @param componentName Component name.
    */
  def unregister(componentName: String): Unit = js.native
}

