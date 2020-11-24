package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Click Through URL Suffix settings.
  */
@js.native
trait SchemaClickThroughUrlSuffixProperties extends js.Object {
  
  /**
    * Click-through URL suffix to apply to all ads in this entity&#39;s scope.
    * Must be less than 128 characters long.
    */
  var clickThroughUrlSuffix: js.UndefOr[String] = js.native
  
  /**
    * Whether this entity should override the inherited click-through URL
    * suffix with its own defined value.
    */
  var overrideInheritedSuffix: js.UndefOr[Boolean] = js.native
}
object SchemaClickThroughUrlSuffixProperties {
  
  @scala.inline
  def apply(): SchemaClickThroughUrlSuffixProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClickThroughUrlSuffixProperties]
  }
  
  @scala.inline
  implicit class SchemaClickThroughUrlSuffixPropertiesOps[Self <: SchemaClickThroughUrlSuffixProperties] (val x: Self) extends AnyVal {
    
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
    def setClickThroughUrlSuffix(value: String): Self = this.set("clickThroughUrlSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThroughUrlSuffix: Self = this.set("clickThroughUrlSuffix", js.undefined)
    
    @scala.inline
    def setOverrideInheritedSuffix(value: Boolean): Self = this.set("overrideInheritedSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideInheritedSuffix: Self = this.set("overrideInheritedSuffix", js.undefined)
  }
}
