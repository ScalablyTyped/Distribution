package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLivingAreaSleeping extends StObject {
  
  /**
    * Beds count. The number of permanent beds present in a guestroom. Does not include rollaway beds, cribs or sofabeds.
    */
  var bedsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Beds count exception.
    */
  var bedsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Bunk beds count. The number of furniture pieces in which one framed mattress is fixed directly above another by means of a physical frame. This allows one person(s) to sleep in the bottom bunk and one person(s) to sleep in the top bunk. Also known as double decker bed.
    */
  var bunkBedsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Bunk beds count exception.
    */
  var bunkBedsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Cribs count. The number of small beds for an infant or toddler that the guestroom can obtain. The bed is surrounded by a high railing to prevent the child from falling or climbing out of the bed
    */
  var cribsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Cribs count exception.
    */
  var cribsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Double beds count. The number of medium beds measuring 53"W x 75"L (135cm x 191cm). Also known as full size bed.
    */
  var doubleBedsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Double beds count exception.
    */
  var doubleBedsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Feather pillows. The option for guests to obtain bed pillows that are stuffed with the feathers and down of ducks or geese.
    */
  var featherPillows: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Feather pillows exception.
    */
  var featherPillowsException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Hypoallergenic bedding. Bedding such as linens, pillows, mattress covers and/or mattresses that are made of materials known to be resistant to allergens such as mold, dust and dander.
    */
  var hypoallergenicBedding: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Hypoallergenic bedding exception.
    */
  var hypoallergenicBeddingException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * King beds count. The number of large beds measuring 76"W x 80"L (193cm x 102cm). Most often meant to accompany two people. Includes California king and super king.
    */
  var kingBedsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * King beds count exception.
    */
  var kingBedsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Memory foam pillows. The option for guests to obtain bed pillows that are stuffed with a man-made foam that responds to body heat by conforming to the body closely, and then recovers its shape when the pillow cools down.
    */
  var memoryFoamPillows: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Memory foam pillows exception.
    */
  var memoryFoamPillowsException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Other beds count. The number of beds that are not standard mattress and boxspring setups such as Japanese tatami mats, trundle beds, air mattresses and cots.
    */
  var otherBedsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Other beds count exception.
    */
  var otherBedsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Queen beds count. The number of medium-large beds measuring 60"W x 80"L (152cm x 102cm).
    */
  var queenBedsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Queen beds count exception.
    */
  var queenBedsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Roll away beds count. The number of mattresses on wheeled frames that can be folded in half and rolled away for easy storage that the guestroom can obtain upon request.
    */
  var rollAwayBedsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Roll away beds count exception.
    */
  var rollAwayBedsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Single or twin count beds. The number of smaller beds measuring 38"W x 75"L (97cm x 191cm) that can accommodate one adult.
    */
  var singleOrTwinBedsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Single or twin beds count exception.
    */
  var singleOrTwinBedsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sofa beds count. The number of specially designed sofas that can be made to serve as a bed by lowering its hinged upholstered back to horizontal position or by pulling out a concealed mattress.
    */
  var sofaBedsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Sofa beds count exception.
    */
  var sofaBedsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Synthetic pillows. The option for guests to obtain bed pillows stuffed with polyester material crafted to reproduce the feel of a pillow stuffed with down and feathers.
    */
  var syntheticPillows: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Synthetic pillows exception.
    */
  var syntheticPillowsException: js.UndefOr[String | Null] = js.undefined
}
object SchemaLivingAreaSleeping {
  
  inline def apply(): SchemaLivingAreaSleeping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLivingAreaSleeping]
  }
  
  extension [Self <: SchemaLivingAreaSleeping](x: Self) {
    
    inline def setBedsCount(value: Double): Self = StObject.set(x, "bedsCount", value.asInstanceOf[js.Any])
    
    inline def setBedsCountException(value: String): Self = StObject.set(x, "bedsCountException", value.asInstanceOf[js.Any])
    
    inline def setBedsCountExceptionNull: Self = StObject.set(x, "bedsCountException", null)
    
    inline def setBedsCountExceptionUndefined: Self = StObject.set(x, "bedsCountException", js.undefined)
    
    inline def setBedsCountNull: Self = StObject.set(x, "bedsCount", null)
    
    inline def setBedsCountUndefined: Self = StObject.set(x, "bedsCount", js.undefined)
    
    inline def setBunkBedsCount(value: Double): Self = StObject.set(x, "bunkBedsCount", value.asInstanceOf[js.Any])
    
    inline def setBunkBedsCountException(value: String): Self = StObject.set(x, "bunkBedsCountException", value.asInstanceOf[js.Any])
    
    inline def setBunkBedsCountExceptionNull: Self = StObject.set(x, "bunkBedsCountException", null)
    
    inline def setBunkBedsCountExceptionUndefined: Self = StObject.set(x, "bunkBedsCountException", js.undefined)
    
    inline def setBunkBedsCountNull: Self = StObject.set(x, "bunkBedsCount", null)
    
    inline def setBunkBedsCountUndefined: Self = StObject.set(x, "bunkBedsCount", js.undefined)
    
    inline def setCribsCount(value: Double): Self = StObject.set(x, "cribsCount", value.asInstanceOf[js.Any])
    
    inline def setCribsCountException(value: String): Self = StObject.set(x, "cribsCountException", value.asInstanceOf[js.Any])
    
    inline def setCribsCountExceptionNull: Self = StObject.set(x, "cribsCountException", null)
    
    inline def setCribsCountExceptionUndefined: Self = StObject.set(x, "cribsCountException", js.undefined)
    
    inline def setCribsCountNull: Self = StObject.set(x, "cribsCount", null)
    
    inline def setCribsCountUndefined: Self = StObject.set(x, "cribsCount", js.undefined)
    
    inline def setDoubleBedsCount(value: Double): Self = StObject.set(x, "doubleBedsCount", value.asInstanceOf[js.Any])
    
    inline def setDoubleBedsCountException(value: String): Self = StObject.set(x, "doubleBedsCountException", value.asInstanceOf[js.Any])
    
    inline def setDoubleBedsCountExceptionNull: Self = StObject.set(x, "doubleBedsCountException", null)
    
    inline def setDoubleBedsCountExceptionUndefined: Self = StObject.set(x, "doubleBedsCountException", js.undefined)
    
    inline def setDoubleBedsCountNull: Self = StObject.set(x, "doubleBedsCount", null)
    
    inline def setDoubleBedsCountUndefined: Self = StObject.set(x, "doubleBedsCount", js.undefined)
    
    inline def setFeatherPillows(value: Boolean): Self = StObject.set(x, "featherPillows", value.asInstanceOf[js.Any])
    
    inline def setFeatherPillowsException(value: String): Self = StObject.set(x, "featherPillowsException", value.asInstanceOf[js.Any])
    
    inline def setFeatherPillowsExceptionNull: Self = StObject.set(x, "featherPillowsException", null)
    
    inline def setFeatherPillowsExceptionUndefined: Self = StObject.set(x, "featherPillowsException", js.undefined)
    
    inline def setFeatherPillowsNull: Self = StObject.set(x, "featherPillows", null)
    
    inline def setFeatherPillowsUndefined: Self = StObject.set(x, "featherPillows", js.undefined)
    
    inline def setHypoallergenicBedding(value: Boolean): Self = StObject.set(x, "hypoallergenicBedding", value.asInstanceOf[js.Any])
    
    inline def setHypoallergenicBeddingException(value: String): Self = StObject.set(x, "hypoallergenicBeddingException", value.asInstanceOf[js.Any])
    
    inline def setHypoallergenicBeddingExceptionNull: Self = StObject.set(x, "hypoallergenicBeddingException", null)
    
    inline def setHypoallergenicBeddingExceptionUndefined: Self = StObject.set(x, "hypoallergenicBeddingException", js.undefined)
    
    inline def setHypoallergenicBeddingNull: Self = StObject.set(x, "hypoallergenicBedding", null)
    
    inline def setHypoallergenicBeddingUndefined: Self = StObject.set(x, "hypoallergenicBedding", js.undefined)
    
    inline def setKingBedsCount(value: Double): Self = StObject.set(x, "kingBedsCount", value.asInstanceOf[js.Any])
    
    inline def setKingBedsCountException(value: String): Self = StObject.set(x, "kingBedsCountException", value.asInstanceOf[js.Any])
    
    inline def setKingBedsCountExceptionNull: Self = StObject.set(x, "kingBedsCountException", null)
    
    inline def setKingBedsCountExceptionUndefined: Self = StObject.set(x, "kingBedsCountException", js.undefined)
    
    inline def setKingBedsCountNull: Self = StObject.set(x, "kingBedsCount", null)
    
    inline def setKingBedsCountUndefined: Self = StObject.set(x, "kingBedsCount", js.undefined)
    
    inline def setMemoryFoamPillows(value: Boolean): Self = StObject.set(x, "memoryFoamPillows", value.asInstanceOf[js.Any])
    
    inline def setMemoryFoamPillowsException(value: String): Self = StObject.set(x, "memoryFoamPillowsException", value.asInstanceOf[js.Any])
    
    inline def setMemoryFoamPillowsExceptionNull: Self = StObject.set(x, "memoryFoamPillowsException", null)
    
    inline def setMemoryFoamPillowsExceptionUndefined: Self = StObject.set(x, "memoryFoamPillowsException", js.undefined)
    
    inline def setMemoryFoamPillowsNull: Self = StObject.set(x, "memoryFoamPillows", null)
    
    inline def setMemoryFoamPillowsUndefined: Self = StObject.set(x, "memoryFoamPillows", js.undefined)
    
    inline def setOtherBedsCount(value: Double): Self = StObject.set(x, "otherBedsCount", value.asInstanceOf[js.Any])
    
    inline def setOtherBedsCountException(value: String): Self = StObject.set(x, "otherBedsCountException", value.asInstanceOf[js.Any])
    
    inline def setOtherBedsCountExceptionNull: Self = StObject.set(x, "otherBedsCountException", null)
    
    inline def setOtherBedsCountExceptionUndefined: Self = StObject.set(x, "otherBedsCountException", js.undefined)
    
    inline def setOtherBedsCountNull: Self = StObject.set(x, "otherBedsCount", null)
    
    inline def setOtherBedsCountUndefined: Self = StObject.set(x, "otherBedsCount", js.undefined)
    
    inline def setQueenBedsCount(value: Double): Self = StObject.set(x, "queenBedsCount", value.asInstanceOf[js.Any])
    
    inline def setQueenBedsCountException(value: String): Self = StObject.set(x, "queenBedsCountException", value.asInstanceOf[js.Any])
    
    inline def setQueenBedsCountExceptionNull: Self = StObject.set(x, "queenBedsCountException", null)
    
    inline def setQueenBedsCountExceptionUndefined: Self = StObject.set(x, "queenBedsCountException", js.undefined)
    
    inline def setQueenBedsCountNull: Self = StObject.set(x, "queenBedsCount", null)
    
    inline def setQueenBedsCountUndefined: Self = StObject.set(x, "queenBedsCount", js.undefined)
    
    inline def setRollAwayBedsCount(value: Double): Self = StObject.set(x, "rollAwayBedsCount", value.asInstanceOf[js.Any])
    
    inline def setRollAwayBedsCountException(value: String): Self = StObject.set(x, "rollAwayBedsCountException", value.asInstanceOf[js.Any])
    
    inline def setRollAwayBedsCountExceptionNull: Self = StObject.set(x, "rollAwayBedsCountException", null)
    
    inline def setRollAwayBedsCountExceptionUndefined: Self = StObject.set(x, "rollAwayBedsCountException", js.undefined)
    
    inline def setRollAwayBedsCountNull: Self = StObject.set(x, "rollAwayBedsCount", null)
    
    inline def setRollAwayBedsCountUndefined: Self = StObject.set(x, "rollAwayBedsCount", js.undefined)
    
    inline def setSingleOrTwinBedsCount(value: Double): Self = StObject.set(x, "singleOrTwinBedsCount", value.asInstanceOf[js.Any])
    
    inline def setSingleOrTwinBedsCountException(value: String): Self = StObject.set(x, "singleOrTwinBedsCountException", value.asInstanceOf[js.Any])
    
    inline def setSingleOrTwinBedsCountExceptionNull: Self = StObject.set(x, "singleOrTwinBedsCountException", null)
    
    inline def setSingleOrTwinBedsCountExceptionUndefined: Self = StObject.set(x, "singleOrTwinBedsCountException", js.undefined)
    
    inline def setSingleOrTwinBedsCountNull: Self = StObject.set(x, "singleOrTwinBedsCount", null)
    
    inline def setSingleOrTwinBedsCountUndefined: Self = StObject.set(x, "singleOrTwinBedsCount", js.undefined)
    
    inline def setSofaBedsCount(value: Double): Self = StObject.set(x, "sofaBedsCount", value.asInstanceOf[js.Any])
    
    inline def setSofaBedsCountException(value: String): Self = StObject.set(x, "sofaBedsCountException", value.asInstanceOf[js.Any])
    
    inline def setSofaBedsCountExceptionNull: Self = StObject.set(x, "sofaBedsCountException", null)
    
    inline def setSofaBedsCountExceptionUndefined: Self = StObject.set(x, "sofaBedsCountException", js.undefined)
    
    inline def setSofaBedsCountNull: Self = StObject.set(x, "sofaBedsCount", null)
    
    inline def setSofaBedsCountUndefined: Self = StObject.set(x, "sofaBedsCount", js.undefined)
    
    inline def setSyntheticPillows(value: Boolean): Self = StObject.set(x, "syntheticPillows", value.asInstanceOf[js.Any])
    
    inline def setSyntheticPillowsException(value: String): Self = StObject.set(x, "syntheticPillowsException", value.asInstanceOf[js.Any])
    
    inline def setSyntheticPillowsExceptionNull: Self = StObject.set(x, "syntheticPillowsException", null)
    
    inline def setSyntheticPillowsExceptionUndefined: Self = StObject.set(x, "syntheticPillowsException", js.undefined)
    
    inline def setSyntheticPillowsNull: Self = StObject.set(x, "syntheticPillows", null)
    
    inline def setSyntheticPillowsUndefined: Self = StObject.set(x, "syntheticPillows", js.undefined)
  }
}
