package typings
package jscodeshiftLib.srcCollectionsNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraversalMethods extends js.Object {
  /**
    * Traverse the AST up and finds the closest node of the provided type.
    */
  def closest[T](
    `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify recast.Type<T> */ js.Any
  ): jscodeshiftLib.srcCollectionMod.Collection[T] = js.native
  def closest[T](
    `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify recast.Type<T> */ js.Any,
    filter: js.Any
  ): jscodeshiftLib.srcCollectionMod.Collection[T] = js.native
  /**
    * Returns a collection containing the paths that create the scope of the
    * currently selected paths. Dedupes the paths.
    */
  def closestScope(): jscodeshiftLib.srcCollectionMod.Collection[astDashTypesLib.genNodesMod.ASTNode] = js.native
  /**
    * Find nodes of a specific type within the nodes of this collection.
    */
  def find[T](
    `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify recast.Type<T> */ js.Any
  ): jscodeshiftLib.srcCollectionMod.Collection[T] = js.native
  def find[T](
    `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify recast.Type<T> */ js.Any,
    filter: js.Function1[/* value */ js.Any, scala.Boolean]
  ): jscodeshiftLib.srcCollectionMod.Collection[T] = js.native
  def find[T](
    `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify recast.Type<T> */ js.Any,
    filter: js.Object
  ): jscodeshiftLib.srcCollectionMod.Collection[T] = js.native
  /**
    * Finds the declaration for each selected path. Useful for member expressions
    * or JSXElements. Expects a callback function that maps each path to the name
    * to look for.
    *
    * If the callback returns a falsy value, the element is skipped.
    */
  def getVariableDeclarators(nameGetter: js.Function1[/* repeated */ js.Any, _]): jscodeshiftLib.srcCollectionMod.Collection[astDashTypesLib.genNodesMod.VariableDeclarator] = js.native
}

