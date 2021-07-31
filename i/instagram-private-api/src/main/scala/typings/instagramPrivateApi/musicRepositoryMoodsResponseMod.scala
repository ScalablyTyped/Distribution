package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicRepositoryMoodsResponseMod {
  
  trait MusicRepositoryMoodsResponseItemsItem extends StObject {
    
    var mood: MusicRepositoryMoodsResponseMood
  }
  object MusicRepositoryMoodsResponseItemsItem {
    
    @scala.inline
    def apply(mood: MusicRepositoryMoodsResponseMood): MusicRepositoryMoodsResponseItemsItem = {
      val __obj = js.Dynamic.literal(mood = mood.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicRepositoryMoodsResponseItemsItem]
    }
    
    @scala.inline
    implicit class MusicRepositoryMoodsResponseItemsItemMutableBuilder[Self <: MusicRepositoryMoodsResponseItemsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMood(value: MusicRepositoryMoodsResponseMood): Self = StObject.set(x, "mood", value.asInstanceOf[js.Any])
    }
  }
  
  trait MusicRepositoryMoodsResponseMood extends StObject {
    
    var cover_artwork_uri: String
    
    var id: String
    
    var name: String
  }
  object MusicRepositoryMoodsResponseMood {
    
    @scala.inline
    def apply(cover_artwork_uri: String, id: String, name: String): MusicRepositoryMoodsResponseMood = {
      val __obj = js.Dynamic.literal(cover_artwork_uri = cover_artwork_uri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicRepositoryMoodsResponseMood]
    }
    
    @scala.inline
    implicit class MusicRepositoryMoodsResponseMoodMutableBuilder[Self <: MusicRepositoryMoodsResponseMood] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCover_artwork_uri(value: String): Self = StObject.set(x, "cover_artwork_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MusicRepositoryMoodsResponseRootObject extends StObject {
    
    var items: js.Array[MusicRepositoryMoodsResponseItemsItem]
    
    var status: String
  }
  object MusicRepositoryMoodsResponseRootObject {
    
    @scala.inline
    def apply(items: js.Array[MusicRepositoryMoodsResponseItemsItem], status: String): MusicRepositoryMoodsResponseRootObject = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicRepositoryMoodsResponseRootObject]
    }
    
    @scala.inline
    implicit class MusicRepositoryMoodsResponseRootObjectMutableBuilder[Self <: MusicRepositoryMoodsResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[MusicRepositoryMoodsResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: MusicRepositoryMoodsResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
