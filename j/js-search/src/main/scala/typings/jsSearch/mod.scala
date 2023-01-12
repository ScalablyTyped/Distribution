package typings.jsSearch

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("js-search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("js-search", "AllSubstringsIndexStrategy")
  @js.native
  open class AllSubstringsIndexStrategy ()
    extends StObject
       with IIndexStrategy {
    
    /* CompleteClass */
    override def expandToken(token: String): js.Array[String] = js.native
  }
  
  @JSImport("js-search", "CaseSensitiveSanitizer")
  @js.native
  open class CaseSensitiveSanitizer ()
    extends StObject
       with ISanitizer {
    
    /* CompleteClass */
    override def sanitize(text: String): String = js.native
  }
  
  @JSImport("js-search", "ExactWordIndexStrategy")
  @js.native
  open class ExactWordIndexStrategy ()
    extends StObject
       with IIndexStrategy {
    
    /* CompleteClass */
    override def expandToken(token: String): js.Array[String] = js.native
  }
  
  @JSImport("js-search", "LowerCaseSanitizer")
  @js.native
  open class LowerCaseSanitizer ()
    extends StObject
       with ISanitizer {
    
    /* CompleteClass */
    override def sanitize(text: String): String = js.native
  }
  
  @JSImport("js-search", "PrefixIndexStrategy")
  @js.native
  open class PrefixIndexStrategy ()
    extends StObject
       with IIndexStrategy {
    
    /* CompleteClass */
    override def expandToken(token: String): js.Array[String] = js.native
  }
  
  @JSImport("js-search", "Search")
  @js.native
  open class Search protected () extends StObject {
    def this(uidFieldName: String) = this()
    def this(uidFieldName: js.Array[String]) = this()
    
    def addDocument(document: js.Object): Unit = js.native
    
    def addDocuments(documents: js.Array[js.Object]): Unit = js.native
    
    def addIndex(field: String): Unit = js.native
    def addIndex(field: js.Array[String]): Unit = js.native
    
    var indexStrategy: IIndexStrategy = js.native
    
    var sanitizer: ISanitizer = js.native
    
    def search(query: String): js.Array[js.Object] = js.native
    
    var searchIndex: ISearchIndex = js.native
    
    var tokenizer: ITokenizer = js.native
  }
  
  @JSImport("js-search", "SimpleTokenizer")
  @js.native
  open class SimpleTokenizer ()
    extends StObject
       with ITokenizer {
    
    /* CompleteClass */
    override def tokenize(text: String): js.Array[String] = js.native
  }
  
  @JSImport("js-search", "StemmingTokenizer")
  @js.native
  open class StemmingTokenizer protected ()
    extends StObject
       with ITokenizer {
    def this(stemmingFunction: StemmingFunction, decoratedTokenizer: ITokenizer) = this()
    
    /* CompleteClass */
    override def tokenize(text: String): js.Array[String] = js.native
  }
  
  @JSImport("js-search", "StopWordsMap")
  @js.native
  def StopWordsMap: Any = js.native
  inline def StopWordsMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StopWordsMap")(x.asInstanceOf[js.Any])
  
  @JSImport("js-search", "StopWordsTokenizer")
  @js.native
  open class StopWordsTokenizer protected ()
    extends StObject
       with ITokenizer {
    def this(decoratedTokenizer: ITokenizer) = this()
    
    /* CompleteClass */
    override def tokenize(text: String): js.Array[String] = js.native
  }
  
  @JSImport("js-search", "TfIdfSearchIndex")
  @js.native
  open class TfIdfSearchIndex protected ()
    extends StObject
       with ISearchIndex {
    def this(uidFieldName: String) = this()
    def this(uidFieldName: js.Array[String]) = this()
    
    /* CompleteClass */
    override def indexDocument(token: String, uid: String, document: js.Object): Unit = js.native
    
    /* CompleteClass */
    override def search(tokens: js.Array[String], corpus: js.Array[js.Object]): js.Array[js.Object] = js.native
  }
  
  @JSImport("js-search", "TokenHighlighter")
  @js.native
  open class TokenHighlighter protected () extends StObject {
    def this(opt_indexStrategy: IIndexStrategy, opt_sanitizer: ISanitizer, opt_wrapperTagName: String) = this()
    
    def highlight(text: String, tokens: js.Array[String]): String = js.native
  }
  
  @JSImport("js-search", "UnorderedSearchIndex")
  @js.native
  open class UnorderedSearchIndex ()
    extends StObject
       with ISearchIndex {
    
    /* CompleteClass */
    override def indexDocument(token: String, uid: String, document: js.Object): Unit = js.native
    
    /* CompleteClass */
    override def search(tokens: js.Array[String], corpus: js.Array[js.Object]): js.Array[js.Object] = js.native
  }
  
  trait IIndexStrategy extends StObject {
    
    def expandToken(token: String): js.Array[String]
  }
  object IIndexStrategy {
    
    inline def apply(expandToken: String => js.Array[String]): IIndexStrategy = {
      val __obj = js.Dynamic.literal(expandToken = js.Any.fromFunction1(expandToken))
      __obj.asInstanceOf[IIndexStrategy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IIndexStrategy] (val x: Self) extends AnyVal {
      
      inline def setExpandToken(value: String => js.Array[String]): Self = StObject.set(x, "expandToken", js.Any.fromFunction1(value))
    }
  }
  
  trait ISanitizer extends StObject {
    
    def sanitize(text: String): String
  }
  object ISanitizer {
    
    inline def apply(sanitize: String => String): ISanitizer = {
      val __obj = js.Dynamic.literal(sanitize = js.Any.fromFunction1(sanitize))
      __obj.asInstanceOf[ISanitizer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISanitizer] (val x: Self) extends AnyVal {
      
      inline def setSanitize(value: String => String): Self = StObject.set(x, "sanitize", js.Any.fromFunction1(value))
    }
  }
  
  trait ISearchIndex extends StObject {
    
    def indexDocument(token: String, uid: String, document: js.Object): Unit
    
    def search(tokens: js.Array[String], corpus: js.Array[js.Object]): js.Array[js.Object]
  }
  object ISearchIndex {
    
    inline def apply(
      indexDocument: (String, String, js.Object) => Unit,
      search: (js.Array[String], js.Array[js.Object]) => js.Array[js.Object]
    ): ISearchIndex = {
      val __obj = js.Dynamic.literal(indexDocument = js.Any.fromFunction3(indexDocument), search = js.Any.fromFunction2(search))
      __obj.asInstanceOf[ISearchIndex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISearchIndex] (val x: Self) extends AnyVal {
      
      inline def setIndexDocument(value: (String, String, js.Object) => Unit): Self = StObject.set(x, "indexDocument", js.Any.fromFunction3(value))
      
      inline def setSearch(value: (js.Array[String], js.Array[js.Object]) => js.Array[js.Object]): Self = StObject.set(x, "search", js.Any.fromFunction2(value))
    }
  }
  
  type ITfIdfTokenMap = StringDictionary[ITfIdfTokenMetadata]
  
  trait ITfIdfTokenMetadata extends StObject {
    
    @JSName("$numDocumentOccurrences")
    var $numDocumentOccurrences: Double
    
    @JSName("$totalNumOccurrences")
    var $totalNumOccurrences: Double
    
    @JSName("$uidMap")
    var $uidMap: ITfIdfUidMap
  }
  object ITfIdfTokenMetadata {
    
    inline def apply($numDocumentOccurrences: Double, $totalNumOccurrences: Double, $uidMap: ITfIdfUidMap): ITfIdfTokenMetadata = {
      val __obj = js.Dynamic.literal($numDocumentOccurrences = $numDocumentOccurrences.asInstanceOf[js.Any], $totalNumOccurrences = $totalNumOccurrences.asInstanceOf[js.Any], $uidMap = $uidMap.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITfIdfTokenMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITfIdfTokenMetadata] (val x: Self) extends AnyVal {
      
      inline def set$numDocumentOccurrences(value: Double): Self = StObject.set(x, "$numDocumentOccurrences", value.asInstanceOf[js.Any])
      
      inline def set$totalNumOccurrences(value: Double): Self = StObject.set(x, "$totalNumOccurrences", value.asInstanceOf[js.Any])
      
      inline def set$uidMap(value: ITfIdfUidMap): Self = StObject.set(x, "$uidMap", value.asInstanceOf[js.Any])
    }
  }
  
  type ITfIdfUidMap = StringDictionary[ITfIdfUidMetadata]
  
  trait ITfIdfUidMetadata extends StObject {
    
    @JSName("$document")
    var $document: js.Object
    
    @JSName("$numTokenOccurrences")
    var $numTokenOccurrences: Double
  }
  object ITfIdfUidMetadata {
    
    inline def apply($document: js.Object, $numTokenOccurrences: Double): ITfIdfUidMetadata = {
      val __obj = js.Dynamic.literal($document = $document.asInstanceOf[js.Any], $numTokenOccurrences = $numTokenOccurrences.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITfIdfUidMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITfIdfUidMetadata] (val x: Self) extends AnyVal {
      
      inline def set$document(value: js.Object): Self = StObject.set(x, "$document", value.asInstanceOf[js.Any])
      
      inline def set$numTokenOccurrences(value: Double): Self = StObject.set(x, "$numTokenOccurrences", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITokenizer extends StObject {
    
    def tokenize(text: String): js.Array[String]
  }
  object ITokenizer {
    
    inline def apply(tokenize: String => js.Array[String]): ITokenizer = {
      val __obj = js.Dynamic.literal(tokenize = js.Any.fromFunction1(tokenize))
      __obj.asInstanceOf[ITokenizer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITokenizer] (val x: Self) extends AnyVal {
      
      inline def setTokenize(value: String => js.Array[String]): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
    }
  }
  
  type StemmingFunction = js.Function1[/* text */ String, String]
}
