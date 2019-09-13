package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeStaticDefaultsUnique extends js.Object {
  /**
    * Indicates if the comparison should be case sensitive. Default is `false`.
    * @name $.jstree.defaults.unique.case_sensitive
    * @plugin unique
    */
  var case_sensitive: Boolean
  /**
    * Indicates if white space should be trimmed before the comparison. Default is `false`.
    * @name $.jstree.defaults.unique.trim_whitespace
    * @plugin unique
    */
  var trim_whitespace: Boolean
  /**
    * A callback executed in the instance's scope when a new node is created
    * and the name is already taken, the two arguments are the conflicting name and the counter.
    * The default will produce results like `New node (2)`.
    * @name $.jstree.defaults.unique.duplicate
    * @plugin unique
    */
  def duplicate(name: String, counter: Double): String
}

object JSTreeStaticDefaultsUnique {
  @scala.inline
  def apply(case_sensitive: Boolean, duplicate: (String, Double) => String, trim_whitespace: Boolean): JSTreeStaticDefaultsUnique = {
    val __obj = js.Dynamic.literal(case_sensitive = case_sensitive, duplicate = js.Any.fromFunction2(duplicate), trim_whitespace = trim_whitespace)
  
    __obj.asInstanceOf[JSTreeStaticDefaultsUnique]
  }
}

