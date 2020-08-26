package typings.graphqlCompose.objectTypeComposerMod

import typings.graphql.definitionMod.GraphQLIsTypeOfFn
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.definitionsMod.Thunk
import typings.graphqlCompose.interfaceTypeComposerMod.ComposeInterfaceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeObjectTypeConfig[TSource, TContext] extends js.Object {
  var description: js.UndefOr[String | Null] = js.native
  var extensions: js.UndefOr[Extensions] = js.native
  var fields: js.UndefOr[Thunk[ComposeFieldConfigMap[TSource, TContext]]] = js.native
  var interfaces: js.UndefOr[Thunk[js.Array[ComposeInterfaceType] | Null]] = js.native
  var isIntrospection: js.UndefOr[Boolean] = js.native
  var isTypeOf: js.UndefOr[(GraphQLIsTypeOfFn[TSource, TContext]) | Null] = js.native
  var name: String = js.native
}

object ComposeObjectTypeConfig {
  @scala.inline
  def apply[TSource, TContext](name: String): ComposeObjectTypeConfig[TSource, TContext] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeObjectTypeConfig[TSource, TContext]]
  }
  @scala.inline
  implicit class ComposeObjectTypeConfigOps[Self <: ComposeObjectTypeConfig[_, _], TSource, TContext] (val x: Self with (ComposeObjectTypeConfig[TSource, TContext])) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setExtensions(value: Extensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setFieldsFunction0(value: () => ComposeFieldConfigMap[TSource, TContext]): Self = this.set("fields", js.Any.fromFunction0(value))
    @scala.inline
    def setFields(value: Thunk[ComposeFieldConfigMap[TSource, TContext]]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setInterfacesVarargs(value: ComposeInterfaceType*): Self = this.set("interfaces", js.Array(value :_*))
    @scala.inline
    def setInterfacesFunction0(value: () => js.Array[ComposeInterfaceType] | Null): Self = this.set("interfaces", js.Any.fromFunction0(value))
    @scala.inline
    def setInterfaces(value: Thunk[js.Array[ComposeInterfaceType] | Null]): Self = this.set("interfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaces: Self = this.set("interfaces", js.undefined)
    @scala.inline
    def setInterfacesNull: Self = this.set("interfaces", null)
    @scala.inline
    def setIsIntrospection(value: Boolean): Self = this.set("isIntrospection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsIntrospection: Self = this.set("isIntrospection", js.undefined)
    @scala.inline
    def setIsTypeOf(value: (TSource, TContext, /* info */ GraphQLResolveInfo) => PromiseOrValue[Boolean]): Self = this.set("isTypeOf", js.Any.fromFunction3(value))
    @scala.inline
    def deleteIsTypeOf: Self = this.set("isTypeOf", js.undefined)
    @scala.inline
    def setIsTypeOfNull: Self = this.set("isTypeOf", null)
  }
  
}

