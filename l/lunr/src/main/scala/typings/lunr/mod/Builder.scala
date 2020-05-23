package typings.lunr.mod

import typings.lunr.anon.Boost
import typings.lunr.anon.BoostNumber
import typings.lunr.anon.Typeoftokenizer
import typings.lunr.mod.Builder.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
class Builder () extends js.Object {
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
    * The inverted index maps terms to document fields.
    */
  var invertedIndex: js.Object = js.native
  /**
    * A list of metadata keys that have been whitelisted for entry in the index.
    */
  var metadataWhitelist: js.Array[String] = js.native
  /**
    * The pipeline performs text processing on tokens before indexing.
    */
  var pipeline: Pipeline = js.native
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
  def add(doc: js.Object, attributes: BoostNumber): Unit = js.native
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
    * A parameter that controls the speed at which a rise in term frequency results in term
    * frequency saturation. The default value is 1.2. Setting this to a higher value will give
    * slower saturation levels, a lower value will result in quicker saturation.
    *
    * @param number - The value to set for this tuning parameter.
    */
  def k1(number: Double): Unit = js.native
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

@JSImport("lunr", "Builder")
@js.native
object Builder extends js.Object {
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
  type Plugin = js.ThisFunction1[/* this */ Builder, /* repeated */ js.Any, Unit]
}

