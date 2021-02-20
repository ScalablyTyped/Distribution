package typings.jscodeshift

import org.scalablytyped.runtime.StringDictionary
import typings.jscodeshift.collectionMod.Collection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsxelementMod {
  
  @JSImport("jscodeshift/src/collections/JSXElement", "filters")
  @js.native
  val filters: FilterMethods = js.native
  
  @JSImport("jscodeshift/src/collections/JSXElement", "mappings")
  @js.native
  val mappings: MappingMethods = js.native
  
  @JSImport("jscodeshift/src/collections/JSXElement", "register")
  @js.native
  def register(): Unit = js.native
  
  type ASTPath[N] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify recast.NodePath<N, N> */ js.Any
  
  type Defined[T] = T
  
  type Filter = js.Function1[/* path */ ASTPath[js.Any], Boolean]
  
  @js.native
  trait FilterMethods extends StObject {
    
    /**
      * Filter method for attributes.
      */
    def hasAttributes(attributeFilter: StringDictionary[js.Any]): Filter = js.native
    
    /**
      * Filter elements which contain a specific child type
      */
    def hasChildren(name: String): Filter = js.native
  }
  object FilterMethods {
    
    @scala.inline
    def apply(hasAttributes: StringDictionary[js.Any] => Filter, hasChildren: String => Filter): FilterMethods = {
      val __obj = js.Dynamic.literal(hasAttributes = js.Any.fromFunction1(hasAttributes), hasChildren = js.Any.fromFunction1(hasChildren))
      __obj.asInstanceOf[FilterMethods]
    }
    
    @scala.inline
    implicit class FilterMethodsMutableBuilder[Self <: FilterMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHasAttributes(value: StringDictionary[js.Any] => Filter): Self = StObject.set(x, "hasAttributes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasChildren(value: String => Filter): Self = StObject.set(x, "hasChildren", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait GlobalMethods extends StObject {
    
    /**
      * Finds all JSXElements optionally filtered by name
      */
    def findJSXElements(): Collection[JSXElement] = js.native
    def findJSXElements(name: String): Collection[JSXElement] = js.native
    
    /**
      * Finds all JSXElements by module name. Given
      *
      *     var Bar = require('Foo');
      *     <Bar />
      *
      * findJSXElementsByModuleName('Foo') will find <Bar />, without having to
      * know the variable name.
      */
    def findJSXElementsByModuleName(moduleName: String): Collection[JSXElement] = js.native
  }
  
  type JSXElement = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify nodes.JSXElement */ js.Any
  
  type JSXElementChild = /* import warning: importer.ImportType#apply Failed type conversion: jscodeshift.jscodeshift/src/collections/JSXElement.Defined<jscodeshift.jscodeshift/src/collections/JSXElement.JSXElement['children']>[0] */ js.Any
  
  @js.native
  trait MappingMethods extends StObject {
    
    /**
      * Given a JSXElement, returns its "root" name. E.g. it would return "Foo" for
      * both <Foo /> and <Foo.Bar />.
      */
    def getRootName(path: ASTPath[_]): String = js.native
  }
  object MappingMethods {
    
    @scala.inline
    def apply(getRootName: ASTPath[_] => String): MappingMethods = {
      val __obj = js.Dynamic.literal(getRootName = js.Any.fromFunction1(getRootName))
      __obj.asInstanceOf[MappingMethods]
    }
    
    @scala.inline
    implicit class MappingMethodsMutableBuilder[Self <: MappingMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetRootName(value: ASTPath[_] => String): Self = StObject.set(x, "getRootName", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TraversalMethods extends StObject {
    
    /**
      * Returns all children that are JSXElements.
      * This method only applies to JSXElement typed collections.
      */
    def childElements(): Collection[JSXElement] = js.native
    
    /**
      * Returns all child nodes, including literals and expressions.
      * This method only applies to JSXElement typed collections.
      */
    def childNodes(): Collection[JSXElementChild] = js.native
  }
  object TraversalMethods {
    
    @scala.inline
    def apply(childElements: () => Collection[JSXElement], childNodes: () => Collection[JSXElementChild]): TraversalMethods = {
      val __obj = js.Dynamic.literal(childElements = js.Any.fromFunction0(childElements), childNodes = js.Any.fromFunction0(childNodes))
      __obj.asInstanceOf[TraversalMethods]
    }
    
    @scala.inline
    implicit class TraversalMethodsMutableBuilder[Self <: TraversalMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildElements(value: () => Collection[JSXElement]): Self = StObject.set(x, "childElements", js.Any.fromFunction0(value))
      
      @scala.inline
      def setChildNodes(value: () => Collection[JSXElementChild]): Self = StObject.set(x, "childNodes", js.Any.fromFunction0(value))
    }
  }
}
