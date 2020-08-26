package typings.graphql.getIntrospectionQueryMod

import typings.graphql.graphqlStrings.SCALAR
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionScalarType
  extends IntrospectionInputType
     with IntrospectionOutputType
     with IntrospectionType {
  val description: js.UndefOr[Maybe[String]] = js.native
  val kind: SCALAR = js.native
  val name: String = js.native
  val specifiedByUrl: js.UndefOr[Maybe[String]] = js.native
}

object IntrospectionScalarType {
  @scala.inline
  def apply(kind: SCALAR, name: String): IntrospectionScalarType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionScalarType]
  }
  @scala.inline
  implicit class IntrospectionScalarTypeOps[Self <: IntrospectionScalarType] (val x: Self) extends AnyVal {
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
    def setKind(value: SCALAR): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Maybe[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setSpecifiedByUrl(value: Maybe[String]): Self = this.set("specifiedByUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpecifiedByUrl: Self = this.set("specifiedByUrl", js.undefined)
    @scala.inline
    def setSpecifiedByUrlNull: Self = this.set("specifiedByUrl", null)
  }
  
}

