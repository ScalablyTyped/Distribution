package typings.jscodeshift.srcCollectionsVariableDeclaratorMod

import typings.jscodeshift.srcCollectionMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformMethods[N] extends js.Object {
  /**
    * Renames a variable and all its occurrences.
    * This method only applies to VariableDeclarator typed collections.
    */
  def renameTo(newName: String): Collection[N]
}

object TransformMethods {
  @scala.inline
  def apply[N](renameTo: String => Collection[N]): TransformMethods[N] = {
    val __obj = js.Dynamic.literal(renameTo = js.Any.fromFunction1(renameTo))
  
    __obj.asInstanceOf[TransformMethods[N]]
  }
}

