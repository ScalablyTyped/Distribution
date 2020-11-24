package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a localized string bundle resource.
  */
@js.native
trait SchemaLocalizedStringBundle extends js.Object {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#localizedStringBundle.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The locale strings.
    */
  var translations: js.UndefOr[js.Array[SchemaLocalizedString]] = js.native
}
object SchemaLocalizedStringBundle {
  
  @scala.inline
  def apply(): SchemaLocalizedStringBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalizedStringBundle]
  }
  
  @scala.inline
  implicit class SchemaLocalizedStringBundleOps[Self <: SchemaLocalizedStringBundle] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setTranslationsVarargs(value: SchemaLocalizedString*): Self = this.set("translations", js.Array(value :_*))
    
    @scala.inline
    def setTranslations(value: js.Array[SchemaLocalizedString]): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslations: Self = this.set("translations", js.undefined)
  }
}
