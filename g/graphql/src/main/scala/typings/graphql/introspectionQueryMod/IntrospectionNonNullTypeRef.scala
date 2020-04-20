package typings.graphql.introspectionQueryMod

import typings.graphql.graphqlStrings.NON_NULL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionNonNullTypeRef[T /* <: IntrospectionTypeRef */] extends js.Object {
  val kind: NON_NULL
  val ofType: T
}

object IntrospectionNonNullTypeRef {
  @scala.inline
  def apply[T /* <: IntrospectionTypeRef */](kind: NON_NULL, ofType: T): IntrospectionNonNullTypeRef[T] = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], ofType = ofType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionNonNullTypeRef[T]]
  }
}

