package typings.instagramPrivateApi

import org.scalablytyped.runtime.StringDictionary
import typings.instagramPrivateApi.anon.Viewprogresss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object igtvWriteSeenStateOptionsMod {
  
  @js.native
  trait IgtvWriteSeenStateOptions extends StObject {
    
    var grid_impressions: js.UndefOr[js.Array[String]] = js.native
    
    var impressions: js.UndefOr[StringDictionary[Viewprogresss]] = js.native
  }
  object IgtvWriteSeenStateOptions {
    
    @scala.inline
    def apply(): IgtvWriteSeenStateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IgtvWriteSeenStateOptions]
    }
    
    @scala.inline
    implicit class IgtvWriteSeenStateOptionsMutableBuilder[Self <: IgtvWriteSeenStateOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrid_impressions(value: js.Array[String]): Self = StObject.set(x, "grid_impressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrid_impressionsUndefined: Self = StObject.set(x, "grid_impressions", js.undefined)
      
      @scala.inline
      def setGrid_impressionsVarargs(value: String*): Self = StObject.set(x, "grid_impressions", js.Array(value :_*))
      
      @scala.inline
      def setImpressions(value: StringDictionary[Viewprogresss]): Self = StObject.set(x, "impressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImpressionsUndefined: Self = StObject.set(x, "impressions", js.undefined)
    }
  }
}
