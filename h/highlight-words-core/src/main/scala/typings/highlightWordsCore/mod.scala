package typings.highlightWordsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("highlight-words-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findAll(args: FindAllArgs): js.Array[Chunk] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAll")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[Chunk]]
  
  trait Chunk extends StObject {
    
    var end: Double
    
    var highlight: Boolean
    
    var start: Double
  }
  object Chunk {
    
    inline def apply(end: Double, highlight: Boolean, start: Double): Chunk = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chunk]
    }
    
    extension [Self <: Chunk](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait FindAllArgs
    extends StObject
       with FindChunksArgs {
    
    var findChunks: js.UndefOr[js.Function1[/* args */ FindChunksArgs, js.Array[Chunk]]] = js.undefined
  }
  object FindAllArgs {
    
    inline def apply(searchWords: js.Array[String], textToHighlight: String): FindAllArgs = {
      val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindAllArgs]
    }
    
    extension [Self <: FindAllArgs](x: Self) {
      
      inline def setFindChunks(value: /* args */ FindChunksArgs => js.Array[Chunk]): Self = StObject.set(x, "findChunks", js.Any.fromFunction1(value))
      
      inline def setFindChunksUndefined: Self = StObject.set(x, "findChunks", js.undefined)
    }
  }
  
  trait FindChunksArgs extends StObject {
    
    var autoEscape: js.UndefOr[Boolean] = js.undefined
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var sanitize: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
    
    var searchWords: js.Array[String]
    
    var textToHighlight: String
  }
  object FindChunksArgs {
    
    inline def apply(searchWords: js.Array[String], textToHighlight: String): FindChunksArgs = {
      val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindChunksArgs]
    }
    
    extension [Self <: FindChunksArgs](x: Self) {
      
      inline def setAutoEscape(value: Boolean): Self = StObject.set(x, "autoEscape", value.asInstanceOf[js.Any])
      
      inline def setAutoEscapeUndefined: Self = StObject.set(x, "autoEscape", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setSanitize(value: /* text */ String => String): Self = StObject.set(x, "sanitize", js.Any.fromFunction1(value))
      
      inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      inline def setSearchWords(value: js.Array[String]): Self = StObject.set(x, "searchWords", value.asInstanceOf[js.Any])
      
      inline def setSearchWordsVarargs(value: String*): Self = StObject.set(x, "searchWords", js.Array(value :_*))
      
      inline def setTextToHighlight(value: String): Self = StObject.set(x, "textToHighlight", value.asInstanceOf[js.Any])
    }
  }
}
