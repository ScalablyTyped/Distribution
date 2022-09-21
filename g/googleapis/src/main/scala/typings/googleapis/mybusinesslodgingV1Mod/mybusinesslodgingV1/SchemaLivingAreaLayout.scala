package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLivingAreaLayout extends StObject {
  
  /**
    * Balcony. An outdoor platform attached to a building and surrounded by a short wall, fence or other safety railing. The balcony is accessed through a door in a guestroom or suite and is for use by the guest staying in that room. May or may not include seating or outdoor furniture. Is not located on the ground floor. Also lanai.
    */
  var balcony: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Balcony exception.
    */
  var balconyException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Living area sq meters. The measurement in meters of the area of a guestroom's living space.
    */
  var livingAreaSqMeters: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Living area sq meters exception.
    */
  var livingAreaSqMetersException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Loft. A three-walled upper area accessed by stairs or a ladder that overlooks the lower area of a room.
    */
  var loft: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Loft exception.
    */
  var loftException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Non smoking. A guestroom in which the smoking of cigarettes, cigars and pipes is prohibited.
    */
  var nonSmoking: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Non smoking exception.
    */
  var nonSmokingException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Patio. A paved, outdoor area with seating attached to and accessed through a ground-floor guestroom for use by the occupants of the guestroom.
    */
  var patio: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Patio exception.
    */
  var patioException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Stairs. There are steps leading from one level or story to another in the unit.
    */
  var stairs: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Stairs exception.
    */
  var stairsException: js.UndefOr[String | Null] = js.undefined
}
object SchemaLivingAreaLayout {
  
  inline def apply(): SchemaLivingAreaLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLivingAreaLayout]
  }
  
  extension [Self <: SchemaLivingAreaLayout](x: Self) {
    
    inline def setBalcony(value: Boolean): Self = StObject.set(x, "balcony", value.asInstanceOf[js.Any])
    
    inline def setBalconyException(value: String): Self = StObject.set(x, "balconyException", value.asInstanceOf[js.Any])
    
    inline def setBalconyExceptionNull: Self = StObject.set(x, "balconyException", null)
    
    inline def setBalconyExceptionUndefined: Self = StObject.set(x, "balconyException", js.undefined)
    
    inline def setBalconyNull: Self = StObject.set(x, "balcony", null)
    
    inline def setBalconyUndefined: Self = StObject.set(x, "balcony", js.undefined)
    
    inline def setLivingAreaSqMeters(value: Double): Self = StObject.set(x, "livingAreaSqMeters", value.asInstanceOf[js.Any])
    
    inline def setLivingAreaSqMetersException(value: String): Self = StObject.set(x, "livingAreaSqMetersException", value.asInstanceOf[js.Any])
    
    inline def setLivingAreaSqMetersExceptionNull: Self = StObject.set(x, "livingAreaSqMetersException", null)
    
    inline def setLivingAreaSqMetersExceptionUndefined: Self = StObject.set(x, "livingAreaSqMetersException", js.undefined)
    
    inline def setLivingAreaSqMetersNull: Self = StObject.set(x, "livingAreaSqMeters", null)
    
    inline def setLivingAreaSqMetersUndefined: Self = StObject.set(x, "livingAreaSqMeters", js.undefined)
    
    inline def setLoft(value: Boolean): Self = StObject.set(x, "loft", value.asInstanceOf[js.Any])
    
    inline def setLoftException(value: String): Self = StObject.set(x, "loftException", value.asInstanceOf[js.Any])
    
    inline def setLoftExceptionNull: Self = StObject.set(x, "loftException", null)
    
    inline def setLoftExceptionUndefined: Self = StObject.set(x, "loftException", js.undefined)
    
    inline def setLoftNull: Self = StObject.set(x, "loft", null)
    
    inline def setLoftUndefined: Self = StObject.set(x, "loft", js.undefined)
    
    inline def setNonSmoking(value: Boolean): Self = StObject.set(x, "nonSmoking", value.asInstanceOf[js.Any])
    
    inline def setNonSmokingException(value: String): Self = StObject.set(x, "nonSmokingException", value.asInstanceOf[js.Any])
    
    inline def setNonSmokingExceptionNull: Self = StObject.set(x, "nonSmokingException", null)
    
    inline def setNonSmokingExceptionUndefined: Self = StObject.set(x, "nonSmokingException", js.undefined)
    
    inline def setNonSmokingNull: Self = StObject.set(x, "nonSmoking", null)
    
    inline def setNonSmokingUndefined: Self = StObject.set(x, "nonSmoking", js.undefined)
    
    inline def setPatio(value: Boolean): Self = StObject.set(x, "patio", value.asInstanceOf[js.Any])
    
    inline def setPatioException(value: String): Self = StObject.set(x, "patioException", value.asInstanceOf[js.Any])
    
    inline def setPatioExceptionNull: Self = StObject.set(x, "patioException", null)
    
    inline def setPatioExceptionUndefined: Self = StObject.set(x, "patioException", js.undefined)
    
    inline def setPatioNull: Self = StObject.set(x, "patio", null)
    
    inline def setPatioUndefined: Self = StObject.set(x, "patio", js.undefined)
    
    inline def setStairs(value: Boolean): Self = StObject.set(x, "stairs", value.asInstanceOf[js.Any])
    
    inline def setStairsException(value: String): Self = StObject.set(x, "stairsException", value.asInstanceOf[js.Any])
    
    inline def setStairsExceptionNull: Self = StObject.set(x, "stairsException", null)
    
    inline def setStairsExceptionUndefined: Self = StObject.set(x, "stairsException", js.undefined)
    
    inline def setStairsNull: Self = StObject.set(x, "stairs", null)
    
    inline def setStairsUndefined: Self = StObject.set(x, "stairs", js.undefined)
  }
}
