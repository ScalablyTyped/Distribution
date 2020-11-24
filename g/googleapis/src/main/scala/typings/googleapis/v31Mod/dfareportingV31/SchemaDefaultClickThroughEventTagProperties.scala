package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties of inheriting and overriding the default click-through event
  * tag. A campaign may override the event tag defined at the advertiser level,
  * and an ad may also override the campaign&#39;s setting further.
  */
@js.native
trait SchemaDefaultClickThroughEventTagProperties extends js.Object {
  
  /**
    * ID of the click-through event tag to apply to all ads in this
    * entity&#39;s scope.
    */
  var defaultClickThroughEventTagId: js.UndefOr[String] = js.native
  
  /**
    * Whether this entity should override the inherited default click-through
    * event tag with its own defined value.
    */
  var overrideInheritedEventTag: js.UndefOr[Boolean] = js.native
}
object SchemaDefaultClickThroughEventTagProperties {
  
  @scala.inline
  def apply(): SchemaDefaultClickThroughEventTagProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDefaultClickThroughEventTagProperties]
  }
  
  @scala.inline
  implicit class SchemaDefaultClickThroughEventTagPropertiesOps[Self <: SchemaDefaultClickThroughEventTagProperties] (val x: Self) extends AnyVal {
    
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
    def setDefaultClickThroughEventTagId(value: String): Self = this.set("defaultClickThroughEventTagId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultClickThroughEventTagId: Self = this.set("defaultClickThroughEventTagId", js.undefined)
    
    @scala.inline
    def setOverrideInheritedEventTag(value: Boolean): Self = this.set("overrideInheritedEventTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideInheritedEventTag: Self = this.set("overrideInheritedEventTag", js.undefined)
  }
}
