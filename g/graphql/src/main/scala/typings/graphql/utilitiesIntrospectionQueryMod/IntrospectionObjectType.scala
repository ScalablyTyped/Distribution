package typings.graphql.utilitiesIntrospectionQueryMod

import typings.graphql.graphqlStrings.OBJECT
import typings.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionObjectType
  extends IntrospectionOutputType
     with IntrospectionType {
  val description: js.UndefOr[Maybe[String]] = js.undefined
  val fields: js.Array[IntrospectionField]
  val interfaces: js.Array[IntrospectionNamedTypeRef[IntrospectionInterfaceType]]
  val kind: OBJECT
  val name: String
}

object IntrospectionObjectType {
  @scala.inline
  def apply(
    fields: js.Array[IntrospectionField],
    interfaces: js.Array[IntrospectionNamedTypeRef[IntrospectionInterfaceType]],
    kind: OBJECT,
    name: String,
    description: Maybe[String] = null
  ): IntrospectionObjectType = {
    val __obj = js.Dynamic.literal(fields = fields, interfaces = interfaces, kind = kind, name = name)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionObjectType]
  }
}

