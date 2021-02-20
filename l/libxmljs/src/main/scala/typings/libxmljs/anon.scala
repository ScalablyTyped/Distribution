package typings.libxmljs

import typings.libxmljs.libxmljsStrings.html
import typings.libxmljs.libxmljsStrings.xhtml
import typings.libxmljs.libxmljsStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Declaration extends StObject {
    
    var declaration: Boolean = js.native
    
    var selfCloseEmpty: Boolean = js.native
    
    var `type`: xml | html | xhtml = js.native
    
    var whitespace: Boolean = js.native
  }
  object Declaration {
    
    @scala.inline
    def apply(declaration: Boolean, selfCloseEmpty: Boolean, `type`: xml | html | xhtml, whitespace: Boolean): Declaration = {
      val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], selfCloseEmpty = selfCloseEmpty.asInstanceOf[js.Any], whitespace = whitespace.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Declaration]
    }
    
    @scala.inline
    implicit class DeclarationMutableBuilder[Self <: Declaration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeclaration(value: Boolean): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfCloseEmpty(value: Boolean): Self = StObject.set(x, "selfCloseEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: xml | html | xhtml): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhitespace(value: Boolean): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExternalId extends StObject {
    
    var externalId: String = js.native
    
    var name: String = js.native
    
    var systemId: String = js.native
  }
  object ExternalId {
    
    @scala.inline
    def apply(externalId: String, name: String, systemId: String): ExternalId = {
      val __obj = js.Dynamic.literal(externalId = externalId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalId]
    }
    
    @scala.inline
    implicit class ExternalIdMutableBuilder[Self <: ExternalId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    }
  }
}
