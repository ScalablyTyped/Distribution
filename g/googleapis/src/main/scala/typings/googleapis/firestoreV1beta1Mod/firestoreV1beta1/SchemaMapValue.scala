package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A map value.
  */
@js.native
trait SchemaMapValue extends js.Object {
  /**
    * The map&#39;s fields.  The map keys represent field names. Field names
    * matching the regular expression `__.*__` are reserved. Reserved field
    * names are forbidden except in certain documented contexts. The map keys,
    * represented as UTF-8, must not exceed 1,500 bytes and cannot be empty.
    */
  var fields: js.UndefOr[StringDictionary[SchemaValue]] = js.native
}

object SchemaMapValue {
  @scala.inline
  def apply(): SchemaMapValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMapValue]
  }
  @scala.inline
  implicit class SchemaMapValueOps[Self <: SchemaMapValue] (val x: Self) extends AnyVal {
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
    def setFields(value: StringDictionary[SchemaValue]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

