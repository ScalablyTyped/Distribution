package typings.humanDate

import typings.humanDate.humanDateBooleans.`false`
import typings.humanDate.humanDateBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined human-date.human-date.RelativeTimeOptions & {  returnObject :false | undefined} */
  @js.native
  trait RelativeTimeOptionsreturn extends StObject {
    
    var allUnits: js.UndefOr[Boolean] = js.native
    
    var futureSuffix: js.UndefOr[String] = js.native
    
    var pastSuffix: js.UndefOr[String] = js.native
    
    var presentText: js.UndefOr[String] = js.native
    
    var returnObject: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
  }
  object RelativeTimeOptionsreturn {
    
    @scala.inline
    def apply(returnObject: js.UndefOr[Boolean] with js.UndefOr[`false`]): RelativeTimeOptionsreturn = {
      val __obj = js.Dynamic.literal(returnObject = returnObject.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelativeTimeOptionsreturn]
    }
    
    @scala.inline
    implicit class RelativeTimeOptionsreturnMutableBuilder[Self <: RelativeTimeOptionsreturn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllUnits(value: Boolean): Self = StObject.set(x, "allUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUnitsUndefined: Self = StObject.set(x, "allUnits", js.undefined)
      
      @scala.inline
      def setFutureSuffix(value: String): Self = StObject.set(x, "futureSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFutureSuffixUndefined: Self = StObject.set(x, "futureSuffix", js.undefined)
      
      @scala.inline
      def setPastSuffix(value: String): Self = StObject.set(x, "pastSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPastSuffixUndefined: Self = StObject.set(x, "pastSuffix", js.undefined)
      
      @scala.inline
      def setPresentText(value: String): Self = StObject.set(x, "presentText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresentTextUndefined: Self = StObject.set(x, "presentText", js.undefined)
      
      @scala.inline
      def setReturnObject(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "returnObject", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined human-date.human-date.RelativeTimeOptions & {  returnObject :true} */
  @js.native
  trait RelativeTimeOptionsreturnAllUnits extends StObject {
    
    var allUnits: js.UndefOr[Boolean] = js.native
    
    var futureSuffix: js.UndefOr[String] = js.native
    
    var pastSuffix: js.UndefOr[String] = js.native
    
    var presentText: js.UndefOr[String] = js.native
    
    var returnObject: js.UndefOr[Boolean] with `true` = js.native
  }
  object RelativeTimeOptionsreturnAllUnits {
    
    @scala.inline
    def apply(returnObject: js.UndefOr[Boolean] with `true`): RelativeTimeOptionsreturnAllUnits = {
      val __obj = js.Dynamic.literal(returnObject = returnObject.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelativeTimeOptionsreturnAllUnits]
    }
    
    @scala.inline
    implicit class RelativeTimeOptionsreturnAllUnitsMutableBuilder[Self <: RelativeTimeOptionsreturnAllUnits] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllUnits(value: Boolean): Self = StObject.set(x, "allUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUnitsUndefined: Self = StObject.set(x, "allUnits", js.undefined)
      
      @scala.inline
      def setFutureSuffix(value: String): Self = StObject.set(x, "futureSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFutureSuffixUndefined: Self = StObject.set(x, "futureSuffix", js.undefined)
      
      @scala.inline
      def setPastSuffix(value: String): Self = StObject.set(x, "pastSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPastSuffixUndefined: Self = StObject.set(x, "pastSuffix", js.undefined)
      
      @scala.inline
      def setPresentText(value: String): Self = StObject.set(x, "presentText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresentTextUndefined: Self = StObject.set(x, "presentText", js.undefined)
      
      @scala.inline
      def setReturnObject(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "returnObject", value.asInstanceOf[js.Any])
    }
  }
}
