package typings.keystonejsKeystone.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Hooks */
@js.native
trait ListSchema[Fields /* <: String */] extends js.Object {
  var access: js.UndefOr[Access] = js.native
  var fields: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ fieldName in Fields ]: @keystonejs/keystone.@keystonejs/keystone.AllFieldsOptions<string>}
    */ typings.keystonejsKeystone.keystonejsKeystoneStrings.ListSchema with TopLevel[js.Any] = js.native
  var hooks: js.UndefOr[Hooks] = js.native
  var listAdapterClass: js.UndefOr[js.Any] = js.native
  var plugins: js.UndefOr[js.Array[Plugin]] = js.native
   // TODO: investigate if a specific type can be provided
  var schemaDoc: js.UndefOr[String] = js.native
}

object ListSchema {
  @scala.inline
  def apply[/* <: java.lang.String */ Fields](
    fields: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ fieldName in Fields ]: @keystonejs/keystone.@keystonejs/keystone.AllFieldsOptions<string>}
    */ typings.keystonejsKeystone.keystonejsKeystoneStrings.ListSchema with TopLevel[js.Any]
  ): ListSchema[Fields] = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchema[Fields]]
  }
  @scala.inline
  implicit class ListSchemaOps[Self <: ListSchema[_], /* <: java.lang.String */ Fields] (val x: Self with ListSchema[Fields]) extends AnyVal {
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
    def setFields(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ fieldName in Fields ]: @keystonejs/keystone.@keystonejs/keystone.AllFieldsOptions<string>}
      */ typings.keystonejsKeystone.keystonejsKeystoneStrings.ListSchema with TopLevel[js.Any]
    ): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessFunction1(value: /* context */ AuthenticationContext => Boolean | GraphQLWhereClause): Self = this.set("access", js.Any.fromFunction1(value))
    @scala.inline
    def setAccess(value: Access): Self = this.set("access", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess: Self = this.set("access", js.undefined)
    @scala.inline
    def setHooks(value: Hooks): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    @scala.inline
    def setListAdapterClass(value: js.Any): Self = this.set("listAdapterClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListAdapterClass: Self = this.set("listAdapterClass", js.undefined)
    @scala.inline
    def setPluginsVarargs(value: Plugin*): Self = this.set("plugins", js.Array(value :_*))
    @scala.inline
    def setPlugins(value: js.Array[Plugin]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setSchemaDoc(value: String): Self = this.set("schemaDoc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaDoc: Self = this.set("schemaDoc", js.undefined)
  }
  
}

