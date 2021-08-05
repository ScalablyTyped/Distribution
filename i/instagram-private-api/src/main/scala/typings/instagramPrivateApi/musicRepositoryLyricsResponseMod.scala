package typings.instagramPrivateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object musicRepositoryLyricsResponseMod {
  
  trait MusicRepositoryLyricsResponseLyrics extends StObject {
    
    var phrases: js.Array[MusicRepositoryLyricsResponsePhrasesItem]
  }
  object MusicRepositoryLyricsResponseLyrics {
    
    inline def apply(phrases: js.Array[MusicRepositoryLyricsResponsePhrasesItem]): MusicRepositoryLyricsResponseLyrics = {
      val __obj = js.Dynamic.literal(phrases = phrases.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicRepositoryLyricsResponseLyrics]
    }
    
    extension [Self <: MusicRepositoryLyricsResponseLyrics](x: Self) {
      
      inline def setPhrases(value: js.Array[MusicRepositoryLyricsResponsePhrasesItem]): Self = StObject.set(x, "phrases", value.asInstanceOf[js.Any])
      
      inline def setPhrasesVarargs(value: MusicRepositoryLyricsResponsePhrasesItem*): Self = StObject.set(x, "phrases", js.Array(value :_*))
    }
  }
  
  trait MusicRepositoryLyricsResponsePhrasesItem extends StObject {
    
    var phrase: String
    
    var start_time_in_ms: Double
  }
  object MusicRepositoryLyricsResponsePhrasesItem {
    
    inline def apply(phrase: String, start_time_in_ms: Double): MusicRepositoryLyricsResponsePhrasesItem = {
      val __obj = js.Dynamic.literal(phrase = phrase.asInstanceOf[js.Any], start_time_in_ms = start_time_in_ms.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicRepositoryLyricsResponsePhrasesItem]
    }
    
    extension [Self <: MusicRepositoryLyricsResponsePhrasesItem](x: Self) {
      
      inline def setPhrase(value: String): Self = StObject.set(x, "phrase", value.asInstanceOf[js.Any])
      
      inline def setStart_time_in_ms(value: Double): Self = StObject.set(x, "start_time_in_ms", value.asInstanceOf[js.Any])
    }
  }
  
  trait MusicRepositoryLyricsResponseRootObject extends StObject {
    
    var lyrics: MusicRepositoryLyricsResponseLyrics
    
    var status: String
  }
  object MusicRepositoryLyricsResponseRootObject {
    
    inline def apply(lyrics: MusicRepositoryLyricsResponseLyrics, status: String): MusicRepositoryLyricsResponseRootObject = {
      val __obj = js.Dynamic.literal(lyrics = lyrics.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[MusicRepositoryLyricsResponseRootObject]
    }
    
    extension [Self <: MusicRepositoryLyricsResponseRootObject](x: Self) {
      
      inline def setLyrics(value: MusicRepositoryLyricsResponseLyrics): Self = StObject.set(x, "lyrics", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
