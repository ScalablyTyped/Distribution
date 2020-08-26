package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a KiiQuery object
  */
@js.native
trait KiiQuery extends js.Object {
  /**
    * Get the limit of the current query
    *
    */
  def getLimit(): Double = js.native
  /**
    * Set the limit of the given query
    *
    * @param value The desired limit. Must be an integer > 0
    *
    * @throws InvalidLimitException
    */
  def setLimit(value: Double): Unit = js.native
  /**
    * Set the query to sort by a field in ascending order
    *
    * If a sort has already been set, it will be overwritten.
    *
    * @param field The key that should be used to sort
    */
  def sortByAsc(field: String): Unit = js.native
  /**
    * Set the query to sort by a field in descending order
    *
    * If a sort has already been set, it will be overwritten.
    *
    * @param field The key that should be used to sort
    */
  def sortByDesc(field: String): Unit = js.native
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
  implicit class KiiQueryOps[Self <: KiiQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetLimit(value: () => Double): Self = this.set("getLimit", js.Any.fromFunction0(value))
    @scala.inline
    def setSetLimit(value: Double => Unit): Self = this.set("setLimit", js.Any.fromFunction1(value))
    @scala.inline
    def setSortByAsc(value: String => Unit): Self = this.set("sortByAsc", js.Any.fromFunction1(value))
    @scala.inline
    def setSortByDesc(value: String => Unit): Self = this.set("sortByDesc", js.Any.fromFunction1(value))
  }
  
}

