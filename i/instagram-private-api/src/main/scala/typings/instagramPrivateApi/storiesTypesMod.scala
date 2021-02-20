package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.PkNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storiesTypesMod {
  
  type StoryServiceInput = js.Array[StoryServiceSeenInputItems] | StoryServiceSeenInputReels
  
  @js.native
  trait StoryServiceSeenInputItems extends StObject {
    
    var id: String = js.native
    
    var taken_at: Double = js.native
    
    var user: PkNumber = js.native
  }
  object StoryServiceSeenInputItems {
    
    @scala.inline
    def apply(id: String, taken_at: Double, user: PkNumber): StoryServiceSeenInputItems = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryServiceSeenInputItems]
    }
    
    @scala.inline
    implicit class StoryServiceSeenInputItemsMutableBuilder[Self <: StoryServiceSeenInputItems] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: PkNumber): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StoryServiceSeenInputReels extends StObject {
    
    var items: js.Array[StoryServiceSeenInputItems] = js.native
  }
  object StoryServiceSeenInputReels {
    
    @scala.inline
    def apply(items: js.Array[StoryServiceSeenInputItems]): StoryServiceSeenInputReels = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryServiceSeenInputReels]
    }
    
    @scala.inline
    implicit class StoryServiceSeenInputReelsMutableBuilder[Self <: StoryServiceSeenInputReels] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[StoryServiceSeenInputItems]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: StoryServiceSeenInputItems*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
}
