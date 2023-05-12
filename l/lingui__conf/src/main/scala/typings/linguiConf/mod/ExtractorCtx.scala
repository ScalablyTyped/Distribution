package typings.linguiConf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtractorCtx extends StObject {
  
  var linguiConfig: LinguiConfigNormalized
  
  /**
    * Raw Sourcemaps object to mapping from.
    * Check the https://github.com/mozilla/source-map#new-sourcemapconsumerrawsourcemap
    */
  var sourceMaps: js.UndefOr[Any] = js.undefined
}
object ExtractorCtx {
  
  inline def apply(linguiConfig: LinguiConfigNormalized): ExtractorCtx = {
    val __obj = js.Dynamic.literal(linguiConfig = linguiConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractorCtx]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtractorCtx] (val x: Self) extends AnyVal {
    
    inline def setLinguiConfig(value: LinguiConfigNormalized): Self = StObject.set(x, "linguiConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceMaps(value: Any): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
    
    inline def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
  }
}
