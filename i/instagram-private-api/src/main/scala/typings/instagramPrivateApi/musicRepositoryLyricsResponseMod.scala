package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicRepositoryLyricsResponseMod {
  
  @js.native
  trait MusicRepositoryLyricsResponseLyrics extends StObject {
    
    var phrases: js.Array[MusicRepositoryLyricsResponsePhrasesItem] = js.native
  }
  object MusicRepositoryLyricsResponseLyrics {
    
    @scala.inline
    def apply(phrases: js.Array[MusicRepositoryLyricsResponsePhrasesItem]): MusicRepositoryLyricsResponseLyrics = {
      val __obj = js.Dynamic.literal(phrases = phrases.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicRepositoryLyricsResponseLyrics]
    }
    
    @scala.inline
    implicit class MusicRepositoryLyricsResponseLyricsMutableBuilder[Self <: MusicRepositoryLyricsResponseLyrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPhrases(value: js.Array[MusicRepositoryLyricsResponsePhrasesItem]): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhrasesVarargs(value: MusicRepositoryLyricsResponsePhrasesItem*): Self = StObject.set(x, "phrases", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MusicRepositoryLyricsResponsePhrasesItem extends StObject {
    
    var phrase: String = js.native
    
    var start_time_in_ms: Double = js.native
  }
  object MusicRepositoryLyricsResponsePhrasesItem {
    
    @scala.inline
    def apply(phrase: String, start_time_in_ms: Double): MusicRepositoryLyricsResponsePhrasesItem = {
      val __obj = js.Dynamic.literal(phrase = phrase.asInstanceOf[js.Any], start_time_in_ms = start_time_in_ms.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicRepositoryLyricsResponsePhrasesItem]
    }
    
    @scala.inline
    implicit class MusicRepositoryLyricsResponsePhrasesItemMutableBuilder[Self <: MusicRepositoryLyricsResponsePhrasesItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPhrase(value: String): Self = StObject.set(x, "phrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_time_in_ms(value: Double): Self = StObject.set(x, "start_time_in_ms", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MusicRepositoryLyricsResponseRootObject extends StObject {
    
    var lyrics: MusicRepositoryLyricsResponseLyrics = js.native
    
    var status: String = js.native
  }
  object MusicRepositoryLyricsResponseRootObject {
    
    @scala.inline
    def apply(lyrics: MusicRepositoryLyricsResponseLyrics, status: String): MusicRepositoryLyricsResponseRootObject = {
      val __obj = js.Dynamic.literal(lyrics = lyrics.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicRepositoryLyricsResponseRootObject]
    }
    
    @scala.inline
    implicit class MusicRepositoryLyricsResponseRootObjectMutableBuilder[Self <: MusicRepositoryLyricsResponseRootObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLyrics(value: MusicRepositoryLyricsResponseLyrics): Self = StObject.set(x, "lyrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
