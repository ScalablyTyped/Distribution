package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridResponsiveAllowedColumnWidthPerType
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Minimal width in pixels bool columns can take before forcing vertical rendering
    *
    */
  var bool: js.UndefOr[Double] = js.native
  
  /**
    * Minimal width in pixels date columns can take before forcing vertical rendering
    *
    */
  var date: js.UndefOr[Double] = js.native
  
  /**
    * Minimal width in pixels number columns can take before forcing vertical rendering
    *
    */
  var number: js.UndefOr[Double] = js.native
  
  /**
    * Minimal width in pixels object columns can take before forcing vertical rendering
    *
    */
  var `object`: js.UndefOr[Double] = js.native
  
  /**
    * Minimal width in pixels string columns can take before forcing vertical rendering
    *
    */
  var string: js.UndefOr[Double] = js.native
}
object IgGridResponsiveAllowedColumnWidthPerType {
  
  @scala.inline
  def apply(): IgGridResponsiveAllowedColumnWidthPerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridResponsiveAllowedColumnWidthPerType]
  }
  
  @scala.inline
  implicit class IgGridResponsiveAllowedColumnWidthPerTypeOps[Self <: IgGridResponsiveAllowedColumnWidthPerType] (val x: Self) extends AnyVal {
    
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
    def setBool(value: Double): Self = this.set("bool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBool: Self = this.set("bool", js.undefined)
    
    @scala.inline
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    
    @scala.inline
    def setObject(value: Double): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    
    @scala.inline
    def setString(value: Double): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
  }
}
