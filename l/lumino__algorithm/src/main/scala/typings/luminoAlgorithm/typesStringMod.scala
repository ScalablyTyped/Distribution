package typings.luminoAlgorithm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStringMod {
  
  object StringExt {
    
    @JSImport("@lumino/algorithm/types/string", "StringExt")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A 3-way string comparison function.
      *
      * @param a - The first string of interest.
      *
      * @param b - The second string of interest.
      *
      * @returns `-1` if `a < b`, else `1` if `a > b`, else `0`.
      */
    inline def cmp(a: String, b: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cmp")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Find the indices of characters in a source text.
      *
      * @param source - The source text which should be searched.
      *
      * @param query - The characters to locate in the source text.
      *
      * @param start - The index to start the search.
      *
      * @returns The matched indices, or `null` if there is no match.
      *
      * #### Complexity
      * Linear on `sourceText`.
      *
      * #### Notes
      * In order for there to be a match, all of the characters in `query`
      * **must** appear in `source` in the order given by `query`.
      *
      * Characters are matched using strict `===` equality.
      */
    inline def findIndices(source: String, query: String): js.Array[Double] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndices")(source.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double] | Null]
    inline def findIndices(source: String, query: String, start: Double): js.Array[Double] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findIndices")(source.asInstanceOf[js.Any], query.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double] | Null]
    
    /**
      * Highlight the matched characters of a source text.
      *
      * @param source - The text which should be highlighted.
      *
      * @param indices - The indices of the matched characters. They must
      *   appear in increasing order and must be in bounds of the source.
      *
      * @param fn - The function to apply to the matched chunks.
      *
      * @returns An array of unmatched and highlighted chunks.
      */
    inline def highlight[T](source: String, indices: js.Array[Double], fn: js.Function1[/* chunk */ String, T]): js.Array[String | T] = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(source.asInstanceOf[js.Any], indices.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | T]]
    
    /**
      * A string matcher which uses a sum-of-deltas algorithm.
      *
      * @param source - The source text which should be searched.
      *
      * @param query - The characters to locate in the source text.
      *
      * @param start - The index to start the search.
      *
      * @returns The match result, or `null` if there is no match.
      *   A lower `score` represents a stronger match.
      *
      * #### Complexity
      * Linear on `sourceText`.
      *
      * #### Notes
      * This scoring algorithm uses a sum-of-deltas approach to determine
      * the score. In order for there to be a match, all of the characters
      * in `query` **must** appear in `source` in order. The delta between
      * the indices are summed to create the score. This means that groups
      * of matched characters are preferred, while fragmented matches are
      * penalized.
      */
    inline def matchSumOfDeltas(source: String, query: String): IMatchResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSumOfDeltas")(source.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[IMatchResult | Null]
    inline def matchSumOfDeltas(source: String, query: String, start: Double): IMatchResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSumOfDeltas")(source.asInstanceOf[js.Any], query.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[IMatchResult | Null]
    
    /**
      * A string matcher which uses a sum-of-squares algorithm.
      *
      * @param source - The source text which should be searched.
      *
      * @param query - The characters to locate in the source text.
      *
      * @param start - The index to start the search.
      *
      * @returns The match result, or `null` if there is no match.
      *   A lower `score` represents a stronger match.
      *
      * #### Complexity
      * Linear on `sourceText`.
      *
      * #### Notes
      * This scoring algorithm uses a sum-of-squares approach to determine
      * the score. In order for there to be a match, all of the characters
      * in `query` **must** appear in `source` in order. The index of each
      * matching character is squared and added to the score. This means
      * that early and consecutive character matches are preferred, while
      * late matches are heavily penalized.
      */
    inline def matchSumOfSquares(source: String, query: String): IMatchResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSumOfSquares")(source.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[IMatchResult | Null]
    inline def matchSumOfSquares(source: String, query: String, start: Double): IMatchResult | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("matchSumOfSquares")(source.asInstanceOf[js.Any], query.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[IMatchResult | Null]
    
    /**
      * The result of a string match function.
      */
    trait IMatchResult extends StObject {
      
      /**
        * The indices of the matched characters in the source text.
        *
        * The indices will appear in increasing order.
        */
      var indices: js.Array[Double]
      
      /**
        * A score which indicates the strength of the match.
        *
        * The documentation of a given match function should specify
        * whether a lower or higher score is a stronger match.
        */
      var score: Double
    }
    object IMatchResult {
      
      inline def apply(indices: js.Array[Double], score: Double): IMatchResult = {
        val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
        __obj.asInstanceOf[IMatchResult]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IMatchResult] (val x: Self) extends AnyVal {
        
        inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
        
        inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
        
        inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      }
    }
  }
}
