package typings
package jstreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSTreeStatic extends js.Object {
  /**
       * holds all the default options used when creating new instances
       * @name $.jstree.defaults
       */
  var defaults: JSTreeStaticDefaults = js.native
  var idregex: js.Any = js.native
  var path: java.lang.String = js.native
  /**
      * stores all loaded jstree plugins (used internally)
      * @name $.jstree.plugins
      */
  var plugins: js.Array[_] = js.native
  var root: java.lang.String = js.native
  /**
       * specifies the jstree version in use
       * @name $.jstree.version
       */
  var version: java.lang.String = js.native
  /**
       * the jstree class constructor, used only internally
       * @private
       * @name $.jstree.core(id)
       * @param {Number} id this instance's index
       */
  def core(id: scala.Double): scala.Unit = js.native
  /**
       * creates a jstree instance
       * @name $.jstree.create(el [, options])
       * @param {DOMElement|jQuery|String} el the element to create the instance on, can be jQuery extended or a selector
       * @param {Object} options options for this instance (extends `$.jstree.defaults`)
       * @return {jsTree} the new instance
       */
  def create(el: java.lang.String): JSTree = js.native
  /**
       * creates a jstree instance
       * @name $.jstree.create(el [, options])
       * @param {DOMElement|jQuery|String} el the element to create the instance on, can be jQuery extended or a selector
       * @param {Object} options options for this instance (extends `$.jstree.defaults`)
       * @return {jsTree} the new instance
       */
  def create(el: java.lang.String, options: JSTreeStaticDefaults): JSTree = js.native
  /**
       * creates a jstree instance
       * @name $.jstree.create(el [, options])
       * @param {DOMElement|jQuery|String} el the element to create the instance on, can be jQuery extended or a selector
       * @param {Object} options options for this instance (extends `$.jstree.defaults`)
       * @return {jsTree} the new instance
       */
  def create(el: JQuery): JSTree = js.native
  /**
       * creates a jstree instance
       * @name $.jstree.create(el [, options])
       * @param {DOMElement|jQuery|String} el the element to create the instance on, can be jQuery extended or a selector
       * @param {Object} options options for this instance (extends `$.jstree.defaults`)
       * @return {jsTree} the new instance
       */
  def create(el: JQuery, options: JSTreeStaticDefaults): JSTree = js.native
  /**
       * creates a jstree instance
       * @name $.jstree.create(el [, options])
       * @param {DOMElement|jQuery|String} el the element to create the instance on, can be jQuery extended or a selector
       * @param {Object} options options for this instance (extends `$.jstree.defaults`)
       * @return {jsTree} the new instance
       */
  def create(el: stdLib.HTMLElement): JSTree = js.native
  /**
       * creates a jstree instance
       * @name $.jstree.create(el [, options])
       * @param {DOMElement|jQuery|String} el the element to create the instance on, can be jQuery extended or a selector
       * @param {Object} options options for this instance (extends `$.jstree.defaults`)
       * @return {jsTree} the new instance
       */
  def create(el: stdLib.HTMLElement, options: JSTreeStaticDefaults): JSTree = js.native
  /**
       * remove all traces of jstree from the DOM and destroy all instances
       * @name $.jstree.destroy()
       */
  def destroy(): scala.Unit = js.native
  /**
  	 * get a reference to an existing instance
  	 *
  	 * __Examples__
  	 *
  	 *	// provided a container with an ID of "tree", and a nested node with an ID of "branch"
  	 *	// all of there will return the same instance
  	 *	$.jstree.reference('tree');
  	 *	$.jstree.reference('#tree');
  	 *	$.jstree.reference($('#tree'));
  	 *	$.jstree.reference(document.getElementByID('tree'));
  	 *	$.jstree.reference('branch');
  	 *	$.jstree.reference('#branch');
  	 *	$.jstree.reference($('#branch'));
  	 *	$.jstree.reference(document.getElementByID('branch'));
  	 *
  	 * @name $.jstree.reference(needle)
  	 * @param {DOMElement|jQuery|String} needle
  	 * @return {jsTree|null} the instance or `null` if not found
  	 */
  def reference(needle: java.lang.String): JSTree = js.native
  /**
  	 * get a reference to an existing instance
  	 *
  	 * __Examples__
  	 *
  	 *	// provided a container with an ID of "tree", and a nested node with an ID of "branch"
  	 *	// all of there will return the same instance
  	 *	$.jstree.reference('tree');
  	 *	$.jstree.reference('#tree');
  	 *	$.jstree.reference($('#tree'));
  	 *	$.jstree.reference(document.getElementByID('tree'));
  	 *	$.jstree.reference('branch');
  	 *	$.jstree.reference('#branch');
  	 *	$.jstree.reference($('#branch'));
  	 *	$.jstree.reference(document.getElementByID('branch'));
  	 *
  	 * @name $.jstree.reference(needle)
  	 * @param {DOMElement|jQuery|String} needle
  	 * @return {jsTree|null} the instance or `null` if not found
  	 */
  def reference(needle: JQuery): JSTree = js.native
  /**
  	 * get a reference to an existing instance
  	 *
  	 * __Examples__
  	 *
  	 *	// provided a container with an ID of "tree", and a nested node with an ID of "branch"
  	 *	// all of there will return the same instance
  	 *	$.jstree.reference('tree');
  	 *	$.jstree.reference('#tree');
  	 *	$.jstree.reference($('#tree'));
  	 *	$.jstree.reference(document.getElementByID('tree'));
  	 *	$.jstree.reference('branch');
  	 *	$.jstree.reference('#branch');
  	 *	$.jstree.reference($('#branch'));
  	 *	$.jstree.reference(document.getElementByID('branch'));
  	 *
  	 * @name $.jstree.reference(needle)
  	 * @param {DOMElement|jQuery|String} needle
  	 * @return {jsTree|null} the instance or `null` if not found
  	 */
  def reference(needle: stdLib.HTMLElement): JSTree = js.native
}

