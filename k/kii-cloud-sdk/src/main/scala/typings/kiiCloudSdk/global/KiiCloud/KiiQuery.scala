package typings.kiiCloudSdk.global.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a KiiQuery object
  */
@JSGlobal("KiiCloud.KiiQuery")
@js.native
class KiiQuery ()
  extends typings.kiiCloudSdk.KiiCloud.KiiQuery {
  /**
    * Get the limit of the current query
    *
    */
  /* CompleteClass */
  override def getLimit(): Double = js.native
  /**
    * Set the limit of the given query
    *
    * @param value The desired limit. Must be an integer > 0
    *
    * @throws InvalidLimitException
    */
  /* CompleteClass */
  override def setLimit(value: Double): Unit = js.native
  /**
    * Set the query to sort by a field in ascending order
    *
    * If a sort has already been set, it will be overwritten.
    *
    * @param field The key that should be used to sort
    */
  /* CompleteClass */
  override def sortByAsc(field: String): Unit = js.native
  /**
    * Set the query to sort by a field in descending order
    *
    * If a sort has already been set, it will be overwritten.
    *
    * @param field The key that should be used to sort
    */
  /* CompleteClass */
  override def sortByDesc(field: String): Unit = js.native
}

/* static members */
@JSGlobal("KiiCloud.KiiQuery")
@js.native
object KiiQuery extends js.Object {
  /**
    * Create a KiiQuery object based on a KiiClause
    * <br><br>
    * By passing null as the ‘clause’ parameter, all objects can be retrieved.
    *
    * @param clause The KiiClause to be executed with the query
    */
  def queryWithClause(clause: typings.kiiCloudSdk.KiiCloud.KiiClause): typings.kiiCloudSdk.KiiCloud.KiiQuery = js.native
}

