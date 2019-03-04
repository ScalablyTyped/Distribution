package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionListTypeRef[T /* <: IntrospectionTypeRef */] extends js.Object {
  val kind: graphqlLib.graphqlLibStrings.LIST
  val ofType: T
}

object IntrospectionListTypeRef {
  @scala.inline
  def apply[T /* <: IntrospectionTypeRef */](kind: graphqlLib.graphqlLibStrings.LIST, ofType: T): IntrospectionListTypeRef[T] = {
    val __obj = js.Dynamic.literal(kind = kind, ofType = ofType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IntrospectionListTypeRef[T]]
  }
}

