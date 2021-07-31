package typings.kiiCloudSdk.global.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a KiiQuery object
  */
@JSGlobal("KiiCloud.KiiQuery")
@js.native
class KiiQuery ()
  extends StObject
     with typings.kiiCloudSdk.KiiCloud.KiiQuery {
  
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
object KiiQuery {
  
  @JSGlobal("KiiCloud.KiiQuery")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Create a KiiQuery object based on a KiiClause
    * <br><br>
    * By passing null as the ‘clause’ parameter, all objects can be retrieved.
    *
    * @param clause The KiiClause to be executed with the query
    */
  /* static member */
  @scala.inline
  def queryWithClause(clause: typings.kiiCloudSdk.KiiCloud.KiiClause): typings.kiiCloudSdk.KiiCloud.KiiQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("queryWithClause")(clause.asInstanceOf[js.Any]).asInstanceOf[typings.kiiCloudSdk.KiiCloud.KiiQuery]
}
