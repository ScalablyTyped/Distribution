package typings.jsWorkerSearch

import typings.jsWorkerSearch.anon.CaseSensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-worker-search", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with SearchApi {
    def this(someParam: CaseSensitive) = this()
    
    /* CompleteClass */
    override def indexDocument(uid: String, text: String): Unit = js.native
    
    /* CompleteClass */
    override def search(query: String): js.Promise[js.Array[String]] = js.native
    
    /* CompleteClass */
    override def terminate(): Unit = js.native
  }
  
  @js.native
  sealed trait INDEX_MODES extends StObject
  @JSImport("js-worker-search", "INDEX_MODES")
  @js.native
  object INDEX_MODES extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[INDEX_MODES & String] = js.native
    
    @js.native
    sealed trait ALL_SUBSTRINGS
      extends StObject
         with INDEX_MODES
    /* "ALL_SUBSTRINGS" */ val ALL_SUBSTRINGS: typings.jsWorkerSearch.mod.INDEX_MODES.ALL_SUBSTRINGS & String = js.native
    
    @js.native
    sealed trait EXACT_WORDS
      extends StObject
         with INDEX_MODES
    /* "EXACT_WORDS" */ val EXACT_WORDS: typings.jsWorkerSearch.mod.INDEX_MODES.EXACT_WORDS & String = js.native
    
    @js.native
    sealed trait PREFIXES
      extends StObject
         with INDEX_MODES
    /* "PREFIXES" */ val PREFIXES: typings.jsWorkerSearch.mod.INDEX_MODES.PREFIXES & String = js.native
  }
  
  trait SearchApi extends StObject {
    
    def indexDocument(uid: String, text: String): Unit
    
    def search(query: String): js.Promise[js.Array[String]]
    
    def terminate(): Unit
  }
  object SearchApi {
    
    inline def apply(
      indexDocument: (String, String) => Unit,
      search: String => js.Promise[js.Array[String]],
      terminate: () => Unit
    ): SearchApi = {
      val __obj = js.Dynamic.literal(indexDocument = js.Any.fromFunction2(indexDocument), search = js.Any.fromFunction1(search), terminate = js.Any.fromFunction0(terminate))
      __obj.asInstanceOf[SearchApi]
    }
    
    extension [Self <: SearchApi](x: Self) {
      
      inline def setIndexDocument(value: (String, String) => Unit): Self = StObject.set(x, "indexDocument", js.Any.fromFunction2(value))
      
      inline def setSearch(value: String => js.Promise[js.Array[String]]): Self = StObject.set(x, "search", js.Any.fromFunction1(value))
      
      inline def setTerminate(value: () => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
    }
  }
}
