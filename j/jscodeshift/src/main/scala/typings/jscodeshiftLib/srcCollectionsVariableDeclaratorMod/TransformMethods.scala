package typings
package jscodeshiftLib.srcCollectionsVariableDeclaratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformMethods[N] extends js.Object {
  /**
    * Renames a variable and all its occurrences.
    * This method only applies to VariableDeclarator typed collections.
    */
  def renameTo(newName: java.lang.String): jscodeshiftLib.srcCollectionMod.Collection[N]
}

