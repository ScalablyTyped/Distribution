package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An entry for an Access Control list.
  */
@js.native
trait SchemaAclEntry extends js.Object {
  /**
    * The time when this access control entry expires in RFC 3339 format, for
    * example 2012-11-15T16:19:00.094Z.
    */
  var expirationTime: js.UndefOr[String] = js.native
  /**
    * This is always sql#aclEntry.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * An optional label to identify this entry.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The whitelisted value for the access control list.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaAclEntry {
  @scala.inline
  def apply(expirationTime: String = null, kind: String = null, name: String = null, value: String = null): SchemaAclEntry = {
    val __obj = js.Dynamic.literal()
    if (expirationTime != null) __obj.updateDynamic("expirationTime")(expirationTime.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAclEntry]
  }
}

