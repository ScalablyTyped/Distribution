package typings.mapboxGl.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://github.com/mapbox/tilejson-spec/tree/master/3.0.0#33-vector_layers
  */
trait SourceVectorLayer extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var fields: js.UndefOr[Record[String, String]] = js.undefined
  
  var id: String
  
  var maxzoom: js.UndefOr[Double] = js.undefined
  
  var minzoom: js.UndefOr[Double] = js.undefined
  
  // Non standard extensions that are valid in a Mapbox context.
  var source: js.UndefOr[String] = js.undefined
  
  var source_name: js.UndefOr[String] = js.undefined
}
object SourceVectorLayer {
  
  inline def apply(id: String): SourceVectorLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceVectorLayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceVectorLayer] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFields(value: Record[String, String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
    
    inline def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSource_name(value: String): Self = StObject.set(x, "source_name", value.asInstanceOf[js.Any])
    
    inline def setSource_nameUndefined: Self = StObject.set(x, "source_name", js.undefined)
  }
}
