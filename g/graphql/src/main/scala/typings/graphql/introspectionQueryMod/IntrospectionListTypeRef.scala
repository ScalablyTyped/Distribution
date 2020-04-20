package typings.graphql.introspectionQueryMod

import typings.graphql.graphqlStrings.LIST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionListTypeRef[T /* <: IntrospectionTypeRef */] extends js.Object {
  val kind: LIST
  val ofType: T
}

object IntrospectionListTypeRef {
  @scala.inline
  def apply[T /* <: IntrospectionTypeRef */](kind: LIST, ofType: T): IntrospectionListTypeRef[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], ofType = ofType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionListTypeRef[T]]
  }
}

