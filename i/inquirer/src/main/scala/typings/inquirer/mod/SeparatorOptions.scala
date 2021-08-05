package typings.inquirer.mod

import typings.inquirer.inquirerStrings.separator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a separator.
  */
trait SeparatorOptions extends StObject {
  
  /**
    * Gets or sets the text of the separator.
    */
  var line: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the type of the choice.
    */
  var `type`: separator
}
object SeparatorOptions {
  
  inline def apply(): SeparatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("separator")
    __obj.asInstanceOf[SeparatorOptions]
  }
  
  extension [Self <: SeparatorOptions](x: Self) {
    
    inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setType(value: separator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
