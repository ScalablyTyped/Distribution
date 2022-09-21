package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFamilies extends StObject {
  
  /**
    * Babysitting. Child care that is offered by hotel staffers or coordinated by hotel staffers with local child care professionals. Can be free or for a fee.
    */
  var babysitting: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Babysitting exception.
    */
  var babysittingException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kids activities. Recreational options such as sports, films, crafts and games designed for the enjoyment of children and offered at the hotel. May or may not be supervised. May or may not be at a designated time or place. Cab be free or for a fee.
    */
  var kidsActivities: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Kids activities exception.
    */
  var kidsActivitiesException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kids club. An organized program of group activities held at the hotel and designed for the enjoyment of children. Facilitated by hotel staff (or staff procured by the hotel) in an area(s) designated for the purpose of entertaining children without their parents. May include games, outings, water sports, team sports, arts and crafts, and films. Usually has set hours. Can be free or for a fee. Also known as Kids Camp or Kids program.
    */
  var kidsClub: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Kids club exception.
    */
  var kidsClubException: js.UndefOr[String | Null] = js.undefined
}
object SchemaFamilies {
  
  inline def apply(): SchemaFamilies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFamilies]
  }
  
  extension [Self <: SchemaFamilies](x: Self) {
    
    inline def setBabysitting(value: Boolean): Self = StObject.set(x, "babysitting", value.asInstanceOf[js.Any])
    
    inline def setBabysittingException(value: String): Self = StObject.set(x, "babysittingException", value.asInstanceOf[js.Any])
    
    inline def setBabysittingExceptionNull: Self = StObject.set(x, "babysittingException", null)
    
    inline def setBabysittingExceptionUndefined: Self = StObject.set(x, "babysittingException", js.undefined)
    
    inline def setBabysittingNull: Self = StObject.set(x, "babysitting", null)
    
    inline def setBabysittingUndefined: Self = StObject.set(x, "babysitting", js.undefined)
    
    inline def setKidsActivities(value: Boolean): Self = StObject.set(x, "kidsActivities", value.asInstanceOf[js.Any])
    
    inline def setKidsActivitiesException(value: String): Self = StObject.set(x, "kidsActivitiesException", value.asInstanceOf[js.Any])
    
    inline def setKidsActivitiesExceptionNull: Self = StObject.set(x, "kidsActivitiesException", null)
    
    inline def setKidsActivitiesExceptionUndefined: Self = StObject.set(x, "kidsActivitiesException", js.undefined)
    
    inline def setKidsActivitiesNull: Self = StObject.set(x, "kidsActivities", null)
    
    inline def setKidsActivitiesUndefined: Self = StObject.set(x, "kidsActivities", js.undefined)
    
    inline def setKidsClub(value: Boolean): Self = StObject.set(x, "kidsClub", value.asInstanceOf[js.Any])
    
    inline def setKidsClubException(value: String): Self = StObject.set(x, "kidsClubException", value.asInstanceOf[js.Any])
    
    inline def setKidsClubExceptionNull: Self = StObject.set(x, "kidsClubException", null)
    
    inline def setKidsClubExceptionUndefined: Self = StObject.set(x, "kidsClubException", js.undefined)
    
    inline def setKidsClubNull: Self = StObject.set(x, "kidsClub", null)
    
    inline def setKidsClubUndefined: Self = StObject.set(x, "kidsClub", js.undefined)
  }
}
