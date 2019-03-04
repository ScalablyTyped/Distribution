package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionNonNullTypeRef[T /* <: IntrospectionTypeRef */] extends js.Object {
  val kind: graphqlLib.graphqlLibStrings.NON_NULL
  val ofType: T
}

object IntrospectionNonNullTypeRef {
  @scala.inline
  def apply[T /* <: IntrospectionTypeRef */](kind: graphqlLib.graphqlLibStrings.NON_NULL, ofType: T): IntrospectionNonNullTypeRef[T] = {
    val __obj = js.Dynamic.literal(kind = kind, ofType = ofType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IntrospectionNonNullTypeRef[T]]
  }
}

