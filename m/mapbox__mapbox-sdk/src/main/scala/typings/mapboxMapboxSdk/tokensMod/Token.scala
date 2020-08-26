package typings.mapboxMapboxSdk.tokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  /**
    * the client for the token, always 'api'
    */
  var client: String = js.native
  /**
    * date and time the token was created
    */
  var created: String = js.native
  /**
    * if the token is a default token
    */
  var default: Boolean = js.native
  /**
    * the identifier for the token
    */
  var id: String = js.native
  /**
    * date and time the token was last modified
    */
  var modified: String = js.native
  /**
    * human friendly description of the token
    */
  var note: String = js.native
  /**
    * array of scopes granted to the token
    */
  var scopes: js.Array[String] = js.native
  /**
    * the token itself
    */
  var token: String = js.native
  /**
    * the type of token
    */
  var usage: String = js.native
}

object Token {
  @scala.inline
  def apply(
    client: String,
    created: String,
    default: Boolean,
    id: String,
    modified: String,
    note: String,
    scopes: js.Array[String],
    token: String,
    usage: String
  ): Token = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
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
    def setClient(value: String): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: Boolean): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setModified(value: String): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopesVarargs(value: String*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[String]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsage(value: String): Self = this.set("usage", value.asInstanceOf[js.Any])
  }
  
}

