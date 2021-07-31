package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridResponsiveColumnSetting
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * A list of predefined classes to decide element's visibility on.
    *
    */
  var classes: js.UndefOr[String] = js.undefined
  
  /**
    * Column index. Can be used in place of column key. The preferred way of populating a column setting is to always use the column keys as identifiers.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Column key. This is a required property in every column setting if columnIndex is not set.
    *
    */
  var columnKey: js.UndefOr[String] = js.undefined
  
  /**
    * A configuration object to use for the responsive functionality. Uses the keys defined in the widget's responsiveModes object. The classes property is not used if this one is set.
    *
    */
  var configuration: js.UndefOr[js.Any] = js.undefined
}
object IgGridResponsiveColumnSetting {
  
  @scala.inline
  def apply(): IgGridResponsiveColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridResponsiveColumnSetting]
  }
  
  @scala.inline
  implicit class IgGridResponsiveColumnSettingMutableBuilder[Self <: IgGridResponsiveColumnSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setColumnKey(value: String): Self = StObject.set(x, "columnKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnKeyUndefined: Self = StObject.set(x, "columnKey", js.undefined)
    
    @scala.inline
    def setConfiguration(value: js.Any): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
  }
}
