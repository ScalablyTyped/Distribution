package typings.highlightWordsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("highlight-words-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def findAll(args: FindAllArgs): js.Array[Chunk] = ^.asInstanceOf[js.Dynamic].applyDynamic("findAll")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[Chunk]]
  
  trait Chunk extends StObject {
    
    var end: Double
    
    var highlight: Boolean
    
    var start: Double
  }
  object Chunk {
    
    @scala.inline
    def apply(end: Double, highlight: Boolean, start: Double): Chunk = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], highlight = highlight.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chunk]
    }
    
    @scala.inline
    implicit class ChunkMutableBuilder[Self <: Chunk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait FindAllArgs
    extends StObject
       with FindChunksArgs {
    
    var findChunks: js.UndefOr[js.Function1[/* args */ FindChunksArgs, js.Array[Chunk]]] = js.undefined
  }
  object FindAllArgs {
    
    @scala.inline
    def apply(searchWords: js.Array[String], textToHighlight: String): FindAllArgs = {
      val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindAllArgs]
    }
    
    @scala.inline
    implicit class FindAllArgsMutableBuilder[Self <: FindAllArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFindChunks(value: /* args */ FindChunksArgs => js.Array[Chunk]): Self = StObject.set(x, "findChunks", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFindChunksUndefined: Self = StObject.set(x, "findChunks", js.undefined)
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
    
    @scala.inline
    def apply(searchWords: js.Array[String], textToHighlight: String): FindChunksArgs = {
      val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindChunksArgs]
    }
    
    @scala.inline
    implicit class FindChunksArgsMutableBuilder[Self <: FindChunksArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoEscape(value: Boolean): Self = StObject.set(x, "autoEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoEscapeUndefined: Self = StObject.set(x, "autoEscape", js.undefined)
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setSanitize(value: /* text */ String => String): Self = StObject.set(x, "sanitize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      @scala.inline
      def setSearchWords(value: js.Array[String]): Self = StObject.set(x, "searchWords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchWordsVarargs(value: String*): Self = StObject.set(x, "searchWords", js.Array(value :_*))
      
      @scala.inline
      def setTextToHighlight(value: String): Self = StObject.set(x, "textToHighlight", value.asInstanceOf[js.Any])
    }
  }
}
