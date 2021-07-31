package typings.grunt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object node {
  
  /**
    * {@link http://npmjs.org/doc/json.html}
    */
  trait NodePackage extends StObject {
    
    var description: js.UndefOr[java.lang.String] = js.undefined
    
    var homepage: js.UndefOr[java.lang.String] = js.undefined
    
    var keywords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    
    var name: java.lang.String
    
    var version: java.lang.String
  }
  object NodePackage {
    
    @scala.inline
    def apply(name: java.lang.String, version: java.lang.String): NodePackage = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodePackage]
    }
    
    @scala.inline
    implicit class NodePackageMutableBuilder[Self <: NodePackage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: java.lang.String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setHomepage(value: java.lang.String): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      @scala.inline
      def setKeywords(value: js.Array[java.lang.String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      @scala.inline
      def setKeywordsVarargs(value: java.lang.String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: java.lang.String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
