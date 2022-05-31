package typings.lunr

import typings.lunr.mod.ConfigFunction
import typings.lunr.mod.Index.Attributes
import typings.lunr.mod.PipelineFunction
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object lunr {
    
    /**
      * Convenience function for instantiating a new lunr index and configuring it with the default
      * pipeline functions and the passed config function.
      *
      * When using this convenience function a new index will be created with the following functions
      * already in the pipeline:
      *
      *  * lunr.StopWordFilter - filters out any stop words before they enter the index
      *
      *  * lunr.stemmer - stems the tokens before entering the index.
      *
      * Example:
      *
      * ```javascript
      *   var idx = lunr(function () {
      *     this.field('title', 10);
      *     this.field('tags', 100);
      *     this.field('body');
      *
      *     this.ref('cid');
      *
      *     this.pipeline.add(function () {
      *         // some custom pipeline function
      *     });
      *   });
      * ```
      */
    inline def apply(config: ConfigFunction): typings.lunr.mod.Index = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[typings.lunr.mod.Index]
    
    @JSGlobal("lunr")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * lunr.Builder performs indexing on a set of documents and
      * returns instances of lunr.Index ready for querying.
      *
      * All configuration of the index is done via the builder, the
      * fields to index, the document reference, the text processing
      * pipeline and document scoring parameters are all set on the
      * builder before indexing.
      */
    @JSGlobal("lunr.Builder")
    @js.native
    class Builder ()
      extends typings.lunr.mod.Builder
    
    /**
      * An index contains the built index of all documents and provides a query interface
      * to the index.
      *
      * Usually instances of lunr.Index will not be created using this constructor, instead
      * lunr.Builder should be used to construct new indexes, or lunr.Index.load should be
      * used to load previously built and serialized indexes.
      */
    @JSGlobal("lunr.Index")
    @js.native
    class Index protected ()
      extends typings.lunr.mod.Index {
      /**
        * @param attrs The attributes of the built search index.
        */
      def this(attrs: Attributes) = this()
    }
    object Index {
      
      @JSGlobal("lunr.Index")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Loads a previously serialized lunr.Index
        *
        * @param serializedIndex - A previously serialized lunr.Index
        */
      /* static member */
      inline def load(serializedIndex: js.Object): typings.lunr.mod.Index = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serializedIndex.asInstanceOf[js.Any]).asInstanceOf[typings.lunr.mod.Index]
    }
    
    /**
      * Contains and collects metadata about a matching document.
      * A single instance of lunr.MatchData is returned as part of every
      * lunr.IndexResult.
      */
    @JSGlobal("lunr.MatchData")
    @js.native
    class MatchData protected ()
      extends typings.lunr.mod.MatchData {
      /**
        * @param term - The term this match data is associated with
        * @param field - The field in which the term was found
        * @param metadata - The metadata recorded about this term in this field
        */
      def this(term: String, field: String, metadata: js.Object) = this()
    }
    
    /**
      * lunr.Pipelines maintain an ordered list of functions to be applied to all
      * tokens in documents entering the search index and queries being ran against
      * the index.
      *
      * An instance of lunr.Index created with the lunr shortcut will contain a
      * pipeline with a stop word filter and an English language stemmer. Extra
      * functions can be added before or after either of these functions or these
      * default functions can be removed.
      *
      * When run the pipeline will call each function in turn, passing a token, the
      * index of that token in the original list of all tokens and finally a list of
      * all the original tokens.
      *
      * The output of functions in the pipeline will be passed to the next function
      * in the pipeline. To exclude a token from entering the index the function
      * should return undefined, the rest of the pipeline will not be called with
      * this token.
      *
      * For serialisation of pipelines to work, all functions used in an instance of
      * a pipeline should be registered with lunr.Pipeline. Registered functions can
      * then be loaded. If trying to load a serialised pipeline that uses functions
      * that are not registered an error will be thrown.
      *
      * If not planning on serialising the pipeline then registering pipeline functions
      * is not necessary.
      */
    @JSGlobal("lunr.Pipeline")
    @js.native
    class Pipeline ()
      extends typings.lunr.mod.Pipeline
    object Pipeline {
      
      @JSGlobal("lunr.Pipeline")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Loads a previously serialised pipeline.
        *
        * All functions to be loaded must already be registered with lunr.Pipeline.
        * If any function from the serialised data has not been registered then an
        * error will be thrown.
        *
        * @param serialised - The serialised pipeline to load.
        */
      /* static member */
      inline def load(serialised: js.Object): typings.lunr.mod.Pipeline = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serialised.asInstanceOf[js.Any]).asInstanceOf[typings.lunr.mod.Pipeline]
      
      /**
        * Register a function with the pipeline.
        *
        * Functions that are used in the pipeline should be registered if the pipeline
        * needs to be serialised, or a serialised pipeline needs to be loaded.
        *
        * Registering a function does not add it to a pipeline, functions must still be
        * added to instances of the pipeline for them to be used when running a pipeline.
        *
        * @param fn - The function to check for.
        * @param label - The label to register this function with
        */
      /* static member */
      inline def registerFunction(fn: PipelineFunction, label: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunction")(fn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /**
      * A lunr.Query provides a programmatic way of defining queries to be performed
      * against a {@link lunr.Index}.
      *
      * Prefer constructing a lunr.Query using the {@link lunr.Index#query} method
      * so the query object is pre-initialized with the right index fields.
      */
    @JSGlobal("lunr.Query")
    @js.native
    class Query protected ()
      extends typings.lunr.mod.Query {
      /**
        * @param allFields An array of all available fields in a lunr.Index.
        */
      def this(allFields: js.Array[String]) = this()
    }
    object Query {
      
      /**
        * Constants for indicating what kind of presence a term must have in matching documents.
        */
      @JSGlobal("lunr.Query.presence")
      @js.native
      object presence extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.lunr.mod.Query.presence & Double] = js.native
        
        /* 1 */ val OPTIONAL: typings.lunr.mod.Query.presence.OPTIONAL & Double = js.native
        
        /* 3 */ val PROHIBITED: typings.lunr.mod.Query.presence.PROHIBITED & Double = js.native
        
        /* 2 */ val REQUIRED: typings.lunr.mod.Query.presence.REQUIRED & Double = js.native
      }
      
      @JSGlobal("lunr.Query.wildcard")
      @js.native
      object wildcard extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.lunr.mod.Query.wildcard & Double] = js.native
        
        /* 1 << 0 */ val LEADING: typings.lunr.mod.Query.wildcard.LEADING & Double = js.native
        
        /* 0 */ val NONE: typings.lunr.mod.Query.wildcard.NONE & Double = js.native
        
        /* 1 << 1 */ val TRAILING: typings.lunr.mod.Query.wildcard.TRAILING & Double = js.native
      }
    }
    
    @JSGlobal("lunr.QueryParseError")
    @js.native
    class QueryParseError protected ()
      extends typings.lunr.mod.QueryParseError {
      def this(message: String, start: String, end: String) = this()
    }
    
    /**
      * A token wraps a string representation of a token
      * as it is passed through the text processing pipeline.
      */
    @JSGlobal("lunr.Token")
    @js.native
    class Token protected ()
      extends typings.lunr.mod.Token {
      /**
        * @param [str=''] - The string token being wrapped.
        * @param [metadata={}] - Metadata associated with this token.
        */
      def this(str: String, metadata: js.Object) = this()
    }
    
    /**
      * A token set is used to store the unique list of all tokens
      * within an index. Token sets are also used to represent an
      * incoming query to the index, this query token set and index
      * token set are then intersected to find which tokens to look
      * up in the inverted index.
      *
      * A token set can hold multiple tokens, as in the case of the
      * index token set, or it can hold a single token as in the
      * case of a simple query token set.
      *
      * Additionally token sets are used to perform wildcard matching.
      * Leading, contained and trailing wildcards are supported, and
      * from this edit distance matching can also be provided.
      *
      * Token sets are implemented as a minimal finite state automata,
      * where both common prefixes and suffixes are shared between tokens.
      * This helps to reduce the space used for storing the token set.
      */
    @JSGlobal("lunr.TokenSet")
    @js.native
    class TokenSet ()
      extends typings.lunr.mod.TokenSet
    
    /**
      * A vector is used to construct the vector space of documents and queries. These
      * vectors support operations to determine the similarity between two documents or
      * a document and a query.
      *
      * Normally no parameters are required for initializing a vector, but in the case of
      * loading a previously dumped vector the raw elements can be provided to the constructor.
      *
      * For performance reasons vectors are implemented with a flat array, where an elements
      * index is immediately followed by its value. E.g. [index, value, index, value]. This
      * allows the underlying array to be as sparse as possible and still offer decent
      * performance when being used for vector calculations.
      */
    @JSGlobal("lunr.Vector")
    @js.native
    class Vector protected ()
      extends typings.lunr.mod.Vector {
      /**
        * @param [elements] - The flat list of element index and element value pairs.
        */
      def this(elements: js.Array[Double]) = this()
    }
    
    /**
      * lunr.generateStopWordFilter builds a stopWordFilter function from the provided
      * list of stop words.
      *
      * The built in lunr.stopWordFilter is built using this generator and can be used
      * to generate custom stopWordFilters for applications or non English languages.
      *
      * @param stopWords - The list of stop words
      * @see lunr.Pipeline
      * @see lunr.stopWordFilter
      */
    inline def generateStopWordFilter(stopWords: js.Array[String]): PipelineFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("generateStopWordFilter")(stopWords.asInstanceOf[js.Any]).asInstanceOf[PipelineFunction]
    
    /**
      * lunr.stemmer is an english language stemmer, this is a JavaScript
      * implementation of the PorterStemmer taken from http://tartarus.org/~martin
      *
      * Implements {lunr.PipelineFunction}
      *
      * @param token - The string to stem
      * @see {@link lunr.Pipeline}
      */
    inline def stemmer(token: typings.lunr.mod.Token): typings.lunr.mod.Token = ^.asInstanceOf[js.Dynamic].applyDynamic("stemmer")(token.asInstanceOf[js.Any]).asInstanceOf[typings.lunr.mod.Token]
    
    /**
      * lunr.stopWordFilter is an English language stop word list filter, any words
      * contained in the list will not be passed through the filter.
      *
      * This is intended to be used in the Pipeline. If the token does not pass the
      * filter then undefined will be returned.
      *
      * Implements {lunr.PipelineFunction}
      *
      * @param token - A token to check for being a stop word.
      * @see {@link lunr.Pipeline}
      */
    inline def stopWordFilter(token: typings.lunr.mod.Token): typings.lunr.mod.Token = ^.asInstanceOf[js.Dynamic].applyDynamic("stopWordFilter")(token.asInstanceOf[js.Any]).asInstanceOf[typings.lunr.mod.Token]
    
    object tokenizer {
      
      /**
        * A function for splitting a string into tokens ready to be inserted into
        * the search index. Uses `lunr.tokenizer.separator` to split strings, change
        * the value of this property to change how strings are split into tokens.
        *
        * This tokenizer will convert its parameter to a string by calling `toString` and
        * then will split this string on the character in `lunr.tokenizer.separator`.
        * Arrays will have their elements converted to strings and wrapped in a lunr.Token.
        *
        * @param obj - The object to convert into tokens
        */
      inline def apply(): js.Array[typings.lunr.mod.Token] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[typings.lunr.mod.Token]]
      inline def apply(obj: String): js.Array[typings.lunr.mod.Token] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.lunr.mod.Token]]
      inline def apply(obj: js.Array[js.Object]): js.Array[typings.lunr.mod.Token] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.lunr.mod.Token]]
      inline def apply(obj: js.Object): js.Array[typings.lunr.mod.Token] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.lunr.mod.Token]]
      
      @JSGlobal("lunr.tokenizer")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * The separator used to split a string into tokens. Override this property to change the behaviour of
        * `lunr.tokenizer` behaviour when tokenizing strings. By default this splits on whitespace and hyphens.
        *
        * @see lunr.tokenizer
        */
      @JSGlobal("lunr.tokenizer.separator")
      @js.native
      def separator: RegExp = js.native
      inline def separator_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("separator")(x.asInstanceOf[js.Any])
    }
    
    /**
      * lunr.trimmer is a pipeline function for trimming non word
      * characters from the beginning and end of tokens before they
      * enter the index.
      *
      * This implementation may not work correctly for non latin
      * characters and should either be removed or adapted for use
      * with languages with non-latin characters.
      *
      * Implements {lunr.PipelineFunction}
      *
      * @param token The token to pass through the filter
      * @see lunr.Pipeline
      */
    inline def trimmer(token: typings.lunr.mod.Token): typings.lunr.mod.Token = ^.asInstanceOf[js.Dynamic].applyDynamic("trimmer")(token.asInstanceOf[js.Any]).asInstanceOf[typings.lunr.mod.Token]
    
    /**
      * A namespace containing utils for the rest of the lunr library
      */
    object utils {
      
      @JSGlobal("lunr.utils")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Convert an object to a string.
        *
        * In the case of `null` and `undefined` the function returns
        * the empty string, in all other cases the result of calling
        * `toString` on the passed object is returned.
        *
        * @param obj The object to convert to a string.
        * @return string representation of the passed object.
        */
      inline def asString(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asString")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Print a warning message to the console.
        *
        * @param message The message to be printed.
        */
      inline def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSGlobal("lunr.version")
    @js.native
    val version: String = js.native
  }
}
