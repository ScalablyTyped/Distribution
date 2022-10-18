package typings.matrixBotSdk

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsServerVersionsMod {
  
  trait ServerVersions extends StObject {
    
    var unstable_features: js.UndefOr[Record[String, Boolean]] = js.undefined
    
    var versions: js.Array[String]
  }
  object ServerVersions {
    
    inline def apply(versions: js.Array[String]): ServerVersions = {
      val __obj = js.Dynamic.literal(versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerVersions]
    }
    
    extension [Self <: ServerVersions](x: Self) {
      
      inline def setUnstable_features(value: Record[String, Boolean]): Self = StObject.set(x, "unstable_features", value.asInstanceOf[js.Any])
      
      inline def setUnstable_featuresUndefined: Self = StObject.set(x, "unstable_features", js.undefined)
      
      inline def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      inline def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value*))
    }
  }
}
