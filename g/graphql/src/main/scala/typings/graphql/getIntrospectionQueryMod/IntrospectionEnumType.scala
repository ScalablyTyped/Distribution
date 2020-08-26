package typings.graphql.getIntrospectionQueryMod

import typings.graphql.graphqlStrings.ENUM
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionEnumType
  extends IntrospectionInputType
     with IntrospectionOutputType
     with IntrospectionType {
  val description: js.UndefOr[Maybe[String]] = js.native
  val enumValues: js.Array[IntrospectionEnumValue] = js.native
  val kind: ENUM = js.native
  val name: String = js.native
}

object IntrospectionEnumType {
  @scala.inline
  def apply(enumValues: js.Array[IntrospectionEnumValue], kind: ENUM, name: String): IntrospectionEnumType = {
    val __obj = js.Dynamic.literal(enumValues = enumValues.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionEnumType]
  }
  @scala.inline
  implicit class IntrospectionEnumTypeOps[Self <: IntrospectionEnumType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnumValuesVarargs(value: IntrospectionEnumValue*): Self = this.set("enumValues", js.Array(value :_*))
    @scala.inline
    def setEnumValues(value: js.Array[IntrospectionEnumValue]): Self = this.set("enumValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ENUM): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Maybe[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
  }
  
}

