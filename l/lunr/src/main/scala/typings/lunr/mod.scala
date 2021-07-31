package typings.lunr

import org.scalablytyped.runtime.StringDictionary
import typings.lunr.anon.Boost
import typings.lunr.anon.Typeoftokenizer
import typings.lunr.anon.`0`
import typings.lunr.mod.Builder.Plugin
import typings.lunr.mod.Index.Attributes
import typings.lunr.mod.Index.QueryBuilder
import typings.lunr.mod.Index.QueryString
import typings.lunr.mod.Index.Result
import typings.lunr.mod.Query.Clause
import typings.lunr.mod.Token.UpdateFunction
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  @scala.inline
  def apply(config: ConfigFunction): Index = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Index]
  
  @JSImport("lunr", JSImport.Namespace)
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
  @JSImport("lunr", "Builder")
  @js.native
  class Builder () extends StObject {
    
    /**
      * A parameter to control field length normalization, setting this to 0 disabled normalization, 1 fully normalizes field lengths, the default value is 0.75.
      */
    var _b: Double = js.native
    
    /**
      * Internal reference to the document fields to index.
      */
    var _fields: js.Array[String] = js.native
    
    /**
      * A parameter to control how quickly an increase in term frequency results in term frequency saturation, the default value is 1.2.
      */
    var _k1: Double = js.native
    
    /**
      * Internal reference to the document reference field.
      */
    var _ref: String = js.native
    
    /**
      * Adds a document to the index.
      *
      * Before adding fields to the index the index should have been fully setup, with the document
      * ref and all fields to index already having been specified.
      *
      * The document must have a field name as specified by the ref (by default this is 'id') and
      * it should have all fields defined for indexing, though null or undefined values will not
      * cause errors.
      *
      * Entire documents can be boosted at build time. Applying a boost to a document indicates that
      * this document should rank higher in search results than other documents.
      *
      * @param doc - The document to add to the index.
      * @param attributes - Optional attributes associated with this document.
      */
    def add(doc: js.Object): Unit = js.native
    def add(doc: js.Object, attributes: `0`): Unit = js.native
    
    /**
      * A parameter to tune the amount of field length normalisation that is applied when
      * calculating relevance scores. A value of 0 will completely disable any normalisation
      * and a value of 1 will fully normalise field lengths. The default is 0.75. Values of b
      * will be clamped to the range 0 - 1.
      *
      * @param number - The value to set for this tuning parameter.
      */
    def b(number: Double): Unit = js.native
    
    /**
      * Builds the index, creating an instance of lunr.Index.
      *
      * This completes the indexing process and should only be called
      * once all documents have been added to the index.
      *
      */
    def build(): Index = js.native
    
    /**
      * Keeps track of the total number of documents indexed.
      */
    var documentCount: Double = js.native
    
    /**
      * Keeps track of the length of documents added to the index.
      */
    var documentLengths: js.Object = js.native
    
    /**
      *  Keeps track of document term frequencies.
      */
    var documentTermFrequencies: js.Object = js.native
    
    /**
      * Adds a field to the list of document fields that will be indexed. Every document being
      * indexed should have this field. Null values for this field in indexed documents will
      * not cause errors but will limit the chance of that document being retrieved by searches.
      *
      * All fields should be added before adding documents to the index. Adding fields after
      * a document has been indexed will have no effect on already indexed documents.
      *
      * Fields can be boosted at build time. This allows terms within that field to have more
      * importance when ranking search results. Use a field boost to specify that matches
      * within one field are more important than other fields.
      *
      * @param fieldName - The name of a field to index in all documents.
      * @param attributes - Optional attributes associated with this field.
      */
    def field(fieldName: String): Unit = js.native
    def field(fieldName: String, attributes: Boost): Unit = js.native
    
    /**
      * The inverted index maps terms to document fields.
      */
    var invertedIndex: js.Object = js.native
    
    /**
      * A parameter that controls the speed at which a rise in term frequency results in term
      * frequency saturation. The default value is 1.2. Setting this to a higher value will give
      * slower saturation levels, a lower value will result in quicker saturation.
      *
      * @param number - The value to set for this tuning parameter.
      */
    def k1(number: Double): Unit = js.native
    
    /**
      * A list of metadata keys that have been whitelisted for entry in the index.
      */
    var metadataWhitelist: js.Array[String] = js.native
    
    /**
      * The pipeline performs text processing on tokens before indexing.
      */
    var pipeline: Pipeline = js.native
    
    /**
      * Sets the document field used as the document reference. Every document must have this field.
      * The type of this field in the document should be a string, if it is not a string it will be
      * coerced into a string by calling toString.
      *
      * The default ref is 'id'.
      *
      * The ref should _not_ be changed during indexing, it should be set before any documents are
      * added to the index. Changing it during indexing can lead to inconsistent results.
      *
      * @param ref - The name of the reference field in the document.
      */
    def ref(ref: String): Unit = js.native
    
    /**
      * A pipeline for processing search terms before querying the index.
      */
    var searchPipeline: Pipeline = js.native
    
    /**
      * A counter incremented for each unique term, used to identify a terms position in the vector space.
      */
    var termIndex: Double = js.native
    
    /**
      * Function for splitting strings into tokens for indexing.
      */
    var tokenizer: Typeoftokenizer = js.native
    
    /**
      * Applies a plugin to the index builder.
      *
      * A plugin is a function that is called with the index builder as its context.
      * Plugins can be used to customise or extend the behaviour of the index
      * in some way. A plugin is just a function, that encapsulated the custom
      * behaviour that should be applied when building the index.
      *
      * The plugin function will be called with the index builder as its argument, additional
      * arguments can also be passed when calling use. The function will be called
      * with the index builder as its context.
      *
      * @param plugin The plugin to apply.
      */
    def use(plugin: Plugin, args: js.Any*): Unit = js.native
  }
  object Builder {
    
    /**
      * A plugin is a function that is called with the index builder as its context.
      * Plugins can be used to customise or extend the behaviour of the index
      * in some way. A plugin is just a function, that encapsulated the custom
      * behaviour that should be applied when building the index.
      *
      * The plugin function will be called with the index builder as its argument, additional
      * arguments can also be passed when calling use. The function will be called
      * with the index builder as its context.
      */
    @js.native
    trait Plugin extends StObject {
      
      def apply(args: js.Any*): Unit = js.native
    }
  }
  
  /**
    * An index contains the built index of all documents and provides a query interface
    * to the index.
    *
    * Usually instances of lunr.Index will not be created using this constructor, instead
    * lunr.Builder should be used to construct new indexes, or lunr.Index.load should be
    * used to load previously built and serialized indexes.
    */
  @JSImport("lunr", "Index")
  @js.native
  class Index protected () extends StObject {
    /**
      * @param attrs The attributes of the built search index.
      */
    def this(attrs: Attributes) = this()
    
    /**
      * Performs a query against the index using the yielded lunr.Query object.
      *
      * If performing programmatic queries against the index, this method is preferred
      * over lunr.Index#search so as to avoid the additional query parsing overhead.
      *
      * A query object is yielded to the supplied function which should be used to
      * express the query to be run against the index.
      *
      * Note that although this function takes a callback parameter it is _not_ an
      * asynchronous operation, the callback is just yielded a query object to be
      * customized.
      *
      * @param fn - A function that is used to build the query.
      */
    def query(fn: QueryBuilder): js.Array[Result] = js.native
    
    /**
      * Performs a search against the index using lunr query syntax.
      *
      * Results will be returned sorted by their score, the most relevant results
      * will be returned first.
      *
      * For more programmatic querying use lunr.Index#query.
      *
      * @param queryString - A string containing a lunr query.
      * @throws {lunr.QueryParseError} If the passed query string cannot be parsed.
      */
    def search(queryString: QueryString): js.Array[Result] = js.native
    
    /**
      * Prepares the index for JSON serialization.
      *
      * The schema for this JSON blob will be described in a
      * separate JSON schema file.
      *
      */
    def toJSON(): js.Object = js.native
  }
  object Index {
    
    @JSImport("lunr", "Index")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Loads a previously serialized lunr.Index
      *
      * @param serializedIndex - A previously serialized lunr.Index
      */
    /* static member */
    @scala.inline
    def load(serializedIndex: js.Object): Index = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serializedIndex.asInstanceOf[js.Any]).asInstanceOf[Index]
    
    trait Attributes extends StObject {
      
      /**
        * Document vectors keyed by document reference.
        */
      var documentVectors: StringDictionary[Vector]
      
      /**
        * The names of indexed document fields.
        */
      var fields: js.Array[String]
      
      /**
        * An index of term/field to document reference.
        */
      var invertedIndex: js.Object
      
      /**
        * The pipeline to use for search terms.
        */
      var pipeline: Pipeline
      
      /**
        * An set of all corpus tokens.
        */
      var tokenSet: TokenSet
    }
    object Attributes {
      
      @scala.inline
      def apply(
        documentVectors: StringDictionary[Vector],
        fields: js.Array[String],
        invertedIndex: js.Object,
        pipeline: Pipeline,
        tokenSet: TokenSet
      ): Attributes = {
        val __obj = js.Dynamic.literal(documentVectors = documentVectors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], invertedIndex = invertedIndex.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], tokenSet = tokenSet.asInstanceOf[js.Any])
        __obj.asInstanceOf[Attributes]
      }
      
      @scala.inline
      implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDocumentVectors(value: StringDictionary[Vector]): Self = StObject.set(x, "documentVectors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
        
        @scala.inline
        def setInvertedIndex(value: js.Object): Self = StObject.set(x, "invertedIndex", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPipeline(value: Pipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTokenSet(value: TokenSet): Self = StObject.set(x, "tokenSet", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A query builder callback provides a query object to be used to express
      * the query to perform on the index.
      *
      * @param query - The query object to build up.
      */
    type QueryBuilder = js.ThisFunction1[/* this */ Query, /* query */ Query, Unit]
    
    /**
      * Although lunr provides the ability to create queries using lunr.Query, it also provides a simple
      * query language which itself is parsed into an instance of lunr.Query.
      *
      * For programmatically building queries it is advised to directly use lunr.Query, the query language
      * is best used for human entered text rather than program generated text.
      *
      * At its simplest queries can just be a single term, e.g. `hello`, multiple terms are also supported
      * and will be combined with OR, e.g `hello world` will match documents that contain either 'hello'
      * or 'world', though those that contain both will rank higher in the results.
      *
      * Wildcards can be included in terms to match one or more unspecified characters, these wildcards can
      * be inserted anywhere within the term, and more than one wildcard can exist in a single term. Adding
      * wildcards will increase the number of documents that will be found but can also have a negative
      * impact on query performance, especially with wildcards at the beginning of a term.
      *
      * Terms can be restricted to specific fields, e.g. `title:hello`, only documents with the term
      * hello in the title field will match this query. Using a field not present in the index will lead
      * to an error being thrown.
      *
      * Modifiers can also be added to terms, lunr supports edit distance and boost modifiers on terms. A term
      * boost will make documents matching that term score higher, e.g. `foo^5`. Edit distance is also supported
      * to provide fuzzy matching, e.g. 'hello~2' will match documents with hello with an edit distance of 2.
      * Avoid large values for edit distance to improve query performance.
      *
      * To escape special characters the backslash character '\' can be used, this allows searches to include
      * characters that would normally be considered modifiers, e.g. `foo\~2` will search for a term "foo~2" instead
      * of attempting to apply a boost of 2 to the search term "foo".
      *
      * @example <caption>Simple single term query</caption>
      * hello
      * @example <caption>Multiple term query</caption>
      * hello world
      * @example <caption>term scoped to a field</caption>
      * title:hello
      * @example <caption>term with a boost of 10</caption>
      * hello^10
      * @example <caption>term with an edit distance of 2</caption>
      * hello~2
      */
    type QueryString = String
    
    /**
      * A result contains details of a document matching a search query.
      */
    trait Result extends StObject {
      
      /**
        * Contains metadata about this match including which term(s) caused the match.
        */
      var matchData: MatchData
      
      /**
        * The reference of the document this result represents.
        */
      var ref: String
      
      /**
        * A number between 0 and 1 representing how similar this document is to the query.
        */
      var score: Double
    }
    object Result {
      
      @scala.inline
      def apply(matchData: MatchData, ref: String, score: Double): Result = {
        val __obj = js.Dynamic.literal(matchData = matchData.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
        __obj.asInstanceOf[Result]
      }
      
      @scala.inline
      implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMatchData(value: MatchData): Self = StObject.set(x, "matchData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * Contains and collects metadata about a matching document.
    * A single instance of lunr.MatchData is returned as part of every
    * lunr.IndexResult.
    */
  @JSImport("lunr", "MatchData")
  @js.native
  class MatchData protected () extends StObject {
    /**
      * @param term - The term this match data is associated with
      * @param field - The field in which the term was found
      * @param metadata - The metadata recorded about this term in this field
      */
    def this(term: String, field: String, metadata: js.Object) = this()
    
    /**
      * An instance of lunr.MatchData will be created for every term that matches a
      * document. However only one instance is required in a lunr.Index~Result. This
      * method combines metadata from another instance of lunr.MatchData with this
      * objects metadata.
      *
      * @param otherMatchData - Another instance of match data to merge with this one.
      * @see {@link lunr.Index~Result}
      */
    def combine(otherMatchData: MatchData): Unit = js.native
    
    /**
      * A cloned collection of metadata associated with this document.
      */
    var metadata: js.Object = js.native
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
  @JSImport("lunr", "Pipeline")
  @js.native
  class Pipeline () extends StObject {
    
    /**
      * Adds new functions to the end of the pipeline.
      *
      * Logs a warning if the function has not been registered.
      *
      * @param functions - Any number of functions to add to the pipeline.
      */
    def add(functions: PipelineFunction*): Unit = js.native
    
    /**
      * Adds a single function after a function that already exists in the
      * pipeline.
      *
      * Logs a warning if the function has not been registered.
      *
      * @param existingFn - A function that already exists in the pipeline.
      * @param newFn - The new function to add to the pipeline.
      */
    def after(existingFn: PipelineFunction, newFn: PipelineFunction): Unit = js.native
    
    /**
      * Adds a single function before a function that already exists in the
      * pipeline.
      *
      * Logs a warning if the function has not been registered.
      *
      * @param existingFn - A function that already exists in the pipeline.
      * @param newFn - The new function to add to the pipeline.
      */
    def before(existingFn: PipelineFunction, newFn: PipelineFunction): Unit = js.native
    
    /**
      * Removes a function from the pipeline.
      *
      * @param fn The function to remove from the pipeline.
      */
    def remove(fn: PipelineFunction): Unit = js.native
    
    /**
      * Resets the pipeline by removing any existing processors.
      *
      */
    def reset(): Unit = js.native
    
    /**
      * Runs the current list of functions that make up the pipeline against the
      * passed tokens.
      *
      * @param tokens The tokens to run through the pipeline.
      */
    def run(tokens: js.Array[Token]): js.Array[Token] = js.native
    
    /**
      * Convenience method for passing a string through a pipeline and getting
      * strings out. This method takes care of wrapping the passed string in a
      * token and mapping the resulting tokens back to strings.
      *
      * @param str - The string to pass through the pipeline.
      */
    def runString(str: String): js.Array[String] = js.native
    
    /**
      * Returns a representation of the pipeline ready for serialisation.
      *
      * Logs a warning if the function has not been registered.
      *
      */
    def toJSON(): js.Array[PipelineFunction] = js.native
  }
  object Pipeline {
    
    @JSImport("lunr", "Pipeline")
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
    @scala.inline
    def load(serialised: js.Object): Pipeline = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serialised.asInstanceOf[js.Any]).asInstanceOf[Pipeline]
    
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
    @scala.inline
    def registerFunction(fn: PipelineFunction, label: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunction")(fn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /**
    * A lunr.Query provides a programmatic way of defining queries to be performed
    * against a {@link lunr.Index}.
    *
    * Prefer constructing a lunr.Query using the {@link lunr.Index#query} method
    * so the query object is pre-initialized with the right index fields.
    */
  @JSImport("lunr", "Query")
  @js.native
  class Query protected () extends StObject {
    /**
      * @param allFields An array of all available fields in a lunr.Index.
      */
    def this(allFields: js.Array[String]) = this()
    
    /**
      * An array of all available fields in a lunr.Index.
      */
    var allFields: js.Array[String] = js.native
    
    /**
      * Adds a {@link lunr.Query~Clause} to this query.
      *
      * Unless the clause contains the fields to be matched all fields will be matched. In addition
      * a default boost of 1 is applied to the clause.
      *
      * @param clause - The clause to add to this query.
      * @see lunr.Query~Clause
      */
    def clause(clause: Clause): Query = js.native
    
    /**
      * An array of query clauses.
      */
    var clauses: js.Array[Clause] = js.native
    
    /**
      * Adds a term to the current query, under the covers this will create a {@link lunr.Query~Clause}
      * to the list of clauses that make up this query.
      *
      * The term is used as is, i.e. no tokenization will be performed by this method. Instead conversion
      * to a token or token-like string should be done before calling this method.
      *
      * The term will be converted to a string by calling `toString`. Multiple terms can be passed as an
      * array, each term in the array will share the same options.
      *
      * @param term - The term to add to the query.
      * @param [options] - Any additional properties to add to the query clause.
      * @see lunr.Query#clause
      * @see lunr.Query~Clause
      * @example <caption>adding a single term to a query</caption>
      * query.term("foo")
      * @example <caption>adding a single term to a query and specifying search fields, term boost and automatic trailing wildcard</caption>
      * query.term("foo", {
      *   fields: ["title"],
      *   boost: 10,
      *   wildcard: lunr.Query.wildcard.TRAILING
      * })
      */
    def term(term: String, options: js.Object): Query = js.native
    def term(term: js.Array[String | Token], options: js.Object): Query = js.native
    def term(term: Token, options: js.Object): Query = js.native
  }
  object Query {
    
    @js.native
    sealed trait presence extends StObject
    /**
      * Constants for indicating what kind of presence a term must have in matching documents.
      */
    @JSImport("lunr", "Query.presence")
    @js.native
    object presence extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[presence & Double] = js.native
      
      /**
        * Term's presence in a document is optional, this is the default value.
        */
      @js.native
      sealed trait OPTIONAL
        extends StObject
           with presence
      /* 1 */ val OPTIONAL: typings.lunr.mod.Query.presence.OPTIONAL & Double = js.native
      
      /**
        * Term's presence in a document is prohibited, documents that do contain this term will not be returned.
        */
      @js.native
      sealed trait PROHIBITED
        extends StObject
           with presence
      /* 3 */ val PROHIBITED: typings.lunr.mod.Query.presence.PROHIBITED & Double = js.native
      
      /**
        * Term's presence in a document is required, documents that do not contain this term will not be returned.
        */
      @js.native
      sealed trait REQUIRED
        extends StObject
           with presence
      /* 2 */ val REQUIRED: typings.lunr.mod.Query.presence.REQUIRED & Double = js.native
    }
    
    @js.native
    sealed trait wildcard extends StObject
    @JSImport("lunr", "Query.wildcard")
    @js.native
    object wildcard extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[wildcard & Double] = js.native
      
      @js.native
      sealed trait LEADING
        extends StObject
           with wildcard
      /* 1 << 0 */ val LEADING: typings.lunr.mod.Query.wildcard.LEADING & Double = js.native
      
      @js.native
      sealed trait NONE
        extends StObject
           with wildcard
      /* 0 */ val NONE: typings.lunr.mod.Query.wildcard.NONE & Double = js.native
      
      @js.native
      sealed trait TRAILING
        extends StObject
           with wildcard
      /* 1 << 1 */ val TRAILING: typings.lunr.mod.Query.wildcard.TRAILING & Double = js.native
    }
    
    /**
      * A single clause in a {@link lunr.Query} contains a term and details on how to
      * match that term against a {@link lunr.Index}.
      */
    trait Clause extends StObject {
      
      /** Any boost that should be applied when matching this clause. */
      var boost: Double
      
      /** Whether the term should have fuzzy matching applied, and how fuzzy the match should be. */
      var editDistance: Double
      
      /** The fields in an index this clause should be matched against. */
      var fields: js.Array[String]
      
      var term: String
      
      /** Whether the term should be passed through the search pipeline. */
      var usePipeline: Boolean
      
      /** Whether the term should have wildcards appended or prepended. */
      var wildcard: Double
    }
    object Clause {
      
      @scala.inline
      def apply(
        boost: Double,
        editDistance: Double,
        fields: js.Array[String],
        term: String,
        usePipeline: Boolean,
        wildcard: Double
      ): Clause = {
        val __obj = js.Dynamic.literal(boost = boost.asInstanceOf[js.Any], editDistance = editDistance.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], usePipeline = usePipeline.asInstanceOf[js.Any], wildcard = wildcard.asInstanceOf[js.Any])
        __obj.asInstanceOf[Clause]
      }
      
      @scala.inline
      implicit class ClauseMutableBuilder[Self <: Clause] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBoost(value: Double): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEditDistance(value: Double): Self = StObject.set(x, "editDistance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
        
        @scala.inline
        def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsePipeline(value: Boolean): Self = StObject.set(x, "usePipeline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWildcard(value: Double): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("lunr", "QueryParseError")
  @js.native
  class QueryParseError protected ()
    extends StObject
       with Error {
    def this(message: String, start: String, end: String) = this()
    
    var end: Double = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_QueryParseError: typings.lunr.lunrStrings.QueryParseError = js.native
    
    var start: Double = js.native
  }
  
  /**
    * A token wraps a string representation of a token
    * as it is passed through the text processing pipeline.
    */
  @JSImport("lunr", "Token")
  @js.native
  class Token protected () extends StObject {
    /**
      * @param [str=''] - The string token being wrapped.
      * @param [metadata={}] - Metadata associated with this token.
      */
    def this(str: String, metadata: js.Object) = this()
    
    def clone(fn: UpdateFunction): Token = js.native
    
    /**
      * Applies the given function to the wrapped string token.
      *
      * @example
      * token.update(function (str, metadata) {
      *   return str.toUpperCase()
      * })
      *
      * @param fn - A function to apply to the token string.
      */
    def update(fn: UpdateFunction): Token = js.native
  }
  object Token {
    
    /**
      * A token update function is used when updating or optionally
      * when cloning a token.
      *
      * @param str - The string representation of the token.
      * @param metadata - All metadata associated with this token.
      */
    type UpdateFunction = js.Function2[/* str */ String, /* metadata */ js.Object, Unit]
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
  @JSImport("lunr", "TokenSet")
  @js.native
  class TokenSet () extends StObject {
    
    /**
      * Creates a TokenSet instance from the given sorted array of words.
      *
      * @param arr - A sorted array of strings to create the set from.
      * @throws Will throw an error if the input array is not sorted.
      */
    def fromArray(arr: js.Array[String]): TokenSet = js.native
    
    /**
      * Creates a token set representing a single string with a specified
      * edit distance.
      *
      * Insertions, deletions, substitutions and transpositions are each
      * treated as an edit distance of 1.
      *
      * Increasing the allowed edit distance will have a dramatic impact
      * on the performance of both creating and intersecting these TokenSets.
      * It is advised to keep the edit distance less than 3.
      *
      * @param str - The string to create the token set from.
      * @param editDistance - The allowed edit distance to match.
      */
    def fromFuzzyString(str: String, editDistance: Double): Vector = js.native
    
    /**
      * Creates a TokenSet from a string.
      *
      * The string may contain one or more wildcard characters (*)
      * that will allow wildcard matching when intersecting with
      * another TokenSet.
      *
      * @param str - The string to create a TokenSet from.
      */
    def fromString(str: String): TokenSet = js.native
    
    /**
      * Returns a new TokenSet that is the intersection of
      * this TokenSet and the passed TokenSet.
      *
      * This intersection will take into account any wildcards
      * contained within the TokenSet.
      *
      * @param b - An other TokenSet to intersect with.
      */
    def intersect(b: TokenSet): TokenSet = js.native
    
    /**
      * Converts this TokenSet into an array of strings
      * contained within the TokenSet.
      *
      */
    def toArray(): js.Array[String] = js.native
  }
  
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
  @JSImport("lunr", "Vector")
  @js.native
  class Vector protected () extends StObject {
    /**
      * @param [elements] - The flat list of element index and element value pairs.
      */
    def this(elements: js.Array[Double]) = this()
    
    /**
      * Calculates the dot product of this vector and another vector.
      *
      * @param otherVector - The vector to compute the dot product with.
      */
    def dot(otherVector: Vector): Double = js.native
    
    /**
      * Inserts an element at an index within the vector.
      *
      * Does not allow duplicates, will throw an error if there is already an entry
      * for this index.
      *
      * @param insertIdx - The index at which the element should be inserted.
      * @param val - The value to be inserted into the vector.
      */
    def insert(insertIdx: Double, `val`: Double): Unit = js.native
    
    /**
      * Calculates the magnitude of this vector.
      *
      */
    def magnitude(): Double = js.native
    
    /**
      * Calculates the position within the vector to insert a given index.
      *
      * This is used internally by insert and upsert. If there are duplicate indexes then
      * the position is returned as if the value for that index were to be updated, but it
      * is the callers responsibility to check whether there is a duplicate at that index
      *
      * @param insertIdx - The index at which the element should be inserted.
      */
    def positionForIndex(index: Double): Double = js.native
    
    /**
      * Calculates the cosine similarity between this vector and another
      * vector.
      *
      * @param otherVector - The other vector to calculate the
      * similarity with.
      */
    def similarity(otherVector: Vector): Double = js.native
    
    /**
      * Converts the vector to an array of the elements within the vector.
      *
      */
    def toArray(): js.Array[Double] = js.native
    
    /**
      * A JSON serializable representation of the vector.
      *
      */
    def toJSON(): js.Array[Double] = js.native
    
    /**
      * Inserts or updates an existing index within the vector.
      *
      * @param insertIdx - The index at which the element should be inserted.
      * @param val - The value to be inserted into the vector.
      * @param fn - A function that is called for updates, the existing value and the
      * requested value are passed as arguments
      */
    def upsert(
      insertIdx: Double,
      `val`: Double,
      fn: js.Function2[/* existingVal */ Double, /* val */ Double, Double]
    ): Unit = js.native
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
  @scala.inline
  def generateStopWordFilter(stopWords: js.Array[String]): PipelineFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("generateStopWordFilter")(stopWords.asInstanceOf[js.Any]).asInstanceOf[PipelineFunction]
  
  /**
    * lunr.stemmer is an english language stemmer, this is a JavaScript
    * implementation of the PorterStemmer taken from http://tartarus.org/~martin
    *
    * Implements {lunr.PipelineFunction}
    *
    * @param token - The string to stem
    * @see {@link lunr.Pipeline}
    */
  @scala.inline
  def stemmer(token: Token): Token = ^.asInstanceOf[js.Dynamic].applyDynamic("stemmer")(token.asInstanceOf[js.Any]).asInstanceOf[Token]
  
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
  @scala.inline
  def stopWordFilter(token: Token): Token = ^.asInstanceOf[js.Dynamic].applyDynamic("stopWordFilter")(token.asInstanceOf[js.Any]).asInstanceOf[Token]
  
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
    @scala.inline
    def apply(): js.Array[Token] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[Token]]
    @scala.inline
    def apply(obj: String): js.Array[Token] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
    @scala.inline
    def apply(obj: js.Array[js.Object]): js.Array[Token] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
    @scala.inline
    def apply(obj: js.Object): js.Array[Token] = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[Token]]
    
    @JSImport("lunr", "tokenizer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The separator used to split a string into tokens. Override this property to change the behaviour of
      * `lunr.tokenizer` behaviour when tokenizing strings. By default this splits on whitespace and hyphens.
      *
      * @see lunr.tokenizer
      */
    @JSImport("lunr", "tokenizer.separator")
    @js.native
    def separator: RegExp = js.native
    @scala.inline
    def separator_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("separator")(x.asInstanceOf[js.Any])
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
  @scala.inline
  def trimmer(token: Token): Token = ^.asInstanceOf[js.Dynamic].applyDynamic("trimmer")(token.asInstanceOf[js.Any]).asInstanceOf[Token]
  
  /**
    * A namespace containing utils for the rest of the lunr library
    */
  object utils {
    
    @JSImport("lunr", "utils")
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
    @scala.inline
    def asString(obj: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asString")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Print a warning message to the console.
      *
      * @param message The message to be printed.
      */
    @scala.inline
    def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("lunr", "version")
  @js.native
  val version: String = js.native
  
  type ConfigFunction = js.ThisFunction1[/* this */ Builder, /* builder */ Builder, Unit]
  
  /**
    * A pipeline function maps lunr.Token to lunr.Token. A lunr.Token contains the token
    * string as well as all known metadata. A pipeline function can mutate the token string
    * or mutate (or add) metadata for a given token.
    *
    * A pipeline function can indicate that the passed token should be discarded by returning
    * null. This token will not be passed to any downstream pipeline functions and will not be
    * added to the index.
    *
    * Multiple tokens can be returned by returning an array of tokens. Each token will be passed
    * to any downstream pipeline functions and all will returned tokens will be added to the index.
    *
    * Any number of pipeline functions may be chained together using a lunr.Pipeline.
    *
    * @param token - A token from the document being processed.
    * @param i - The index of this token in the complete list of tokens for this document/field.
    * @param tokens - All tokens for this document/field.
    */
  type PipelineFunction = js.Function3[
    /* token */ Token, 
    /* i */ Double, 
    /* tokens */ js.Array[Token], 
    Null | Token | js.Array[Token]
  ]
}
