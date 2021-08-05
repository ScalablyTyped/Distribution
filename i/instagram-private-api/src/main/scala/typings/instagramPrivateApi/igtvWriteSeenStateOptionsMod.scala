package typings.instagramPrivateApi

import org.scalablytyped.runtime.StringDictionary
import typings.instagramPrivateApi.anon.Viewprogresss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igtvWriteSeenStateOptionsMod {
  
  trait IgtvWriteSeenStateOptions extends StObject {
    
    var grid_impressions: js.UndefOr[js.Array[String]] = js.undefined
    
    var impressions: js.UndefOr[StringDictionary[Viewprogresss]] = js.undefined
  }
  object IgtvWriteSeenStateOptions {
    
    inline def apply(): IgtvWriteSeenStateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IgtvWriteSeenStateOptions]
    }
    
    extension [Self <: IgtvWriteSeenStateOptions](x: Self) {
      
      inline def setGrid_impressions(value: js.Array[String]): Self = StObject.set(x, "grid_impressions", value.asInstanceOf[js.Any])
      
      inline def setGrid_impressionsUndefined: Self = StObject.set(x, "grid_impressions", js.undefined)
      
      inline def setGrid_impressionsVarargs(value: String*): Self = StObject.set(x, "grid_impressions", js.Array(value :_*))
      
      inline def setImpressions(value: StringDictionary[Viewprogresss]): Self = StObject.set(x, "impressions", value.asInstanceOf[js.Any])
      
      inline def setImpressionsUndefined: Self = StObject.set(x, "impressions", js.undefined)
    }
  }
}
