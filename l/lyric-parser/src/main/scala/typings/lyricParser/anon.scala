package typings.lyricParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Album extends StObject {
    
    var album: String
    
    var artist: String
    
    var by: String
    
    var offset: String
    
    var title: String
  }
  object Album {
    
    @scala.inline
    def apply(album: String, artist: String, by: String, offset: String, title: String): Album = {
      val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artist = artist.asInstanceOf[js.Any], by = by.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Album]
    }
    
    @scala.inline
    implicit class AlbumMutableBuilder[Self <: Album] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlbum(value: String): Self = StObject.set(x, "album", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtist(value: String): Self = StObject.set(x, "artist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBy(value: String): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait LineNum extends StObject {
    
    var lineNum: Double
    
    var txt: String
  }
  object LineNum {
    
    @scala.inline
    def apply(lineNum: Double, txt: String): LineNum = {
      val __obj = js.Dynamic.literal(lineNum = lineNum.asInstanceOf[js.Any], txt = txt.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineNum]
    }
    
    @scala.inline
    implicit class LineNumMutableBuilder[Self <: LineNum] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineNum(value: Double): Self = StObject.set(x, "lineNum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxt(value: String): Self = StObject.set(x, "txt", value.asInstanceOf[js.Any])
    }
  }
  
  trait Time extends StObject {
    
    var time: Double
    
    var txt: String
  }
  object Time {
    
    @scala.inline
    def apply(time: Double, txt: String): Time = {
      val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any], txt = txt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Time]
    }
    
    @scala.inline
    implicit class TimeMutableBuilder[Self <: Time] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTxt(value: String): Self = StObject.set(x, "txt", value.asInstanceOf[js.Any])
    }
  }
}
