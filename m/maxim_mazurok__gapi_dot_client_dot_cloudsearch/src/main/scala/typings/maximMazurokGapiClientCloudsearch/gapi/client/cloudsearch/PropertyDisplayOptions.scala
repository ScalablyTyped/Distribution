package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyDisplayOptions extends StObject {
  
  /**
    * The user friendly label for the property that is used if the property is specified to be displayed in ObjectDisplayOptions. If provided, the display label is shown in front of the
    * property values when the property is part of the object display options. For example, if the property value is '1', the value by itself may not be useful context for the user. If
    * the display name given was 'priority', then the user sees 'priority : 1' in the search results which provides clear context to search users. This is OPTIONAL; if not given, only the
    * property values are displayed. The maximum length is 64 characters.
    */
  var displayLabel: js.UndefOr[String] = js.native
}
object PropertyDisplayOptions {
  
  @scala.inline
  def apply(): PropertyDisplayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyDisplayOptions]
  }
  
  @scala.inline
  implicit class PropertyDisplayOptionsMutableBuilder[Self <: PropertyDisplayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayLabel(value: String): Self = StObject.set(x, "displayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLabelUndefined: Self = StObject.set(x, "displayLabel", js.undefined)
  }
}
