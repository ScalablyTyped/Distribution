package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBasemapZOrder extends StObject {
  
  /**
    * The second most significant component of the ordering of a component to be rendered onto the basemap.
    */
  var zGrade: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The most significant component of the ordering of a component to be rendered onto the basemap.
    */
  var zPlane: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The least significant component of the ordering of a component to be rendered onto the basemap.
    */
  var zWithinGrade: js.UndefOr[Double | Null] = js.undefined
}
object SchemaBasemapZOrder {
  
  inline def apply(): SchemaBasemapZOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasemapZOrder]
  }
  
  extension [Self <: SchemaBasemapZOrder](x: Self) {
    
    inline def setZGrade(value: Double): Self = StObject.set(x, "zGrade", value.asInstanceOf[js.Any])
    
    inline def setZGradeNull: Self = StObject.set(x, "zGrade", null)
    
    inline def setZGradeUndefined: Self = StObject.set(x, "zGrade", js.undefined)
    
    inline def setZPlane(value: Double): Self = StObject.set(x, "zPlane", value.asInstanceOf[js.Any])
    
    inline def setZPlaneNull: Self = StObject.set(x, "zPlane", null)
    
    inline def setZPlaneUndefined: Self = StObject.set(x, "zPlane", js.undefined)
    
    inline def setZWithinGrade(value: Double): Self = StObject.set(x, "zWithinGrade", value.asInstanceOf[js.Any])
    
    inline def setZWithinGradeNull: Self = StObject.set(x, "zWithinGrade", null)
    
    inline def setZWithinGradeUndefined: Self = StObject.set(x, "zWithinGrade", js.undefined)
  }
}
