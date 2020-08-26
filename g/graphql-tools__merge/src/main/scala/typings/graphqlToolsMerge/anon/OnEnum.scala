package typings.graphqlToolsMerge.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLArgument
import typings.graphql.definitionMod.GraphQLEnumValue
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLInputField
import typings.graphql.mod.GraphQLEnumType
import typings.graphql.mod.GraphQLInputObjectType
import typings.graphql.mod.GraphQLInterfaceType
import typings.graphql.mod.GraphQLObjectType
import typings.graphql.mod.GraphQLScalarType
import typings.graphql.mod.GraphQLSchema
import typings.graphql.mod.GraphQLUnionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnEnum extends js.Object {
  def onEnum(`type`: GraphQLEnumType): js.Any = js.native
  def onEnumValue(`type`: GraphQLEnumType, value: GraphQLEnumValue): js.Any = js.native
  def onInputFieldType(`type`: GraphQLInputObjectType, field: GraphQLInputField): js.Any = js.native
  def onInputType(`type`: GraphQLInputObjectType): js.Any = js.native
  def onInterface(`type`: GraphQLInterfaceType): js.Any = js.native
  def onInterfaceField(`type`: GraphQLInterfaceType, field: GraphQLField[_, _, StringDictionary[_]]): js.Any = js.native
  def onInterfaceFieldArg(`type`: GraphQLInterfaceType, field: GraphQLField[_, _, StringDictionary[_]], arg: GraphQLArgument): js.Any = js.native
  def onObjectField(`type`: GraphQLObjectType[_, _], field: GraphQLField[_, _, StringDictionary[_]]): js.Any = js.native
  def onObjectFieldArg(
    `type`: GraphQLObjectType[_, _],
    field: GraphQLField[_, _, StringDictionary[_]],
    arg: GraphQLArgument
  ): js.Any = js.native
  def onObjectType(`type`: GraphQLObjectType[_, _]): js.Any = js.native
  def onScalar(`type`: GraphQLScalarType): js.Any = js.native
  def onSchema(schema: GraphQLSchema): js.Any = js.native
  def onUnion(`type`: GraphQLUnionType): js.Any = js.native
}

object OnEnum {
  @scala.inline
  def apply(
    onEnum: GraphQLEnumType => js.Any,
    onEnumValue: (GraphQLEnumType, GraphQLEnumValue) => js.Any,
    onInputFieldType: (GraphQLInputObjectType, GraphQLInputField) => js.Any,
    onInputType: GraphQLInputObjectType => js.Any,
    onInterface: GraphQLInterfaceType => js.Any,
    onInterfaceField: (GraphQLInterfaceType, GraphQLField[_, _, StringDictionary[_]]) => js.Any,
    onInterfaceFieldArg: (GraphQLInterfaceType, GraphQLField[_, _, StringDictionary[_]], GraphQLArgument) => js.Any,
    onObjectField: (GraphQLObjectType[_, _], GraphQLField[_, _, StringDictionary[_]]) => js.Any,
    onObjectFieldArg: (GraphQLObjectType[_, _], GraphQLField[_, _, StringDictionary[_]], GraphQLArgument) => js.Any,
    onObjectType: GraphQLObjectType[_, _] => js.Any,
    onScalar: GraphQLScalarType => js.Any,
    onSchema: GraphQLSchema => js.Any,
    onUnion: GraphQLUnionType => js.Any
  ): OnEnum = {
    val __obj = js.Dynamic.literal(onEnum = js.Any.fromFunction1(onEnum), onEnumValue = js.Any.fromFunction2(onEnumValue), onInputFieldType = js.Any.fromFunction2(onInputFieldType), onInputType = js.Any.fromFunction1(onInputType), onInterface = js.Any.fromFunction1(onInterface), onInterfaceField = js.Any.fromFunction2(onInterfaceField), onInterfaceFieldArg = js.Any.fromFunction3(onInterfaceFieldArg), onObjectField = js.Any.fromFunction2(onObjectField), onObjectFieldArg = js.Any.fromFunction3(onObjectFieldArg), onObjectType = js.Any.fromFunction1(onObjectType), onScalar = js.Any.fromFunction1(onScalar), onSchema = js.Any.fromFunction1(onSchema), onUnion = js.Any.fromFunction1(onUnion))
    __obj.asInstanceOf[OnEnum]
  }
  @scala.inline
  implicit class OnEnumOps[Self <: OnEnum] (val x: Self) extends AnyVal {
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
    def setOnEnum(value: GraphQLEnumType => js.Any): Self = this.set("onEnum", js.Any.fromFunction1(value))
    @scala.inline
    def setOnEnumValue(value: (GraphQLEnumType, GraphQLEnumValue) => js.Any): Self = this.set("onEnumValue", js.Any.fromFunction2(value))
    @scala.inline
    def setOnInputFieldType(value: (GraphQLInputObjectType, GraphQLInputField) => js.Any): Self = this.set("onInputFieldType", js.Any.fromFunction2(value))
    @scala.inline
    def setOnInputType(value: GraphQLInputObjectType => js.Any): Self = this.set("onInputType", js.Any.fromFunction1(value))
    @scala.inline
    def setOnInterface(value: GraphQLInterfaceType => js.Any): Self = this.set("onInterface", js.Any.fromFunction1(value))
    @scala.inline
    def setOnInterfaceField(value: (GraphQLInterfaceType, GraphQLField[_, _, StringDictionary[_]]) => js.Any): Self = this.set("onInterfaceField", js.Any.fromFunction2(value))
    @scala.inline
    def setOnInterfaceFieldArg(value: (GraphQLInterfaceType, GraphQLField[_, _, StringDictionary[_]], GraphQLArgument) => js.Any): Self = this.set("onInterfaceFieldArg", js.Any.fromFunction3(value))
    @scala.inline
    def setOnObjectField(value: (GraphQLObjectType[_, _], GraphQLField[_, _, StringDictionary[_]]) => js.Any): Self = this.set("onObjectField", js.Any.fromFunction2(value))
    @scala.inline
    def setOnObjectFieldArg(
      value: (GraphQLObjectType[_, _], GraphQLField[_, _, StringDictionary[_]], GraphQLArgument) => js.Any
    ): Self = this.set("onObjectFieldArg", js.Any.fromFunction3(value))
    @scala.inline
    def setOnObjectType(value: GraphQLObjectType[_, _] => js.Any): Self = this.set("onObjectType", js.Any.fromFunction1(value))
    @scala.inline
    def setOnScalar(value: GraphQLScalarType => js.Any): Self = this.set("onScalar", js.Any.fromFunction1(value))
    @scala.inline
    def setOnSchema(value: GraphQLSchema => js.Any): Self = this.set("onSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setOnUnion(value: GraphQLUnionType => js.Any): Self = this.set("onUnion", js.Any.fromFunction1(value))
  }
  
}

