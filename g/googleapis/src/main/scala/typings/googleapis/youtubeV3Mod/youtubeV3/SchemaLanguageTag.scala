package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLanguageTag extends StObject {
  
  var value: js.UndefOr[String] = js.native
}
object SchemaLanguageTag {
  
  @scala.inline
  def apply(): SchemaLanguageTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLanguageTag]
  }
  
  @scala.inline
  implicit class SchemaLanguageTagMutableBuilder[Self <: SchemaLanguageTag] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
