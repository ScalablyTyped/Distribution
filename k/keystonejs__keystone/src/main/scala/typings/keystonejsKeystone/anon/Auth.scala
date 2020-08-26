package typings.keystonejsKeystone.anon

import typings.keystonejsKeystone.mod.AccessCallback
import typings.keystonejsKeystone.mod.AuthenticationContext
import typings.keystonejsKeystone.mod.GraphQLWhereClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth extends js.Object {
  var auth: js.UndefOr[Boolean] = js.native
  var create: js.UndefOr[Boolean | AccessCallback] = js.native
  var delete: js.UndefOr[Boolean | AccessCallback] = js.native
  var read: js.UndefOr[Boolean | GraphQLWhereClause | AccessCallback] = js.native
  var update: js.UndefOr[Boolean | AccessCallback] = js.native
}

object Auth {
  @scala.inline
  def apply(): Auth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth]
  }
  @scala.inline
  implicit class AuthOps[Self <: Auth] (val x: Self) extends AnyVal {
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
    def setAuth(value: Boolean): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setCreateFunction1(value: /* context */ AuthenticationContext => Boolean | GraphQLWhereClause): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setCreate(value: Boolean | AccessCallback): Self = this.set("create", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setDeleteFunction1(value: /* context */ AuthenticationContext => Boolean | GraphQLWhereClause): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Boolean | AccessCallback): Self = this.set("delete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete: Self = this.set("delete", js.undefined)
    @scala.inline
    def setReadFunction1(value: /* context */ AuthenticationContext => Boolean | GraphQLWhereClause): Self = this.set("read", js.Any.fromFunction1(value))
    @scala.inline
    def setRead(value: Boolean | GraphQLWhereClause | AccessCallback): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRead: Self = this.set("read", js.undefined)
    @scala.inline
    def setUpdateFunction1(value: /* context */ AuthenticationContext => Boolean | GraphQLWhereClause): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Boolean | AccessCallback): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
  
}

