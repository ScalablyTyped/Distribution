package typings.inquirer.mod

import typings.inquirer.inquirerStrings.separator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a separator.
  */
@js.native
trait SeparatorOptions extends StObject {
  
  /**
    * Gets or sets the text of the separator.
    */
  var line: js.UndefOr[String] = js.native
  
  /**
    * Gets the type of the choice.
    */
  var `type`: separator = js.native
}
object SeparatorOptions {
  
  @scala.inline
  def apply(`type`: separator): SeparatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeparatorOptions]
  }
  
  @scala.inline
  implicit class SeparatorOptionsMutableBuilder[Self <: SeparatorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setType(value: separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
