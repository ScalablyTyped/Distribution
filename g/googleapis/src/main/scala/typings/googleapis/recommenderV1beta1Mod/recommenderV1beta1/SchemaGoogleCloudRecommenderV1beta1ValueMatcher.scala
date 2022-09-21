package typings.googleapis.recommenderV1beta1Mod.recommenderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommenderV1beta1ValueMatcher extends StObject {
  
  /**
    * To be used for full regex matching. The regular expression is using the Google RE2 syntax (https://github.com/google/re2/wiki/Syntax), so to be used with RE2::FullMatch
    */
  var matchesPattern: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommenderV1beta1ValueMatcher {
  
  inline def apply(): SchemaGoogleCloudRecommenderV1beta1ValueMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommenderV1beta1ValueMatcher]
  }
  
  extension [Self <: SchemaGoogleCloudRecommenderV1beta1ValueMatcher](x: Self) {
    
    inline def setMatchesPattern(value: String): Self = StObject.set(x, "matchesPattern", value.asInstanceOf[js.Any])
    
    inline def setMatchesPatternNull: Self = StObject.set(x, "matchesPattern", null)
    
    inline def setMatchesPatternUndefined: Self = StObject.set(x, "matchesPattern", js.undefined)
  }
}
