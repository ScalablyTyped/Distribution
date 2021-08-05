package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The display options for a property.
  */
trait SchemaPropertyDisplayOptions extends StObject {
  
  /**
    * The user friendly label for the property that will be used if the
    * property is specified to be displayed in ObjectDisplayOptions. If given,
    * the display label will be shown in front of the property values when the
    * property is part of the object display options. For example, if the
    * property value is &#39;1&#39;, the value by itself may not be useful
    * context for the user. If the display name given was &#39;priority&#39;,
    * then the user will see &#39;priority : 1&#39; in the search results which
    * provides clear conext to search users. This is OPTIONAL; if not given,
    * only the property values will be displayed. The maximum length is 32
    * characters.
    */
  var displayLabel: js.UndefOr[String] = js.undefined
}
object SchemaPropertyDisplayOptions {
  
  inline def apply(): SchemaPropertyDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyDisplayOptions]
  }
  
  extension [Self <: SchemaPropertyDisplayOptions](x: Self) {
    
    inline def setDisplayLabel(value: String): Self = StObject.set(x, "displayLabel", value.asInstanceOf[js.Any])
    
    inline def setDisplayLabelUndefined: Self = StObject.set(x, "displayLabel", js.undefined)
  }
}
