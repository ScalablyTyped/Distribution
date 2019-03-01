package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilitiesIntrospectionQueryMod {
  type IntrospectionInputTypeRef = IntrospectionNamedTypeRef[IntrospectionInputType] | IntrospectionListTypeRef[js.Any] | (IntrospectionNonNullTypeRef[
    IntrospectionNamedTypeRef[IntrospectionInputType] | IntrospectionListTypeRef[js.Any]
  ])
  type IntrospectionOutputTypeRef = IntrospectionNamedTypeRef[IntrospectionOutputType] | IntrospectionListTypeRef[js.Any] | (IntrospectionNonNullTypeRef[
    IntrospectionNamedTypeRef[IntrospectionOutputType] | IntrospectionListTypeRef[js.Any]
  ])
  type IntrospectionTypeRef = IntrospectionNamedTypeRef[IntrospectionType] | IntrospectionListTypeRef[js.Any] | (IntrospectionNonNullTypeRef[IntrospectionNamedTypeRef[IntrospectionType] | IntrospectionListTypeRef[js.Any]])
}
