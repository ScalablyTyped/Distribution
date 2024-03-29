package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAndroidVersion extends StObject {
  
  /**
    * The API level for this Android version. Examples: 18, 19.
    */
  var apiLevel: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The code name for this Android version. Examples: "JellyBean", "KitKat".
    */
  var codeName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Market share for this version.
    */
  var distribution: js.UndefOr[SchemaDistribution] = js.undefined
  
  /**
    * An opaque id for this Android version. Use this id to invoke the TestExecutionService.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date this Android version became available in the market.
    */
  var releaseDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * Tags for this dimension. Examples: "default", "preview", "deprecated".
    */
  var tags: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A string representing this version of the Android OS. Examples: "4.3", "4.4".
    */
  var versionString: js.UndefOr[String | Null] = js.undefined
}
object SchemaAndroidVersion {
  
  inline def apply(): SchemaAndroidVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidVersion]
  }
  
  extension [Self <: SchemaAndroidVersion](x: Self) {
    
    inline def setApiLevel(value: Double): Self = StObject.set(x, "apiLevel", value.asInstanceOf[js.Any])
    
    inline def setApiLevelNull: Self = StObject.set(x, "apiLevel", null)
    
    inline def setApiLevelUndefined: Self = StObject.set(x, "apiLevel", js.undefined)
    
    inline def setCodeName(value: String): Self = StObject.set(x, "codeName", value.asInstanceOf[js.Any])
    
    inline def setCodeNameNull: Self = StObject.set(x, "codeName", null)
    
    inline def setCodeNameUndefined: Self = StObject.set(x, "codeName", js.undefined)
    
    inline def setDistribution(value: SchemaDistribution): Self = StObject.set(x, "distribution", value.asInstanceOf[js.Any])
    
    inline def setDistributionUndefined: Self = StObject.set(x, "distribution", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setReleaseDate(value: SchemaDate): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateUndefined: Self = StObject.set(x, "releaseDate", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsNull: Self = StObject.set(x, "tags", null)
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVersionString(value: String): Self = StObject.set(x, "versionString", value.asInstanceOf[js.Any])
    
    inline def setVersionStringNull: Self = StObject.set(x, "versionString", null)
    
    inline def setVersionStringUndefined: Self = StObject.set(x, "versionString", js.undefined)
  }
}
