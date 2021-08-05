package typings.libxmljs

import typings.libxmljs.libxmljsStrings.html
import typings.libxmljs.libxmljsStrings.xhtml
import typings.libxmljs.libxmljsStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Declaration extends StObject {
    
    var declaration: Boolean
    
    var selfCloseEmpty: Boolean
    
    var `type`: xml | html | xhtml
    
    var whitespace: Boolean
  }
  object Declaration {
    
    inline def apply(declaration: Boolean, selfCloseEmpty: Boolean, `type`: xml | html | xhtml, whitespace: Boolean): Declaration = {
      val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], selfCloseEmpty = selfCloseEmpty.asInstanceOf[js.Any], whitespace = whitespace.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Declaration]
    }
    
    extension [Self <: Declaration](x: Self) {
      
      inline def setDeclaration(value: Boolean): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
      
      inline def setSelfCloseEmpty(value: Boolean): Self = StObject.set(x, "selfCloseEmpty", value.asInstanceOf[js.Any])
      
      inline def setType(value: xml | html | xhtml): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWhitespace(value: Boolean): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExternalId extends StObject {
    
    var externalId: String
    
    var name: String
    
    var systemId: String
  }
  object ExternalId {
    
    inline def apply(externalId: String, name: String, systemId: String): ExternalId = {
      val __obj = js.Dynamic.literal(externalId = externalId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalId]
    }
    
    extension [Self <: ExternalId](x: Self) {
      
      inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    }
  }
}
