package typings.jscodeshift

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.jscodeshift.nodeMod.MutationMethods
import typings.jscodeshift.nodeMod.TraversalMethods
import typings.jscodeshift.variableDeclaratorMod.GlobalMethods
import typings.jscodeshift.variableDeclaratorMod.TransformMethods
import typings.recast.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionMod {
  
  @JSImport("jscodeshift/src/Collection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fromNodes(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNodes")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def fromPaths(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPaths")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def hasConflictingRegistration(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("hasConflictingRegistration")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def registerMethods(methods: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerMethods")(methods.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def registerMethods(
    methods: js.Object,
    `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Type<any> */ js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMethods")(methods.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def setDefaultCollectionType(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultCollectionType")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  type ASTPath[N] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.NodePath<N, N> */ js.Any
  
  @js.native
  trait Collection[N]
    extends StObject
       with TraversalMethods
       with MutationMethods[N]
       with GlobalMethods
       with TransformMethods[N]
       with typings.jscodeshift.jsxelementMod.GlobalMethods
       with typings.jscodeshift.jsxelementMod.TraversalMethods
       with /**
    * @param paths An array of AST paths
    * @param parent A parent collection
    * @param types An array of types all the paths in the collection
    *  have in common. If not passed, it will be inferred from the paths.
    */
  Instantiable2[/* paths */ js.Array[ASTPath[N]], /* parent */ Collection[js.Any], Collection[N]]
       with Instantiable3[
          /* paths */ js.Array[ASTPath[N]], 
          /* parent */ Collection[js.Any], 
          /* types */ js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Type<any> */ js.Any
          ], 
          Collection[N]
        ] {
    
    /**
      * Returns a new collection containing only the element at position index.
      * In case of a negative index, the element is taken from the end:
      *   .at(0)  - first element
      *   .at(-1) - last element
      */
    def at(index: Double): Collection[N] = js.native
    
    /**
      * Tests whether all paths pass the test implemented by the provided callback.
      */
    def every(
      callback: js.Function3[/* path */ ASTPath[N], /* i */ Double, /* paths */ js.Array[ASTPath[N]], Boolean]
    ): Boolean = js.native
    
    def filter(
      callback: js.Function3[/* path */ ASTPath[N], /* i */ Double, /* paths */ js.Array[ASTPath[N]], Boolean]
    ): Collection[N] = js.native
    /**
      * Returns a new collection containing the nodes for which the callback returns true.
      */
    @JSName("filter")
    def filter_S_N[S /* <: N */](
      callback: js.Function3[
          /* path */ ASTPath[N], 
          /* i */ Double, 
          /* paths */ js.Array[ASTPath[N]], 
          /* is jscodeshift.jscodeshift/src/Collection.ASTPath<S> */ Boolean
        ]
    ): Collection[S] = js.native
    
    /**
      * Executes callback for each node/path in the collection.
      */
    def forEach(
      callback: js.Function3[/* path */ ASTPath[N], /* i */ Double, /* paths */ js.Array[ASTPath[N]], Unit]
    ): this.type = js.native
    
    /** Calls "get" on the first path (same as "collection.paths(0).get(...)"). */
    def get(fields: (String | Double)*): js.Any = js.native
    
    def getAST(): js.Array[ASTPath[js.Any]] = js.native
    
    /**
      * Returns the type(s) of the collection. This is only used for unit tests,
      * don't think other consumers would need it.
      */
    def getTypes(): js.Array[String] = js.native
    
    /**
      * Returns true if this collection has the type 'type'.
      */
    def isOfType(
      `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Type<any> */ js.Any
    ): Boolean = js.native
    
    /** Returns the number of elements in this collection. */
    var length: Double = js.native
    
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
          /* i */ Double, 
          /* paths */ js.Array[ASTPath[N]], 
          js.UndefOr[ASTPath[T] | js.Array[ASTPath[T]] | Null]
        ]
    ): Collection[T] = js.native
    def map[T](
      callback: js.Function3[
          /* path */ ASTPath[N], 
          /* i */ Double, 
          /* paths */ js.Array[ASTPath[N]], 
          js.UndefOr[ASTPath[T] | js.Array[ASTPath[T]] | Null]
        ],
      `type`: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.Type<any> */ js.Any
    ): Collection[T] = js.native
    
    /** Returns an array of AST nodes in this collection. */
    def nodes(): js.Array[N] = js.native
    
    /** Returns an array of ASTPaths in this this collection. */
    def paths(): js.Array[ASTPath[N]] = js.native
    
    /** Returns the number of elements in this collection. */
    def size(): Double = js.native
    
    /**
      * Tests whether at-least one path passes the test implemented by the provided callback.
      */
    def some(
      callback: js.Function3[/* path */ ASTPath[N], /* i */ Double, /* paths */ js.Array[ASTPath[N]], Boolean]
    ): Boolean = js.native
    
    /**
      * Converts the AST back to a string, using recast.
      * @param options directly passed to recast's printer
      */
    def toSource(): String = js.native
    def toSource(options: Options): String = js.native
  }
}
