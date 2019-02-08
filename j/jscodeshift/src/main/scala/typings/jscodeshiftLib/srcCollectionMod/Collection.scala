package typings
package jscodeshiftLib.srcCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collection[N]
  extends jscodeshiftLib.srcCollectionsNodeMod.TraversalMethods
     with jscodeshiftLib.srcCollectionsNodeMod.MutationMethods[N]
     with jscodeshiftLib.srcCollectionsVariableDeclaratorMod.GlobalMethods
     with jscodeshiftLib.srcCollectionsVariableDeclaratorMod.TransformMethods[N]
     with jscodeshiftLib.srcCollectionsJSXElementMod.GlobalMethods
     with jscodeshiftLib.srcCollectionsJSXElementMod.TraversalMethods
     with /**
  * @param paths An array of AST paths
  * @param parent A parent collection
  * @param types An array of types all the paths in the collection
  *  have in common. If not passed, it will be inferred from the paths.
  */
org.scalablytyped.runtime.Instantiable2[/* paths */ js.Array[ASTPath[N]], /* parent */ Collection[js.Any], Collection[N]]
     with org.scalablytyped.runtime.Instantiable3[
      /* paths */ js.Array[ASTPath[N]], 
      /* parent */ Collection[js.Any], 
      /* types */ js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify recast.Type<any> */ js.Any
      ], 
      Collection[N]
    ] {
  /** Returns the number of elements in this collection. */
  var length: scala.Double = js.native
  /**
    * Returns a new collection containing only the element at position index.
    * In case of a negative index, the element is taken from the end:
    *   .at(0)  - first element
    *   .at(-1) - last element
    */
  def at(index: scala.Double): Collection[N] = js.native
  /**
    * Tests whether all paths pass the test implemented by the provided callback.
    */
  def every(
    callback: js.Function3[
      /* path */ ASTPath[N], 
      /* i */ scala.Double, 
      /* paths */ js.Array[ASTPath[N]], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def filter(
    callback: js.Function3[
      /* path */ ASTPath[N], 
      /* i */ scala.Double, 
      /* paths */ js.Array[ASTPath[N]], 
      scala.Boolean
    ]
  ): Collection[N] = js.native
  /**
    * Returns a new collection containing the nodes for which the callback returns true.
    */
  @JSName("filter")
  def filter_SN[S /* <: N */](
    callback: js.Function3[
      /* path */ ASTPath[N], 
      /* i */ scala.Double, 
      /* paths */ js.Array[ASTPath[N]], 
      /* is jscodeshift.jscodeshift/src/Collection.ASTPath<S> */ scala.Boolean
    ]
  ): Collection[S] = js.native
  /**
    * Executes callback for each node/path in the collection.
    */
  def forEach(
    callback: js.Function3[
      /* path */ ASTPath[N], 
      /* i */ scala.Double, 
      /* paths */ js.Array[ASTPath[N]], 
      scala.Unit
    ]
  ): this.type = js.native
  /** Calls "get" on the first path (same as "collection.paths(0).get(...)"). */
  def get(fields: (java.lang.String | scala.Double)*): js.Any = js.native
  def getAST(): js.Array[ASTPath[_]] = js.native
  /**
    * Returns the type(s) of the collection. This is only used for unit tests,
    * don't think other consumers would need it.
    */
  def getTypes(): js.Array[java.lang.String] = js.native
  /**
    * Returns true if this collection has the type 'type'.
    */
  def isOfType(
    `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify recast.Type<any> */ js.Any
  ): scala.Boolean = js.native
  /**
    * Executes the callback for every path in the collection and returns a new
    * collection from the return values (which must be paths).
    *
    * The callback can return null to indicate to exclude the element from the
    * new collection.
    *
    * If an array is returned, the array will be flattened into the result
    * collection.
    *
    * @param callback
    * @param type Force the new collection to be of a specific type
    */
  def map[T](
    callback: js.Function3[
      /* path */ ASTPath[N], 
      /* i */ scala.Double, 
      /* paths */ js.Array[ASTPath[N]], 
      js.UndefOr[ASTPath[T] | js.Array[ASTPath[T]] | scala.Null]
    ],
    `type`: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify recast.Type<any> */ js.Any
  ): Collection[T] = js.native
  /** Returns an array of AST nodes in this collection. */
  def nodes(): js.Array[N] = js.native
  /** Returns an array of ASTPaths in this this collection. */
  def paths(): js.Array[ASTPath[N]] = js.native
  /** Returns the number of elements in this collection. */
  def size(): scala.Double = js.native
  /**
    * Tests whether at-least one path passes the test implemented by the provided callback.
    */
  def some(
    callback: js.Function3[
      /* path */ ASTPath[N], 
      /* i */ scala.Double, 
      /* paths */ js.Array[ASTPath[N]], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  /**
    * Converts the AST back to a string, using recast.
    * @param options directly passed to recast's printer
    */
  def toSource(): java.lang.String = js.native
  def toSource(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify recast.Options */ js.Any
  ): java.lang.String = js.native
}

