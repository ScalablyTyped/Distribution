package typings
package jstreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  /**
       * Create an instance, get an instance or invoke a command on a instance.
       *
       * If there is no instance associated with the current node a new one is created
       * and `arg` is used to extend `$.jstree.defaults` for this new instance. There would be no return value (chaining is not broken).
       *
       * If there is an existing instance and `arg` is a string the command specified by `arg` is executed on the instance,
       * with any additional arguments passed to the function. If the function returns a value it will be returned (chaining could break depending on function).
       *
       * If there is an existing instance and `arg` is not a string the instance itself is returned (similar to `$.jstree.reference`).
       *
       * In any other case - nothing is returned and chaining is not broken.
       *
       * __Examples__
       *
       *	$('#tree1').jstree(); // creates an instance
       *	$('#tree2').jstree({ plugins : [] }); // create an instance with some options
       *	$('#tree1').jstree('open_node', '#branch_1'); // call a method on an existing instance, passing additional arguments
       *	$('#tree2').jstree(); // get an existing instance (or create an instance)
       *	$('#tree2').jstree(true); // get an existing instance (will not create new instance)
       *	$('#branch_1').jstree().select_node('#branch_1'); // get an instance (using a nested element and call a method)
       *
       * @name $().jstree([arg])
       * @param {String|Object} arg
       * @return {Mixed}
       */
  def jstree(): JSTree = js.native
  def jstree(args: js.Any*): js.Any = js.native
  def jstree(arg: scala.Boolean): JSTree = js.native
  def jstree(options: JSTreeStaticDefaults): JSTree = js.native
}

