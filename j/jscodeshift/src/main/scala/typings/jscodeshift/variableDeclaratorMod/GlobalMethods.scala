package typings.jscodeshift.variableDeclaratorMod

import typings.jscodeshift.collectionMod.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalMethods extends js.Object {
  /**
    * Finds all variable declarators, optionally filtered by name.
    */
  def findVariableDeclarators(): Collection[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nodes.VariableDeclarator */ _
  ] = js.native
  def findVariableDeclarators(name: String): Collection[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nodes.VariableDeclarator */ _
  ] = js.native
}

