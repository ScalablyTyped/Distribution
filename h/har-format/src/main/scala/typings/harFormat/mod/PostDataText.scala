package typings.harFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostDataText extends StObject {
  
  /**
    * _`params` and `text` fields are mutually exclusive._
    */
  var params: js.UndefOr[scala.Nothing] = js.undefined
  
  /**
    * Plain text posted data
    */
  var text: String
}
object PostDataText {
  
  inline def apply(text: String): PostDataText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostDataText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostDataText] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
