package typings
package jstreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSTreeStaticDefaultsUnique extends js.Object {
  /**
    * Indicates if the comparison should be case sensitive. Default is `false`.
    * @name $.jstree.defaults.unique.case_sensitive
    * @plugin unique
    */
  var case_sensitive: scala.Boolean
  /**
    * A callback executed in the instance's scope when a new node is created
    * and the name is already taken, the two arguments are the conflicting name and the counter.
    * The default will produce results like `New node (2)`.
    * @name $.jstree.defaults.unique.duplicate
    * @plugin unique
    */
  def duplicate(name: java.lang.String, counter: scala.Double): java.lang.String
}

object JSTreeStaticDefaultsUnique {
  @scala.inline
  def apply(
    case_sensitive: scala.Boolean,
    duplicate: js.Function2[java.lang.String, scala.Double, java.lang.String]
  ): JSTreeStaticDefaultsUnique = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("case_sensitive")(case_sensitive)
    __obj.updateDynamic("duplicate")(duplicate)
    __obj.asInstanceOf[JSTreeStaticDefaultsUnique]
  }
}

