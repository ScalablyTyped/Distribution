package typings.inquirer.separatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a choice-item separator.
  */
@JSImport("inquirer/lib/objects/separator", JSImport.Namespace)
@js.native
/**
  * Initializes a new instance of the `Separator` class.
  *
  * @param line
  * The text of the separator.
  */
class ^ () extends Separator {
  def this(line: String) = this()
}

@JSImport("inquirer/lib/objects/separator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Checks whether the specified `item` is not a separator.
    *
    * @param item
    * The item to check.
    *
    * @returns
    * A value indicating whether the item is not a separator.
    */
  def exclude(item: js.Any): Boolean = js.native
}

