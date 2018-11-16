package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilitiesIntrospectionQueryMod {
  type IntrospectionInputType = IntrospectionScalarType | IntrospectionEnumType | IntrospectionInputObjectType
  type IntrospectionInputTypeRef = IntrospectionNamedTypeRef[IntrospectionInputType] | IntrospectionListTypeRef[js.Any] | (IntrospectionNonNullTypeRef[
    IntrospectionNamedTypeRef[IntrospectionInputType] | IntrospectionListTypeRef[js.Any]
  ])
  type IntrospectionOutputType = IntrospectionScalarType | IntrospectionObjectType | IntrospectionInterfaceType | IntrospectionUnionType | IntrospectionEnumType
  type IntrospectionOutputTypeRef = IntrospectionNamedTypeRef[IntrospectionOutputType] | IntrospectionListTypeRef[js.Any] | (IntrospectionNonNullTypeRef[
    IntrospectionNamedTypeRef[IntrospectionOutputType] | IntrospectionListTypeRef[js.Any]
  ])
  type IntrospectionType = IntrospectionScalarType | IntrospectionObjectType | IntrospectionInterfaceType | IntrospectionUnionType | IntrospectionEnumType | IntrospectionInputObjectType
  type IntrospectionTypeRef = IntrospectionNamedTypeRef[IntrospectionType] | IntrospectionListTypeRef[js.Any] | (IntrospectionNonNullTypeRef[IntrospectionNamedTypeRef[IntrospectionType] | IntrospectionListTypeRef[js.Any]])
}
