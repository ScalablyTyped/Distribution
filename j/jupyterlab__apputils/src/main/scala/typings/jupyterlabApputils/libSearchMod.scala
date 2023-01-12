package typings.jupyterlabApputils

import typings.jupyterlabApputils.anon.PartialIScore
import typings.jupyterlabApputils.libVdomMod.ReactWidget
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSearchMod {
  
  @JSImport("@jupyterlab/apputils/lib/search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FilenameSearcher(props: IFilterBoxProps): ReactWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("FilenameSearcher")(props.asInstanceOf[js.Any]).asInstanceOf[ReactWidget]
  
  inline def FilterBox(props: IFilterBoxProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilterBox")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def fuzzySearch(source: String, query: String): IScore | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fuzzySearch")(source.asInstanceOf[js.Any], query.asInstanceOf[js.Any])).asInstanceOf[IScore | Null]
  
  inline def updateFilterFunction(value: String, useFuzzyFilter: Boolean): js.Function1[/* item */ String, PartialIScore | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateFilterFunction")(value.asInstanceOf[js.Any], useFuzzyFilter.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* item */ String, PartialIScore | Null]]
  inline def updateFilterFunction(value: String, useFuzzyFilter: Boolean, caseSensitive: Boolean): js.Function1[/* item */ String, PartialIScore | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("updateFilterFunction")(value.asInstanceOf[js.Any], useFuzzyFilter.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* item */ String, PartialIScore | Null]]
  
  @js.native
  trait IFilterBoxProps extends StObject {
    
    /**
      * Whether to use case-sensitive search
      */
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether to force a refresh.
      */
    var forceRefresh: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional initial search value.
      */
    var initialQuery: js.UndefOr[String] = js.native
    
    /**
      * Optional placeholder for the search box.
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * A function to callback when filter is updated.
      */
    def updateFilter(filterFn: js.Function1[/* item */ String, Boolean | PartialIScore | Null]): Unit = js.native
    def updateFilter(filterFn: js.Function1[/* item */ String, Boolean | PartialIScore | Null], query: String): Unit = js.native
    
    /**
      * Whether to use the fuzzy filter.
      */
    var useFuzzyFilter: Boolean = js.native
  }
  
  trait IScore extends StObject {
    
    /**
      * The indices of the text matches.
      */
    var indices: js.Array[Double] | Null
    
    /**
      * The numerical score for the text match.
      */
    var score: Double
  }
  object IScore {
    
    inline def apply(score: Double): IScore = {
      val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], indices = null)
      __obj.asInstanceOf[IScore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IScore] (val x: Self) extends AnyVal {
      
      inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
      
      inline def setIndicesNull: Self = StObject.set(x, "indices", null)
      
      inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
      
      inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
}
