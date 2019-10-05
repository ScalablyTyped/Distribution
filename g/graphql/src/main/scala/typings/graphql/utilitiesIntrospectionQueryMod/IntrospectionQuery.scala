package typings.graphql.utilitiesIntrospectionQueryMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionQuery extends js.Object {
  val __schema: IntrospectionSchema
}

object IntrospectionQuery {
  @scala.inline
  def apply(__schema: IntrospectionSchema): IntrospectionQuery = {
    val __obj = js.Dynamic.literal(__schema = __schema)
  
    __obj.asInstanceOf[IntrospectionQuery]
  }
}

@JSImport("graphql/utilities/introspectionQuery", "introspectionQuery")
@js.native
object introspectionQuery extends TopLevel[String]

