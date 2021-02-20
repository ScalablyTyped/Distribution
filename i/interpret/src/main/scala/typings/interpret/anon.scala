package typings.interpret

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    var extension: String = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(extension: String): Dictkey = {
      val __obj = js.Dynamic.literal(extension = extension.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Extensions extends StObject {
    
    var extensions: String = js.native
  }
  object Extensions {
    
    @scala.inline
    def apply(extensions: String): Extensions = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extensions]
    }
    
    @scala.inline
    implicit class ExtensionsMutableBuilder[Self <: Extensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtensions(value: String): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    }
  }
}
