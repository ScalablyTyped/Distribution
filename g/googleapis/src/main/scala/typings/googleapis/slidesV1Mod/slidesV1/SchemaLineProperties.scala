package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of the Line.  When unset, these fields default to values
  * that match the appearance of new lines created in the Slides editor.
  */
trait SchemaLineProperties extends StObject {
  
  /**
    * The dash style of the line.
    */
  var dashStyle: js.UndefOr[String] = js.undefined
  
  /**
    * The style of the arrow at the end of the line.
    */
  var endArrow: js.UndefOr[String] = js.undefined
  
  /**
    * The connection at the end of the line. If unset, there is no connection.
    * Only lines with a Type indicating it is a &quot;connector&quot; can have
    * an `end_connection`.
    */
  var endConnection: js.UndefOr[SchemaLineConnection] = js.undefined
  
  /**
    * The fill of the line. The default line fill matches the defaults for new
    * lines created in the Slides editor.
    */
  var lineFill: js.UndefOr[SchemaLineFill] = js.undefined
  
  /**
    * The hyperlink destination of the line. If unset, there is no link.
    */
  var link: js.UndefOr[SchemaLink] = js.undefined
  
  /**
    * The style of the arrow at the beginning of the line.
    */
  var startArrow: js.UndefOr[String] = js.undefined
  
  /**
    * The connection at the beginning of the line. If unset, there is no
    * connection.  Only lines with a Type indicating it is a
    * &quot;connector&quot; can have a `start_connection`.
    */
  var startConnection: js.UndefOr[SchemaLineConnection] = js.undefined
  
  /**
    * The thickness of the line.
    */
  var weight: js.UndefOr[SchemaDimension] = js.undefined
}
object SchemaLineProperties {
  
  inline def apply(): SchemaLineProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLineProperties]
  }
  
  extension [Self <: SchemaLineProperties](x: Self) {
    
    inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setEndArrow(value: String): Self = StObject.set(x, "endArrow", value.asInstanceOf[js.Any])
    
    inline def setEndArrowUndefined: Self = StObject.set(x, "endArrow", js.undefined)
    
    inline def setEndConnection(value: SchemaLineConnection): Self = StObject.set(x, "endConnection", value.asInstanceOf[js.Any])
    
    inline def setEndConnectionUndefined: Self = StObject.set(x, "endConnection", js.undefined)
    
    inline def setLineFill(value: SchemaLineFill): Self = StObject.set(x, "lineFill", value.asInstanceOf[js.Any])
    
    inline def setLineFillUndefined: Self = StObject.set(x, "lineFill", js.undefined)
    
    inline def setLink(value: SchemaLink): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setStartArrow(value: String): Self = StObject.set(x, "startArrow", value.asInstanceOf[js.Any])
    
    inline def setStartArrowUndefined: Self = StObject.set(x, "startArrow", js.undefined)
    
    inline def setStartConnection(value: SchemaLineConnection): Self = StObject.set(x, "startConnection", value.asInstanceOf[js.Any])
    
    inline def setStartConnectionUndefined: Self = StObject.set(x, "startConnection", js.undefined)
    
    inline def setWeight(value: SchemaDimension): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
