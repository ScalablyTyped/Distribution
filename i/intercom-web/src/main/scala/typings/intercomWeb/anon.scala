package typings.intercomWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Createdat extends StObject {
    
    var created_at: js.UndefOr[Double] = js.native
    
    var id: String | Double = js.native
    
    var industry: js.UndefOr[String] = js.native
    
    var monthly_spend: js.UndefOr[Double] = js.native
    
    var name: String = js.native
    
    var plan: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var user_count: js.UndefOr[Double] = js.native
    
    var website: js.UndefOr[String] = js.native
  }
  object Createdat {
    
    @scala.inline
    def apply(id: String | Double, name: String): Createdat = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Createdat]
    }
    
    @scala.inline
    implicit class CreatedatMutableBuilder[Self <: Createdat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndustry(value: String): Self = StObject.set(x, "industry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndustryUndefined: Self = StObject.set(x, "industry", js.undefined)
      
      @scala.inline
      def setMonthly_spend(value: Double): Self = StObject.set(x, "monthly_spend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthly_spendUndefined: Self = StObject.set(x, "monthly_spend", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setUser_count(value: Double): Self = StObject.set(x, "user_count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_countUndefined: Self = StObject.set(x, "user_count", js.undefined)
      
      @scala.inline
      def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    }
  }
}
