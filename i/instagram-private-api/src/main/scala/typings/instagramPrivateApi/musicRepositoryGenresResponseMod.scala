package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicRepositoryGenresResponseMod {
  
  trait MusicRepositoryGenresResponseGenre extends StObject {
    
    var cover_artwork_uri: String
    
    var id: String
    
    var name: String
  }
  object MusicRepositoryGenresResponseGenre {
    
    @scala.inline
    def apply(cover_artwork_uri: String, id: String, name: String): MusicRepositoryGenresResponseGenre = {
      val __obj = js.Dynamic.literal(cover_artwork_uri = cover_artwork_uri.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicRepositoryGenresResponseGenre]
    }
    
    @scala.inline
    implicit class MusicRepositoryGenresResponseGenreMutableBuilder[Self <: MusicRepositoryGenresResponseGenre] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCover_artwork_uri(value: String): Self = StObject.set(x, "cover_artwork_uri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MusicRepositoryGenresResponseItemsItem extends StObject {
    
    var genre: MusicRepositoryGenresResponseGenre
  }
  object MusicRepositoryGenresResponseItemsItem {
    
    @scala.inline
    def apply(genre: MusicRepositoryGenresResponseGenre): MusicRepositoryGenresResponseItemsItem = {
      val __obj = js.Dynamic.literal(genre = genre.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicRepositoryGenresResponseItemsItem]
    }
    
    @scala.inline
    implicit class MusicRepositoryGenresResponseItemsItemMutableBuilder[Self <: MusicRepositoryGenresResponseItemsItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGenre(value: MusicRepositoryGenresResponseGenre): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    }
  }
  
  trait MusicRepositoryGenresResponseRootObject extends StObject {
    
    var items: js.Array[MusicRepositoryGenresResponseItemsItem]
    
    var status: String
  }
  object MusicRepositoryGenresResponseRootObject {
    
    @scala.inline
    def apply(items: js.Array[MusicRepositoryGenresResponseItemsItem], status: String): MusicRepositoryGenresResponseRootObject = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicRepositoryGenresResponseRootObject]
    }
    
    @scala.inline
    implicit class MusicRepositoryGenresResponseRootObjectMutableBuilder[Self <: MusicRepositoryGenresResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[MusicRepositoryGenresResponseItemsItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: MusicRepositoryGenresResponseItemsItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
