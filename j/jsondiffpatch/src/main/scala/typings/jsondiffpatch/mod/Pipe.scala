package typings.jsondiffpatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsondiffpatch", "Pipe")
@js.native
class Pipe[TContext /* <: FilterContext */] () extends js.Object {
  
  /**
    * Add one ore more filters after the specified filter
    * @param filterName The name of the filter to insert before
    * @param filters Filters to be inserted
    */
  def after(filterName: String, filters: Filter[TContext]*): Unit = js.native
  
  /**
    * Append one or more filters to the existing list
    */
  def append(filters: Filter[TContext]*): Unit = js.native
  
  /**
    * Add one ore more filters before the specified filter
    * @param filterName The name of the filter to insert before
    * @param filters Filters to be inserted
    */
  def before(filterName: String, filters: Filter[TContext]*): Unit = js.native
  
  /**
    * Remove all filters from this pipe
    */
  def clear(): Unit = js.native
  
  /**
    * Return array of ordered filter names for this pipe
    */
  def list(): Unit = js.native
  
  /**
    * Prepend one or more filters to the existing list
    */
  def prepend(filters: Filter[TContext]*): Unit = js.native
  
  /**
    * Remove the filter with the specified name
    * @param filterName The name of the filter to remove
    */
  def remove(filterName: String): Unit = js.native
  
  /**
    * Replace the specified filter with one ore more filters
    * @param filterName The name of the filter to replace
    * @param filters Filters to be inserted
    */
  def replace(filterName: String, filters: Filter[TContext]*): Unit = js.native
}
