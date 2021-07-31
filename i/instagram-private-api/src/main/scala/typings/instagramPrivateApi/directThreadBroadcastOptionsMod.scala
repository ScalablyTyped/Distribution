package typings.instagramPrivateApi

import org.scalablytyped.runtime.StringDictionary
import typings.tsXor.xorTypeMod.XOR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directThreadBroadcastOptionsMod {
  
  trait CreateThreadOptions extends StObject {
    
    var userIds: (js.Array[String | Double]) | String | Double
  }
  object CreateThreadOptions {
    
    @scala.inline
    def apply(userIds: (js.Array[String | Double]) | String | Double): CreateThreadOptions = {
      val __obj = js.Dynamic.literal(userIds = userIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateThreadOptions]
    }
    
    @scala.inline
    implicit class CreateThreadOptionsMutableBuilder[Self <: CreateThreadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserIds(value: (js.Array[String | Double]) | String | Double): Self = StObject.set(x, "userIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdsVarargs(value: (String | Double)*): Self = StObject.set(x, "userIds", js.Array(value :_*))
    }
  }
  
  type DirectThreadBroadcastOptions = DirectTreadBroadcastBaseOptions & (XOR[ExistingThreadOptions, CreateThreadOptions])
  
  trait DirectTreadBroadcastBaseOptions extends StObject {
    
    var form: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var item: String
    
    var qs: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var signed: js.UndefOr[Boolean] = js.undefined
  }
  object DirectTreadBroadcastBaseOptions {
    
    @scala.inline
    def apply(item: String): DirectTreadBroadcastBaseOptions = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectTreadBroadcastBaseOptions]
    }
    
    @scala.inline
    implicit class DirectTreadBroadcastBaseOptionsMutableBuilder[Self <: DirectTreadBroadcastBaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForm(value: StringDictionary[js.Any]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQs(value: StringDictionary[js.Any]): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
      
      @scala.inline
      def setSigned(value: Boolean): Self = StObject.set(x, "signed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedUndefined: Self = StObject.set(x, "signed", js.undefined)
    }
  }
  
  trait ExistingThreadOptions extends StObject {
    
    var threadIds: (js.Array[String | Double]) | String | Double
  }
  object ExistingThreadOptions {
    
    @scala.inline
    def apply(threadIds: (js.Array[String | Double]) | String | Double): ExistingThreadOptions = {
      val __obj = js.Dynamic.literal(threadIds = threadIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExistingThreadOptions]
    }
    
    @scala.inline
    implicit class ExistingThreadOptionsMutableBuilder[Self <: ExistingThreadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setThreadIds(value: (js.Array[String | Double]) | String | Double): Self = StObject.set(x, "threadIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreadIdsVarargs(value: (String | Double)*): Self = StObject.set(x, "threadIds", js.Array(value :_*))
    }
  }
}
