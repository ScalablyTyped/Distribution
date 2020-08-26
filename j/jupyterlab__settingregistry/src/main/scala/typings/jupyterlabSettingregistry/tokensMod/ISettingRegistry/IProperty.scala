package typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry

import org.scalablytyped.runtime.StringDictionary
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A minimal subset of the formal JSON Schema that describes a property.
  */
@js.native
trait IProperty extends PartialJSONObject {
  /**
    * The default value, if any.
    */
  var default: js.UndefOr[PartialJSONValue] = js.native
  /**
    * The schema description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The schema's child properties.
    */
  var properties: js.UndefOr[StringDictionary[IProperty]] = js.native
  /**
    * The title of a property.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The type or types of the data.
    */
  var `type`: js.UndefOr[Primitive | js.Array[Primitive]] = js.native
}

object IProperty {
  @scala.inline
  def apply(): IProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProperty]
  }
  @scala.inline
  implicit class IPropertyOps[Self <: IProperty] (val x: Self) extends AnyVal {
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
    def setDefault(value: PartialJSONValue): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDefaultNull: Self = this.set("default", null)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setProperties(value: StringDictionary[IProperty]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTypeVarargs(value: Primitive*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: Primitive | js.Array[Primitive]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

