package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagHeaderFlags extends StObject {
  
  var experimental_indicator: Boolean
  
  var extended_header: Boolean
  
  var footer_present: Boolean
  
  var unsynchronisation: Boolean
}
object TagHeaderFlags {
  
  inline def apply(
    experimental_indicator: Boolean,
    extended_header: Boolean,
    footer_present: Boolean,
    unsynchronisation: Boolean
  ): TagHeaderFlags = {
    val __obj = js.Dynamic.literal(experimental_indicator = experimental_indicator.asInstanceOf[js.Any], extended_header = extended_header.asInstanceOf[js.Any], footer_present = footer_present.asInstanceOf[js.Any], unsynchronisation = unsynchronisation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagHeaderFlags]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagHeaderFlags] (val x: Self) extends AnyVal {
    
    inline def setExperimental_indicator(value: Boolean): Self = StObject.set(x, "experimental_indicator", value.asInstanceOf[js.Any])
    
    inline def setExtended_header(value: Boolean): Self = StObject.set(x, "extended_header", value.asInstanceOf[js.Any])
    
    inline def setFooter_present(value: Boolean): Self = StObject.set(x, "footer_present", value.asInstanceOf[js.Any])
    
    inline def setUnsynchronisation(value: Boolean): Self = StObject.set(x, "unsynchronisation", value.asInstanceOf[js.Any])
  }
}
