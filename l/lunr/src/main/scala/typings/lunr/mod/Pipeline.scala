package typings.lunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
class Pipeline () extends js.Object {
  
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
/* static members */
@JSImport("lunr", "Pipeline")
@js.native
object Pipeline extends js.Object {
  
  /**
    * Loads a previously serialised pipeline.
    *
    * All functions to be loaded must already be registered with lunr.Pipeline.
    * If any function from the serialised data has not been registered then an
    * error will be thrown.
    *
    * @param serialised - The serialised pipeline to load.
    */
  def load(serialised: js.Object): Pipeline = js.native
  
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
  def registerFunction(fn: PipelineFunction, label: String): Unit = js.native
}
