package typings.graphql.introspectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionQuery_ extends js.Object {
  val __schema: IntrospectionSchema
}

object IntrospectionQuery_ {
  @scala.inline
  def apply(__schema: IntrospectionSchema): IntrospectionQuery_ = {
    val __obj = js.Dynamic.literal(__schema = __schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IntrospectionQuery_]
  }
}

