package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration for the parser. It determines how the server parses the
  * messages.
  */
trait SchemaParserConfig extends StObject {
  
  /**
    * Determines whether messages with no header are allowed.
    */
  var allowNullHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Byte(s) to be used as the segment terminator. If this is unset,
    * &#39;\r&#39; will be used as segment terminator.
    */
  var segmentTerminator: js.UndefOr[String] = js.undefined
}
object SchemaParserConfig {
  
  inline def apply(): SchemaParserConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParserConfig]
  }
  
  extension [Self <: SchemaParserConfig](x: Self) {
    
    inline def setAllowNullHeader(value: Boolean): Self = StObject.set(x, "allowNullHeader", value.asInstanceOf[js.Any])
    
    inline def setAllowNullHeaderUndefined: Self = StObject.set(x, "allowNullHeader", js.undefined)
    
    inline def setSegmentTerminator(value: String): Self = StObject.set(x, "segmentTerminator", value.asInstanceOf[js.Any])
    
    inline def setSegmentTerminatorUndefined: Self = StObject.set(x, "segmentTerminator", js.undefined)
  }
}
