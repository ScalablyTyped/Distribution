package typings.loadableWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Filename extends StObject {
    
    var filename: String
  }
  object Filename {
    
    inline def apply(filename: String): Filename = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[Filename]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Filename] (val x: Self) extends AnyVal {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
}
