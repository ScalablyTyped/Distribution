package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.PkNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storiesTypesMod {
  
  type StoryServiceInput = js.Array[StoryServiceSeenInputItems] | StoryServiceSeenInputReels
  
  trait StoryServiceSeenInputItems extends StObject {
    
    var id: String
    
    var taken_at: Double
    
    var user: PkNumber
  }
  object StoryServiceSeenInputItems {
    
    inline def apply(id: String, taken_at: Double, user: PkNumber): StoryServiceSeenInputItems = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], taken_at = taken_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryServiceSeenInputItems]
    }
    
    extension [Self <: StoryServiceSeenInputItems](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTaken_at(value: Double): Self = StObject.set(x, "taken_at", value.asInstanceOf[js.Any])
      
      inline def setUser(value: PkNumber): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryServiceSeenInputReels extends StObject {
    
    var items: js.Array[StoryServiceSeenInputItems]
  }
  object StoryServiceSeenInputReels {
    
    inline def apply(items: js.Array[StoryServiceSeenInputItems]): StoryServiceSeenInputReels = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoryServiceSeenInputReels]
    }
    
    extension [Self <: StoryServiceSeenInputReels](x: Self) {
      
      inline def setItems(value: js.Array[StoryServiceSeenInputItems]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: StoryServiceSeenInputItems*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
}
