package typings.googleapis.fusiontablesV1Mod.fusiontablesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a PointStyle within a StyleSetting
  */
trait SchemaPointStyle extends StObject {
  
  /**
    * Name of the icon. Use values defined in
    * http://www.google.com/fusiontables/DataSource?dsrcid=308519
    */
  var iconName: js.UndefOr[String] = js.undefined
  
  /**
    * Column or a bucket value from which the icon name is to be determined.
    */
  var iconStyler: js.UndefOr[SchemaStyleFunction] = js.undefined
}
object SchemaPointStyle {
  
  @scala.inline
  def apply(): SchemaPointStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPointStyle]
  }
  
  @scala.inline
  implicit class SchemaPointStyleMutableBuilder[Self <: SchemaPointStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconName(value: String): Self = StObject.set(x, "iconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconNameUndefined: Self = StObject.set(x, "iconName", js.undefined)
    
    @scala.inline
    def setIconStyler(value: SchemaStyleFunction): Self = StObject.set(x, "iconStyler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconStylerUndefined: Self = StObject.set(x, "iconStyler", js.undefined)
  }
}
