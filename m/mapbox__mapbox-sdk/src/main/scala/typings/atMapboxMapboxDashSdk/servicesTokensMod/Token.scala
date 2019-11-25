package typings.atMapboxMapboxDashSdk.servicesTokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  /**
    * the client for the token, always 'api'
    */
  var client: String
  /**
    * date and time the token was created
    */
  var created: String
  /**
    * if the token is a default token
    */
  var default: Boolean
  /**
    * the identifier for the token
    */
  var id: String
  /**
    * date and time the token was last modified
    */
  var modified: String
  /**
    * human friendly description of the token
    */
  var note: String
  /**
    * array of scopes granted to the token
    */
  var scopes: js.Array[String]
  /**
    * the token itself
    */
  var token: String
  /**
    * the type of token
    */
  var usage: String
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
}

