package typings.jstree

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSTreeStatic extends StObject {
  
  /**
    * the jstree class constructor, used only internally
    * @private
    * @name $.jstree.core(id)
    * @param {Number} id this instance's index
    */
  def core(id: Double): Unit = js.native
  
  def create(el: String): JSTree = js.native
  def create(el: String, options: JSTreeStaticDefaults): JSTree = js.native
  def create(el: JQuery): JSTree = js.native
  def create(el: JQuery, options: JSTreeStaticDefaults): JSTree = js.native
  /**
    * creates a jstree instance
    * @name $.jstree.create(el [, options])
    * @param {DOMElement|jQuery|String} el the element to create the instance on, can be jQuery extended or a selector
    * @param {Object} options options for this instance (extends `$.jstree.defaults`)
    * @return {jsTree} the new instance
    */
  def create(el: HTMLElement): JSTree = js.native
  def create(el: HTMLElement, options: JSTreeStaticDefaults): JSTree = js.native
  
  /**
    * holds all the default options used when creating new instances
    * @name $.jstree.defaults
    */
  var defaults: JSTreeStaticDefaults = js.native
  
  /**
    * remove all traces of jstree from the DOM and destroy all instances
    * @name $.jstree.destroy()
    */
  def destroy(): Unit = js.native
  
  var idregex: Any = js.native
  
  var path: String = js.native
  
  /**
    * stores all loaded jstree plugins (used internally)
    * @name $.jstree.plugins
    */
  var plugins: js.Array[Any] = js.native
  
  def reference(needle: String): JSTree = js.native
  def reference(needle: JQuery): JSTree = js.native
  /**
    * get a reference to an existing instance
    *
    * __Examples__
    *
    *  // provided a container with an ID of "tree", and a nested node with an ID of "branch"
    *  // all of there will return the same instance
    *  $.jstree.reference('tree');
    *  $.jstree.reference('#tree');
    *  $.jstree.reference($('#tree'));
    *  $.jstree.reference(document.getElementByID('tree'));
    *  $.jstree.reference('branch');
    *  $.jstree.reference('#branch');
    *  $.jstree.reference($('#branch'));
    *  $.jstree.reference(document.getElementByID('branch'));
    *
    * @name $.jstree.reference(needle)
    * @param {DOMElement|jQuery|String} needle
    * @return {jsTree|null} the instance or `null` if not found
    */
  def reference(needle: HTMLElement): JSTree = js.native
  
  var root: String = js.native
  
  /**
    * specifies the jstree version in use
    * @name $.jstree.version
    */
  var version: String = js.native
}
