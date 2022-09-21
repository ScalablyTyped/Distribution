package typings.googleapis.mybusinesslodgingV1Mod.mybusinesslodgingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPools extends StObject {
  
  /**
    * Adult pool. A pool restricted for use by adults only. Can be indoors or outdoors.
    */
  var adultPool: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Adult pool exception.
    */
  var adultPoolException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Hot tub. A man-made pool containing bubbling water maintained at a higher temperature and circulated by aerating jets for the purpose of soaking, relaxation and hydrotherapy. Can be indoors or outdoors. Not used for active swimming. Also known as Jacuzzi. Hot tub must be in a common area where all guests can access it. Does not apply to room-specific hot tubs that are only accessible to guest occupying that room.
    */
  var hotTub: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Hot tub exception.
    */
  var hotTubException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indoor pool. A pool located inside the hotel and available for guests to use for swimming and/or soaking. Use may or may not be restricted to adults and/or children.
    */
  var indoorPool: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indoor pool exception.
    */
  var indoorPoolException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indoor pools count. The sum of all indoor pools at the hotel.
    */
  var indoorPoolsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Indoor pools count exception.
    */
  var indoorPoolsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Lazy river. A man-made pool or several interconnected recreational pools built to mimic the shape and current of a winding river where guests float in the water on inflated rubber tubes. Can be indoors or outdoors.
    */
  var lazyRiver: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Lazy river exception.
    */
  var lazyRiverException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Lifeguard. A trained member of the hotel staff stationed by the hotel's indoor or outdoor swimming area and responsible for the safety of swimming guests.
    */
  var lifeguard: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Lifeguard exception.
    */
  var lifeguardException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Outdoor pool. A pool located outside on the grounds of the hotel and available for guests to use for swimming, soaking or recreation. Use may or may not be restricted to adults and/or children.
    */
  var outdoorPool: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Outdoor pool exception.
    */
  var outdoorPoolException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Outdoor pools count. The sum of all outdoor pools at the hotel.
    */
  var outdoorPoolsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Outdoor pools count exception.
    */
  var outdoorPoolsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pool. The presence of a pool, either indoors or outdoors, for guests to use for swimming and/or soaking. Use may or may not be restricted to adults and/or children.
    */
  var pool: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Pool exception.
    */
  var poolException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Pools count. The sum of all pools at the hotel.
    */
  var poolsCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Pools count exception.
    */
  var poolsCountException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Wading pool. A shallow pool designed for small children to play in. Can be indoors or outdoors. Also known as kiddie pool.
    */
  var wadingPool: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Wading pool exception.
    */
  var wadingPoolException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Water park. An aquatic recreation area with a large pool or series of pools that has features such as a water slide or tube, wavepool, fountains, rope swings, and/or obstacle course. Can be indoors or outdoors. Also known as adventure pool.
    */
  var waterPark: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Water park exception.
    */
  var waterParkException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Waterslide. A continuously wetted chute positioned by an indoor or outdoor pool which people slide down into the water.
    */
  var waterslide: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Waterslide exception.
    */
  var waterslideException: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Wave pool. A large indoor or outdoor pool with a machine that produces water currents to mimic the ocean's crests.
    */
  var wavePool: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Wave pool exception.
    */
  var wavePoolException: js.UndefOr[String | Null] = js.undefined
}
object SchemaPools {
  
  inline def apply(): SchemaPools = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPools]
  }
  
  extension [Self <: SchemaPools](x: Self) {
    
    inline def setAdultPool(value: Boolean): Self = StObject.set(x, "adultPool", value.asInstanceOf[js.Any])
    
    inline def setAdultPoolException(value: String): Self = StObject.set(x, "adultPoolException", value.asInstanceOf[js.Any])
    
    inline def setAdultPoolExceptionNull: Self = StObject.set(x, "adultPoolException", null)
    
    inline def setAdultPoolExceptionUndefined: Self = StObject.set(x, "adultPoolException", js.undefined)
    
    inline def setAdultPoolNull: Self = StObject.set(x, "adultPool", null)
    
    inline def setAdultPoolUndefined: Self = StObject.set(x, "adultPool", js.undefined)
    
    inline def setHotTub(value: Boolean): Self = StObject.set(x, "hotTub", value.asInstanceOf[js.Any])
    
    inline def setHotTubException(value: String): Self = StObject.set(x, "hotTubException", value.asInstanceOf[js.Any])
    
    inline def setHotTubExceptionNull: Self = StObject.set(x, "hotTubException", null)
    
    inline def setHotTubExceptionUndefined: Self = StObject.set(x, "hotTubException", js.undefined)
    
    inline def setHotTubNull: Self = StObject.set(x, "hotTub", null)
    
    inline def setHotTubUndefined: Self = StObject.set(x, "hotTub", js.undefined)
    
    inline def setIndoorPool(value: Boolean): Self = StObject.set(x, "indoorPool", value.asInstanceOf[js.Any])
    
    inline def setIndoorPoolException(value: String): Self = StObject.set(x, "indoorPoolException", value.asInstanceOf[js.Any])
    
    inline def setIndoorPoolExceptionNull: Self = StObject.set(x, "indoorPoolException", null)
    
    inline def setIndoorPoolExceptionUndefined: Self = StObject.set(x, "indoorPoolException", js.undefined)
    
    inline def setIndoorPoolNull: Self = StObject.set(x, "indoorPool", null)
    
    inline def setIndoorPoolUndefined: Self = StObject.set(x, "indoorPool", js.undefined)
    
    inline def setIndoorPoolsCount(value: Double): Self = StObject.set(x, "indoorPoolsCount", value.asInstanceOf[js.Any])
    
    inline def setIndoorPoolsCountException(value: String): Self = StObject.set(x, "indoorPoolsCountException", value.asInstanceOf[js.Any])
    
    inline def setIndoorPoolsCountExceptionNull: Self = StObject.set(x, "indoorPoolsCountException", null)
    
    inline def setIndoorPoolsCountExceptionUndefined: Self = StObject.set(x, "indoorPoolsCountException", js.undefined)
    
    inline def setIndoorPoolsCountNull: Self = StObject.set(x, "indoorPoolsCount", null)
    
    inline def setIndoorPoolsCountUndefined: Self = StObject.set(x, "indoorPoolsCount", js.undefined)
    
    inline def setLazyRiver(value: Boolean): Self = StObject.set(x, "lazyRiver", value.asInstanceOf[js.Any])
    
    inline def setLazyRiverException(value: String): Self = StObject.set(x, "lazyRiverException", value.asInstanceOf[js.Any])
    
    inline def setLazyRiverExceptionNull: Self = StObject.set(x, "lazyRiverException", null)
    
    inline def setLazyRiverExceptionUndefined: Self = StObject.set(x, "lazyRiverException", js.undefined)
    
    inline def setLazyRiverNull: Self = StObject.set(x, "lazyRiver", null)
    
    inline def setLazyRiverUndefined: Self = StObject.set(x, "lazyRiver", js.undefined)
    
    inline def setLifeguard(value: Boolean): Self = StObject.set(x, "lifeguard", value.asInstanceOf[js.Any])
    
    inline def setLifeguardException(value: String): Self = StObject.set(x, "lifeguardException", value.asInstanceOf[js.Any])
    
    inline def setLifeguardExceptionNull: Self = StObject.set(x, "lifeguardException", null)
    
    inline def setLifeguardExceptionUndefined: Self = StObject.set(x, "lifeguardException", js.undefined)
    
    inline def setLifeguardNull: Self = StObject.set(x, "lifeguard", null)
    
    inline def setLifeguardUndefined: Self = StObject.set(x, "lifeguard", js.undefined)
    
    inline def setOutdoorPool(value: Boolean): Self = StObject.set(x, "outdoorPool", value.asInstanceOf[js.Any])
    
    inline def setOutdoorPoolException(value: String): Self = StObject.set(x, "outdoorPoolException", value.asInstanceOf[js.Any])
    
    inline def setOutdoorPoolExceptionNull: Self = StObject.set(x, "outdoorPoolException", null)
    
    inline def setOutdoorPoolExceptionUndefined: Self = StObject.set(x, "outdoorPoolException", js.undefined)
    
    inline def setOutdoorPoolNull: Self = StObject.set(x, "outdoorPool", null)
    
    inline def setOutdoorPoolUndefined: Self = StObject.set(x, "outdoorPool", js.undefined)
    
    inline def setOutdoorPoolsCount(value: Double): Self = StObject.set(x, "outdoorPoolsCount", value.asInstanceOf[js.Any])
    
    inline def setOutdoorPoolsCountException(value: String): Self = StObject.set(x, "outdoorPoolsCountException", value.asInstanceOf[js.Any])
    
    inline def setOutdoorPoolsCountExceptionNull: Self = StObject.set(x, "outdoorPoolsCountException", null)
    
    inline def setOutdoorPoolsCountExceptionUndefined: Self = StObject.set(x, "outdoorPoolsCountException", js.undefined)
    
    inline def setOutdoorPoolsCountNull: Self = StObject.set(x, "outdoorPoolsCount", null)
    
    inline def setOutdoorPoolsCountUndefined: Self = StObject.set(x, "outdoorPoolsCount", js.undefined)
    
    inline def setPool(value: Boolean): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setPoolException(value: String): Self = StObject.set(x, "poolException", value.asInstanceOf[js.Any])
    
    inline def setPoolExceptionNull: Self = StObject.set(x, "poolException", null)
    
    inline def setPoolExceptionUndefined: Self = StObject.set(x, "poolException", js.undefined)
    
    inline def setPoolNull: Self = StObject.set(x, "pool", null)
    
    inline def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    inline def setPoolsCount(value: Double): Self = StObject.set(x, "poolsCount", value.asInstanceOf[js.Any])
    
    inline def setPoolsCountException(value: String): Self = StObject.set(x, "poolsCountException", value.asInstanceOf[js.Any])
    
    inline def setPoolsCountExceptionNull: Self = StObject.set(x, "poolsCountException", null)
    
    inline def setPoolsCountExceptionUndefined: Self = StObject.set(x, "poolsCountException", js.undefined)
    
    inline def setPoolsCountNull: Self = StObject.set(x, "poolsCount", null)
    
    inline def setPoolsCountUndefined: Self = StObject.set(x, "poolsCount", js.undefined)
    
    inline def setWadingPool(value: Boolean): Self = StObject.set(x, "wadingPool", value.asInstanceOf[js.Any])
    
    inline def setWadingPoolException(value: String): Self = StObject.set(x, "wadingPoolException", value.asInstanceOf[js.Any])
    
    inline def setWadingPoolExceptionNull: Self = StObject.set(x, "wadingPoolException", null)
    
    inline def setWadingPoolExceptionUndefined: Self = StObject.set(x, "wadingPoolException", js.undefined)
    
    inline def setWadingPoolNull: Self = StObject.set(x, "wadingPool", null)
    
    inline def setWadingPoolUndefined: Self = StObject.set(x, "wadingPool", js.undefined)
    
    inline def setWaterPark(value: Boolean): Self = StObject.set(x, "waterPark", value.asInstanceOf[js.Any])
    
    inline def setWaterParkException(value: String): Self = StObject.set(x, "waterParkException", value.asInstanceOf[js.Any])
    
    inline def setWaterParkExceptionNull: Self = StObject.set(x, "waterParkException", null)
    
    inline def setWaterParkExceptionUndefined: Self = StObject.set(x, "waterParkException", js.undefined)
    
    inline def setWaterParkNull: Self = StObject.set(x, "waterPark", null)
    
    inline def setWaterParkUndefined: Self = StObject.set(x, "waterPark", js.undefined)
    
    inline def setWaterslide(value: Boolean): Self = StObject.set(x, "waterslide", value.asInstanceOf[js.Any])
    
    inline def setWaterslideException(value: String): Self = StObject.set(x, "waterslideException", value.asInstanceOf[js.Any])
    
    inline def setWaterslideExceptionNull: Self = StObject.set(x, "waterslideException", null)
    
    inline def setWaterslideExceptionUndefined: Self = StObject.set(x, "waterslideException", js.undefined)
    
    inline def setWaterslideNull: Self = StObject.set(x, "waterslide", null)
    
    inline def setWaterslideUndefined: Self = StObject.set(x, "waterslide", js.undefined)
    
    inline def setWavePool(value: Boolean): Self = StObject.set(x, "wavePool", value.asInstanceOf[js.Any])
    
    inline def setWavePoolException(value: String): Self = StObject.set(x, "wavePoolException", value.asInstanceOf[js.Any])
    
    inline def setWavePoolExceptionNull: Self = StObject.set(x, "wavePoolException", null)
    
    inline def setWavePoolExceptionUndefined: Self = StObject.set(x, "wavePoolException", js.undefined)
    
    inline def setWavePoolNull: Self = StObject.set(x, "wavePool", null)
    
    inline def setWavePoolUndefined: Self = StObject.set(x, "wavePool", js.undefined)
  }
}
