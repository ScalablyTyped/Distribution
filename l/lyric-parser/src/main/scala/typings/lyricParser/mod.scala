package typings.lyricParser

import typings.lyricParser.anon.Album
import typings.lyricParser.anon.LineNum
import typings.lyricParser.anon.Time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lyric-parser", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Lyric {
    def this(lrc: String, handler: js.Function1[/* params */ LineNum, Unit]) = this()
  }
  
  @js.native
  trait Lyric extends StObject {
    
    var curLine: Double = js.native
    
    def handler(params: LineNum): Unit = js.native
    
    var lines: js.Array[Time] = js.native
    
    var lrc: String = js.native
    
    def play(startTime: Double): Unit = js.native
    def play(startTime: Double, skipLast: Boolean): Unit = js.native
    
    def seek(offset: Double): Unit = js.native
    
    var state: Double = js.native
    
    def stop(): Unit = js.native
    
    var tags: Album = js.native
    
    def togglePlay(): Unit = js.native
  }
}
