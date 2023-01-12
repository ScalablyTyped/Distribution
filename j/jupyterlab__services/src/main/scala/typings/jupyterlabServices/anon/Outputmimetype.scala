package typings.jupyterlabServices.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Outputmimetype extends StObject {
  
  var output_mimetype: String
}
object Outputmimetype {
  
  inline def apply(output_mimetype: String): Outputmimetype = {
    val __obj = js.Dynamic.literal(output_mimetype = output_mimetype.asInstanceOf[js.Any])
    __obj.asInstanceOf[Outputmimetype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Outputmimetype] (val x: Self) extends AnyVal {
    
    inline def setOutput_mimetype(value: String): Self = StObject.set(x, "output_mimetype", value.asInstanceOf[js.Any])
  }
}
