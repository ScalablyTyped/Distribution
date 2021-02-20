package typings.mapsjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeometryFieldName extends StObject {
  
  var bleedRatio: js.UndefOr[Double] = js.native
  
  var geometryFieldName: String = js.native
  
  var valueFieldNames: js.Array[String] = js.native
}
object GeometryFieldName {
  
  @scala.inline
  def apply(geometryFieldName: String, valueFieldNames: js.Array[String]): GeometryFieldName = {
    val __obj = js.Dynamic.literal(geometryFieldName = geometryFieldName.asInstanceOf[js.Any], valueFieldNames = valueFieldNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryFieldName]
  }
  
  @scala.inline
  implicit class GeometryFieldNameMutableBuilder[Self <: GeometryFieldName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBleedRatio(value: Double): Self = StObject.set(x, "bleedRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBleedRatioUndefined: Self = StObject.set(x, "bleedRatio", js.undefined)
    
    @scala.inline
    def setGeometryFieldName(value: String): Self = StObject.set(x, "geometryFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFieldNames(value: js.Array[String]): Self = StObject.set(x, "valueFieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFieldNamesVarargs(value: String*): Self = StObject.set(x, "valueFieldNames", js.Array(value :_*))
  }
}
