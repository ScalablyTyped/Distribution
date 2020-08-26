package typings.graphql.getIntrospectionQueryMod

import typings.graphql.graphqlStrings.UNION
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionUnionType
  extends IntrospectionOutputType
     with IntrospectionType {
  val description: js.UndefOr[Maybe[String]] = js.native
  val kind: UNION = js.native
  val name: String = js.native
  val possibleTypes: js.Array[IntrospectionNamedTypeRef[IntrospectionObjectType]] = js.native
}

object IntrospectionUnionType {
  @scala.inline
  def apply(
    kind: UNION,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef[IntrospectionObjectType]]
  ): IntrospectionUnionType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionUnionType]
  }
  @scala.inline
  implicit class IntrospectionUnionTypeOps[Self <: IntrospectionUnionType] (val x: Self) extends AnyVal {
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
    def setKind(value: UNION): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPossibleTypesVarargs(value: IntrospectionNamedTypeRef[IntrospectionObjectType]*): Self = this.set("possibleTypes", js.Array(value :_*))
    @scala.inline
    def setPossibleTypes(value: js.Array[IntrospectionNamedTypeRef[IntrospectionObjectType]]): Self = this.set("possibleTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Maybe[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
  }
  
}

