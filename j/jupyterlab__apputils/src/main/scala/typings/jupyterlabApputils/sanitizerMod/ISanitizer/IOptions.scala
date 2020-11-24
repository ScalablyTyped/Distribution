package typings.jupyterlabApputils.sanitizerMod.ISanitizer

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to sanitize.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The allowed attributes for a given tag.
    */
  var allowedAttributes: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  
  /**
    * The allowed style values for a given tag.
    */
  var allowedStyles: js.UndefOr[StringDictionary[StringDictionary[js.Array[RegExp]]]] = js.native
  
  /**
    * The allowed tags.
    */
  var allowedTags: js.UndefOr[js.Array[String]] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowedAttributes(value: StringDictionary[js.Array[String]]): Self = this.set("allowedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedAttributes: Self = this.set("allowedAttributes", js.undefined)
    
    @scala.inline
    def setAllowedStyles(value: StringDictionary[StringDictionary[js.Array[RegExp]]]): Self = this.set("allowedStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedStyles: Self = this.set("allowedStyles", js.undefined)
    
    @scala.inline
    def setAllowedTagsVarargs(value: String*): Self = this.set("allowedTags", js.Array(value :_*))
    
    @scala.inline
    def setAllowedTags(value: js.Array[String]): Self = this.set("allowedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedTags: Self = this.set("allowedTags", js.undefined)
  }
}
