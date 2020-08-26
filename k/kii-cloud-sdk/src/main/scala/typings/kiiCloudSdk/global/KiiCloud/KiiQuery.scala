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
  extends typings.kiiCloudSdk.KiiCloud.KiiQuery

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

