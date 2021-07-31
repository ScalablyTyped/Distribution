package typings.graphemeSplitter

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("grapheme-splitter", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with GraphemeSplitter {
    
    /** count the number of grapheme clusters in a string */
    /* CompleteClass */
    override def countGraphemes(s: String): Double = js.native
    
    /** iterate the string to an iterable iterator of grapheme clusters */
    /* CompleteClass */
    override def iterateGraphemes(s: String): IterableIterator[String] = js.native
    
    /** split the string to an array of grapheme clusters */
    /* CompleteClass */
    override def splitGraphemes(s: String): js.Array[String] = js.native
  }
  
  trait GraphemeSplitter extends StObject {
    
    /** count the number of grapheme clusters in a string */
    def countGraphemes(s: String): Double
    
    /** iterate the string to an iterable iterator of grapheme clusters */
    def iterateGraphemes(s: String): IterableIterator[String]
    
    /** split the string to an array of grapheme clusters */
    def splitGraphemes(s: String): js.Array[String]
  }
  object GraphemeSplitter {
    
    @scala.inline
    def apply(
      countGraphemes: String => Double,
      iterateGraphemes: String => IterableIterator[String],
      splitGraphemes: String => js.Array[String]
    ): GraphemeSplitter = {
      val __obj = js.Dynamic.literal(countGraphemes = js.Any.fromFunction1(countGraphemes), iterateGraphemes = js.Any.fromFunction1(iterateGraphemes), splitGraphemes = js.Any.fromFunction1(splitGraphemes))
      __obj.asInstanceOf[GraphemeSplitter]
    }
    
    @scala.inline
    implicit class GraphemeSplitterMutableBuilder[Self <: GraphemeSplitter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCountGraphemes(value: String => Double): Self = StObject.set(x, "countGraphemes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIterateGraphemes(value: String => IterableIterator[String]): Self = StObject.set(x, "iterateGraphemes", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSplitGraphemes(value: String => js.Array[String]): Self = StObject.set(x, "splitGraphemes", js.Any.fromFunction1(value))
    }
  }
}
