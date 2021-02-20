package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The styling that applies to a section.
  */
@js.native
trait SchemaSectionStyle extends StObject {
  
  /**
    * The section&#39;s columns properties.  If empty, the section contains one
    * column with the default properties in the Docs editor.
    */
  var columnProperties: js.UndefOr[js.Array[SchemaSectionColumnProperties]] = js.native
  
  /**
    * The style of column separators.  This style can be set even when there is
    * one column in the section.
    */
  var columnSeparatorStyle: js.UndefOr[String] = js.native
  
  /**
    * The content direction of this section. If unset, the value defaults to
    * LEFT_TO_RIGHT.
    */
  var contentDirection: js.UndefOr[String] = js.native
}
object SchemaSectionStyle {
  
  @scala.inline
  def apply(): SchemaSectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSectionStyle]
  }
  
  @scala.inline
  implicit class SchemaSectionStyleMutableBuilder[Self <: SchemaSectionStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnProperties(value: js.Array[SchemaSectionColumnProperties]): Self = StObject.set(x, "columnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnPropertiesUndefined: Self = StObject.set(x, "columnProperties", js.undefined)
    
    @scala.inline
    def setColumnPropertiesVarargs(value: SchemaSectionColumnProperties*): Self = StObject.set(x, "columnProperties", js.Array(value :_*))
    
    @scala.inline
    def setColumnSeparatorStyle(value: String): Self = StObject.set(x, "columnSeparatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSeparatorStyleUndefined: Self = StObject.set(x, "columnSeparatorStyle", js.undefined)
    
    @scala.inline
    def setContentDirection(value: String): Self = StObject.set(x, "contentDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDirectionUndefined: Self = StObject.set(x, "contentDirection", js.undefined)
  }
}
