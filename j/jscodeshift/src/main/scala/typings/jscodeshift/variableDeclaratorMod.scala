package typings.jscodeshift

import typings.jscodeshift.collectionMod.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object variableDeclaratorMod {
  
  @JSImport("jscodeshift/src/collections/VariableDeclarator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jscodeshift/src/collections/VariableDeclarator", "filters")
  @js.native
  val filters: FilterMethods = js.native
  
  inline def register(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[Unit]
  
  type ASTPath[N] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.NodePath<N, N> */ js.Any
  
  type Filter = js.Function1[/* path */ ASTPath[js.Any], Boolean]
  
  @js.native
  trait FilterMethods extends StObject {
    
    /**
      * Returns a function that returns true if the provided path is a variable
      * declarator and requires one of the specified module names.
      *
      * @param names A module name or an array of module names
      */
    def requiresModule(names: String): Filter = js.native
    def requiresModule(names: js.Array[String]): Filter = js.native
  }
  
  @js.native
  trait GlobalMethods extends StObject {
    
    /**
      * Finds all variable declarators, optionally filtered by name.
      */
    def findVariableDeclarators(): Collection[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nodes.VariableDeclarator */ js.Any
      ] = js.native
    def findVariableDeclarators(name: String): Collection[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nodes.VariableDeclarator */ js.Any
      ] = js.native
  }
  
  trait TransformMethods[N] extends StObject {
    
    /**
      * Renames a variable and all its occurrences.
      * This method only applies to VariableDeclarator typed collections.
      */
    def renameTo(newName: String): Collection[N]
  }
  object TransformMethods {
    
    inline def apply[N](renameTo: String => Collection[N]): TransformMethods[N] = {
      val __obj = js.Dynamic.literal(renameTo = js.Any.fromFunction1(renameTo))
      __obj.asInstanceOf[TransformMethods[N]]
    }
    
    extension [Self <: TransformMethods[?], N](x: Self & TransformMethods[N]) {
      
      inline def setRenameTo(value: String => Collection[N]): Self = StObject.set(x, "renameTo", js.Any.fromFunction1(value))
    }
  }
}
