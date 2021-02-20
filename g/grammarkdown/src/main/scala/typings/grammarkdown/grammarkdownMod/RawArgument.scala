package typings.grammarkdown.grammarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawArgument extends StObject {
  
  var formattedKey: String = js.native
  
  var option: KnownOption = js.native
  
  var rawKey: String = js.native
  
  var value: js.Any = js.native
}
object RawArgument {
  
  @scala.inline
  def apply(formattedKey: String, option: KnownOption, rawKey: String, value: js.Any): RawArgument = {
    val __obj = js.Dynamic.literal(formattedKey = formattedKey.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], rawKey = rawKey.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawArgument]
  }
  
  @scala.inline
  implicit class RawArgumentMutableBuilder[Self <: RawArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormattedKey(value: String): Self = StObject.set(x, "formattedKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOption(value: KnownOption): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawKey(value: String): Self = StObject.set(x, "rawKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
