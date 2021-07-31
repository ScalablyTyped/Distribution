package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a KiiQuery object
  */
trait KiiQuery extends StObject {
  
  /**
    * Get the limit of the current query
    *
    */
  def getLimit(): Double
  
  /**
    * Set the limit of the given query
    *
    * @param value The desired limit. Must be an integer > 0
    *
    * @throws InvalidLimitException
    */
  def setLimit(value: Double): Unit
  
  /**
    * Set the query to sort by a field in ascending order
    *
    * If a sort has already been set, it will be overwritten.
    *
    * @param field The key that should be used to sort
    */
  def sortByAsc(field: String): Unit
  
  /**
    * Set the query to sort by a field in descending order
    *
    * If a sort has already been set, it will be overwritten.
    *
    * @param field The key that should be used to sort
    */
  def sortByDesc(field: String): Unit
}
object KiiQuery {
  
  @scala.inline
  def apply(
    getLimit: () => Double,
    setLimit: Double => Unit,
    sortByAsc: String => Unit,
    sortByDesc: String => Unit
  ): KiiQuery = {
    val __obj = js.Dynamic.literal(getLimit = js.Any.fromFunction0(getLimit), setLimit = js.Any.fromFunction1(setLimit), sortByAsc = js.Any.fromFunction1(sortByAsc), sortByDesc = js.Any.fromFunction1(sortByDesc))
    __obj.asInstanceOf[KiiQuery]
  }
  
  @scala.inline
  implicit class KiiQueryMutableBuilder[Self <: KiiQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLimit(value: () => Double): Self = StObject.set(x, "getLimit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLimit(value: Double => Unit): Self = StObject.set(x, "setLimit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortByAsc(value: String => Unit): Self = StObject.set(x, "sortByAsc", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortByDesc(value: String => Unit): Self = StObject.set(x, "sortByDesc", js.Any.fromFunction1(value))
  }
}
